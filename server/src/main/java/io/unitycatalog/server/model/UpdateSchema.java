/*
 * Unity Catalog API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.unitycatalog.server.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateSchema
 */
@JsonPropertyOrder({
  UpdateSchema.JSON_PROPERTY_COMMENT,
  UpdateSchema.JSON_PROPERTY_PROPERTIES,
  UpdateSchema.JSON_PROPERTY_NEW_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class UpdateSchema {
  public static final String JSON_PROPERTY_COMMENT = "comment";
  private String comment;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private Map<String, String> properties = new HashMap<>();

  public static final String JSON_PROPERTY_NEW_NAME = "new_name";
  private String newName;

  public UpdateSchema() {
  }

  public UpdateSchema comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * User-provided free-form text description.
   * @return comment
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComment() {
    return comment;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComment(String comment) {
    this.comment = comment;
  }


  public UpdateSchema properties(Map<String, String> properties) {
    
    this.properties = properties;
    return this;
  }

  public UpdateSchema putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * A map of key-value properties attached to the securable.
   * @return properties
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getProperties() {
    return properties;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }


  public UpdateSchema newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * New name for the schema.
   * @return newName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEW_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNewName() {
    return newName;
  }


  @JsonProperty(JSON_PROPERTY_NEW_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNewName(String newName) {
    this.newName = newName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSchema updateSchema = (UpdateSchema) o;
    return Objects.equals(this.comment, updateSchema.comment) &&
        Objects.equals(this.properties, updateSchema.properties) &&
        Objects.equals(this.newName, updateSchema.newName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, properties, newName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSchema {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
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

