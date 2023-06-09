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

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openapitools.client.ApiException;
import org.openapitools.client.model.ListingVariationImages;
import org.openapitools.client.model.UpdateVariationImagesRequest;

/**
 * API tests for ShopListingVariationImageApi
 */
@Disabled
public class ShopListingVariationImageApiTest {

    private final ShopListingVariationImageApi api = new ShopListingVariationImageApi();

    /**
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Gets all variation images on a listing.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getListingVariationImagesTest() throws ApiException {
        Long shopId = null;
        Long listingId = null;
        ListingVariationImages response = api.getListingVariationImages(shopId, listingId);
        // TODO: test validations
    }

    /**
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Creates variation images on a listing. &#x60;variation_images&#x60; is an array with inputs for the &#x60;property_id&#x60;, &#x60;value_id&#x60;, and &#x60;image_id&#x60; fields. &#x60;image_ids&#x60; are associated with a &#x60;ListingImage&#x60; on the listing associated with the provided &#x60;listing_id&#x60;. &#x60;property_id&#x60; and &#x60;value_id&#x60; pairs are associated with a &#x60;ListingProduct&#x60; on the listing associated with the provided &#x60;listing_id&#x60;. &#x60;variation_images&#x60; should not contain any duplicates. &#x60;variation_images&#x60; does not contain more than one &#x60;property_id&#x60; as variation images can only be associated on one property. The update overwrites all existing variation images on a listing, so if your request is successful, the variation images on the listing will be exactly those you specify. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateVariationImagesTest() throws ApiException {
        Long shopId = null;
        Long listingId = null;
        UpdateVariationImagesRequest updateVariationImagesRequest = null;
        ListingVariationImages response = api.updateVariationImages(shopId, listingId, updateVariationImagesRequest);
        // TODO: test validations
    }

}
