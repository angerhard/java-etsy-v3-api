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
 * Represents a listing-level return policy.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-30T11:53:28.314915500+01:00[Europe/Berlin]")
public class ShopReturnPolicy {
  public static final String SERIALIZED_NAME_RETURN_POLICY_ID = "return_policy_id";
  @SerializedName(SERIALIZED_NAME_RETURN_POLICY_ID)
  private Long returnPolicyId;

  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private Long shopId;

  public static final String SERIALIZED_NAME_ACCEPTS_RETURNS = "accepts_returns";
  @SerializedName(SERIALIZED_NAME_ACCEPTS_RETURNS)
  private Boolean acceptsReturns;

  public static final String SERIALIZED_NAME_ACCEPTS_EXCHANGES = "accepts_exchanges";
  @SerializedName(SERIALIZED_NAME_ACCEPTS_EXCHANGES)
  private Boolean acceptsExchanges;

  public static final String SERIALIZED_NAME_RETURN_DEADLINE = "return_deadline";
  @SerializedName(SERIALIZED_NAME_RETURN_DEADLINE)
  private Long returnDeadline;

  public ShopReturnPolicy() {
  }

  public ShopReturnPolicy returnPolicyId(Long returnPolicyId) {
    
    this.returnPolicyId = returnPolicyId;
    return this;
  }

   /**
   * The numeric ID of the [Return Policy](/documentation/reference#operation/getShopReturnPolicies).
   * minimum: 1
   * @return returnPolicyId
  **/
  @javax.annotation.Nullable

  public Long getReturnPolicyId() {
    return returnPolicyId;
  }


  public void setReturnPolicyId(Long returnPolicyId) {
    this.returnPolicyId = returnPolicyId;
  }


  public ShopReturnPolicy shopId(Long shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * The unique positive non-zero numeric ID for an Etsy Shop.
   * minimum: 1
   * @return shopId
  **/
  @javax.annotation.Nullable

  public Long getShopId() {
    return shopId;
  }


  public void setShopId(Long shopId) {
    this.shopId = shopId;
  }


  public ShopReturnPolicy acceptsReturns(Boolean acceptsReturns) {
    
    this.acceptsReturns = acceptsReturns;
    return this;
  }

   /**
   * return_policy_accepts_returns
   * @return acceptsReturns
  **/
  @javax.annotation.Nullable

  public Boolean getAcceptsReturns() {
    return acceptsReturns;
  }


  public void setAcceptsReturns(Boolean acceptsReturns) {
    this.acceptsReturns = acceptsReturns;
  }


  public ShopReturnPolicy acceptsExchanges(Boolean acceptsExchanges) {
    
    this.acceptsExchanges = acceptsExchanges;
    return this;
  }

   /**
   * return_policy_accepts_exchanges
   * @return acceptsExchanges
  **/
  @javax.annotation.Nullable

  public Boolean getAcceptsExchanges() {
    return acceptsExchanges;
  }


  public void setAcceptsExchanges(Boolean acceptsExchanges) {
    this.acceptsExchanges = acceptsExchanges;
  }


  public ShopReturnPolicy returnDeadline(Long returnDeadline) {
    
    this.returnDeadline = returnDeadline;
    return this;
  }

   /**
   * The deadline for the Return Policy, measured in days. The value must be one of the following: [7, 14, 21, 30, 45, 60, 90].
   * @return returnDeadline
  **/
  @javax.annotation.Nullable

  public Long getReturnDeadline() {
    return returnDeadline;
  }


  public void setReturnDeadline(Long returnDeadline) {
    this.returnDeadline = returnDeadline;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopReturnPolicy shopReturnPolicy = (ShopReturnPolicy) o;
    return Objects.equals(this.returnPolicyId, shopReturnPolicy.returnPolicyId) &&
        Objects.equals(this.shopId, shopReturnPolicy.shopId) &&
        Objects.equals(this.acceptsReturns, shopReturnPolicy.acceptsReturns) &&
        Objects.equals(this.acceptsExchanges, shopReturnPolicy.acceptsExchanges) &&
        Objects.equals(this.returnDeadline, shopReturnPolicy.returnDeadline);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnPolicyId, shopId, acceptsReturns, acceptsExchanges, returnDeadline);
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
    sb.append("class ShopReturnPolicy {\n");
    sb.append("    returnPolicyId: ").append(toIndentedString(returnPolicyId)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    acceptsReturns: ").append(toIndentedString(acceptsReturns)).append("\n");
    sb.append("    acceptsExchanges: ").append(toIndentedString(acceptsExchanges)).append("\n");
    sb.append("    returnDeadline: ").append(toIndentedString(returnDeadline)).append("\n");
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
    openapiFields.add("return_policy_id");
    openapiFields.add("shop_id");
    openapiFields.add("accepts_returns");
    openapiFields.add("accepts_exchanges");
    openapiFields.add("return_deadline");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShopReturnPolicy
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ShopReturnPolicy.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShopReturnPolicy is not found in the empty JSON string", ShopReturnPolicy.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ShopReturnPolicy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShopReturnPolicy` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShopReturnPolicy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShopReturnPolicy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShopReturnPolicy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShopReturnPolicy.class));

       return (TypeAdapter<T>) new TypeAdapter<ShopReturnPolicy>() {
           @Override
           public void write(JsonWriter out, ShopReturnPolicy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShopReturnPolicy read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShopReturnPolicy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShopReturnPolicy
  * @throws IOException if the JSON string is invalid with respect to ShopReturnPolicy
  */
  public static ShopReturnPolicy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShopReturnPolicy.class);
  }

 /**
  * Convert an instance of ShopReturnPolicy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

