/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.4.2
 * Contact: me@ruby.js.org
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

/**
 * Download links for various development assets.
 */
@ApiModel(description = "Download links for various development assets.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DownloadURLList {
  public static final String SERIALIZED_NAME_SDK2 = "sdk2";
  @SerializedName(SERIALIZED_NAME_SDK2)
  private String sdk2;

  public static final String SERIALIZED_NAME_SDK3_AVATARS = "sdk3-avatars";
  @SerializedName(SERIALIZED_NAME_SDK3_AVATARS)
  private String sdk3Avatars;

  public static final String SERIALIZED_NAME_SDK3_WORLDS = "sdk3-worlds";
  @SerializedName(SERIALIZED_NAME_SDK3_WORLDS)
  private String sdk3Worlds;


  public DownloadURLList sdk2(String sdk2) {
    
    this.sdk2 = sdk2;
    return this;
  }

   /**
   * Download link for legacy SDK2
   * @return sdk2
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Download link for legacy SDK2")

  public String getSdk2() {
    return sdk2;
  }


  public void setSdk2(String sdk2) {
    this.sdk2 = sdk2;
  }


  public DownloadURLList sdk3Avatars(String sdk3Avatars) {
    
    this.sdk3Avatars = sdk3Avatars;
    return this;
  }

   /**
   * Download link for SDK3 for Avatars
   * @return sdk3Avatars
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Download link for SDK3 for Avatars")

  public String getSdk3Avatars() {
    return sdk3Avatars;
  }


  public void setSdk3Avatars(String sdk3Avatars) {
    this.sdk3Avatars = sdk3Avatars;
  }


  public DownloadURLList sdk3Worlds(String sdk3Worlds) {
    
    this.sdk3Worlds = sdk3Worlds;
    return this;
  }

   /**
   * Download link for SDK3 for Worlds
   * @return sdk3Worlds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Download link for SDK3 for Worlds")

  public String getSdk3Worlds() {
    return sdk3Worlds;
  }


  public void setSdk3Worlds(String sdk3Worlds) {
    this.sdk3Worlds = sdk3Worlds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadURLList downloadURLList = (DownloadURLList) o;
    return Objects.equals(this.sdk2, downloadURLList.sdk2) &&
        Objects.equals(this.sdk3Avatars, downloadURLList.sdk3Avatars) &&
        Objects.equals(this.sdk3Worlds, downloadURLList.sdk3Worlds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sdk2, sdk3Avatars, sdk3Worlds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadURLList {\n");
    sb.append("    sdk2: ").append(toIndentedString(sdk2)).append("\n");
    sb.append("    sdk3Avatars: ").append(toIndentedString(sdk3Avatars)).append("\n");
    sb.append("    sdk3Worlds: ").append(toIndentedString(sdk3Worlds)).append("\n");
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
