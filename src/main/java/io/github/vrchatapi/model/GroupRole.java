/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.11.1
 * Contact: me@ariesclark.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.vrchatapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

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

import io.github.vrchatapi.JSON;

/**
 * GroupRole
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GroupRole {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IS_SELF_ASSIGNABLE = "isSelfAssignable";
  @SerializedName(SERIALIZED_NAME_IS_SELF_ASSIGNABLE)
  private Boolean isSelfAssignable = false;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<String> permissions = null;

  public static final String SERIALIZED_NAME_IS_MANAGEMENT_ROLE = "isManagementRole";
  @SerializedName(SERIALIZED_NAME_IS_MANAGEMENT_ROLE)
  private Boolean isManagementRole = false;

  public static final String SERIALIZED_NAME_REQUIRES_TWO_FACTOR = "requiresTwoFactor";
  @SerializedName(SERIALIZED_NAME_REQUIRES_TWO_FACTOR)
  private Boolean requiresTwoFactor = false;

  public static final String SERIALIZED_NAME_REQUIRES_PURCHASE = "requiresPurchase";
  @SerializedName(SERIALIZED_NAME_REQUIRES_PURCHASE)
  private Boolean requiresPurchase = false;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public GroupRole() {
  }

  public GroupRole id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "grol_459d3911-f672-44bc-b84d-e54ffe7960fe", value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public GroupRole groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "grp_71a7ff59-112c-4e78-a990-c7cc650776e5", value = "")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public GroupRole name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GroupRole description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GroupRole isSelfAssignable(Boolean isSelfAssignable) {
    
    this.isSelfAssignable = isSelfAssignable;
    return this;
  }

   /**
   * Get isSelfAssignable
   * @return isSelfAssignable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsSelfAssignable() {
    return isSelfAssignable;
  }


  public void setIsSelfAssignable(Boolean isSelfAssignable) {
    this.isSelfAssignable = isSelfAssignable;
  }


  public GroupRole permissions(List<String> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public GroupRole addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPermissions() {
    return permissions;
  }


  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }


  public GroupRole isManagementRole(Boolean isManagementRole) {
    
    this.isManagementRole = isManagementRole;
    return this;
  }

   /**
   * Get isManagementRole
   * @return isManagementRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsManagementRole() {
    return isManagementRole;
  }


  public void setIsManagementRole(Boolean isManagementRole) {
    this.isManagementRole = isManagementRole;
  }


  public GroupRole requiresTwoFactor(Boolean requiresTwoFactor) {
    
    this.requiresTwoFactor = requiresTwoFactor;
    return this;
  }

   /**
   * Get requiresTwoFactor
   * @return requiresTwoFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRequiresTwoFactor() {
    return requiresTwoFactor;
  }


  public void setRequiresTwoFactor(Boolean requiresTwoFactor) {
    this.requiresTwoFactor = requiresTwoFactor;
  }


  public GroupRole requiresPurchase(Boolean requiresPurchase) {
    
    this.requiresPurchase = requiresPurchase;
    return this;
  }

   /**
   * Get requiresPurchase
   * @return requiresPurchase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRequiresPurchase() {
    return requiresPurchase;
  }


  public void setRequiresPurchase(Boolean requiresPurchase) {
    this.requiresPurchase = requiresPurchase;
  }


  public GroupRole order(Integer order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOrder() {
    return order;
  }


  public void setOrder(Integer order) {
    this.order = order;
  }


  public GroupRole createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public GroupRole updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupRole groupRole = (GroupRole) o;
    return Objects.equals(this.id, groupRole.id) &&
        Objects.equals(this.groupId, groupRole.groupId) &&
        Objects.equals(this.name, groupRole.name) &&
        Objects.equals(this.description, groupRole.description) &&
        Objects.equals(this.isSelfAssignable, groupRole.isSelfAssignable) &&
        Objects.equals(this.permissions, groupRole.permissions) &&
        Objects.equals(this.isManagementRole, groupRole.isManagementRole) &&
        Objects.equals(this.requiresTwoFactor, groupRole.requiresTwoFactor) &&
        Objects.equals(this.requiresPurchase, groupRole.requiresPurchase) &&
        Objects.equals(this.order, groupRole.order) &&
        Objects.equals(this.createdAt, groupRole.createdAt) &&
        Objects.equals(this.updatedAt, groupRole.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupId, name, description, isSelfAssignable, permissions, isManagementRole, requiresTwoFactor, requiresPurchase, order, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupRole {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isSelfAssignable: ").append(toIndentedString(isSelfAssignable)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    isManagementRole: ").append(toIndentedString(isManagementRole)).append("\n");
    sb.append("    requiresTwoFactor: ").append(toIndentedString(requiresTwoFactor)).append("\n");
    sb.append("    requiresPurchase: ").append(toIndentedString(requiresPurchase)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("groupId");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("isSelfAssignable");
    openapiFields.add("permissions");
    openapiFields.add("isManagementRole");
    openapiFields.add("requiresTwoFactor");
    openapiFields.add("requiresPurchase");
    openapiFields.add("order");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupRole
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GroupRole.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupRole is not found in the empty JSON string", GroupRole.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GroupRole.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupRole` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("groupId") != null && !jsonObj.get("groupId").isJsonNull()) && !jsonObj.get("groupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("permissions") != null && !jsonObj.get("permissions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `permissions` to be an array in the JSON string but got `%s`", jsonObj.get("permissions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupRole.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupRole' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupRole> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupRole.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupRole>() {
           @Override
           public void write(JsonWriter out, GroupRole value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupRole read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupRole given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupRole
  * @throws IOException if the JSON string is invalid with respect to GroupRole
  */
  public static GroupRole fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupRole.class);
  }

 /**
  * Convert an instance of GroupRole to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

