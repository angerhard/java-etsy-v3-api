/*
 * Etsy Open API v3
 * <div class=\"wt-text-body-01\"><p class=\"wt-pt-xs-2 wt-pb-xs-2\">Etsy's Open API provides a simple RESTful interface for various Etsy.com features. The API endpoints are meant to replace Etsy's Open API v2, which is scheduled to end service in 2022.</p><p class=\"wt-pb-xs-2\">All of the endpoints are callable and the majority of the API endpoints are now in a beta phase. This means we do not expect to make any breaking changes before our general release. A handful of endpoints are currently interface stubs (labeled “Feedback Only”) and returns a \"501 Not Implemented\" response code when called.</p><p class=\"wt-pb-xs-2\">If you'd like to report an issue or provide feedback on the API design, <a target=\"_blank\" class=\"wt-text-link wt-p-xs-0\" href=\"https://github.com/etsy/open-api/discussions\">please add an issue in Github</a>.</p></div>&copy; 2021-2025 Etsy, Inc. All Rights Reserved. Use of this code is subject to Etsy's <a class='wt-text-link wt-p-xs-0' target='_blank' href='https://www.etsy.com/legal/api'>API Developer Terms of Use</a>.
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
 * The list of requested resources.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-15T11:53:41.521727200+01:00[Europe/Berlin]")
public class ListingImagesResultsInner {
  public static final String SERIALIZED_NAME_LISTING_ID = "listing_id";
  @SerializedName(SERIALIZED_NAME_LISTING_ID)
  private Long listingId;

  public static final String SERIALIZED_NAME_LISTING_IMAGE_ID = "listing_image_id";
  @SerializedName(SERIALIZED_NAME_LISTING_IMAGE_ID)
  private Long listingImageId;

  public static final String SERIALIZED_NAME_HEX_CODE = "hex_code";
  @SerializedName(SERIALIZED_NAME_HEX_CODE)
  private String hexCode;

  public static final String SERIALIZED_NAME_RED = "red";
  @SerializedName(SERIALIZED_NAME_RED)
  private Long red;

  public static final String SERIALIZED_NAME_GREEN = "green";
  @SerializedName(SERIALIZED_NAME_GREEN)
  private Long green;

  public static final String SERIALIZED_NAME_BLUE = "blue";
  @SerializedName(SERIALIZED_NAME_BLUE)
  private Long blue;

  public static final String SERIALIZED_NAME_HUE = "hue";
  @SerializedName(SERIALIZED_NAME_HUE)
  private Long hue;

  public static final String SERIALIZED_NAME_SATURATION = "saturation";
  @SerializedName(SERIALIZED_NAME_SATURATION)
  private Long saturation;

  public static final String SERIALIZED_NAME_BRIGHTNESS = "brightness";
  @SerializedName(SERIALIZED_NAME_BRIGHTNESS)
  private Long brightness;

  public static final String SERIALIZED_NAME_IS_BLACK_AND_WHITE = "is_black_and_white";
  @SerializedName(SERIALIZED_NAME_IS_BLACK_AND_WHITE)
  private Boolean isBlackAndWhite;

  public static final String SERIALIZED_NAME_CREATION_TSZ = "creation_tsz";
  @SerializedName(SERIALIZED_NAME_CREATION_TSZ)
  private Long creationTsz;

  public static final String SERIALIZED_NAME_CREATED_TIMESTAMP = "created_timestamp";
  @SerializedName(SERIALIZED_NAME_CREATED_TIMESTAMP)
  private Long createdTimestamp;

  public static final String SERIALIZED_NAME_RANK = "rank";
  @SerializedName(SERIALIZED_NAME_RANK)
  private Long rank;

  public static final String SERIALIZED_NAME_URL75X75 = "url_75x75";
  @SerializedName(SERIALIZED_NAME_URL75X75)
  private String url75x75;

  public static final String SERIALIZED_NAME_URL170X135 = "url_170x135";
  @SerializedName(SERIALIZED_NAME_URL170X135)
  private String url170x135;

  public static final String SERIALIZED_NAME_URL570X_N = "url_570xN";
  @SerializedName(SERIALIZED_NAME_URL570X_N)
  private String url570xN;

  public static final String SERIALIZED_NAME_URL_FULLXFULL = "url_fullxfull";
  @SerializedName(SERIALIZED_NAME_URL_FULLXFULL)
  private String urlFullxfull;

  public static final String SERIALIZED_NAME_FULL_HEIGHT = "full_height";
  @SerializedName(SERIALIZED_NAME_FULL_HEIGHT)
  private Long fullHeight;

  public static final String SERIALIZED_NAME_FULL_WIDTH = "full_width";
  @SerializedName(SERIALIZED_NAME_FULL_WIDTH)
  private Long fullWidth;

  public static final String SERIALIZED_NAME_ALT_TEXT = "alt_text";
  @SerializedName(SERIALIZED_NAME_ALT_TEXT)
  private String altText;

  public ListingImagesResultsInner() {
  }

  public ListingImagesResultsInner listingId(Long listingId) {
    
    this.listingId = listingId;
    return this;
  }

   /**
   * The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
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


  public ListingImagesResultsInner listingImageId(Long listingImageId) {
    
    this.listingImageId = listingImageId;
    return this;
  }

   /**
   * The numeric ID of the primary [listing image](/documentation/reference#tag/ShopListing-Image) for this transaction.
   * minimum: 1
   * @return listingImageId
  **/
  @javax.annotation.Nullable

  public Long getListingImageId() {
    return listingImageId;
  }


  public void setListingImageId(Long listingImageId) {
    this.listingImageId = listingImageId;
  }


  public ListingImagesResultsInner hexCode(String hexCode) {
    
    this.hexCode = hexCode;
    return this;
  }

   /**
   * The webhex string for the image&#39;s average color, in webhex notation.
   * @return hexCode
  **/
  @javax.annotation.Nullable

  public String getHexCode() {
    return hexCode;
  }


  public void setHexCode(String hexCode) {
    this.hexCode = hexCode;
  }


  public ListingImagesResultsInner red(Long red) {
    
    this.red = red;
    return this;
  }

   /**
   * The numeric red value equal to the image&#39;s average red value, from 0-255 (RGB color).
   * minimum: 0
   * @return red
  **/
  @javax.annotation.Nullable

  public Long getRed() {
    return red;
  }


  public void setRed(Long red) {
    this.red = red;
  }


  public ListingImagesResultsInner green(Long green) {
    
    this.green = green;
    return this;
  }

   /**
   * The numeric red value equal to the image&#39;s average red value, from 0-255 (RGB color).
   * minimum: 0
   * @return green
  **/
  @javax.annotation.Nullable

  public Long getGreen() {
    return green;
  }


  public void setGreen(Long green) {
    this.green = green;
  }


  public ListingImagesResultsInner blue(Long blue) {
    
    this.blue = blue;
    return this;
  }

   /**
   * The numeric red value equal to the image&#39;s average red value, from 0-255 (RGB color).
   * minimum: 0
   * @return blue
  **/
  @javax.annotation.Nullable

  public Long getBlue() {
    return blue;
  }


  public void setBlue(Long blue) {
    this.blue = blue;
  }


  public ListingImagesResultsInner hue(Long hue) {
    
    this.hue = hue;
    return this;
  }

   /**
   * The numeric hue equal to the image&#39;s average hue, from 0-360 (HSV color).
   * minimum: 0
   * @return hue
  **/
  @javax.annotation.Nullable

  public Long getHue() {
    return hue;
  }


  public void setHue(Long hue) {
    this.hue = hue;
  }


  public ListingImagesResultsInner saturation(Long saturation) {
    
    this.saturation = saturation;
    return this;
  }

   /**
   * The numeric saturation equal to the image&#39;s average saturation, from 0-100 (HSV color).
   * minimum: 0
   * @return saturation
  **/
  @javax.annotation.Nullable

  public Long getSaturation() {
    return saturation;
  }


  public void setSaturation(Long saturation) {
    this.saturation = saturation;
  }


  public ListingImagesResultsInner brightness(Long brightness) {
    
    this.brightness = brightness;
    return this;
  }

   /**
   * The numeric brightness equal to the image&#39;s average brightness, from 0-100 (HSV color).
   * minimum: 0
   * @return brightness
  **/
  @javax.annotation.Nullable

  public Long getBrightness() {
    return brightness;
  }


  public void setBrightness(Long brightness) {
    this.brightness = brightness;
  }


  public ListingImagesResultsInner isBlackAndWhite(Boolean isBlackAndWhite) {
    
    this.isBlackAndWhite = isBlackAndWhite;
    return this;
  }

   /**
   * When true, the image is in black &amp; white.
   * @return isBlackAndWhite
  **/
  @javax.annotation.Nullable

  public Boolean getIsBlackAndWhite() {
    return isBlackAndWhite;
  }


  public void setIsBlackAndWhite(Boolean isBlackAndWhite) {
    this.isBlackAndWhite = isBlackAndWhite;
  }


  public ListingImagesResultsInner creationTsz(Long creationTsz) {
    
    this.creationTsz = creationTsz;
    return this;
  }

   /**
   * The listing image\\&#39;s creation time, in epoch seconds.
   * minimum: 0
   * @return creationTsz
  **/
  @javax.annotation.Nullable

  public Long getCreationTsz() {
    return creationTsz;
  }


  public void setCreationTsz(Long creationTsz) {
    this.creationTsz = creationTsz;
  }


  public ListingImagesResultsInner createdTimestamp(Long createdTimestamp) {
    
    this.createdTimestamp = createdTimestamp;
    return this;
  }

   /**
   * The listing image\\&#39;s creation time, in epoch seconds.
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


  public ListingImagesResultsInner rank(Long rank) {
    
    this.rank = rank;
    return this;
  }

   /**
   * The positive non-zero numeric position in the images displayed in a listing, with rank 1 images appearing in the left-most position in a listing.
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


  public ListingImagesResultsInner url75x75(String url75x75) {
    
    this.url75x75 = url75x75;
    return this;
  }

   /**
   * The url string for a 75x75 pixel thumbnail of the image.
   * @return url75x75
  **/
  @javax.annotation.Nullable

  public String getUrl75x75() {
    return url75x75;
  }


  public void setUrl75x75(String url75x75) {
    this.url75x75 = url75x75;
  }


  public ListingImagesResultsInner url170x135(String url170x135) {
    
    this.url170x135 = url170x135;
    return this;
  }

   /**
   * The url string for a 170x135 pixel thumbnail of the image.
   * @return url170x135
  **/
  @javax.annotation.Nullable

  public String getUrl170x135() {
    return url170x135;
  }


  public void setUrl170x135(String url170x135) {
    this.url170x135 = url170x135;
  }


  public ListingImagesResultsInner url570xN(String url570xN) {
    
    this.url570xN = url570xN;
    return this;
  }

   /**
   * The url string for a thumbnail of the image, no more than 570 pixels wide with variable height.
   * @return url570xN
  **/
  @javax.annotation.Nullable

  public String getUrl570xN() {
    return url570xN;
  }


  public void setUrl570xN(String url570xN) {
    this.url570xN = url570xN;
  }


  public ListingImagesResultsInner urlFullxfull(String urlFullxfull) {
    
    this.urlFullxfull = urlFullxfull;
    return this;
  }

   /**
   * The url string for the full-size image, up to 3000 pixels in each dimension.
   * @return urlFullxfull
  **/
  @javax.annotation.Nullable

  public String getUrlFullxfull() {
    return urlFullxfull;
  }


  public void setUrlFullxfull(String urlFullxfull) {
    this.urlFullxfull = urlFullxfull;
  }


  public ListingImagesResultsInner fullHeight(Long fullHeight) {
    
    this.fullHeight = fullHeight;
    return this;
  }

   /**
   * The numeric height, measured in pixels, of the full-sized image referenced in url_fullxfull.
   * minimum: 0
   * @return fullHeight
  **/
  @javax.annotation.Nullable

  public Long getFullHeight() {
    return fullHeight;
  }


  public void setFullHeight(Long fullHeight) {
    this.fullHeight = fullHeight;
  }


  public ListingImagesResultsInner fullWidth(Long fullWidth) {
    
    this.fullWidth = fullWidth;
    return this;
  }

   /**
   * The numeric width, measured in pixels, of the full-sized image referenced in url_fullxfull.
   * minimum: 0
   * @return fullWidth
  **/
  @javax.annotation.Nullable

  public Long getFullWidth() {
    return fullWidth;
  }


  public void setFullWidth(Long fullWidth) {
    this.fullWidth = fullWidth;
  }


  public ListingImagesResultsInner altText(String altText) {
    
    this.altText = altText;
    return this;
  }

   /**
   * Alt text for the listing image. Max length 500 characters.
   * @return altText
  **/
  @javax.annotation.Nullable

  public String getAltText() {
    return altText;
  }


  public void setAltText(String altText) {
    this.altText = altText;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingImagesResultsInner listingImagesResultsInner = (ListingImagesResultsInner) o;
    return Objects.equals(this.listingId, listingImagesResultsInner.listingId) &&
        Objects.equals(this.listingImageId, listingImagesResultsInner.listingImageId) &&
        Objects.equals(this.hexCode, listingImagesResultsInner.hexCode) &&
        Objects.equals(this.red, listingImagesResultsInner.red) &&
        Objects.equals(this.green, listingImagesResultsInner.green) &&
        Objects.equals(this.blue, listingImagesResultsInner.blue) &&
        Objects.equals(this.hue, listingImagesResultsInner.hue) &&
        Objects.equals(this.saturation, listingImagesResultsInner.saturation) &&
        Objects.equals(this.brightness, listingImagesResultsInner.brightness) &&
        Objects.equals(this.isBlackAndWhite, listingImagesResultsInner.isBlackAndWhite) &&
        Objects.equals(this.creationTsz, listingImagesResultsInner.creationTsz) &&
        Objects.equals(this.createdTimestamp, listingImagesResultsInner.createdTimestamp) &&
        Objects.equals(this.rank, listingImagesResultsInner.rank) &&
        Objects.equals(this.url75x75, listingImagesResultsInner.url75x75) &&
        Objects.equals(this.url170x135, listingImagesResultsInner.url170x135) &&
        Objects.equals(this.url570xN, listingImagesResultsInner.url570xN) &&
        Objects.equals(this.urlFullxfull, listingImagesResultsInner.urlFullxfull) &&
        Objects.equals(this.fullHeight, listingImagesResultsInner.fullHeight) &&
        Objects.equals(this.fullWidth, listingImagesResultsInner.fullWidth) &&
        Objects.equals(this.altText, listingImagesResultsInner.altText);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(listingId, listingImageId, hexCode, red, green, blue, hue, saturation, brightness, isBlackAndWhite, creationTsz, createdTimestamp, rank, url75x75, url170x135, url570xN, urlFullxfull, fullHeight, fullWidth, altText);
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
    sb.append("class ListingImagesResultsInner {\n");
    sb.append("    listingId: ").append(toIndentedString(listingId)).append("\n");
    sb.append("    listingImageId: ").append(toIndentedString(listingImageId)).append("\n");
    sb.append("    hexCode: ").append(toIndentedString(hexCode)).append("\n");
    sb.append("    red: ").append(toIndentedString(red)).append("\n");
    sb.append("    green: ").append(toIndentedString(green)).append("\n");
    sb.append("    blue: ").append(toIndentedString(blue)).append("\n");
    sb.append("    hue: ").append(toIndentedString(hue)).append("\n");
    sb.append("    saturation: ").append(toIndentedString(saturation)).append("\n");
    sb.append("    brightness: ").append(toIndentedString(brightness)).append("\n");
    sb.append("    isBlackAndWhite: ").append(toIndentedString(isBlackAndWhite)).append("\n");
    sb.append("    creationTsz: ").append(toIndentedString(creationTsz)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    url75x75: ").append(toIndentedString(url75x75)).append("\n");
    sb.append("    url170x135: ").append(toIndentedString(url170x135)).append("\n");
    sb.append("    url570xN: ").append(toIndentedString(url570xN)).append("\n");
    sb.append("    urlFullxfull: ").append(toIndentedString(urlFullxfull)).append("\n");
    sb.append("    fullHeight: ").append(toIndentedString(fullHeight)).append("\n");
    sb.append("    fullWidth: ").append(toIndentedString(fullWidth)).append("\n");
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
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
    openapiFields.add("listing_image_id");
    openapiFields.add("hex_code");
    openapiFields.add("red");
    openapiFields.add("green");
    openapiFields.add("blue");
    openapiFields.add("hue");
    openapiFields.add("saturation");
    openapiFields.add("brightness");
    openapiFields.add("is_black_and_white");
    openapiFields.add("creation_tsz");
    openapiFields.add("created_timestamp");
    openapiFields.add("rank");
    openapiFields.add("url_75x75");
    openapiFields.add("url_170x135");
    openapiFields.add("url_570xN");
    openapiFields.add("url_fullxfull");
    openapiFields.add("full_height");
    openapiFields.add("full_width");
    openapiFields.add("alt_text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListingImagesResultsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListingImagesResultsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListingImagesResultsInner is not found in the empty JSON string", ListingImagesResultsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListingImagesResultsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListingImagesResultsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("hex_code") != null && !jsonObj.get("hex_code").isJsonNull()) && !jsonObj.get("hex_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hex_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hex_code").toString()));
      }
      if ((jsonObj.get("url_75x75") != null && !jsonObj.get("url_75x75").isJsonNull()) && !jsonObj.get("url_75x75").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url_75x75` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url_75x75").toString()));
      }
      if ((jsonObj.get("url_170x135") != null && !jsonObj.get("url_170x135").isJsonNull()) && !jsonObj.get("url_170x135").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url_170x135` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url_170x135").toString()));
      }
      if ((jsonObj.get("url_570xN") != null && !jsonObj.get("url_570xN").isJsonNull()) && !jsonObj.get("url_570xN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url_570xN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url_570xN").toString()));
      }
      if ((jsonObj.get("url_fullxfull") != null && !jsonObj.get("url_fullxfull").isJsonNull()) && !jsonObj.get("url_fullxfull").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url_fullxfull` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url_fullxfull").toString()));
      }
      if ((jsonObj.get("alt_text") != null && !jsonObj.get("alt_text").isJsonNull()) && !jsonObj.get("alt_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alt_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alt_text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListingImagesResultsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListingImagesResultsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListingImagesResultsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListingImagesResultsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ListingImagesResultsInner>() {
           @Override
           public void write(JsonWriter out, ListingImagesResultsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListingImagesResultsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListingImagesResultsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListingImagesResultsInner
  * @throws IOException if the JSON string is invalid with respect to ListingImagesResultsInner
  */
  public static ListingImagesResultsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListingImagesResultsInner.class);
  }

 /**
  * Convert an instance of ListingImagesResultsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

