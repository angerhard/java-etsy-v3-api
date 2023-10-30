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
 * A list of property value strings automatically and always selected for the given property.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-30T11:53:28.314915500+01:00[Europe/Berlin]")
public class TaxonomyNodePropertySelectedValuesInner {
  public static final String SERIALIZED_NAME_VALUE_ID = "value_id";
  @SerializedName(SERIALIZED_NAME_VALUE_ID)
  private Long valueId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SCALE_ID = "scale_id";
  @SerializedName(SERIALIZED_NAME_SCALE_ID)
  private Long scaleId;

  public static final String SERIALIZED_NAME_EQUAL_TO = "equal_to";
  @SerializedName(SERIALIZED_NAME_EQUAL_TO)
  private List<Long> equalTo = new ArrayList<>();

  public TaxonomyNodePropertySelectedValuesInner() {
  }

  public TaxonomyNodePropertySelectedValuesInner valueId(Long valueId) {
    
    this.valueId = valueId;
    return this;
  }

   /**
   * The numeric ID of this property value.
   * minimum: 1
   * @return valueId
  **/
  @javax.annotation.Nullable

  public Long getValueId() {
    return valueId;
  }


  public void setValueId(Long valueId) {
    this.valueId = valueId;
  }


  public TaxonomyNodePropertySelectedValuesInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name string of this property value.
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TaxonomyNodePropertySelectedValuesInner scaleId(Long scaleId) {
    
    this.scaleId = scaleId;
    return this;
  }

   /**
   * The numeric scale ID of the scale to which this property value belongs.
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


  public TaxonomyNodePropertySelectedValuesInner equalTo(List<Long> equalTo) {
    
    this.equalTo = equalTo;
    return this;
  }

  public TaxonomyNodePropertySelectedValuesInner addEqualToItem(Long equalToItem) {
    if (this.equalTo == null) {
      this.equalTo = new ArrayList<>();
    }
    this.equalTo.add(equalToItem);
    return this;
  }

   /**
   * A list of numeric property value IDs this property value is equal to (if any).
   * @return equalTo
  **/
  @javax.annotation.Nullable

  public List<Long> getEqualTo() {
    return equalTo;
  }


  public void setEqualTo(List<Long> equalTo) {
    this.equalTo = equalTo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxonomyNodePropertySelectedValuesInner taxonomyNodePropertySelectedValuesInner = (TaxonomyNodePropertySelectedValuesInner) o;
    return Objects.equals(this.valueId, taxonomyNodePropertySelectedValuesInner.valueId) &&
        Objects.equals(this.name, taxonomyNodePropertySelectedValuesInner.name) &&
        Objects.equals(this.scaleId, taxonomyNodePropertySelectedValuesInner.scaleId) &&
        Objects.equals(this.equalTo, taxonomyNodePropertySelectedValuesInner.equalTo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(valueId, name, scaleId, equalTo);
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
    sb.append("class TaxonomyNodePropertySelectedValuesInner {\n");
    sb.append("    valueId: ").append(toIndentedString(valueId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scaleId: ").append(toIndentedString(scaleId)).append("\n");
    sb.append("    equalTo: ").append(toIndentedString(equalTo)).append("\n");
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
    openapiFields.add("value_id");
    openapiFields.add("name");
    openapiFields.add("scale_id");
    openapiFields.add("equal_to");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaxonomyNodePropertySelectedValuesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TaxonomyNodePropertySelectedValuesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaxonomyNodePropertySelectedValuesInner is not found in the empty JSON string", TaxonomyNodePropertySelectedValuesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TaxonomyNodePropertySelectedValuesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TaxonomyNodePropertySelectedValuesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("equal_to") != null && !jsonObj.get("equal_to").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `equal_to` to be an array in the JSON string but got `%s`", jsonObj.get("equal_to").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaxonomyNodePropertySelectedValuesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaxonomyNodePropertySelectedValuesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaxonomyNodePropertySelectedValuesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaxonomyNodePropertySelectedValuesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TaxonomyNodePropertySelectedValuesInner>() {
           @Override
           public void write(JsonWriter out, TaxonomyNodePropertySelectedValuesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TaxonomyNodePropertySelectedValuesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TaxonomyNodePropertySelectedValuesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaxonomyNodePropertySelectedValuesInner
  * @throws IOException if the JSON string is invalid with respect to TaxonomyNodePropertySelectedValuesInner
  */
  public static TaxonomyNodePropertySelectedValuesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaxonomyNodePropertySelectedValuesInner.class);
  }

 /**
  * Convert an instance of TaxonomyNodePropertySelectedValuesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

