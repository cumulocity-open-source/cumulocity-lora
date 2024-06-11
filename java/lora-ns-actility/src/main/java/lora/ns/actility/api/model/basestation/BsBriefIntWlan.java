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

/**
 * BsBriefIntWlan
 */
@JsonPropertyOrder({ BsBriefIntWlan.JSON_PROPERTY_RSSI, BsBriefIntWlan.JSON_PROPERTY_SSID,
    BsBriefIntWlan.JSON_PROPERTY_STATE })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-31T16:08:44.630492043+02:00[Europe/Paris]", comments = "Generator version: 7.6.0")
public class BsBriefIntWlan {
  public static final String JSON_PROPERTY_RSSI = "rssi";
  private Float rssi;

  public static final String JSON_PROPERTY_SSID = "ssid";
  private String ssid;

  public static final String JSON_PROPERTY_STATE = "state";
  private Integer state;

  public BsBriefIntWlan() {
  }

  public BsBriefIntWlan rssi(Float rssi) {

    this.rssi = rssi;
    return this;
  }

  /**
   * WLAN RSSI in dBm
   * 
   * @return rssi
   **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RSSI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getRssi() {
    return rssi;
  }

  @JsonProperty(JSON_PROPERTY_RSSI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRssi(Float rssi) {
    this.rssi = rssi;
  }

  public BsBriefIntWlan ssid(String ssid) {

    this.ssid = ssid;
    return this;
  }

  /**
   * SSID of WLAN network
   * 
   * @return ssid
   **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSsid() {
    return ssid;
  }

  @JsonProperty(JSON_PROPERTY_SSID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSsid(String ssid) {
    this.ssid = ssid;
  }

  public BsBriefIntWlan state(Integer state) {

    this.state = state;
    return this;
  }

  /**
   * State for a WLAN interface: - Down / No started (5) - Up / SSID not found /
   * No sig. (4) - Up / No IP / No DHCP lease (3) - Up / Network down (2) - Up and
   * running (1) - Up / running and used (0) - Unknown because of disconnected
   * Base Station (null)
   * 
   * @return state
   **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getState() {
    return state;
  }

  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(Integer state) {
    this.state = state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BsBriefIntWlan bsBriefIntWlan = (BsBriefIntWlan) o;
    return Objects.equals(this.rssi, bsBriefIntWlan.rssi) && Objects.equals(this.ssid, bsBriefIntWlan.ssid)
            && Objects.equals(this.state, bsBriefIntWlan.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rssi, ssid, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BsBriefIntWlan {\n");
    sb.append("    rssi: ").append(toIndentedString(rssi)).append("\n");
    sb.append("    ssid: ").append(toIndentedString(ssid)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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