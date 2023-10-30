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
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.openapitools.client.JSON;
import org.openapitools.jackson.nullable.JsonNullable;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/**
 * A representation of a shipping profile upgrade option.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-30T11:53:28.314915500+01:00[Europe/Berlin]")
public class ShopShippingProfileUpgrade {
  public static final String SERIALIZED_NAME_SHIPPING_PROFILE_ID = "shipping_profile_id";
  @SerializedName(SERIALIZED_NAME_SHIPPING_PROFILE_ID)
  private Long shippingProfileId;

  public static final String SERIALIZED_NAME_UPGRADE_ID = "upgrade_id";
  @SerializedName(SERIALIZED_NAME_UPGRADE_ID)
  private Long upgradeId;

  public static final String SERIALIZED_NAME_UPGRADE_NAME = "upgrade_name";
  @SerializedName(SERIALIZED_NAME_UPGRADE_NAME)
  private String upgradeName;

  /**
   * The type of the shipping upgrade. Domestic (0) or international (1).
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    _0("0"),
    
    _1("1");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_RANK = "rank";
  @SerializedName(SERIALIZED_NAME_RANK)
  private Long rank;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private ShopShippingProfileUpgradePrice price;

  public static final String SERIALIZED_NAME_SECONDARY_PRICE = "secondary_price";
  @SerializedName(SERIALIZED_NAME_SECONDARY_PRICE)
  private ShopShippingProfileUpgradeSecondaryPrice secondaryPrice;

  public static final String SERIALIZED_NAME_SHIPPING_CARRIER_ID = "shipping_carrier_id";
  @SerializedName(SERIALIZED_NAME_SHIPPING_CARRIER_ID)
  private Long shippingCarrierId;

  public static final String SERIALIZED_NAME_MAIL_CLASS = "mail_class";
  @SerializedName(SERIALIZED_NAME_MAIL_CLASS)
  private String mailClass;

  public static final String SERIALIZED_NAME_MIN_DELIVERY_DAYS = "min_delivery_days";
  @SerializedName(SERIALIZED_NAME_MIN_DELIVERY_DAYS)
  private Long minDeliveryDays;

  public static final String SERIALIZED_NAME_MAX_DELIVERY_DAYS = "max_delivery_days";
  @SerializedName(SERIALIZED_NAME_MAX_DELIVERY_DAYS)
  private Long maxDeliveryDays;

  public ShopShippingProfileUpgrade() {
  }

  public ShopShippingProfileUpgrade shippingProfileId(Long shippingProfileId) {
    
    this.shippingProfileId = shippingProfileId;
    return this;
  }

   /**
   * The numeric ID of the base shipping profile.
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


  public ShopShippingProfileUpgrade upgradeId(Long upgradeId) {
    
    this.upgradeId = upgradeId;
    return this;
  }

   /**
   * The numeric ID that is associated with a shipping upgrade
   * minimum: 1
   * @return upgradeId
  **/
  @javax.annotation.Nullable

  public Long getUpgradeId() {
    return upgradeId;
  }


  public void setUpgradeId(Long upgradeId) {
    this.upgradeId = upgradeId;
  }


  public ShopShippingProfileUpgrade upgradeName(String upgradeName) {
    
    this.upgradeName = upgradeName;
    return this;
  }

   /**
   * Name for the shipping upgrade shown to shoppers at checkout, e.g. USPS Priority.
   * @return upgradeName
  **/
  @javax.annotation.Nullable

  public String getUpgradeName() {
    return upgradeName;
  }


  public void setUpgradeName(String upgradeName) {
    this.upgradeName = upgradeName;
  }


  public ShopShippingProfileUpgrade type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the shipping upgrade. Domestic (0) or international (1).
   * @return type
  **/
  @javax.annotation.Nullable

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ShopShippingProfileUpgrade rank(Long rank) {
    
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


  public ShopShippingProfileUpgrade language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * The IETF language tag for the language of the shipping profile. Ex: &#x60;de&#x60;, &#x60;en&#x60;, &#x60;es&#x60;, &#x60;fr&#x60;, &#x60;it&#x60;, &#x60;ja&#x60;, &#x60;nl&#x60;, &#x60;pl&#x60;, &#x60;pt&#x60;
   * @return language
  **/
  @javax.annotation.Nullable

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public ShopShippingProfileUpgrade price(ShopShippingProfileUpgradePrice price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable

  public ShopShippingProfileUpgradePrice getPrice() {
    return price;
  }


  public void setPrice(ShopShippingProfileUpgradePrice price) {
    this.price = price;
  }


  public ShopShippingProfileUpgrade secondaryPrice(ShopShippingProfileUpgradeSecondaryPrice secondaryPrice) {
    
    this.secondaryPrice = secondaryPrice;
    return this;
  }

   /**
   * Get secondaryPrice
   * @return secondaryPrice
  **/
  @javax.annotation.Nullable

  public ShopShippingProfileUpgradeSecondaryPrice getSecondaryPrice() {
    return secondaryPrice;
  }


  public void setSecondaryPrice(ShopShippingProfileUpgradeSecondaryPrice secondaryPrice) {
    this.secondaryPrice = secondaryPrice;
  }


  public ShopShippingProfileUpgrade shippingCarrierId(Long shippingCarrierId) {
    
    this.shippingCarrierId = shippingCarrierId;
    return this;
  }

   /**
   * The unique ID of a supported shipping carrier, which is used to calculate an Estimated Delivery Date. **Required with &#x60;mail_class&#x60;** if &#x60;min_delivery_days&#x60; and &#x60;max_delivery_days&#x60; are null.
   * @return shippingCarrierId
  **/
  @javax.annotation.Nullable

  public Long getShippingCarrierId() {
    return shippingCarrierId;
  }


  public void setShippingCarrierId(Long shippingCarrierId) {
    this.shippingCarrierId = shippingCarrierId;
  }


  public ShopShippingProfileUpgrade mailClass(String mailClass) {
    
    this.mailClass = mailClass;
    return this;
  }

   /**
   * The unique ID string of a shipping carrier&#39;s mail class, which is used to calculate an estimated delivery date. **Required with &#x60;shipping_carrier_id&#x60;** if &#x60;min_delivery_days&#x60; and &#x60;max_delivery_days&#x60; are null.
   * @return mailClass
  **/
  @javax.annotation.Nullable

  public String getMailClass() {
    return mailClass;
  }


  public void setMailClass(String mailClass) {
    this.mailClass = mailClass;
  }


  public ShopShippingProfileUpgrade minDeliveryDays(Long minDeliveryDays) {
    
    this.minDeliveryDays = minDeliveryDays;
    return this;
  }

   /**
   * The minimum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with &#x60;max_delivery_days&#x60;** if &#x60;mail_class&#x60; is null.
   * minimum: 1
   * maximum: 45
   * @return minDeliveryDays
  **/
  @javax.annotation.Nullable

  public Long getMinDeliveryDays() {
    return minDeliveryDays;
  }


  public void setMinDeliveryDays(Long minDeliveryDays) {
    this.minDeliveryDays = minDeliveryDays;
  }


  public ShopShippingProfileUpgrade maxDeliveryDays(Long maxDeliveryDays) {
    
    this.maxDeliveryDays = maxDeliveryDays;
    return this;
  }

   /**
   * The maximum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with &#x60;min_delivery_days&#x60;** if &#x60;mail_class&#x60; is null.
   * minimum: 1
   * maximum: 45
   * @return maxDeliveryDays
  **/
  @javax.annotation.Nullable

  public Long getMaxDeliveryDays() {
    return maxDeliveryDays;
  }


  public void setMaxDeliveryDays(Long maxDeliveryDays) {
    this.maxDeliveryDays = maxDeliveryDays;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopShippingProfileUpgrade shopShippingProfileUpgrade = (ShopShippingProfileUpgrade) o;
    return Objects.equals(this.shippingProfileId, shopShippingProfileUpgrade.shippingProfileId) &&
        Objects.equals(this.upgradeId, shopShippingProfileUpgrade.upgradeId) &&
        Objects.equals(this.upgradeName, shopShippingProfileUpgrade.upgradeName) &&
        Objects.equals(this.type, shopShippingProfileUpgrade.type) &&
        Objects.equals(this.rank, shopShippingProfileUpgrade.rank) &&
        Objects.equals(this.language, shopShippingProfileUpgrade.language) &&
        Objects.equals(this.price, shopShippingProfileUpgrade.price) &&
        Objects.equals(this.secondaryPrice, shopShippingProfileUpgrade.secondaryPrice) &&
        Objects.equals(this.shippingCarrierId, shopShippingProfileUpgrade.shippingCarrierId) &&
        Objects.equals(this.mailClass, shopShippingProfileUpgrade.mailClass) &&
        Objects.equals(this.minDeliveryDays, shopShippingProfileUpgrade.minDeliveryDays) &&
        Objects.equals(this.maxDeliveryDays, shopShippingProfileUpgrade.maxDeliveryDays);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingProfileId, upgradeId, upgradeName, type, rank, language, price, secondaryPrice, shippingCarrierId, mailClass, minDeliveryDays, maxDeliveryDays);
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
    sb.append("class ShopShippingProfileUpgrade {\n");
    sb.append("    shippingProfileId: ").append(toIndentedString(shippingProfileId)).append("\n");
    sb.append("    upgradeId: ").append(toIndentedString(upgradeId)).append("\n");
    sb.append("    upgradeName: ").append(toIndentedString(upgradeName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    secondaryPrice: ").append(toIndentedString(secondaryPrice)).append("\n");
    sb.append("    shippingCarrierId: ").append(toIndentedString(shippingCarrierId)).append("\n");
    sb.append("    mailClass: ").append(toIndentedString(mailClass)).append("\n");
    sb.append("    minDeliveryDays: ").append(toIndentedString(minDeliveryDays)).append("\n");
    sb.append("    maxDeliveryDays: ").append(toIndentedString(maxDeliveryDays)).append("\n");
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
    openapiFields.add("upgrade_id");
    openapiFields.add("upgrade_name");
    openapiFields.add("type");
    openapiFields.add("rank");
    openapiFields.add("language");
    openapiFields.add("price");
    openapiFields.add("secondary_price");
    openapiFields.add("shipping_carrier_id");
    openapiFields.add("mail_class");
    openapiFields.add("min_delivery_days");
    openapiFields.add("max_delivery_days");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShopShippingProfileUpgrade
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ShopShippingProfileUpgrade.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShopShippingProfileUpgrade is not found in the empty JSON string", ShopShippingProfileUpgrade.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ShopShippingProfileUpgrade.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShopShippingProfileUpgrade` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("upgrade_name") != null && !jsonObj.get("upgrade_name").isJsonNull()) && !jsonObj.get("upgrade_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upgrade_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upgrade_name").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      // validate the optional field `price`
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull()) {
        ShopShippingProfileUpgradePrice.validateJsonObject(jsonObj.getAsJsonObject("price"));
      }
      // validate the optional field `secondary_price`
      if (jsonObj.get("secondary_price") != null && !jsonObj.get("secondary_price").isJsonNull()) {
        ShopShippingProfileUpgradeSecondaryPrice.validateJsonObject(jsonObj.getAsJsonObject("secondary_price"));
      }
      if ((jsonObj.get("mail_class") != null && !jsonObj.get("mail_class").isJsonNull()) && !jsonObj.get("mail_class").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mail_class` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mail_class").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShopShippingProfileUpgrade.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShopShippingProfileUpgrade' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShopShippingProfileUpgrade> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShopShippingProfileUpgrade.class));

       return (TypeAdapter<T>) new TypeAdapter<ShopShippingProfileUpgrade>() {
           @Override
           public void write(JsonWriter out, ShopShippingProfileUpgrade value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShopShippingProfileUpgrade read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShopShippingProfileUpgrade given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShopShippingProfileUpgrade
  * @throws IOException if the JSON string is invalid with respect to ShopShippingProfileUpgrade
  */
  public static ShopShippingProfileUpgrade fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShopShippingProfileUpgrade.class);
  }

 /**
  * Convert an instance of ShopShippingProfileUpgrade to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

