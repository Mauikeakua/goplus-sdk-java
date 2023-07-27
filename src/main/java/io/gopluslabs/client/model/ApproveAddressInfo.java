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
 * ApproveAddressInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-27T08:37:03.140494914Z[Etc/UTC]")

public class ApproveAddressInfo {
  @SerializedName("contract_name")
  private String contractName = null;

  @SerializedName("creator_address")
  private String creatorAddress = null;

  @SerializedName("deployed_time")
  private Long deployedTime = null;

  @SerializedName("doubt_list")
  private Integer doubtList = null;

  @SerializedName("is_contract")
  private Integer isContract = null;

  @SerializedName("is_open_source")
  private Integer isOpenSource = null;

  @SerializedName("malicious_behavior")
  private List<String> maliciousBehavior = null;

  @SerializedName("tag")
  private String tag = null;

  @SerializedName("trust_list")
  private Integer trustList = null;

  public ApproveAddressInfo contractName(String contractName) {
    this.contractName = contractName;
    return this;
  }

   /**
   * Spender name
   * @return contractName
  **/
  @Schema(description = "Spender name")
  public String getContractName() {
    return contractName;
  }

  public void setContractName(String contractName) {
    this.contractName = contractName;
  }

  public ApproveAddressInfo creatorAddress(String creatorAddress) {
    this.creatorAddress = creatorAddress;
    return this;
  }

   /**
   * Spender&#x27;s deployer
   * @return creatorAddress
  **/
  @Schema(description = "Spender's deployer")
  public String getCreatorAddress() {
    return creatorAddress;
  }

  public void setCreatorAddress(String creatorAddress) {
    this.creatorAddress = creatorAddress;
  }

  public ApproveAddressInfo deployedTime(Long deployedTime) {
    this.deployedTime = deployedTime;
    return this;
  }

   /**
   * Spender&#x27;s deployed time
   * @return deployedTime
  **/
  @Schema(description = "Spender's deployed time")
  public Long getDeployedTime() {
    return deployedTime;
  }

  public void setDeployedTime(Long deployedTime) {
    this.deployedTime = deployedTime;
  }

  public ApproveAddressInfo doubtList(Integer doubtList) {
    this.doubtList = doubtList;
    return this;
  }

   /**
   * Whether the spender has a history of malicious behavior or contains high risk.
   * @return doubtList
  **/
  @Schema(description = "Whether the spender has a history of malicious behavior or contains high risk.")
  public Integer getDoubtList() {
    return doubtList;
  }

  public void setDoubtList(Integer doubtList) {
    this.doubtList = doubtList;
  }

  public ApproveAddressInfo isContract(Integer isContract) {
    this.isContract = isContract;
    return this;
  }

   /**
   * Whether the spender is a contract.
   * @return isContract
  **/
  @Schema(description = "Whether the spender is a contract.")
  public Integer getIsContract() {
    return isContract;
  }

  public void setIsContract(Integer isContract) {
    this.isContract = isContract;
  }

  public ApproveAddressInfo isOpenSource(Integer isOpenSource) {
    this.isOpenSource = isOpenSource;
    return this;
  }

   /**
   * Whether the spender is verified on blockchain explorer.
   * @return isOpenSource
  **/
  @Schema(description = "Whether the spender is verified on blockchain explorer.")
  public Integer getIsOpenSource() {
    return isOpenSource;
  }

  public void setIsOpenSource(Integer isOpenSource) {
    this.isOpenSource = isOpenSource;
  }

  public ApproveAddressInfo maliciousBehavior(List<String> maliciousBehavior) {
    this.maliciousBehavior = maliciousBehavior;
    return this;
  }

  public ApproveAddressInfo addMaliciousBehaviorItem(String maliciousBehaviorItem) {
    if (this.maliciousBehavior == null) {
      this.maliciousBehavior = new ArrayList<String>();
    }
    this.maliciousBehavior.add(maliciousBehaviorItem);
    return this;
  }

   /**
   * Specific malicious behaviors or risks of this spender.
   * @return maliciousBehavior
  **/
  @Schema(description = "Specific malicious behaviors or risks of this spender.")
  public List<String> getMaliciousBehavior() {
    return maliciousBehavior;
  }

  public void setMaliciousBehavior(List<String> maliciousBehavior) {
    this.maliciousBehavior = maliciousBehavior;
  }

  public ApproveAddressInfo tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Spender tag
   * @return tag
  **/
  @Schema(description = "Spender tag")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public ApproveAddressInfo trustList(Integer trustList) {
    this.trustList = trustList;
    return this;
  }

   /**
   * Whether the spender is on the whitelist, and can be trusted
   * @return trustList
  **/
  @Schema(description = "Whether the spender is on the whitelist, and can be trusted")
  public Integer getTrustList() {
    return trustList;
  }

  public void setTrustList(Integer trustList) {
    this.trustList = trustList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApproveAddressInfo approveAddressInfo = (ApproveAddressInfo) o;
    return Objects.equals(this.contractName, approveAddressInfo.contractName) &&
        Objects.equals(this.creatorAddress, approveAddressInfo.creatorAddress) &&
        Objects.equals(this.deployedTime, approveAddressInfo.deployedTime) &&
        Objects.equals(this.doubtList, approveAddressInfo.doubtList) &&
        Objects.equals(this.isContract, approveAddressInfo.isContract) &&
        Objects.equals(this.isOpenSource, approveAddressInfo.isOpenSource) &&
        Objects.equals(this.maliciousBehavior, approveAddressInfo.maliciousBehavior) &&
        Objects.equals(this.tag, approveAddressInfo.tag) &&
        Objects.equals(this.trustList, approveAddressInfo.trustList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractName, creatorAddress, deployedTime, doubtList, isContract, isOpenSource, maliciousBehavior, tag, trustList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApproveAddressInfo {\n");
    
    sb.append("    contractName: ").append(toIndentedString(contractName)).append("\n");
    sb.append("    creatorAddress: ").append(toIndentedString(creatorAddress)).append("\n");
    sb.append("    deployedTime: ").append(toIndentedString(deployedTime)).append("\n");
    sb.append("    doubtList: ").append(toIndentedString(doubtList)).append("\n");
    sb.append("    isContract: ").append(toIndentedString(isContract)).append("\n");
    sb.append("    isOpenSource: ").append(toIndentedString(isOpenSource)).append("\n");
    sb.append("    maliciousBehavior: ").append(toIndentedString(maliciousBehavior)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    trustList: ").append(toIndentedString(trustList)).append("\n");
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
