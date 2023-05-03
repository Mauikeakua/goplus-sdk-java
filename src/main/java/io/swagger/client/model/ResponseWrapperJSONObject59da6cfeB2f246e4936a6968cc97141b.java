/*
 * GoPlus Security API Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.ResponseWrapperJSONObject59da6cfeb2f246e4936a6968cc97141bResult;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ResponseWrapperJSONObject59da6cfeB2f246e4936a6968cc97141b
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-03T14:50:35.366778228Z[Etc/UTC]")
public class ResponseWrapperJSONObject59da6cfeB2f246e4936a6968cc97141b {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("result")
  private ResponseWrapperJSONObject59da6cfeb2f246e4936a6968cc97141bResult result = null;

  public ResponseWrapperJSONObject59da6cfeB2f246e4936a6968cc97141b code(Integer code) {
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

  public ResponseWrapperJSONObject59da6cfeB2f246e4936a6968cc97141b message(String message) {
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

  public ResponseWrapperJSONObject59da6cfeB2f246e4936a6968cc97141b result(ResponseWrapperJSONObject59da6cfeb2f246e4936a6968cc97141bResult result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @Schema(description = "")
  public ResponseWrapperJSONObject59da6cfeb2f246e4936a6968cc97141bResult getResult() {
    return result;
  }

  public void setResult(ResponseWrapperJSONObject59da6cfeb2f246e4936a6968cc97141bResult result) {
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
    ResponseWrapperJSONObject59da6cfeB2f246e4936a6968cc97141b responseWrapperJSONObject59da6cfeB2f246e4936a6968cc97141b = (ResponseWrapperJSONObject59da6cfeB2f246e4936a6968cc97141b) o;
    return Objects.equals(this.code, responseWrapperJSONObject59da6cfeB2f246e4936a6968cc97141b.code) &&
        Objects.equals(this.message, responseWrapperJSONObject59da6cfeB2f246e4936a6968cc97141b.message) &&
        Objects.equals(this.result, responseWrapperJSONObject59da6cfeB2f246e4936a6968cc97141b.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseWrapperJSONObject59da6cfeB2f246e4936a6968cc97141b {\n");
    
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
