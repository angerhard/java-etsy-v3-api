/*
 * Etsy Open API v3
 * <div class=\"wt-text-body-01\"><p class=\"wt-pt-xs-2 wt-pb-xs-2\">Etsy's Open API provides a simple RESTful interface for various Etsy.com features. The API endpoints are meant to replace Etsy's Open API v2, which is scheduled to end service in 2022.</p><p class=\"wt-pb-xs-2\">All of the endpoints are callable and the majority of the API endpoints are now in a beta phase. This means we do not expect to make any breaking changes before our general release. A handful of endpoints are currently interface stubs (labeled “Feedback Only”) and returns a \"501 Not Implemented\" response code when called.</p><p class=\"wt-pb-xs-2\">If you'd like to report an issue or provide feedback on the API design, <a target=\"_blank\" class=\"wt-text-link wt-p-xs-0\" href=\"https://github.com/etsy/open-api/issues/new/choose\">please add an issue in Github</a>.</p></div>&copy; 2021-2023 Etsy, Inc. All Rights Reserved. Use of this code is subject to Etsy's <a class='wt-text-link wt-p-xs-0' target='_blank' href='https://www.etsy.com/legal/api'>API Developer Terms of Use</a>.
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
import java.util.*;
import java.util.Map.Entry;

/**
 * ShippingCarriersResultsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-18T13:10:02.644710400+01:00[Europe/Berlin]")
public class ShippingCarriersResultsInner {
  public static final String SERIALIZED_NAME_SHIPPING_CARRIER_ID = "shipping_carrier_id";
  @SerializedName(SERIALIZED_NAME_SHIPPING_CARRIER_ID)
  private Long shippingCarrierId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DOMESTIC_CLASSES = "domestic_classes";
  @SerializedName(SERIALIZED_NAME_DOMESTIC_CLASSES)
  private List<ShippingCarrierDomesticClassesInner> domesticClasses = new ArrayList<>();

  public static final String SERIALIZED_NAME_INTERNATIONAL_CLASSES = "international_classes";
  @SerializedName(SERIALIZED_NAME_INTERNATIONAL_CLASSES)
  private List<ShippingCarrierInternationalClassesInner> internationalClasses = new ArrayList<>();

  public ShippingCarriersResultsInner() {
  }

  public ShippingCarriersResultsInner shippingCarrierId(Long shippingCarrierId) {
    
    this.shippingCarrierId = shippingCarrierId;
    return this;
  }

   /**
   * The numeric ID of this shipping carrier.
   * minimum: 1
   * @return shippingCarrierId
  **/
  @javax.annotation.Nullable

  public Long getShippingCarrierId() {
    return shippingCarrierId;
  }


  public void setShippingCarrierId(Long shippingCarrierId) {
    this.shippingCarrierId = shippingCarrierId;
  }


  public ShippingCarriersResultsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of this shipping carrier.
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ShippingCarriersResultsInner domesticClasses(List<ShippingCarrierDomesticClassesInner> domesticClasses) {
    
    this.domesticClasses = domesticClasses;
    return this;
  }

  public ShippingCarriersResultsInner addDomesticClassesItem(ShippingCarrierDomesticClassesInner domesticClassesItem) {
    if (this.domesticClasses == null) {
      this.domesticClasses = new ArrayList<>();
    }
    this.domesticClasses.add(domesticClassesItem);
    return this;
  }

   /**
   * Set of domestic mail classes of this shipping carrier.
   * @return domesticClasses
  **/
  @javax.annotation.Nullable

  public List<ShippingCarrierDomesticClassesInner> getDomesticClasses() {
    return domesticClasses;
  }


  public void setDomesticClasses(List<ShippingCarrierDomesticClassesInner> domesticClasses) {
    this.domesticClasses = domesticClasses;
  }


  public ShippingCarriersResultsInner internationalClasses(List<ShippingCarrierInternationalClassesInner> internationalClasses) {
    
    this.internationalClasses = internationalClasses;
    return this;
  }

  public ShippingCarriersResultsInner addInternationalClassesItem(ShippingCarrierInternationalClassesInner internationalClassesItem) {
    if (this.internationalClasses == null) {
      this.internationalClasses = new ArrayList<>();
    }
    this.internationalClasses.add(internationalClassesItem);
    return this;
  }

   /**
   * Set of international mail classes of this shipping carrier.
   * @return internationalClasses
  **/
  @javax.annotation.Nullable

  public List<ShippingCarrierInternationalClassesInner> getInternationalClasses() {
    return internationalClasses;
  }


  public void setInternationalClasses(List<ShippingCarrierInternationalClassesInner> internationalClasses) {
    this.internationalClasses = internationalClasses;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingCarriersResultsInner shippingCarriersResultsInner = (ShippingCarriersResultsInner) o;
    return Objects.equals(this.shippingCarrierId, shippingCarriersResultsInner.shippingCarrierId) &&
        Objects.equals(this.name, shippingCarriersResultsInner.name) &&
        Objects.equals(this.domesticClasses, shippingCarriersResultsInner.domesticClasses) &&
        Objects.equals(this.internationalClasses, shippingCarriersResultsInner.internationalClasses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingCarrierId, name, domesticClasses, internationalClasses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingCarriersResultsInner {\n");
    sb.append("    shippingCarrierId: ").append(toIndentedString(shippingCarrierId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    domesticClasses: ").append(toIndentedString(domesticClasses)).append("\n");
    sb.append("    internationalClasses: ").append(toIndentedString(internationalClasses)).append("\n");
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
    openapiFields.add("shipping_carrier_id");
    openapiFields.add("name");
    openapiFields.add("domestic_classes");
    openapiFields.add("international_classes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShippingCarriersResultsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ShippingCarriersResultsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShippingCarriersResultsInner is not found in the empty JSON string", ShippingCarriersResultsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ShippingCarriersResultsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShippingCarriersResultsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("domestic_classes") != null && !jsonObj.get("domestic_classes").isJsonNull()) {
        JsonArray jsonArraydomesticClasses = jsonObj.getAsJsonArray("domestic_classes");
        if (jsonArraydomesticClasses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("domestic_classes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `domestic_classes` to be an array in the JSON string but got `%s`", jsonObj.get("domestic_classes").toString()));
          }

          // validate the optional field `domestic_classes` (array)
          for (int i = 0; i < jsonArraydomesticClasses.size(); i++) {
            ShippingCarrierDomesticClassesInner.validateJsonObject(jsonArraydomesticClasses.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("international_classes") != null && !jsonObj.get("international_classes").isJsonNull()) {
        JsonArray jsonArrayinternationalClasses = jsonObj.getAsJsonArray("international_classes");
        if (jsonArrayinternationalClasses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("international_classes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `international_classes` to be an array in the JSON string but got `%s`", jsonObj.get("international_classes").toString()));
          }

          // validate the optional field `international_classes` (array)
          for (int i = 0; i < jsonArrayinternationalClasses.size(); i++) {
            ShippingCarrierInternationalClassesInner.validateJsonObject(jsonArrayinternationalClasses.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShippingCarriersResultsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShippingCarriersResultsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShippingCarriersResultsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShippingCarriersResultsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ShippingCarriersResultsInner>() {
           @Override
           public void write(JsonWriter out, ShippingCarriersResultsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShippingCarriersResultsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShippingCarriersResultsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShippingCarriersResultsInner
  * @throws IOException if the JSON string is invalid with respect to ShippingCarriersResultsInner
  */
  public static ShippingCarriersResultsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShippingCarriersResultsInner.class);
  }

 /**
  * Convert an instance of ShippingCarriersResultsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

