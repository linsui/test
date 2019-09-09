package com.android.launcher3.util;

/**
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.content.ComponentName;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.UserHandle;

import com.android.launcher3.Utilities;
import com.android.launcher3.compat.UserManagerCompat;

import java.util.Arrays;

public class ComponentKey implements Parcelable {

    public final ComponentName componentName;
    public final UserHandle user;

    private final int mHashCode;

    public ComponentKey(ComponentName componentName, UserHandle user) {
        Preconditions.assertNotNull(componentName);
        Preconditions.assertNotNull(user);
        this.componentName = componentName;
        this.user = user;
        mHashCode = Arrays.hashCode(new Object[] {componentName, user});

    }

    /**
     * Creates a new component key from an encoded component key string in the form of
     * [flattenedComponentString#userId].  If the userId is not present, then it defaults
     * to the current user.
     */
    public ComponentKey(Context context, String componentKeyStr) {
        int userDelimiterIndex = componentKeyStr.indexOf("#");
        if (userDelimiterIndex != -1) {
            String componentStr = componentKeyStr.substring(0, userDelimiterIndex);
            Long componentUser = Long.valueOf(componentKeyStr.substring(userDelimiterIndex + 1));
            componentName = ComponentName.unflattenFromString(componentStr);
            user = Utilities.notNullOrDefault(UserManagerCompat.getInstance(context)
                    .getUserForSerialNumber(componentUser.longValue()), Process.myUserHandle());
        } else {
            // No user provided, default to the current user
            componentName = ComponentName.unflattenFromString(componentKeyStr);
            user = Process.myUserHandle();
        }
        Preconditions.assertNotNull(componentName);
        Preconditions.assertNotNull(user);
        mHashCode = Arrays.hashCode(new Object[] {componentName, user});
    }

    protected ComponentKey(Parcel in) {
        componentName = in.readParcelable(ComponentName.class.getClassLoader());
        user = in.readParcelable(UserHandle.class.getClassLoader());
        mHashCode = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(componentName, flags);
        dest.writeParcelable(user, flags);
        dest.writeInt(mHashCode);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ComponentKey> CREATOR = new Creator<ComponentKey>() {
        @Override
        public ComponentKey createFromParcel(Parcel in) {
            return new ComponentKey(in);
        }

        @Override
        public ComponentKey[] newArray(int size) {
            return new ComponentKey[size];
        }
    };

    @Override
    public int hashCode() {
        return mHashCode;
    }

    @Override
    public boolean equals(Object o) {
        ComponentKey other = (ComponentKey) o;
        return other.componentName.equals(componentName) && other.user.equals(user);
    }

    /**
     * Encodes a component key as a string of the form [flattenedComponentString#userId].
     */
    @Override
    public String toString() {
        return componentName.flattenToString() + "#" + user.toString().replaceAll("\\D+","");
    }
}