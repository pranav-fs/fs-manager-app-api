package com.fastspring.app.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatalogSettings
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-07T13:23:00.142547+05:30[Asia/Kolkata]", comments = "Generator version: 7.14.0")
public class CatalogSettings {

  private @Nullable String defaultTaxCode;

  private @Nullable String defaultProductFormat;

  /**
   * Gets or Sets catalogMode
   */
  public enum CatalogModeEnum {
    GAMING("gaming"),
    
    SUBSCRIPTIONS("subscriptions"),
    
    DIGITAL("digital"),
    
    PHYSICAL("physical"),
    
    SERVICES("services");

    private final String value;

    CatalogModeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CatalogModeEnum fromValue(String value) {
      for (CatalogModeEnum b : CatalogModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable CatalogModeEnum catalogMode;

  private @Nullable Boolean advancedPricingEnabled;

  private @Nullable Boolean urlLinkSourcesEnabled;

  public CatalogSettings defaultTaxCode(@Nullable String defaultTaxCode) {
    this.defaultTaxCode = defaultTaxCode;
    return this;
  }

  /**
   * Default Avalara tax code for the store catalog items
   * @return defaultTaxCode
   */
  
  @Schema(name = "defaultTaxCode", description = "Default Avalara tax code for the store catalog items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultTaxCode")
  public @Nullable String getDefaultTaxCode() {
    return defaultTaxCode;
  }

  public void setDefaultTaxCode(@Nullable String defaultTaxCode) {
    this.defaultTaxCode = defaultTaxCode;
  }

  public CatalogSettings defaultProductFormat(@Nullable String defaultProductFormat) {
    this.defaultProductFormat = defaultProductFormat;
    return this;
  }

  /**
   * Default product type for the store catalog items
   * @return defaultProductFormat
   */
  
  @Schema(name = "defaultProductFormat", description = "Default product type for the store catalog items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultProductFormat")
  public @Nullable String getDefaultProductFormat() {
    return defaultProductFormat;
  }

  public void setDefaultProductFormat(@Nullable String defaultProductFormat) {
    this.defaultProductFormat = defaultProductFormat;
  }

  public CatalogSettings catalogMode(@Nullable CatalogModeEnum catalogMode) {
    this.catalogMode = catalogMode;
    return this;
  }

  /**
   * Get catalogMode
   * @return catalogMode
   */
  
  @Schema(name = "catalogMode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catalogMode")
  public @Nullable CatalogModeEnum getCatalogMode() {
    return catalogMode;
  }

  public void setCatalogMode(@Nullable CatalogModeEnum catalogMode) {
    this.catalogMode = catalogMode;
  }

  public CatalogSettings advancedPricingEnabled(@Nullable Boolean advancedPricingEnabled) {
    this.advancedPricingEnabled = advancedPricingEnabled;
    return this;
  }

  /**
   * Enable advanced pricing features for the store catalog items
   * @return advancedPricingEnabled
   */
  
  @Schema(name = "advancedPricingEnabled", description = "Enable advanced pricing features for the store catalog items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("advancedPricingEnabled")
  public @Nullable Boolean getAdvancedPricingEnabled() {
    return advancedPricingEnabled;
  }

  public void setAdvancedPricingEnabled(@Nullable Boolean advancedPricingEnabled) {
    this.advancedPricingEnabled = advancedPricingEnabled;
  }

  public CatalogSettings urlLinkSourcesEnabled(@Nullable Boolean urlLinkSourcesEnabled) {
    this.urlLinkSourcesEnabled = urlLinkSourcesEnabled;
    return this;
  }

  /**
   * Enable URL link sources for the store catalog items
   * @return urlLinkSourcesEnabled
   */
  
  @Schema(name = "urlLinkSourcesEnabled", description = "Enable URL link sources for the store catalog items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("urlLinkSourcesEnabled")
  public @Nullable Boolean getUrlLinkSourcesEnabled() {
    return urlLinkSourcesEnabled;
  }

  public void setUrlLinkSourcesEnabled(@Nullable Boolean urlLinkSourcesEnabled) {
    this.urlLinkSourcesEnabled = urlLinkSourcesEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogSettings catalogSettings = (CatalogSettings) o;
    return Objects.equals(this.defaultTaxCode, catalogSettings.defaultTaxCode) &&
        Objects.equals(this.defaultProductFormat, catalogSettings.defaultProductFormat) &&
        Objects.equals(this.catalogMode, catalogSettings.catalogMode) &&
        Objects.equals(this.advancedPricingEnabled, catalogSettings.advancedPricingEnabled) &&
        Objects.equals(this.urlLinkSourcesEnabled, catalogSettings.urlLinkSourcesEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultTaxCode, defaultProductFormat, catalogMode, advancedPricingEnabled, urlLinkSourcesEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogSettings {\n");
    sb.append("    defaultTaxCode: ").append(toIndentedString(defaultTaxCode)).append("\n");
    sb.append("    defaultProductFormat: ").append(toIndentedString(defaultProductFormat)).append("\n");
    sb.append("    catalogMode: ").append(toIndentedString(catalogMode)).append("\n");
    sb.append("    advancedPricingEnabled: ").append(toIndentedString(advancedPricingEnabled)).append("\n");
    sb.append("    urlLinkSourcesEnabled: ").append(toIndentedString(urlLinkSourcesEnabled)).append("\n");
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

