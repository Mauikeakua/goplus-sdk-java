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
 * Response result
 */
@Schema(description = "Response result")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-28T06:52:19.201634885Z[Etc/UTC]")

public class ResponseWrapperAddressContractResult {
  @SerializedName("cybercrime")
  private String cybercrime = null;

  @SerializedName("money_laundering")
  private String moneyLaundering = null;

  @SerializedName("number_of_malicious_contracts_created")
  private String numberOfMaliciousContractsCreated = null;

  @SerializedName("financial_crime")
  private String financialCrime = null;

  @SerializedName("darkweb_transactions")
  private String darkwebTransactions = null;

  @SerializedName("phishing_activities")
  private String phishingActivities = null;

  @SerializedName("contract_address")
  private String contractAddress = null;

  @SerializedName("fake_kyc")
  private String fakeKyc = null;

  @SerializedName("blacklist_doubt")
  private String blacklistDoubt = null;

  @SerializedName("data_source")
  private String dataSource = null;

  @SerializedName("stealing_attack")
  private String stealingAttack = null;

  @SerializedName("blackmail_activities")
  private String blackmailActivities = null;

  @SerializedName("sanctioned")
  private String sanctioned = null;

  @SerializedName("malicious_mining_activities")
  private String maliciousMiningActivities = null;

  @SerializedName("mixer")
  private String mixer = null;

  @SerializedName("honeypot_related_address")
  private String honeypotRelatedAddress = null;

  public ResponseWrapperAddressContractResult cybercrime(String cybercrime) {
    this.cybercrime = cybercrime;
    return this;
  }

   /**
   * It describes whether this address is involved in cybercrime. \&quot;1\&quot; means true; \&quot;0\&quot; means false.
   * @return cybercrime
  **/
  @Schema(description = "It describes whether this address is involved in cybercrime. \"1\" means true; \"0\" means false.")
  public String getCybercrime() {
    return cybercrime;
  }

  public void setCybercrime(String cybercrime) {
    this.cybercrime = cybercrime;
  }

  public ResponseWrapperAddressContractResult moneyLaundering(String moneyLaundering) {
    this.moneyLaundering = moneyLaundering;
    return this;
  }

   /**
   * It describes whether this address is involved in money laundering. \&quot;1\&quot; means true; \&quot;0\&quot; means false.
   * @return moneyLaundering
  **/
  @Schema(description = "It describes whether this address is involved in money laundering. \"1\" means true; \"0\" means false.")
  public String getMoneyLaundering() {
    return moneyLaundering;
  }

  public void setMoneyLaundering(String moneyLaundering) {
    this.moneyLaundering = moneyLaundering;
  }

  public ResponseWrapperAddressContractResult numberOfMaliciousContractsCreated(String numberOfMaliciousContractsCreated) {
    this.numberOfMaliciousContractsCreated = numberOfMaliciousContractsCreated;
    return this;
  }

   /**
   * This parameter describes how many malicious contracts have been created by this address.
   * @return numberOfMaliciousContractsCreated
  **/
  @Schema(description = "This parameter describes how many malicious contracts have been created by this address.")
  public String getNumberOfMaliciousContractsCreated() {
    return numberOfMaliciousContractsCreated;
  }

  public void setNumberOfMaliciousContractsCreated(String numberOfMaliciousContractsCreated) {
    this.numberOfMaliciousContractsCreated = numberOfMaliciousContractsCreated;
  }

  public ResponseWrapperAddressContractResult financialCrime(String financialCrime) {
    this.financialCrime = financialCrime;
    return this;
  }

   /**
   * It describes whether this address is involved in financial crime. \&quot;1\&quot; means true; \&quot;0\&quot; means false.
   * @return financialCrime
  **/
  @Schema(description = "It describes whether this address is involved in financial crime. \"1\" means true; \"0\" means false.")
  public String getFinancialCrime() {
    return financialCrime;
  }

  public void setFinancialCrime(String financialCrime) {
    this.financialCrime = financialCrime;
  }

