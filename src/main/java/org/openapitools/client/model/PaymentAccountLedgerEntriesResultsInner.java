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
import org.openapitools.client.model.PaymentAccountLedgerEntryPaymentAdjustmentsInner;
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
 * The PaymentAccountLedgerEntry resources found.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-03T07:15:13.096948200+02:00[Europe/Berlin]")
public class PaymentAccountLedgerEntriesResultsInner {
  public static final String SERIALIZED_NAME_ENTRY_ID = "entry_id";
  @SerializedName(SERIALIZED_NAME_ENTRY_ID)
  private Long entryId;

  public static final String SERIALIZED_NAME_LEDGER_ID = "ledger_id";
  @SerializedName(SERIALIZED_NAME_LEDGER_ID)
  private Long ledgerId;

  public static final String SERIALIZED_NAME_SEQUENCE_NUMBER = "sequence_number";
  @SerializedName(SERIALIZED_NAME_SEQUENCE_NUMBER)
  private Long sequenceNumber;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Long balance;

  public static final String SERIALIZED_NAME_CREATE_DATE = "create_date";
  @SerializedName(SERIALIZED_NAME_CREATE_DATE)
  private Long createDate;

  public static final String SERIALIZED_NAME_CREATED_TIMESTAMP = "created_timestamp";
  @SerializedName(SERIALIZED_NAME_CREATED_TIMESTAMP)
  private Long createdTimestamp;

  public static final String SERIALIZED_NAME_LEDGER_TYPE = "ledger_type";
  @SerializedName(SERIALIZED_NAME_LEDGER_TYPE)
  private String ledgerType;

