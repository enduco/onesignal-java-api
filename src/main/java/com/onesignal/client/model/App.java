/*
 * OneSignal
 * A powerful way to send personalized messages at scale and build effective customer engagement strategies. Learn more at onesignal.com
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: devrel@onesignal.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.onesignal.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.onesignal.client.JSON;

/**
 * App
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-16T19:49:36.601Z[Etc/UTC]")
public class App {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PLAYERS = "players";
  @SerializedName(SERIALIZED_NAME_PLAYERS)
  private Integer players;

  public static final String SERIALIZED_NAME_MESSAGEABLE_PLAYERS = "messageable_players";
  @SerializedName(SERIALIZED_NAME_MESSAGEABLE_PLAYERS)
  private Integer messageablePlayers;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ANDROID_GCM_SENDER_ID = "android_gcm_sender_id";
  @SerializedName(SERIALIZED_NAME_ANDROID_GCM_SENDER_ID)
  private String androidGcmSenderId;

  public static final String SERIALIZED_NAME_GCM_KEY = "gcm_key";
  @SerializedName(SERIALIZED_NAME_GCM_KEY)
  private String gcmKey;

  public static final String SERIALIZED_NAME_CHROME_WEB_ORIGIN = "chrome_web_origin";
  @SerializedName(SERIALIZED_NAME_CHROME_WEB_ORIGIN)
  private String chromeWebOrigin;

  public static final String SERIALIZED_NAME_CHROME_KEY = "chrome_key";
  @SerializedName(SERIALIZED_NAME_CHROME_KEY)
  private String chromeKey;

  public static final String SERIALIZED_NAME_CHROME_WEB_DEFAULT_NOTIFICATION_ICON = "chrome_web_default_notification_icon";
  @SerializedName(SERIALIZED_NAME_CHROME_WEB_DEFAULT_NOTIFICATION_ICON)
  private String chromeWebDefaultNotificationIcon;

  public static final String SERIALIZED_NAME_CHROME_WEB_SUB_DOMAIN = "chrome_web_sub_domain";
  @SerializedName(SERIALIZED_NAME_CHROME_WEB_SUB_DOMAIN)
  private String chromeWebSubDomain;

  /**
   * iOS: Either sandbox or production
   */
  @JsonAdapter(ApnsEnvEnum.Adapter.class)
  public enum ApnsEnvEnum {
    SANDBOX("sandbox"),
    
    PRODUCTION("production");

    private String value;

    ApnsEnvEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ApnsEnvEnum fromValue(String value) {
      for (ApnsEnvEnum b : ApnsEnvEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ApnsEnvEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ApnsEnvEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ApnsEnvEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ApnsEnvEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_APNS_ENV = "apns_env";
  @SerializedName(SERIALIZED_NAME_APNS_ENV)
  private ApnsEnvEnum apnsEnv;

  public static final String SERIALIZED_NAME_APNS_P12 = "apns_p12";
  @SerializedName(SERIALIZED_NAME_APNS_P12)
  private String apnsP12;

  public static final String SERIALIZED_NAME_APNS_P12_PASSWORD = "apns_p12_password";
  @SerializedName(SERIALIZED_NAME_APNS_P12_PASSWORD)
  private String apnsP12Password;

  public static final String SERIALIZED_NAME_APNS_CERTIFICATES = "apns_certificates";
  @SerializedName(SERIALIZED_NAME_APNS_CERTIFICATES)
  private String apnsCertificates;

  public static final String SERIALIZED_NAME_SAFARI_APNS_CERTIFICATES = "safari_apns_certificates";
  @SerializedName(SERIALIZED_NAME_SAFARI_APNS_CERTIFICATES)
  private String safariApnsCertificates;

  public static final String SERIALIZED_NAME_SAFARI_APNS_P12 = "safari_apns_p12";
  @SerializedName(SERIALIZED_NAME_SAFARI_APNS_P12)
  private String safariApnsP12;

  public static final String SERIALIZED_NAME_SAFARI_APNS_P12_PASSWORD = "safari_apns_p12_password";
  @SerializedName(SERIALIZED_NAME_SAFARI_APNS_P12_PASSWORD)
  private String safariApnsP12Password;

  public static final String SERIALIZED_NAME_APNS_KEY_ID = "apns_key_id";
  @SerializedName(SERIALIZED_NAME_APNS_KEY_ID)
  private String apnsKeyId;

  public static final String SERIALIZED_NAME_APNS_TEAM_ID = "apns_team_id";
  @SerializedName(SERIALIZED_NAME_APNS_TEAM_ID)
  private String apnsTeamId;

  public static final String SERIALIZED_NAME_APNS_BUNDLE_ID = "apns_bundle_id";
  @SerializedName(SERIALIZED_NAME_APNS_BUNDLE_ID)
  private String apnsBundleId;

  public static final String SERIALIZED_NAME_APNS_P8 = "apns_p8";
  @SerializedName(SERIALIZED_NAME_APNS_P8)
  private String apnsP8;

  public static final String SERIALIZED_NAME_SAFARI_SITE_ORIGIN = "safari_site_origin";
  @SerializedName(SERIALIZED_NAME_SAFARI_SITE_ORIGIN)
  private String safariSiteOrigin;

  public static final String SERIALIZED_NAME_SAFARI_PUSH_ID = "safari_push_id";
  @SerializedName(SERIALIZED_NAME_SAFARI_PUSH_ID)
  private String safariPushId;

  public static final String SERIALIZED_NAME_SAFARI_ICON1616 = "safari_icon_16_16";
  @SerializedName(SERIALIZED_NAME_SAFARI_ICON1616)
  private String safariIcon1616;

  public static final String SERIALIZED_NAME_SAFARI_ICON3232 = "safari_icon_32_32";
  @SerializedName(SERIALIZED_NAME_SAFARI_ICON3232)
  private String safariIcon3232;

  public static final String SERIALIZED_NAME_SAFARI_ICON6464 = "safari_icon_64_64";
  @SerializedName(SERIALIZED_NAME_SAFARI_ICON6464)
  private String safariIcon6464;

  public static final String SERIALIZED_NAME_SAFARI_ICON128128 = "safari_icon_128_128";
  @SerializedName(SERIALIZED_NAME_SAFARI_ICON128128)
  private String safariIcon128128;

  public static final String SERIALIZED_NAME_SAFARI_ICON256256 = "safari_icon_256_256";
  @SerializedName(SERIALIZED_NAME_SAFARI_ICON256256)
  private String safariIcon256256;

  public static final String SERIALIZED_NAME_SITE_NAME = "site_name";
  @SerializedName(SERIALIZED_NAME_SITE_NAME)
  private String siteName;

  public static final String SERIALIZED_NAME_BASIC_AUTH_KEY = "basic_auth_key";
  @SerializedName(SERIALIZED_NAME_BASIC_AUTH_KEY)
  private String basicAuthKey;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organization_id";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private String organizationId;

  public static final String SERIALIZED_NAME_ADDITIONAL_DATA_IS_ROOT_PAYLOAD = "additional_data_is_root_payload";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DATA_IS_ROOT_PAYLOAD)
  private Boolean additionalDataIsRootPayload;

  public App() { 
  }

  
  public App(
     String id, 
     Integer players, 
     Integer messageablePlayers, 
     OffsetDateTime updatedAt, 
     OffsetDateTime createdAt, 
     String apnsCertificates, 
     String safariApnsCertificates, 
     String safariPushId, 
     String safariIcon1616, 
     String safariIcon3232, 
     String safariIcon6464, 
     String safariIcon128128, 
     String basicAuthKey
  ) {
    this();
    this.id = id;
    this.players = players;
    this.messageablePlayers = messageablePlayers;
    this.updatedAt = updatedAt;
    this.createdAt = createdAt;
    this.apnsCertificates = apnsCertificates;
    this.safariApnsCertificates = safariApnsCertificates;
    this.safariPushId = safariPushId;
    this.safariIcon1616 = safariIcon1616;
    this.safariIcon3232 = safariIcon3232;
    this.safariIcon6464 = safariIcon6464;
    this.safariIcon128128 = safariIcon128128;
    this.basicAuthKey = basicAuthKey;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }




  public App name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of your app, as displayed on your apps list on the dashboard.  This can be renamed.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of your app, as displayed on your apps list on the dashboard.  This can be renamed.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


   /**
   * Get players
   * @return players
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPlayers() {
    return players;
  }




   /**
   * Get messageablePlayers
   * @return messageablePlayers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMessageablePlayers() {
    return messageablePlayers;
  }




   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




  public App androidGcmSenderId(String androidGcmSenderId) {
    
    this.androidGcmSenderId = androidGcmSenderId;
    return this;
  }

   /**
   * Android: Your Google Project number.  Also known as Sender ID.
   * @return androidGcmSenderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Android: Your Google Project number.  Also known as Sender ID.")

  public String getAndroidGcmSenderId() {
    return androidGcmSenderId;
  }


  public void setAndroidGcmSenderId(String androidGcmSenderId) {
    this.androidGcmSenderId = androidGcmSenderId;
  }


  public App gcmKey(String gcmKey) {
    
    this.gcmKey = gcmKey;
    return this;
  }

   /**
   * Android: Your Google Push Messaging Auth Key
   * @return gcmKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Android: Your Google Push Messaging Auth Key")

  public String getGcmKey() {
    return gcmKey;
  }


  public void setGcmKey(String gcmKey) {
    this.gcmKey = gcmKey;
  }


  public App chromeWebOrigin(String chromeWebOrigin) {
    
    this.chromeWebOrigin = chromeWebOrigin;
    return this;
  }

   /**
   * Chrome (All Browsers except Safari) (Recommended): The URL to your website.  This field is required if you wish to enable web push and specify other web push parameters.
   * @return chromeWebOrigin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Chrome (All Browsers except Safari) (Recommended): The URL to your website.  This field is required if you wish to enable web push and specify other web push parameters.")

  public String getChromeWebOrigin() {
    return chromeWebOrigin;
  }


  public void setChromeWebOrigin(String chromeWebOrigin) {
    this.chromeWebOrigin = chromeWebOrigin;
  }


  public App chromeKey(String chromeKey) {
    
    this.chromeKey = chromeKey;
    return this;
  }

   /**
   * Not for web push.  Your Google Push Messaging Auth Key if you use Chrome Apps / Extensions.
   * @return chromeKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not for web push.  Your Google Push Messaging Auth Key if you use Chrome Apps / Extensions.")

  public String getChromeKey() {
    return chromeKey;
  }


  public void setChromeKey(String chromeKey) {
    this.chromeKey = chromeKey;
  }


  public App chromeWebDefaultNotificationIcon(String chromeWebDefaultNotificationIcon) {
    
    this.chromeWebDefaultNotificationIcon = chromeWebDefaultNotificationIcon;
    return this;
  }

   /**
   * Chrome (All Browsers except Safari): Your default notification icon. Should be 256x256 pixels, min 80x80.
   * @return chromeWebDefaultNotificationIcon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Chrome (All Browsers except Safari): Your default notification icon. Should be 256x256 pixels, min 80x80.")

  public String getChromeWebDefaultNotificationIcon() {
    return chromeWebDefaultNotificationIcon;
  }


  public void setChromeWebDefaultNotificationIcon(String chromeWebDefaultNotificationIcon) {
    this.chromeWebDefaultNotificationIcon = chromeWebDefaultNotificationIcon;
  }


  public App chromeWebSubDomain(String chromeWebSubDomain) {
    
    this.chromeWebSubDomain = chromeWebSubDomain;
    return this;
  }

   /**
   * Chrome (All Browsers except Safari): A subdomain of your choice in order to support Web Push on non-HTTPS websites. This field must be set in order for the chrome_web_gcm_sender_id property to be processed.
   * @return chromeWebSubDomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Chrome (All Browsers except Safari): A subdomain of your choice in order to support Web Push on non-HTTPS websites. This field must be set in order for the chrome_web_gcm_sender_id property to be processed.")

  public String getChromeWebSubDomain() {
    return chromeWebSubDomain;
  }


  public void setChromeWebSubDomain(String chromeWebSubDomain) {
    this.chromeWebSubDomain = chromeWebSubDomain;
  }


  public App apnsEnv(ApnsEnvEnum apnsEnv) {
    
    this.apnsEnv = apnsEnv;
    return this;
  }

   /**
   * iOS: Either sandbox or production
   * @return apnsEnv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "iOS: Either sandbox or production")

  public ApnsEnvEnum getApnsEnv() {
    return apnsEnv;
  }


  public void setApnsEnv(ApnsEnvEnum apnsEnv) {
    this.apnsEnv = apnsEnv;
  }


  public App apnsP12(String apnsP12) {
    
    this.apnsP12 = apnsP12;
    return this;
  }

   /**
   * iOS: Your apple push notification p12 certificate file, converted to a string and Base64 encoded.
   * @return apnsP12
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "iOS: Your apple push notification p12 certificate file, converted to a string and Base64 encoded.")

  public String getApnsP12() {
    return apnsP12;
  }


  public void setApnsP12(String apnsP12) {
    this.apnsP12 = apnsP12;
  }


  public App apnsP12Password(String apnsP12Password) {
    
    this.apnsP12Password = apnsP12Password;
    return this;
  }

   /**
   * iOS: Required if using p12 certificate.  Password for the apns_p12 file.
   * @return apnsP12Password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "iOS: Required if using p12 certificate.  Password for the apns_p12 file.")

  public String getApnsP12Password() {
    return apnsP12Password;
  }


  public void setApnsP12Password(String apnsP12Password) {
    this.apnsP12Password = apnsP12Password;
  }


   /**
   * Get apnsCertificates
   * @return apnsCertificates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApnsCertificates() {
    return apnsCertificates;
  }




   /**
   * Get safariApnsCertificates
   * @return safariApnsCertificates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSafariApnsCertificates() {
    return safariApnsCertificates;
  }




  public App safariApnsP12(String safariApnsP12) {
    
    this.safariApnsP12 = safariApnsP12;
    return this;
  }

   /**
   * Safari: Your apple push notification p12 certificate file for Safari Push Notifications, converted to a string and Base64 encoded.
   * @return safariApnsP12
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Safari: Your apple push notification p12 certificate file for Safari Push Notifications, converted to a string and Base64 encoded.")

  public String getSafariApnsP12() {
    return safariApnsP12;
  }


  public void setSafariApnsP12(String safariApnsP12) {
    this.safariApnsP12 = safariApnsP12;
  }


  public App safariApnsP12Password(String safariApnsP12Password) {
    
    this.safariApnsP12Password = safariApnsP12Password;
    return this;
  }

   /**
   * Safari: Password for safari_apns_p12 file
   * @return safariApnsP12Password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Safari: Password for safari_apns_p12 file")

  public String getSafariApnsP12Password() {
    return safariApnsP12Password;
  }


  public void setSafariApnsP12Password(String safariApnsP12Password) {
    this.safariApnsP12Password = safariApnsP12Password;
  }


  public App apnsKeyId(String apnsKeyId) {
    
    this.apnsKeyId = apnsKeyId;
    return this;
  }

   /**
   * iOS: Required if using p8. Unique identifier for the p8 authentication key.
   * @return apnsKeyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "iOS: Required if using p8. Unique identifier for the p8 authentication key.")

  public String getApnsKeyId() {
    return apnsKeyId;
  }


  public void setApnsKeyId(String apnsKeyId) {
    this.apnsKeyId = apnsKeyId;
  }


  public App apnsTeamId(String apnsTeamId) {
    
    this.apnsTeamId = apnsTeamId;
    return this;
  }

   /**
   * iOS: Required if using p8. Team ID generated by Apple for your developer account.
   * @return apnsTeamId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "iOS: Required if using p8. Team ID generated by Apple for your developer account.")

  public String getApnsTeamId() {
    return apnsTeamId;
  }


  public void setApnsTeamId(String apnsTeamId) {
    this.apnsTeamId = apnsTeamId;
  }


  public App apnsBundleId(String apnsBundleId) {
    
    this.apnsBundleId = apnsBundleId;
    return this;
  }

   /**
   * iOS: Required if using p8. Bundle ID for your app in the Apple ecosystem.
   * @return apnsBundleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "iOS: Required if using p8. Bundle ID for your app in the Apple ecosystem.")

  public String getApnsBundleId() {
    return apnsBundleId;
  }


  public void setApnsBundleId(String apnsBundleId) {
    this.apnsBundleId = apnsBundleId;
  }


  public App apnsP8(String apnsP8) {
    
    this.apnsP8 = apnsP8;
    return this;
  }

   /**
   * iOS: Required if using p8. Base64 encoded p8 key
   * @return apnsP8
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "iOS: Required if using p8. Base64 encoded p8 key")

  public String getApnsP8() {
    return apnsP8;
  }


  public void setApnsP8(String apnsP8) {
    this.apnsP8 = apnsP8;
  }


  public App safariSiteOrigin(String safariSiteOrigin) {
    
    this.safariSiteOrigin = safariSiteOrigin;
    return this;
  }

   /**
   * Safari (Recommended): The hostname to your website including http(s)://
   * @return safariSiteOrigin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Safari (Recommended): The hostname to your website including http(s)://")

  public String getSafariSiteOrigin() {
    return safariSiteOrigin;
  }


  public void setSafariSiteOrigin(String safariSiteOrigin) {
    this.safariSiteOrigin = safariSiteOrigin;
  }


   /**
   * Get safariPushId
   * @return safariPushId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSafariPushId() {
    return safariPushId;
  }




   /**
   * Get safariIcon1616
   * @return safariIcon1616
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSafariIcon1616() {
    return safariIcon1616;
  }




   /**
   * Get safariIcon3232
   * @return safariIcon3232
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSafariIcon3232() {
    return safariIcon3232;
  }




   /**
   * Get safariIcon6464
   * @return safariIcon6464
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSafariIcon6464() {
    return safariIcon6464;
  }




   /**
   * Get safariIcon128128
   * @return safariIcon128128
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSafariIcon128128() {
    return safariIcon128128;
  }




  public App safariIcon256256(String safariIcon256256) {
    
    this.safariIcon256256 = safariIcon256256;
    return this;
  }

   /**
   * Safari: A url for a 256x256 png notification icon. This is the only Safari icon URL you need to provide.
   * @return safariIcon256256
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Safari: A url for a 256x256 png notification icon. This is the only Safari icon URL you need to provide.")

  public String getSafariIcon256256() {
    return safariIcon256256;
  }


  public void setSafariIcon256256(String safariIcon256256) {
    this.safariIcon256256 = safariIcon256256;
  }


  public App siteName(String siteName) {
    
    this.siteName = siteName;
    return this;
  }

   /**
   * All Browsers (Recommended): The Site Name. Requires both chrome_web_origin and safari_site_origin to be set to add or update it.
   * @return siteName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All Browsers (Recommended): The Site Name. Requires both chrome_web_origin and safari_site_origin to be set to add or update it.")

  public String getSiteName() {
    return siteName;
  }


  public void setSiteName(String siteName) {
    this.siteName = siteName;
  }


   /**
   * Get basicAuthKey
   * @return basicAuthKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBasicAuthKey() {
    return basicAuthKey;
  }




  public App organizationId(String organizationId) {
    
    this.organizationId = organizationId;
    return this;
  }

   /**
   * The Id of the Organization you would like to add this app to.
   * @return organizationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Id of the Organization you would like to add this app to.")

  public String getOrganizationId() {
    return organizationId;
  }


  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }


  public App additionalDataIsRootPayload(Boolean additionalDataIsRootPayload) {
    
    this.additionalDataIsRootPayload = additionalDataIsRootPayload;
    return this;
  }

   /**
   * iOS: Notification data (additional data) values will be added to the root of the apns payload when sent to the device.  Ignore if you&#39;re not using any other plugins, or not using OneSignal SDK methods to read the payload.
   * @return additionalDataIsRootPayload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "iOS: Notification data (additional data) values will be added to the root of the apns payload when sent to the device.  Ignore if you're not using any other plugins, or not using OneSignal SDK methods to read the payload.")

  public Boolean getAdditionalDataIsRootPayload() {
    return additionalDataIsRootPayload;
  }


  public void setAdditionalDataIsRootPayload(Boolean additionalDataIsRootPayload) {
    this.additionalDataIsRootPayload = additionalDataIsRootPayload;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    App app = (App) o;
    return Objects.equals(this.id, app.id) &&
        Objects.equals(this.name, app.name) &&
        Objects.equals(this.players, app.players) &&
        Objects.equals(this.messageablePlayers, app.messageablePlayers) &&
        Objects.equals(this.updatedAt, app.updatedAt) &&
        Objects.equals(this.createdAt, app.createdAt) &&
        Objects.equals(this.androidGcmSenderId, app.androidGcmSenderId) &&
        Objects.equals(this.gcmKey, app.gcmKey) &&
        Objects.equals(this.chromeWebOrigin, app.chromeWebOrigin) &&
        Objects.equals(this.chromeKey, app.chromeKey) &&
        Objects.equals(this.chromeWebDefaultNotificationIcon, app.chromeWebDefaultNotificationIcon) &&
        Objects.equals(this.chromeWebSubDomain, app.chromeWebSubDomain) &&
        Objects.equals(this.apnsEnv, app.apnsEnv) &&
        Objects.equals(this.apnsP12, app.apnsP12) &&
        Objects.equals(this.apnsP12Password, app.apnsP12Password) &&
        Objects.equals(this.apnsCertificates, app.apnsCertificates) &&
        Objects.equals(this.safariApnsCertificates, app.safariApnsCertificates) &&
        Objects.equals(this.safariApnsP12, app.safariApnsP12) &&
        Objects.equals(this.safariApnsP12Password, app.safariApnsP12Password) &&
        Objects.equals(this.apnsKeyId, app.apnsKeyId) &&
        Objects.equals(this.apnsTeamId, app.apnsTeamId) &&
        Objects.equals(this.apnsBundleId, app.apnsBundleId) &&
        Objects.equals(this.apnsP8, app.apnsP8) &&
        Objects.equals(this.safariSiteOrigin, app.safariSiteOrigin) &&
        Objects.equals(this.safariPushId, app.safariPushId) &&
        Objects.equals(this.safariIcon1616, app.safariIcon1616) &&
        Objects.equals(this.safariIcon3232, app.safariIcon3232) &&
        Objects.equals(this.safariIcon6464, app.safariIcon6464) &&
        Objects.equals(this.safariIcon128128, app.safariIcon128128) &&
        Objects.equals(this.safariIcon256256, app.safariIcon256256) &&
        Objects.equals(this.siteName, app.siteName) &&
        Objects.equals(this.basicAuthKey, app.basicAuthKey) &&
        Objects.equals(this.organizationId, app.organizationId) &&
        Objects.equals(this.additionalDataIsRootPayload, app.additionalDataIsRootPayload);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, players, messageablePlayers, updatedAt, createdAt, androidGcmSenderId, gcmKey, chromeWebOrigin, chromeKey, chromeWebDefaultNotificationIcon, chromeWebSubDomain, apnsEnv, apnsP12, apnsP12Password, apnsCertificates, safariApnsCertificates, safariApnsP12, safariApnsP12Password, apnsKeyId, apnsTeamId, apnsBundleId, apnsP8, safariSiteOrigin, safariPushId, safariIcon1616, safariIcon3232, safariIcon6464, safariIcon128128, safariIcon256256, siteName, basicAuthKey, organizationId, additionalDataIsRootPayload);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class App {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    players: ").append(toIndentedString(players)).append("\n");
    sb.append("    messageablePlayers: ").append(toIndentedString(messageablePlayers)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    androidGcmSenderId: ").append(toIndentedString(androidGcmSenderId)).append("\n");
    sb.append("    gcmKey: ").append(toIndentedString(gcmKey)).append("\n");
    sb.append("    chromeWebOrigin: ").append(toIndentedString(chromeWebOrigin)).append("\n");
    sb.append("    chromeKey: ").append(toIndentedString(chromeKey)).append("\n");
    sb.append("    chromeWebDefaultNotificationIcon: ").append(toIndentedString(chromeWebDefaultNotificationIcon)).append("\n");
    sb.append("    chromeWebSubDomain: ").append(toIndentedString(chromeWebSubDomain)).append("\n");
    sb.append("    apnsEnv: ").append(toIndentedString(apnsEnv)).append("\n");
    sb.append("    apnsP12: ").append(toIndentedString(apnsP12)).append("\n");
    sb.append("    apnsP12Password: ").append(toIndentedString(apnsP12Password)).append("\n");
    sb.append("    apnsCertificates: ").append(toIndentedString(apnsCertificates)).append("\n");
    sb.append("    safariApnsCertificates: ").append(toIndentedString(safariApnsCertificates)).append("\n");
    sb.append("    safariApnsP12: ").append(toIndentedString(safariApnsP12)).append("\n");
    sb.append("    safariApnsP12Password: ").append(toIndentedString(safariApnsP12Password)).append("\n");
    sb.append("    apnsKeyId: ").append(toIndentedString(apnsKeyId)).append("\n");
    sb.append("    apnsTeamId: ").append(toIndentedString(apnsTeamId)).append("\n");
    sb.append("    apnsBundleId: ").append(toIndentedString(apnsBundleId)).append("\n");
    sb.append("    apnsP8: ").append(toIndentedString(apnsP8)).append("\n");
    sb.append("    safariSiteOrigin: ").append(toIndentedString(safariSiteOrigin)).append("\n");
    sb.append("    safariPushId: ").append(toIndentedString(safariPushId)).append("\n");
    sb.append("    safariIcon1616: ").append(toIndentedString(safariIcon1616)).append("\n");
    sb.append("    safariIcon3232: ").append(toIndentedString(safariIcon3232)).append("\n");
    sb.append("    safariIcon6464: ").append(toIndentedString(safariIcon6464)).append("\n");
    sb.append("    safariIcon128128: ").append(toIndentedString(safariIcon128128)).append("\n");
    sb.append("    safariIcon256256: ").append(toIndentedString(safariIcon256256)).append("\n");
    sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
    sb.append("    basicAuthKey: ").append(toIndentedString(basicAuthKey)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    additionalDataIsRootPayload: ").append(toIndentedString(additionalDataIsRootPayload)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("players");
    openapiFields.add("messageable_players");
    openapiFields.add("updated_at");
    openapiFields.add("created_at");
    openapiFields.add("android_gcm_sender_id");
    openapiFields.add("gcm_key");
    openapiFields.add("chrome_web_origin");
    openapiFields.add("chrome_key");
    openapiFields.add("chrome_web_default_notification_icon");
    openapiFields.add("chrome_web_sub_domain");
    openapiFields.add("apns_env");
    openapiFields.add("apns_p12");
    openapiFields.add("apns_p12_password");
    openapiFields.add("apns_certificates");
    openapiFields.add("safari_apns_certificates");
    openapiFields.add("safari_apns_p12");
    openapiFields.add("safari_apns_p12_password");
    openapiFields.add("apns_key_id");
    openapiFields.add("apns_team_id");
    openapiFields.add("apns_bundle_id");
    openapiFields.add("apns_p8");
    openapiFields.add("safari_site_origin");
    openapiFields.add("safari_push_id");
    openapiFields.add("safari_icon_16_16");
    openapiFields.add("safari_icon_32_32");
    openapiFields.add("safari_icon_64_64");
    openapiFields.add("safari_icon_128_128");
    openapiFields.add("safari_icon_256_256");
    openapiFields.add("site_name");
    openapiFields.add("basic_auth_key");
    openapiFields.add("organization_id");
    openapiFields.add("additional_data_is_root_payload");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!App.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'App' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<App> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(App.class));

       return (TypeAdapter<T>) new TypeAdapter<App>() {
           @Override
           public void write(JsonWriter out, App value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public App read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of App given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of App
  * @throws IOException if the JSON string is invalid with respect to App
  */
  public static App fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, App.class);
  }

 /**
  * Convert an instance of App to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

