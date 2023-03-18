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
import org.openapitools.jackson.nullable.JsonNullable;

import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

/**
 * The list of requested resources.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-18T13:10:02.644710400+01:00[Europe/Berlin]")
public class TaxonomyNodePropertiesResultsInner {
  public static final String SERIALIZED_NAME_PROPERTY_ID = "property_id";
  @SerializedName(SERIALIZED_NAME_PROPERTY_ID)
  private Long propertyId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_SCALES = "scales";
  @SerializedName(SERIALIZED_NAME_SCALES)
  private List<TaxonomyNodePropertyScalesInner> scales = new ArrayList<>();

  public static final String SERIALIZED_NAME_IS_REQUIRED = "is_required";
  @SerializedName(SERIALIZED_NAME_IS_REQUIRED)
  private Boolean isRequired;

  public static final String SERIALIZED_NAME_SUPPORTS_ATTRIBUTES = "supports_attributes";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_ATTRIBUTES)
  private Boolean supportsAttributes;

  public static final String SERIALIZED_NAME_SUPPORTS_VARIATIONS = "supports_variations";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_VARIATIONS)
  private Boolean supportsVariations;

  public static final String SERIALIZED_NAME_IS_MULTIVALUED = "is_multivalued";
  @SerializedName(SERIALIZED_NAME_IS_MULTIVALUED)
  private Boolean isMultivalued;

  public static final String SERIALIZED_NAME_MAX_VALUES_ALLOWED = "max_values_allowed";
  @SerializedName(SERIALIZED_NAME_MAX_VALUES_ALLOWED)
  private Long maxValuesAllowed;

  public static final String SERIALIZED_NAME_POSSIBLE_VALUES = "possible_values";
  @SerializedName(SERIALIZED_NAME_POSSIBLE_VALUES)
  private List<TaxonomyNodePropertyPossibleValuesInner> possibleValues = new ArrayList<>();

  public static final String SERIALIZED_NAME_SELECTED_VALUES = "selected_values";
  @SerializedName(SERIALIZED_NAME_SELECTED_VALUES)
  private List<TaxonomyNodePropertySelectedValuesInner> selectedValues = new ArrayList<>();

  public TaxonomyNodePropertiesResultsInner() {
  }

  public TaxonomyNodePropertiesResultsInner propertyId(Long propertyId) {
    
    this.propertyId = propertyId;
    return this;
  }

   /**
   * The unique numeric ID of this product property.
   * minimum: 1
   * @return propertyId
  **/
  @javax.annotation.Nullable

  public Long getPropertyId() {
    return propertyId;
  }


  public void setPropertyId(Long propertyId) {
    this.propertyId = propertyId;
  }


  public TaxonomyNodePropertiesResultsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name string for this taxonomy node.
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TaxonomyNodePropertiesResultsInner displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The human-readable product property name string.
   * @return displayName
  **/
  @javax.annotation.Nullable

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public TaxonomyNodePropertiesResultsInner scales(List<TaxonomyNodePropertyScalesInner> scales) {
    
    this.scales = scales;
    return this;
  }

  public TaxonomyNodePropertiesResultsInner addScalesItem(TaxonomyNodePropertyScalesInner scalesItem) {
    if (this.scales == null) {
      this.scales = new ArrayList<>();
    }
    this.scales.add(scalesItem);
    return this;
  }

   /**
   * A list of available scales.
   * @return scales
  **/
  @javax.annotation.Nullable

  public List<TaxonomyNodePropertyScalesInner> getScales() {
    return scales;
  }


  public void setScales(List<TaxonomyNodePropertyScalesInner> scales) {
    this.scales = scales;
  }


  public TaxonomyNodePropertiesResultsInner isRequired(Boolean isRequired) {
    
    this.isRequired = isRequired;
    return this;
  }

   /**
   * When true, listings assigned eligible taxonomy IDs require this property.
   * @return isRequired
  **/
  @javax.annotation.Nullable

  public Boolean getIsRequired() {
    return isRequired;
  }


  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }


  public TaxonomyNodePropertiesResultsInner supportsAttributes(Boolean supportsAttributes) {
    
    this.supportsAttributes = supportsAttributes;
    return this;
  }

   /**
   * When true, you can use this property in listing attributes.
   * @return supportsAttributes
  **/
  @javax.annotation.Nullable

  public Boolean getSupportsAttributes() {
    return supportsAttributes;
  }


  public void setSupportsAttributes(Boolean supportsAttributes) {
    this.supportsAttributes = supportsAttributes;
  }


  public TaxonomyNodePropertiesResultsInner supportsVariations(Boolean supportsVariations) {
    
    this.supportsVariations = supportsVariations;
    return this;
  }

   /**
   * When true, you can use this property in listing variations.
   * @return supportsVariations
  **/
  @javax.annotation.Nullable

  public Boolean getSupportsVariations() {
    return supportsVariations;
  }


  public void setSupportsVariations(Boolean supportsVariations) {
    this.supportsVariations = supportsVariations;
  }


  public TaxonomyNodePropertiesResultsInner isMultivalued(Boolean isMultivalued) {
    
    this.isMultivalued = isMultivalued;
    return this;
  }

   /**
   * When true, you can assign multiple property values to this property
   * @return isMultivalued
  **/
  @javax.annotation.Nullable

  public Boolean getIsMultivalued() {
    return isMultivalued;
  }


  public void setIsMultivalued(Boolean isMultivalued) {
    this.isMultivalued = isMultivalued;
  }


  public TaxonomyNodePropertiesResultsInner maxValuesAllowed(Long maxValuesAllowed) {
    
    this.maxValuesAllowed = maxValuesAllowed;
    return this;
  }

   /**
   * When true, you can assign multiple property values to this property
   * @return maxValuesAllowed
  **/
  @javax.annotation.Nullable

  public Long getMaxValuesAllowed() {
    return maxValuesAllowed;
  }


  public void setMaxValuesAllowed(Long maxValuesAllowed) {
    this.maxValuesAllowed = maxValuesAllowed;
  }


  public TaxonomyNodePropertiesResultsInner possibleValues(List<TaxonomyNodePropertyPossibleValuesInner> possibleValues) {
    
    this.possibleValues = possibleValues;
    return this;
  }

  public TaxonomyNodePropertiesResultsInner addPossibleValuesItem(TaxonomyNodePropertyPossibleValuesInner possibleValuesItem) {
    if (this.possibleValues == null) {
      this.possibleValues = new ArrayList<>();
    }
    this.possibleValues.add(possibleValuesItem);
    return this;
  }

   /**
   * A list of supported property value strings for this property.
   * @return possibleValues
  **/
  @javax.annotation.Nullable

  public List<TaxonomyNodePropertyPossibleValuesInner> getPossibleValues() {
    return possibleValues;
  }


  public void setPossibleValues(List<TaxonomyNodePropertyPossibleValuesInner> possibleValues) {
    this.possibleValues = possibleValues;
  }


  public TaxonomyNodePropertiesResultsInner selectedValues(List<TaxonomyNodePropertySelectedValuesInner> selectedValues) {
    
    this.selectedValues = selectedValues;
    return this;
  }

  public TaxonomyNodePropertiesResultsInner addSelectedValuesItem(TaxonomyNodePropertySelectedValuesInner selectedValuesItem) {
    if (this.selectedValues == null) {
      this.selectedValues = new ArrayList<>();
    }
    this.selectedValues.add(selectedValuesItem);
    return this;
  }

   /**
   * A list of property value strings automatically and always selected for the given property.
   * @return selectedValues
  **/
  @javax.annotation.Nullable

  public List<TaxonomyNodePropertySelectedValuesInner> getSelectedValues() {
    return selectedValues;
  }


  public void setSelectedValues(List<TaxonomyNodePropertySelectedValuesInner> selectedValues) {
    this.selectedValues = selectedValues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxonomyNodePropertiesResultsInner taxonomyNodePropertiesResultsInner = (TaxonomyNodePropertiesResultsInner) o;
    return Objects.equals(this.propertyId, taxonomyNodePropertiesResultsInner.propertyId) &&
        Objects.equals(this.name, taxonomyNodePropertiesResultsInner.name) &&
        Objects.equals(this.displayName, taxonomyNodePropertiesResultsInner.displayName) &&
        Objects.equals(this.scales, taxonomyNodePropertiesResultsInner.scales) &&
        Objects.equals(this.isRequired, taxonomyNodePropertiesResultsInner.isRequired) &&
        Objects.equals(this.supportsAttributes, taxonomyNodePropertiesResultsInner.supportsAttributes) &&
        Objects.equals(this.supportsVariations, taxonomyNodePropertiesResultsInner.supportsVariations) &&
        Objects.equals(this.isMultivalued, taxonomyNodePropertiesResultsInner.isMultivalued) &&
        Objects.equals(this.maxValuesAllowed, taxonomyNodePropertiesResultsInner.maxValuesAllowed) &&
        Objects.equals(this.possibleValues, taxonomyNodePropertiesResultsInner.possibleValues) &&
        Objects.equals(this.selectedValues, taxonomyNodePropertiesResultsInner.selectedValues);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyId, name, displayName, scales, isRequired, supportsAttributes, supportsVariations, isMultivalued, maxValuesAllowed, possibleValues, selectedValues);
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
    sb.append("class TaxonomyNodePropertiesResultsInner {\n");
    sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    scales: ").append(toIndentedString(scales)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    supportsAttributes: ").append(toIndentedString(supportsAttributes)).append("\n");
    sb.append("    supportsVariations: ").append(toIndentedString(supportsVariations)).append("\n");
    sb.append("    isMultivalued: ").append(toIndentedString(isMultivalued)).append("\n");
    sb.append("    maxValuesAllowed: ").append(toIndentedString(maxValuesAllowed)).append("\n");
    sb.append("    possibleValues: ").append(toIndentedString(possibleValues)).append("\n");
    sb.append("    selectedValues: ").append(toIndentedString(selectedValues)).append("\n");
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
    openapiFields.add("property_id");
    openapiFields.add("name");
    openapiFields.add("display_name");
    openapiFields.add("scales");
    openapiFields.add("is_required");
    openapiFields.add("supports_attributes");
    openapiFields.add("supports_variations");
    openapiFields.add("is_multivalued");
    openapiFields.add("max_values_allowed");
    openapiFields.add("possible_values");
    openapiFields.add("selected_values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaxonomyNodePropertiesResultsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TaxonomyNodePropertiesResultsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaxonomyNodePropertiesResultsInner is not found in the empty JSON string", TaxonomyNodePropertiesResultsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TaxonomyNodePropertiesResultsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TaxonomyNodePropertiesResultsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("display_name") != null && !jsonObj.get("display_name").isJsonNull()) && !jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
      if (jsonObj.get("scales") != null && !jsonObj.get("scales").isJsonNull()) {
        JsonArray jsonArrayscales = jsonObj.getAsJsonArray("scales");
        if (jsonArrayscales != null) {
          // ensure the json data is an array
          if (!jsonObj.get("scales").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `scales` to be an array in the JSON string but got `%s`", jsonObj.get("scales").toString()));
          }

          // validate the optional field `scales` (array)
          for (int i = 0; i < jsonArrayscales.size(); i++) {
            TaxonomyNodePropertyScalesInner.validateJsonObject(jsonArrayscales.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("possible_values") != null && !jsonObj.get("possible_values").isJsonNull()) {
        JsonArray jsonArraypossibleValues = jsonObj.getAsJsonArray("possible_values");
        if (jsonArraypossibleValues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("possible_values").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `possible_values` to be an array in the JSON string but got `%s`", jsonObj.get("possible_values").toString()));
          }

          // validate the optional field `possible_values` (array)
          for (int i = 0; i < jsonArraypossibleValues.size(); i++) {
            TaxonomyNodePropertyPossibleValuesInner.validateJsonObject(jsonArraypossibleValues.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("selected_values") != null && !jsonObj.get("selected_values").isJsonNull()) {
        JsonArray jsonArrayselectedValues = jsonObj.getAsJsonArray("selected_values");
        if (jsonArrayselectedValues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("selected_values").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `selected_values` to be an array in the JSON string but got `%s`", jsonObj.get("selected_values").toString()));
          }

          // validate the optional field `selected_values` (array)
          for (int i = 0; i < jsonArrayselectedValues.size(); i++) {
            TaxonomyNodePropertySelectedValuesInner.validateJsonObject(jsonArrayselectedValues.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaxonomyNodePropertiesResultsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaxonomyNodePropertiesResultsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaxonomyNodePropertiesResultsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaxonomyNodePropertiesResultsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TaxonomyNodePropertiesResultsInner>() {
           @Override
           public void write(JsonWriter out, TaxonomyNodePropertiesResultsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TaxonomyNodePropertiesResultsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TaxonomyNodePropertiesResultsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaxonomyNodePropertiesResultsInner
  * @throws IOException if the JSON string is invalid with respect to TaxonomyNodePropertiesResultsInner
  */
  public static TaxonomyNodePropertiesResultsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaxonomyNodePropertiesResultsInner.class);
  }

 /**
  * Convert an instance of TaxonomyNodePropertiesResultsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

