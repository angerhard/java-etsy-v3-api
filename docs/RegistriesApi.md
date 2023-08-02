# RegistriesApi

All URIs are relative to *https://openapi.etsy.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRegistryItems**](RegistriesApi.md#getRegistryItems) | **GET** /v3/application/registries/{collection_key}/items |  |


<a name="getRegistryItems"></a>
# **getRegistryItems**
> RegistryItems getRegistryItems(collectionKey, limit, offset)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notificationPrimary wt-bg-denim-tint wt-mr-xs-2\&quot;&gt;Beta&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Give feedback&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready to use as defined below. Changes may occur before launch, but we received satisfactory feedback on the interface and don’t expect any breaking changes.&lt;/p&gt;&lt;/div&gt;  Endpoint that lists Etsy Registry items for owned registries.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistriesApi;

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

    RegistriesApi apiInstance = new RegistriesApi(defaultClient);
    String collectionKey = "collectionKey_example"; // String | Collection Key that matches registry url like: etsy.com/registry/{collection_key}
    Long limit = 20L; // Long | The maximum number of results to return.
    Long offset = 0L; // Long | The number of records to skip before selecting the first result.
    try {
      RegistryItems result = apiInstance.getRegistryItems(collectionKey, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistriesApi#getRegistryItems");
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
| **collectionKey** | **String**| Collection Key that matches registry url like: etsy.com/registry/{collection_key} | |
| **limit** | **Long**| The maximum number of results to return. | [optional] [default to 20] |
| **offset** | **Long**| The number of records to skip before selecting the first result. | [optional] [default to 0] |

### Return type

[**RegistryItems**](RegistryItems.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of registry items |  -  |
| **403** | Forbidden if registry is not owned |  -  |
| **500** | The server encountered an internal error. See the error message for details. |  -  |

