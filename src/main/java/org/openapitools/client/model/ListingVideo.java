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
import com.google.gson.annotations.JsonAdapter;
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
 * Reference urls and metadata for a video associated with a specific listing.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-18T13:10:02.644710400+01:00[Europe/Berlin]")
public class ListingVideo {
  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private Long videoId;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width;

  public static final String SERIALIZED_NAME_THUMBNAIL_URL = "thumbnail_url";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL_URL)
  private String thumbnailUrl;

  public static final String SERIALIZED_NAME_VIDEO_URL = "video_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_URL)
  private String videoUrl;

  /**
   * The current state of a given video. Value is one of &#x60;active&#x60;, &#x60;inactive&#x60;, &#x60;deleted&#x60; or &#x60;flagged&#x60;.
   */
  @JsonAdapter(VideoStateEnum.Adapter.class)
  public enum VideoStateEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive"),
    
    DELETED("deleted"),
    
    FLAGGED("flagged");

    private String value;

    VideoStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VideoStateEnum fromValue(String value) {
      for (VideoStateEnum b : VideoStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VideoStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VideoStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VideoStateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VideoStateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VIDEO_STATE = "video_state";
  @SerializedName(SERIALIZED_NAME_VIDEO_STATE)
  private VideoStateEnum videoState;

  public ListingVideo() {
  }

  public ListingVideo videoId(Long videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * The unique ID of a video associated with a listing.
   * minimum: 1
   * @return videoId
  **/
  @javax.annotation.Nullable

  public Long getVideoId() {
    return videoId;
  }


  public void setVideoId(Long videoId) {
    this.videoId = videoId;
  }


  public ListingVideo height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * The video height dimension in pixels.
   * @return height
  **/
  @javax.annotation.Nullable

  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public ListingVideo width(Long width) {
    
    this.width = width;
    return this;
  }

   /**
   * The video width dimension in pixels.
   * @return width
  **/
  @javax.annotation.Nullable

  public Long getWidth() {
    return width;
  }


  public void setWidth(Long width) {
    this.width = width;
  }


  public ListingVideo thumbnailUrl(String thumbnailUrl) {
    
    this.thumbnailUrl = thumbnailUrl;
    return this;
  }

   /**
   * The url of the video thumbnail.
   * @return thumbnailUrl
  **/
  @javax.annotation.Nullable

  public String getThumbnailUrl() {
    return thumbnailUrl;
  }


  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }


  public ListingVideo videoUrl(String videoUrl) {
    
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * The url of the video file.
   * @return videoUrl
  **/
  @javax.annotation.Nullable

  public String getVideoUrl() {
    return videoUrl;
  }


  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }


  public ListingVideo videoState(VideoStateEnum videoState) {
    
    this.videoState = videoState;
    return this;
  }

   /**
   * The current state of a given video. Value is one of &#x60;active&#x60;, &#x60;inactive&#x60;, &#x60;deleted&#x60; or &#x60;flagged&#x60;.
   * @return videoState
  **/
  @javax.annotation.Nullable

  public VideoStateEnum getVideoState() {
    return videoState;
  }


  public void setVideoState(VideoStateEnum videoState) {
    this.videoState = videoState;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingVideo listingVideo = (ListingVideo) o;
    return Objects.equals(this.videoId, listingVideo.videoId) &&
        Objects.equals(this.height, listingVideo.height) &&
        Objects.equals(this.width, listingVideo.width) &&
        Objects.equals(this.thumbnailUrl, listingVideo.thumbnailUrl) &&
        Objects.equals(this.videoUrl, listingVideo.videoUrl) &&
        Objects.equals(this.videoState, listingVideo.videoState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoId, height, width, thumbnailUrl, videoUrl, videoState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListingVideo {\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    thumbnailUrl: ").append(toIndentedString(thumbnailUrl)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
    sb.append("    videoState: ").append(toIndentedString(videoState)).append("\n");
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
    openapiFields.add("video_id");
    openapiFields.add("height");
    openapiFields.add("width");
    openapiFields.add("thumbnail_url");
    openapiFields.add("video_url");
    openapiFields.add("video_state");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListingVideo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListingVideo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListingVideo is not found in the empty JSON string", ListingVideo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListingVideo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListingVideo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("thumbnail_url") != null && !jsonObj.get("thumbnail_url").isJsonNull()) && !jsonObj.get("thumbnail_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thumbnail_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thumbnail_url").toString()));
      }
      if ((jsonObj.get("video_url") != null && !jsonObj.get("video_url").isJsonNull()) && !jsonObj.get("video_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `video_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("video_url").toString()));
      }
      if ((jsonObj.get("video_state") != null && !jsonObj.get("video_state").isJsonNull()) && !jsonObj.get("video_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `video_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("video_state").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListingVideo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListingVideo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListingVideo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListingVideo.class));

       return (TypeAdapter<T>) new TypeAdapter<ListingVideo>() {
           @Override
           public void write(JsonWriter out, ListingVideo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListingVideo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListingVideo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListingVideo
  * @throws IOException if the JSON string is invalid with respect to ListingVideo
  */
  public static ListingVideo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListingVideo.class);
  }

 /**
  * Convert an instance of ListingVideo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
