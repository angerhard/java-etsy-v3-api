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
import org.openapitools.client.model.ListingTranslation;
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
 * Container for all current supported translations of a listing. Note that Etsy periodically adds/removes languages, so this list may change in the future.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-03T07:15:13.096948200+02:00[Europe/Berlin]")
public class ListingTranslations {
  public static final String SERIALIZED_NAME_DE = "de";
  @SerializedName(SERIALIZED_NAME_DE)
  private ListingTranslation de;

  public static final String SERIALIZED_NAME_EN_G_B = "en-GB";
  @SerializedName(SERIALIZED_NAME_EN_G_B)
  private ListingTranslation enGB;

  public static final String SERIALIZED_NAME_EN_I_N = "en-IN";
  @SerializedName(SERIALIZED_NAME_EN_I_N)
  private ListingTranslation enIN;

  public static final String SERIALIZED_NAME_EN_U_S = "en-US";
  @SerializedName(SERIALIZED_NAME_EN_U_S)
  private ListingTranslation enUS;

  public static final String SERIALIZED_NAME_ES = "es";
  @SerializedName(SERIALIZED_NAME_ES)
  private ListingTranslation es;

  public static final String SERIALIZED_NAME_FR = "fr";
  @SerializedName(SERIALIZED_NAME_FR)
  private ListingTranslation fr;

  public static final String SERIALIZED_NAME_IT = "it";
  @SerializedName(SERIALIZED_NAME_IT)
  private ListingTranslation it;

  public static final String SERIALIZED_NAME_JA = "ja";
  @SerializedName(SERIALIZED_NAME_JA)
  private ListingTranslation ja;

  public static final String SERIALIZED_NAME_NL = "nl";
  @SerializedName(SERIALIZED_NAME_NL)
  private ListingTranslation nl;

  public static final String SERIALIZED_NAME_PL = "pl";
  @SerializedName(SERIALIZED_NAME_PL)
  private ListingTranslation pl;

  public static final String SERIALIZED_NAME_PT = "pt";
  @SerializedName(SERIALIZED_NAME_PT)
  private ListingTranslation pt;

  public static final String SERIALIZED_NAME_RU = "ru";
  @SerializedName(SERIALIZED_NAME_RU)
  private ListingTranslation ru;

  public ListingTranslations() {
  }

  public ListingTranslations de(ListingTranslation de) {
    
    this.de = de;
    return this;
  }

   /**
   * Get de
   * @return de
  **/
  @javax.annotation.Nullable

  public ListingTranslation getDe() {
    return de;
  }


  public void setDe(ListingTranslation de) {
    this.de = de;
  }


  public ListingTranslations enGB(ListingTranslation enGB) {
    
    this.enGB = enGB;
    return this;
  }

   /**
   * Get enGB
   * @return enGB
  **/
  @javax.annotation.Nullable

  public ListingTranslation getEnGB() {
    return enGB;
  }


  public void setEnGB(ListingTranslation enGB) {
    this.enGB = enGB;
  }


  public ListingTranslations enIN(ListingTranslation enIN) {
    
    this.enIN = enIN;
    return this;
  }

   /**
   * Get enIN
   * @return enIN
  **/
  @javax.annotation.Nullable

  public ListingTranslation getEnIN() {
    return enIN;
  }


  public void setEnIN(ListingTranslation enIN) {
    this.enIN = enIN;
  }


  public ListingTranslations enUS(ListingTranslation enUS) {
    
    this.enUS = enUS;
    return this;
  }

   /**
   * Get enUS
   * @return enUS
  **/
  @javax.annotation.Nullable

  public ListingTranslation getEnUS() {
    return enUS;
  }


  public void setEnUS(ListingTranslation enUS) {
    this.enUS = enUS;
  }


  public ListingTranslations es(ListingTranslation es) {
    
    this.es = es;
    return this;
  }

   /**
   * Get es
   * @return es
  **/
  @javax.annotation.Nullable

  public ListingTranslation getEs() {
    return es;
  }


  public void setEs(ListingTranslation es) {
    this.es = es;
  }


