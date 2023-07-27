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
import io.gopluslabs.client.model.AbiAddressInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * AbiParamInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-27T08:37:03.140494914Z[Etc/UTC]")

public class AbiParamInfo {
  @SerializedName("address_info")
  private AbiAddressInfo addressInfo = null;

  @SerializedName("input")
  private Object input = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  public AbiParamInfo addressInfo(AbiAddressInfo addressInfo) {
    this.addressInfo = addressInfo;
    return this;
  }

   /**
   * Get addressInfo
   * @return addressInfo
  **/
  @Schema(description = "")
  public AbiAddressInfo getAddressInfo() {
    return addressInfo;
  }

  public void setAddressInfo(AbiAddressInfo addressInfo) {
    this.addressInfo = addressInfo;
  }

  public AbiParamInfo input(Object input) {
    this.input = input;
    return this;
  }

   /**
   * It describes the input data in ABI.
   * @return input
  **/
  @Schema(description = "It describes the input data in ABI.")
  public Object getInput() {
    return input;
  }

  public void setInput(Object input) {
    this.input = input;
  }

  public AbiParamInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * It describes the parameter name in ABI, for example   \&quot;_from\&quot;, \&quot;_to\&quot;, \&quot;_value\&quot;.
   * @return name
  **/
  @Schema(description = "It describes the parameter name in ABI, for example   \"_from\", \"_to\", \"_value\".")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AbiParamInfo type(String type) {
    this.type = type;
    return this;
  }

   /**
   * It describes the parameter type in ABI, for example \&quot;address\&quot;, \&quot;uint256\&quot;, \&quot;bool\&quot;.
   * @return type
  **/
  @Schema(description = "It describes the parameter type in ABI, for example \"address\", \"uint256\", \"bool\".")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbiParamInfo abiParamInfo = (AbiParamInfo) o;
    return Objects.equals(this.addressInfo, abiParamInfo.addressInfo) &&
        Objects.equals(this.input, abiParamInfo.input) &&
        Objects.equals(this.name, abiParamInfo.name) &&
        Objects.equals(this.type, abiParamInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressInfo, input, name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbiParamInfo {\n");
    
    sb.append("    addressInfo: ").append(toIndentedString(addressInfo)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
