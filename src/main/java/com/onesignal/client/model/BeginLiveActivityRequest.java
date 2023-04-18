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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * BeginLiveActivityRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-18T17:19:38.684Z[Etc/UTC]")
public class BeginLiveActivityRequest {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PUSH_TOKEN = "push_token";
  @SerializedName(SERIALIZED_NAME_PUSH_TOKEN)
  private String pushToken;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_ID = "subscription_id";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ID)
  private String subscriptionId;

  public BeginLiveActivityRequest() { 
  }

  public BeginLiveActivityRequest pushToken(String pushToken) {
    
    this.pushToken = pushToken;
    return this;
  }

   /**
   * Get pushToken
   * @return pushToken
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPushToken() {
    return pushToken;
  }


  public void setPushToken(String pushToken) {
    this.pushToken = pushToken;
  }


  public BeginLiveActivityRequest subscriptionId(String subscriptionId) {
    
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Get subscriptionId
   * @return subscriptionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSubscriptionId() {
    return subscriptionId;
  }


  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeginLiveActivityRequest beginLiveActivityRequest = (BeginLiveActivityRequest) o;
    return Objects.equals(this.pushToken, beginLiveActivityRequest.pushToken) &&
        Objects.equals(this.subscriptionId, beginLiveActivityRequest.subscriptionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pushToken, subscriptionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeginLiveActivityRequest {\n");
    sb.append("    pushToken: ").append(toIndentedString(pushToken)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
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
    openapiFields.add("push_token");
    openapiFields.add("subscription_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("push_token");
    openapiRequiredFields.add("subscription_id");
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BeginLiveActivityRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BeginLiveActivityRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BeginLiveActivityRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BeginLiveActivityRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<BeginLiveActivityRequest>() {
           @Override
           public void write(JsonWriter out, BeginLiveActivityRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BeginLiveActivityRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BeginLiveActivityRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BeginLiveActivityRequest
  * @throws IOException if the JSON string is invalid with respect to BeginLiveActivityRequest
  */
  public static BeginLiveActivityRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BeginLiveActivityRequest.class);
  }

 /**
  * Convert an instance of BeginLiveActivityRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

