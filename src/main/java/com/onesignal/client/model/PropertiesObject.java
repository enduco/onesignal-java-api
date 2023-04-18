/*
 * OneSignal
 * A powerful way to send personalized messages at scale and build effective customer engagement strategies. Learn more at onesignal.com
 *
 * The version of the OpenAPI document: 1.2.1
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
import com.onesignal.client.model.Purchase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * PropertiesObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-18T17:19:38.684Z[Etc/UTC]")
public class PropertiesObject {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, Object> tags = null;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_TIMEZONE_ID = "timezone_id";
  @SerializedName(SERIALIZED_NAME_TIMEZONE_ID)
  private String timezoneId;

  public static final String SERIALIZED_NAME_LAT = "lat";
  @SerializedName(SERIALIZED_NAME_LAT)
  private BigDecimal lat;

  public static final String SERIALIZED_NAME_LONG = "long";
  @SerializedName(SERIALIZED_NAME_LONG)
  private BigDecimal _long;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_FIRST_ACTIVE = "first_active";
  @SerializedName(SERIALIZED_NAME_FIRST_ACTIVE)
  private BigDecimal firstActive;

  public static final String SERIALIZED_NAME_LAST_ACTIVE = "last_active";
  @SerializedName(SERIALIZED_NAME_LAST_ACTIVE)
  private BigDecimal lastActive;

  public static final String SERIALIZED_NAME_AMOUNT_SPENT = "amount_spent";
  @SerializedName(SERIALIZED_NAME_AMOUNT_SPENT)
  private BigDecimal amountSpent;

  public static final String SERIALIZED_NAME_PURCHASES = "purchases";
  @SerializedName(SERIALIZED_NAME_PURCHASES)
  private List<Purchase> purchases = null;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public PropertiesObject() { 
  }

  public PropertiesObject tags(Map<String, Object> tags) {
    
    this.tags = tags;
    return this;
  }

  public PropertiesObject putTagsItem(String key, Object tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getTags() {
    return tags;
  }


  public void setTags(Map<String, Object> tags) {
    this.tags = tags;
  }


  public PropertiesObject language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public PropertiesObject timezoneId(String timezoneId) {
    
    this.timezoneId = timezoneId;
    return this;
  }

   /**
   * Get timezoneId
   * @return timezoneId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimezoneId() {
    return timezoneId;
  }


  public void setTimezoneId(String timezoneId) {
    this.timezoneId = timezoneId;
  }


  public PropertiesObject lat(BigDecimal lat) {
    
    this.lat = lat;
    return this;
  }

   /**
   * Get lat
   * @return lat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getLat() {
    return lat;
  }


  public void setLat(BigDecimal lat) {
    this.lat = lat;
  }


  public PropertiesObject _long(BigDecimal _long) {
    
    this._long = _long;
    return this;
  }

   /**
   * Get _long
   * @return _long
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getLong() {
    return _long;
  }


  public void setLong(BigDecimal _long) {
    this._long = _long;
  }


  public PropertiesObject country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public PropertiesObject firstActive(BigDecimal firstActive) {
    
    this.firstActive = firstActive;
    return this;
  }

   /**
   * Get firstActive
   * @return firstActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getFirstActive() {
    return firstActive;
  }


  public void setFirstActive(BigDecimal firstActive) {
    this.firstActive = firstActive;
  }


  public PropertiesObject lastActive(BigDecimal lastActive) {
    
    this.lastActive = lastActive;
    return this;
  }

   /**
   * Get lastActive
   * @return lastActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getLastActive() {
    return lastActive;
  }


  public void setLastActive(BigDecimal lastActive) {
    this.lastActive = lastActive;
  }


  public PropertiesObject amountSpent(BigDecimal amountSpent) {
    
    this.amountSpent = amountSpent;
    return this;
  }

   /**
   * Get amountSpent
   * @return amountSpent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getAmountSpent() {
    return amountSpent;
  }


  public void setAmountSpent(BigDecimal amountSpent) {
    this.amountSpent = amountSpent;
  }


  public PropertiesObject purchases(List<Purchase> purchases) {
    
    this.purchases = purchases;
    return this;
  }

  public PropertiesObject addPurchasesItem(Purchase purchasesItem) {
    if (this.purchases == null) {
      this.purchases = new ArrayList<>();
    }
    this.purchases.add(purchasesItem);
    return this;
  }

   /**
   * Get purchases
   * @return purchases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Purchase> getPurchases() {
    return purchases;
  }


  public void setPurchases(List<Purchase> purchases) {
    this.purchases = purchases;
  }


  public PropertiesObject ip(String ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIp() {
    return ip;
  }


  public void setIp(String ip) {
    this.ip = ip;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertiesObject propertiesObject = (PropertiesObject) o;
    return Objects.equals(this.tags, propertiesObject.tags) &&
        Objects.equals(this.language, propertiesObject.language) &&
        Objects.equals(this.timezoneId, propertiesObject.timezoneId) &&
        Objects.equals(this.lat, propertiesObject.lat) &&
        Objects.equals(this._long, propertiesObject._long) &&
        Objects.equals(this.country, propertiesObject.country) &&
        Objects.equals(this.firstActive, propertiesObject.firstActive) &&
        Objects.equals(this.lastActive, propertiesObject.lastActive) &&
        Objects.equals(this.amountSpent, propertiesObject.amountSpent) &&
        Objects.equals(this.purchases, propertiesObject.purchases) &&
        Objects.equals(this.ip, propertiesObject.ip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, language, timezoneId, lat, _long, country, firstActive, lastActive, amountSpent, purchases, ip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertiesObject {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    timezoneId: ").append(toIndentedString(timezoneId)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    _long: ").append(toIndentedString(_long)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    firstActive: ").append(toIndentedString(firstActive)).append("\n");
    sb.append("    lastActive: ").append(toIndentedString(lastActive)).append("\n");
    sb.append("    amountSpent: ").append(toIndentedString(amountSpent)).append("\n");
    sb.append("    purchases: ").append(toIndentedString(purchases)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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
    openapiFields.add("tags");
    openapiFields.add("language");
    openapiFields.add("timezone_id");
    openapiFields.add("lat");
    openapiFields.add("long");
    openapiFields.add("country");
    openapiFields.add("first_active");
    openapiFields.add("last_active");
    openapiFields.add("amount_spent");
    openapiFields.add("purchases");
    openapiFields.add("ip");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PropertiesObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PropertiesObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PropertiesObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PropertiesObject.class));

       return (TypeAdapter<T>) new TypeAdapter<PropertiesObject>() {
           @Override
           public void write(JsonWriter out, PropertiesObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PropertiesObject read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PropertiesObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PropertiesObject
  * @throws IOException if the JSON string is invalid with respect to PropertiesObject
  */
  public static PropertiesObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PropertiesObject.class);
  }

 /**
  * Convert an instance of PropertiesObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
