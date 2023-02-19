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
 * RequestInviteRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RequestInviteRequest {
  public static final String SERIALIZED_NAME_MESSAGE_SLOT = "messageSlot";
  @SerializedName(SERIALIZED_NAME_MESSAGE_SLOT)
  private Integer messageSlot;

  public RequestInviteRequest() {
  }

  public RequestInviteRequest messageSlot(Integer messageSlot) {
    
    this.messageSlot = messageSlot;
    return this;
  }

   /**
   * Get messageSlot
   * minimum: 0
   * maximum: 11
   * @return messageSlot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMessageSlot() {
    return messageSlot;
  }


  public void setMessageSlot(Integer messageSlot) {
    this.messageSlot = messageSlot;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestInviteRequest requestInviteRequest = (RequestInviteRequest) o;
    return Objects.equals(this.messageSlot, requestInviteRequest.messageSlot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageSlot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestInviteRequest {\n");
    sb.append("    messageSlot: ").append(toIndentedString(messageSlot)).append("\n");
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
    openapiFields.add("messageSlot");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RequestInviteRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RequestInviteRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RequestInviteRequest is not found in the empty JSON string", RequestInviteRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RequestInviteRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RequestInviteRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RequestInviteRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RequestInviteRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RequestInviteRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RequestInviteRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RequestInviteRequest>() {
           @Override
           public void write(JsonWriter out, RequestInviteRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RequestInviteRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RequestInviteRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RequestInviteRequest
  * @throws IOException if the JSON string is invalid with respect to RequestInviteRequest
  */
  public static RequestInviteRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RequestInviteRequest.class);
  }

 /**
  * Convert an instance of RequestInviteRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

