

# ListingInventoryProduct

A representation of a product for a listing.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**productId** | **Long** | The numeric ID for a specific [product](/documentation/reference#tag/ShopListing-Product) purchased from a listing. |  [optional] |
|**sku** | **String** | The SKU string for the product |  [optional] |
|**isDeleted** | **Boolean** | When true, someone deleted this product. |  [optional] |
|**offerings** | [**List&lt;ListingInventoryProductOfferingsInner&gt;**](ListingInventoryProductOfferingsInner.md) | A list of product offering entries for this product. |  [optional] |
|**propertyValues** | [**List&lt;ListingInventoryProductPropertyValuesInner&gt;**](ListingInventoryProductPropertyValuesInner.md) | A list of property value entries for this product. Note: parenthesis characters (&#x60;(&#x60; and &#x60;)&#x60;) are not allowed. |  [optional] |



