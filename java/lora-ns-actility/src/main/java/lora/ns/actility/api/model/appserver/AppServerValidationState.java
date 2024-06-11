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

package lora.ns.actility.api.model.appserver;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Application Server validation state: - &#x60;VALIDATED&#x60;: The application
 * server is available for activation. - &#x60;SUSPENDED&#x60;: The application
 * server is suspended because of long time license expiration. Uplink frames
 * from the associated devices are not forwarded to the application server and
 * the application server is not able to send downlink payloads.
 */
public enum AppServerValidationState {

  VALIDATED("VALIDATED"),

  SUSPENDED("SUSPENDED");

  private String value;

  AppServerValidationState(String value) {
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
  public static AppServerValidationState fromValue(String value) {
    for (AppServerValidationState b : AppServerValidationState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}