  public static final String SERIALIZED_NAME_REFERENCE_TYPE = "reference_type";
  @SerializedName(SERIALIZED_NAME_REFERENCE_TYPE)
  private String referenceType;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "reference_id";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_PAYMENT_ADJUSTMENTS = "payment_adjustments";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ADJUSTMENTS)
  private List<PaymentAccountLedgerEntryPaymentAdjustmentsInner> paymentAdjustments = new ArrayList<>();

  public PaymentAccountLedgerEntriesResultsInner() {
  }

  public PaymentAccountLedgerEntriesResultsInner entryId(Long entryId) {
    
    this.entryId = entryId;
    return this;
  }

   /**
   * The ledger entry&#39;s numeric ID.
   * minimum: 1
   * @return entryId
  **/
  @javax.annotation.Nullable

  public Long getEntryId() {
    return entryId;
  }


  public void setEntryId(Long entryId) {
    this.entryId = entryId;
  }


  public PaymentAccountLedgerEntriesResultsInner ledgerId(Long ledgerId) {
    
    this.ledgerId = ledgerId;
    return this;
  }

   /**
   * The ledger&#39;s numeric ID.
   * minimum: 1
   * @return ledgerId
  **/
  @javax.annotation.Nullable

  public Long getLedgerId() {
    return ledgerId;
  }


  public void setLedgerId(Long ledgerId) {
    this.ledgerId = ledgerId;
  }


  public PaymentAccountLedgerEntriesResultsInner sequenceNumber(Long sequenceNumber) {
    
    this.sequenceNumber = sequenceNumber;
    return this;
  }

   /**
   * The sequence allows ledger entries to be sorted chronologically. The higher the sequence, the more recent the entry.
   * @return sequenceNumber
  **/
  @javax.annotation.Nullable

  public Long getSequenceNumber() {
    return sequenceNumber;
  }


  public void setSequenceNumber(Long sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }


  public PaymentAccountLedgerEntriesResultsInner amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of money credited to the ledger.
   * @return amount
  **/
  @javax.annotation.Nullable

  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public PaymentAccountLedgerEntriesResultsInner currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the entry on the ledger.
   * @return currency
  **/
  @javax.annotation.Nullable

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public PaymentAccountLedgerEntriesResultsInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Details what kind of ledger entry this is: a payment, refund, reversal of a failed refund, disbursement, returned disbursement, recoupment, miscellaneous credit, miscellaneous debit, or bill payment.
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PaymentAccountLedgerEntriesResultsInner balance(Long balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * The amount of money in the shop&#39;s ledger the moment after this entry was applied.
   * @return balance
  **/
  @javax.annotation.Nullable

  public Long getBalance() {
    return balance;
  }


  public void setBalance(Long balance) {
    this.balance = balance;
  }


  public PaymentAccountLedgerEntriesResultsInner createDate(Long createDate) {
    
    this.createDate = createDate;
    return this;
  }

   /**
   * The date and time the ledger entry was created in Epoch seconds.
   * minimum: 0
   * @return createDate
  **/
  @javax.annotation.Nullable

  public Long getCreateDate() {
    return createDate;
  }


  public void setCreateDate(Long createDate) {
    this.createDate = createDate;
  }


  public PaymentAccountLedgerEntriesResultsInner createdTimestamp(Long createdTimestamp) {
    
    this.createdTimestamp = createdTimestamp;
    return this;
  }

   /**
   * The date and time the ledger entry was created in Epoch seconds.
   * minimum: 0
   * @return createdTimestamp
  **/
  @javax.annotation.Nullable

  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }


  public void setCreatedTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }


  public PaymentAccountLedgerEntriesResultsInner ledgerType(String ledgerType) {
    
    this.ledgerType = ledgerType;
    return this;
  }

   /**
   * The original reference type for the ledger entry.
   * @return ledgerType
  **/
  @javax.annotation.Nullable

  public String getLedgerType() {
    return ledgerType;
  }


  public void setLedgerType(String ledgerType) {
    this.ledgerType = ledgerType;
  }


  public PaymentAccountLedgerEntriesResultsInner referenceType(String referenceType) {
    
    this.referenceType = referenceType;
    return this;
  }

   /**
   * The object type the ledger entry refers to.
   * @return referenceType
  **/
  @javax.annotation.Nullable

  public String getReferenceType() {
    return referenceType;
  }


  public void setReferenceType(String referenceType) {
    this.referenceType = referenceType;
  }


  public PaymentAccountLedgerEntriesResultsInner referenceId(String referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * The object id the ledger entry refers to.
   * @return referenceId
  **/
  @javax.annotation.Nullable

  public String getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public PaymentAccountLedgerEntriesResultsInner paymentAdjustments(List<PaymentAccountLedgerEntryPaymentAdjustmentsInner> paymentAdjustments) {
    
    this.paymentAdjustments = paymentAdjustments;
    return this;
  }

  public PaymentAccountLedgerEntriesResultsInner addPaymentAdjustmentsItem(PaymentAccountLedgerEntryPaymentAdjustmentsInner paymentAdjustmentsItem) {
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
    PaymentAccountLedgerEntriesResultsInner paymentAccountLedgerEntriesResultsInner = (PaymentAccountLedgerEntriesResultsInner) o;
    return Objects.equals(this.entryId, paymentAccountLedgerEntriesResultsInner.entryId) &&
        Objects.equals(this.ledgerId, paymentAccountLedgerEntriesResultsInner.ledgerId) &&
        Objects.equals(this.sequenceNumber, paymentAccountLedgerEntriesResultsInner.sequenceNumber) &&
        Objects.equals(this.amount, paymentAccountLedgerEntriesResultsInner.amount) &&
        Objects.equals(this.currency, paymentAccountLedgerEntriesResultsInner.currency) &&
        Objects.equals(this.description, paymentAccountLedgerEntriesResultsInner.description) &&
        Objects.equals(this.balance, paymentAccountLedgerEntriesResultsInner.balance) &&
        Objects.equals(this.createDate, paymentAccountLedgerEntriesResultsInner.createDate) &&
        Objects.equals(this.createdTimestamp, paymentAccountLedgerEntriesResultsInner.createdTimestamp) &&
        Objects.equals(this.ledgerType, paymentAccountLedgerEntriesResultsInner.ledgerType) &&
        Objects.equals(this.referenceType, paymentAccountLedgerEntriesResultsInner.referenceType) &&
        Objects.equals(this.referenceId, paymentAccountLedgerEntriesResultsInner.referenceId) &&
        Objects.equals(this.paymentAdjustments, paymentAccountLedgerEntriesResultsInner.paymentAdjustments);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryId, ledgerId, sequenceNumber, amount, currency, description, balance, createDate, createdTimestamp, ledgerType, referenceType, referenceId, paymentAdjustments);
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
    sb.append("class PaymentAccountLedgerEntriesResultsInner {\n");
    sb.append("    entryId: ").append(toIndentedString(entryId)).append("\n");
    sb.append("    ledgerId: ").append(toIndentedString(ledgerId)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    ledgerType: ").append(toIndentedString(ledgerType)).append("\n");
    sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
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
    openapiFields.add("entry_id");
    openapiFields.add("ledger_id");
    openapiFields.add("sequence_number");
    openapiFields.add("amount");
    openapiFields.add("currency");
    openapiFields.add("description");
    openapiFields.add("balance");
    openapiFields.add("create_date");
    openapiFields.add("created_timestamp");
    openapiFields.add("ledger_type");
    openapiFields.add("reference_type");
    openapiFields.add("reference_id");
    openapiFields.add("payment_adjustments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentAccountLedgerEntriesResultsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaymentAccountLedgerEntriesResultsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentAccountLedgerEntriesResultsInner is not found in the empty JSON string", PaymentAccountLedgerEntriesResultsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentAccountLedgerEntriesResultsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentAccountLedgerEntriesResultsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("ledger_type") != null && !jsonObj.get("ledger_type").isJsonNull()) && !jsonObj.get("ledger_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ledger_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ledger_type").toString()));
      }
      if ((jsonObj.get("reference_type") != null && !jsonObj.get("reference_type").isJsonNull()) && !jsonObj.get("reference_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference_type").toString()));
      }
      if ((jsonObj.get("reference_id") != null && !jsonObj.get("reference_id").isJsonNull()) && !jsonObj.get("reference_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference_id").toString()));
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
       if (!PaymentAccountLedgerEntriesResultsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentAccountLedgerEntriesResultsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentAccountLedgerEntriesResultsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentAccountLedgerEntriesResultsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentAccountLedgerEntriesResultsInner>() {
           @Override
           public void write(JsonWriter out, PaymentAccountLedgerEntriesResultsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentAccountLedgerEntriesResultsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentAccountLedgerEntriesResultsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentAccountLedgerEntriesResultsInner
  * @throws IOException if the JSON string is invalid with respect to PaymentAccountLedgerEntriesResultsInner
  */
  public static PaymentAccountLedgerEntriesResultsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentAccountLedgerEntriesResultsInner.class);
  }

 /**
  * Convert an instance of PaymentAccountLedgerEntriesResultsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

