package com.fastspring.app.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fastspring.app.model.SubscriptionSettingsSubscriptionDunningSettings;
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
 * SubscriptionSettings
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-07T13:23:00.142547+05:30[Asia/Kolkata]", comments = "Generator version: 7.14.0")
public class SubscriptionSettings {

  private @Nullable Boolean coTerminusBillingEnabled;

  private @Nullable Boolean allowAutomaticToManualSubscription;

  private @Nullable Integer subscriptionTrialPeriodDays;

  private @Nullable Boolean trialWithoutPaymentEnabled;

  /**
   * Default subscription cancellation choice for the store
   */
  public enum SubscriptionCancellationChoiceGlobalEnum {
    IMMEDIATE("immediate"),
    
    END_OF_PERIOD("end_of_period"),
    
    NO_CANCELLATION("no_cancellation");

    private final String value;

    SubscriptionCancellationChoiceGlobalEnum(String value) {
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
    public static SubscriptionCancellationChoiceGlobalEnum fromValue(String value) {
      for (SubscriptionCancellationChoiceGlobalEnum b : SubscriptionCancellationChoiceGlobalEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable SubscriptionCancellationChoiceGlobalEnum subscriptionCancellationChoiceGlobal;

  private @Nullable SubscriptionSettingsSubscriptionDunningSettings subscriptionDunningSettings;

  /**
   * Gets or Sets subscriptionPaymentMethods
   */
  public enum SubscriptionPaymentMethodsEnum {
    CREDIT_CARD("credit_card"),
    
    PAYPAL("paypal"),
    
    BANK_TRANSFER("bank_transfer"),
    
    WALLETS("wallets");

    private final String value;

    SubscriptionPaymentMethodsEnum(String value) {
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
    public static SubscriptionPaymentMethodsEnum fromValue(String value) {
      for (SubscriptionPaymentMethodsEnum b : SubscriptionPaymentMethodsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<SubscriptionPaymentMethodsEnum> subscriptionPaymentMethods = new ArrayList<>();

  public SubscriptionSettings coTerminusBillingEnabled(@Nullable Boolean coTerminusBillingEnabled) {
    this.coTerminusBillingEnabled = coTerminusBillingEnabled;
    return this;
  }

  /**
   * Enable subscription Co Terminus Billing
   * @return coTerminusBillingEnabled
   */
  
  @Schema(name = "coTerminusBillingEnabled", description = "Enable subscription Co Terminus Billing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("coTerminusBillingEnabled")
  public @Nullable Boolean getCoTerminusBillingEnabled() {
    return coTerminusBillingEnabled;
  }

  public void setCoTerminusBillingEnabled(@Nullable Boolean coTerminusBillingEnabled) {
    this.coTerminusBillingEnabled = coTerminusBillingEnabled;
  }

  public SubscriptionSettings allowAutomaticToManualSubscription(@Nullable Boolean allowAutomaticToManualSubscription) {
    this.allowAutomaticToManualSubscription = allowAutomaticToManualSubscription;
    return this;
  }

  /**
   * Allow automatic to manual subscription conversion
   * @return allowAutomaticToManualSubscription
   */
  
  @Schema(name = "allowAutomaticToManualSubscription", description = "Allow automatic to manual subscription conversion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowAutomaticToManualSubscription")
  public @Nullable Boolean getAllowAutomaticToManualSubscription() {
    return allowAutomaticToManualSubscription;
  }

  public void setAllowAutomaticToManualSubscription(@Nullable Boolean allowAutomaticToManualSubscription) {
    this.allowAutomaticToManualSubscription = allowAutomaticToManualSubscription;
  }

  public SubscriptionSettings subscriptionTrialPeriodDays(@Nullable Integer subscriptionTrialPeriodDays) {
    this.subscriptionTrialPeriodDays = subscriptionTrialPeriodDays;
    return this;
  }

  /**
   * Default trial period in days for subscriptions
   * @return subscriptionTrialPeriodDays
   */
  
  @Schema(name = "subscriptionTrialPeriodDays", description = "Default trial period in days for subscriptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscriptionTrialPeriodDays")
  public @Nullable Integer getSubscriptionTrialPeriodDays() {
    return subscriptionTrialPeriodDays;
  }

  public void setSubscriptionTrialPeriodDays(@Nullable Integer subscriptionTrialPeriodDays) {
    this.subscriptionTrialPeriodDays = subscriptionTrialPeriodDays;
  }

  public SubscriptionSettings trialWithoutPaymentEnabled(@Nullable Boolean trialWithoutPaymentEnabled) {
    this.trialWithoutPaymentEnabled = trialWithoutPaymentEnabled;
    return this;
  }

  /**
   * Enable trial without payment for subscriptions
   * @return trialWithoutPaymentEnabled
   */
  
  @Schema(name = "trialWithoutPaymentEnabled", description = "Enable trial without payment for subscriptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trialWithoutPaymentEnabled")
  public @Nullable Boolean getTrialWithoutPaymentEnabled() {
    return trialWithoutPaymentEnabled;
  }

  public void setTrialWithoutPaymentEnabled(@Nullable Boolean trialWithoutPaymentEnabled) {
    this.trialWithoutPaymentEnabled = trialWithoutPaymentEnabled;
  }

  public SubscriptionSettings subscriptionCancellationChoiceGlobal(@Nullable SubscriptionCancellationChoiceGlobalEnum subscriptionCancellationChoiceGlobal) {
    this.subscriptionCancellationChoiceGlobal = subscriptionCancellationChoiceGlobal;
    return this;
  }

  /**
   * Default subscription cancellation choice for the store
   * @return subscriptionCancellationChoiceGlobal
   */
  
  @Schema(name = "subscriptionCancellationChoiceGlobal", description = "Default subscription cancellation choice for the store", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscriptionCancellationChoiceGlobal")
  public @Nullable SubscriptionCancellationChoiceGlobalEnum getSubscriptionCancellationChoiceGlobal() {
    return subscriptionCancellationChoiceGlobal;
  }

  public void setSubscriptionCancellationChoiceGlobal(@Nullable SubscriptionCancellationChoiceGlobalEnum subscriptionCancellationChoiceGlobal) {
    this.subscriptionCancellationChoiceGlobal = subscriptionCancellationChoiceGlobal;
  }

  public SubscriptionSettings subscriptionDunningSettings(@Nullable SubscriptionSettingsSubscriptionDunningSettings subscriptionDunningSettings) {
    this.subscriptionDunningSettings = subscriptionDunningSettings;
    return this;
  }

  /**
   * Get subscriptionDunningSettings
   * @return subscriptionDunningSettings
   */
  @Valid 
  @Schema(name = "subscriptionDunningSettings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscriptionDunningSettings")
  public @Nullable SubscriptionSettingsSubscriptionDunningSettings getSubscriptionDunningSettings() {
    return subscriptionDunningSettings;
  }

  public void setSubscriptionDunningSettings(@Nullable SubscriptionSettingsSubscriptionDunningSettings subscriptionDunningSettings) {
    this.subscriptionDunningSettings = subscriptionDunningSettings;
  }

  public SubscriptionSettings subscriptionPaymentMethods(List<SubscriptionPaymentMethodsEnum> subscriptionPaymentMethods) {
    this.subscriptionPaymentMethods = subscriptionPaymentMethods;
    return this;
  }

  public SubscriptionSettings addSubscriptionPaymentMethodsItem(SubscriptionPaymentMethodsEnum subscriptionPaymentMethodsItem) {
    if (this.subscriptionPaymentMethods == null) {
      this.subscriptionPaymentMethods = new ArrayList<>();
    }
    this.subscriptionPaymentMethods.add(subscriptionPaymentMethodsItem);
    return this;
  }

  /**
   * Get subscriptionPaymentMethods
   * @return subscriptionPaymentMethods
   */
  
  @Schema(name = "subscriptionPaymentMethods", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscriptionPaymentMethods")
  public List<SubscriptionPaymentMethodsEnum> getSubscriptionPaymentMethods() {
    return subscriptionPaymentMethods;
  }

  public void setSubscriptionPaymentMethods(List<SubscriptionPaymentMethodsEnum> subscriptionPaymentMethods) {
    this.subscriptionPaymentMethods = subscriptionPaymentMethods;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionSettings subscriptionSettings = (SubscriptionSettings) o;
    return Objects.equals(this.coTerminusBillingEnabled, subscriptionSettings.coTerminusBillingEnabled) &&
        Objects.equals(this.allowAutomaticToManualSubscription, subscriptionSettings.allowAutomaticToManualSubscription) &&
        Objects.equals(this.subscriptionTrialPeriodDays, subscriptionSettings.subscriptionTrialPeriodDays) &&
        Objects.equals(this.trialWithoutPaymentEnabled, subscriptionSettings.trialWithoutPaymentEnabled) &&
        Objects.equals(this.subscriptionCancellationChoiceGlobal, subscriptionSettings.subscriptionCancellationChoiceGlobal) &&
        Objects.equals(this.subscriptionDunningSettings, subscriptionSettings.subscriptionDunningSettings) &&
        Objects.equals(this.subscriptionPaymentMethods, subscriptionSettings.subscriptionPaymentMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coTerminusBillingEnabled, allowAutomaticToManualSubscription, subscriptionTrialPeriodDays, trialWithoutPaymentEnabled, subscriptionCancellationChoiceGlobal, subscriptionDunningSettings, subscriptionPaymentMethods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionSettings {\n");
    sb.append("    coTerminusBillingEnabled: ").append(toIndentedString(coTerminusBillingEnabled)).append("\n");
    sb.append("    allowAutomaticToManualSubscription: ").append(toIndentedString(allowAutomaticToManualSubscription)).append("\n");
    sb.append("    subscriptionTrialPeriodDays: ").append(toIndentedString(subscriptionTrialPeriodDays)).append("\n");
    sb.append("    trialWithoutPaymentEnabled: ").append(toIndentedString(trialWithoutPaymentEnabled)).append("\n");
    sb.append("    subscriptionCancellationChoiceGlobal: ").append(toIndentedString(subscriptionCancellationChoiceGlobal)).append("\n");
    sb.append("    subscriptionDunningSettings: ").append(toIndentedString(subscriptionDunningSettings)).append("\n");
    sb.append("    subscriptionPaymentMethods: ").append(toIndentedString(subscriptionPaymentMethods)).append("\n");
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

