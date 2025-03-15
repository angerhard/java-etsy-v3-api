# ShopHolidayPreferencesApi

All URIs are relative to *https://openapi.etsy.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getHolidayPreferences**](ShopHolidayPreferencesApi.md#getHolidayPreferences) | **GET** /v3/application/shops/{shop_id}/holiday-preferences |  |
| [**updateHolidayPreferences**](ShopHolidayPreferencesApi.md#updateHolidayPreferences) | **PUT** /v3/application/shops/{shop_id}/holiday-preferences/{holiday_id} |  |


<a name="getHolidayPreferences"></a>
# **getHolidayPreferences**
> List&lt;ShopHolidayPreference&gt; getHolidayPreferences(shopId)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notificationPrimary wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrieves a list of holidays that are available to a shop to set a preference for. Currently only supported in the US and CA

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopHolidayPreferencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ShopHolidayPreferencesApi apiInstance = new ShopHolidayPreferencesApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    try {
      List<ShopHolidayPreference> result = apiInstance.getHolidayPreferences(shopId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopHolidayPreferencesApi#getHolidayPreferences");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **shopId** | **Long**| The unique positive non-zero numeric ID for an Etsy Shop. | |

### Return type

[**List&lt;ShopHolidayPreference&gt;**](ShopHolidayPreference.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of holiday preferences |  -  |
| **403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
| **400** | There was a problem with the request data. See the error message for details. |  -  |
| **500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="updateHolidayPreferences"></a>
# **updateHolidayPreferences**
> ShopHolidayPreference updateHolidayPreferences(shopId, holidayId, isWorking)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notificationPrimary wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;      Updates the preference for whether the seller will process orders or not on the holiday.     \&quot;Currently only supported in the US and CA\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopHolidayPreferencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ShopHolidayPreferencesApi apiInstance = new ShopHolidayPreferencesApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    String holidayId = "1"; // String | The unique id that maps to the holiday a country observes. See the [Fulfillment Tutorial docs](https://developer.etsy.com/documentation/tutorials/fulfillment/#country-holidays) for more info
    Boolean isWorking = true; // Boolean | A boolean value for whether the shop will process orders on a particular holiday.
    try {
      ShopHolidayPreference result = apiInstance.updateHolidayPreferences(shopId, holidayId, isWorking);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopHolidayPreferencesApi#updateHolidayPreferences");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **shopId** | **Long**| The unique positive non-zero numeric ID for an Etsy Shop. | |
| **holidayId** | **String**| The unique id that maps to the holiday a country observes. See the [Fulfillment Tutorial docs](https://developer.etsy.com/documentation/tutorials/fulfillment/#country-holidays) for more info | [enum: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105] |
| **isWorking** | **Boolean**| A boolean value for whether the shop will process orders on a particular holiday. | |

### Return type

[**ShopHolidayPreference**](ShopHolidayPreference.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated holiday preferences |  -  |
| **403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
| **400** | There was a problem with the request data. See the error message for details. |  -  |
| **500** | The server encountered an internal error. See the error message for details. |  -  |

