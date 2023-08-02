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
 * A list of available scales.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-02T22:46:35.595209100+02:00[Europe/Berlin]")
public class BuyerTaxonomyNodePropertyScalesInner {
  public static final String SERIALIZED_NAME_SCALE_ID = "scale_id";
  @SerializedName(SERIALIZED_NAME_SCALE_ID)
  private Long scaleId;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public BuyerTaxonomyNodePropertyScalesInner() {
  }

  public BuyerTaxonomyNodePropertyScalesInner scaleId(Long scaleId) {
    
    this.scaleId = scaleId;
    return this;
  }

   /**
   * The unique numeric ID of a scale.
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


  public BuyerTaxonomyNodePropertyScalesInner displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The name string for a scale.
   * @return displayName
  **/
  @javax.annotation.Nullable

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public BuyerTaxonomyNodePropertyScalesInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description string for a scale.
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyerTaxonomyNodePropertyScalesInner buyerTaxonomyNodePropertyScalesInner = (BuyerTaxonomyNodePropertyScalesInner) o;
    return Objects.equals(this.scaleId, buyerTaxonomyNodePropertyScalesInner.scaleId) &&
        Objects.equals(this.displayName, buyerTaxonomyNodePropertyScalesInner.displayName) &&
        Objects.equals(this.description, buyerTaxonomyNodePropertyScalesInner.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scaleId, displayName, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyerTaxonomyNodePropertyScalesInner {\n");
    sb.append("    scaleId: ").append(toIndentedString(scaleId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("scale_id");
    openapiFields.add("display_name");
    openapiFields.add("description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BuyerTaxonomyNodePropertyScalesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BuyerTaxonomyNodePropertyScalesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BuyerTaxonomyNodePropertyScalesInner is not found in the empty JSON string", BuyerTaxonomyNodePropertyScalesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BuyerTaxonomyNodePropertyScalesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BuyerTaxonomyNodePropertyScalesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("display_name") != null && !jsonObj.get("display_name").isJsonNull()) && !jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BuyerTaxonomyNodePropertyScalesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BuyerTaxonomyNodePropertyScalesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BuyerTaxonomyNodePropertyScalesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BuyerTaxonomyNodePropertyScalesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BuyerTaxonomyNodePropertyScalesInner>() {
           @Override
           public void write(JsonWriter out, BuyerTaxonomyNodePropertyScalesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BuyerTaxonomyNodePropertyScalesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BuyerTaxonomyNodePropertyScalesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BuyerTaxonomyNodePropertyScalesInner
  * @throws IOException if the JSON string is invalid with respect to BuyerTaxonomyNodePropertyScalesInner
  */
  public static BuyerTaxonomyNodePropertyScalesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BuyerTaxonomyNodePropertyScalesInner.class);
  }

 /**
  * Convert an instance of BuyerTaxonomyNodePropertyScalesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

