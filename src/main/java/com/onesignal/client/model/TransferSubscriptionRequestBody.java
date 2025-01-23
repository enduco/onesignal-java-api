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
 * TransferSubscriptionRequestBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-16T19:49:36.601Z[Etc/UTC]")
public class TransferSubscriptionRequestBody {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private Map<String, Object> identity = null;

  public TransferSubscriptionRequestBody() { 
  }

  public TransferSubscriptionRequestBody identity(Map<String, Object> identity) {
    
    this.identity = identity;
    return this;
  }

  public TransferSubscriptionRequestBody putIdentityItem(String key, Object identityItem) {
    if (this.identity == null) {
      this.identity = new HashMap<>();
    }
    this.identity.put(key, identityItem);
    return this;
  }

   /**
   * Get identity
   * @return identity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getIdentity() {
    return identity;
  }


  public void setIdentity(Map<String, Object> identity) {
    this.identity = identity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferSubscriptionRequestBody transferSubscriptionRequestBody = (TransferSubscriptionRequestBody) o;
    return Objects.equals(this.identity, transferSubscriptionRequestBody.identity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferSubscriptionRequestBody {\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
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
    openapiFields.add("identity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransferSubscriptionRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransferSubscriptionRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransferSubscriptionRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransferSubscriptionRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<TransferSubscriptionRequestBody>() {
           @Override
           public void write(JsonWriter out, TransferSubscriptionRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransferSubscriptionRequestBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransferSubscriptionRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransferSubscriptionRequestBody
  * @throws IOException if the JSON string is invalid with respect to TransferSubscriptionRequestBody
  */
  public static TransferSubscriptionRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransferSubscriptionRequestBody.class);
  }

 /**
  * Convert an instance of TransferSubscriptionRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

