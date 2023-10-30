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
 * A shipping carrier&#39;s mail class, which is used to calculate an Estimated Delivery Date.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-30T11:53:28.314915500+01:00[Europe/Berlin]")
public class ShippingCarrierMailClass {
  public static final String SERIALIZED_NAME_MAIL_CLASS_KEY = "mail_class_key";
  @SerializedName(SERIALIZED_NAME_MAIL_CLASS_KEY)
  private String mailClassKey;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public ShippingCarrierMailClass() {
  }

  public ShippingCarrierMailClass mailClassKey(String mailClassKey) {
    
    this.mailClassKey = mailClassKey;
    return this;
  }

   /**
   * The unique identifier of this mail class.
   * @return mailClassKey
  **/
  @javax.annotation.Nullable

  public String getMailClassKey() {
    return mailClassKey;
  }


  public void setMailClassKey(String mailClassKey) {
    this.mailClassKey = mailClassKey;
  }


  public ShippingCarrierMailClass name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of this mail class.
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingCarrierMailClass shippingCarrierMailClass = (ShippingCarrierMailClass) o;
    return Objects.equals(this.mailClassKey, shippingCarrierMailClass.mailClassKey) &&
        Objects.equals(this.name, shippingCarrierMailClass.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mailClassKey, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingCarrierMailClass {\n");
    sb.append("    mailClassKey: ").append(toIndentedString(mailClassKey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("mail_class_key");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShippingCarrierMailClass
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ShippingCarrierMailClass.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShippingCarrierMailClass is not found in the empty JSON string", ShippingCarrierMailClass.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ShippingCarrierMailClass.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShippingCarrierMailClass` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("mail_class_key") != null && !jsonObj.get("mail_class_key").isJsonNull()) && !jsonObj.get("mail_class_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mail_class_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mail_class_key").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShippingCarrierMailClass.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShippingCarrierMailClass' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShippingCarrierMailClass> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShippingCarrierMailClass.class));

       return (TypeAdapter<T>) new TypeAdapter<ShippingCarrierMailClass>() {
           @Override
           public void write(JsonWriter out, ShippingCarrierMailClass value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShippingCarrierMailClass read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShippingCarrierMailClass given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShippingCarrierMailClass
  * @throws IOException if the JSON string is invalid with respect to ShippingCarrierMailClass
  */
  public static ShippingCarrierMailClass fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShippingCarrierMailClass.class);
  }

 /**
  * Convert an instance of ShippingCarrierMailClass to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

