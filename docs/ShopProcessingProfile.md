

# ShopProcessingProfile

Represents a processing profile to set a product offering's readiness state and processing time info.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**shopId** | **Long** | The unique positive non-zero numeric ID for an Etsy Shop. |  [optional] |
|**readinessStateId** | **Long** | The numeric ID of the [processing profile](/documentation/reference#operation/getShopReadinessStateDefinition) associated with the listing. Required when listing type is &#x60;physical&#x60;. |  [optional] |
|**readinessState** | [**ReadinessStateEnum**](#ReadinessStateEnum) | The readiness state of a product: \\\&quot;1\\\&quot; means \\\&quot;ready_to_ship\\\&quot;, and \\\&quot;2\\\&quot; means \\\&quot;made_to_order\\\&quot; |  [optional] |
|**minProcessingDays** | **Long** | The minimum number of days for processing a specific product. |  [optional] |
|**maxProcessingDays** | **Long** | The maximum number of days for processing a specific product. |  [optional] |
|**processingDaysDisplayLabel** | **String** | Translated display label string for processing days, for example \&quot;3 - 5 days\&quot;. |  [optional] |



## Enum: ReadinessStateEnum

| Name | Value |
|---- | -----|
| READY_TO_SHIP | &quot;ready_to_ship&quot; |
| MADE_TO_ORDER | &quot;made_to_order&quot; |



