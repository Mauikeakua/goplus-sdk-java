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
import java.util.ArrayList;
import java.util.List;
/**
 * Response result
 */
@Schema(description = "Response result")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-06T09:52:32.634171989Z[Etc/UTC]")

public class ResponseWrapperPhishingSiteResult {
  @SerializedName("website_contract_security")
  private List<String> websiteContractSecurity = null;

  @SerializedName("phishing_site")
  private Integer phishingSite = null;

  public ResponseWrapperPhishingSiteResult websiteContractSecurity(List<String> websiteContractSecurity) {
    this.websiteContractSecurity = websiteContractSecurity;
    return this;
  }

  public ResponseWrapperPhishingSiteResult addWebsiteContractSecurityItem(String websiteContractSecurityItem) {
    if (this.websiteContractSecurity == null) {
      this.websiteContractSecurity = new ArrayList<String>();
    }
    this.websiteContractSecurity.add(websiteContractSecurityItem);
    return this;
  }

   /**
   * Get websiteContractSecurity
   * @return websiteContractSecurity
  **/
  @Schema(description = "")
  public List<String> getWebsiteContractSecurity() {
    return websiteContractSecurity;
  }

  public void setWebsiteContractSecurity(List<String> websiteContractSecurity) {
    this.websiteContractSecurity = websiteContractSecurity;
  }

  public ResponseWrapperPhishingSiteResult phishingSite(Integer phishingSite) {
    this.phishingSite = phishingSite;
    return this;
  }

   /**
   * It means whether the website is a phishing site. \&quot;1\&quot; means true; \&quot;0\&quot; means that we have not found malicious behavior of this website.
   * @return phishingSite
  **/
  @Schema(description = "It means whether the website is a phishing site. \"1\" means true; \"0\" means that we have not found malicious behavior of this website.")
  public Integer getPhishingSite() {
    return phishingSite;
  }

  public void setPhishingSite(Integer phishingSite) {
    this.phishingSite = phishingSite;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseWrapperPhishingSiteResult responseWrapperPhishingSiteResult = (ResponseWrapperPhishingSiteResult) o;
    return Objects.equals(this.websiteContractSecurity, responseWrapperPhishingSiteResult.websiteContractSecurity) &&
        Objects.equals(this.phishingSite, responseWrapperPhishingSiteResult.phishingSite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(websiteContractSecurity, phishingSite);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseWrapperPhishingSiteResult {\n");
    
    sb.append("    websiteContractSecurity: ").append(toIndentedString(websiteContractSecurity)).append("\n");
    sb.append("    phishingSite: ").append(toIndentedString(phishingSite)).append("\n");
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
