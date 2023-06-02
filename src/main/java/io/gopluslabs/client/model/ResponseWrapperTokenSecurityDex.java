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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ResponseWrapperTokenSecurityDex
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-02T06:35:16.334290770Z[Etc/UTC]")
public class ResponseWrapperTokenSecurityDex {
  @SerializedName("name")
  private String name = null;

  @SerializedName("liquidity")
  private String liquidity = null;

  @SerializedName("pair")
  private String pair = null;

  public ResponseWrapperTokenSecurityDex name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResponseWrapperTokenSecurityDex liquidity(String liquidity) {
    this.liquidity = liquidity;
    return this;
  }

   /**
   * Liquidity is converted to USDT denomination.
   * @return liquidity
  **/
  @Schema(description = "Liquidity is converted to USDT denomination.")
  public String getLiquidity() {
    return liquidity;
  }

  public void setLiquidity(String liquidity) {
    this.liquidity = liquidity;
  }

  public ResponseWrapperTokenSecurityDex pair(String pair) {
    this.pair = pair;
    return this;
  }

   /**
   *  It only counts when the token has a marketing pair with mainstream 
   * @return pair
  **/
  @Schema(description = " It only counts when the token has a marketing pair with mainstream ")
  public String getPair() {
    return pair;
  }

  public void setPair(String pair) {
    this.pair = pair;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseWrapperTokenSecurityDex responseWrapperTokenSecurityDex = (ResponseWrapperTokenSecurityDex) o;
    return Objects.equals(this.name, responseWrapperTokenSecurityDex.name) &&
        Objects.equals(this.liquidity, responseWrapperTokenSecurityDex.liquidity) &&
        Objects.equals(this.pair, responseWrapperTokenSecurityDex.pair);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, liquidity, pair);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseWrapperTokenSecurityDex {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    liquidity: ").append(toIndentedString(liquidity)).append("\n");
    sb.append("    pair: ").append(toIndentedString(pair)).append("\n");
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