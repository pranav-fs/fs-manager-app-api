package com.fastspring.app.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * StoreLocalizationSettings
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-07T13:23:00.142547+05:30[Asia/Kolkata]", comments = "Generator version: 7.14.0")
public class StoreLocalizationSettings {

  private @Nullable String baseCurrency;

  @Valid
  private List<String> supportedCurrencies = new ArrayList<>();

  private @Nullable String defaultLanguage;

  @Valid
  private List<String> supportedLanguages = new ArrayList<>();

  @Valid
  private List<String> supportedRegions = new ArrayList<>();

  public StoreLocalizationSettings baseCurrency(@Nullable String baseCurrency) {
    this.baseCurrency = baseCurrency;
    return this;
  }

  /**
   * Default currency for the store
   * @return baseCurrency
   */
  
  @Schema(name = "baseCurrency", description = "Default currency for the store", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("baseCurrency")
  public @Nullable String getBaseCurrency() {
    return baseCurrency;
  }

  public void setBaseCurrency(@Nullable String baseCurrency) {
    this.baseCurrency = baseCurrency;
  }

  public StoreLocalizationSettings supportedCurrencies(List<String> supportedCurrencies) {
    this.supportedCurrencies = supportedCurrencies;
    return this;
  }

  public StoreLocalizationSettings addSupportedCurrenciesItem(String supportedCurrenciesItem) {
    if (this.supportedCurrencies == null) {
      this.supportedCurrencies = new ArrayList<>();
    }
    this.supportedCurrencies.add(supportedCurrenciesItem);
    return this;
  }

  /**
   * Get supportedCurrencies
   * @return supportedCurrencies
   */
  
  @Schema(name = "supportedCurrencies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supportedCurrencies")
  public List<String> getSupportedCurrencies() {
    return supportedCurrencies;
  }

  public void setSupportedCurrencies(List<String> supportedCurrencies) {
    this.supportedCurrencies = supportedCurrencies;
  }

  public StoreLocalizationSettings defaultLanguage(@Nullable String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
    return this;
  }

  /**
   * Default language for the store
   * @return defaultLanguage
   */
  
  @Schema(name = "defaultLanguage", description = "Default language for the store", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultLanguage")
  public @Nullable String getDefaultLanguage() {
    return defaultLanguage;
  }

  public void setDefaultLanguage(@Nullable String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
  }

  public StoreLocalizationSettings supportedLanguages(List<String> supportedLanguages) {
    this.supportedLanguages = supportedLanguages;
    return this;
  }

  public StoreLocalizationSettings addSupportedLanguagesItem(String supportedLanguagesItem) {
    if (this.supportedLanguages == null) {
      this.supportedLanguages = new ArrayList<>();
    }
    this.supportedLanguages.add(supportedLanguagesItem);
    return this;
  }

  /**
   * Get supportedLanguages
   * @return supportedLanguages
   */
  
  @Schema(name = "supportedLanguages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supportedLanguages")
  public List<String> getSupportedLanguages() {
    return supportedLanguages;
  }

  public void setSupportedLanguages(List<String> supportedLanguages) {
    this.supportedLanguages = supportedLanguages;
  }

  public StoreLocalizationSettings supportedRegions(List<String> supportedRegions) {
    this.supportedRegions = supportedRegions;
    return this;
  }

  public StoreLocalizationSettings addSupportedRegionsItem(String supportedRegionsItem) {
    if (this.supportedRegions == null) {
      this.supportedRegions = new ArrayList<>();
    }
    this.supportedRegions.add(supportedRegionsItem);
    return this;
  }

  /**
   * List of supported regions for the store
   * @return supportedRegions
   */
  
  @Schema(name = "supportedRegions", description = "List of supported regions for the store", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supportedRegions")
  public List<String> getSupportedRegions() {
    return supportedRegions;
  }

  public void setSupportedRegions(List<String> supportedRegions) {
    this.supportedRegions = supportedRegions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreLocalizationSettings storeLocalizationSettings = (StoreLocalizationSettings) o;
    return Objects.equals(this.baseCurrency, storeLocalizationSettings.baseCurrency) &&
        Objects.equals(this.supportedCurrencies, storeLocalizationSettings.supportedCurrencies) &&
        Objects.equals(this.defaultLanguage, storeLocalizationSettings.defaultLanguage) &&
        Objects.equals(this.supportedLanguages, storeLocalizationSettings.supportedLanguages) &&
        Objects.equals(this.supportedRegions, storeLocalizationSettings.supportedRegions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseCurrency, supportedCurrencies, defaultLanguage, supportedLanguages, supportedRegions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreLocalizationSettings {\n");
    sb.append("    baseCurrency: ").append(toIndentedString(baseCurrency)).append("\n");
    sb.append("    supportedCurrencies: ").append(toIndentedString(supportedCurrencies)).append("\n");
    sb.append("    defaultLanguage: ").append(toIndentedString(defaultLanguage)).append("\n");
    sb.append("    supportedLanguages: ").append(toIndentedString(supportedLanguages)).append("\n");
    sb.append("    supportedRegions: ").append(toIndentedString(supportedRegions)).append("\n");
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

