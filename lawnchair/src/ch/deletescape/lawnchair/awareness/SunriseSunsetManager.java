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

package ch.deletescape.lawnchair.awareness;

import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;

import net.time4j.PlainDate;
import net.time4j.calendar.astro.SolarTime;
import net.time4j.calendar.astro.Twilight;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;

import ch.deletescape.lawnchair.feed.util.FeedUtil;
import ch.deletescape.lawnchair.feed.util.Pairs;
import ch.deletescape.lawnchair.location.LocationManager;
import kotlin.Unit;

public final class SunriseSunsetManager {
    private static final List<Consumer<Pairs.Pair<ZonedDateTime, ZonedDateTime>>> listeners;
    private static Pairs.Pair<ZonedDateTime, ZonedDateTime> currentSs;
    private static Pairs.Pair<Double, Double> location;

    private SunriseSunsetManager() {
        throw new RuntimeException("This class cannot be instantiated");
    }

    static {
        listeners = new Vector<>();
        LocationManager.INSTANCE.addCallback((lat, lon) -> {
            SolarTime st = SolarTime.ofLocation(lat, lon);
            location = Pairs.cons(lat, lon);
            ZonedDateTime sunrise = ZonedDateTime.ofInstant(Instant.ofEpochSecond(
                    PlainDate.nowInSystemTime().get(st.sunrise(Twilight.ASTRONOMICAL)).inZonalView(
                            ZoneId.systemDefault().getId()).getPosixTime()),
                    ZoneId.systemDefault());
            ZonedDateTime sunset = ZonedDateTime.ofInstant(Instant.ofEpochSecond(
                    PlainDate.nowInSystemTime().get(st.sunset(Twilight.ASTRONOMICAL)).inZonalView(
                            ZoneId.systemDefault().getId()).getPosixTime()),
                    ZoneId.systemDefault());
            Pairs.Pair<ZonedDateTime, ZonedDateTime> current;
            currentSs = current = Pairs.cons(sunrise, sunset);
            synchronized (listeners) {
                listeners.forEach(listener -> listener.accept(current));
            }
            return Unit.INSTANCE;
        });
        TickManager.INSTANCE.subscribe(() -> {
            if (ZonedDateTime.now().getHour() == 0 && ZonedDateTime.now().getMinute() == 0) {
                Pairs.Pair<Double, Double> currentLocation;
                if ((currentLocation = location) != null) {
                    SolarTime st = SolarTime.ofLocation(currentLocation.car(),
                            currentLocation.cdr());
                    ZonedDateTime sunrise = ZonedDateTime.ofInstant(Instant.ofEpochSecond(
                            PlainDate.nowInSystemTime().get(
                                    st.sunrise(Twilight.ASTRONOMICAL)).inZonalView(
                                    ZoneId.systemDefault().getId()).getPosixTime()),
                            ZoneId.systemDefault());
                    ZonedDateTime sunset = ZonedDateTime.ofInstant(Instant.ofEpochSecond(
                            PlainDate.nowInSystemTime().get(
                                    st.sunset(Twilight.ASTRONOMICAL)).inZonalView(
                                    ZoneId.systemDefault().getId()).getPosixTime()),
                            ZoneId.systemDefault());
                    Pairs.Pair<ZonedDateTime, ZonedDateTime> current;
                    currentSs = current = Pairs.cons(sunrise, sunset);
                    synchronized (listeners) {
                        listeners.forEach(listener -> listener.accept(current));
                    }
                }
            }
            return Unit.INSTANCE;
        });
    }

    @AnyThread
    public static void subscribe(@MainThread Consumer<Pairs.Pair<ZonedDateTime, ZonedDateTime>> listener) {
        synchronized (listeners) {
            listeners.add(listener);
            Pairs.Pair<ZonedDateTime, ZonedDateTime> css = currentSs;
            if (css != null) {
                FeedUtil.runOnMainThread(() -> listener.accept(css));
            }
        }
    }
}
