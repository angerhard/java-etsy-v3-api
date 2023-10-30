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
 * The TransactionReview resources found.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-30T11:53:28.314915500+01:00[Europe/Berlin]")
public class ListingReviewsResultsInner {
  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private Long shopId;

  public static final String SERIALIZED_NAME_LISTING_ID = "listing_id";
  @SerializedName(SERIALIZED_NAME_LISTING_ID)
  private Long listingId;

  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private Long rating;

  public static final String SERIALIZED_NAME_REVIEW = "review";
  @SerializedName(SERIALIZED_NAME_REVIEW)
  private String review;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_IMAGE_URL_FULLXFULL = "image_url_fullxfull";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL_FULLXFULL)
  private String imageUrlFullxfull;

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

  public ListingReviewsResultsInner() {
  }

  public ListingReviewsResultsInner shopId(Long shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * The shop&#39;s numeric ID.
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


  public ListingReviewsResultsInner listingId(Long listingId) {
    
    this.listingId = listingId;
    return this;
  }

   /**
   * The ID of the ShopListing that the TransactionReview belongs to.
   * minimum: 1
   * @return listingId
  **/
  @javax.annotation.Nullable

  public Long getListingId() {
    return listingId;
  }


  public void setListingId(Long listingId) {
    this.listingId = listingId;
  }


  public ListingReviewsResultsInner rating(Long rating) {
    
    this.rating = rating;
    return this;
  }

   /**
   * Rating value on scale from 1 to 5
   * minimum: 1
   * maximum: 5
   * @return rating
  **/
  @javax.annotation.Nullable

  public Long getRating() {
    return rating;
  }


  public void setRating(Long rating) {
    this.rating = rating;
  }


  public ListingReviewsResultsInner review(String review) {
    
    this.review = review;
    return this;
  }

   /**
   * A message left by the author, explaining the feedback, if provided.
   * @return review
  **/
  @javax.annotation.Nullable

  public String getReview() {
    return review;
  }


  public void setReview(String review) {
    this.review = review;
  }


  public ListingReviewsResultsInner language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * The language of the TransactionReview
   * @return language
  **/
  @javax.annotation.Nullable

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public ListingReviewsResultsInner imageUrlFullxfull(String imageUrlFullxfull) {
    
    this.imageUrlFullxfull = imageUrlFullxfull;
    return this;
  }

   /**
   * The url to a photo provided with the feedback, dimensions fullxfull. Note: This field may be absent, depending on the buyer&#39;s privacy settings.
   * @return imageUrlFullxfull
  **/
  @javax.annotation.Nullable

  public String getImageUrlFullxfull() {
    return imageUrlFullxfull;
  }


  public void setImageUrlFullxfull(String imageUrlFullxfull) {
    this.imageUrlFullxfull = imageUrlFullxfull;
  }


  public ListingReviewsResultsInner createTimestamp(Long createTimestamp) {
    
    this.createTimestamp = createTimestamp;
    return this;
  }

   /**
   * The date and time the TransactionReview was created in epoch seconds.
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


  public ListingReviewsResultsInner createdTimestamp(Long createdTimestamp) {
    
    this.createdTimestamp = createdTimestamp;
    return this;
  }

   /**
   * The date and time the TransactionReview was created in epoch seconds.
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


  public ListingReviewsResultsInner updateTimestamp(Long updateTimestamp) {
    
    this.updateTimestamp = updateTimestamp;
    return this;
  }

   /**
   * The date and time the TransactionReview was updated in epoch seconds.
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


  public ListingReviewsResultsInner updatedTimestamp(Long updatedTimestamp) {
    
    this.updatedTimestamp = updatedTimestamp;
    return this;
  }

   /**
   * The date and time the TransactionReview was updated in epoch seconds.
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
    ListingReviewsResultsInner listingReviewsResultsInner = (ListingReviewsResultsInner) o;
    return Objects.equals(this.shopId, listingReviewsResultsInner.shopId) &&
        Objects.equals(this.listingId, listingReviewsResultsInner.listingId) &&
        Objects.equals(this.rating, listingReviewsResultsInner.rating) &&
        Objects.equals(this.review, listingReviewsResultsInner.review) &&
        Objects.equals(this.language, listingReviewsResultsInner.language) &&
        Objects.equals(this.imageUrlFullxfull, listingReviewsResultsInner.imageUrlFullxfull) &&
        Objects.equals(this.createTimestamp, listingReviewsResultsInner.createTimestamp) &&
        Objects.equals(this.createdTimestamp, listingReviewsResultsInner.createdTimestamp) &&
        Objects.equals(this.updateTimestamp, listingReviewsResultsInner.updateTimestamp) &&
        Objects.equals(this.updatedTimestamp, listingReviewsResultsInner.updatedTimestamp);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopId, listingId, rating, review, language, imageUrlFullxfull, createTimestamp, createdTimestamp, updateTimestamp, updatedTimestamp);
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
    sb.append("class ListingReviewsResultsInner {\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    listingId: ").append(toIndentedString(listingId)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    review: ").append(toIndentedString(review)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    imageUrlFullxfull: ").append(toIndentedString(imageUrlFullxfull)).append("\n");
    sb.append("    createTimestamp: ").append(toIndentedString(createTimestamp)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    updateTimestamp: ").append(toIndentedString(updateTimestamp)).append("\n");
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
    openapiFields.add("shop_id");
    openapiFields.add("listing_id");
    openapiFields.add("rating");
    openapiFields.add("review");
    openapiFields.add("language");
    openapiFields.add("image_url_fullxfull");
    openapiFields.add("create_timestamp");
    openapiFields.add("created_timestamp");
    openapiFields.add("update_timestamp");
    openapiFields.add("updated_timestamp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListingReviewsResultsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListingReviewsResultsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListingReviewsResultsInner is not found in the empty JSON string", ListingReviewsResultsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListingReviewsResultsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListingReviewsResultsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("review") != null && !jsonObj.get("review").isJsonNull()) && !jsonObj.get("review").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `review` to be a primitive type in the JSON string but got `%s`", jsonObj.get("review").toString()));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if ((jsonObj.get("image_url_fullxfull") != null && !jsonObj.get("image_url_fullxfull").isJsonNull()) && !jsonObj.get("image_url_fullxfull").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image_url_fullxfull` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image_url_fullxfull").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListingReviewsResultsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListingReviewsResultsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListingReviewsResultsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListingReviewsResultsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ListingReviewsResultsInner>() {
           @Override
           public void write(JsonWriter out, ListingReviewsResultsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListingReviewsResultsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListingReviewsResultsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListingReviewsResultsInner
  * @throws IOException if the JSON string is invalid with respect to ListingReviewsResultsInner
  */
  public static ListingReviewsResultsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListingReviewsResultsInner.class);
  }

 /**
  * Convert an instance of ListingReviewsResultsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

