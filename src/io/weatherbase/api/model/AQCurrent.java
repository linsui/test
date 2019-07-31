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
 * AQCurrent
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-07-23T18:38:21.490044+08:00[Asia/Shanghai]")
public class AQCurrent {
  @SerializedName("aqi")
  private Integer aqi = null;

  @SerializedName("so2")
  private BigDecimal so2 = null;

  @SerializedName("no2")
  private BigDecimal no2 = null;

  @SerializedName("o3")
  private BigDecimal o3 = null;

  @SerializedName("pm25")
  private BigDecimal pm25 = null;

  @SerializedName("pm10")
  private BigDecimal pm10 = null;

  public AQCurrent aqi(Integer aqi) {
    this.aqi = aqi;
    return this;
  }

   /**
   * Cloud cover as a percentage (%)
   * @return aqi
  **/
  @Schema(example = "100", description = "Cloud cover as a percentage (%)")
  public Integer getAqi() {
    return aqi;
  }

  public void setAqi(Integer aqi) {
    this.aqi = aqi;
  }

  public AQCurrent so2(BigDecimal so2) {
    this.so2 = so2;
    return this;
  }

   /**
   * Concentration of SO2 (µg/m³)
   * @return so2
  **/
  @Schema(example = "50.0", description = "Concentration of SO2 (µg/m³)")
  public BigDecimal getSo2() {
    return so2;
  }

  public void setSo2(BigDecimal so2) {
    this.so2 = so2;
  }

  public AQCurrent no2(BigDecimal no2) {
    this.no2 = no2;
    return this;
  }

   /**
   * Concentration of NO2 (µg/m³)
   * @return no2
  **/
  @Schema(example = "25.0", description = "Concentration of NO2 (µg/m³)")
  public BigDecimal getNo2() {
    return no2;
  }

  public void setNo2(BigDecimal no2) {
    this.no2 = no2;
  }

  public AQCurrent o3(BigDecimal o3) {
    this.o3 = o3;
    return this;
  }

   /**
   * Concentration of O3 (µg/m³)
   * @return o3
  **/
  @Schema(example = "2.0", description = "Concentration of O3 (µg/m³)")
  public BigDecimal getO3() {
    return o3;
  }

  public void setO3(BigDecimal o3) {
    this.o3 = o3;
  }

  public AQCurrent pm25(BigDecimal pm25) {
    this.pm25 = pm25;
    return this;
  }

   /**
   * Concentration of PM 2.5 (µg/m³)
   * @return pm25
  **/
  @Schema(example = "230.0", description = "Concentration of PM 2.5 (µg/m³)")
  public BigDecimal getPm25() {
    return pm25;
  }

  public void setPm25(BigDecimal pm25) {
    this.pm25 = pm25;
  }

  public AQCurrent pm10(BigDecimal pm10) {
    this.pm10 = pm10;
    return this;
  }

   /**
   * Concentration of PM 10 (µg/m³)
   * @return pm10
  **/
  @Schema(example = "150.0", description = "Concentration of PM 10 (µg/m³)")
  public BigDecimal getPm10() {
    return pm10;
  }

  public void setPm10(BigDecimal pm10) {
    this.pm10 = pm10;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AQCurrent aqCurrent = (AQCurrent) o;
    return Objects.equals(this.aqi, aqCurrent.aqi) &&
        Objects.equals(this.so2, aqCurrent.so2) &&
        Objects.equals(this.no2, aqCurrent.no2) &&
        Objects.equals(this.o3, aqCurrent.o3) &&
        Objects.equals(this.pm25, aqCurrent.pm25) &&
        Objects.equals(this.pm10, aqCurrent.pm10);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aqi, so2, no2, o3, pm25, pm10);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AQCurrent {\n");
    
    sb.append("    aqi: ").append(toIndentedString(aqi)).append("\n");
    sb.append("    so2: ").append(toIndentedString(so2)).append("\n");
    sb.append("    no2: ").append(toIndentedString(no2)).append("\n");
    sb.append("    o3: ").append(toIndentedString(o3)).append("\n");
    sb.append("    pm25: ").append(toIndentedString(pm25)).append("\n");
    sb.append("    pm10: ").append(toIndentedString(pm10)).append("\n");
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

}