package com.fastspring.app.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PaymentSettings
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-07T13:23:00.142547+05:30[Asia/Kolkata]", comments = "Generator version: 7.14.0")
public class PaymentSettings {

  /**
   * Gets or Sets paymentMethods
   */
  public enum PaymentMethodsEnum {
    CREDIT_CARD("credit_card"),
    
    PAYPAL("paypal"),
    
    BANK_TRANSFER("bank_transfer"),
    
    CRYPTO("crypto");

    private final String value;

    PaymentMethodsEnum(String value) {
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
    public static PaymentMethodsEnum fromValue(String value) {
      for (PaymentMethodsEnum b : PaymentMethodsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<PaymentMethodsEnum> paymentMethods = new ArrayList<>();

  private @Nullable Boolean oneClickPaymentEnabled;

  private @Nullable String defaultPaymentMethod;

  @Valid
  private Map<String, String> preferredPaymentMethodPerRegion = new HashMap<>();

  private @Nullable Boolean planManagementEnabled;

  public PaymentSettings paymentMethods(List<PaymentMethodsEnum> paymentMethods) {
    this.paymentMethods = paymentMethods;
    return this;
  }

  public PaymentSettings addPaymentMethodsItem(PaymentMethodsEnum paymentMethodsItem) {
    if (this.paymentMethods == null) {
      this.paymentMethods = new ArrayList<>();
    }
    this.paymentMethods.add(paymentMethodsItem);
    return this;
  }

  /**
   * Get paymentMethods
   * @return paymentMethods
   */
  
  @Schema(name = "paymentMethods", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentMethods")
  public List<PaymentMethodsEnum> getPaymentMethods() {
    return paymentMethods;
  }

  public void setPaymentMethods(List<PaymentMethodsEnum> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }

  public PaymentSettings oneClickPaymentEnabled(@Nullable Boolean oneClickPaymentEnabled) {
    this.oneClickPaymentEnabled = oneClickPaymentEnabled;
    return this;
  }

  /**
   * Enable one-click payment feature for the store
   * @return oneClickPaymentEnabled
   */
  
  @Schema(name = "oneClickPaymentEnabled", description = "Enable one-click payment feature for the store", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oneClickPaymentEnabled")
  public @Nullable Boolean getOneClickPaymentEnabled() {
    return oneClickPaymentEnabled;
  }

  public void setOneClickPaymentEnabled(@Nullable Boolean oneClickPaymentEnabled) {
    this.oneClickPaymentEnabled = oneClickPaymentEnabled;
  }

  public PaymentSettings defaultPaymentMethod(@Nullable String defaultPaymentMethod) {
    this.defaultPaymentMethod = defaultPaymentMethod;
    return this;
  }

  /**
   * Default payment method for the store
   * @return defaultPaymentMethod
   */
  
  @Schema(name = "defaultPaymentMethod", description = "Default payment method for the store", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultPaymentMethod")
  public @Nullable String getDefaultPaymentMethod() {
    return defaultPaymentMethod;
  }

  public void setDefaultPaymentMethod(@Nullable String defaultPaymentMethod) {
    this.defaultPaymentMethod = defaultPaymentMethod;
  }

  public PaymentSettings preferredPaymentMethodPerRegion(Map<String, String> preferredPaymentMethodPerRegion) {
    this.preferredPaymentMethodPerRegion = preferredPaymentMethodPerRegion;
    return this;
  }

  public PaymentSettings putPreferredPaymentMethodPerRegionItem(String key, String preferredPaymentMethodPerRegionItem) {
    if (this.preferredPaymentMethodPerRegion == null) {
      this.preferredPaymentMethodPerRegion = new HashMap<>();
    }
    this.preferredPaymentMethodPerRegion.put(key, preferredPaymentMethodPerRegionItem);
    return this;
  }

  /**
   * Get preferredPaymentMethodPerRegion
   * @return preferredPaymentMethodPerRegion
   */
  
  @Schema(name = "preferredPaymentMethodPerRegion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferredPaymentMethodPerRegion")
  public Map<String, String> getPreferredPaymentMethodPerRegion() {
    return preferredPaymentMethodPerRegion;
  }

  public void setPreferredPaymentMethodPerRegion(Map<String, String> preferredPaymentMethodPerRegion) {
    this.preferredPaymentMethodPerRegion = preferredPaymentMethodPerRegion;
  }

  public PaymentSettings planManagementEnabled(@Nullable Boolean planManagementEnabled) {
    this.planManagementEnabled = planManagementEnabled;
    return this;
  }

  /**
   * Enable SaaS subscription plan management feature for the store
   * @return planManagementEnabled
   */
  
  @Schema(name = "planManagementEnabled", description = "Enable SaaS subscription plan management feature for the store", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("planManagementEnabled")
  public @Nullable Boolean getPlanManagementEnabled() {
    return planManagementEnabled;
  }

  public void setPlanManagementEnabled(@Nullable Boolean planManagementEnabled) {
    this.planManagementEnabled = planManagementEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSettings paymentSettings = (PaymentSettings) o;
    return Objects.equals(this.paymentMethods, paymentSettings.paymentMethods) &&
        Objects.equals(this.oneClickPaymentEnabled, paymentSettings.oneClickPaymentEnabled) &&
        Objects.equals(this.defaultPaymentMethod, paymentSettings.defaultPaymentMethod) &&
        Objects.equals(this.preferredPaymentMethodPerRegion, paymentSettings.preferredPaymentMethodPerRegion) &&
        Objects.equals(this.planManagementEnabled, paymentSettings.planManagementEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethods, oneClickPaymentEnabled, defaultPaymentMethod, preferredPaymentMethodPerRegion, planManagementEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSettings {\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
    sb.append("    oneClickPaymentEnabled: ").append(toIndentedString(oneClickPaymentEnabled)).append("\n");
    sb.append("    defaultPaymentMethod: ").append(toIndentedString(defaultPaymentMethod)).append("\n");
    sb.append("    preferredPaymentMethodPerRegion: ").append(toIndentedString(preferredPaymentMethodPerRegion)).append("\n");
    sb.append("    planManagementEnabled: ").append(toIndentedString(planManagementEnabled)).append("\n");
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

