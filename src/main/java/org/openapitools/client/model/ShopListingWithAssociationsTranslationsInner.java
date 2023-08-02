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
 * An array of translations for the listing. Default value is an empty array.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-02T22:46:35.595209100+02:00[Europe/Berlin]")
public class ShopListingWithAssociationsTranslationsInner {
  public static final String SERIALIZED_NAME_LISTING_ID = "listing_id";
  @SerializedName(SERIALIZED_NAME_LISTING_ID)
  private Long listingId;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public ShopListingWithAssociationsTranslationsInner() {
  }

  public ShopListingWithAssociationsTranslationsInner listingId(Long listingId) {
    
    this.listingId = listingId;
    return this;
  }

   /**
   * The numeric ID for the Listing.
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


  public ShopListingWithAssociationsTranslationsInner language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * The IETF language tag (e.g. &#39;fr&#39;) for the language of this translation.
   * @return language
  **/
  @javax.annotation.Nullable

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public ShopListingWithAssociationsTranslationsInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of the Listing of this Translation.
   * @return title
  **/
  @javax.annotation.Nullable

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ShopListingWithAssociationsTranslationsInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the Listing of this Translation.
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ShopListingWithAssociationsTranslationsInner tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public ShopListingWithAssociationsTranslationsInner addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags of the Listing of this Translation.
   * @return tags
  **/
  @javax.annotation.Nullable

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopListingWithAssociationsTranslationsInner shopListingWithAssociationsTranslationsInner = (ShopListingWithAssociationsTranslationsInner) o;
    return Objects.equals(this.listingId, shopListingWithAssociationsTranslationsInner.listingId) &&
        Objects.equals(this.language, shopListingWithAssociationsTranslationsInner.language) &&
        Objects.equals(this.title, shopListingWithAssociationsTranslationsInner.title) &&
        Objects.equals(this.description, shopListingWithAssociationsTranslationsInner.description) &&
        Objects.equals(this.tags, shopListingWithAssociationsTranslationsInner.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(listingId, language, title, description, tags);
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
    sb.append("class ShopListingWithAssociationsTranslationsInner {\n");
    sb.append("    listingId: ").append(toIndentedString(listingId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("listing_id");
    openapiFields.add("language");
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShopListingWithAssociationsTranslationsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ShopListingWithAssociationsTranslationsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShopListingWithAssociationsTranslationsInner is not found in the empty JSON string", ShopListingWithAssociationsTranslationsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ShopListingWithAssociationsTranslationsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShopListingWithAssociationsTranslationsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShopListingWithAssociationsTranslationsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShopListingWithAssociationsTranslationsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShopListingWithAssociationsTranslationsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShopListingWithAssociationsTranslationsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ShopListingWithAssociationsTranslationsInner>() {
           @Override
           public void write(JsonWriter out, ShopListingWithAssociationsTranslationsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShopListingWithAssociationsTranslationsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShopListingWithAssociationsTranslationsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShopListingWithAssociationsTranslationsInner
  * @throws IOException if the JSON string is invalid with respect to ShopListingWithAssociationsTranslationsInner
  */
  public static ShopListingWithAssociationsTranslationsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShopListingWithAssociationsTranslationsInner.class);
  }

 /**
  * Convert an instance of ShopListingWithAssociationsTranslationsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

