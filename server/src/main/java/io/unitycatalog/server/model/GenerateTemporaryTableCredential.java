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
import io.unitycatalog.server.model.TableOperation;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GenerateTemporaryTableCredential
 */
@JsonPropertyOrder({
  GenerateTemporaryTableCredential.JSON_PROPERTY_TABLE_ID,
  GenerateTemporaryTableCredential.JSON_PROPERTY_OPERATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class GenerateTemporaryTableCredential {
  public static final String JSON_PROPERTY_TABLE_ID = "table_id";
  private String tableId;

  public static final String JSON_PROPERTY_OPERATION = "operation";
  private TableOperation operation;

  public GenerateTemporaryTableCredential() {
  }

  public GenerateTemporaryTableCredential tableId(String tableId) {
    
    this.tableId = tableId;
    return this;
  }

   /**
   * Table id for which temporary credentials are generated.  Can be obtained from tables/{full_name} (get table info) API. 
   * @return tableId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TABLE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTableId() {
    return tableId;
  }


  @JsonProperty(JSON_PROPERTY_TABLE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTableId(String tableId) {
    this.tableId = tableId;
  }


  public GenerateTemporaryTableCredential operation(TableOperation operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TableOperation getOperation() {
    return operation;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOperation(TableOperation operation) {
    this.operation = operation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateTemporaryTableCredential generateTemporaryTableCredential = (GenerateTemporaryTableCredential) o;
    return Objects.equals(this.tableId, generateTemporaryTableCredential.tableId) &&
        Objects.equals(this.operation, generateTemporaryTableCredential.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableId, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateTemporaryTableCredential {\n");
    sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

