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
import io.swagger.client.model.AbiParamInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ParseAbiDataResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-22T12:45:14.641970156Z[Etc/UTC]")
public class ParseAbiDataResponse {
  @SerializedName("contract_description")
  private String contractDescription = null;

  @SerializedName("contract_name")
  private String contractName = null;

  @SerializedName("malicious_contract")
  private Integer maliciousContract = null;

  @SerializedName("method")
  private String method = null;

  @SerializedName("params")
  private List<AbiParamInfo> params = null;

  @SerializedName("risk")
  private String risk = null;

  @SerializedName("risky_signature")
  private Integer riskySignature = null;

  @SerializedName("signature_detail")
  private String signatureDetail = null;

  public ParseAbiDataResponse contractDescription(String contractDescription) {
    this.contractDescription = contractDescription;
    return this;
  }

   /**
   * Description of the contract.
   * @return contractDescription
  **/
  @Schema(description = "Description of the contract.")
  public String getContractDescription() {
    return contractDescription;
  }

  public void setContractDescription(String contractDescription) {
    this.contractDescription = contractDescription;
  }

  public ParseAbiDataResponse contractName(String contractName) {
    this.contractName = contractName;
    return this;
  }

   /**
   * The name of the contract that the user is interacting with.
   * @return contractName
  **/
  @Schema(description = "The name of the contract that the user is interacting with.")
  public String getContractName() {
    return contractName;
  }

  public void setContractName(String contractName) {
    this.contractName = contractName;
  }

  public ParseAbiDataResponse maliciousContract(Integer maliciousContract) {
    this.maliciousContract = maliciousContract;
    return this;
  }

   /**
   * It tells if contract that the user is interacting with is malicious contract.
   * @return maliciousContract
  **/
  @Schema(description = "It tells if contract that the user is interacting with is malicious contract.")
  public Integer getMaliciousContract() {
    return maliciousContract;
  }

  public void setMaliciousContract(Integer maliciousContract) {
    this.maliciousContract = maliciousContract;
  }

  public ParseAbiDataResponse method(String method) {
    this.method = method;
    return this;
  }

   /**
   * It describes the method name in ABI, for example \&quot;transfer\&quot;.
   * @return method
  **/
  @Schema(description = "It describes the method name in ABI, for example \"transfer\".")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public ParseAbiDataResponse params(List<AbiParamInfo> params) {
    this.params = params;
    return this;
  }

  public ParseAbiDataResponse addParamsItem(AbiParamInfo paramsItem) {
    if (this.params == null) {
      this.params = new ArrayList<AbiParamInfo>();
    }
    this.params.add(paramsItem);
    return this;
  }

   /**
   * It describes the parameter info
   * @return params
  **/
  @Schema(description = "It describes the parameter info")
  public List<AbiParamInfo> getParams() {
    return params;
  }

  public void setParams(List<AbiParamInfo> params) {
    this.params = params;
  }

  public ParseAbiDataResponse risk(String risk) {
    this.risk = risk;
    return this;
  }

   /**
   * It explains why the transaction that users are signing contains risk.(Notice:Even non-malicious, commonly used, well-known contracts can be highly risky if not used properly.)
   * @return risk
  **/
  @Schema(description = "It explains why the transaction that users are signing contains risk.(Notice:Even non-malicious, commonly used, well-known contracts can be highly risky if not used properly.)")
  public String getRisk() {
    return risk;
  }

  public void setRisk(String risk) {
    this.risk = risk;
  }

  public ParseAbiDataResponse riskySignature(Integer riskySignature) {
    this.riskySignature = riskySignature;
    return this;
  }

   /**
   * It tells if the transaction that users are signing contains risk.(Notice:Even non-malicious, commonly used, well-known contracts can be highly risky if not used properly.)
   * @return riskySignature
  **/
  @Schema(description = "It tells if the transaction that users are signing contains risk.(Notice:Even non-malicious, commonly used, well-known contracts can be highly risky if not used properly.)")
  public Integer getRiskySignature() {
    return riskySignature;
  }

  public void setRiskySignature(Integer riskySignature) {
    this.riskySignature = riskySignature;
  }

  public ParseAbiDataResponse signatureDetail(String signatureDetail) {
    this.signatureDetail = signatureDetail;
    return this;
  }

   /**
   * It explain the function of the method
   * @return signatureDetail
  **/
  @Schema(description = "It explain the function of the method")
  public String getSignatureDetail() {
    return signatureDetail;
  }

  public void setSignatureDetail(String signatureDetail) {
    this.signatureDetail = signatureDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParseAbiDataResponse parseAbiDataResponse = (ParseAbiDataResponse) o;
    return Objects.equals(this.contractDescription, parseAbiDataResponse.contractDescription) &&
        Objects.equals(this.contractName, parseAbiDataResponse.contractName) &&
        Objects.equals(this.maliciousContract, parseAbiDataResponse.maliciousContract) &&
        Objects.equals(this.method, parseAbiDataResponse.method) &&
        Objects.equals(this.params, parseAbiDataResponse.params) &&
        Objects.equals(this.risk, parseAbiDataResponse.risk) &&
        Objects.equals(this.riskySignature, parseAbiDataResponse.riskySignature) &&
        Objects.equals(this.signatureDetail, parseAbiDataResponse.signatureDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractDescription, contractName, maliciousContract, method, params, risk, riskySignature, signatureDetail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParseAbiDataResponse {\n");
    
    sb.append("    contractDescription: ").append(toIndentedString(contractDescription)).append("\n");
    sb.append("    contractName: ").append(toIndentedString(contractName)).append("\n");
    sb.append("    maliciousContract: ").append(toIndentedString(maliciousContract)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    riskySignature: ").append(toIndentedString(riskySignature)).append("\n");
    sb.append("    signatureDetail: ").append(toIndentedString(signatureDetail)).append("\n");
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
