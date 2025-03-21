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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.BuyerTaxonomyNodeChildrenInner;
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
public class BuyerTaxonomyNodesResultsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private Long level;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARENT_ID = "parent_id";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private Long parentId;

  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<BuyerTaxonomyNodeChildrenInner> children = new ArrayList<>();

  public static final String SERIALIZED_NAME_FULL_PATH_TAXONOMY_IDS = "full_path_taxonomy_ids";
  @SerializedName(SERIALIZED_NAME_FULL_PATH_TAXONOMY_IDS)
  private List<Long> fullPathTaxonomyIds = new ArrayList<>();

  public BuyerTaxonomyNodesResultsInner() {
  }

  public BuyerTaxonomyNodesResultsInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique numeric ID of an Etsy taxonomy node, which is a metadata category for listings organized into the seller taxonomy hierarchy tree. For example, the \\\&quot;shoes\\\&quot; taxonomy node (ID: 1429, level: 1) is higher in the hierarchy than \\\&quot;girls&#39; shoes\\\&quot; (ID: 1440, level: 2). The taxonomy nodes assigned to a listing support access to specific standardized product scales and properties. For example, listings assigned the taxonomy nodes \\\&quot;shoes\\\&quot; or \\\&quot;girls&#39; shoes\\\&quot; support access to the \\\&quot;EU\\\&quot; shoe size scale with its associated property names and IDs for EU shoe sizes, such as property &#x60;value_id&#x60;:\\\&quot;1394\\\&quot;, and &#x60;name&#x60;:\\\&quot;38\\\&quot;.
   * minimum: 1
   * @return id
  **/
  @javax.annotation.Nullable

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public BuyerTaxonomyNodesResultsInner level(Long level) {
    
    this.level = level;
    return this;
  }

   /**
   * The integer depth of this taxonomy node in the seller taxonomy tree, with roots at level 0.
   * minimum: 0
   * @return level
  **/
  @javax.annotation.Nullable

  public Long getLevel() {
    return level;
  }


  public void setLevel(Long level) {
    this.level = level;
  }


  public BuyerTaxonomyNodesResultsInner name(String name) {
    
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


  public BuyerTaxonomyNodesResultsInner parentId(Long parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * The numeric taxonomy ID of the parent of this node.
   * minimum: 1
   * @return parentId
  **/
  @javax.annotation.Nullable

  public Long getParentId() {
    return parentId;
  }


  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }


  public BuyerTaxonomyNodesResultsInner children(List<BuyerTaxonomyNodeChildrenInner> children) {
    
    this.children = children;
    return this;
  }

  public BuyerTaxonomyNodesResultsInner addChildrenItem(BuyerTaxonomyNodeChildrenInner childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * An array of taxonomy nodes for all the direct children of this taxonomy node in the seller taxonomy tree.
   * @return children
  **/
  @javax.annotation.Nullable

  public List<BuyerTaxonomyNodeChildrenInner> getChildren() {
    return children;
  }


  public void setChildren(List<BuyerTaxonomyNodeChildrenInner> children) {
    this.children = children;
  }


  public BuyerTaxonomyNodesResultsInner fullPathTaxonomyIds(List<Long> fullPathTaxonomyIds) {
    
    this.fullPathTaxonomyIds = fullPathTaxonomyIds;
    return this;
  }

  public BuyerTaxonomyNodesResultsInner addFullPathTaxonomyIdsItem(Long fullPathTaxonomyIdsItem) {
    if (this.fullPathTaxonomyIds == null) {
      this.fullPathTaxonomyIds = new ArrayList<>();
    }
    this.fullPathTaxonomyIds.add(fullPathTaxonomyIdsItem);
    return this;
  }

   /**
   * An array of &#x60;taxonomy_id&#x60;s including this node and all of its direct parents in the seller taxonomy tree up to a root node. They are listed in order from root to leaf.
   * @return fullPathTaxonomyIds
  **/
  @javax.annotation.Nullable

  public List<Long> getFullPathTaxonomyIds() {
    return fullPathTaxonomyIds;
  }


  public void setFullPathTaxonomyIds(List<Long> fullPathTaxonomyIds) {
    this.fullPathTaxonomyIds = fullPathTaxonomyIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyerTaxonomyNodesResultsInner buyerTaxonomyNodesResultsInner = (BuyerTaxonomyNodesResultsInner) o;
    return Objects.equals(this.id, buyerTaxonomyNodesResultsInner.id) &&
        Objects.equals(this.level, buyerTaxonomyNodesResultsInner.level) &&
        Objects.equals(this.name, buyerTaxonomyNodesResultsInner.name) &&
        Objects.equals(this.parentId, buyerTaxonomyNodesResultsInner.parentId) &&
        Objects.equals(this.children, buyerTaxonomyNodesResultsInner.children) &&
        Objects.equals(this.fullPathTaxonomyIds, buyerTaxonomyNodesResultsInner.fullPathTaxonomyIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, level, name, parentId, children, fullPathTaxonomyIds);
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
    sb.append("class BuyerTaxonomyNodesResultsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    fullPathTaxonomyIds: ").append(toIndentedString(fullPathTaxonomyIds)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("level");
    openapiFields.add("name");
    openapiFields.add("parent_id");
    openapiFields.add("children");
    openapiFields.add("full_path_taxonomy_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BuyerTaxonomyNodesResultsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BuyerTaxonomyNodesResultsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BuyerTaxonomyNodesResultsInner is not found in the empty JSON string", BuyerTaxonomyNodesResultsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BuyerTaxonomyNodesResultsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BuyerTaxonomyNodesResultsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("children") != null && !jsonObj.get("children").isJsonNull()) {
        JsonArray jsonArraychildren = jsonObj.getAsJsonArray("children");
        if (jsonArraychildren != null) {
          // ensure the json data is an array
          if (!jsonObj.get("children").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `children` to be an array in the JSON string but got `%s`", jsonObj.get("children").toString()));
          }

          // validate the optional field `children` (array)
          for (int i = 0; i < jsonArraychildren.size(); i++) {
            BuyerTaxonomyNodeChildrenInner.validateJsonObject(jsonArraychildren.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("full_path_taxonomy_ids") != null && !jsonObj.get("full_path_taxonomy_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `full_path_taxonomy_ids` to be an array in the JSON string but got `%s`", jsonObj.get("full_path_taxonomy_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BuyerTaxonomyNodesResultsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BuyerTaxonomyNodesResultsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BuyerTaxonomyNodesResultsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BuyerTaxonomyNodesResultsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BuyerTaxonomyNodesResultsInner>() {
           @Override
           public void write(JsonWriter out, BuyerTaxonomyNodesResultsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BuyerTaxonomyNodesResultsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BuyerTaxonomyNodesResultsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BuyerTaxonomyNodesResultsInner
  * @throws IOException if the JSON string is invalid with respect to BuyerTaxonomyNodesResultsInner
  */
  public static BuyerTaxonomyNodesResultsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BuyerTaxonomyNodesResultsInner.class);
  }

 /**
  * Convert an instance of BuyerTaxonomyNodesResultsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

