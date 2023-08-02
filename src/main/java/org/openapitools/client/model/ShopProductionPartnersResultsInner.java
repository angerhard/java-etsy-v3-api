/*
 * Etsy Open API v3
 * <div class=\"wt-text-body-01\"><p class=\"wt-pt-xs-2 wt-pb-xs-2\">Etsy's Open API provides a simple RESTful interface for various Etsy.com features. The API endpoints are meant to replace Etsy's Open API v2, which is scheduled to end service in 2022.</p><p class=\"wt-pb-xs-2\">All of the endpoints are callable and the majority of the API endpoints are now in a beta phase. This means we do not expect to make any breaking changes before our general release. A handful of endpoints are currently interface stubs (labeled “Feedback Only”) and returns a \"501 Not Implemented\" response code when called.</p><p class=\"wt-pb-xs-2\">If you'd like to report an issue or provide feedback on the API design, <a target=\"_blank\" class=\"wt-text-link wt-p-xs-0\" href=\"https://github.com/etsy/open-api/discussions\">please add an issue in Github</a>.</p></div>&copy; 2021-2023 Etsy, Inc. All Rights Reserved. Use of this code is subject to Etsy's <a class='wt-text-link wt-p-xs-0' target='_blank' href='https://www.etsy.com/legal/api'>API Developer Terms of Use</a>.
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: developers@etsy.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.openapitools.client.JSON;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/**
 * The list of requested resources.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-02T22:46:35.595209100+02:00[Europe/Berlin]")
public class ShopProductionPartnersResultsInner {
  public static final String SERIALIZED_NAME_PRODUCTION_PARTNER_ID = "production_partner_id";
  @SerializedName(SERIALIZED_NAME_PRODUCTION_PARTNER_ID)
  private Long productionPartnerId;

  public static final String SERIALIZED_NAME_PARTNER_NAME = "partner_name";
  @SerializedName(SERIALIZED_NAME_PARTNER_NAME)
  private String partnerName;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public ShopProductionPartnersResultsInner() {
  }

  public ShopProductionPartnersResultsInner productionPartnerId(Long productionPartnerId) {
    
    this.productionPartnerId = productionPartnerId;
    return this;
  }

   /**
   * The numeric ID of a production partner.
   * minimum: 1
   * @return productionPartnerId
  **/
  @javax.annotation.Nullable

  public Long getProductionPartnerId() {
    return productionPartnerId;
  }


  public void setProductionPartnerId(Long productionPartnerId) {
    this.productionPartnerId = productionPartnerId;
  }


  public ShopProductionPartnersResultsInner partnerName(String partnerName) {
    
    this.partnerName = partnerName;
    return this;
  }

   /**
   * The name or title of the production partner.
   * @return partnerName
  **/
  @javax.annotation.Nullable

  public String getPartnerName() {
    return partnerName;
  }


  public void setPartnerName(String partnerName) {
    this.partnerName = partnerName;
  }


  public ShopProductionPartnersResultsInner location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * A string representing the production partner location.
   * @return location
  **/
  @javax.annotation.Nullable

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopProductionPartnersResultsInner shopProductionPartnersResultsInner = (ShopProductionPartnersResultsInner) o;
    return Objects.equals(this.productionPartnerId, shopProductionPartnersResultsInner.productionPartnerId) &&
        Objects.equals(this.partnerName, shopProductionPartnersResultsInner.partnerName) &&
        Objects.equals(this.location, shopProductionPartnersResultsInner.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productionPartnerId, partnerName, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopProductionPartnersResultsInner {\n");
    sb.append("    productionPartnerId: ").append(toIndentedString(productionPartnerId)).append("\n");
    sb.append("    partnerName: ").append(toIndentedString(partnerName)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
    openapiFields.add("production_partner_id");
    openapiFields.add("partner_name");
    openapiFields.add("location");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShopProductionPartnersResultsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ShopProductionPartnersResultsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShopProductionPartnersResultsInner is not found in the empty JSON string", ShopProductionPartnersResultsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ShopProductionPartnersResultsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShopProductionPartnersResultsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("partner_name") != null && !jsonObj.get("partner_name").isJsonNull()) && !jsonObj.get("partner_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partner_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partner_name").toString()));
      }
      if ((jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShopProductionPartnersResultsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShopProductionPartnersResultsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShopProductionPartnersResultsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShopProductionPartnersResultsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ShopProductionPartnersResultsInner>() {
           @Override
           public void write(JsonWriter out, ShopProductionPartnersResultsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShopProductionPartnersResultsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShopProductionPartnersResultsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShopProductionPartnersResultsInner
  * @throws IOException if the JSON string is invalid with respect to ShopProductionPartnersResultsInner
  */
  public static ShopProductionPartnersResultsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShopProductionPartnersResultsInner.class);
  }

 /**
  * Convert an instance of ShopProductionPartnersResultsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

