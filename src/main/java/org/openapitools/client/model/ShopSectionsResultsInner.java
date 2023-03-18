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
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/**
 * The list of requested resources.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-18T13:10:02.644710400+01:00[Europe/Berlin]")
public class ShopSectionsResultsInner {
  public static final String SERIALIZED_NAME_SHOP_SECTION_ID = "shop_section_id";
  @SerializedName(SERIALIZED_NAME_SHOP_SECTION_ID)
  private Long shopSectionId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_RANK = "rank";
  @SerializedName(SERIALIZED_NAME_RANK)
  private Long rank;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Long userId;

  public static final String SERIALIZED_NAME_ACTIVE_LISTING_COUNT = "active_listing_count";
  @SerializedName(SERIALIZED_NAME_ACTIVE_LISTING_COUNT)
  private Long activeListingCount;

  public ShopSectionsResultsInner() {
  }

  public ShopSectionsResultsInner shopSectionId(Long shopSectionId) {
    
    this.shopSectionId = shopSectionId;
    return this;
  }

   /**
   * The numeric ID of a section in a specific Etsy shop.
   * minimum: 1
   * @return shopSectionId
  **/
  @javax.annotation.Nullable

  public Long getShopSectionId() {
    return shopSectionId;
  }


  public void setShopSectionId(Long shopSectionId) {
    this.shopSectionId = shopSectionId;
  }


  public ShopSectionsResultsInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title string for a shop section.
   * @return title
  **/
  @javax.annotation.Nullable

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ShopSectionsResultsInner rank(Long rank) {
    
    this.rank = rank;
    return this;
  }

   /**
   * The positive non-zero numeric position of this section in the section display order for a shop, with rank 1 sections appearing first.
   * minimum: 0
   * @return rank
  **/
  @javax.annotation.Nullable

  public Long getRank() {
    return rank;
  }


  public void setRank(Long rank) {
    this.rank = rank;
  }


  public ShopSectionsResultsInner userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The numeric ID of the [user](/documentation/reference#tag/User) who owns this shop section.
   * minimum: 1
   * @return userId
  **/
  @javax.annotation.Nullable

  public Long getUserId() {
    return userId;
  }


  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public ShopSectionsResultsInner activeListingCount(Long activeListingCount) {
    
    this.activeListingCount = activeListingCount;
    return this;
  }

   /**
   * The number of active listings in one section of a specific Etsy shop.
   * minimum: 0
   * @return activeListingCount
  **/
  @javax.annotation.Nullable

  public Long getActiveListingCount() {
    return activeListingCount;
  }


  public void setActiveListingCount(Long activeListingCount) {
    this.activeListingCount = activeListingCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopSectionsResultsInner shopSectionsResultsInner = (ShopSectionsResultsInner) o;
    return Objects.equals(this.shopSectionId, shopSectionsResultsInner.shopSectionId) &&
        Objects.equals(this.title, shopSectionsResultsInner.title) &&
        Objects.equals(this.rank, shopSectionsResultsInner.rank) &&
        Objects.equals(this.userId, shopSectionsResultsInner.userId) &&
        Objects.equals(this.activeListingCount, shopSectionsResultsInner.activeListingCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopSectionId, title, rank, userId, activeListingCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopSectionsResultsInner {\n");
    sb.append("    shopSectionId: ").append(toIndentedString(shopSectionId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    activeListingCount: ").append(toIndentedString(activeListingCount)).append("\n");
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
    openapiFields.add("shop_section_id");
    openapiFields.add("title");
    openapiFields.add("rank");
    openapiFields.add("user_id");
    openapiFields.add("active_listing_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShopSectionsResultsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ShopSectionsResultsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShopSectionsResultsInner is not found in the empty JSON string", ShopSectionsResultsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ShopSectionsResultsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShopSectionsResultsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShopSectionsResultsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShopSectionsResultsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShopSectionsResultsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShopSectionsResultsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ShopSectionsResultsInner>() {
           @Override
           public void write(JsonWriter out, ShopSectionsResultsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShopSectionsResultsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShopSectionsResultsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShopSectionsResultsInner
  * @throws IOException if the JSON string is invalid with respect to ShopSectionsResultsInner
  */
  public static ShopSectionsResultsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShopSectionsResultsInner.class);
  }

 /**
  * Convert an instance of ShopSectionsResultsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