  public ResponseWrapperAddressContractResult darkwebTransactions(String darkwebTransactions) {
    this.darkwebTransactions = darkwebTransactions;
    return this;
  }

   /**
   * It describes whether this address is involved in darkweb transactions. \&quot;1\&quot; means true; \&quot;0\&quot; means false.
   * @return darkwebTransactions
  **/
  @Schema(description = "It describes whether this address is involved in darkweb transactions. \"1\" means true; \"0\" means false.")
  public String getDarkwebTransactions() {
    return darkwebTransactions;
  }

  public void setDarkwebTransactions(String darkwebTransactions) {
    this.darkwebTransactions = darkwebTransactions;
  }

  public ResponseWrapperAddressContractResult phishingActivities(String phishingActivities) {
    this.phishingActivities = phishingActivities;
    return this;
  }

   /**
   * It describes whether this address has implemented phishing activities. \&quot;1\&quot; means true; \&quot;0\&quot; means false.
   * @return phishingActivities
  **/
  @Schema(description = "It describes whether this address has implemented phishing activities. \"1\" means true; \"0\" means false.")
  public String getPhishingActivities() {
    return phishingActivities;
  }

  public void setPhishingActivities(String phishingActivities) {
    this.phishingActivities = phishingActivities;
  }

  public ResponseWrapperAddressContractResult contractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
    return this;
  }

   /**
   * It describes whether this address is a contract address. \&quot;1\&quot; means true; \&quot;0\&quot; means false.(Notice:If only the address is sent to the API and not the chain id, the \&quot;contract_address\&quot; will not be returned (This is because there are cases where the same address is a contract in one public chain but not in other public chains.) Determining the contract address is achieved by calling a third-party blockchain browser interface. Since it takes time for the browser interface to return, the field may be empty on the first request. Solution: the second call around 5s can return whether the address is the value of the contract normally.)
   * @return contractAddress
  **/
  @Schema(description = "It describes whether this address is a contract address. \"1\" means true; \"0\" means false.(Notice:If only the address is sent to the API and not the chain id, the \"contract_address\" will not be returned (This is because there are cases where the same address is a contract in one public chain but not in other public chains.) Determining the contract address is achieved by calling a third-party blockchain browser interface. Since it takes time for the browser interface to return, the field may be empty on the first request. Solution: the second call around 5s can return whether the address is the value of the contract normally.)")
  public String getContractAddress() {
    return contractAddress;
  }

  public void setContractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
  }

  public ResponseWrapperAddressContractResult fakeKyc(String fakeKyc) {
    this.fakeKyc = fakeKyc;
    return this;
  }

   /**
   * It describes whether this address is involved in fake KYC. \&quot;1\&quot; means true; \&quot;0\&quot; means false.
   * @return fakeKyc
  **/
  @Schema(description = "It describes whether this address is involved in fake KYC. \"1\" means true; \"0\" means false.")
  public String getFakeKyc() {
    return fakeKyc;
  }

  public void setFakeKyc(String fakeKyc) {
    this.fakeKyc = fakeKyc;
  }

  public ResponseWrapperAddressContractResult blacklistDoubt(String blacklistDoubt) {
    this.blacklistDoubt = blacklistDoubt;
    return this;
  }

   /**
   * It describes whether this address is suspected of malicious behavior. \&quot;1\&quot; means true; \&quot;0\&quot; means false.
   * @return blacklistDoubt
  **/
  @Schema(description = "It describes whether this address is suspected of malicious behavior. \"1\" means true; \"0\" means false.")
  public String getBlacklistDoubt() {
    return blacklistDoubt;
  }

  public void setBlacklistDoubt(String blacklistDoubt) {
    this.blacklistDoubt = blacklistDoubt;
  }

  public ResponseWrapperAddressContractResult dataSource(String dataSource) {
    this.dataSource = dataSource;
    return this;
  }

   /**
   * It describes the data source for this address information. For example：GoPlus/SlowMist
   * @return dataSource
  **/
  @Schema(description = "It describes the data source for this address information. For example：GoPlus/SlowMist")
  public String getDataSource() {
    return dataSource;
  }

  public void setDataSource(String dataSource) {
    this.dataSource = dataSource;
  }

  public ResponseWrapperAddressContractResult stealingAttack(String stealingAttack) {
    this.stealingAttack = stealingAttack;
    return this;
  }

   /**
   * It describes whether this address has implemented stealing attacks. \&quot;1\&quot; means true; \&quot;0\&quot; means false.
   * @return stealingAttack
  **/
  @Schema(description = "It describes whether this address has implemented stealing attacks. \"1\" means true; \"0\" means false.")
  public String getStealingAttack() {
    return stealingAttack;
  }

  public void setStealingAttack(String stealingAttack) {
    this.stealingAttack = stealingAttack;
  }

  public ResponseWrapperAddressContractResult blackmailActivities(String blackmailActivities) {
    this.blackmailActivities = blackmailActivities;
    return this;
  }

   /**
   * It describes whether this address has implemented blackmail activities. \&quot;1\&quot; means true; \&quot;0\&quot; means false.
   * @return blackmailActivities
  **/
  @Schema(description = "It describes whether this address has implemented blackmail activities. \"1\" means true; \"0\" means false.")
  public String getBlackmailActivities() {
    return blackmailActivities;
  }

  public void setBlackmailActivities(String blackmailActivities) {
    this.blackmailActivities = blackmailActivities;
  }

  public ResponseWrapperAddressContractResult sanctioned(String sanctioned) {
    this.sanctioned = sanctioned;
    return this;
  }

   /**
   * It describes whether this address is coin sanctioned address. \&quot;1\&quot; means true; \&quot;0\&quot; means false.
   * @return sanctioned
  **/
  @Schema(description = "It describes whether this address is coin sanctioned address. \"1\" means true; \"0\" means false.")
  public String getSanctioned() {
    return sanctioned;
  }

  public void setSanctioned(String sanctioned) {
    this.sanctioned = sanctioned;
  }

  public ResponseWrapperAddressContractResult maliciousMiningActivities(String maliciousMiningActivities) {
    this.maliciousMiningActivities = maliciousMiningActivities;
    return this;
  }

   /**
   * It describes whether this address is involved in malicious mining activities. \&quot;1\&quot; means true; \&quot;0\&quot; means false.
   * @return maliciousMiningActivities
  **/
  @Schema(description = "It describes whether this address is involved in malicious mining activities. \"1\" means true; \"0\" means false.")
  public String getMaliciousMiningActivities() {
    return maliciousMiningActivities;
  }

  public void setMaliciousMiningActivities(String maliciousMiningActivities) {
    this.maliciousMiningActivities = maliciousMiningActivities;
  }

  public ResponseWrapperAddressContractResult mixer(String mixer) {
    this.mixer = mixer;
    return this;
  }

   /**
   * It describes whether this address is coin mixer address. \&quot;1\&quot; means true; \&quot;0\&quot; means false.(Notice:Interacting with coin mixer may result in your address being added to the risk list of third-party institutions.)
   * @return mixer
  **/
  @Schema(description = "It describes whether this address is coin mixer address. \"1\" means true; \"0\" means false.(Notice:Interacting with coin mixer may result in your address being added to the risk list of third-party institutions.)")
  public String getMixer() {
    return mixer;
  }

  public void setMixer(String mixer) {
    this.mixer = mixer;
  }

  public ResponseWrapperAddressContractResult honeypotRelatedAddress(String honeypotRelatedAddress) {
    this.honeypotRelatedAddress = honeypotRelatedAddress;
    return this;
  }

   /**
   * It describes whether this address is related to honeypot tokens or has created scam tokens. \&quot;1\&quot; means true; \&quot;0\&quot; means false.(Notice:Addresses related to honeypot mean the creators or owners of the honeypot tokens. This is a dangerous address if the address is ralated to honeypot tokens.)
   * @return honeypotRelatedAddress
  **/
  @Schema(description = "It describes whether this address is related to honeypot tokens or has created scam tokens. \"1\" means true; \"0\" means false.(Notice:Addresses related to honeypot mean the creators or owners of the honeypot tokens. This is a dangerous address if the address is ralated to honeypot tokens.)")
  public String getHoneypotRelatedAddress() {
    return honeypotRelatedAddress;
  }

  public void setHoneypotRelatedAddress(String honeypotRelatedAddress) {
    this.honeypotRelatedAddress = honeypotRelatedAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseWrapperAddressContractResult responseWrapperAddressContractResult = (ResponseWrapperAddressContractResult) o;
    return Objects.equals(this.cybercrime, responseWrapperAddressContractResult.cybercrime) &&
        Objects.equals(this.moneyLaundering, responseWrapperAddressContractResult.moneyLaundering) &&
        Objects.equals(this.numberOfMaliciousContractsCreated, responseWrapperAddressContractResult.numberOfMaliciousContractsCreated) &&
        Objects.equals(this.financialCrime, responseWrapperAddressContractResult.financialCrime) &&
        Objects.equals(this.darkwebTransactions, responseWrapperAddressContractResult.darkwebTransactions) &&
        Objects.equals(this.phishingActivities, responseWrapperAddressContractResult.phishingActivities) &&
        Objects.equals(this.contractAddress, responseWrapperAddressContractResult.contractAddress) &&
        Objects.equals(this.fakeKyc, responseWrapperAddressContractResult.fakeKyc) &&
        Objects.equals(this.blacklistDoubt, responseWrapperAddressContractResult.blacklistDoubt) &&
        Objects.equals(this.dataSource, responseWrapperAddressContractResult.dataSource) &&
        Objects.equals(this.stealingAttack, responseWrapperAddressContractResult.stealingAttack) &&
        Objects.equals(this.blackmailActivities, responseWrapperAddressContractResult.blackmailActivities) &&
        Objects.equals(this.sanctioned, responseWrapperAddressContractResult.sanctioned) &&
        Objects.equals(this.maliciousMiningActivities, responseWrapperAddressContractResult.maliciousMiningActivities) &&
        Objects.equals(this.mixer, responseWrapperAddressContractResult.mixer) &&
        Objects.equals(this.honeypotRelatedAddress, responseWrapperAddressContractResult.honeypotRelatedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cybercrime, moneyLaundering, numberOfMaliciousContractsCreated, financialCrime, darkwebTransactions, phishingActivities, contractAddress, fakeKyc, blacklistDoubt, dataSource, stealingAttack, blackmailActivities, sanctioned, maliciousMiningActivities, mixer, honeypotRelatedAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseWrapperAddressContractResult {\n");
    
    sb.append("    cybercrime: ").append(toIndentedString(cybercrime)).append("\n");
    sb.append("    moneyLaundering: ").append(toIndentedString(moneyLaundering)).append("\n");
    sb.append("    numberOfMaliciousContractsCreated: ").append(toIndentedString(numberOfMaliciousContractsCreated)).append("\n");
    sb.append("    financialCrime: ").append(toIndentedString(financialCrime)).append("\n");
    sb.append("    darkwebTransactions: ").append(toIndentedString(darkwebTransactions)).append("\n");
    sb.append("    phishingActivities: ").append(toIndentedString(phishingActivities)).append("\n");
    sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
    sb.append("    fakeKyc: ").append(toIndentedString(fakeKyc)).append("\n");
    sb.append("    blacklistDoubt: ").append(toIndentedString(blacklistDoubt)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    stealingAttack: ").append(toIndentedString(stealingAttack)).append("\n");
    sb.append("    blackmailActivities: ").append(toIndentedString(blackmailActivities)).append("\n");
    sb.append("    sanctioned: ").append(toIndentedString(sanctioned)).append("\n");
    sb.append("    maliciousMiningActivities: ").append(toIndentedString(maliciousMiningActivities)).append("\n");
    sb.append("    mixer: ").append(toIndentedString(mixer)).append("\n");
    sb.append("    honeypotRelatedAddress: ").append(toIndentedString(honeypotRelatedAddress)).append("\n");
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
