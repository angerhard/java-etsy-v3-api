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
 * A list of product offering entries for this product.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-30T11:53:28.314915500+01:00[Europe/Berlin]")
public class ListingInventoryProductOfferingsInner {
  public static final String SERIALIZED_NAME_OFFERING_ID = "offering_id";
  @SerializedName(SERIALIZED_NAME_OFFERING_ID)
  private Long offeringId;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Long quantity;

  public static final String SERIALIZED_NAME_IS_ENABLED = "is_enabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_IS_DELETED = "is_deleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private ListingInventoryProductOfferingPrice price;

  public ListingInventoryProductOfferingsInner() {
  }

  public ListingInventoryProductOfferingsInner offeringId(Long offeringId) {
    
    this.offeringId = offeringId;
    return this;
  }

   /**
   * The ID for the ProductOffering
   * minimum: 1
   * @return offeringId
  **/
  @javax.annotation.Nullable

  public Long getOfferingId() {
    return offeringId;
  }


  public void setOfferingId(Long offeringId) {
    this.offeringId = offeringId;
  }


  public ListingInventoryProductOfferingsInner quantity(Long quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity the ProductOffering
   * minimum: 0
   * @return quantity
  **/
  @javax.annotation.Nullable

  public Long getQuantity() {
    return quantity;
  }


  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }


  public ListingInventoryProductOfferingsInner isEnabled(Boolean isEnabled) {
    
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Whether or not the offering can be shown to buyers.
   * @return isEnabled
  **/
  @javax.annotation.Nullable

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public ListingInventoryProductOfferingsInner isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Whether or not the offering has been deleted.
   * @return isDeleted
  **/
  @javax.annotation.Nullable

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public ListingInventoryProductOfferingsInner price(ListingInventoryProductOfferingPrice price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable

  public ListingInventoryProductOfferingPrice getPrice() {
    return price;
  }


  public void setPrice(ListingInventoryProductOfferingPrice price) {
    this.price = price;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingInventoryProductOfferingsInner listingInventoryProductOfferingsInner = (ListingInventoryProductOfferingsInner) o;
    return Objects.equals(this.offeringId, listingInventoryProductOfferingsInner.offeringId) &&
        Objects.equals(this.quantity, listingInventoryProductOfferingsInner.quantity) &&
        Objects.equals(this.isEnabled, listingInventoryProductOfferingsInner.isEnabled) &&
        Objects.equals(this.isDeleted, listingInventoryProductOfferingsInner.isDeleted) &&
        Objects.equals(this.price, listingInventoryProductOfferingsInner.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offeringId, quantity, isEnabled, isDeleted, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListingInventoryProductOfferingsInner {\n");
    sb.append("    offeringId: ").append(toIndentedString(offeringId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
    openapiFields.add("offering_id");
    openapiFields.add("quantity");
    openapiFields.add("is_enabled");
    openapiFields.add("is_deleted");
    openapiFields.add("price");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListingInventoryProductOfferingsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListingInventoryProductOfferingsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListingInventoryProductOfferingsInner is not found in the empty JSON string", ListingInventoryProductOfferingsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListingInventoryProductOfferingsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListingInventoryProductOfferingsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `price`
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull()) {
        ListingInventoryProductOfferingPrice.validateJsonObject(jsonObj.getAsJsonObject("price"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListingInventoryProductOfferingsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListingInventoryProductOfferingsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListingInventoryProductOfferingsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListingInventoryProductOfferingsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ListingInventoryProductOfferingsInner>() {
           @Override
           public void write(JsonWriter out, ListingInventoryProductOfferingsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListingInventoryProductOfferingsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListingInventoryProductOfferingsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListingInventoryProductOfferingsInner
  * @throws IOException if the JSON string is invalid with respect to ListingInventoryProductOfferingsInner
  */
  public static ListingInventoryProductOfferingsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListingInventoryProductOfferingsInner.class);
  }

 /**
  * Convert an instance of ListingInventoryProductOfferingsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

