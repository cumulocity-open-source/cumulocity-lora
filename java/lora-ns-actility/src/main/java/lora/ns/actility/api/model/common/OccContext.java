/*
 * ThingPark things management Devices API
 * REST interface for Devices management. 
 *
 * The version of the OpenAPI document: 7.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package lora.ns.actility.api.model.common;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Optimistic Concurrency Control.
 */
@JsonPropertyOrder({ OccContext.JSON_PROPERTY_LAST_UPDATE, OccContext.JSON_PROPERTY_VERSION,
    OccContext.JSON_PROPERTY_WHO })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-29T11:33:06.356743432+02:00[Europe/Paris]", comments = "Generator version: 7.6.0")
public class OccContext {
  public static final String JSON_PROPERTY_LAST_UPDATE = "lastUpdate";
  private Long lastUpdate;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_WHO = "who";
  private String who;

  public OccContext() {
  }

  @JsonCreator
  public OccContext(@JsonProperty(JSON_PROPERTY_LAST_UPDATE) Long lastUpdate,
          @JsonProperty(JSON_PROPERTY_WHO) String who) {
    this();
    this.lastUpdate = lastUpdate;
    this.who = who;
  }

  /**
   * Get lastUpdate
   * 
   * @return lastUpdate
   **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAST_UPDATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getLastUpdate() {
    return lastUpdate;
  }

  public OccContext version(Integer version) {

    this.version = version;
    return this;
  }

  /**
   * Get version minimum: 0
   * 
   * @return version
   **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getVersion() {
    return version;
  }

  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(Integer version) {
    this.version = version;
  }

  /**
   * Get who
   * 
   * @return who
   **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WHO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWho() {
    return who;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OccContext occContext = (OccContext) o;
    return Objects.equals(this.lastUpdate, occContext.lastUpdate) && Objects.equals(this.version, occContext.version)
            && Objects.equals(this.who, occContext.who);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdate, version, who);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OccContext {\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    who: ").append(toIndentedString(who)).append("\n");
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