  public ListingTranslations fr(ListingTranslation fr) {
    
    this.fr = fr;
    return this;
  }

   /**
   * Get fr
   * @return fr
  **/
  @javax.annotation.Nullable

  public ListingTranslation getFr() {
    return fr;
  }


  public void setFr(ListingTranslation fr) {
    this.fr = fr;
  }


  public ListingTranslations it(ListingTranslation it) {
    
    this.it = it;
    return this;
  }

   /**
   * Get it
   * @return it
  **/
  @javax.annotation.Nullable

  public ListingTranslation getIt() {
    return it;
  }


  public void setIt(ListingTranslation it) {
    this.it = it;
  }


  public ListingTranslations ja(ListingTranslation ja) {
    
    this.ja = ja;
    return this;
  }

   /**
   * Get ja
   * @return ja
  **/
  @javax.annotation.Nullable

  public ListingTranslation getJa() {
    return ja;
  }


  public void setJa(ListingTranslation ja) {
    this.ja = ja;
  }


  public ListingTranslations nl(ListingTranslation nl) {
    
    this.nl = nl;
    return this;
  }

   /**
   * Get nl
   * @return nl
  **/
  @javax.annotation.Nullable

  public ListingTranslation getNl() {
    return nl;
  }


  public void setNl(ListingTranslation nl) {
    this.nl = nl;
  }


  public ListingTranslations pl(ListingTranslation pl) {
    
    this.pl = pl;
    return this;
  }

   /**
   * Get pl
   * @return pl
  **/
  @javax.annotation.Nullable

  public ListingTranslation getPl() {
    return pl;
  }


  public void setPl(ListingTranslation pl) {
    this.pl = pl;
  }


  public ListingTranslations pt(ListingTranslation pt) {
    
    this.pt = pt;
    return this;
  }

   /**
   * Get pt
   * @return pt
  **/
  @javax.annotation.Nullable

  public ListingTranslation getPt() {
    return pt;
  }


  public void setPt(ListingTranslation pt) {
    this.pt = pt;
  }


  public ListingTranslations ru(ListingTranslation ru) {
    
    this.ru = ru;
    return this;
  }

   /**
   * Get ru
   * @return ru
  **/
  @javax.annotation.Nullable

  public ListingTranslation getRu() {
    return ru;
  }


