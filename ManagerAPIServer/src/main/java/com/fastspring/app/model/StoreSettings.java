package com.fastspring.app.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fastspring.app.model.CatalogSettings;
import com.fastspring.app.model.GeneralSettings;
import com.fastspring.app.model.InvoicingSettings;
import com.fastspring.app.model.PaymentSettings;
import com.fastspring.app.model.StoreLocalizationSettings;
import com.fastspring.app.model.SubscriptionSettings;
import com.fastspring.app.model.SupportSettings;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * StoreSettings
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-07T13:23:00.142547+05:30[Asia/Kolkata]", comments = "Generator version: 7.14.0")
public class StoreSettings {

  private String storeSiteId;

  private @Nullable GeneralSettings generalAdminSettings;

  private @Nullable CatalogSettings catalogAdminSettings;

  private @Nullable StoreLocalizationSettings storeLocalizationSettings;

  private @Nullable PaymentSettings paymentAdminSettings;

  private @Nullable InvoicingSettings invoicingAdminSettings;

  private @Nullable SupportSettings supportSettings;

  private @Nullable SubscriptionSettings subscriptionSettings;

  public StoreSettings() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StoreSettings(String storeSiteId) {
    this.storeSiteId = storeSiteId;
  }

  public StoreSettings storeSiteId(String storeSiteId) {
    this.storeSiteId = storeSiteId;
    return this;
  }

