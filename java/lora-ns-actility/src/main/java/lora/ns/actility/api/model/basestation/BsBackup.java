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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BsBackup
 */
@JsonPropertyOrder({ BsBackup.JSON_PROPERTY_DATE, BsBackup.JSON_PROPERTY_STATUS, BsBackup.JSON_PROPERTY_STATUS_INFO,
    BsBackup.JSON_PROPERTY_VERSION })
@JsonTypeName("Bs_backup")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-31T16:08:44.630492043+02:00[Europe/Paris]", comments = "Generator version: 7.6.0")
public class BsBackup {
  public static final String JSON_PROPERTY_DATE = "date";
  private Long date;

  /**
   * Version status: OUTDATED, UPTODATE, DEPRECATED, UNKNOWN
   */
  public enum StatusEnum {
    OUTDATED("OUTDATED"),

    UPTODATE("UPTODATE"),

    DEPRECATED("DEPRECATED"),

    UNKNOWN("UNKNOWN");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_STATUS_INFO = "statusInfo";
  private String statusInfo;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public BsBackup() {
  }

  public BsBackup date(Long date) {

    this.date = date;
    return this;
  }

  /**
   * Backup date, epoch time in milliseconds
   * 
   * @return date
   **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getDate() {
    return date;
  }

  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDate(Long date) {
    this.date = date;
  }

  public BsBackup status(StatusEnum status) {

    this.status = status;
    return this;
  }

  /**
   * Version status: OUTDATED, UPTODATE, DEPRECATED, UNKNOWN
   * 
   * @return status
   **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }

  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public BsBackup statusInfo(String statusInfo) {

    this.statusInfo = statusInfo;
    return this;
  }

  /**
   * Friendly version status info
   * 
   * @return statusInfo
   **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatusInfo() {
    return statusInfo;
  }

  @JsonProperty(JSON_PROPERTY_STATUS_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusInfo(String statusInfo) {
    this.statusInfo = statusInfo;
  }

  public BsBackup version(String version) {

    this.version = version;
    return this;
  }

  /**
   * Backup LRR software version
   * 
   * @return version
   **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVersion() {
    return version;
  }

  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BsBackup bsBackup = (BsBackup) o;
    return Objects.equals(this.date, bsBackup.date) && Objects.equals(this.status, bsBackup.status)
            && Objects.equals(this.statusInfo, bsBackup.statusInfo) && Objects.equals(this.version, bsBackup.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, status, statusInfo, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BsBackup {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusInfo: ").append(toIndentedString(statusInfo)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
