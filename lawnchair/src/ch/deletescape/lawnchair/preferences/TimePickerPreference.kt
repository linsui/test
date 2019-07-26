/*
 *     Copyright (c) 2017-2019 the Lawnchair team
 *     Copyright (c)  2019 oldosfan (would)
 *     This file is part of Lawnchair Launcher.
 *
 *     Lawnchair Launcher is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Lawnchair Launcher is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Lawnchair Launcher.  If not, see <https://www.gnu.org/licenses/>.
 */

package ch.deletescape.lawnchair.preferences

import android.content.Context
import android.support.v7.preference.DialogPreference
import android.util.AttributeSet
import com.android.launcher3.R

open class TimePickerPreference(context: Context, attributeSet: AttributeSet) :
        DialogPreference(context, attributeSet) {
    open val defaultValue = 7 to 30

    override fun onAttached() {
        super.onAttached()
        updateSummary()
    }

    private fun updateSummary() {
        summary = sharedPreferences?.getString(key, null) ?: "${defaultValue.first}:${String.format(
                "%02d", defaultValue.second)}"
    }

    override fun getDialogLayoutResource(): Int {
        return R.layout.dialog_time_picker
    }

    override fun getDialogTitle(): CharSequence? {
        return null
    }

    override fun getNegativeButtonText(): CharSequence? {
        return null
    }

    fun onDialogFinish(result: Boolean) {
        updateSummary()
    }
}