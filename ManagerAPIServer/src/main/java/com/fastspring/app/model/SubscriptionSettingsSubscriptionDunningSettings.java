package com.fastspring.app.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SubscriptionSettingsSubscriptionDunningSettings
 */

@JsonTypeName("SubscriptionSettings_subscriptionDunningSettings")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-07T13:23:00.142547+05:30[Asia/Kolkata]", comments = "Generator version: 7.14.0")
public class SubscriptionSettingsSubscriptionDunningSettings {

  private @Nullable Integer dunningRetries;

  private @Nullable Integer dunningIntervalDays;

  private @Nullable Boolean dunningNotificationEnabled;

  public SubscriptionSettingsSubscriptionDunningSettings dunningRetries(@Nullable Integer dunningRetries) {
    this.dunningRetries = dunningRetries;
    return this;
  }

  /**
   * Number of dunning retries before cancellation
   * @return dunningRetries
   */
  
  @Schema(name = "dunningRetries", description = "Number of dunning retries before cancellation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dunningRetries")
  public @Nullable Integer getDunningRetries() {
    return dunningRetries;
  }

  public void setDunningRetries(@Nullable Integer dunningRetries) {
    this.dunningRetries = dunningRetries;
  }

  public SubscriptionSettingsSubscriptionDunningSettings dunningIntervalDays(@Nullable Integer dunningIntervalDays) {
    this.dunningIntervalDays = dunningIntervalDays;
    return this;
  }

  /**
   * Interval in days between dunning retries
   * @return dunningIntervalDays
   */
  
  @Schema(name = "dunningIntervalDays", description = "Interval in days between dunning retries", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dunningIntervalDays")
  public @Nullable Integer getDunningIntervalDays() {
    return dunningIntervalDays;
  }

  public void setDunningIntervalDays(@Nullable Integer dunningIntervalDays) {
    this.dunningIntervalDays = dunningIntervalDays;
  }

  public SubscriptionSettingsSubscriptionDunningSettings dunningNotificationEnabled(@Nullable Boolean dunningNotificationEnabled) {
    this.dunningNotificationEnabled = dunningNotificationEnabled;
    return this;
  }

  /**
   * Enable dunning notifications for the store
   * @return dunningNotificationEnabled
   */
  
  @Schema(name = "dunningNotificationEnabled", description = "Enable dunning notifications for the store", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dunningNotificationEnabled")
  public @Nullable Boolean getDunningNotificationEnabled() {
    return dunningNotificationEnabled;
  }

  public void setDunningNotificationEnabled(@Nullable Boolean dunningNotificationEnabled) {
    this.dunningNotificationEnabled = dunningNotificationEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionSettingsSubscriptionDunningSettings subscriptionSettingsSubscriptionDunningSettings = (SubscriptionSettingsSubscriptionDunningSettings) o;
    return Objects.equals(this.dunningRetries, subscriptionSettingsSubscriptionDunningSettings.dunningRetries) &&
        Objects.equals(this.dunningIntervalDays, subscriptionSettingsSubscriptionDunningSettings.dunningIntervalDays) &&
        Objects.equals(this.dunningNotificationEnabled, subscriptionSettingsSubscriptionDunningSettings.dunningNotificationEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dunningRetries, dunningIntervalDays, dunningNotificationEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionSettingsSubscriptionDunningSettings {\n");
    sb.append("    dunningRetries: ").append(toIndentedString(dunningRetries)).append("\n");
    sb.append("    dunningIntervalDays: ").append(toIndentedString(dunningIntervalDays)).append("\n");
    sb.append("    dunningNotificationEnabled: ").append(toIndentedString(dunningNotificationEnabled)).append("\n");
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

