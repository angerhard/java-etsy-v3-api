/*
 * Etsy Open API v3
 * <div class=\"wt-text-body-01\"><p class=\"wt-pt-xs-2 wt-pb-xs-2\">Etsy's Open API provides a simple RESTful interface for various Etsy.com features. The API endpoints are meant to replace Etsy's Open API v2, which is scheduled to end service in 2022.</p><p class=\"wt-pb-xs-2\">All of the endpoints are callable and the majority of the API endpoints are now in a beta phase. This means we do not expect to make any breaking changes before our general release. A handful of endpoints are currently interface stubs (labeled “Feedback Only”) and returns a \"501 Not Implemented\" response code when called.</p><p class=\"wt-pb-xs-2\">If you'd like to report an issue or provide feedback on the API design, <a target=\"_blank\" class=\"wt-text-link wt-p-xs-0\" href=\"https://github.com/etsy/open-api/discussions\">please add an issue in Github</a>.</p></div>&copy; 2021-2025 Etsy, Inc. All Rights Reserved. Use of this code is subject to Etsy's <a class='wt-text-link wt-p-xs-0' target='_blank' href='https://www.etsy.com/legal/api'>API Developer Terms of Use</a>.
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: developers@etsy.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * A list of shipment statements for this receipt.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-15T11:53:41.521727200+01:00[Europe/Berlin]")
public class ShopReceiptShipmentsInner {
  public static final String SERIALIZED_NAME_RECEIPT_SHIPPING_ID = "receipt_shipping_id";
  @SerializedName(SERIALIZED_NAME_RECEIPT_SHIPPING_ID)
  private Long receiptShippingId;

  public static final String SERIALIZED_NAME_SHIPMENT_NOTIFICATION_TIMESTAMP = "shipment_notification_timestamp";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_NOTIFICATION_TIMESTAMP)
  private Long shipmentNotificationTimestamp;

  public static final String SERIALIZED_NAME_CARRIER_NAME = "carrier_name";
  @SerializedName(SERIALIZED_NAME_CARRIER_NAME)
  private String carrierName;

  public static final String SERIALIZED_NAME_TRACKING_CODE = "tracking_code";
  @SerializedName(SERIALIZED_NAME_TRACKING_CODE)
  private String trackingCode;

  public ShopReceiptShipmentsInner() {
  }

  public ShopReceiptShipmentsInner receiptShippingId(Long receiptShippingId) {
    
    this.receiptShippingId = receiptShippingId;
    return this;
  }

   /**
   * The unique numeric ID of a Shop Receipt Shipment record.
   * minimum: 1
   * @return receiptShippingId
  **/
  @javax.annotation.Nullable

  public Long getReceiptShippingId() {
    return receiptShippingId;
  }


  public void setReceiptShippingId(Long receiptShippingId) {
    this.receiptShippingId = receiptShippingId;
  }


  public ShopReceiptShipmentsInner shipmentNotificationTimestamp(Long shipmentNotificationTimestamp) {
    
    this.shipmentNotificationTimestamp = shipmentNotificationTimestamp;
    return this;
  }

   /**
   * The time at which Etsy notified the buyer of the shipment event, in epoch seconds.
   * minimum: 946684800
   * @return shipmentNotificationTimestamp
  **/
  @javax.annotation.Nullable

  public Long getShipmentNotificationTimestamp() {
    return shipmentNotificationTimestamp;
  }


  public void setShipmentNotificationTimestamp(Long shipmentNotificationTimestamp) {
    this.shipmentNotificationTimestamp = shipmentNotificationTimestamp;
  }


  public ShopReceiptShipmentsInner carrierName(String carrierName) {
    
    this.carrierName = carrierName;
    return this;
  }

   /**
   * The name string for the carrier/company responsible for delivering the shipment.
   * @return carrierName
  **/
  @javax.annotation.Nullable

  public String getCarrierName() {
    return carrierName;
  }


  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }


  public ShopReceiptShipmentsInner trackingCode(String trackingCode) {
    
    this.trackingCode = trackingCode;
    return this;
  }

   /**
   * The tracking code string provided by the carrier/company for the shipment.
   * @return trackingCode
  **/
  @javax.annotation.Nullable

  public String getTrackingCode() {
    return trackingCode;
  }


  public void setTrackingCode(String trackingCode) {
    this.trackingCode = trackingCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopReceiptShipmentsInner shopReceiptShipmentsInner = (ShopReceiptShipmentsInner) o;
    return Objects.equals(this.receiptShippingId, shopReceiptShipmentsInner.receiptShippingId) &&
        Objects.equals(this.shipmentNotificationTimestamp, shopReceiptShipmentsInner.shipmentNotificationTimestamp) &&
        Objects.equals(this.carrierName, shopReceiptShipmentsInner.carrierName) &&
        Objects.equals(this.trackingCode, shopReceiptShipmentsInner.trackingCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(receiptShippingId, shipmentNotificationTimestamp, carrierName, trackingCode);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopReceiptShipmentsInner {\n");
    sb.append("    receiptShippingId: ").append(toIndentedString(receiptShippingId)).append("\n");
    sb.append("    shipmentNotificationTimestamp: ").append(toIndentedString(shipmentNotificationTimestamp)).append("\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    trackingCode: ").append(toIndentedString(trackingCode)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("receipt_shipping_id");
    openapiFields.add("shipment_notification_timestamp");
    openapiFields.add("carrier_name");
    openapiFields.add("tracking_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShopReceiptShipmentsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ShopReceiptShipmentsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShopReceiptShipmentsInner is not found in the empty JSON string", ShopReceiptShipmentsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ShopReceiptShipmentsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShopReceiptShipmentsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("carrier_name") != null && !jsonObj.get("carrier_name").isJsonNull()) && !jsonObj.get("carrier_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrier_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrier_name").toString()));
      }
      if ((jsonObj.get("tracking_code") != null && !jsonObj.get("tracking_code").isJsonNull()) && !jsonObj.get("tracking_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tracking_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShopReceiptShipmentsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShopReceiptShipmentsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShopReceiptShipmentsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShopReceiptShipmentsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ShopReceiptShipmentsInner>() {
           @Override
           public void write(JsonWriter out, ShopReceiptShipmentsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShopReceiptShipmentsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShopReceiptShipmentsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShopReceiptShipmentsInner
  * @throws IOException if the JSON string is invalid with respect to ShopReceiptShipmentsInner
  */
  public static ShopReceiptShipmentsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShopReceiptShipmentsInner.class);
  }

 /**
  * Convert an instance of ShopReceiptShipmentsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

