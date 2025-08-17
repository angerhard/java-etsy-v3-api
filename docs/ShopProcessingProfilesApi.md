# ShopProcessingProfilesApi

All URIs are relative to *https://openapi.etsy.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createShopReadinessStateDefinition**](ShopProcessingProfilesApi.md#createShopReadinessStateDefinition) | **POST** /v3/application/shops/{shop_id}/readiness-state-definitions |  |
| [**deleteShopReadinessStateDefinition**](ShopProcessingProfilesApi.md#deleteShopReadinessStateDefinition) | **DELETE** /v3/application/shops/{shop_id}/readiness-state-definitions/{readiness_state_definition_id} |  |
| [**getShopReadinessStateDefinition**](ShopProcessingProfilesApi.md#getShopReadinessStateDefinition) | **GET** /v3/application/shops/{shop_id}/readiness-state-definitions/{readiness_state_definition_id} |  |
| [**getShopReadinessStateDefinitions**](ShopProcessingProfilesApi.md#getShopReadinessStateDefinitions) | **GET** /v3/application/shops/{shop_id}/readiness-state-definitions |  |
| [**updateShopReadinessStateDefinition**](ShopProcessingProfilesApi.md#updateShopReadinessStateDefinition) | **PUT** /v3/application/shops/{shop_id}/readiness-state-definitions/{readiness_state_definition_id} |  |


<a name="createShopReadinessStateDefinition"></a>
# **createShopReadinessStateDefinition**
> ShopProcessingProfile createShopReadinessStateDefinition(shopId, readinessState, minProcessingTime, maxProcessingTime, processingTimeUnit)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notificationPrimary wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Creates a new ReadinessStateDefinition. If an existing definition matches the input values, this endpoint will throw a Conflict error, please refer to the Content-Location header to obtain the get endpoint url for the values of the existing definition. Does not affect the product offering-readiness states definition relationship.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopProcessingProfilesApi;

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

    ShopProcessingProfilesApi apiInstance = new ShopProcessingProfilesApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    String readinessState = "ready_to_ship"; // String | The readiness state of a product: \\\\\\\"1\\\\\\\" means \\\\\\\"ready_to_ship\\\\\\\", and \\\\\\\"2\\\\\\\" means \\\\\\\"made_to_order\\\\\\\"
    Long minProcessingTime = 56L; // Long | The minimum number of days or weeks for processing a specific product.
    Long maxProcessingTime = 56L; // Long | The maximum number of days or weeks for processing a specific product.
    String processingTimeUnit = "days"; // String | The unit used to represent how long a processing time is. A week is equivalent to how many days the seller works per week as stated in their processing schedule. If none is provided, the unit is set to \\\\\\\"days\\\\\\\".
    try {
      ShopProcessingProfile result = apiInstance.createShopReadinessStateDefinition(shopId, readinessState, minProcessingTime, maxProcessingTime, processingTimeUnit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopProcessingProfilesApi#createShopReadinessStateDefinition");
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
| **readinessState** | **String**| The readiness state of a product: \\\\\\\&quot;1\\\\\\\&quot; means \\\\\\\&quot;ready_to_ship\\\\\\\&quot;, and \\\\\\\&quot;2\\\\\\\&quot; means \\\\\\\&quot;made_to_order\\\\\\\&quot; | [enum: ready_to_ship, made_to_order] |
| **minProcessingTime** | **Long**| The minimum number of days or weeks for processing a specific product. | |
| **maxProcessingTime** | **Long**| The maximum number of days or weeks for processing a specific product. | |
| **processingTimeUnit** | **String**| The unit used to represent how long a processing time is. A week is equivalent to how many days the seller works per week as stated in their processing schedule. If none is provided, the unit is set to \\\\\\\&quot;days\\\\\\\&quot;. | [optional] [default to days] [enum: days, weeks] |

### Return type

[**ShopProcessingProfile**](ShopProcessingProfile.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A single ReadinessStateDefinition |  -  |
| **409** | There was a request conflict with the current state of the target resource. See the error message for details. |  -  |
| **400** | There was a problem with the request data. See the error message for details. |  -  |
| **404** | A resource could not be found. See the error message for details. |  -  |
| **401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
| **500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="deleteShopReadinessStateDefinition"></a>
# **deleteShopReadinessStateDefinition**
> deleteShopReadinessStateDefinition(shopId, readinessStateDefinitionId)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notificationPrimary wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Deletes a ReadinessStateDefinition by given readiness state definition ID. If there any active offerings linked to the definition, this endpoint will throw a Bad Request error. If you want to delete a ReadinessStateDefinition that is linked to active offerings, you must link the offerings to a different readiness state definition.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopProcessingProfilesApi;

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

    ShopProcessingProfilesApi apiInstance = new ShopProcessingProfilesApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long readinessStateDefinitionId = 56L; // Long | The numeric ID of the [processing profile](/documentation/reference#operation/getShopReadinessStateDefinition) associated with the listing. Required when listing type is `physical`.
    try {
      apiInstance.deleteShopReadinessStateDefinition(shopId, readinessStateDefinitionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopProcessingProfilesApi#deleteShopReadinessStateDefinition");
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
| **readinessStateDefinitionId** | **Long**| The numeric ID of the [processing profile](/documentation/reference#operation/getShopReadinessStateDefinition) associated with the listing. Required when listing type is &#x60;physical&#x60;. | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
| **404** | A resource could not be found. See the error message for details. |  -  |
| **204** | The ReadinessStateDefinition was successfully deleted |  -  |
| **400** | There was a problem with the request data. See the error message for details. |  -  |
| **401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
| **500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="getShopReadinessStateDefinition"></a>
# **getShopReadinessStateDefinition**
> ShopProcessingProfile getShopReadinessStateDefinition(shopId, readinessStateDefinitionId)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notificationPrimary wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrieves a ProcessingProfile referenced by readiness state definition ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopProcessingProfilesApi;

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

    ShopProcessingProfilesApi apiInstance = new ShopProcessingProfilesApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long readinessStateDefinitionId = 56L; // Long | The numeric ID of the [processing profile](/documentation/reference#operation/getShopReadinessStateDefinition) associated with the listing. Required when listing type is `physical`.
    try {
      ShopProcessingProfile result = apiInstance.getShopReadinessStateDefinition(shopId, readinessStateDefinitionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopProcessingProfilesApi#getShopReadinessStateDefinition");
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
| **readinessStateDefinitionId** | **Long**| The numeric ID of the [processing profile](/documentation/reference#operation/getShopReadinessStateDefinition) associated with the listing. Required when listing type is &#x60;physical&#x60;. | |

### Return type

[**ShopProcessingProfile**](ShopProcessingProfile.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A single ProcessingProfile |  -  |
| **400** | There was a problem with the request data. See the error message for details. |  -  |
| **404** | A resource could not be found. See the error message for details. |  -  |
| **401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
| **500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="getShopReadinessStateDefinitions"></a>
# **getShopReadinessStateDefinitions**
> ShopProcessingProfiles getShopReadinessStateDefinitions(shopId, limit, offset)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notificationPrimary wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrieves a list of ProcessingProfiles available in the specific Etsy shop identified by its shop ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopProcessingProfilesApi;

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

    ShopProcessingProfilesApi apiInstance = new ShopProcessingProfilesApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long limit = 25L; // Long | The maximum number of results to return.
    Long offset = 0L; // Long | The number of records to skip before selecting the first result.
    try {
      ShopProcessingProfiles result = apiInstance.getShopReadinessStateDefinitions(shopId, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopProcessingProfilesApi#getShopReadinessStateDefinitions");
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
| **limit** | **Long**| The maximum number of results to return. | [optional] [default to 25] |
| **offset** | **Long**| The number of records to skip before selecting the first result. | [optional] [default to 0] |

### Return type

[**ShopProcessingProfiles**](ShopProcessingProfiles.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of ProcessingProfiles |  -  |
| **400** | There was a problem with the request data. See the error message for details. |  -  |
| **404** | A resource could not be found. See the error message for details. |  -  |
| **401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
| **500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="updateShopReadinessStateDefinition"></a>
# **updateShopReadinessStateDefinition**
> ShopProcessingProfile updateShopReadinessStateDefinition(shopId, readinessStateDefinitionId, readinessState, minProcessingTime, maxProcessingTime, processingTimeUnit)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notificationPrimary wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Updates an existing ReadinessStateDefinition. If an existing definition matches the input values, this endpoint will throw a Conflict error, please refer to the Content-Location header to obtain the get endpoint url for the values of the existing definition. Does not affect the product offering-readiness states definition relationship.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopProcessingProfilesApi;

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

    ShopProcessingProfilesApi apiInstance = new ShopProcessingProfilesApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long readinessStateDefinitionId = 56L; // Long | The numeric ID of the [processing profile](/documentation/reference#operation/getShopReadinessStateDefinition) associated with the listing. Required when listing type is `physical`.
    String readinessState = "ready_to_ship"; // String | The readiness state of a product: \\\\\\\"1\\\\\\\" means \\\\\\\"ready_to_ship\\\\\\\", and \\\\\\\"2\\\\\\\" means \\\\\\\"made_to_order\\\\\\\"
    Long minProcessingTime = 56L; // Long | The minimum number of days or weeks for processing a specific product.
    Long maxProcessingTime = 56L; // Long | The maximum number of days or weeks for processing a specific product.
    String processingTimeUnit = "days"; // String | The unit used to represent how long a processing time is. A week is equivalent to how many days the seller works per week as stated in their processing schedule. If none is provided, the unit is set to \\\\\\\"days\\\\\\\".
    try {
      ShopProcessingProfile result = apiInstance.updateShopReadinessStateDefinition(shopId, readinessStateDefinitionId, readinessState, minProcessingTime, maxProcessingTime, processingTimeUnit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopProcessingProfilesApi#updateShopReadinessStateDefinition");
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
| **readinessStateDefinitionId** | **Long**| The numeric ID of the [processing profile](/documentation/reference#operation/getShopReadinessStateDefinition) associated with the listing. Required when listing type is &#x60;physical&#x60;. | |
| **readinessState** | **String**| The readiness state of a product: \\\\\\\&quot;1\\\\\\\&quot; means \\\\\\\&quot;ready_to_ship\\\\\\\&quot;, and \\\\\\\&quot;2\\\\\\\&quot; means \\\\\\\&quot;made_to_order\\\\\\\&quot; | [optional] [enum: ready_to_ship, made_to_order] |
| **minProcessingTime** | **Long**| The minimum number of days or weeks for processing a specific product. | [optional] |
| **maxProcessingTime** | **Long**| The maximum number of days or weeks for processing a specific product. | [optional] |
| **processingTimeUnit** | **String**| The unit used to represent how long a processing time is. A week is equivalent to how many days the seller works per week as stated in their processing schedule. If none is provided, the unit is set to \\\\\\\&quot;days\\\\\\\&quot;. | [optional] [default to days] [enum: days, weeks] |

### Return type

[**ShopProcessingProfile**](ShopProcessingProfile.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated ReadinessStateDefinition |  -  |
| **409** | There was a request conflict with the current state of the target resource. See the error message for details. |  -  |
| **400** | There was a problem with the request data. See the error message for details. |  -  |
| **404** | A resource could not be found. See the error message for details. |  -  |
| **401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
| **500** | The server encountered an internal error. See the error message for details. |  -  |

