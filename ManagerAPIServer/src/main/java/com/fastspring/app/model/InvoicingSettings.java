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
 * InvoicingSettings
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-07T13:23:00.142547+05:30[Asia/Kolkata]", comments = "Generator version: 7.14.0")
public class InvoicingSettings {

  private @Nullable Boolean quoteManagementEnabled;

  private @Nullable Boolean intelligentQuoteManagementEnabled;

  private @Nullable String defaultQuoteNotes;

  /**
   * Default delivery method for invoices (e.g., \"Email\", \"Download\")
   */
  public enum DefaultDeliveryMethodEnum {
    AFTER_PAYMENT("After Payment"),
    
    REQUIRE_APPROVAL("Require Approval"),
    
    MANUALLY_FULFILLED("Manually Fulfilled"),
    
    OFFLINE_FULFILLMENT("Offline Fulfillment");

    private final String value;

    DefaultDeliveryMethodEnum(String value) {
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
    public static DefaultDeliveryMethodEnum fromValue(String value) {
      for (DefaultDeliveryMethodEnum b : DefaultDeliveryMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable DefaultDeliveryMethodEnum defaultDeliveryMethod;

  /**
   * Default net terms for invoices (e.g., \"Net 30\")
   */
  public enum DefaultNetTermsEnum {
    NET_0("NET 0"),
    
    NET_1("NET 1"),
    
    NET_7("NET 7"),
    
    NET_14("NET 14"),
    
    NET_30("NET 30"),
    
    NET_60("NET 60"),
    
    NET_90("NET 90");

    private final String value;

    DefaultNetTermsEnum(String value) {
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
    public static DefaultNetTermsEnum fromValue(String value) {
      for (DefaultNetTermsEnum b : DefaultNetTermsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable DefaultNetTermsEnum defaultNetTerms;

  private @Nullable Integer defaultDaysForInvoiceReminder;

  private @Nullable Boolean enablePrePaymentManualFulfillment;

  private @Nullable Boolean enableSecureInvoiceURL;

  private @Nullable Boolean enableSelfServiceUpgrade;

  private @Nullable Boolean allowSeparateBillingContact;

  private @Nullable Boolean contactManagementEnabled;

  private @Nullable Boolean checkPaymentInstructionsDisplayEnabled;

  private @Nullable Boolean apiInvoicingEnabled;

  public InvoicingSettings quoteManagementEnabled(@Nullable Boolean quoteManagementEnabled) {
    this.quoteManagementEnabled = quoteManagementEnabled;
    return this;
  }

  /**
   * Enable quotes and digital invoicing feature for the store
   * @return quoteManagementEnabled
   */
  
  @Schema(name = "quoteManagementEnabled", description = "Enable quotes and digital invoicing feature for the store", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quoteManagementEnabled")
  public @Nullable Boolean getQuoteManagementEnabled() {
    return quoteManagementEnabled;
  }

  public void setQuoteManagementEnabled(@Nullable Boolean quoteManagementEnabled) {
    this.quoteManagementEnabled = quoteManagementEnabled;
  }

  public InvoicingSettings intelligentQuoteManagementEnabled(@Nullable Boolean intelligentQuoteManagementEnabled) {
    this.intelligentQuoteManagementEnabled = intelligentQuoteManagementEnabled;
    return this;
  }

  /**
   * Enable intelligent quote management feature for the store
   * @return intelligentQuoteManagementEnabled
   */
  
  @Schema(name = "intelligentQuoteManagementEnabled", description = "Enable intelligent quote management feature for the store", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("intelligentQuoteManagementEnabled")
  public @Nullable Boolean getIntelligentQuoteManagementEnabled() {
    return intelligentQuoteManagementEnabled;
  }

  public void setIntelligentQuoteManagementEnabled(@Nullable Boolean intelligentQuoteManagementEnabled) {
    this.intelligentQuoteManagementEnabled = intelligentQuoteManagementEnabled;
  }

  public InvoicingSettings defaultQuoteNotes(@Nullable String defaultQuoteNotes) {
    this.defaultQuoteNotes = defaultQuoteNotes;
    return this;
  }

  /**
   * Default notes for quotes to be appended to all quotes
   * @return defaultQuoteNotes
   */
  
  @Schema(name = "defaultQuoteNotes", description = "Default notes for quotes to be appended to all quotes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultQuoteNotes")
  public @Nullable String getDefaultQuoteNotes() {
    return defaultQuoteNotes;
  }

  public void setDefaultQuoteNotes(@Nullable String defaultQuoteNotes) {
    this.defaultQuoteNotes = defaultQuoteNotes;
  }

  public InvoicingSettings defaultDeliveryMethod(@Nullable DefaultDeliveryMethodEnum defaultDeliveryMethod) {
    this.defaultDeliveryMethod = defaultDeliveryMethod;
    return this;
  }

  /**
   * Default delivery method for invoices (e.g., \"Email\", \"Download\")
   * @return defaultDeliveryMethod
   */
  
  @Schema(name = "defaultDeliveryMethod", description = "Default delivery method for invoices (e.g., \"Email\", \"Download\")", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultDeliveryMethod")
  public @Nullable DefaultDeliveryMethodEnum getDefaultDeliveryMethod() {
    return defaultDeliveryMethod;
  }

  public void setDefaultDeliveryMethod(@Nullable DefaultDeliveryMethodEnum defaultDeliveryMethod) {
    this.defaultDeliveryMethod = defaultDeliveryMethod;
  }

  public InvoicingSettings defaultNetTerms(@Nullable DefaultNetTermsEnum defaultNetTerms) {
    this.defaultNetTerms = defaultNetTerms;
    return this;
  }

  /**
   * Default net terms for invoices (e.g., \"Net 30\")
   * @return defaultNetTerms
   */
  
  @Schema(name = "defaultNetTerms", description = "Default net terms for invoices (e.g., \"Net 30\")", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultNetTerms")
  public @Nullable DefaultNetTermsEnum getDefaultNetTerms() {
    return defaultNetTerms;
  }

  public void setDefaultNetTerms(@Nullable DefaultNetTermsEnum defaultNetTerms) {
    this.defaultNetTerms = defaultNetTerms;
  }

  public InvoicingSettings defaultDaysForInvoiceReminder(@Nullable Integer defaultDaysForInvoiceReminder) {
    this.defaultDaysForInvoiceReminder = defaultDaysForInvoiceReminder;
    return this;
  }

  /**
   * Default number of days before sending an invoice reminder
   * @return defaultDaysForInvoiceReminder
   */
  
  @Schema(name = "defaultDaysForInvoiceReminder", description = "Default number of days before sending an invoice reminder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultDaysForInvoiceReminder")
  public @Nullable Integer getDefaultDaysForInvoiceReminder() {
    return defaultDaysForInvoiceReminder;
  }

  public void setDefaultDaysForInvoiceReminder(@Nullable Integer defaultDaysForInvoiceReminder) {
    this.defaultDaysForInvoiceReminder = defaultDaysForInvoiceReminder;
  }

  public InvoicingSettings enablePrePaymentManualFulfillment(@Nullable Boolean enablePrePaymentManualFulfillment) {
    this.enablePrePaymentManualFulfillment = enablePrePaymentManualFulfillment;
    return this;
  }

  /**
   * Enable pre-payment manual fulfillment for the store
   * @return enablePrePaymentManualFulfillment
   */
  
  @Schema(name = "enablePrePaymentManualFulfillment", description = "Enable pre-payment manual fulfillment for the store", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enablePrePaymentManualFulfillment")
  public @Nullable Boolean getEnablePrePaymentManualFulfillment() {
    return enablePrePaymentManualFulfillment;
  }

  public void setEnablePrePaymentManualFulfillment(@Nullable Boolean enablePrePaymentManualFulfillment) {
    this.enablePrePaymentManualFulfillment = enablePrePaymentManualFulfillment;
  }

  public InvoicingSettings enableSecureInvoiceURL(@Nullable Boolean enableSecureInvoiceURL) {
    this.enableSecureInvoiceURL = enableSecureInvoiceURL;
    return this;
  }

  /**
   * Enable secure invoice URL feature for the store
   * @return enableSecureInvoiceURL
   */
  
  @Schema(name = "enableSecureInvoiceURL", description = "Enable secure invoice URL feature for the store", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enableSecureInvoiceURL")
  public @Nullable Boolean getEnableSecureInvoiceURL() {
    return enableSecureInvoiceURL;
  }

  public void setEnableSecureInvoiceURL(@Nullable Boolean enableSecureInvoiceURL) {
    this.enableSecureInvoiceURL = enableSecureInvoiceURL;
  }

  public InvoicingSettings enableSelfServiceUpgrade(@Nullable Boolean enableSelfServiceUpgrade) {
    this.enableSelfServiceUpgrade = enableSelfServiceUpgrade;
    return this;
  }

  /**
   * Enable self-service upgrade feature for the store SAAS feature
   * @return enableSelfServiceUpgrade
   */
  
  @Schema(name = "enableSelfServiceUpgrade", description = "Enable self-service upgrade feature for the store SAAS feature", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enableSelfServiceUpgrade")
  public @Nullable Boolean getEnableSelfServiceUpgrade() {
    return enableSelfServiceUpgrade;
  }

  public void setEnableSelfServiceUpgrade(@Nullable Boolean enableSelfServiceUpgrade) {
    this.enableSelfServiceUpgrade = enableSelfServiceUpgrade;
  }

  public InvoicingSettings allowSeparateBillingContact(@Nullable Boolean allowSeparateBillingContact) {
    this.allowSeparateBillingContact = allowSeparateBillingContact;
    return this;
  }

  /**
   * Allow separate billing contact for the store
   * @return allowSeparateBillingContact
   */
  
  @Schema(name = "allowSeparateBillingContact", description = "Allow separate billing contact for the store", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowSeparateBillingContact")
  public @Nullable Boolean getAllowSeparateBillingContact() {
    return allowSeparateBillingContact;
  }

  public void setAllowSeparateBillingContact(@Nullable Boolean allowSeparateBillingContact) {
    this.allowSeparateBillingContact = allowSeparateBillingContact;
  }

  public InvoicingSettings contactManagementEnabled(@Nullable Boolean contactManagementEnabled) {
    this.contactManagementEnabled = contactManagementEnabled;
    return this;
  }

  /**
   * Enable contact management feature for the store
   * @return contactManagementEnabled
   */
  
  @Schema(name = "contactManagementEnabled", description = "Enable contact management feature for the store", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactManagementEnabled")
  public @Nullable Boolean getContactManagementEnabled() {
    return contactManagementEnabled;
  }

  public void setContactManagementEnabled(@Nullable Boolean contactManagementEnabled) {
    this.contactManagementEnabled = contactManagementEnabled;
  }

  public InvoicingSettings checkPaymentInstructionsDisplayEnabled(@Nullable Boolean checkPaymentInstructionsDisplayEnabled) {
    this.checkPaymentInstructionsDisplayEnabled = checkPaymentInstructionsDisplayEnabled;
    return this;
  }

  /**
   * Enable/Disable check payment/deposit instructions for the store in US
   * @return checkPaymentInstructionsDisplayEnabled
   */
  
  @Schema(name = "checkPaymentInstructionsDisplayEnabled", description = "Enable/Disable check payment/deposit instructions for the store in US", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("checkPaymentInstructionsDisplayEnabled")
  public @Nullable Boolean getCheckPaymentInstructionsDisplayEnabled() {
    return checkPaymentInstructionsDisplayEnabled;
  }

  public void setCheckPaymentInstructionsDisplayEnabled(@Nullable Boolean checkPaymentInstructionsDisplayEnabled) {
    this.checkPaymentInstructionsDisplayEnabled = checkPaymentInstructionsDisplayEnabled;
  }

  public InvoicingSettings apiInvoicingEnabled(@Nullable Boolean apiInvoicingEnabled) {
    this.apiInvoicingEnabled = apiInvoicingEnabled;
    return this;
  }

  /**
   * Enable API invoicing feature for the store
   * @return apiInvoicingEnabled
   */
  
  @Schema(name = "apiInvoicingEnabled", description = "Enable API invoicing feature for the store", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("apiInvoicingEnabled")
  public @Nullable Boolean getApiInvoicingEnabled() {
    return apiInvoicingEnabled;
  }

  public void setApiInvoicingEnabled(@Nullable Boolean apiInvoicingEnabled) {
    this.apiInvoicingEnabled = apiInvoicingEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicingSettings invoicingSettings = (InvoicingSettings) o;
    return Objects.equals(this.quoteManagementEnabled, invoicingSettings.quoteManagementEnabled) &&
        Objects.equals(this.intelligentQuoteManagementEnabled, invoicingSettings.intelligentQuoteManagementEnabled) &&
        Objects.equals(this.defaultQuoteNotes, invoicingSettings.defaultQuoteNotes) &&
        Objects.equals(this.defaultDeliveryMethod, invoicingSettings.defaultDeliveryMethod) &&
        Objects.equals(this.defaultNetTerms, invoicingSettings.defaultNetTerms) &&
        Objects.equals(this.defaultDaysForInvoiceReminder, invoicingSettings.defaultDaysForInvoiceReminder) &&
        Objects.equals(this.enablePrePaymentManualFulfillment, invoicingSettings.enablePrePaymentManualFulfillment) &&
        Objects.equals(this.enableSecureInvoiceURL, invoicingSettings.enableSecureInvoiceURL) &&
        Objects.equals(this.enableSelfServiceUpgrade, invoicingSettings.enableSelfServiceUpgrade) &&
        Objects.equals(this.allowSeparateBillingContact, invoicingSettings.allowSeparateBillingContact) &&
        Objects.equals(this.contactManagementEnabled, invoicingSettings.contactManagementEnabled) &&
        Objects.equals(this.checkPaymentInstructionsDisplayEnabled, invoicingSettings.checkPaymentInstructionsDisplayEnabled) &&
        Objects.equals(this.apiInvoicingEnabled, invoicingSettings.apiInvoicingEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteManagementEnabled, intelligentQuoteManagementEnabled, defaultQuoteNotes, defaultDeliveryMethod, defaultNetTerms, defaultDaysForInvoiceReminder, enablePrePaymentManualFulfillment, enableSecureInvoiceURL, enableSelfServiceUpgrade, allowSeparateBillingContact, contactManagementEnabled, checkPaymentInstructionsDisplayEnabled, apiInvoicingEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicingSettings {\n");
    sb.append("    quoteManagementEnabled: ").append(toIndentedString(quoteManagementEnabled)).append("\n");
    sb.append("    intelligentQuoteManagementEnabled: ").append(toIndentedString(intelligentQuoteManagementEnabled)).append("\n");
    sb.append("    defaultQuoteNotes: ").append(toIndentedString(defaultQuoteNotes)).append("\n");
    sb.append("    defaultDeliveryMethod: ").append(toIndentedString(defaultDeliveryMethod)).append("\n");
    sb.append("    defaultNetTerms: ").append(toIndentedString(defaultNetTerms)).append("\n");
    sb.append("    defaultDaysForInvoiceReminder: ").append(toIndentedString(defaultDaysForInvoiceReminder)).append("\n");
    sb.append("    enablePrePaymentManualFulfillment: ").append(toIndentedString(enablePrePaymentManualFulfillment)).append("\n");
    sb.append("    enableSecureInvoiceURL: ").append(toIndentedString(enableSecureInvoiceURL)).append("\n");
    sb.append("    enableSelfServiceUpgrade: ").append(toIndentedString(enableSelfServiceUpgrade)).append("\n");
    sb.append("    allowSeparateBillingContact: ").append(toIndentedString(allowSeparateBillingContact)).append("\n");
    sb.append("    contactManagementEnabled: ").append(toIndentedString(contactManagementEnabled)).append("\n");
    sb.append("    checkPaymentInstructionsDisplayEnabled: ").append(toIndentedString(checkPaymentInstructionsDisplayEnabled)).append("\n");
    sb.append("    apiInvoicingEnabled: ").append(toIndentedString(apiInvoicingEnabled)).append("\n");
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