  public void setRu(ListingTranslation ru) {
    this.ru = ru;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingTranslations listingTranslations = (ListingTranslations) o;
    return Objects.equals(this.de, listingTranslations.de) &&
        Objects.equals(this.enGB, listingTranslations.enGB) &&
        Objects.equals(this.enIN, listingTranslations.enIN) &&
        Objects.equals(this.enUS, listingTranslations.enUS) &&
        Objects.equals(this.es, listingTranslations.es) &&
        Objects.equals(this.fr, listingTranslations.fr) &&
        Objects.equals(this.it, listingTranslations.it) &&
        Objects.equals(this.ja, listingTranslations.ja) &&
        Objects.equals(this.nl, listingTranslations.nl) &&
        Objects.equals(this.pl, listingTranslations.pl) &&
        Objects.equals(this.pt, listingTranslations.pt) &&
        Objects.equals(this.ru, listingTranslations.ru);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(de, enGB, enIN, enUS, es, fr, it, ja, nl, pl, pt, ru);
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
    sb.append("class ListingTranslations {\n");
    sb.append("    de: ").append(toIndentedString(de)).append("\n");
    sb.append("    enGB: ").append(toIndentedString(enGB)).append("\n");
    sb.append("    enIN: ").append(toIndentedString(enIN)).append("\n");
    sb.append("    enUS: ").append(toIndentedString(enUS)).append("\n");
    sb.append("    es: ").append(toIndentedString(es)).append("\n");
    sb.append("    fr: ").append(toIndentedString(fr)).append("\n");
    sb.append("    it: ").append(toIndentedString(it)).append("\n");
    sb.append("    ja: ").append(toIndentedString(ja)).append("\n");
    sb.append("    nl: ").append(toIndentedString(nl)).append("\n");
    sb.append("    pl: ").append(toIndentedString(pl)).append("\n");
    sb.append("    pt: ").append(toIndentedString(pt)).append("\n");
    sb.append("    ru: ").append(toIndentedString(ru)).append("\n");
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
    openapiFields.add("de");
    openapiFields.add("en-GB");
    openapiFields.add("en-IN");
    openapiFields.add("en-US");
    openapiFields.add("es");
    openapiFields.add("fr");
    openapiFields.add("it");
    openapiFields.add("ja");
    openapiFields.add("nl");
    openapiFields.add("pl");
    openapiFields.add("pt");
    openapiFields.add("ru");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListingTranslations
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListingTranslations.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListingTranslations is not found in the empty JSON string", ListingTranslations.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListingTranslations.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListingTranslations` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `de`
      if (jsonObj.get("de") != null && !jsonObj.get("de").isJsonNull()) {
        ListingTranslation.validateJsonObject(jsonObj.getAsJsonObject("de"));
      }
      // validate the optional field `en-GB`
      if (jsonObj.get("en-GB") != null && !jsonObj.get("en-GB").isJsonNull()) {
        ListingTranslation.validateJsonObject(jsonObj.getAsJsonObject("en-GB"));
      }
      // validate the optional field `en-IN`
      if (jsonObj.get("en-IN") != null && !jsonObj.get("en-IN").isJsonNull()) {
        ListingTranslation.validateJsonObject(jsonObj.getAsJsonObject("en-IN"));
      }
      // validate the optional field `en-US`
      if (jsonObj.get("en-US") != null && !jsonObj.get("en-US").isJsonNull()) {
        ListingTranslation.validateJsonObject(jsonObj.getAsJsonObject("en-US"));
      }
      // validate the optional field `es`
      if (jsonObj.get("es") != null && !jsonObj.get("es").isJsonNull()) {
        ListingTranslation.validateJsonObject(jsonObj.getAsJsonObject("es"));
      }
      // validate the optional field `fr`
      if (jsonObj.get("fr") != null && !jsonObj.get("fr").isJsonNull()) {
        ListingTranslation.validateJsonObject(jsonObj.getAsJsonObject("fr"));
      }
      // validate the optional field `it`
      if (jsonObj.get("it") != null && !jsonObj.get("it").isJsonNull()) {
        ListingTranslation.validateJsonObject(jsonObj.getAsJsonObject("it"));
      }
      // validate the optional field `ja`
      if (jsonObj.get("ja") != null && !jsonObj.get("ja").isJsonNull()) {
        ListingTranslation.validateJsonObject(jsonObj.getAsJsonObject("ja"));
      }
      // validate the optional field `nl`
      if (jsonObj.get("nl") != null && !jsonObj.get("nl").isJsonNull()) {
        ListingTranslation.validateJsonObject(jsonObj.getAsJsonObject("nl"));
      }
      // validate the optional field `pl`
      if (jsonObj.get("pl") != null && !jsonObj.get("pl").isJsonNull()) {
        ListingTranslation.validateJsonObject(jsonObj.getAsJsonObject("pl"));
      }
      // validate the optional field `pt`
      if (jsonObj.get("pt") != null && !jsonObj.get("pt").isJsonNull()) {
        ListingTranslation.validateJsonObject(jsonObj.getAsJsonObject("pt"));
      }
      // validate the optional field `ru`
      if (jsonObj.get("ru") != null && !jsonObj.get("ru").isJsonNull()) {
        ListingTranslation.validateJsonObject(jsonObj.getAsJsonObject("ru"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListingTranslations.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListingTranslations' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListingTranslations> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListingTranslations.class));

       return (TypeAdapter<T>) new TypeAdapter<ListingTranslations>() {
           @Override
           public void write(JsonWriter out, ListingTranslations value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListingTranslations read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListingTranslations given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListingTranslations
  * @throws IOException if the JSON string is invalid with respect to ListingTranslations
  */
  public static ListingTranslations fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListingTranslations.class);
  }

 /**
  * Convert an instance of ListingTranslations to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

