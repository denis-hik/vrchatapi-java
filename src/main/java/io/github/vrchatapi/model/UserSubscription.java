/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.16.0
 * Contact: vrchatapi.lpv0t@aries.fyi
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
import io.github.vrchatapi.model.SubscriptionPeriod;
import io.github.vrchatapi.model.TransactionStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserSubscription {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_STORE = "store";
  @SerializedName(SERIALIZED_NAME_STORE)
  private String store;

  public static final String SERIALIZED_NAME_STEAM_ITEM_ID = "steamItemId";
  @SerializedName(SERIALIZED_NAME_STEAM_ITEM_ID)
  private String steamItemId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private SubscriptionPeriod period = SubscriptionPeriod.MONTH;

  public static final String SERIALIZED_NAME_TIER = "tier";
  @SerializedName(SERIALIZED_NAME_TIER)
  private BigDecimal tier;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active = true;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TransactionStatus status = TransactionStatus.ACTIVE;

  public static final String SERIALIZED_NAME_EXPIRES = "expires";
  @SerializedName(SERIALIZED_NAME_EXPIRES)
  private OffsetDateTime expires;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_LICENSE_GROUPS = "licenseGroups";
  @SerializedName(SERIALIZED_NAME_LICENSE_GROUPS)
  private List<String> licenseGroups = new ArrayList<>();

  public static final String SERIALIZED_NAME_IS_GIFT = "isGift";
  @SerializedName(SERIALIZED_NAME_IS_GIFT)
  private Boolean isGift = false;

  public UserSubscription() {
  }

  public UserSubscription id(String id) {
    
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


  public UserSubscription transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "txn_e5c72948-e735-4880-8245-24b2a41198b0", required = true, value = "")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public UserSubscription store(String store) {
    
    this.store = store;
    return this;
  }

   /**
   * Which \&quot;Store\&quot; it came from. Right now only Stores are \&quot;Steam\&quot; and \&quot;Admin\&quot;.
   * @return store
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Which \"Store\" it came from. Right now only Stores are \"Steam\" and \"Admin\".")

  public String getStore() {
    return store;
  }


  public void setStore(String store) {
    this.store = store;
  }


  public UserSubscription steamItemId(String steamItemId) {
    
    this.steamItemId = steamItemId;
    return this;
  }

   /**
   * Get steamItemId
   * @return steamItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSteamItemId() {
    return steamItemId;
  }


  public void setSteamItemId(String steamItemId) {
    this.steamItemId = steamItemId;
  }


  public UserSubscription amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public UserSubscription description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public UserSubscription period(SubscriptionPeriod period) {
    
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SubscriptionPeriod getPeriod() {
    return period;
  }


  public void setPeriod(SubscriptionPeriod period) {
    this.period = period;
  }


  public UserSubscription tier(BigDecimal tier) {
    
    this.tier = tier;
    return this;
  }

   /**
   * Get tier
   * @return tier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getTier() {
    return tier;
  }


  public void setTier(BigDecimal tier) {
    this.tier = tier;
  }


  public UserSubscription active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public UserSubscription status(TransactionStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TransactionStatus getStatus() {
    return status;
  }


  public void setStatus(TransactionStatus status) {
    this.status = status;
  }


  public UserSubscription expires(OffsetDateTime expires) {
    
    this.expires = expires;
    return this;
  }

   /**
   * Get expires
   * @return expires
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getExpires() {
    return expires;
  }


  public void setExpires(OffsetDateTime expires) {
    this.expires = expires;
  }


  public UserSubscription createdAt(OffsetDateTime createdAt) {
    
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


  public UserSubscription updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public UserSubscription licenseGroups(List<String> licenseGroups) {
    
    this.licenseGroups = licenseGroups;
    return this;
  }

  public UserSubscription addLicenseGroupsItem(String licenseGroupsItem) {
    this.licenseGroups.add(licenseGroupsItem);
    return this;
  }

   /**
   * Get licenseGroups
   * @return licenseGroups
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getLicenseGroups() {
    return licenseGroups;
  }


  public void setLicenseGroups(List<String> licenseGroups) {
    this.licenseGroups = licenseGroups;
  }


  public UserSubscription isGift(Boolean isGift) {
    
    this.isGift = isGift;
    return this;
  }

   /**
   * Get isGift
   * @return isGift
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsGift() {
    return isGift;
  }


  public void setIsGift(Boolean isGift) {
    this.isGift = isGift;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSubscription userSubscription = (UserSubscription) o;
    return Objects.equals(this.id, userSubscription.id) &&
        Objects.equals(this.transactionId, userSubscription.transactionId) &&
        Objects.equals(this.store, userSubscription.store) &&
        Objects.equals(this.steamItemId, userSubscription.steamItemId) &&
        Objects.equals(this.amount, userSubscription.amount) &&
        Objects.equals(this.description, userSubscription.description) &&
        Objects.equals(this.period, userSubscription.period) &&
        Objects.equals(this.tier, userSubscription.tier) &&
        Objects.equals(this.active, userSubscription.active) &&
        Objects.equals(this.status, userSubscription.status) &&
        Objects.equals(this.expires, userSubscription.expires) &&
        Objects.equals(this.createdAt, userSubscription.createdAt) &&
        Objects.equals(this.updatedAt, userSubscription.updatedAt) &&
        Objects.equals(this.licenseGroups, userSubscription.licenseGroups) &&
        Objects.equals(this.isGift, userSubscription.isGift);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, transactionId, store, steamItemId, amount, description, period, tier, active, status, expires, createdAt, updatedAt, licenseGroups, isGift);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSubscription {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    steamItemId: ").append(toIndentedString(steamItemId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    licenseGroups: ").append(toIndentedString(licenseGroups)).append("\n");
    sb.append("    isGift: ").append(toIndentedString(isGift)).append("\n");
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
    openapiFields.add("transactionId");
    openapiFields.add("store");
    openapiFields.add("steamItemId");
    openapiFields.add("amount");
    openapiFields.add("description");
    openapiFields.add("period");
    openapiFields.add("tier");
    openapiFields.add("active");
    openapiFields.add("status");
    openapiFields.add("expires");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("licenseGroups");
    openapiFields.add("isGift");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("transactionId");
    openapiRequiredFields.add("store");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("period");
    openapiRequiredFields.add("tier");
    openapiRequiredFields.add("active");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("expires");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("licenseGroups");
    openapiRequiredFields.add("isGift");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserSubscription
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UserSubscription.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserSubscription is not found in the empty JSON string", UserSubscription.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UserSubscription.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserSubscription` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserSubscription.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("transactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionId").toString()));
      }
      if (!jsonObj.get("store").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `store` to be a primitive type in the JSON string but got `%s`", jsonObj.get("store").toString()));
      }
      if ((jsonObj.get("steamItemId") != null && !jsonObj.get("steamItemId").isJsonNull()) && !jsonObj.get("steamItemId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `steamItemId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("steamItemId").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("licenseGroups") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("licenseGroups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `licenseGroups` to be an array in the JSON string but got `%s`", jsonObj.get("licenseGroups").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserSubscription.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserSubscription' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserSubscription> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserSubscription.class));

       return (TypeAdapter<T>) new TypeAdapter<UserSubscription>() {
           @Override
           public void write(JsonWriter out, UserSubscription value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserSubscription read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserSubscription given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserSubscription
  * @throws IOException if the JSON string is invalid with respect to UserSubscription
  */
  public static UserSubscription fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserSubscription.class);
  }

 /**
  * Convert an instance of UserSubscription to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

