/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.9.0
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
import io.github.vrchatapi.model.NotificationType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * SentNotification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SentNotification {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details = "{}";

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_RECIEVER_USER_ID = "recieverUserId";
  @SerializedName(SERIALIZED_NAME_RECIEVER_USER_ID)
  private String recieverUserId;

  public static final String SERIALIZED_NAME_SENDER_USER_ID = "senderUserId";
  @SerializedName(SERIALIZED_NAME_SENDER_USER_ID)
  private String senderUserId;

  public static final String SERIALIZED_NAME_SENDER_USERNAME = "senderUsername";
  @SerializedName(SERIALIZED_NAME_SENDER_USERNAME)
  private String senderUsername;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private NotificationType type = NotificationType.FRIENDREQUEST;


  public SentNotification createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public SentNotification details(String details) {
    
    this.details = details;
    return this;
  }

   /**
   * **NOTICE:** This is not a JSON object, this is a json **encoded** object, meaning you have to json-de-encode to get the NotificationDetail object depending on the NotificationType.
   * @return details
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "OneOf: {}, NotificationDetailInvite, NotificationDetailInviteResponse, NotificationDetailRequestInvite, NotificationDetailRequestInviteResponse, NotificationDetailVoteToKick", required = true, value = "**NOTICE:** This is not a JSON object, this is a json **encoded** object, meaning you have to json-de-encode to get the NotificationDetail object depending on the NotificationType.")

  public String getDetails() {
    return details;
  }


  public void setDetails(String details) {
    this.details = details;
  }


  public SentNotification id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SentNotification message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "This is a generated invite to VRChat Hub", required = true, value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public SentNotification recieverUserId(String recieverUserId) {
    
    this.recieverUserId = recieverUserId;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return recieverUserId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", required = true, value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getRecieverUserId() {
    return recieverUserId;
  }


  public void setRecieverUserId(String recieverUserId) {
    this.recieverUserId = recieverUserId;
  }


  public SentNotification senderUserId(String senderUserId) {
    
    this.senderUserId = senderUserId;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return senderUserId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", required = true, value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getSenderUserId() {
    return senderUserId;
  }


  public void setSenderUserId(String senderUserId) {
    this.senderUserId = senderUserId;
  }


  public SentNotification senderUsername(String senderUsername) {
    
    this.senderUsername = senderUsername;
    return this;
  }

   /**
   * -| **DEPRECATED:** VRChat API no longer return usernames of other users. [See issue by Tupper for more information](https://github.com/pypy-vrc/VRCX/issues/429).
   * @return senderUsername
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "-| **DEPRECATED:** VRChat API no longer return usernames of other users. [See issue by Tupper for more information](https://github.com/pypy-vrc/VRCX/issues/429).")

  public String getSenderUsername() {
    return senderUsername;
  }


  public void setSenderUsername(String senderUsername) {
    this.senderUsername = senderUsername;
  }


  public SentNotification type(NotificationType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NotificationType getType() {
    return type;
  }


  public void setType(NotificationType type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SentNotification sentNotification = (SentNotification) o;
    return Objects.equals(this.createdAt, sentNotification.createdAt) &&
        Objects.equals(this.details, sentNotification.details) &&
        Objects.equals(this.id, sentNotification.id) &&
        Objects.equals(this.message, sentNotification.message) &&
        Objects.equals(this.recieverUserId, sentNotification.recieverUserId) &&
        Objects.equals(this.senderUserId, sentNotification.senderUserId) &&
        Objects.equals(this.senderUsername, sentNotification.senderUsername) &&
        Objects.equals(this.type, sentNotification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, details, id, message, recieverUserId, senderUserId, senderUsername, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SentNotification {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    recieverUserId: ").append(toIndentedString(recieverUserId)).append("\n");
    sb.append("    senderUserId: ").append(toIndentedString(senderUserId)).append("\n");
    sb.append("    senderUsername: ").append(toIndentedString(senderUsername)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

}

