/*
 * Etsy Open API v3
 * <div class=\"wt-text-body-01\"><p class=\"wt-pt-xs-2 wt-pb-xs-2\">Etsy's Open API provides a simple RESTful interface for various Etsy.com features. The API endpoints are meant to replace Etsy's Open API v2, which is scheduled to end service in 2022.</p><p class=\"wt-pb-xs-2\">All of the endpoints are callable and the majority of the API endpoints are now in a beta phase. This means we do not expect to make any breaking changes before our general release. A handful of endpoints are currently interface stubs (labeled “Feedback Only”) and returns a \"501 Not Implemented\" response code when called.</p><p class=\"wt-pb-xs-2\">If you'd like to report an issue or provide feedback on the API design, <a target=\"_blank\" class=\"wt-text-link wt-p-xs-0\" href=\"https://github.com/etsy/open-api/discussions\">please add an issue in Github</a>.</p></div>&copy; 2021-2024 Etsy, Inc. All Rights Reserved. Use of this code is subject to Etsy's <a class='wt-text-link wt-p-xs-0' target='_blank' href='https://www.etsy.com/legal/api'>API Developer Terms of Use</a>.
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
 * A representation of structured data values.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-03T07:15:13.096948200+02:00[Europe/Berlin]")
public class ListingPropertyValue {
  public static final String SERIALIZED_NAME_PROPERTY_ID = "property_id";
  @SerializedName(SERIALIZED_NAME_PROPERTY_ID)
  private Long propertyId;

  public static final String SERIALIZED_NAME_PROPERTY_NAME = "property_name";
  @SerializedName(SERIALIZED_NAME_PROPERTY_NAME)
  private String propertyName;

  public static final String SERIALIZED_NAME_SCALE_ID = "scale_id";
  @SerializedName(SERIALIZED_NAME_SCALE_ID)
  private Long scaleId;

  public static final String SERIALIZED_NAME_SCALE_NAME = "scale_name";
  @SerializedName(SERIALIZED_NAME_SCALE_NAME)
  private String scaleName;

  public static final String SERIALIZED_NAME_VALUE_IDS = "value_ids";
  @SerializedName(SERIALIZED_NAME_VALUE_IDS)
  private List<Long> valueIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<String> values = new ArrayList<>();

  public ListingPropertyValue() {
  }

  public ListingPropertyValue propertyId(Long propertyId) {
    
    this.propertyId = propertyId;
    return this;
  }

   /**
   * The numeric ID of the Property.
   * minimum: 1
   * @return propertyId
  **/
  @javax.annotation.Nullable

  public Long getPropertyId() {
    return propertyId;
  }


  public void setPropertyId(Long propertyId) {
    this.propertyId = propertyId;
  }


  public ListingPropertyValue propertyName(String propertyName) {
    
    this.propertyName = propertyName;
    return this;
  }

   /**
   * The name of the Property.
   * @return propertyName
  **/
  @javax.annotation.Nullable

  public String getPropertyName() {
    return propertyName;
  }


  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }


  public ListingPropertyValue scaleId(Long scaleId) {
    
    this.scaleId = scaleId;
    return this;
  }

   /**
   * The numeric ID of the scale (if any).
   * minimum: 1
   * @return scaleId
  **/
  @javax.annotation.Nullable

  public Long getScaleId() {
    return scaleId;
  }


  public void setScaleId(Long scaleId) {
    this.scaleId = scaleId;
  }


  public ListingPropertyValue scaleName(String scaleName) {
    
    this.scaleName = scaleName;
    return this;
  }

   /**
   * The label used to describe the chosen scale (if any).
   * @return scaleName
  **/
  @javax.annotation.Nullable

  public String getScaleName() {
    return scaleName;
  }


  public void setScaleName(String scaleName) {
    this.scaleName = scaleName;
  }


  public ListingPropertyValue valueIds(List<Long> valueIds) {
    
    this.valueIds = valueIds;
    return this;
  }

  public ListingPropertyValue addValueIdsItem(Long valueIdsItem) {
    if (this.valueIds == null) {
      this.valueIds = new ArrayList<>();
    }
    this.valueIds.add(valueIdsItem);
    return this;
  }

   /**
   * The numeric IDs of the Property values
   * @return valueIds
  **/
  @javax.annotation.Nullable

  public List<Long> getValueIds() {
    return valueIds;
  }


  public void setValueIds(List<Long> valueIds) {
    this.valueIds = valueIds;
  }


  public ListingPropertyValue values(List<String> values) {
    
    this.values = values;
    return this;
  }

  public ListingPropertyValue addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * The Property values
   * @return values
  **/
  @javax.annotation.Nullable

  public List<String> getValues() {
    return values;
  }


  public void setValues(List<String> values) {
    this.values = values;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingPropertyValue listingPropertyValue = (ListingPropertyValue) o;
    return Objects.equals(this.propertyId, listingPropertyValue.propertyId) &&
        Objects.equals(this.propertyName, listingPropertyValue.propertyName) &&
        Objects.equals(this.scaleId, listingPropertyValue.scaleId) &&
        Objects.equals(this.scaleName, listingPropertyValue.scaleName) &&
        Objects.equals(this.valueIds, listingPropertyValue.valueIds) &&
        Objects.equals(this.values, listingPropertyValue.values);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyId, propertyName, scaleId, scaleName, valueIds, values);
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
    sb.append("class ListingPropertyValue {\n");
    sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
    sb.append("    scaleId: ").append(toIndentedString(scaleId)).append("\n");
    sb.append("    scaleName: ").append(toIndentedString(scaleName)).append("\n");
    sb.append("    valueIds: ").append(toIndentedString(valueIds)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("property_name");
    openapiFields.add("scale_id");
    openapiFields.add("scale_name");
    openapiFields.add("value_ids");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListingPropertyValue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListingPropertyValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListingPropertyValue is not found in the empty JSON string", ListingPropertyValue.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListingPropertyValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListingPropertyValue` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("property_name") != null && !jsonObj.get("property_name").isJsonNull()) && !jsonObj.get("property_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `property_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("property_name").toString()));
      }
      if ((jsonObj.get("scale_name") != null && !jsonObj.get("scale_name").isJsonNull()) && !jsonObj.get("scale_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scale_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scale_name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("value_ids") != null && !jsonObj.get("value_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `value_ids` to be an array in the JSON string but got `%s`", jsonObj.get("value_ids").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListingPropertyValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListingPropertyValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListingPropertyValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListingPropertyValue.class));

       return (TypeAdapter<T>) new TypeAdapter<ListingPropertyValue>() {
           @Override
           public void write(JsonWriter out, ListingPropertyValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListingPropertyValue read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListingPropertyValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListingPropertyValue
  * @throws IOException if the JSON string is invalid with respect to ListingPropertyValue
  */
  public static ListingPropertyValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListingPropertyValue.class);
  }

 /**
  * Convert an instance of ListingPropertyValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

