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
 * A taxonomy node in the buyer taxonomy tree.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-30T11:53:28.314915500+01:00[Europe/Berlin]")
public class BuyerTaxonomyNode {
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

  public BuyerTaxonomyNode() {
  }

  public BuyerTaxonomyNode id(Long id) {
    
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


  public BuyerTaxonomyNode level(Long level) {
    
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


  public BuyerTaxonomyNode name(String name) {
    
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


  public BuyerTaxonomyNode parentId(Long parentId) {
    
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


  public BuyerTaxonomyNode children(List<BuyerTaxonomyNodeChildrenInner> children) {
    
    this.children = children;
    return this;
  }

  public BuyerTaxonomyNode addChildrenItem(BuyerTaxonomyNodeChildrenInner childrenItem) {
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


  public BuyerTaxonomyNode fullPathTaxonomyIds(List<Long> fullPathTaxonomyIds) {
    
    this.fullPathTaxonomyIds = fullPathTaxonomyIds;
    return this;
  }

  public BuyerTaxonomyNode addFullPathTaxonomyIdsItem(Long fullPathTaxonomyIdsItem) {
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
    BuyerTaxonomyNode buyerTaxonomyNode = (BuyerTaxonomyNode) o;
    return Objects.equals(this.id, buyerTaxonomyNode.id) &&
        Objects.equals(this.level, buyerTaxonomyNode.level) &&
        Objects.equals(this.name, buyerTaxonomyNode.name) &&
        Objects.equals(this.parentId, buyerTaxonomyNode.parentId) &&
        Objects.equals(this.children, buyerTaxonomyNode.children) &&
        Objects.equals(this.fullPathTaxonomyIds, buyerTaxonomyNode.fullPathTaxonomyIds);
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
    sb.append("class BuyerTaxonomyNode {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to BuyerTaxonomyNode
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BuyerTaxonomyNode.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BuyerTaxonomyNode is not found in the empty JSON string", BuyerTaxonomyNode.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BuyerTaxonomyNode.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BuyerTaxonomyNode` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
       if (!BuyerTaxonomyNode.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BuyerTaxonomyNode' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BuyerTaxonomyNode> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BuyerTaxonomyNode.class));

       return (TypeAdapter<T>) new TypeAdapter<BuyerTaxonomyNode>() {
           @Override
           public void write(JsonWriter out, BuyerTaxonomyNode value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BuyerTaxonomyNode read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BuyerTaxonomyNode given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BuyerTaxonomyNode
  * @throws IOException if the JSON string is invalid with respect to BuyerTaxonomyNode
  */
  public static BuyerTaxonomyNode fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BuyerTaxonomyNode.class);
  }

 /**
  * Convert an instance of BuyerTaxonomyNode to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

