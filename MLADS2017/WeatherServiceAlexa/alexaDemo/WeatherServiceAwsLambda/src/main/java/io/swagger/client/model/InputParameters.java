/*
 * WeatherService
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * InputParameters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-01T18:07:18.003Z")
public class InputParameters {
  @SerializedName("latitude")
  private BigDecimal latitude = null;

  @SerializedName("longitude")
  private BigDecimal longitude = null;

  public InputParameters latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * numeric
   * @return latitude
  **/
  @ApiModelProperty(value = "numeric")
  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public InputParameters longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * numeric
   * @return longitude
  **/
  @ApiModelProperty(value = "numeric")
  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputParameters inputParameters = (InputParameters) o;
    return Objects.equals(this.latitude, inputParameters.latitude) &&
        Objects.equals(this.longitude, inputParameters.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputParameters {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
