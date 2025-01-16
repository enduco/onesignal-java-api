# onesignal-java-client

OneSignal
- API version: 1.3.0
  - Build date: 2025-01-16T19:49:36.601Z[Etc/UTC]

A powerful way to send personalized messages at scale and build effective customer engagement strategies. Learn more at onesignal.com

  For more information, please visit [https://onesignal.com](https://onesignal.com)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>onesignal-java-client</artifactId>
  <version>1.3.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'onesignal-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'onesignal-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:onesignal-java-client:1.3.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/onesignal-java-client-1.3.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.onesignal.client.ApiClient;
import com.onesignal.client.ApiException;
import com.onesignal.client.Configuration;
import com.onesignal.client.auth.*;
import com.onesignal.client.models.*;
import com.onesignal.client.api.DefaultApi;

public class Example {
  private static final String appId = "YOUR_APP_ID";
  private static final String appKeyToken = "YOUR_APP_KEY";
  private static final String userKeyToken = "YOUR_USER_TOKEN";

  private static Notification createNotification() {
    Notification notification = new Notification();
    notification.setAppId(appId);
    notification.setIsChrome(true);
    notification.setIsAnyWeb(true);
    notification.setIncludedSegments(Arrays.asList(new String[]{"Subscribed Users"}));
    StringMap contentStringMap = new StringMap();
    contentStringMap.en("Test");
    notification.setContents(contentStringMap);

    return notification;
  }

  public static void main(String[] args) {
    // Setting up the client
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    HttpBearerAuth appKey = (HttpBearerAuth) defaultClient.getAuthentication("app_key");
    appKey.setBearerToken(appKeyToken);
    HttpBearerAuth userKey = (HttpBearerAuth) defaultClient.getAuthentication("user_key");
    userKey.setBearerToken(userKeyToken);
    api = new DefaultApi(defaultClient);

    // Setting up the notification
    Notification notification = createNotification();

    // Sending the request
    CreateNotificationSuccessResponse response = api.createNotification(notification);

    // Checking the result
    System.out.print(response.getId();
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.onesignal.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**beginLiveActivity**](docs/DefaultApi.md#beginLiveActivity) | **POST** /apps/{app_id}/live_activities/{activity_id}/token | Start Live Activity
*DefaultApi* | [**cancelNotification**](docs/DefaultApi.md#cancelNotification) | **DELETE** /notifications/{notification_id} | Stop a scheduled or currently outgoing notification
*DefaultApi* | [**createApp**](docs/DefaultApi.md#createApp) | **POST** /apps | Create an app
*DefaultApi* | [**createNotification**](docs/DefaultApi.md#createNotification) | **POST** /notifications | Create notification
*DefaultApi* | [**createPlayer**](docs/DefaultApi.md#createPlayer) | **POST** /players | Add a device
*DefaultApi* | [**createSegments**](docs/DefaultApi.md#createSegments) | **POST** /apps/{app_id}/segments | Create Segments
*DefaultApi* | [**createSubscription**](docs/DefaultApi.md#createSubscription) | **POST** /apps/{app_id}/users/by/{alias_label}/{alias_id}/subscriptions | 
*DefaultApi* | [**createUser**](docs/DefaultApi.md#createUser) | **POST** /apps/{app_id}/users | 
*DefaultApi* | [**deleteAlias**](docs/DefaultApi.md#deleteAlias) | **DELETE** /apps/{app_id}/users/by/{alias_label}/{alias_id}/identity/{alias_label_to_delete} | 
*DefaultApi* | [**deletePlayer**](docs/DefaultApi.md#deletePlayer) | **DELETE** /players/{player_id} | Delete a user record
*DefaultApi* | [**deleteSegments**](docs/DefaultApi.md#deleteSegments) | **DELETE** /apps/{app_id}/segments/{segment_id} | Delete Segments
*DefaultApi* | [**deleteSubscription**](docs/DefaultApi.md#deleteSubscription) | **DELETE** /apps/{app_id}/subscriptions/{subscription_id} | 
*DefaultApi* | [**deleteUser**](docs/DefaultApi.md#deleteUser) | **DELETE** /apps/{app_id}/users/by/{alias_label}/{alias_id} | 
*DefaultApi* | [**endLiveActivity**](docs/DefaultApi.md#endLiveActivity) | **DELETE** /apps/{app_id}/live_activities/{activity_id}/token/{subscription_id} | Stop Live Activity
*DefaultApi* | [**exportEvents**](docs/DefaultApi.md#exportEvents) | **POST** /notifications/{notification_id}/export_events?app_id&#x3D;{app_id} | Export CSV of Events
*DefaultApi* | [**exportPlayers**](docs/DefaultApi.md#exportPlayers) | **POST** /players/csv_export?app_id&#x3D;{app_id} | Export CSV of Players
*DefaultApi* | [**fetchAliases**](docs/DefaultApi.md#fetchAliases) | **GET** /apps/{app_id}/subscriptions/{subscription_id}/user/identity | 
*DefaultApi* | [**fetchUser**](docs/DefaultApi.md#fetchUser) | **GET** /apps/{app_id}/users/by/{alias_label}/{alias_id} | 
*DefaultApi* | [**fetchUserIdentity**](docs/DefaultApi.md#fetchUserIdentity) | **GET** /apps/{app_id}/users/by/{alias_label}/{alias_id}/identity | 
*DefaultApi* | [**getApp**](docs/DefaultApi.md#getApp) | **GET** /apps/{app_id} | View an app
*DefaultApi* | [**getApps**](docs/DefaultApi.md#getApps) | **GET** /apps | View apps
*DefaultApi* | [**getEligibleIams**](docs/DefaultApi.md#getEligibleIams) | **GET** /apps/{app_id}/subscriptions/{subscription_id}/iams | 
*DefaultApi* | [**getNotification**](docs/DefaultApi.md#getNotification) | **GET** /notifications/{notification_id} | View notification
*DefaultApi* | [**getNotificationHistory**](docs/DefaultApi.md#getNotificationHistory) | **POST** /notifications/{notification_id}/history | Notification History
*DefaultApi* | [**getNotifications**](docs/DefaultApi.md#getNotifications) | **GET** /notifications | View notifications
*DefaultApi* | [**getOutcomes**](docs/DefaultApi.md#getOutcomes) | **GET** /apps/{app_id}/outcomes | View Outcomes
*DefaultApi* | [**getPlayer**](docs/DefaultApi.md#getPlayer) | **GET** /players/{player_id} | View device
*DefaultApi* | [**getPlayers**](docs/DefaultApi.md#getPlayers) | **GET** /players | View devices
*DefaultApi* | [**identifyUserByAlias**](docs/DefaultApi.md#identifyUserByAlias) | **PATCH** /apps/{app_id}/users/by/{alias_label}/{alias_id}/identity | 
*DefaultApi* | [**identifyUserBySubscriptionId**](docs/DefaultApi.md#identifyUserBySubscriptionId) | **PATCH** /apps/{app_id}/subscriptions/{subscription_id}/user/identity | 
*DefaultApi* | [**transferSubscription**](docs/DefaultApi.md#transferSubscription) | **PATCH** /apps/{app_id}/subscriptions/{subscription_id}/owner | 
*DefaultApi* | [**updateApp**](docs/DefaultApi.md#updateApp) | **PUT** /apps/{app_id} | Update an app
*DefaultApi* | [**updateLiveActivity**](docs/DefaultApi.md#updateLiveActivity) | **POST** /apps/{app_id}/live_activities/{activity_id}/notifications | Update a Live Activity via Push
*DefaultApi* | [**updatePlayer**](docs/DefaultApi.md#updatePlayer) | **PUT** /players/{player_id} | Edit device
*DefaultApi* | [**updatePlayerTags**](docs/DefaultApi.md#updatePlayerTags) | **PUT** /apps/{app_id}/users/{external_user_id} | Edit tags with external user id
*DefaultApi* | [**updateSubscription**](docs/DefaultApi.md#updateSubscription) | **PATCH** /apps/{app_id}/subscriptions/{subscription_id} | 
*DefaultApi* | [**updateUser**](docs/DefaultApi.md#updateUser) | **PATCH** /apps/{app_id}/users/by/{alias_label}/{alias_id} | 


## Documentation for Models

 - [App](docs/App.md)
 - [BasicNotification](docs/BasicNotification.md)
 - [BasicNotificationAllOf](docs/BasicNotificationAllOf.md)
 - [BasicNotificationAllOfAndroidBackgroundLayout](docs/BasicNotificationAllOfAndroidBackgroundLayout.md)
 - [BeginLiveActivityRequest](docs/BeginLiveActivityRequest.md)
 - [Button](docs/Button.md)
 - [CancelNotificationSuccessResponse](docs/CancelNotificationSuccessResponse.md)
 - [CreateNotificationSuccessResponse](docs/CreateNotificationSuccessResponse.md)
 - [CreatePlayerSuccessResponse](docs/CreatePlayerSuccessResponse.md)
 - [CreateSegmentConflictResponse](docs/CreateSegmentConflictResponse.md)
 - [CreateSegmentSuccessResponse](docs/CreateSegmentSuccessResponse.md)
 - [CreateSubscriptionRequestBody](docs/CreateSubscriptionRequestBody.md)
 - [CreateUserConflictResponse](docs/CreateUserConflictResponse.md)
 - [CreateUserConflictResponseErrorsInner](docs/CreateUserConflictResponseErrorsInner.md)
 - [CreateUserConflictResponseErrorsItemsMeta](docs/CreateUserConflictResponseErrorsItemsMeta.md)
 - [DeletePlayerNotFoundResponse](docs/DeletePlayerNotFoundResponse.md)
 - [DeletePlayerSuccessResponse](docs/DeletePlayerSuccessResponse.md)
 - [DeleteSegmentNotFoundResponse](docs/DeleteSegmentNotFoundResponse.md)
 - [DeleteSegmentSuccessResponse](docs/DeleteSegmentSuccessResponse.md)
 - [DeliveryData](docs/DeliveryData.md)
 - [ExportEventsSuccessResponse](docs/ExportEventsSuccessResponse.md)
 - [ExportPlayersRequestBody](docs/ExportPlayersRequestBody.md)
 - [ExportPlayersSuccessResponse](docs/ExportPlayersSuccessResponse.md)
 - [Filter](docs/Filter.md)
 - [FilterExpressions](docs/FilterExpressions.md)
 - [GenericError](docs/GenericError.md)
 - [GenericErrorErrorsInner](docs/GenericErrorErrorsInner.md)
 - [GetNotificationRequestBody](docs/GetNotificationRequestBody.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse201](docs/InlineResponse201.md)
 - [InlineResponse202](docs/InlineResponse202.md)
 - [InvalidIdentifierError](docs/InvalidIdentifierError.md)
 - [Notification](docs/Notification.md)
 - [Notification200Errors](docs/Notification200Errors.md)
 - [NotificationAllOf](docs/NotificationAllOf.md)
 - [NotificationHistorySuccessResponse](docs/NotificationHistorySuccessResponse.md)
 - [NotificationSlice](docs/NotificationSlice.md)
 - [NotificationTarget](docs/NotificationTarget.md)
 - [NotificationWithMeta](docs/NotificationWithMeta.md)
 - [NotificationWithMetaAllOf](docs/NotificationWithMetaAllOf.md)
 - [Operator](docs/Operator.md)
 - [OutcomeData](docs/OutcomeData.md)
 - [OutcomesData](docs/OutcomesData.md)
 - [PlatformDeliveryData](docs/PlatformDeliveryData.md)
 - [PlatformDeliveryDataEmailAllOf](docs/PlatformDeliveryDataEmailAllOf.md)
 - [PlatformDeliveryDataSmsAllOf](docs/PlatformDeliveryDataSmsAllOf.md)
 - [Player](docs/Player.md)
 - [PlayerNotificationTarget](docs/PlayerNotificationTarget.md)
 - [PlayerNotificationTargetIncludeAliases](docs/PlayerNotificationTargetIncludeAliases.md)
 - [PlayerSlice](docs/PlayerSlice.md)
 - [PropertiesDeltas](docs/PropertiesDeltas.md)
 - [PropertiesObject](docs/PropertiesObject.md)
 - [Purchase](docs/Purchase.md)
 - [RateLimiterError](docs/RateLimiterError.md)
 - [Segment](docs/Segment.md)
 - [SegmentNotificationTarget](docs/SegmentNotificationTarget.md)
 - [StringMap](docs/StringMap.md)
 - [SubscriptionObject](docs/SubscriptionObject.md)
 - [TransferSubscriptionRequestBody](docs/TransferSubscriptionRequestBody.md)
 - [UpdateLiveActivityRequest](docs/UpdateLiveActivityRequest.md)
 - [UpdateLiveActivitySuccessResponse](docs/UpdateLiveActivitySuccessResponse.md)
 - [UpdatePlayerSuccessResponse](docs/UpdatePlayerSuccessResponse.md)
 - [UpdatePlayerTagsRequestBody](docs/UpdatePlayerTagsRequestBody.md)
 - [UpdatePlayerTagsSuccessResponse](docs/UpdatePlayerTagsSuccessResponse.md)
 - [UpdateSubscriptionRequestBody](docs/UpdateSubscriptionRequestBody.md)
 - [UpdateUserRequest](docs/UpdateUserRequest.md)
 - [User](docs/User.md)
 - [UserIdentityRequestBody](docs/UserIdentityRequestBody.md)
 - [UserIdentityResponse](docs/UserIdentityResponse.md)
 - [UserSubscriptionOptions](docs/UserSubscriptionOptions.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### app_key

- **Type**: HTTP basic authentication

### user_key

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

devrel@onesignal.com

