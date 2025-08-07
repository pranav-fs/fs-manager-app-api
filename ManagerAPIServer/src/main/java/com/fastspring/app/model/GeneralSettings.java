package com.fastspring.app.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GeneralSettings
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-07T13:23:00.142547+05:30[Asia/Kolkata]", comments = "Generator version: 7.14.0")
public class GeneralSettings {

  private @Nullable String storeName;

  private @Nullable String storeDisplayName;

  private @Nullable URI storePublicUrl;

  private @Nullable String storePublicDescription;

  private @Nullable URI storePublicLogoUrl;

  private @Nullable URI storePublicFaviconUrl;

  private @Nullable String storePublicLabelColor;

  private @Nullable String replyToEmail;

  private @Nullable String emailFromName;

  public GeneralSettings storeName(@Nullable String storeName) {
    this.storeName = storeName;
    return this;
  }

  /**
   * FS Assigned Name of Store
   * @return storeName
   */
  
  @Schema(name = "storeName", description = "FS Assigned Name of Store", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("storeName")
  public @Nullable String getStoreName() {
    return storeName;
  }

  public void setStoreName(@Nullable String storeName) {
    this.storeName = storeName;
  }

  public GeneralSettings storeDisplayName(@Nullable String storeDisplayName) {
    this.storeDisplayName = storeDisplayName;
    return this;
  }

  /**
   * Display Name of Store (Seller applied)
   * @return storeDisplayName
   */
  
  @Schema(name = "storeDisplayName", description = "Display Name of Store (Seller applied)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("storeDisplayName")
  public @Nullable String getStoreDisplayName() {
    return storeDisplayName;
  }

  public void setStoreDisplayName(@Nullable String storeDisplayName) {
    this.storeDisplayName = storeDisplayName;
  }

  public GeneralSettings storePublicUrl(@Nullable URI storePublicUrl) {
    this.storePublicUrl = storePublicUrl;
    return this;
  }

  /**
   * Get storePublicUrl
   * @return storePublicUrl
   */
  @Valid 
  @Schema(name = "storePublicUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("storePublicUrl")
  public @Nullable URI getStorePublicUrl() {
    return storePublicUrl;
  }

  public void setStorePublicUrl(@Nullable URI storePublicUrl) {
    this.storePublicUrl = storePublicUrl;
  }

  public GeneralSettings storePublicDescription(@Nullable String storePublicDescription) {
    this.storePublicDescription = storePublicDescription;
    return this;
  }

  /**
   * Get storePublicDescription
   * @return storePublicDescription
   */
  
  @Schema(name = "storePublicDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("storePublicDescription")
  public @Nullable String getStorePublicDescription() {
    return storePublicDescription;
  }

  public void setStorePublicDescription(@Nullable String storePublicDescription) {
    this.storePublicDescription = storePublicDescription;
  }

  public GeneralSettings storePublicLogoUrl(@Nullable URI storePublicLogoUrl) {
    this.storePublicLogoUrl = storePublicLogoUrl;
    return this;
  }

  /**
   * S3 Upload URL for the store's logo
   * @return storePublicLogoUrl
   */
  @Valid 
  @Schema(name = "storePublicLogoUrl", description = "S3 Upload URL for the store's logo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("storePublicLogoUrl")
  public @Nullable URI getStorePublicLogoUrl() {
    return storePublicLogoUrl;
  }

  public void setStorePublicLogoUrl(@Nullable URI storePublicLogoUrl) {
    this.storePublicLogoUrl = storePublicLogoUrl;
  }

  public GeneralSettings storePublicFaviconUrl(@Nullable URI storePublicFaviconUrl) {
    this.storePublicFaviconUrl = storePublicFaviconUrl;
    return this;
  }

  /**
   * S3 Upload URL for the store's favicon
   * @return storePublicFaviconUrl
   */
  @Valid 
  @Schema(name = "storePublicFaviconUrl", description = "S3 Upload URL for the store's favicon", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("storePublicFaviconUrl")
  public @Nullable URI getStorePublicFaviconUrl() {
    return storePublicFaviconUrl;
  }

  public void setStorePublicFaviconUrl(@Nullable URI storePublicFaviconUrl) {
    this.storePublicFaviconUrl = storePublicFaviconUrl;
  }

  public GeneralSettings storePublicLabelColor(@Nullable String storePublicLabelColor) {
    this.storePublicLabelColor = storePublicLabelColor;
    return this;
  }

  /**
   * Hex color code for the store's header (for easy identification)
   * @return storePublicLabelColor
   */
  
  @Schema(name = "storePublicLabelColor", description = "Hex color code for the store's header (for easy identification)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("storePublicLabelColor")
  public @Nullable String getStorePublicLabelColor() {
    return storePublicLabelColor;
  }

  public void setStorePublicLabelColor(@Nullable String storePublicLabelColor) {
    this.storePublicLabelColor = storePublicLabelColor;
  }

  public GeneralSettings replyToEmail(@Nullable String replyToEmail) {
    this.replyToEmail = replyToEmail;
    return this;
  }

  /**
   * Get replyToEmail
   * @return replyToEmail
   */
  @javax.validation.constraints.Email 
  @Schema(name = "replyToEmail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("replyToEmail")
  public @Nullable String getReplyToEmail() {
    return replyToEmail;
  }

  public void setReplyToEmail(@Nullable String replyToEmail) {
    this.replyToEmail = replyToEmail;
  }

  public GeneralSettings emailFromName(@Nullable String emailFromName) {
    this.emailFromName = emailFromName;
    return this;
  }

  /**
   * Get emailFromName
   * @return emailFromName
   */
  
  @Schema(name = "emailFromName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emailFromName")
  public @Nullable String getEmailFromName() {
    return emailFromName;
  }

  public void setEmailFromName(@Nullable String emailFromName) {
    this.emailFromName = emailFromName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralSettings generalSettings = (GeneralSettings) o;
    return Objects.equals(this.storeName, generalSettings.storeName) &&
        Objects.equals(this.storeDisplayName, generalSettings.storeDisplayName) &&
        Objects.equals(this.storePublicUrl, generalSettings.storePublicUrl) &&
        Objects.equals(this.storePublicDescription, generalSettings.storePublicDescription) &&
        Objects.equals(this.storePublicLogoUrl, generalSettings.storePublicLogoUrl) &&
        Objects.equals(this.storePublicFaviconUrl, generalSettings.storePublicFaviconUrl) &&
        Objects.equals(this.storePublicLabelColor, generalSettings.storePublicLabelColor) &&
        Objects.equals(this.replyToEmail, generalSettings.replyToEmail) &&
        Objects.equals(this.emailFromName, generalSettings.emailFromName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeName, storeDisplayName, storePublicUrl, storePublicDescription, storePublicLogoUrl, storePublicFaviconUrl, storePublicLabelColor, replyToEmail, emailFromName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralSettings {\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    storeDisplayName: ").append(toIndentedString(storeDisplayName)).append("\n");
    sb.append("    storePublicUrl: ").append(toIndentedString(storePublicUrl)).append("\n");
    sb.append("    storePublicDescription: ").append(toIndentedString(storePublicDescription)).append("\n");
    sb.append("    storePublicLogoUrl: ").append(toIndentedString(storePublicLogoUrl)).append("\n");
    sb.append("    storePublicFaviconUrl: ").append(toIndentedString(storePublicFaviconUrl)).append("\n");
    sb.append("    storePublicLabelColor: ").append(toIndentedString(storePublicLabelColor)).append("\n");
    sb.append("    replyToEmail: ").append(toIndentedString(replyToEmail)).append("\n");
    sb.append("    emailFromName: ").append(toIndentedString(emailFromName)).append("\n");
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

