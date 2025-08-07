package com.fastspring.app.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SupportSettings
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-07T13:23:00.142547+05:30[Asia/Kolkata]", comments = "Generator version: 7.14.0")
public class SupportSettings {

  private @Nullable String supportEmail;

  private @Nullable String supportPhoneNumber;

  private @Nullable String supportHours;

  private @Nullable String supportOrganization;

  private @Nullable String supportNotes;

  private @Nullable Boolean displaySupportContactOnReceipt;

  public SupportSettings supportEmail(@Nullable String supportEmail) {
    this.supportEmail = supportEmail;
    return this;
  }

  /**
   * Support email address for the store
   * @return supportEmail
   */
  @javax.validation.constraints.Email 
  @Schema(name = "supportEmail", description = "Support email address for the store", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supportEmail")
  public @Nullable String getSupportEmail() {
    return supportEmail;
  }

  public void setSupportEmail(@Nullable String supportEmail) {
    this.supportEmail = supportEmail;
  }

  public SupportSettings supportPhoneNumber(@Nullable String supportPhoneNumber) {
    this.supportPhoneNumber = supportPhoneNumber;
    return this;
  }

  /**
   * Support phone number for the store
   * @return supportPhoneNumber
   */
  
  @Schema(name = "supportPhoneNumber", description = "Support phone number for the store", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supportPhoneNumber")
  public @Nullable String getSupportPhoneNumber() {
    return supportPhoneNumber;
  }

  public void setSupportPhoneNumber(@Nullable String supportPhoneNumber) {
    this.supportPhoneNumber = supportPhoneNumber;
  }

  public SupportSettings supportHours(@Nullable String supportHours) {
    this.supportHours = supportHours;
    return this;
  }

  /**
   * Support hours for the store (e.g., \"Mon-Fri 9am-5pm\")
   * @return supportHours
   */
  
  @Schema(name = "supportHours", description = "Support hours for the store (e.g., \"Mon-Fri 9am-5pm\")", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supportHours")
  public @Nullable String getSupportHours() {
    return supportHours;
  }

  public void setSupportHours(@Nullable String supportHours) {
    this.supportHours = supportHours;
  }

  public SupportSettings supportOrganization(@Nullable String supportOrganization) {
    this.supportOrganization = supportOrganization;
    return this;
  }

  /**
   * Support organization name for the store
   * @return supportOrganization
   */
  
  @Schema(name = "supportOrganization", description = "Support organization name for the store", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supportOrganization")
  public @Nullable String getSupportOrganization() {
    return supportOrganization;
  }

  public void setSupportOrganization(@Nullable String supportOrganization) {
    this.supportOrganization = supportOrganization;
  }

  public SupportSettings supportNotes(@Nullable String supportNotes) {
    this.supportNotes = supportNotes;
    return this;
  }

  /**
   * Additional support notes or instructions for the store
   * @return supportNotes
   */
  
  @Schema(name = "supportNotes", description = "Additional support notes or instructions for the store", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supportNotes")
  public @Nullable String getSupportNotes() {
    return supportNotes;
  }

  public void setSupportNotes(@Nullable String supportNotes) {
    this.supportNotes = supportNotes;
  }

  public SupportSettings displaySupportContactOnReceipt(@Nullable Boolean displaySupportContactOnReceipt) {
    this.displaySupportContactOnReceipt = displaySupportContactOnReceipt;
    return this;
  }

  /**
   * Display support contact information on receipts
   * @return displaySupportContactOnReceipt
   */
  
  @Schema(name = "displaySupportContactOnReceipt", description = "Display support contact information on receipts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displaySupportContactOnReceipt")
  public @Nullable Boolean getDisplaySupportContactOnReceipt() {
    return displaySupportContactOnReceipt;
  }

  public void setDisplaySupportContactOnReceipt(@Nullable Boolean displaySupportContactOnReceipt) {
    this.displaySupportContactOnReceipt = displaySupportContactOnReceipt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportSettings supportSettings = (SupportSettings) o;
    return Objects.equals(this.supportEmail, supportSettings.supportEmail) &&
        Objects.equals(this.supportPhoneNumber, supportSettings.supportPhoneNumber) &&
        Objects.equals(this.supportHours, supportSettings.supportHours) &&
        Objects.equals(this.supportOrganization, supportSettings.supportOrganization) &&
        Objects.equals(this.supportNotes, supportSettings.supportNotes) &&
        Objects.equals(this.displaySupportContactOnReceipt, supportSettings.displaySupportContactOnReceipt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportEmail, supportPhoneNumber, supportHours, supportOrganization, supportNotes, displaySupportContactOnReceipt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportSettings {\n");
    sb.append("    supportEmail: ").append(toIndentedString(supportEmail)).append("\n");
    sb.append("    supportPhoneNumber: ").append(toIndentedString(supportPhoneNumber)).append("\n");
    sb.append("    supportHours: ").append(toIndentedString(supportHours)).append("\n");
    sb.append("    supportOrganization: ").append(toIndentedString(supportOrganization)).append("\n");
    sb.append("    supportNotes: ").append(toIndentedString(supportNotes)).append("\n");
    sb.append("    displaySupportContactOnReceipt: ").append(toIndentedString(displaySupportContactOnReceipt)).append("\n");
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

