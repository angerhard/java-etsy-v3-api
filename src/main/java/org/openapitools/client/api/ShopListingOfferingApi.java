/*
 * Etsy Open API v3
 * <div class=\"wt-text-body-01\"><p class=\"wt-pt-xs-2 wt-pb-xs-2\">Etsy's Open API provides a simple RESTful interface for various Etsy.com features. The API endpoints are meant to replace Etsy's Open API v2, which is scheduled to end service in 2022.</p><p class=\"wt-pb-xs-2\">All of the endpoints are callable and the majority of the API endpoints are now in a beta phase. This means we do not expect to make any breaking changes before our general release. A handful of endpoints are currently interface stubs (labeled “Feedback Only”) and returns a \"501 Not Implemented\" response code when called.</p><p class=\"wt-pb-xs-2\">If you'd like to report an issue or provide feedback on the API design, <a target=\"_blank\" class=\"wt-text-link wt-p-xs-0\" href=\"https://github.com/etsy/open-api/issues/new/choose\">please add an issue in Github</a>.</p></div>&copy; 2021-2023 Etsy, Inc. All Rights Reserved. Use of this code is subject to Etsy's <a class='wt-text-link wt-p-xs-0' target='_blank' href='https://www.etsy.com/legal/api'>API Developer Terms of Use</a>.
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: developers@etsy.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import com.google.gson.reflect.TypeToken;
import org.openapitools.client.*;
import org.openapitools.client.model.ListingInventoryProductOffering;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShopListingOfferingApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ShopListingOfferingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ShopListingOfferingApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getListingOffering
     * @param listingId  (required)
     * @param productId  (required)
     * @param productOfferingId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A single ListingInventoryProductOffering </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A resource could not be found. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getListingOfferingCall(Long listingId, Long productId, Long productOfferingId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/application/listings/{listing_id}/products/{product_id}/offerings/{product_offering_id}"
            .replace("{" + "listing_id" + "}", localVarApiClient.escapeString(listingId.toString()))
            .replace("{" + "product_id" + "}", localVarApiClient.escapeString(productId.toString()))
            .replace("{" + "product_offering_id" + "}", localVarApiClient.escapeString(productOfferingId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getListingOfferingValidateBeforeCall(Long listingId, Long productId, Long productOfferingId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'listingId' is set
        if (listingId == null) {
            throw new ApiException("Missing the required parameter 'listingId' when calling getListingOffering(Async)");
        }

        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException("Missing the required parameter 'productId' when calling getListingOffering(Async)");
        }

        // verify the required parameter 'productOfferingId' is set
        if (productOfferingId == null) {
            throw new ApiException("Missing the required parameter 'productOfferingId' when calling getListingOffering(Async)");
        }

        return getListingOfferingCall(listingId, productId, productOfferingId, _callback);

    }

    /**
     * 
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Get an Offering for a Listing
     * @param listingId  (required)
     * @param productId  (required)
     * @param productOfferingId  (required)
     * @return ListingInventoryProductOffering
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A single ListingInventoryProductOffering </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A resource could not be found. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public ListingInventoryProductOffering getListingOffering(Long listingId, Long productId, Long productOfferingId) throws ApiException {
        ApiResponse<ListingInventoryProductOffering> localVarResp = getListingOfferingWithHttpInfo(listingId, productId, productOfferingId);
        return localVarResp.getData();
    }

    /**
     * 
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Get an Offering for a Listing
     * @param listingId  (required)
     * @param productId  (required)
     * @param productOfferingId  (required)
     * @return ApiResponse&lt;ListingInventoryProductOffering&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A single ListingInventoryProductOffering </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A resource could not be found. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ListingInventoryProductOffering> getListingOfferingWithHttpInfo(Long listingId, Long productId, Long productOfferingId) throws ApiException {
        okhttp3.Call localVarCall = getListingOfferingValidateBeforeCall(listingId, productId, productOfferingId, null);
        Type localVarReturnType = new TypeToken<ListingInventoryProductOffering>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Get an Offering for a Listing
     * @param listingId  (required)
     * @param productId  (required)
     * @param productOfferingId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A single ListingInventoryProductOffering </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A resource could not be found. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getListingOfferingAsync(Long listingId, Long productId, Long productOfferingId, final ApiCallback<ListingInventoryProductOffering> _callback) throws ApiException {

        okhttp3.Call localVarCall = getListingOfferingValidateBeforeCall(listingId, productId, productOfferingId, _callback);
        Type localVarReturnType = new TypeToken<ListingInventoryProductOffering>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
