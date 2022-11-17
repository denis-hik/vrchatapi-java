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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WorldPublishStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WorldPublishStatus {
  public static final String SERIALIZED_NAME_CAN_PUBILSH = "canPubilsh";
  @SerializedName(SERIALIZED_NAME_CAN_PUBILSH)
  private Boolean canPubilsh = true;


  public WorldPublishStatus canPubilsh(Boolean canPubilsh) {
    
    this.canPubilsh = canPubilsh;
    return this;
  }

   /**
   * Get canPubilsh
   * @return canPubilsh
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getCanPubilsh() {
    return canPubilsh;
  }


  public void setCanPubilsh(Boolean canPubilsh) {
    this.canPubilsh = canPubilsh;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorldPublishStatus worldPublishStatus = (WorldPublishStatus) o;
    return Objects.equals(this.canPubilsh, worldPublishStatus.canPubilsh);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canPubilsh);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorldPublishStatus {\n");
    sb.append("    canPubilsh: ").append(toIndentedString(canPubilsh)).append("\n");
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

