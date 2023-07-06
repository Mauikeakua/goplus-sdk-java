/*
 * GoPlus Security API Document
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.gopluslabs.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.gopluslabs.client.model.ResponseWrapperGetNftInfoResult;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ResponseWrapperGetNftInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-06T09:52:32.634171989Z[Etc/UTC]")

public class ResponseWrapperGetNftInfo {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("result")
  private ResponseWrapperGetNftInfoResult result = null;

  public ResponseWrapperGetNftInfo code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Code 1：Success
   * @return code
  **/
  @Schema(description = "Code 1：Success")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ResponseWrapperGetNftInfo message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Response message
   * @return message
  **/
  @Schema(description = "Response message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ResponseWrapperGetNftInfo result(ResponseWrapperGetNftInfoResult result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @Schema(description = "")
  public ResponseWrapperGetNftInfoResult getResult() {
    return result;
  }

  public void setResult(ResponseWrapperGetNftInfoResult result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseWrapperGetNftInfo responseWrapperGetNftInfo = (ResponseWrapperGetNftInfo) o;
    return Objects.equals(this.code, responseWrapperGetNftInfo.code) &&
        Objects.equals(this.message, responseWrapperGetNftInfo.message) &&
        Objects.equals(this.result, responseWrapperGetNftInfo.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseWrapperGetNftInfo {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
