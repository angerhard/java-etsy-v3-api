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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.UpdateListingInventoryRequestProductsInnerOfferingsInner;
import org.openapitools.client.model.UpdateListingInventoryRequestProductsInnerPropertyValuesInner;
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
 * UpdateListingInventoryRequestProductsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-15T11:53:41.521727200+01:00[Europe/Berlin]")
public class UpdateListingInventoryRequestProductsInner {
  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_PROPERTY_VALUES = "property_values";
  @SerializedName(SERIALIZED_NAME_PROPERTY_VALUES)
  private List<UpdateListingInventoryRequestProductsInnerPropertyValuesInner> propertyValues = new ArrayList<>();

  public static final String SERIALIZED_NAME_OFFERINGS = "offerings";
  @SerializedName(SERIALIZED_NAME_OFFERINGS)
  private List<UpdateListingInventoryRequestProductsInnerOfferingsInner> offerings = new ArrayList<>();

  public UpdateListingInventoryRequestProductsInner() {
  }

  public UpdateListingInventoryRequestProductsInner sku(String sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * The SKU string for the product
   * @return sku
  **/
  @javax.annotation.Nullable

  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    this.sku = sku;
  }


  public UpdateListingInventoryRequestProductsInner propertyValues(List<UpdateListingInventoryRequestProductsInnerPropertyValuesInner> propertyValues) {
    
    this.propertyValues = propertyValues;
    return this;
  }

  public UpdateListingInventoryRequestProductsInner addPropertyValuesItem(UpdateListingInventoryRequestProductsInnerPropertyValuesInner propertyValuesItem) {
    if (this.propertyValues == null) {
      this.propertyValues = new ArrayList<>();
    }
    this.propertyValues.add(propertyValuesItem);
    return this;
  }

   /**
   * A list of property value entries for this product. Note: parenthesis characters (&#x60;(&#x60; and &#x60;)&#x60;) are not allowed.
   * @return propertyValues
  **/
  @javax.annotation.Nullable

  public List<UpdateListingInventoryRequestProductsInnerPropertyValuesInner> getPropertyValues() {
    return propertyValues;
  }


  public void setPropertyValues(List<UpdateListingInventoryRequestProductsInnerPropertyValuesInner> propertyValues) {
    this.propertyValues = propertyValues;
  }


  public UpdateListingInventoryRequestProductsInner offerings(List<UpdateListingInventoryRequestProductsInnerOfferingsInner> offerings) {
    
    this.offerings = offerings;
    return this;
  }

  public UpdateListingInventoryRequestProductsInner addOfferingsItem(UpdateListingInventoryRequestProductsInnerOfferingsInner offeringsItem) {
    this.offerings.add(offeringsItem);
    return this;
  }

   /**
   * A list of product offering entries for this product.
   * @return offerings
  **/
  @javax.annotation.Nonnull

  public List<UpdateListingInventoryRequestProductsInnerOfferingsInner> getOfferings() {
    return offerings;
  }


  public void setOfferings(List<UpdateListingInventoryRequestProductsInnerOfferingsInner> offerings) {
    this.offerings = offerings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateListingInventoryRequestProductsInner updateListingInventoryRequestProductsInner = (UpdateListingInventoryRequestProductsInner) o;
    return Objects.equals(this.sku, updateListingInventoryRequestProductsInner.sku) &&
        Objects.equals(this.propertyValues, updateListingInventoryRequestProductsInner.propertyValues) &&
        Objects.equals(this.offerings, updateListingInventoryRequestProductsInner.offerings);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, propertyValues, offerings);
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
    sb.append("class UpdateListingInventoryRequestProductsInner {\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    propertyValues: ").append(toIndentedString(propertyValues)).append("\n");
    sb.append("    offerings: ").append(toIndentedString(offerings)).append("\n");
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
    openapiFields.add("sku");
    openapiFields.add("property_values");
    openapiFields.add("offerings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("offerings");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateListingInventoryRequestProductsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateListingInventoryRequestProductsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateListingInventoryRequestProductsInner is not found in the empty JSON string", UpdateListingInventoryRequestProductsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateListingInventoryRequestProductsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateListingInventoryRequestProductsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateListingInventoryRequestProductsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("sku") != null && !jsonObj.get("sku").isJsonNull()) && !jsonObj.get("sku").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sku` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sku").toString()));
      }
      if (jsonObj.get("property_values") != null && !jsonObj.get("property_values").isJsonNull()) {
        JsonArray jsonArraypropertyValues = jsonObj.getAsJsonArray("property_values");
        if (jsonArraypropertyValues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("property_values").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `property_values` to be an array in the JSON string but got `%s`", jsonObj.get("property_values").toString()));
          }

          // validate the optional field `property_values` (array)
          for (int i = 0; i < jsonArraypropertyValues.size(); i++) {
            UpdateListingInventoryRequestProductsInnerPropertyValuesInner.validateJsonObject(jsonArraypropertyValues.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("offerings").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `offerings` to be an array in the JSON string but got `%s`", jsonObj.get("offerings").toString()));
      }

      JsonArray jsonArrayofferings = jsonObj.getAsJsonArray("offerings");
      // validate the required field `offerings` (array)
      for (int i = 0; i < jsonArrayofferings.size(); i++) {
        UpdateListingInventoryRequestProductsInnerOfferingsInner.validateJsonObject(jsonArrayofferings.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateListingInventoryRequestProductsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateListingInventoryRequestProductsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateListingInventoryRequestProductsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateListingInventoryRequestProductsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateListingInventoryRequestProductsInner>() {
           @Override
           public void write(JsonWriter out, UpdateListingInventoryRequestProductsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateListingInventoryRequestProductsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateListingInventoryRequestProductsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateListingInventoryRequestProductsInner
  * @throws IOException if the JSON string is invalid with respect to UpdateListingInventoryRequestProductsInner
  */
  public static UpdateListingInventoryRequestProductsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateListingInventoryRequestProductsInner.class);
  }

 /**
  * Convert an instance of UpdateListingInventoryRequestProductsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

