/*
 * Copyright (c) 2019 oldosfan.
 * Copyright (c) 2019 the Lawnchair developers
 *
 *     This file is part of Librechair.
 *
 *     Librechair is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Librechair is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Librechair.  If not, see <https://www.gnu.org/licenses/>.
 */

package ch.deletescape.lawnchair.feed.tabs.colors;

import android.content.Context;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

import ch.deletescape.lawnchair.LawnchairUtilsKt;


public class AccentProvider extends ColorProvider {
    @NotNull
    @Override
    public List<Integer> getColors(Context context) {
        return Collections.singletonList(LawnchairUtilsKt.getColorEngineAccent(context));
    }
}
