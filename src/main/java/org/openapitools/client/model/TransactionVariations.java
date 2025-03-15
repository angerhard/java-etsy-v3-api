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
 * A list of variations chosen by the buyer during checkout.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-15T11:53:41.521727200+01:00[Europe/Berlin]")
public class TransactionVariations {
  public static final String SERIALIZED_NAME_PROPERTY_ID = "property_id";
  @SerializedName(SERIALIZED_NAME_PROPERTY_ID)
  private Long propertyId;

  public static final String SERIALIZED_NAME_VALUE_ID = "value_id";
  @SerializedName(SERIALIZED_NAME_VALUE_ID)
  private Long valueId;

  public static final String SERIALIZED_NAME_FORMATTED_NAME = "formatted_name";
  @SerializedName(SERIALIZED_NAME_FORMATTED_NAME)
  private String formattedName;

  public static final String SERIALIZED_NAME_FORMATTED_VALUE = "formatted_value";
  @SerializedName(SERIALIZED_NAME_FORMATTED_VALUE)
  private String formattedValue;

  public TransactionVariations() {
  }

  public TransactionVariations propertyId(Long propertyId) {
    
    this.propertyId = propertyId;
    return this;
  }

   /**
   * The variation property ID.
   * @return propertyId
  **/
  @javax.annotation.Nullable

  public Long getPropertyId() {
    return propertyId;
  }


  public void setPropertyId(Long propertyId) {
    this.propertyId = propertyId;
  }


  public TransactionVariations valueId(Long valueId) {
    
    this.valueId = valueId;
    return this;
  }

   /**
   * The ID of the variation value selected.
   * @return valueId
  **/
  @javax.annotation.Nullable

  public Long getValueId() {
    return valueId;
  }


  public void setValueId(Long valueId) {
    this.valueId = valueId;
  }


  public TransactionVariations formattedName(String formattedName) {
    
    this.formattedName = formattedName;
    return this;
  }

   /**
   * Formatted name of the variation.
   * @return formattedName
  **/
  @javax.annotation.Nullable

  public String getFormattedName() {
    return formattedName;
  }


  public void setFormattedName(String formattedName) {
    this.formattedName = formattedName;
  }


  public TransactionVariations formattedValue(String formattedValue) {
    
    this.formattedValue = formattedValue;
    return this;
  }

   /**
   * Value of the variation entered by the buyer.
   * @return formattedValue
  **/
  @javax.annotation.Nullable

  public String getFormattedValue() {
    return formattedValue;
  }


  public void setFormattedValue(String formattedValue) {
    this.formattedValue = formattedValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionVariations transactionVariations = (TransactionVariations) o;
    return Objects.equals(this.propertyId, transactionVariations.propertyId) &&
        Objects.equals(this.valueId, transactionVariations.valueId) &&
        Objects.equals(this.formattedName, transactionVariations.formattedName) &&
        Objects.equals(this.formattedValue, transactionVariations.formattedValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyId, valueId, formattedName, formattedValue);
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
    sb.append("class TransactionVariations {\n");
    sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
    sb.append("    valueId: ").append(toIndentedString(valueId)).append("\n");
    sb.append("    formattedName: ").append(toIndentedString(formattedName)).append("\n");
    sb.append("    formattedValue: ").append(toIndentedString(formattedValue)).append("\n");
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
    openapiFields.add("property_id");
    openapiFields.add("value_id");
    openapiFields.add("formatted_name");
    openapiFields.add("formatted_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransactionVariations
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TransactionVariations.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionVariations is not found in the empty JSON string", TransactionVariations.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TransactionVariations.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransactionVariations` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("formatted_name") != null && !jsonObj.get("formatted_name").isJsonNull()) && !jsonObj.get("formatted_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `formatted_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("formatted_name").toString()));
      }
      if ((jsonObj.get("formatted_value") != null && !jsonObj.get("formatted_value").isJsonNull()) && !jsonObj.get("formatted_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `formatted_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("formatted_value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionVariations.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionVariations' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionVariations> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionVariations.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionVariations>() {
           @Override
           public void write(JsonWriter out, TransactionVariations value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionVariations read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransactionVariations given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionVariations
  * @throws IOException if the JSON string is invalid with respect to TransactionVariations
  */
  public static TransactionVariations fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionVariations.class);
  }

 /**
  * Convert an instance of TransactionVariations to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