  /**
   * Get storeSiteId
   * @return storeSiteId
   */
  @NotNull 
  @Schema(name = "storeSiteId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("storeSiteId")
  public String getStoreSiteId() {
    return storeSiteId;
  }

  public void setStoreSiteId(String storeSiteId) {
    this.storeSiteId = storeSiteId;
  }

  public StoreSettings generalAdminSettings(@Nullable GeneralSettings generalAdminSettings) {
    this.generalAdminSettings = generalAdminSettings;
    return this;
  }

  /**
   * Get generalAdminSettings
   * @return generalAdminSettings
   */
  @Valid 
  @Schema(name = "generalAdminSettings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generalAdminSettings")
  public @Nullable GeneralSettings getGeneralAdminSettings() {
    return generalAdminSettings;
  }

  public void setGeneralAdminSettings(@Nullable GeneralSettings generalAdminSettings) {
    this.generalAdminSettings = generalAdminSettings;
  }

  public StoreSettings catalogAdminSettings(@Nullable CatalogSettings catalogAdminSettings) {
    this.catalogAdminSettings = catalogAdminSettings;
    return this;
  }

  /**
   * Get catalogAdminSettings
   * @return catalogAdminSettings
   */
  @Valid 
  @Schema(name = "catalogAdminSettings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catalogAdminSettings")
  public @Nullable CatalogSettings getCatalogAdminSettings() {
    return catalogAdminSettings;
  }

  public void setCatalogAdminSettings(@Nullable CatalogSettings catalogAdminSettings) {
    this.catalogAdminSettings = catalogAdminSettings;
  }

  public StoreSettings storeLocalizationSettings(@Nullable StoreLocalizationSettings storeLocalizationSettings) {
    this.storeLocalizationSettings = storeLocalizationSettings;
    return this;
  }

  /**
   * Get storeLocalizationSettings
   * @return storeLocalizationSettings
   */
  @Valid 
  @Schema(name = "storeLocalizationSettings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("storeLocalizationSettings")
  public @Nullable StoreLocalizationSettings getStoreLocalizationSettings() {
    return storeLocalizationSettings;
  }

  public void setStoreLocalizationSettings(@Nullable StoreLocalizationSettings storeLocalizationSettings) {
    this.storeLocalizationSettings = storeLocalizationSettings;
  }

  public StoreSettings paymentAdminSettings(@Nullable PaymentSettings paymentAdminSettings) {
    this.paymentAdminSettings = paymentAdminSettings;
    return this;
  }

  /**
   * Get paymentAdminSettings
   * @return paymentAdminSettings
   */
  @Valid 
  @Schema(name = "paymentAdminSettings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentAdminSettings")
  public @Nullable PaymentSettings getPaymentAdminSettings() {
    return paymentAdminSettings;
  }

  public void setPaymentAdminSettings(@Nullable PaymentSettings paymentAdminSettings) {
    this.paymentAdminSettings = paymentAdminSettings;
  }

  public StoreSettings invoicingAdminSettings(@Nullable InvoicingSettings invoicingAdminSettings) {
    this.invoicingAdminSettings = invoicingAdminSettings;
    return this;
  }

  /**
   * Get invoicingAdminSettings
   * @return invoicingAdminSettings
   */
  @Valid 
  @Schema(name = "invoicingAdminSettings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invoicingAdminSettings")
  public @Nullable InvoicingSettings getInvoicingAdminSettings() {
    return invoicingAdminSettings;
  }

  public void setInvoicingAdminSettings(@Nullable InvoicingSettings invoicingAdminSettings) {
    this.invoicingAdminSettings = invoicingAdminSettings;
  }

  public StoreSettings supportSettings(@Nullable SupportSettings supportSettings) {
    this.supportSettings = supportSettings;
    return this;
  }

  /**
   * Get supportSettings
   * @return supportSettings
   */
  @Valid 
  @Schema(name = "supportSettings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supportSettings")
  public @Nullable SupportSettings getSupportSettings() {
    return supportSettings;
  }

  public void setSupportSettings(@Nullable SupportSettings supportSettings) {
    this.supportSettings = supportSettings;
  }

  public StoreSettings subscriptionSettings(@Nullable SubscriptionSettings subscriptionSettings) {
    this.subscriptionSettings = subscriptionSettings;
    return this;
  }

  /**
   * Get subscriptionSettings
   * @return subscriptionSettings
   */
  @Valid 
  @Schema(name = "subscriptionSettings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscriptionSettings")
  public @Nullable SubscriptionSettings getSubscriptionSettings() {
    return subscriptionSettings;
  }

  public void setSubscriptionSettings(@Nullable SubscriptionSettings subscriptionSettings) {
    this.subscriptionSettings = subscriptionSettings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreSettings storeSettings = (StoreSettings) o;
    return Objects.equals(this.storeSiteId, storeSettings.storeSiteId) &&
        Objects.equals(this.generalAdminSettings, storeSettings.generalAdminSettings) &&
        Objects.equals(this.catalogAdminSettings, storeSettings.catalogAdminSettings) &&
        Objects.equals(this.storeLocalizationSettings, storeSettings.storeLocalizationSettings) &&
        Objects.equals(this.paymentAdminSettings, storeSettings.paymentAdminSettings) &&
        Objects.equals(this.invoicingAdminSettings, storeSettings.invoicingAdminSettings) &&
        Objects.equals(this.supportSettings, storeSettings.supportSettings) &&
        Objects.equals(this.subscriptionSettings, storeSettings.subscriptionSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeSiteId, generalAdminSettings, catalogAdminSettings, storeLocalizationSettings, paymentAdminSettings, invoicingAdminSettings, supportSettings, subscriptionSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreSettings {\n");
    sb.append("    storeSiteId: ").append(toIndentedString(storeSiteId)).append("\n");
    sb.append("    generalAdminSettings: ").append(toIndentedString(generalAdminSettings)).append("\n");
    sb.append("    catalogAdminSettings: ").append(toIndentedString(catalogAdminSettings)).append("\n");
    sb.append("    storeLocalizationSettings: ").append(toIndentedString(storeLocalizationSettings)).append("\n");
    sb.append("    paymentAdminSettings: ").append(toIndentedString(paymentAdminSettings)).append("\n");
    sb.append("    invoicingAdminSettings: ").append(toIndentedString(invoicingAdminSettings)).append("\n");
    sb.append("    supportSettings: ").append(toIndentedString(supportSettings)).append("\n");
    sb.append("    subscriptionSettings: ").append(toIndentedString(subscriptionSettings)).append("\n");
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

