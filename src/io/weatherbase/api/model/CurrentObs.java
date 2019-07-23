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

/*
 * Weatherbit.io - Swagger UI Weather API documentation
 * This is the documentation for the Weatherbit Weather API.  The base URL for the API is [http://api.weatherbit.io/v2.0/](http://api.weatherbit.io/v2.0/) or [https://api.weatherbit.io/v2.0/](http://api.weatherbit.io/v2.0/). Below is the Swagger UI documentation for the API. All API requests require the `key` parameter.        An Example for a 5 day forecast for London, UK would be `http://api.weatherbit.io/v2.0/forecast/3hourly?city=London`&`country=UK`. See our [Weather API description page](https://www.weatherbit.io/api) for additional documentation.
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.weatherbase.api.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.Objects;
/**
 * CurrentObs
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-07-23T18:38:21.490044+08:00[Asia/Shanghai]")
public class CurrentObs {
  @SerializedName("city_name")
  private String cityName = null;

  @SerializedName("state_code")
  private String stateCode = null;

  @SerializedName("country_code")
  private String countryCode = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("lat")
  private BigDecimal lat = null;

  @SerializedName("lon")
  private BigDecimal lon = null;

  @SerializedName("station")
  private String station = null;

  @SerializedName("vis")
  private Double vis = null;

  @SerializedName("rh")
  private Double rh = null;

  @SerializedName("dewpt")
  private BigDecimal dewpt = null;

  @SerializedName("wind_dir")
  private Double windDir = null;

  @SerializedName("wind_cdir")
  private String windCdir = null;

  @SerializedName("wind_cdir_full")
  private String windCdirFull = null;

  @SerializedName("wind_speed")
  private BigDecimal windSpeed = null;

  @SerializedName("temp")
  private BigDecimal temp = null;

  @SerializedName("app_temp")
  private BigDecimal appTemp = null;

  @SerializedName("clouds")
  private Double clouds = null;

  @SerializedName("weather")
  private Weather weather = null;

  @SerializedName("datetime")
  private String datetime = null;

  @SerializedName("ob_time")
  private String obTime = null;

  @SerializedName("ts")
  private BigDecimal ts = null;

  @SerializedName("sunrise")
  private String sunrise = null;

  @SerializedName("sunset")
  private String sunset = null;

  @SerializedName("slp")
  private BigDecimal slp = null;

  @SerializedName("pres")
  private BigDecimal pres = null;

  @SerializedName("aqi")
  private BigDecimal aqi = null;

  @SerializedName("uv")
  private BigDecimal uv = null;

  @SerializedName("solar_rad")
  private BigDecimal solarRad = null;

  @SerializedName("ghi")
  private BigDecimal ghi = null;

  @SerializedName("dni")
  private BigDecimal dni = null;

  @SerializedName("dhi")
  private BigDecimal dhi = null;

  @SerializedName("elev_angle")
  private BigDecimal elevAngle = null;

  @SerializedName("hour_angle")
  private BigDecimal hourAngle = null;

  @SerializedName("pod")
  private String pod = null;

  @SerializedName("precip")
  private BigDecimal precip = null;

  @SerializedName("snow")
  private BigDecimal snow = null;

  public CurrentObs cityName(String cityName) {
    this.cityName = cityName;
    return this;
  }

   /**
   * City name (closest)
   * @return cityName
  **/
  @Schema(example = "Raleigh", description = "City name (closest)")
  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public CurrentObs stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

   /**
   * State abbreviation
   * @return stateCode
  **/
  @Schema(example = "NC", description = "State abbreviation")
  public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }

  public CurrentObs countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Country abbreviation
   * @return countryCode
  **/
  @Schema(example = "US", description = "Country abbreviation")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public CurrentObs timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Local IANA time zone
   * @return timezone
  **/
  @Schema(example = "America/New_York", description = "Local IANA time zone")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public CurrentObs lat(BigDecimal lat) {
    this.lat = lat;
    return this;
  }

   /**
   * Latitude
   * @return lat
  **/
  @Schema(example = "38.0", description = "Latitude")
  public BigDecimal getLat() {
    return lat;
  }

  public void setLat(BigDecimal lat) {
    this.lat = lat;
  }

  public CurrentObs lon(BigDecimal lon) {
    this.lon = lon;
    return this;
  }

   /**
   * Longitude
   * @return lon
  **/
  @Schema(example = "-78.25", description = "Longitude")
  public BigDecimal getLon() {
    return lon;
  }

  public void setLon(BigDecimal lon) {
    this.lon = lon;
  }

  public CurrentObs station(String station) {
    this.station = station;
    return this;
  }

   /**
   * Source Station ID
   * @return station
  **/
  @Schema(example = "KRDU", description = "Source Station ID")
  public String getStation() {
    return station;
  }

  public void setStation(String station) {
    this.station = station;
  }

  public CurrentObs vis(Double vis) {
    this.vis = vis;
    return this;
  }

   /**
   * Visibility - default (M)
   * @return vis
  **/
  @Schema(example = "10000", description = "Visibility - default (M)")
  public Double getVis() {
    return vis;
  }

  public void setVis(Double vis) {
    this.vis = vis;
  }

  public CurrentObs rh(Double rh) {
    this.rh = rh;
    return this;
  }

   /**
   * Relative humidity (%)
   * @return rh
  **/
  @Schema(example = "75", description = "Relative humidity (%)")
  public Double getRh() {
    return rh;
  }

  public void setRh(Double rh) {
    this.rh = rh;
  }

  public CurrentObs dewpt(BigDecimal dewpt) {
    this.dewpt = dewpt;
    return this;
  }

   /**
   * Dew point temperature - default (C)
   * @return dewpt
  **/
  @Schema(example = "12.0", description = "Dew point temperature - default (C)")
  public BigDecimal getDewpt() {
    return dewpt;
  }

  public void setDewpt(BigDecimal dewpt) {
    this.dewpt = dewpt;
  }

  public CurrentObs windDir(Double windDir) {
    this.windDir = windDir;
    return this;
  }

   /**
   * Wind direction (degrees)
   * @return windDir
  **/
  @Schema(example = "125", description = "Wind direction (degrees)")
  public Double getWindDir() {
    return windDir;
  }

  public void setWindDir(Double windDir) {
    this.windDir = windDir;
  }

  public CurrentObs windCdir(String windCdir) {
    this.windCdir = windCdir;
    return this;
  }

   /**
   * Cardinal wind direction
   * @return windCdir
  **/
  @Schema(example = "ENE", description = "Cardinal wind direction")
  public String getWindCdir() {
    return windCdir;
  }

  public void setWindCdir(String windCdir) {
    this.windCdir = windCdir;
  }

  public CurrentObs windCdirFull(String windCdirFull) {
    this.windCdirFull = windCdirFull;
    return this;
  }

   /**
   * Cardinal wind direction (text)
   * @return windCdirFull
  **/
  @Schema(example = "East-North-East", description = "Cardinal wind direction (text)")
  public String getWindCdirFull() {
    return windCdirFull;
  }

  public void setWindCdirFull(String windCdirFull) {
    this.windCdirFull = windCdirFull;
  }

  public CurrentObs windSpeed(BigDecimal windSpeed) {
    this.windSpeed = windSpeed;
    return this;
  }

   /**
   * Wind speed - Default (m/s)
   * @return windSpeed
  **/
  @Schema(example = "5.85", description = "Wind speed - Default (m/s)")
  public BigDecimal getWindSpeed() {
    return windSpeed;
  }

  public void setWindSpeed(BigDecimal windSpeed) {
    this.windSpeed = windSpeed;
  }

  public CurrentObs temp(BigDecimal temp) {
    this.temp = temp;
    return this;
  }

   /**
   * Temperature - Default (C)
   * @return temp
  **/
  @Schema(example = "13.85", description = "Temperature - Default (C)")
  public BigDecimal getTemp() {
    return temp;
  }

  public void setTemp(BigDecimal temp) {
    this.temp = temp;
  }

  public CurrentObs appTemp(BigDecimal appTemp) {
    this.appTemp = appTemp;
    return this;
  }

   /**
   * Apparent temperature - Default (C)
   * @return appTemp
  **/
  @Schema(example = "14.85", description = "Apparent temperature - Default (C)")
  public BigDecimal getAppTemp() {
    return appTemp;
  }

  public void setAppTemp(BigDecimal appTemp) {
    this.appTemp = appTemp;
  }

  public CurrentObs clouds(Double clouds) {
    this.clouds = clouds;
    return this;
  }

   /**
   * Cloud cover (%)
   * @return clouds
  **/
  @Schema(example = "42", description = "Cloud cover (%)")
  public Double getClouds() {
    return clouds;
  }

  public void setClouds(Double clouds) {
    this.clouds = clouds;
  }

  public CurrentObs weather(Weather weather) {
    this.weather = weather;
    return this;
  }

   /**
   * Get weather
   * @return weather
  **/
  @Schema(description = "")
  public Weather getWeather() {
    return weather;
  }

  public void setWeather(Weather weather) {
    this.weather = weather;
  }

  public CurrentObs datetime(String datetime) {
    this.datetime = datetime;
    return this;
  }

   /**
   * Cycle Hour (UTC) of observation
   * @return datetime
  **/
  @Schema(example = "2017-03-15:13", description = "Cycle Hour (UTC) of observation")
  public String getDatetime() {
    return datetime;
  }

  public void setDatetime(String datetime) {
    this.datetime = datetime;
  }

  public CurrentObs obTime(String obTime) {
    this.obTime = obTime;
    return this;
  }

   /**
   * Full time (UTC) of observation (YYYY-MM-DD HH:MM)
   * @return obTime
  **/
  @Schema(example = "2017-03-15 13:11", description = "Full time (UTC) of observation (YYYY-MM-DD HH:MM)")
  public String getObTime() {
    return obTime;
  }

  public void setObTime(String obTime) {
    this.obTime = obTime;
  }

  public CurrentObs ts(BigDecimal ts) {
    this.ts = ts;
    return this;
  }

   /**
   * Unix Timestamp
   * @return ts
  **/
  @Schema(example = "1.4909904E+9", description = "Unix Timestamp")
  public BigDecimal getTs() {
    return ts;
  }

  public void setTs(BigDecimal ts) {
    this.ts = ts;
  }

  public CurrentObs sunrise(String sunrise) {
    this.sunrise = sunrise;
    return this;
  }

   /**
   * Time (UTC) of Sunrise (HH:MM)
   * @return sunrise
  **/
  @Schema(example = "06:22", description = "Time (UTC) of Sunrise (HH:MM)")
  public String getSunrise() {
    return sunrise;
  }

  public void setSunrise(String sunrise) {
    this.sunrise = sunrise;
  }

  public CurrentObs sunset(String sunset) {
    this.sunset = sunset;
    return this;
  }

   /**
   * Time (UTC) of Sunset (HH:MM)
   * @return sunset
  **/
  @Schema(example = "19:34", description = "Time (UTC) of Sunset (HH:MM)")
  public String getSunset() {
    return sunset;
  }

  public void setSunset(String sunset) {
    this.sunset = sunset;
  }

  public CurrentObs slp(BigDecimal slp) {
    this.slp = slp;
    return this;
  }

   /**
   * Mean sea level pressure in millibars (mb)
   * @return slp
  **/
  @Schema(example = "1013.12", description = "Mean sea level pressure in millibars (mb)")
  public BigDecimal getSlp() {
    return slp;
  }

  public void setSlp(BigDecimal slp) {
    this.slp = slp;
  }

  public CurrentObs pres(BigDecimal pres) {
    this.pres = pres;
    return this;
  }

   /**
   * Pressure (mb)
   * @return pres
  **/
  @Schema(example = "1010.0", description = "Pressure (mb)")
  public BigDecimal getPres() {
    return pres;
  }

  public void setPres(BigDecimal pres) {
    this.pres = pres;
  }

  public CurrentObs aqi(BigDecimal aqi) {
    this.aqi = aqi;
    return this;
  }

   /**
   * Air quality index (US EPA standard 0 to +500)
   * @return aqi
  **/
  @Schema(example = "50.0", description = "Air quality index (US EPA standard 0 to +500)")
  public BigDecimal getAqi() {
    return aqi;
  }

  public void setAqi(BigDecimal aqi) {
    this.aqi = aqi;
  }

  public CurrentObs uv(BigDecimal uv) {
    this.uv = uv;
    return this;
  }

   /**
   * UV Index
   * @return uv
  **/
  @Schema(example = "6.5", description = "UV Index")
  public BigDecimal getUv() {
    return uv;
  }

  public void setUv(BigDecimal uv) {
    this.uv = uv;
  }

  public CurrentObs solarRad(BigDecimal solarRad) {
    this.solarRad = solarRad;
    return this;
  }

   /**
   * Estimated solar radiation (W/m^2)
   * @return solarRad
  **/
  @Schema(example = "300.4", description = "Estimated solar radiation (W/m^2)")
  public BigDecimal getSolarRad() {
    return solarRad;
  }

  public void setSolarRad(BigDecimal solarRad) {
    this.solarRad = solarRad;
  }

  public CurrentObs ghi(BigDecimal ghi) {
    this.ghi = ghi;
    return this;
  }

   /**
   * Global horizontal irradiance (W/m^2)
   * @return ghi
  **/
  @Schema(example = "450.4", description = "Global horizontal irradiance (W/m^2)")
  public BigDecimal getGhi() {
    return ghi;
  }

  public void setGhi(BigDecimal ghi) {
    this.ghi = ghi;
  }

  public CurrentObs dni(BigDecimal dni) {
    this.dni = dni;
    return this;
  }

   /**
   * Direct normal irradiance (W/m^2)
   * @return dni
  **/
  @Schema(example = "450.4", description = "Direct normal irradiance (W/m^2)")
  public BigDecimal getDni() {
    return dni;
  }

  public void setDni(BigDecimal dni) {
    this.dni = dni;
  }

  public CurrentObs dhi(BigDecimal dhi) {
    this.dhi = dhi;
    return this;
  }

   /**
   * Diffuse horizontal irradiance (W/m^2)
   * @return dhi
  **/
  @Schema(example = "450.4", description = "Diffuse horizontal irradiance (W/m^2)")
  public BigDecimal getDhi() {
    return dhi;
  }

  public void setDhi(BigDecimal dhi) {
    this.dhi = dhi;
  }

  public CurrentObs elevAngle(BigDecimal elevAngle) {
    this.elevAngle = elevAngle;
    return this;
  }

   /**
   * Current solar elevation angle (Degrees)
   * @return elevAngle
  **/
  @Schema(example = "37.0", description = "Current solar elevation angle (Degrees)")
  public BigDecimal getElevAngle() {
    return elevAngle;
  }

  public void setElevAngle(BigDecimal elevAngle) {
    this.elevAngle = elevAngle;
  }

  public CurrentObs hourAngle(BigDecimal hourAngle) {
    this.hourAngle = hourAngle;
    return this;
  }

   /**
   * Current solar hour angle (Degrees)
   * @return hourAngle
  **/
  @Schema(example = "45.0", description = "Current solar hour angle (Degrees)")
  public BigDecimal getHourAngle() {
    return hourAngle;
  }

  public void setHourAngle(BigDecimal hourAngle) {
    this.hourAngle = hourAngle;
  }

  public CurrentObs pod(String pod) {
    this.pod = pod;
    return this;
  }

   /**
   * Part of the day (d &#x3D; day, n &#x3D; night)
   * @return pod
  **/
  @Schema(description = "Part of the day (d = day, n = night)")
  public String getPod() {
    return pod;
  }

  public void setPod(String pod) {
    this.pod = pod;
  }

  public CurrentObs precip(BigDecimal precip) {
    this.precip = precip;
    return this;
  }

   /**
   * Precipitation in last hour - Default (mm)
   * @return precip
  **/
  @Schema(example = "2.0", description = "Precipitation in last hour - Default (mm)")
  public BigDecimal getPrecip() {
    return precip;
  }

  public void setPrecip(BigDecimal precip) {
    this.precip = precip;
  }

  public CurrentObs snow(BigDecimal snow) {
    this.snow = snow;
    return this;
  }

   /**
   * Snowfall in last hour - Default (mm)
   * @return snow
  **/
  @Schema(example = "10.0", description = "Snowfall in last hour - Default (mm)")
  public BigDecimal getSnow() {
    return snow;
  }

  public void setSnow(BigDecimal snow) {
    this.snow = snow;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentObs currentObs = (CurrentObs) o;
    return Objects.equals(this.cityName, currentObs.cityName) &&
        Objects.equals(this.stateCode, currentObs.stateCode) &&
        Objects.equals(this.countryCode, currentObs.countryCode) &&
        Objects.equals(this.timezone, currentObs.timezone) &&
        Objects.equals(this.lat, currentObs.lat) &&
        Objects.equals(this.lon, currentObs.lon) &&
        Objects.equals(this.station, currentObs.station) &&
        Objects.equals(this.vis, currentObs.vis) &&
        Objects.equals(this.rh, currentObs.rh) &&
        Objects.equals(this.dewpt, currentObs.dewpt) &&
        Objects.equals(this.windDir, currentObs.windDir) &&
        Objects.equals(this.windCdir, currentObs.windCdir) &&
        Objects.equals(this.windCdirFull, currentObs.windCdirFull) &&
        Objects.equals(this.windSpeed, currentObs.windSpeed) &&
        Objects.equals(this.temp, currentObs.temp) &&
        Objects.equals(this.appTemp, currentObs.appTemp) &&
        Objects.equals(this.clouds, currentObs.clouds) &&
        Objects.equals(this.weather, currentObs.weather) &&
        Objects.equals(this.datetime, currentObs.datetime) &&
        Objects.equals(this.obTime, currentObs.obTime) &&
        Objects.equals(this.ts, currentObs.ts) &&
        Objects.equals(this.sunrise, currentObs.sunrise) &&
        Objects.equals(this.sunset, currentObs.sunset) &&
        Objects.equals(this.slp, currentObs.slp) &&
        Objects.equals(this.pres, currentObs.pres) &&
        Objects.equals(this.aqi, currentObs.aqi) &&
        Objects.equals(this.uv, currentObs.uv) &&
        Objects.equals(this.solarRad, currentObs.solarRad) &&
        Objects.equals(this.ghi, currentObs.ghi) &&
        Objects.equals(this.dni, currentObs.dni) &&
        Objects.equals(this.dhi, currentObs.dhi) &&
        Objects.equals(this.elevAngle, currentObs.elevAngle) &&
        Objects.equals(this.hourAngle, currentObs.hourAngle) &&
        Objects.equals(this.pod, currentObs.pod) &&
        Objects.equals(this.precip, currentObs.precip) &&
        Objects.equals(this.snow, currentObs.snow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cityName, stateCode, countryCode, timezone, lat, lon, station, vis, rh, dewpt, windDir, windCdir, windCdirFull, windSpeed, temp, appTemp, clouds, weather, datetime, obTime, ts, sunrise, sunset, slp, pres, aqi, uv, solarRad, ghi, dni, dhi, elevAngle, hourAngle, pod, precip, snow);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentObs {\n");
    
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
    sb.append("    station: ").append(toIndentedString(station)).append("\n");
    sb.append("    vis: ").append(toIndentedString(vis)).append("\n");
    sb.append("    rh: ").append(toIndentedString(rh)).append("\n");
    sb.append("    dewpt: ").append(toIndentedString(dewpt)).append("\n");
    sb.append("    windDir: ").append(toIndentedString(windDir)).append("\n");
    sb.append("    windCdir: ").append(toIndentedString(windCdir)).append("\n");
    sb.append("    windCdirFull: ").append(toIndentedString(windCdirFull)).append("\n");
    sb.append("    windSpeed: ").append(toIndentedString(windSpeed)).append("\n");
    sb.append("    temp: ").append(toIndentedString(temp)).append("\n");
    sb.append("    appTemp: ").append(toIndentedString(appTemp)).append("\n");
    sb.append("    clouds: ").append(toIndentedString(clouds)).append("\n");
    sb.append("    weather: ").append(toIndentedString(weather)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    obTime: ").append(toIndentedString(obTime)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    sunrise: ").append(toIndentedString(sunrise)).append("\n");
    sb.append("    sunset: ").append(toIndentedString(sunset)).append("\n");
    sb.append("    slp: ").append(toIndentedString(slp)).append("\n");
    sb.append("    pres: ").append(toIndentedString(pres)).append("\n");
    sb.append("    aqi: ").append(toIndentedString(aqi)).append("\n");
    sb.append("    uv: ").append(toIndentedString(uv)).append("\n");
    sb.append("    solarRad: ").append(toIndentedString(solarRad)).append("\n");
    sb.append("    ghi: ").append(toIndentedString(ghi)).append("\n");
    sb.append("    dni: ").append(toIndentedString(dni)).append("\n");
    sb.append("    dhi: ").append(toIndentedString(dhi)).append("\n");
    sb.append("    elevAngle: ").append(toIndentedString(elevAngle)).append("\n");
    sb.append("    hourAngle: ").append(toIndentedString(hourAngle)).append("\n");
    sb.append("    pod: ").append(toIndentedString(pod)).append("\n");
    sb.append("    precip: ").append(toIndentedString(precip)).append("\n");
    sb.append("    snow: ").append(toIndentedString(snow)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public static class Weather {
    public String icon, code, description;
  }

}
