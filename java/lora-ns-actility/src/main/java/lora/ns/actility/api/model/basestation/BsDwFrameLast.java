/*
 * ThingPark things management Networks API
 * REST interface for networks management. 
 *
 * The version of the OpenAPI document: 7.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package lora.ns.actility.api.model.basestation;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BsDwFrameLast
 */
@JsonPropertyOrder({ BsDwFrameLast.JSON_PROPERTY_ANT, BsDwFrameLast.JSON_PROPERTY_DATE,
    BsDwFrameLast.JSON_PROPERTY_LC })
@JsonTypeName("Bs_dwFrame_last")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-31T16:08:44.630492043+02:00[Europe/Paris]", comments = "Generator version: 7.6.0")
public class BsDwFrameLast {
  public static final String JSON_PROPERTY_ANT = "ant";
  private String ant;

  public static final String JSON_PROPERTY_DATE = "date";
  private Long date;

  public static final String JSON_PROPERTY_LC = "lc";
  private String lc;

  public BsDwFrameLast() {
  }

  public BsDwFrameLast ant(String ant) {

    this.ant = ant;
    return this;
  }

  /**
   * Last downlink frame antenna
   * 
   * @return ant
   **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAnt() {
    return ant;
  }

  @JsonProperty(JSON_PROPERTY_ANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnt(String ant) {
    this.ant = ant;
  }

  public BsDwFrameLast date(Long date) {

    this.date = date;
    return this;
  }

  /**
   * Last downlink frame timestamp, epoch time in milliseconds
   * 
   * @return date
   **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDate() {
    return date;
  }

  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(Long date) {
    this.date = date;
  }

  public BsDwFrameLast lc(String lc) {

    this.lc = lc;
    return this;
  }

  /**
   * Last downlink frame logical channel (LC1 ... LC7)
   * 
   * @return lc
   **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLc() {
    return lc;
  }

  @JsonProperty(JSON_PROPERTY_LC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLc(String lc) {
    this.lc = lc;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BsDwFrameLast bsDwFrameLast = (BsDwFrameLast) o;
    return Objects.equals(this.ant, bsDwFrameLast.ant) && Objects.equals(this.date, bsDwFrameLast.date)
            && Objects.equals(this.lc, bsDwFrameLast.lc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ant, date, lc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BsDwFrameLast {\n");
    sb.append("    ant: ").append(toIndentedString(ant)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    lc: ").append(toIndentedString(lc)).append("\n");
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