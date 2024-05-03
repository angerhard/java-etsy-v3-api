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
import org.openapitools.client.model.ShopShippingProfileShippingProfileDestinationsInner;
import org.openapitools.client.model.ShopShippingProfileShippingProfileUpgradesInner;
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
 * Represents a profile used to set a listing&#39;s shipping information. Please note that it&#39;s not possible to create calculated shipping templates via the API. However, you can associate calculated shipping profiles created from Shop Manager with listings using the API.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-03T07:15:13.096948200+02:00[Europe/Berlin]")
public class ShopShippingProfile {
  public static final String SERIALIZED_NAME_SHIPPING_PROFILE_ID = "shipping_profile_id";
  @SerializedName(SERIALIZED_NAME_SHIPPING_PROFILE_ID)
  private Long shippingProfileId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Long userId;

  public static final String SERIALIZED_NAME_MIN_PROCESSING_DAYS = "min_processing_days";
  @SerializedName(SERIALIZED_NAME_MIN_PROCESSING_DAYS)
  private Long minProcessingDays;

  public static final String SERIALIZED_NAME_MAX_PROCESSING_DAYS = "max_processing_days";
  @SerializedName(SERIALIZED_NAME_MAX_PROCESSING_DAYS)
  private Long maxProcessingDays;

  public static final String SERIALIZED_NAME_PROCESSING_DAYS_DISPLAY_LABEL = "processing_days_display_label";
  @SerializedName(SERIALIZED_NAME_PROCESSING_DAYS_DISPLAY_LABEL)
  private String processingDaysDisplayLabel;

  public static final String SERIALIZED_NAME_ORIGIN_COUNTRY_ISO = "origin_country_iso";
  @SerializedName(SERIALIZED_NAME_ORIGIN_COUNTRY_ISO)
  private String originCountryIso;

  public static final String SERIALIZED_NAME_IS_DELETED = "is_deleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_SHIPPING_PROFILE_DESTINATIONS = "shipping_profile_destinations";
  @SerializedName(SERIALIZED_NAME_SHIPPING_PROFILE_DESTINATIONS)
  private List<ShopShippingProfileShippingProfileDestinationsInner> shippingProfileDestinations = new ArrayList<>();

  public static final String SERIALIZED_NAME_SHIPPING_PROFILE_UPGRADES = "shipping_profile_upgrades";
  @SerializedName(SERIALIZED_NAME_SHIPPING_PROFILE_UPGRADES)
  private List<ShopShippingProfileShippingProfileUpgradesInner> shippingProfileUpgrades = new ArrayList<>();

  public static final String SERIALIZED_NAME_ORIGIN_POSTAL_CODE = "origin_postal_code";
  @SerializedName(SERIALIZED_NAME_ORIGIN_POSTAL_CODE)
  private String originPostalCode;

  /**
   * Gets or Sets profileType
   */
  @JsonAdapter(ProfileTypeEnum.Adapter.class)
  public enum ProfileTypeEnum {
    MANUAL("manual"),
    
    CALCULATED("calculated");

    private String value;

    ProfileTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProfileTypeEnum fromValue(String value) {
      for (ProfileTypeEnum b : ProfileTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProfileTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProfileTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProfileTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProfileTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROFILE_TYPE = "profile_type";
  @SerializedName(SERIALIZED_NAME_PROFILE_TYPE)
  private ProfileTypeEnum profileType;

  public static final String SERIALIZED_NAME_DOMESTIC_HANDLING_FEE = "domestic_handling_fee";
  @SerializedName(SERIALIZED_NAME_DOMESTIC_HANDLING_FEE)
  private Float domesticHandlingFee = 0f;

  public static final String SERIALIZED_NAME_INTERNATIONAL_HANDLING_FEE = "international_handling_fee";
  @SerializedName(SERIALIZED_NAME_INTERNATIONAL_HANDLING_FEE)
  private Float internationalHandlingFee = 0f;

  public ShopShippingProfile() {
  }

  public ShopShippingProfile shippingProfileId(Long shippingProfileId) {
    
    this.shippingProfileId = shippingProfileId;
    return this;
  }

   /**
   * The numeric ID of the shipping profile.
   * minimum: 1
   * @return shippingProfileId
  **/
  @javax.annotation.Nullable

  public Long getShippingProfileId() {
    return shippingProfileId;
  }


  public void setShippingProfileId(Long shippingProfileId) {
    this.shippingProfileId = shippingProfileId;
  }


  public ShopShippingProfile title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The name string of this shipping profile.
   * @return title
  **/
  @javax.annotation.Nullable

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ShopShippingProfile userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The numeric ID for the [user](/documentation/reference#tag/User) who owns the shipping profile.
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


  public ShopShippingProfile minProcessingDays(Long minProcessingDays) {
    
    this.minProcessingDays = minProcessingDays;
    return this;
  }

   /**
   * The minimum number of days for processing the listing.
   * minimum: 0
   * @return minProcessingDays
  **/
  @javax.annotation.Nullable

  public Long getMinProcessingDays() {
    return minProcessingDays;
  }


  public void setMinProcessingDays(Long minProcessingDays) {
    this.minProcessingDays = minProcessingDays;
  }


  public ShopShippingProfile maxProcessingDays(Long maxProcessingDays) {
    
    this.maxProcessingDays = maxProcessingDays;
    return this;
  }

   /**
   * The maximum number of days for processing the listing.
   * minimum: 0
   * @return maxProcessingDays
  **/
  @javax.annotation.Nullable

  public Long getMaxProcessingDays() {
    return maxProcessingDays;
  }


  public void setMaxProcessingDays(Long maxProcessingDays) {
    this.maxProcessingDays = maxProcessingDays;
  }


  public ShopShippingProfile processingDaysDisplayLabel(String processingDaysDisplayLabel) {
    
    this.processingDaysDisplayLabel = processingDaysDisplayLabel;
    return this;
  }

   /**
   * Translated display label string for processing days.
   * @return processingDaysDisplayLabel
  **/
  @javax.annotation.Nullable

  public String getProcessingDaysDisplayLabel() {
    return processingDaysDisplayLabel;
  }


  public void setProcessingDaysDisplayLabel(String processingDaysDisplayLabel) {
    this.processingDaysDisplayLabel = processingDaysDisplayLabel;
  }


  public ShopShippingProfile originCountryIso(String originCountryIso) {
    
    this.originCountryIso = originCountryIso;
    return this;
  }

   /**
   * The ISO code of the country from which the listing ships.
   * @return originCountryIso
  **/
  @javax.annotation.Nullable

  public String getOriginCountryIso() {
    return originCountryIso;
  }


  public void setOriginCountryIso(String originCountryIso) {
    this.originCountryIso = originCountryIso;
  }


  public ShopShippingProfile isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * When true, someone deleted this shipping profile.
   * @return isDeleted
  **/
  @javax.annotation.Nullable

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public ShopShippingProfile shippingProfileDestinations(List<ShopShippingProfileShippingProfileDestinationsInner> shippingProfileDestinations) {
    
    this.shippingProfileDestinations = shippingProfileDestinations;
    return this;
  }

  public ShopShippingProfile addShippingProfileDestinationsItem(ShopShippingProfileShippingProfileDestinationsInner shippingProfileDestinationsItem) {
    if (this.shippingProfileDestinations == null) {
      this.shippingProfileDestinations = new ArrayList<>();
    }
    this.shippingProfileDestinations.add(shippingProfileDestinationsItem);
    return this;
  }

   /**
   * A list of [shipping profile destinations](/documentation/reference/#operation/createShopShippingProfileDestination) available for this shipping profile.
   * @return shippingProfileDestinations
  **/
  @javax.annotation.Nullable

  public List<ShopShippingProfileShippingProfileDestinationsInner> getShippingProfileDestinations() {
    return shippingProfileDestinations;
  }


  public void setShippingProfileDestinations(List<ShopShippingProfileShippingProfileDestinationsInner> shippingProfileDestinations) {
    this.shippingProfileDestinations = shippingProfileDestinations;
  }


  public ShopShippingProfile shippingProfileUpgrades(List<ShopShippingProfileShippingProfileUpgradesInner> shippingProfileUpgrades) {
    
    this.shippingProfileUpgrades = shippingProfileUpgrades;
    return this;
  }

  public ShopShippingProfile addShippingProfileUpgradesItem(ShopShippingProfileShippingProfileUpgradesInner shippingProfileUpgradesItem) {
    if (this.shippingProfileUpgrades == null) {
      this.shippingProfileUpgrades = new ArrayList<>();
    }
    this.shippingProfileUpgrades.add(shippingProfileUpgradesItem);
    return this;
  }

   /**
   * A list of [shipping profile upgrades](/documentation/reference/#operation/createShopShippingProfileUpgrade) available for this shipping profile.
   * @return shippingProfileUpgrades
  **/
  @javax.annotation.Nullable

  public List<ShopShippingProfileShippingProfileUpgradesInner> getShippingProfileUpgrades() {
    return shippingProfileUpgrades;
  }


  public void setShippingProfileUpgrades(List<ShopShippingProfileShippingProfileUpgradesInner> shippingProfileUpgrades) {
    this.shippingProfileUpgrades = shippingProfileUpgrades;
  }


  public ShopShippingProfile originPostalCode(String originPostalCode) {
    
    this.originPostalCode = originPostalCode;
    return this;
  }

   /**
   * The postal code string (not necessarily a number) for the location from which the listing ships. Required if the &#x60;origin_country_iso&#x60; supports postal codes. See the [Fulfillment Tutorial docs](https://developer.etsy.com/documentation/tutorials/fulfillment/#countries-requiring-postal-codes) for more info
   * @return originPostalCode
  **/
  @javax.annotation.Nullable

  public String getOriginPostalCode() {
    return originPostalCode;
  }


  public void setOriginPostalCode(String originPostalCode) {
    this.originPostalCode = originPostalCode;
  }


  public ShopShippingProfile profileType(ProfileTypeEnum profileType) {
    
    this.profileType = profileType;
    return this;
  }

   /**
   * Get profileType
   * @return profileType
  **/
  @javax.annotation.Nullable

  public ProfileTypeEnum getProfileType() {
    return profileType;
  }


  public void setProfileType(ProfileTypeEnum profileType) {
    this.profileType = profileType;
  }


  public ShopShippingProfile domesticHandlingFee(Float domesticHandlingFee) {
    
    this.domesticHandlingFee = domesticHandlingFee;
    return this;
  }

   /**
   * The domestic handling fee added to buyer&#39;s shipping total - only available for calculated shipping profiles.
   * minimum: 0
   * @return domesticHandlingFee
  **/
  @javax.annotation.Nullable

  public Float getDomesticHandlingFee() {
    return domesticHandlingFee;
  }


  public void setDomesticHandlingFee(Float domesticHandlingFee) {
    this.domesticHandlingFee = domesticHandlingFee;
  }


  public ShopShippingProfile internationalHandlingFee(Float internationalHandlingFee) {
    
    this.internationalHandlingFee = internationalHandlingFee;
    return this;
  }

   /**
   * The international handling fee added to buyer&#39;s shipping total - only available for calculated shipping profiles.
   * minimum: 0
   * @return internationalHandlingFee
  **/
  @javax.annotation.Nullable

  public Float getInternationalHandlingFee() {
    return internationalHandlingFee;
  }


  public void setInternationalHandlingFee(Float internationalHandlingFee) {
    this.internationalHandlingFee = internationalHandlingFee;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopShippingProfile shopShippingProfile = (ShopShippingProfile) o;
    return Objects.equals(this.shippingProfileId, shopShippingProfile.shippingProfileId) &&
        Objects.equals(this.title, shopShippingProfile.title) &&
        Objects.equals(this.userId, shopShippingProfile.userId) &&
        Objects.equals(this.minProcessingDays, shopShippingProfile.minProcessingDays) &&
        Objects.equals(this.maxProcessingDays, shopShippingProfile.maxProcessingDays) &&
        Objects.equals(this.processingDaysDisplayLabel, shopShippingProfile.processingDaysDisplayLabel) &&
        Objects.equals(this.originCountryIso, shopShippingProfile.originCountryIso) &&
        Objects.equals(this.isDeleted, shopShippingProfile.isDeleted) &&
        Objects.equals(this.shippingProfileDestinations, shopShippingProfile.shippingProfileDestinations) &&
        Objects.equals(this.shippingProfileUpgrades, shopShippingProfile.shippingProfileUpgrades) &&
        Objects.equals(this.originPostalCode, shopShippingProfile.originPostalCode) &&
        Objects.equals(this.profileType, shopShippingProfile.profileType) &&
        Objects.equals(this.domesticHandlingFee, shopShippingProfile.domesticHandlingFee) &&
        Objects.equals(this.internationalHandlingFee, shopShippingProfile.internationalHandlingFee);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingProfileId, title, userId, minProcessingDays, maxProcessingDays, processingDaysDisplayLabel, originCountryIso, isDeleted, shippingProfileDestinations, shippingProfileUpgrades, originPostalCode, profileType, domesticHandlingFee, internationalHandlingFee);
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
    sb.append("class ShopShippingProfile {\n");
    sb.append("    shippingProfileId: ").append(toIndentedString(shippingProfileId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    minProcessingDays: ").append(toIndentedString(minProcessingDays)).append("\n");
    sb.append("    maxProcessingDays: ").append(toIndentedString(maxProcessingDays)).append("\n");
    sb.append("    processingDaysDisplayLabel: ").append(toIndentedString(processingDaysDisplayLabel)).append("\n");
    sb.append("    originCountryIso: ").append(toIndentedString(originCountryIso)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    shippingProfileDestinations: ").append(toIndentedString(shippingProfileDestinations)).append("\n");
    sb.append("    shippingProfileUpgrades: ").append(toIndentedString(shippingProfileUpgrades)).append("\n");
    sb.append("    originPostalCode: ").append(toIndentedString(originPostalCode)).append("\n");
    sb.append("    profileType: ").append(toIndentedString(profileType)).append("\n");
    sb.append("    domesticHandlingFee: ").append(toIndentedString(domesticHandlingFee)).append("\n");
    sb.append("    internationalHandlingFee: ").append(toIndentedString(internationalHandlingFee)).append("\n");
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
    openapiFields.add("shipping_profile_id");
    openapiFields.add("title");
    openapiFields.add("user_id");
    openapiFields.add("min_processing_days");
    openapiFields.add("max_processing_days");
    openapiFields.add("processing_days_display_label");
    openapiFields.add("origin_country_iso");
    openapiFields.add("is_deleted");
    openapiFields.add("shipping_profile_destinations");
    openapiFields.add("shipping_profile_upgrades");
    openapiFields.add("origin_postal_code");
    openapiFields.add("profile_type");
    openapiFields.add("domestic_handling_fee");
    openapiFields.add("international_handling_fee");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShopShippingProfile
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ShopShippingProfile.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShopShippingProfile is not found in the empty JSON string", ShopShippingProfile.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ShopShippingProfile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShopShippingProfile` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("processing_days_display_label") != null && !jsonObj.get("processing_days_display_label").isJsonNull()) && !jsonObj.get("processing_days_display_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processing_days_display_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processing_days_display_label").toString()));
      }
      if ((jsonObj.get("origin_country_iso") != null && !jsonObj.get("origin_country_iso").isJsonNull()) && !jsonObj.get("origin_country_iso").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin_country_iso` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin_country_iso").toString()));
      }
      if (jsonObj.get("shipping_profile_destinations") != null && !jsonObj.get("shipping_profile_destinations").isJsonNull()) {
        JsonArray jsonArrayshippingProfileDestinations = jsonObj.getAsJsonArray("shipping_profile_destinations");
        if (jsonArrayshippingProfileDestinations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("shipping_profile_destinations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `shipping_profile_destinations` to be an array in the JSON string but got `%s`", jsonObj.get("shipping_profile_destinations").toString()));
          }

          // validate the optional field `shipping_profile_destinations` (array)
          for (int i = 0; i < jsonArrayshippingProfileDestinations.size(); i++) {
            ShopShippingProfileShippingProfileDestinationsInner.validateJsonObject(jsonArrayshippingProfileDestinations.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("shipping_profile_upgrades") != null && !jsonObj.get("shipping_profile_upgrades").isJsonNull()) {
        JsonArray jsonArrayshippingProfileUpgrades = jsonObj.getAsJsonArray("shipping_profile_upgrades");
        if (jsonArrayshippingProfileUpgrades != null) {
          // ensure the json data is an array
          if (!jsonObj.get("shipping_profile_upgrades").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `shipping_profile_upgrades` to be an array in the JSON string but got `%s`", jsonObj.get("shipping_profile_upgrades").toString()));
          }

          // validate the optional field `shipping_profile_upgrades` (array)
          for (int i = 0; i < jsonArrayshippingProfileUpgrades.size(); i++) {
            ShopShippingProfileShippingProfileUpgradesInner.validateJsonObject(jsonArrayshippingProfileUpgrades.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("origin_postal_code") != null && !jsonObj.get("origin_postal_code").isJsonNull()) && !jsonObj.get("origin_postal_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin_postal_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin_postal_code").toString()));
      }
      if ((jsonObj.get("profile_type") != null && !jsonObj.get("profile_type").isJsonNull()) && !jsonObj.get("profile_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profile_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profile_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShopShippingProfile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShopShippingProfile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShopShippingProfile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShopShippingProfile.class));

       return (TypeAdapter<T>) new TypeAdapter<ShopShippingProfile>() {
           @Override
           public void write(JsonWriter out, ShopShippingProfile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShopShippingProfile read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShopShippingProfile given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShopShippingProfile
  * @throws IOException if the JSON string is invalid with respect to ShopShippingProfile
  */
  public static ShopShippingProfile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShopShippingProfile.class);
  }

 /**
  * Convert an instance of ShopShippingProfile to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

