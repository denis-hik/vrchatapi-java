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
import io.github.vrchatapi.model.AvatarUnityPackageUrlObject;
import io.github.vrchatapi.model.ReleaseStatus;
import io.github.vrchatapi.model.UnityPackage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.threeten.bp.OffsetDateTime;

/**
 * Avatar
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Avatar {
  public static final String SERIALIZED_NAME_ASSET_URL = "assetUrl";
  @SerializedName(SERIALIZED_NAME_ASSET_URL)
  private String assetUrl;

  public static final String SERIALIZED_NAME_ASSET_URL_OBJECT = "assetUrlObject";
  @SerializedName(SERIALIZED_NAME_ASSET_URL_OBJECT)
  private Object assetUrlObject;

  public static final String SERIALIZED_NAME_AUTHOR_ID = "authorId";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
  private String authorId;

  public static final String SERIALIZED_NAME_AUTHOR_NAME = "authorName";
  @SerializedName(SERIALIZED_NAME_AUTHOR_NAME)
  private String authorName;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FEATURED = "featured";
  @SerializedName(SERIALIZED_NAME_FEATURED)
  private Boolean featured = false;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RELEASE_STATUS = "releaseStatus";
  @SerializedName(SERIALIZED_NAME_RELEASE_STATUS)
  private ReleaseStatus releaseStatus = ReleaseStatus.PUBLIC;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<String>();

  public static final String SERIALIZED_NAME_THUMBNAIL_IMAGE_URL = "thumbnailImageUrl";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL_IMAGE_URL)
  private String thumbnailImageUrl;

  public static final String SERIALIZED_NAME_UNITY_PACKAGE_URL = "unityPackageUrl";
  @SerializedName(SERIALIZED_NAME_UNITY_PACKAGE_URL)
  private String unityPackageUrl;

  public static final String SERIALIZED_NAME_UNITY_PACKAGE_URL_OBJECT = "unityPackageUrlObject";
  @SerializedName(SERIALIZED_NAME_UNITY_PACKAGE_URL_OBJECT)
  private AvatarUnityPackageUrlObject unityPackageUrlObject;

  public static final String SERIALIZED_NAME_UNITY_PACKAGES = "unityPackages";
  @SerializedName(SERIALIZED_NAME_UNITY_PACKAGES)
  private Set<UnityPackage> unityPackages = new LinkedHashSet<UnityPackage>();

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version = 0;


  public Avatar assetUrl(String assetUrl) {
    
    this.assetUrl = assetUrl;
    return this;
  }

   /**
   * Not present from general serach &#x60;/avatars&#x60;, only on specific requests &#x60;/avatars/{avatarId}&#x60;.
   * @return assetUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not present from general serach `/avatars`, only on specific requests `/avatars/{avatarId}`.")

  public String getAssetUrl() {
    return assetUrl;
  }


  public void setAssetUrl(String assetUrl) {
    this.assetUrl = assetUrl;
  }


  public Avatar assetUrlObject(Object assetUrlObject) {
    
    this.assetUrlObject = assetUrlObject;
    return this;
  }

   /**
   * Not present from general serach &#x60;/avatars&#x60;, only on specific requests &#x60;/avatars/{avatarId}&#x60;. **Deprecation:** &#x60;Object&#x60; has unknown usage/fields, and is always empty. Use normal &#x60;Url&#x60; field instead.
   * @return assetUrlObject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not present from general serach `/avatars`, only on specific requests `/avatars/{avatarId}`. **Deprecation:** `Object` has unknown usage/fields, and is always empty. Use normal `Url` field instead.")

  public Object getAssetUrlObject() {
    return assetUrlObject;
  }


  public void setAssetUrlObject(Object assetUrlObject) {
    this.assetUrlObject = assetUrlObject;
  }


  public Avatar authorId(String authorId) {
    
    this.authorId = authorId;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return authorId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", required = true, value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getAuthorId() {
    return authorId;
  }


  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }


  public Avatar authorName(String authorName) {
    
    this.authorName = authorName;
    return this;
  }

   /**
   * Get authorName
   * @return authorName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAuthorName() {
    return authorName;
  }


  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }


  public Avatar createdAt(OffsetDateTime createdAt) {
    
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


  public Avatar description(String description) {
    
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


  public Avatar featured(Boolean featured) {
    
    this.featured = featured;
    return this;
  }

   /**
   * Get featured
   * @return featured
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getFeatured() {
    return featured;
  }


  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }


  public Avatar id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "avtr_912d66a4-4714-43b8-8407-7de2cafbf55b", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Avatar imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public Avatar name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Avatar releaseStatus(ReleaseStatus releaseStatus) {
    
    this.releaseStatus = releaseStatus;
    return this;
  }

   /**
   * Get releaseStatus
   * @return releaseStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReleaseStatus getReleaseStatus() {
    return releaseStatus;
  }


  public void setReleaseStatus(ReleaseStatus releaseStatus) {
    this.releaseStatus = releaseStatus;
  }


  public Avatar tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Avatar addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public Avatar thumbnailImageUrl(String thumbnailImageUrl) {
    
    this.thumbnailImageUrl = thumbnailImageUrl;
    return this;
  }

   /**
   * Get thumbnailImageUrl
   * @return thumbnailImageUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getThumbnailImageUrl() {
    return thumbnailImageUrl;
  }


  public void setThumbnailImageUrl(String thumbnailImageUrl) {
    this.thumbnailImageUrl = thumbnailImageUrl;
  }


  public Avatar unityPackageUrl(String unityPackageUrl) {
    
    this.unityPackageUrl = unityPackageUrl;
    return this;
  }

   /**
   * Get unityPackageUrl
   * @return unityPackageUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUnityPackageUrl() {
    return unityPackageUrl;
  }


  public void setUnityPackageUrl(String unityPackageUrl) {
    this.unityPackageUrl = unityPackageUrl;
  }


  public Avatar unityPackageUrlObject(AvatarUnityPackageUrlObject unityPackageUrlObject) {
    
    this.unityPackageUrlObject = unityPackageUrlObject;
    return this;
  }

   /**
   * Get unityPackageUrlObject
   * @return unityPackageUrlObject
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AvatarUnityPackageUrlObject getUnityPackageUrlObject() {
    return unityPackageUrlObject;
  }


  public void setUnityPackageUrlObject(AvatarUnityPackageUrlObject unityPackageUrlObject) {
    this.unityPackageUrlObject = unityPackageUrlObject;
  }


  public Avatar unityPackages(Set<UnityPackage> unityPackages) {
    
    this.unityPackages = unityPackages;
    return this;
  }

  public Avatar addUnityPackagesItem(UnityPackage unityPackagesItem) {
    this.unityPackages.add(unityPackagesItem);
    return this;
  }

   /**
   * Get unityPackages
   * @return unityPackages
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Set<UnityPackage> getUnityPackages() {
    return unityPackages;
  }


  public void setUnityPackages(Set<UnityPackage> unityPackages) {
    this.unityPackages = unityPackages;
  }


  public Avatar updatedAt(OffsetDateTime updatedAt) {
    
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


  public Avatar version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * minimum: 0
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "68", required = true, value = "")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Avatar avatar = (Avatar) o;
    return Objects.equals(this.assetUrl, avatar.assetUrl) &&
        Objects.equals(this.assetUrlObject, avatar.assetUrlObject) &&
        Objects.equals(this.authorId, avatar.authorId) &&
        Objects.equals(this.authorName, avatar.authorName) &&
        Objects.equals(this.createdAt, avatar.createdAt) &&
        Objects.equals(this.description, avatar.description) &&
        Objects.equals(this.featured, avatar.featured) &&
        Objects.equals(this.id, avatar.id) &&
        Objects.equals(this.imageUrl, avatar.imageUrl) &&
        Objects.equals(this.name, avatar.name) &&
        Objects.equals(this.releaseStatus, avatar.releaseStatus) &&
        Objects.equals(this.tags, avatar.tags) &&
        Objects.equals(this.thumbnailImageUrl, avatar.thumbnailImageUrl) &&
        Objects.equals(this.unityPackageUrl, avatar.unityPackageUrl) &&
        Objects.equals(this.unityPackageUrlObject, avatar.unityPackageUrlObject) &&
        Objects.equals(this.unityPackages, avatar.unityPackages) &&
        Objects.equals(this.updatedAt, avatar.updatedAt) &&
        Objects.equals(this.version, avatar.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetUrl, assetUrlObject, authorId, authorName, createdAt, description, featured, id, imageUrl, name, releaseStatus, tags, thumbnailImageUrl, unityPackageUrl, unityPackageUrlObject, unityPackages, updatedAt, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Avatar {\n");
    sb.append("    assetUrl: ").append(toIndentedString(assetUrl)).append("\n");
    sb.append("    assetUrlObject: ").append(toIndentedString(assetUrlObject)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    featured: ").append(toIndentedString(featured)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    releaseStatus: ").append(toIndentedString(releaseStatus)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    thumbnailImageUrl: ").append(toIndentedString(thumbnailImageUrl)).append("\n");
    sb.append("    unityPackageUrl: ").append(toIndentedString(unityPackageUrl)).append("\n");
    sb.append("    unityPackageUrlObject: ").append(toIndentedString(unityPackageUrlObject)).append("\n");
    sb.append("    unityPackages: ").append(toIndentedString(unityPackages)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

