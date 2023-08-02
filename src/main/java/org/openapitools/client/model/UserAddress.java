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
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/**
 * Represents a user&#39;s address.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-02T22:46:35.595209100+02:00[Europe/Berlin]")
public class UserAddress {
  public static final String SERIALIZED_NAME_USER_ADDRESS_ID = "user_address_id";
  @SerializedName(SERIALIZED_NAME_USER_ADDRESS_ID)
  private Long userAddressId;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Long userId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FIRST_LINE = "first_line";
  @SerializedName(SERIALIZED_NAME_FIRST_LINE)
  private String firstLine;

  public static final String SERIALIZED_NAME_SECOND_LINE = "second_line";
  @SerializedName(SERIALIZED_NAME_SECOND_LINE)
  private String secondLine;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  private String zip;

  public static final String SERIALIZED_NAME_ISO_COUNTRY_CODE = "iso_country_code";
  @SerializedName(SERIALIZED_NAME_ISO_COUNTRY_CODE)
  private String isoCountryCode;

  public static final String SERIALIZED_NAME_COUNTRY_NAME = "country_name";
  @SerializedName(SERIALIZED_NAME_COUNTRY_NAME)
  private String countryName;

  public static final String SERIALIZED_NAME_IS_DEFAULT_SHIPPING_ADDRESS = "is_default_shipping_address";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT_SHIPPING_ADDRESS)
  private Boolean isDefaultShippingAddress;

  public UserAddress() {
  }

  public UserAddress userAddressId(Long userAddressId) {
    
    this.userAddressId = userAddressId;
    return this;
  }

   /**
   * The numeric ID of the user&#39;s address.
   * minimum: 1
   * @return userAddressId
  **/
  @javax.annotation.Nullable

  public Long getUserAddressId() {
    return userAddressId;
  }


  public void setUserAddressId(Long userAddressId) {
    this.userAddressId = userAddressId;
  }


  public UserAddress userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The user&#39;s numeric ID.
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


  public UserAddress name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The user&#39;s name for this address.
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UserAddress firstLine(String firstLine) {
    
    this.firstLine = firstLine;
    return this;
  }

   /**
   * The first line of the user&#39;s address.
   * @return firstLine
  **/
  @javax.annotation.Nullable

  public String getFirstLine() {
    return firstLine;
  }


  public void setFirstLine(String firstLine) {
    this.firstLine = firstLine;
  }


  public UserAddress secondLine(String secondLine) {
    
    this.secondLine = secondLine;
    return this;
  }

   /**
   * The second line of the user&#39;s address.
   * @return secondLine
  **/
  @javax.annotation.Nullable

  public String getSecondLine() {
    return secondLine;
  }


  public void setSecondLine(String secondLine) {
    this.secondLine = secondLine;
  }


  public UserAddress city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The city field of the user&#39;s address.
   * @return city
  **/
  @javax.annotation.Nullable

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public UserAddress state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * The state field of the user&#39;s address.
   * @return state
  **/
  @javax.annotation.Nullable

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public UserAddress zip(String zip) {
    
    this.zip = zip;
    return this;
  }

   /**
   * The zip code field of the user&#39;s address.
   * @return zip
  **/
  @javax.annotation.Nullable

  public String getZip() {
    return zip;
  }


  public void setZip(String zip) {
    this.zip = zip;
  }


  public UserAddress isoCountryCode(String isoCountryCode) {
    
    this.isoCountryCode = isoCountryCode;
    return this;
  }

   /**
   * The ISO code of the country in this address.
   * @return isoCountryCode
  **/
  @javax.annotation.Nullable

  public String getIsoCountryCode() {
    return isoCountryCode;
  }


  public void setIsoCountryCode(String isoCountryCode) {
    this.isoCountryCode = isoCountryCode;
  }


  public UserAddress countryName(String countryName) {
    
    this.countryName = countryName;
    return this;
  }

   /**
   * The name of the user&#39;s country.
   * @return countryName
  **/
  @javax.annotation.Nullable

  public String getCountryName() {
    return countryName;
  }


  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }


  public UserAddress isDefaultShippingAddress(Boolean isDefaultShippingAddress) {
    
    this.isDefaultShippingAddress = isDefaultShippingAddress;
    return this;
  }

   /**
   * Is this the user&#39;s default shipping address.
   * @return isDefaultShippingAddress
  **/
  @javax.annotation.Nullable

  public Boolean getIsDefaultShippingAddress() {
    return isDefaultShippingAddress;
  }


  public void setIsDefaultShippingAddress(Boolean isDefaultShippingAddress) {
    this.isDefaultShippingAddress = isDefaultShippingAddress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAddress userAddress = (UserAddress) o;
    return Objects.equals(this.userAddressId, userAddress.userAddressId) &&
        Objects.equals(this.userId, userAddress.userId) &&
        Objects.equals(this.name, userAddress.name) &&
        Objects.equals(this.firstLine, userAddress.firstLine) &&
        Objects.equals(this.secondLine, userAddress.secondLine) &&
        Objects.equals(this.city, userAddress.city) &&
        Objects.equals(this.state, userAddress.state) &&
        Objects.equals(this.zip, userAddress.zip) &&
        Objects.equals(this.isoCountryCode, userAddress.isoCountryCode) &&
        Objects.equals(this.countryName, userAddress.countryName) &&
        Objects.equals(this.isDefaultShippingAddress, userAddress.isDefaultShippingAddress);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(userAddressId, userId, name, firstLine, secondLine, city, state, zip, isoCountryCode, countryName, isDefaultShippingAddress);
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
    sb.append("class UserAddress {\n");
    sb.append("    userAddressId: ").append(toIndentedString(userAddressId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstLine: ").append(toIndentedString(firstLine)).append("\n");
    sb.append("    secondLine: ").append(toIndentedString(secondLine)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    isoCountryCode: ").append(toIndentedString(isoCountryCode)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    isDefaultShippingAddress: ").append(toIndentedString(isDefaultShippingAddress)).append("\n");
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
    openapiFields.add("user_address_id");
    openapiFields.add("user_id");
    openapiFields.add("name");
    openapiFields.add("first_line");
    openapiFields.add("second_line");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("zip");
    openapiFields.add("iso_country_code");
    openapiFields.add("country_name");
    openapiFields.add("is_default_shipping_address");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserAddress
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UserAddress.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserAddress is not found in the empty JSON string", UserAddress.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UserAddress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserAddress` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("first_line") != null && !jsonObj.get("first_line").isJsonNull()) && !jsonObj.get("first_line").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_line` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_line").toString()));
      }
      if ((jsonObj.get("second_line") != null && !jsonObj.get("second_line").isJsonNull()) && !jsonObj.get("second_line").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `second_line` to be a primitive type in the JSON string but got `%s`", jsonObj.get("second_line").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("zip") != null && !jsonObj.get("zip").isJsonNull()) && !jsonObj.get("zip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zip").toString()));
      }
      if ((jsonObj.get("iso_country_code") != null && !jsonObj.get("iso_country_code").isJsonNull()) && !jsonObj.get("iso_country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iso_country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iso_country_code").toString()));
      }
      if ((jsonObj.get("country_name") != null && !jsonObj.get("country_name").isJsonNull()) && !jsonObj.get("country_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<UserAddress>() {
           @Override
           public void write(JsonWriter out, UserAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserAddress read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserAddress given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserAddress
  * @throws IOException if the JSON string is invalid with respect to UserAddress
  */
  public static UserAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserAddress.class);
  }

 /**
  * Convert an instance of UserAddress to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

