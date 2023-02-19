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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets FileStatus
 */
@JsonAdapter(FileStatus.Adapter.class)
public enum FileStatus {
  
  WAITING("waiting"),
  
  COMPLETE("complete"),
  
  NONE("none"),
  
  QUEUED("queued");

  private String value;

  FileStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FileStatus fromValue(String value) {
    for (FileStatus b : FileStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FileStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final FileStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FileStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FileStatus.fromValue(value);
    }
  }
}

