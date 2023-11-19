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
import java.util.*;
import java.util.Map.Entry;

/**
 * Represents a payment made with Etsy Payments. All monetary amounts are in USD pennies unless otherwise specified.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-19T12:04:22.379753700+01:00[Europe/Berlin]")
public class Payment {
  public static final String SERIALIZED_NAME_PAYMENT_ID = "payment_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ID)
  private Long paymentId;

  public static final String SERIALIZED_NAME_BUYER_USER_ID = "buyer_user_id";
  @SerializedName(SERIALIZED_NAME_BUYER_USER_ID)
  private Long buyerUserId;

  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private Long shopId;

  public static final String SERIALIZED_NAME_RECEIPT_ID = "receipt_id";
  @SerializedName(SERIALIZED_NAME_RECEIPT_ID)
  private Long receiptId;

  public static final String SERIALIZED_NAME_AMOUNT_GROSS = "amount_gross";
  @SerializedName(SERIALIZED_NAME_AMOUNT_GROSS)
  private PaymentAmountGross amountGross;

  public static final String SERIALIZED_NAME_AMOUNT_FEES = "amount_fees";
  @SerializedName(SERIALIZED_NAME_AMOUNT_FEES)
  private PaymentAmountFees amountFees;

  public static final String SERIALIZED_NAME_AMOUNT_NET = "amount_net";
  @SerializedName(SERIALIZED_NAME_AMOUNT_NET)
  private PaymentAmountNet amountNet;

  public static final String SERIALIZED_NAME_POSTED_GROSS = "posted_gross";
  @SerializedName(SERIALIZED_NAME_POSTED_GROSS)
  private PaymentPostedGross postedGross;

  public static final String SERIALIZED_NAME_POSTED_FEES = "posted_fees";
  @SerializedName(SERIALIZED_NAME_POSTED_FEES)
  private PaymentPostedFees postedFees;

  public static final String SERIALIZED_NAME_POSTED_NET = "posted_net";
  @SerializedName(SERIALIZED_NAME_POSTED_NET)
  private PaymentPostedNet postedNet;

  public static final String SERIALIZED_NAME_ADJUSTED_GROSS = "adjusted_gross";
  @SerializedName(SERIALIZED_NAME_ADJUSTED_GROSS)
  private PaymentAdjustedGross adjustedGross;

  public static final String SERIALIZED_NAME_ADJUSTED_FEES = "adjusted_fees";
  @SerializedName(SERIALIZED_NAME_ADJUSTED_FEES)
  private PaymentAdjustedFees adjustedFees;

  public static final String SERIALIZED_NAME_ADJUSTED_NET = "adjusted_net";
  @SerializedName(SERIALIZED_NAME_ADJUSTED_NET)
  private PaymentAdjustedNet adjustedNet;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_SHOP_CURRENCY = "shop_currency";
  @SerializedName(SERIALIZED_NAME_SHOP_CURRENCY)
  private String shopCurrency;

  public static final String SERIALIZED_NAME_BUYER_CURRENCY = "buyer_currency";
  @SerializedName(SERIALIZED_NAME_BUYER_CURRENCY)
  private String buyerCurrency;

  public static final String SERIALIZED_NAME_SHIPPING_USER_ID = "shipping_user_id";
  @SerializedName(SERIALIZED_NAME_SHIPPING_USER_ID)
  private Long shippingUserId;

  public static final String SERIALIZED_NAME_SHIPPING_ADDRESS_ID = "shipping_address_id";
  @SerializedName(SERIALIZED_NAME_SHIPPING_ADDRESS_ID)
  private Long shippingAddressId;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS_ID = "billing_address_id";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS_ID)
  private Long billingAddressId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SHIPPED_TIMESTAMP = "shipped_timestamp";
  @SerializedName(SERIALIZED_NAME_SHIPPED_TIMESTAMP)
  private Long shippedTimestamp;

  public static final String SERIALIZED_NAME_CREATE_TIMESTAMP = "create_timestamp";
  @SerializedName(SERIALIZED_NAME_CREATE_TIMESTAMP)
  private Long createTimestamp;

  public static final String SERIALIZED_NAME_CREATED_TIMESTAMP = "created_timestamp";
  @SerializedName(SERIALIZED_NAME_CREATED_TIMESTAMP)
  private Long createdTimestamp;

  public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP = "update_timestamp";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP)
  private Long updateTimestamp;

  public static final String SERIALIZED_NAME_UPDATED_TIMESTAMP = "updated_timestamp";
  @SerializedName(SERIALIZED_NAME_UPDATED_TIMESTAMP)
  private Long updatedTimestamp;

  public static final String SERIALIZED_NAME_PAYMENT_ADJUSTMENTS = "payment_adjustments";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ADJUSTMENTS)
  private List<PaymentAccountLedgerEntryPaymentAdjustmentsInner> paymentAdjustments = new ArrayList<>();

  public Payment() {
  }

  public Payment paymentId(Long paymentId) {
    
    this.paymentId = paymentId;
    return this;
  }

   /**
   * A unique numeric ID for a payment to a specific Etsy [shop](/documentation/reference#tag/Shop).
   * minimum: 1
   * @return paymentId
  **/
  @javax.annotation.Nullable

  public Long getPaymentId() {
    return paymentId;
  }


  public void setPaymentId(Long paymentId) {
    this.paymentId = paymentId;
  }


  public Payment buyerUserId(Long buyerUserId) {
    
    this.buyerUserId = buyerUserId;
    return this;
  }

   /**
   * The numeric ID for the [user](/documentation/reference#tag/User) who paid the purchase.
   * minimum: 1
   * @return buyerUserId
  **/
  @javax.annotation.Nullable

  public Long getBuyerUserId() {
    return buyerUserId;
  }


  public void setBuyerUserId(Long buyerUserId) {
    this.buyerUserId = buyerUserId;
  }


  public Payment shopId(Long shopId) {
    
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


  public Payment receiptId(Long receiptId) {
    
    this.receiptId = receiptId;
    return this;
  }

   /**
   * The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction.
   * minimum: 1
   * @return receiptId
  **/
  @javax.annotation.Nullable

  public Long getReceiptId() {
    return receiptId;
  }


  public void setReceiptId(Long receiptId) {
    this.receiptId = receiptId;
  }


  public Payment amountGross(PaymentAmountGross amountGross) {
    
    this.amountGross = amountGross;
    return this;
  }

   /**
   * Get amountGross
   * @return amountGross
  **/
  @javax.annotation.Nullable

  public PaymentAmountGross getAmountGross() {
    return amountGross;
  }


  public void setAmountGross(PaymentAmountGross amountGross) {
    this.amountGross = amountGross;
  }


  public Payment amountFees(PaymentAmountFees amountFees) {
    
    this.amountFees = amountFees;
    return this;
  }

   /**
   * Get amountFees
   * @return amountFees
  **/
  @javax.annotation.Nullable

  public PaymentAmountFees getAmountFees() {
    return amountFees;
  }


  public void setAmountFees(PaymentAmountFees amountFees) {
    this.amountFees = amountFees;
  }


  public Payment amountNet(PaymentAmountNet amountNet) {
    
    this.amountNet = amountNet;
    return this;
  }

   /**
   * Get amountNet
   * @return amountNet
  **/
  @javax.annotation.Nullable

  public PaymentAmountNet getAmountNet() {
    return amountNet;
  }


  public void setAmountNet(PaymentAmountNet amountNet) {
    this.amountNet = amountNet;
  }


  public Payment postedGross(PaymentPostedGross postedGross) {
    
    this.postedGross = postedGross;
    return this;
  }

   /**
   * Get postedGross
   * @return postedGross
  **/
  @javax.annotation.Nullable

  public PaymentPostedGross getPostedGross() {
    return postedGross;
  }


  public void setPostedGross(PaymentPostedGross postedGross) {
    this.postedGross = postedGross;
  }


  public Payment postedFees(PaymentPostedFees postedFees) {
    
    this.postedFees = postedFees;
    return this;
  }

   /**
   * Get postedFees
   * @return postedFees
  **/
  @javax.annotation.Nullable

  public PaymentPostedFees getPostedFees() {
    return postedFees;
  }


  public void setPostedFees(PaymentPostedFees postedFees) {
    this.postedFees = postedFees;
  }


  public Payment postedNet(PaymentPostedNet postedNet) {
    
    this.postedNet = postedNet;
    return this;
  }

   /**
   * Get postedNet
   * @return postedNet
  **/
  @javax.annotation.Nullable

  public PaymentPostedNet getPostedNet() {
    return postedNet;
  }


  public void setPostedNet(PaymentPostedNet postedNet) {
    this.postedNet = postedNet;
  }


  public Payment adjustedGross(PaymentAdjustedGross adjustedGross) {
    
    this.adjustedGross = adjustedGross;
    return this;
  }

   /**
   * Get adjustedGross
   * @return adjustedGross
  **/
  @javax.annotation.Nullable

  public PaymentAdjustedGross getAdjustedGross() {
    return adjustedGross;
  }


  public void setAdjustedGross(PaymentAdjustedGross adjustedGross) {
    this.adjustedGross = adjustedGross;
  }


  public Payment adjustedFees(PaymentAdjustedFees adjustedFees) {
    
    this.adjustedFees = adjustedFees;
    return this;
  }

   /**
   * Get adjustedFees
   * @return adjustedFees
  **/
  @javax.annotation.Nullable

  public PaymentAdjustedFees getAdjustedFees() {
    return adjustedFees;
  }


  public void setAdjustedFees(PaymentAdjustedFees adjustedFees) {
    this.adjustedFees = adjustedFees;
  }


  public Payment adjustedNet(PaymentAdjustedNet adjustedNet) {
    
    this.adjustedNet = adjustedNet;
    return this;
  }

   /**
   * Get adjustedNet
   * @return adjustedNet
  **/
  @javax.annotation.Nullable

  public PaymentAdjustedNet getAdjustedNet() {
    return adjustedNet;
  }


  public void setAdjustedNet(PaymentAdjustedNet adjustedNet) {
    this.adjustedNet = adjustedNet;
  }


  public Payment currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The ISO (alphabetic) code string for the payment&#39;s currency.
   * @return currency
  **/
  @javax.annotation.Nullable

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public Payment shopCurrency(String shopCurrency) {
    
    this.shopCurrency = shopCurrency;
    return this;
  }

   /**
   * The ISO (alphabetic) code for the shop&#39;s currency. The shop displays all prices in this currency by default.
   * @return shopCurrency
  **/
  @javax.annotation.Nullable

  public String getShopCurrency() {
    return shopCurrency;
  }


  public void setShopCurrency(String shopCurrency) {
    this.shopCurrency = shopCurrency;
  }


  public Payment buyerCurrency(String buyerCurrency) {
    
    this.buyerCurrency = buyerCurrency;
    return this;
  }

   /**
   * The currency string of the buyer.
   * @return buyerCurrency
  **/
  @javax.annotation.Nullable

  public String getBuyerCurrency() {
    return buyerCurrency;
  }


  public void setBuyerCurrency(String buyerCurrency) {
    this.buyerCurrency = buyerCurrency;
  }


  public Payment shippingUserId(Long shippingUserId) {
    
    this.shippingUserId = shippingUserId;
    return this;
  }

   /**
   * The numeric ID of the user to which the seller ships the order.
   * minimum: 1
   * @return shippingUserId
  **/
  @javax.annotation.Nullable

  public Long getShippingUserId() {
    return shippingUserId;
  }


  public void setShippingUserId(Long shippingUserId) {
    this.shippingUserId = shippingUserId;
  }


  public Payment shippingAddressId(Long shippingAddressId) {
    
    this.shippingAddressId = shippingAddressId;
    return this;
  }

   /**
   * The numeric id identifying the shipping address.
   * minimum: 1
   * @return shippingAddressId
  **/
  @javax.annotation.Nullable

  public Long getShippingAddressId() {
    return shippingAddressId;
  }


  public void setShippingAddressId(Long shippingAddressId) {
    this.shippingAddressId = shippingAddressId;
  }


  public Payment billingAddressId(Long billingAddressId) {
    
    this.billingAddressId = billingAddressId;
    return this;
  }

   /**
   * The numeric ID identifying the billing address of the buyer.
   * minimum: 0
   * maximum: 9223372036854775807
   * @return billingAddressId
  **/
  @javax.annotation.Nullable

  public Long getBillingAddressId() {
    return billingAddressId;
  }


  public void setBillingAddressId(Long billingAddressId) {
    this.billingAddressId = billingAddressId;
  }


  public Payment status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * A string indicating the current status of the payment, most commonly \&quot;settled\&quot; or \&quot;authed\&quot;.
   * @return status
  **/
  @javax.annotation.Nullable

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public Payment shippedTimestamp(Long shippedTimestamp) {
    
    this.shippedTimestamp = shippedTimestamp;
    return this;
  }

   /**
   * The transaction\\&#39;s shipping date and time, in epoch seconds.
   * minimum: 946684800
   * @return shippedTimestamp
  **/
  @javax.annotation.Nullable

  public Long getShippedTimestamp() {
    return shippedTimestamp;
  }


  public void setShippedTimestamp(Long shippedTimestamp) {
    this.shippedTimestamp = shippedTimestamp;
  }


  public Payment createTimestamp(Long createTimestamp) {
    
    this.createTimestamp = createTimestamp;
    return this;
  }

   /**
   * The transaction\\&#39;s creation date and time, in epoch seconds.
   * minimum: 946684800
   * @return createTimestamp
  **/
  @javax.annotation.Nullable

  public Long getCreateTimestamp() {
    return createTimestamp;
  }


  public void setCreateTimestamp(Long createTimestamp) {
    this.createTimestamp = createTimestamp;
  }


  public Payment createdTimestamp(Long createdTimestamp) {
    
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


  public Payment updateTimestamp(Long updateTimestamp) {
    
    this.updateTimestamp = updateTimestamp;
    return this;
  }

   /**
   * The date and time of the last change to the payment adjustment in epoch seconds.
   * minimum: 946684800
   * @return updateTimestamp
  **/
  @javax.annotation.Nullable

  public Long getUpdateTimestamp() {
    return updateTimestamp;
  }


  public void setUpdateTimestamp(Long updateTimestamp) {
    this.updateTimestamp = updateTimestamp;
  }


  public Payment updatedTimestamp(Long updatedTimestamp) {
    
    this.updatedTimestamp = updatedTimestamp;
    return this;
  }

   /**
   * The date and time of the last change to the payment adjustment in epoch seconds.
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


  public Payment paymentAdjustments(List<PaymentAccountLedgerEntryPaymentAdjustmentsInner> paymentAdjustments) {
    
    this.paymentAdjustments = paymentAdjustments;
    return this;
  }

  public Payment addPaymentAdjustmentsItem(PaymentAccountLedgerEntryPaymentAdjustmentsInner paymentAdjustmentsItem) {
    if (this.paymentAdjustments == null) {
      this.paymentAdjustments = new ArrayList<>();
    }
    this.paymentAdjustments.add(paymentAdjustmentsItem);
    return this;
  }

   /**
   * List of refund objects on an Etsy Payments transaction. All monetary amounts are in USD pennies unless otherwise specified.
   * @return paymentAdjustments
  **/
  @javax.annotation.Nullable

  public List<PaymentAccountLedgerEntryPaymentAdjustmentsInner> getPaymentAdjustments() {
    return paymentAdjustments;
  }


  public void setPaymentAdjustments(List<PaymentAccountLedgerEntryPaymentAdjustmentsInner> paymentAdjustments) {
    this.paymentAdjustments = paymentAdjustments;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(this.paymentId, payment.paymentId) &&
        Objects.equals(this.buyerUserId, payment.buyerUserId) &&
        Objects.equals(this.shopId, payment.shopId) &&
        Objects.equals(this.receiptId, payment.receiptId) &&
        Objects.equals(this.amountGross, payment.amountGross) &&
        Objects.equals(this.amountFees, payment.amountFees) &&
        Objects.equals(this.amountNet, payment.amountNet) &&
        Objects.equals(this.postedGross, payment.postedGross) &&
        Objects.equals(this.postedFees, payment.postedFees) &&
        Objects.equals(this.postedNet, payment.postedNet) &&
        Objects.equals(this.adjustedGross, payment.adjustedGross) &&
        Objects.equals(this.adjustedFees, payment.adjustedFees) &&
        Objects.equals(this.adjustedNet, payment.adjustedNet) &&
        Objects.equals(this.currency, payment.currency) &&
        Objects.equals(this.shopCurrency, payment.shopCurrency) &&
        Objects.equals(this.buyerCurrency, payment.buyerCurrency) &&
        Objects.equals(this.shippingUserId, payment.shippingUserId) &&
        Objects.equals(this.shippingAddressId, payment.shippingAddressId) &&
        Objects.equals(this.billingAddressId, payment.billingAddressId) &&
        Objects.equals(this.status, payment.status) &&
        Objects.equals(this.shippedTimestamp, payment.shippedTimestamp) &&
        Objects.equals(this.createTimestamp, payment.createTimestamp) &&
        Objects.equals(this.createdTimestamp, payment.createdTimestamp) &&
        Objects.equals(this.updateTimestamp, payment.updateTimestamp) &&
        Objects.equals(this.updatedTimestamp, payment.updatedTimestamp) &&
        Objects.equals(this.paymentAdjustments, payment.paymentAdjustments);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, buyerUserId, shopId, receiptId, amountGross, amountFees, amountNet, postedGross, postedFees, postedNet, adjustedGross, adjustedFees, adjustedNet, currency, shopCurrency, buyerCurrency, shippingUserId, shippingAddressId, billingAddressId, status, shippedTimestamp, createTimestamp, createdTimestamp, updateTimestamp, updatedTimestamp, paymentAdjustments);
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
    sb.append("class Payment {\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    buyerUserId: ").append(toIndentedString(buyerUserId)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    receiptId: ").append(toIndentedString(receiptId)).append("\n");
    sb.append("    amountGross: ").append(toIndentedString(amountGross)).append("\n");
    sb.append("    amountFees: ").append(toIndentedString(amountFees)).append("\n");
    sb.append("    amountNet: ").append(toIndentedString(amountNet)).append("\n");
    sb.append("    postedGross: ").append(toIndentedString(postedGross)).append("\n");
    sb.append("    postedFees: ").append(toIndentedString(postedFees)).append("\n");
    sb.append("    postedNet: ").append(toIndentedString(postedNet)).append("\n");
    sb.append("    adjustedGross: ").append(toIndentedString(adjustedGross)).append("\n");
    sb.append("    adjustedFees: ").append(toIndentedString(adjustedFees)).append("\n");
    sb.append("    adjustedNet: ").append(toIndentedString(adjustedNet)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    shopCurrency: ").append(toIndentedString(shopCurrency)).append("\n");
    sb.append("    buyerCurrency: ").append(toIndentedString(buyerCurrency)).append("\n");
    sb.append("    shippingUserId: ").append(toIndentedString(shippingUserId)).append("\n");
    sb.append("    shippingAddressId: ").append(toIndentedString(shippingAddressId)).append("\n");
    sb.append("    billingAddressId: ").append(toIndentedString(billingAddressId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    shippedTimestamp: ").append(toIndentedString(shippedTimestamp)).append("\n");
    sb.append("    createTimestamp: ").append(toIndentedString(createTimestamp)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    updateTimestamp: ").append(toIndentedString(updateTimestamp)).append("\n");
    sb.append("    updatedTimestamp: ").append(toIndentedString(updatedTimestamp)).append("\n");
    sb.append("    paymentAdjustments: ").append(toIndentedString(paymentAdjustments)).append("\n");
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
    openapiFields.add("payment_id");
    openapiFields.add("buyer_user_id");
    openapiFields.add("shop_id");
    openapiFields.add("receipt_id");
    openapiFields.add("amount_gross");
    openapiFields.add("amount_fees");
    openapiFields.add("amount_net");
    openapiFields.add("posted_gross");
    openapiFields.add("posted_fees");
    openapiFields.add("posted_net");
    openapiFields.add("adjusted_gross");
    openapiFields.add("adjusted_fees");
    openapiFields.add("adjusted_net");
    openapiFields.add("currency");
    openapiFields.add("shop_currency");
    openapiFields.add("buyer_currency");
    openapiFields.add("shipping_user_id");
    openapiFields.add("shipping_address_id");
    openapiFields.add("billing_address_id");
    openapiFields.add("status");
    openapiFields.add("shipped_timestamp");
    openapiFields.add("create_timestamp");
    openapiFields.add("created_timestamp");
    openapiFields.add("update_timestamp");
    openapiFields.add("updated_timestamp");
    openapiFields.add("payment_adjustments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Payment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Payment.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Payment is not found in the empty JSON string", Payment.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Payment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Payment` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `amount_gross`
      if (jsonObj.get("amount_gross") != null && !jsonObj.get("amount_gross").isJsonNull()) {
        PaymentAmountGross.validateJsonObject(jsonObj.getAsJsonObject("amount_gross"));
      }
      // validate the optional field `amount_fees`
      if (jsonObj.get("amount_fees") != null && !jsonObj.get("amount_fees").isJsonNull()) {
        PaymentAmountFees.validateJsonObject(jsonObj.getAsJsonObject("amount_fees"));
      }
      // validate the optional field `amount_net`
      if (jsonObj.get("amount_net") != null && !jsonObj.get("amount_net").isJsonNull()) {
        PaymentAmountNet.validateJsonObject(jsonObj.getAsJsonObject("amount_net"));
      }
      // validate the optional field `posted_gross`
      if (jsonObj.get("posted_gross") != null && !jsonObj.get("posted_gross").isJsonNull()) {
        PaymentPostedGross.validateJsonObject(jsonObj.getAsJsonObject("posted_gross"));
      }
      // validate the optional field `posted_fees`
      if (jsonObj.get("posted_fees") != null && !jsonObj.get("posted_fees").isJsonNull()) {
        PaymentPostedFees.validateJsonObject(jsonObj.getAsJsonObject("posted_fees"));
      }
      // validate the optional field `posted_net`
      if (jsonObj.get("posted_net") != null && !jsonObj.get("posted_net").isJsonNull()) {
        PaymentPostedNet.validateJsonObject(jsonObj.getAsJsonObject("posted_net"));
      }
      // validate the optional field `adjusted_gross`
      if (jsonObj.get("adjusted_gross") != null && !jsonObj.get("adjusted_gross").isJsonNull()) {
        PaymentAdjustedGross.validateJsonObject(jsonObj.getAsJsonObject("adjusted_gross"));
      }
      // validate the optional field `adjusted_fees`
      if (jsonObj.get("adjusted_fees") != null && !jsonObj.get("adjusted_fees").isJsonNull()) {
        PaymentAdjustedFees.validateJsonObject(jsonObj.getAsJsonObject("adjusted_fees"));
      }
      // validate the optional field `adjusted_net`
      if (jsonObj.get("adjusted_net") != null && !jsonObj.get("adjusted_net").isJsonNull()) {
        PaymentAdjustedNet.validateJsonObject(jsonObj.getAsJsonObject("adjusted_net"));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("shop_currency") != null && !jsonObj.get("shop_currency").isJsonNull()) && !jsonObj.get("shop_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_currency").toString()));
      }
      if ((jsonObj.get("buyer_currency") != null && !jsonObj.get("buyer_currency").isJsonNull()) && !jsonObj.get("buyer_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buyer_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buyer_currency").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("payment_adjustments") != null && !jsonObj.get("payment_adjustments").isJsonNull()) {
        JsonArray jsonArraypaymentAdjustments = jsonObj.getAsJsonArray("payment_adjustments");
        if (jsonArraypaymentAdjustments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("payment_adjustments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `payment_adjustments` to be an array in the JSON string but got `%s`", jsonObj.get("payment_adjustments").toString()));
          }

          // validate the optional field `payment_adjustments` (array)
          for (int i = 0; i < jsonArraypaymentAdjustments.size(); i++) {
            PaymentAccountLedgerEntryPaymentAdjustmentsInner.validateJsonObject(jsonArraypaymentAdjustments.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Payment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Payment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Payment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Payment.class));

       return (TypeAdapter<T>) new TypeAdapter<Payment>() {
           @Override
           public void write(JsonWriter out, Payment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Payment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Payment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Payment
  * @throws IOException if the JSON string is invalid with respect to Payment
  */
  public static Payment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Payment.class);
  }

 /**
  * Convert an instance of Payment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

