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
import org.openapitools.jackson.nullable.JsonNullable;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/**
 * A payemnt adjustment line item for a payment adjustment.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-02T22:46:35.595209100+02:00[Europe/Berlin]")
public class PaymentAdjustmentItem {
  public static final String SERIALIZED_NAME_PAYMENT_ADJUSTMENT_ID = "payment_adjustment_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ADJUSTMENT_ID)
  private Long paymentAdjustmentId;

  public static final String SERIALIZED_NAME_PAYMENT_ADJUSTMENT_ITEM_ID = "payment_adjustment_item_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ADJUSTMENT_ITEM_ID)
  private Long paymentAdjustmentItemId;

  public static final String SERIALIZED_NAME_ADJUSTMENT_TYPE = "adjustment_type";
  @SerializedName(SERIALIZED_NAME_ADJUSTMENT_TYPE)
  private String adjustmentType;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount = 0L;

  public static final String SERIALIZED_NAME_SHOP_AMOUNT = "shop_amount";
  @SerializedName(SERIALIZED_NAME_SHOP_AMOUNT)
  private Long shopAmount = 0L;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transaction_id";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private Long transactionId;

  public static final String SERIALIZED_NAME_BILL_PAYMENT_ID = "bill_payment_id";
  @SerializedName(SERIALIZED_NAME_BILL_PAYMENT_ID)
  private Long billPaymentId;

  public static final String SERIALIZED_NAME_CREATED_TIMESTAMP = "created_timestamp";
  @SerializedName(SERIALIZED_NAME_CREATED_TIMESTAMP)
  private Long createdTimestamp;

  public static final String SERIALIZED_NAME_UPDATED_TIMESTAMP = "updated_timestamp";
  @SerializedName(SERIALIZED_NAME_UPDATED_TIMESTAMP)
  private Long updatedTimestamp;

  public PaymentAdjustmentItem() {
  }

  public PaymentAdjustmentItem paymentAdjustmentId(Long paymentAdjustmentId) {
    
    this.paymentAdjustmentId = paymentAdjustmentId;
    return this;
  }

   /**
   * The numeric ID for a payment adjustment.
   * minimum: 1
   * @return paymentAdjustmentId
  **/
  @javax.annotation.Nullable

  public Long getPaymentAdjustmentId() {
    return paymentAdjustmentId;
  }


  public void setPaymentAdjustmentId(Long paymentAdjustmentId) {
    this.paymentAdjustmentId = paymentAdjustmentId;
  }


  public PaymentAdjustmentItem paymentAdjustmentItemId(Long paymentAdjustmentItemId) {
    
    this.paymentAdjustmentItemId = paymentAdjustmentItemId;
    return this;
  }

   /**
   * Unique ID for the adjustment line item.
   * minimum: 1
   * @return paymentAdjustmentItemId
  **/
  @javax.annotation.Nullable

  public Long getPaymentAdjustmentItemId() {
    return paymentAdjustmentItemId;
  }


  public void setPaymentAdjustmentItemId(Long paymentAdjustmentItemId) {
    this.paymentAdjustmentItemId = paymentAdjustmentItemId;
  }


  public PaymentAdjustmentItem adjustmentType(String adjustmentType) {
    
    this.adjustmentType = adjustmentType;
    return this;
  }

   /**
   * String indicating the type of adjustment for this line item.
   * @return adjustmentType
  **/
  @javax.annotation.Nullable

  public String getAdjustmentType() {
    return adjustmentType;
  }


  public void setAdjustmentType(String adjustmentType) {
    this.adjustmentType = adjustmentType;
  }


  public PaymentAdjustmentItem amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Integer value for the amount of the adjustment in original currency.
   * @return amount
  **/
  @javax.annotation.Nullable

  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public PaymentAdjustmentItem shopAmount(Long shopAmount) {
    
    this.shopAmount = shopAmount;
    return this;
  }

   /**
   * Integer value for the amount of the adjustment in currency for the shop.
   * @return shopAmount
  **/
  @javax.annotation.Nullable

  public Long getShopAmount() {
    return shopAmount;
  }


  public void setShopAmount(Long shopAmount) {
    this.shopAmount = shopAmount;
  }


  public PaymentAdjustmentItem transactionId(Long transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The unique numeric ID for a transaction.
   * minimum: 1
   * @return transactionId
  **/
  @javax.annotation.Nullable

  public Long getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }


  public PaymentAdjustmentItem billPaymentId(Long billPaymentId) {
    
    this.billPaymentId = billPaymentId;
    return this;
  }

   /**
   * Unique ID for the bill payment adjustment.
   * minimum: 1
   * @return billPaymentId
  **/
  @javax.annotation.Nullable

  public Long getBillPaymentId() {
    return billPaymentId;
  }


  public void setBillPaymentId(Long billPaymentId) {
    this.billPaymentId = billPaymentId;
  }


  public PaymentAdjustmentItem createdTimestamp(Long createdTimestamp) {
    
    this.createdTimestamp = createdTimestamp;
    return this;
  }

   /**
   * The transaction\\&#39;s creation date and time, in epoch seconds.
   * minimum: 946684800
   * @return createdTimestamp
  **/
  @javax.annotation.Nullable

  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }


  public void setCreatedTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }


  public PaymentAdjustmentItem updatedTimestamp(Long updatedTimestamp) {
    
    this.updatedTimestamp = updatedTimestamp;
    return this;
  }

   /**
   * The update date and time the payment adjustment in epoch seconds.
   * minimum: 946684800
   * @return updatedTimestamp
  **/
  @javax.annotation.Nullable

  public Long getUpdatedTimestamp() {
    return updatedTimestamp;
  }


  public void setUpdatedTimestamp(Long updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAdjustmentItem paymentAdjustmentItem = (PaymentAdjustmentItem) o;
    return Objects.equals(this.paymentAdjustmentId, paymentAdjustmentItem.paymentAdjustmentId) &&
        Objects.equals(this.paymentAdjustmentItemId, paymentAdjustmentItem.paymentAdjustmentItemId) &&
        Objects.equals(this.adjustmentType, paymentAdjustmentItem.adjustmentType) &&
        Objects.equals(this.amount, paymentAdjustmentItem.amount) &&
        Objects.equals(this.shopAmount, paymentAdjustmentItem.shopAmount) &&
        Objects.equals(this.transactionId, paymentAdjustmentItem.transactionId) &&
        Objects.equals(this.billPaymentId, paymentAdjustmentItem.billPaymentId) &&
        Objects.equals(this.createdTimestamp, paymentAdjustmentItem.createdTimestamp) &&
        Objects.equals(this.updatedTimestamp, paymentAdjustmentItem.updatedTimestamp);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentAdjustmentId, paymentAdjustmentItemId, adjustmentType, amount, shopAmount, transactionId, billPaymentId, createdTimestamp, updatedTimestamp);
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
    sb.append("class PaymentAdjustmentItem {\n");
    sb.append("    paymentAdjustmentId: ").append(toIndentedString(paymentAdjustmentId)).append("\n");
    sb.append("    paymentAdjustmentItemId: ").append(toIndentedString(paymentAdjustmentItemId)).append("\n");
    sb.append("    adjustmentType: ").append(toIndentedString(adjustmentType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    shopAmount: ").append(toIndentedString(shopAmount)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    billPaymentId: ").append(toIndentedString(billPaymentId)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    updatedTimestamp: ").append(toIndentedString(updatedTimestamp)).append("\n");
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
    openapiFields.add("payment_adjustment_id");
    openapiFields.add("payment_adjustment_item_id");
    openapiFields.add("adjustment_type");
    openapiFields.add("amount");
    openapiFields.add("shop_amount");
    openapiFields.add("transaction_id");
    openapiFields.add("bill_payment_id");
    openapiFields.add("created_timestamp");
    openapiFields.add("updated_timestamp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentAdjustmentItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaymentAdjustmentItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentAdjustmentItem is not found in the empty JSON string", PaymentAdjustmentItem.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentAdjustmentItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentAdjustmentItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("adjustment_type") != null && !jsonObj.get("adjustment_type").isJsonNull()) && !jsonObj.get("adjustment_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adjustment_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adjustment_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentAdjustmentItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentAdjustmentItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentAdjustmentItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentAdjustmentItem.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentAdjustmentItem>() {
           @Override
           public void write(JsonWriter out, PaymentAdjustmentItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentAdjustmentItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentAdjustmentItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentAdjustmentItem
  * @throws IOException if the JSON string is invalid with respect to PaymentAdjustmentItem
  */
  public static PaymentAdjustmentItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentAdjustmentItem.class);
  }

 /**
  * Convert an instance of PaymentAdjustmentItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

