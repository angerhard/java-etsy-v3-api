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
 * The numeric price of gift wrap for this receipt.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-02T22:46:35.595209100+02:00[Europe/Berlin]")
public class ShopReceiptGiftWrapPrice {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  public static final String SERIALIZED_NAME_DIVISOR = "divisor";
  @SerializedName(SERIALIZED_NAME_DIVISOR)
  private Long divisor;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public ShopReceiptGiftWrapPrice() {
  }

  public ShopReceiptGiftWrapPrice amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of represented by this data.
   * @return amount
  **/
  @javax.annotation.Nullable

  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public ShopReceiptGiftWrapPrice divisor(Long divisor) {
    
    this.divisor = divisor;
    return this;
  }

   /**
   * The divisor to render the amount.
   * minimum: 0
   * @return divisor
  **/
  @javax.annotation.Nullable

  public Long getDivisor() {
    return divisor;
  }


  public void setDivisor(Long divisor) {
    this.divisor = divisor;
  }


  public ShopReceiptGiftWrapPrice currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The ISO currency code for this data.
   * @return currencyCode
  **/
  @javax.annotation.Nullable

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopReceiptGiftWrapPrice shopReceiptGiftWrapPrice = (ShopReceiptGiftWrapPrice) o;
    return Objects.equals(this.amount, shopReceiptGiftWrapPrice.amount) &&
        Objects.equals(this.divisor, shopReceiptGiftWrapPrice.divisor) &&
        Objects.equals(this.currencyCode, shopReceiptGiftWrapPrice.currencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, divisor, currencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopReceiptGiftWrapPrice {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    divisor: ").append(toIndentedString(divisor)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("divisor");
    openapiFields.add("currency_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShopReceiptGiftWrapPrice
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ShopReceiptGiftWrapPrice.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShopReceiptGiftWrapPrice is not found in the empty JSON string", ShopReceiptGiftWrapPrice.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ShopReceiptGiftWrapPrice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShopReceiptGiftWrapPrice` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("currency_code") != null && !jsonObj.get("currency_code").isJsonNull()) && !jsonObj.get("currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShopReceiptGiftWrapPrice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShopReceiptGiftWrapPrice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShopReceiptGiftWrapPrice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShopReceiptGiftWrapPrice.class));

       return (TypeAdapter<T>) new TypeAdapter<ShopReceiptGiftWrapPrice>() {
           @Override
           public void write(JsonWriter out, ShopReceiptGiftWrapPrice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShopReceiptGiftWrapPrice read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShopReceiptGiftWrapPrice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShopReceiptGiftWrapPrice
  * @throws IOException if the JSON string is invalid with respect to ShopReceiptGiftWrapPrice
  */
  public static ShopReceiptGiftWrapPrice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShopReceiptGiftWrapPrice.class);
  }

 /**
  * Convert an instance of ShopReceiptGiftWrapPrice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

