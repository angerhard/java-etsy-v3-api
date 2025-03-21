

# ShopReceiptsResultsInner

List of Shop Receipt resources found, with all Shop Receipt fields for each resource.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**receiptId** | **Long** | The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction. |  [optional] |
|**receiptType** | **Long** | The numeric value for the Etsy channel that serviced the purchase: 0 for Etsy.com, 1 for a Pattern shop. |  [optional] |
|**sellerUserId** | **Long** | The numeric ID for the [user](/documentation/reference#tag/User) (seller) fulfilling the purchase. |  [optional] |
|**sellerEmail** | **String** | The email address string for the seller of the listing. |  [optional] |
|**buyerUserId** | **Long** | The numeric ID for the [user](/documentation/reference#tag/User) making the purchase. |  [optional] |
|**buyerEmail** | **String** | The email address string for the buyer of the listing. It will be null if access hasn&#39;t been granted. Access is case-by-case and subject to approval. |  [optional] |
|**name** | **String** | The name string for the recipient in the shipping address. |  [optional] |
|**firstLine** | **String** | The first address line string for the recipient in the shipping address. |  [optional] |
|**secondLine** | **String** | The optional second address line string for the recipient in the shipping address. |  [optional] |
|**city** | **String** | The city string for the recipient in the shipping address. |  [optional] |
|**state** | **String** | The state string for the recipient in the shipping address. |  [optional] |
|**zip** | **String** | The zip code string (not necessarily a number) for the recipient in the shipping address. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The current order status string. One of: &#x60;paid&#x60;, &#x60;completed&#x60;, &#x60;open&#x60;, &#x60;payment processing&#x60; or &#x60;canceled&#x60;. |  [optional] |
|**formattedAddress** | **String** | The formatted shipping address string for the recipient in the shipping address. |  [optional] |
|**countryIso** | **String** | The ISO-3166 alpha-2 country code string for the recipient in the shipping address. |  [optional] |
|**paymentMethod** | **String** | The payment method string identifying purchaser&#39;s payment method, which must be one of: \\&#39;cc\\&#39; (credit card), \\&#39;paypal\\&#39;, \\&#39;check\\&#39;, \\&#39;mo\\&#39; (money order), \\&#39;bt\\&#39; (bank transfer), \\&#39;other\\&#39;, \\&#39;ideal\\&#39;, \\&#39;sofort\\&#39;, \\&#39;apple_pay\\&#39;, \\&#39;google\\&#39;, \\&#39;android_pay\\&#39;, \\&#39;google_pay\\&#39;, \\&#39;klarna\\&#39;, \\&#39;k_pay_in_4\\&#39; (klarna), \\&#39;k_pay_in_3\\&#39; (klarna), or \\&#39;k_financing\\&#39; (klarna). |  [optional] |
|**paymentEmail** | **String** | The email address string for the email address to which to send payment confirmation |  [optional] |
|**messageFromSeller** | **String** | An optional message string from the seller. |  [optional] |
|**messageFromBuyer** | **String** | An optional message string from the buyer. |  [optional] |
|**messageFromPayment** | **String** | The machine-generated acknowledgement string from the payment system. |  [optional] |
|**isPaid** | **Boolean** | When true, buyer paid for this purchase. |  [optional] |
|**isShipped** | **Boolean** | When true, seller shipped the products. |  [optional] |
|**createTimestamp** | **Long** | The receipt\\&#39;s creation time, in epoch seconds. |  [optional] |
|**createdTimestamp** | **Long** | The receipt\\&#39;s creation time, in epoch seconds. |  [optional] |
|**updateTimestamp** | **Long** | The time of the last update to the receipt, in epoch seconds. |  [optional] |
|**updatedTimestamp** | **Long** | The time of the last update to the receipt, in epoch seconds. |  [optional] |
|**isGift** | **Boolean** | When true, the buyer indicated this purchase is a gift. |  [optional] |
|**giftMessage** | **String** | A gift message string the buyer requests delivered with the product. |  [optional] |
|**giftSender** | **String** | The name of the person who sent the gift. |  [optional] |
|**grandtotal** | [**ShopReceiptGrandtotal**](ShopReceiptGrandtotal.md) |  |  [optional] |
|**subtotal** | [**ShopReceiptSubtotal**](ShopReceiptSubtotal.md) |  |  [optional] |
|**totalPrice** | [**ShopReceiptTotalPrice**](ShopReceiptTotalPrice.md) |  |  [optional] |
|**totalShippingCost** | [**ShopReceiptTotalShippingCost**](ShopReceiptTotalShippingCost.md) |  |  [optional] |
|**totalTaxCost** | [**ShopReceiptTotalTaxCost**](ShopReceiptTotalTaxCost.md) |  |  [optional] |
|**totalVatCost** | [**ShopReceiptTotalVatCost**](ShopReceiptTotalVatCost.md) |  |  [optional] |
|**discountAmt** | [**ShopReceiptDiscountAmt**](ShopReceiptDiscountAmt.md) |  |  [optional] |
|**giftWrapPrice** | [**ShopReceiptGiftWrapPrice**](ShopReceiptGiftWrapPrice.md) |  |  [optional] |
|**shipments** | [**List&lt;ShopReceiptShipmentsInner&gt;**](ShopReceiptShipmentsInner.md) | A list of shipment statements for this receipt. |  [optional] |
|**transactions** | [**List&lt;ShopReceiptTransactionsInner&gt;**](ShopReceiptTransactionsInner.md) | Array of transactions for the receipt. |  [optional] |
|**refunds** | [**List&lt;ShopReceiptRefundsInner&gt;**](ShopReceiptRefundsInner.md) | Refunds for a given receipt. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PAID | &quot;paid&quot; |
| COMPLETED | &quot;completed&quot; |
| OPEN | &quot;open&quot; |
| PAYMENT_PROCESSING | &quot;payment processing&quot; |
| CANCELED | &quot;canceled&quot; |
| FULLY_REFUNDED | &quot;fully refunded&quot; |
| PARTIALLY_REFUNDED | &quot;partially refunded&quot; |



