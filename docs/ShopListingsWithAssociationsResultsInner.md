

# ShopListingsWithAssociationsResultsInner

The ShopListing resources found.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**listingId** | **Long** | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. |  [optional] |
|**userId** | **Long** | The numeric ID for the [user](/documentation/reference#tag/User) posting the listing. |  [optional] |
|**shopId** | **Long** | The unique positive non-zero numeric ID for an Etsy Shop. |  [optional] |
|**title** | **String** | The listing&#39;s title string. When creating or updating a listing, valid title strings contain only letters, numbers, punctuation marks, mathematical symbols, whitespace characters, ™, ©, and ®. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{P}\\\\p{Sm}\\\\p{Zs}™©®]/u) You can only use the %, :, &amp; and + characters once each. |  [optional] |
|**description** | **String** | A description string of the product for sale in the listing. |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | When _updating_ a listing, this value can be either &#x60;active&#x60; or &#x60;inactive&#x60;. Note: Setting a &#x60;draft&#x60; listing to &#x60;active&#x60; will also publish the listing on etsy.com and requires that the listing have an image set. Setting a &#x60;sold_out&#x60; listing to active will update the quantity to 1 and renew the listing on etsy.com. |  [optional] |
|**creationTimestamp** | **Long** | The listing\\&#39;s creation time, in epoch seconds. |  [optional] |
|**createdTimestamp** | **Long** | The listing\\&#39;s creation time, in epoch seconds. |  [optional] |
|**endingTimestamp** | **Long** | The listing\\&#39;s expiration time, in epoch seconds. |  [optional] |
|**originalCreationTimestamp** | **Long** | The listing\\&#39;s creation time, in epoch seconds. |  [optional] |
|**lastModifiedTimestamp** | **Long** | The time of the last update to the listing, in epoch seconds. |  [optional] |
|**updatedTimestamp** | **Long** | The time of the last update to the listing, in epoch seconds. |  [optional] |
|**stateTimestamp** | **Long** | The date and time of the last state change of this listing. |  [optional] |
|**quantity** | **Long** | The positive non-zero number of products available for purchase in the listing. Note: The listing quantity is the sum of available offering quantities. You can request the quantities for individual offerings from the ListingInventory resource using the [getListingInventory](/documentation/reference#operation/getListingInventory) endpoint. |  [optional] |
|**shopSectionId** | **Long** | The numeric ID of a section in a specific Etsy shop. |  [optional] |
|**featuredRank** | **Long** | The positive non-zero numeric position in the featured listings of the shop, with rank 1 listings appearing in the left-most position in featured listing on a shop’s home page. |  [optional] |
|**url** | **String** | The full URL to the listing&#39;s page on Etsy. |  [optional] |
|**numFavorers** | **Long** | The number of users who marked this Listing a favorite. |  [optional] |
|**nonTaxable** | **Boolean** | When true, applicable [shop](/documentation/reference#tag/Shop) tax rates do not apply to this listing at checkout. |  [optional] |
|**isTaxable** | **Boolean** | When true, applicable [shop](/documentation/reference#tag/Shop) tax rates apply to this listing at checkout. |  [optional] |
|**isCustomizable** | **Boolean** | When true, a buyer may contact the seller for a customized order. The default value is true when a shop accepts custom orders. Does not apply to shops that do not accept custom orders. |  [optional] |
|**isPersonalizable** | **Boolean** | When true, this listing is personalizable. The default value is null. |  [optional] |
|**personalizationIsRequired** | **Boolean** | When true, this listing requires personalization. The default value is null. Will only change if is_personalizable is &#39;true&#39;. |  [optional] |
|**personalizationCharCountMax** | **Long** | This is an integer value representing the maximum length for the personalization message entered by the buyer. Will only change if is_personalizable is &#39;true&#39;. |  [optional] |
|**personalizationInstructions** | **String** | When true, this listing requires personalization. The default value is null. Will only change if is_personalizable is &#39;true&#39;. |  [optional] |
|**listingType** | [**ListingTypeEnum**](#ListingTypeEnum) | An enumerated type string that indicates whether the listing is physical or a digital download. |  [optional] |
|**tags** | **List&lt;String&gt;** | A comma-separated list of tag strings for the listing. When creating or updating a listing, valid tag strings contain only letters, numbers, whitespace characters, -, &#39;, ™, ©, and ®. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}\\\\-&#39;™©®]/u) Default value is null. |  [optional] |
|**materials** | **List&lt;String&gt;** | A list of material strings for materials used in the product. Valid materials strings contain only letters, numbers, and whitespace characters. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}]/u) Default value is null. |  [optional] |
|**shippingProfileId** | **Long** | The numeric ID of the [shipping profile](/documentation/reference#operation/getShopShippingProfile) associated with the listing. Required when listing type is &#x60;physical&#x60;. |  [optional] |
|**returnPolicyId** | **Long** | The numeric ID of the [Return Policy](/documentation/reference#operation/getShopReturnPolicies). |  [optional] |
|**processingMin** | **Long** | The minimum number of days required to process this listing. Default value is null. |  [optional] |
|**processingMax** | **Long** | The maximum number of days required to process this listing. Default value is null. |  [optional] |
|**whoMade** | [**WhoMadeEnum**](#WhoMadeEnum) | An enumerated string indicating who made the product. Helps buyers locate the listing under the Handmade heading. Requires &#39;is_supply&#39; and &#39;when_made&#39;. |  [optional] |
|**whenMade** | [**WhenMadeEnum**](#WhenMadeEnum) | An enumerated string for the era in which the maker made the product in this listing. Helps buyers locate the listing under the Vintage heading. Requires &#39;is_supply&#39; and &#39;who_made&#39;. |  [optional] |
|**isSupply** | **Boolean** | When true, tags the listing as a supply product, else indicates that it&#39;s a finished product. Helps buyers locate the listing under the Supplies heading. Requires &#39;who_made&#39; and &#39;when_made&#39;. |  [optional] |
|**itemWeight** | **Float** | The numeric weight of the product measured in units set in \\&#39;item_weight_unit\\&#39;. Default value is null. If set, the value must be greater than 0. |  [optional] |
|**itemWeightUnit** | [**ItemWeightUnitEnum**](#ItemWeightUnitEnum) | A string defining the units used to measure the weight of the product. Default value is null. |  [optional] |
|**itemLength** | **Float** | The numeric length of the product measured in units set in \\&#39;item_dimensions_unit\\&#39;. Default value is null. If set, the value must be greater than 0. |  [optional] |
|**itemWidth** | **Float** | The numeric width of the product measured in units set in \\&#39;item_dimensions_unit\\&#39;. Default value is null. If set, the value must be greater than 0. |  [optional] |
|**itemHeight** | **Float** | The numeric length of the product measured in units set in \\&#39;item_dimensions_unit\\&#39;. Default value is null. If set, the value must be greater than 0. |  [optional] |
|**itemDimensionsUnit** | [**ItemDimensionsUnitEnum**](#ItemDimensionsUnitEnum) | A string defining the units used to measure the dimensions of the product. Default value is null. |  [optional] |
|**isPrivate** | **Boolean** | When true, this is a private listing intended for a specific buyer and hidden from shop view. |  [optional] |
|**style** | **List&lt;String&gt;** | An array of style strings for this listing, each of which is free-form text string such as \\\&quot;Formal\\\&quot;, or \\\&quot;Steampunk\\\&quot;. When creating or updating a listing, the listing may have up to two styles. Valid style strings contain only letters, numbers, and whitespace characters. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}]/u) Default value is null. |  [optional] |
|**fileData** | **String** | A string describing the files attached to a digital listing. |  [optional] |
|**hasVariations** | **Boolean** | When true, the listing has variations. |  [optional] |
|**shouldAutoRenew** | **Boolean** | When true, renews a listing for four months upon expiration. |  [optional] |
|**language** | **String** | The IETF language tag for the default language of the listing. Ex: &#x60;de&#x60;, &#x60;en&#x60;, &#x60;es&#x60;, &#x60;fr&#x60;, &#x60;it&#x60;, &#x60;ja&#x60;, &#x60;nl&#x60;, &#x60;pl&#x60;, &#x60;pt&#x60;, &#x60;ru&#x60;. |  [optional] |
|**price** | [**ShopListingPrice**](ShopListingPrice.md) |  |  [optional] |
|**taxonomyId** | **Long** | The numerical taxonomy ID of the listing. See [SellerTaxonomy](/documentation/reference#tag/SellerTaxonomy) and [BuyerTaxonomy](/documentation/reference#tag/BuyerTaxonomy) for more information. |  [optional] |
|**shippingProfile** | [**ShopListingWithAssociationsShippingProfile**](ShopListingWithAssociationsShippingProfile.md) |  |  [optional] |
|**user** | [**ShopListingWithAssociationsUser**](ShopListingWithAssociationsUser.md) |  |  [optional] |
|**shop** | [**ShopListingWithAssociationsShop**](ShopListingWithAssociationsShop.md) |  |  [optional] |
|**images** | [**List&lt;ShopListingWithAssociationsImagesInner&gt;**](ShopListingWithAssociationsImagesInner.md) | Represents a list of listing image resources, each of which contains the reference URLs and metadata for an image |  [optional] |
|**videos** | [**List&lt;ShopListingWithAssociationsVideosInner&gt;**](ShopListingWithAssociationsVideosInner.md) | The single video associated with a listing. |  [optional] |
|**inventory** | [**ShopListingWithAssociationsInventory**](ShopListingWithAssociationsInventory.md) |  |  [optional] |
|**productionPartners** | [**List&lt;ShopListingWithAssociationsProductionPartnersInner&gt;**](ShopListingWithAssociationsProductionPartnersInner.md) | Represents a list of production partners for a shop. |  [optional] |
|**skus** | **List&lt;String&gt;** | A list of SKU strings for the listing. SKUs will only appear if the requesting user owns the shop and a valid matching OAuth 2 token is provided. When requested without the token it will be an empty array. |  [optional] |
|**translations** | [**ShopListingWithAssociationsTranslations**](ShopListingWithAssociationsTranslations.md) |  |  [optional] |
|**views** | **Long** | The number of times the listing has been viewed. This value is tabulated once per day and **only for active listings**, so the value is not real-time. If &#x60;0&#x60;, the listing has either not been viewed, not yet tabulated, was not active during the last tabulation or there was an error fetching the value. If a value is expected, call &#x60;getListing&#x60; to confirm the value. |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |
| SOLD_OUT | &quot;sold_out&quot; |
| DRAFT | &quot;draft&quot; |
| EXPIRED | &quot;expired&quot; |



## Enum: ListingTypeEnum

| Name | Value |
|---- | -----|
| PHYSICAL | &quot;physical&quot; |
| DOWNLOAD | &quot;download&quot; |
| BOTH | &quot;both&quot; |



## Enum: WhoMadeEnum

| Name | Value |
|---- | -----|
| I_DID | &quot;i_did&quot; |
| SOMEONE_ELSE | &quot;someone_else&quot; |
| COLLECTIVE | &quot;collective&quot; |



## Enum: WhenMadeEnum

| Name | Value |
|---- | -----|
| MADE_TO_ORDER | &quot;made_to_order&quot; |
| _2020_2025 | &quot;2020_2025&quot; |
| _2010_2019 | &quot;2010_2019&quot; |
| _2006_2009 | &quot;2006_2009&quot; |
| BEFORE_2006 | &quot;before_2006&quot; |
| _2000_2005 | &quot;2000_2005&quot; |
| _1990S | &quot;1990s&quot; |
| _1980S | &quot;1980s&quot; |
| _1970S | &quot;1970s&quot; |
| _1960S | &quot;1960s&quot; |
| _1950S | &quot;1950s&quot; |
| _1940S | &quot;1940s&quot; |
| _1930S | &quot;1930s&quot; |
| _1920S | &quot;1920s&quot; |
| _1910S | &quot;1910s&quot; |
| _1900S | &quot;1900s&quot; |
| _1800S | &quot;1800s&quot; |
| _1700S | &quot;1700s&quot; |
| BEFORE_1700 | &quot;before_1700&quot; |



## Enum: ItemWeightUnitEnum

| Name | Value |
|---- | -----|
| OZ | &quot;oz&quot; |
| LB | &quot;lb&quot; |
| G | &quot;g&quot; |
| KG | &quot;kg&quot; |



## Enum: ItemDimensionsUnitEnum

| Name | Value |
|---- | -----|
| IN | &quot;in&quot; |
| FT | &quot;ft&quot; |
| MM | &quot;mm&quot; |
| CM | &quot;cm&quot; |
| M | &quot;m&quot; |
| YD | &quot;yd&quot; |
| INCHES | &quot;inches&quot; |



