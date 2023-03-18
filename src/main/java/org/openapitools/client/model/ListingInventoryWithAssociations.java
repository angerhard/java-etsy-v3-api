/*
 * Etsy Open API v3
 * <div class=\"wt-text-body-01\"><p class=\"wt-pt-xs-2 wt-pb-xs-2\">Etsy's Open API provides a simple RESTful interface for various Etsy.com features. The API endpoints are meant to replace Etsy's Open API v2, which is scheduled to end service in 2022.</p><p class=\"wt-pb-xs-2\">All of the endpoints are callable and the majority of the API endpoints are now in a beta phase. This means we do not expect to make any breaking changes before our general release. A handful of endpoints are currently interface stubs (labeled “Feedback Only”) and returns a \"501 Not Implemented\" response code when called.</p><p class=\"wt-pb-xs-2\">If you'd like to report an issue or provide feedback on the API design, <a target=\"_blank\" class=\"wt-text-link wt-p-xs-0\" href=\"https://github.com/etsy/open-api/issues/new/choose\">please add an issue in Github</a>.</p></div>&copy; 2021-2023 Etsy, Inc. All Rights Reserved. Use of this code is subject to Etsy's <a class='wt-text-link wt-p-xs-0' target='_blank' href='https://www.etsy.com/legal/api'>API Developer Terms of Use</a>.
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
import java.util.*;
import java.util.Map.Entry;

/**
 * A representation of a single listing&#39;s inventory record with associations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-18T13:10:02.644710400+01:00[Europe/Berlin]")
public class ListingInventoryWithAssociations {
  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<ListingInventoryProductsInner> products = new ArrayList<>();

  public static final String SERIALIZED_NAME_PRICE_ON_PROPERTY = "price_on_property";
  @SerializedName(SERIALIZED_NAME_PRICE_ON_PROPERTY)
  private List<Long> priceOnProperty = new ArrayList<>();

  public static final String SERIALIZED_NAME_QUANTITY_ON_PROPERTY = "quantity_on_property";
  @SerializedName(SERIALIZED_NAME_QUANTITY_ON_PROPERTY)
  private List<Long> quantityOnProperty = new ArrayList<>();

  public static final String SERIALIZED_NAME_SKU_ON_PROPERTY = "sku_on_property";
  @SerializedName(SERIALIZED_NAME_SKU_ON_PROPERTY)
  private List<Long> skuOnProperty = new ArrayList<>();

  public static final String SERIALIZED_NAME_LISTING = "listing";
  @SerializedName(SERIALIZED_NAME_LISTING)
  private ListingInventoryWithAssociationsListing listing;

  public ListingInventoryWithAssociations() {
  }

  public ListingInventoryWithAssociations products(List<ListingInventoryProductsInner> products) {
    
    this.products = products;
    return this;
  }

  public ListingInventoryWithAssociations addProductsItem(ListingInventoryProductsInner productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * A JSON array of products available in a listing, even if only one product. All field names in the JSON blobs are lowercase.
   * @return products
  **/
  @javax.annotation.Nullable

  public List<ListingInventoryProductsInner> getProducts() {
    return products;
  }


  public void setProducts(List<ListingInventoryProductsInner> products) {
    this.products = products;
  }


  public ListingInventoryWithAssociations priceOnProperty(List<Long> priceOnProperty) {
    
    this.priceOnProperty = priceOnProperty;
    return this;
  }

  public ListingInventoryWithAssociations addPriceOnPropertyItem(Long priceOnPropertyItem) {
    if (this.priceOnProperty == null) {
      this.priceOnProperty = new ArrayList<>();
    }
    this.priceOnProperty.add(priceOnPropertyItem);
    return this;
  }

   /**
   * An array of unique [listing property](/documentation/reference#operation/getListingProperties) ID integers for the properties that change product prices, if any. For example, if you charge specific prices for different sized products in the same listing, then this array contains the property ID for size.
   * @return priceOnProperty
  **/
  @javax.annotation.Nullable

  public List<Long> getPriceOnProperty() {
    return priceOnProperty;
  }


  public void setPriceOnProperty(List<Long> priceOnProperty) {
    this.priceOnProperty = priceOnProperty;
  }


  public ListingInventoryWithAssociations quantityOnProperty(List<Long> quantityOnProperty) {
    
    this.quantityOnProperty = quantityOnProperty;
    return this;
  }

  public ListingInventoryWithAssociations addQuantityOnPropertyItem(Long quantityOnPropertyItem) {
    if (this.quantityOnProperty == null) {
      this.quantityOnProperty = new ArrayList<>();
    }
    this.quantityOnProperty.add(quantityOnPropertyItem);
    return this;
  }

   /**
   * An array of unique [listing property](/documentation/reference#operation/getListingProperties) ID integers for the properties that change the quantity of the products, if any. For example, if you stock specific quantities of different colored products in the same listing, then this array contains the property ID for color.
   * @return quantityOnProperty
  **/
  @javax.annotation.Nullable

  public List<Long> getQuantityOnProperty() {
    return quantityOnProperty;
  }


  public void setQuantityOnProperty(List<Long> quantityOnProperty) {
    this.quantityOnProperty = quantityOnProperty;
  }


  public ListingInventoryWithAssociations skuOnProperty(List<Long> skuOnProperty) {
    
    this.skuOnProperty = skuOnProperty;
    return this;
  }

  public ListingInventoryWithAssociations addSkuOnPropertyItem(Long skuOnPropertyItem) {
    if (this.skuOnProperty == null) {
      this.skuOnProperty = new ArrayList<>();
    }
    this.skuOnProperty.add(skuOnPropertyItem);
    return this;
  }

   /**
   * An array of unique [listing property](/documentation/reference#operation/getListingProperties) ID integers for the properties that change the product SKU, if any. For example, if you use specific skus for different colored products in the same listing, then this array contains the property ID for color.
   * @return skuOnProperty
  **/
  @javax.annotation.Nullable

  public List<Long> getSkuOnProperty() {
    return skuOnProperty;
  }


  public void setSkuOnProperty(List<Long> skuOnProperty) {
    this.skuOnProperty = skuOnProperty;
  }


  public ListingInventoryWithAssociations listing(ListingInventoryWithAssociationsListing listing) {
    
    this.listing = listing;
    return this;
  }

   /**
   * Get listing
   * @return listing
  **/
  @javax.annotation.Nullable

  public ListingInventoryWithAssociationsListing getListing() {
    return listing;
  }


  public void setListing(ListingInventoryWithAssociationsListing listing) {
    this.listing = listing;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingInventoryWithAssociations listingInventoryWithAssociations = (ListingInventoryWithAssociations) o;
    return Objects.equals(this.products, listingInventoryWithAssociations.products) &&
        Objects.equals(this.priceOnProperty, listingInventoryWithAssociations.priceOnProperty) &&
        Objects.equals(this.quantityOnProperty, listingInventoryWithAssociations.quantityOnProperty) &&
        Objects.equals(this.skuOnProperty, listingInventoryWithAssociations.skuOnProperty) &&
        Objects.equals(this.listing, listingInventoryWithAssociations.listing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(products, priceOnProperty, quantityOnProperty, skuOnProperty, listing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListingInventoryWithAssociations {\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    priceOnProperty: ").append(toIndentedString(priceOnProperty)).append("\n");
    sb.append("    quantityOnProperty: ").append(toIndentedString(quantityOnProperty)).append("\n");
    sb.append("    skuOnProperty: ").append(toIndentedString(skuOnProperty)).append("\n");
    sb.append("    listing: ").append(toIndentedString(listing)).append("\n");
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
    openapiFields.add("products");
    openapiFields.add("price_on_property");
    openapiFields.add("quantity_on_property");
    openapiFields.add("sku_on_property");
    openapiFields.add("listing");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListingInventoryWithAssociations
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListingInventoryWithAssociations.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListingInventoryWithAssociations is not found in the empty JSON string", ListingInventoryWithAssociations.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListingInventoryWithAssociations.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListingInventoryWithAssociations` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("products") != null && !jsonObj.get("products").isJsonNull()) {
        JsonArray jsonArrayproducts = jsonObj.getAsJsonArray("products");
        if (jsonArrayproducts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("products").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `products` to be an array in the JSON string but got `%s`", jsonObj.get("products").toString()));
          }

          // validate the optional field `products` (array)
          for (int i = 0; i < jsonArrayproducts.size(); i++) {
            ListingInventoryProductsInner.validateJsonObject(jsonArrayproducts.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("price_on_property") != null && !jsonObj.get("price_on_property").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `price_on_property` to be an array in the JSON string but got `%s`", jsonObj.get("price_on_property").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("quantity_on_property") != null && !jsonObj.get("quantity_on_property").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `quantity_on_property` to be an array in the JSON string but got `%s`", jsonObj.get("quantity_on_property").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sku_on_property") != null && !jsonObj.get("sku_on_property").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sku_on_property` to be an array in the JSON string but got `%s`", jsonObj.get("sku_on_property").toString()));
      }
      // validate the optional field `listing`
      if (jsonObj.get("listing") != null && !jsonObj.get("listing").isJsonNull()) {
        ListingInventoryWithAssociationsListing.validateJsonObject(jsonObj.getAsJsonObject("listing"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListingInventoryWithAssociations.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListingInventoryWithAssociations' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListingInventoryWithAssociations> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListingInventoryWithAssociations.class));

       return (TypeAdapter<T>) new TypeAdapter<ListingInventoryWithAssociations>() {
           @Override
           public void write(JsonWriter out, ListingInventoryWithAssociations value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListingInventoryWithAssociations read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListingInventoryWithAssociations given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListingInventoryWithAssociations
  * @throws IOException if the JSON string is invalid with respect to ListingInventoryWithAssociations
  */
  public static ListingInventoryWithAssociations fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListingInventoryWithAssociations.class);
  }

 /**
  * Convert an instance of ListingInventoryWithAssociations to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

