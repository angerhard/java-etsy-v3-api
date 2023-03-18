

# Payment

Represents a payment made with Etsy Payments. All monetary amounts are in USD pennies unless otherwise specified.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentId** | **Long** | A unique numeric ID for a payment to a specific Etsy [shop](/documentation/reference#tag/Shop). |  [optional] |
|**buyerUserId** | **Long** | The numeric ID for the [user](/documentation/reference#tag/User) who paid the purchase. |  [optional] |
|**shopId** | **Long** | The unique positive non-zero numeric ID for an Etsy Shop. |  [optional] |
|**receiptId** | **Long** | The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction. |  [optional] |
|**amountGross** | [**PaymentAmountGross**](PaymentAmountGross.md) |  |  [optional] |
|**amountFees** | [**PaymentAmountFees**](PaymentAmountFees.md) |  |  [optional] |
|**amountNet** | [**PaymentAmountNet**](PaymentAmountNet.md) |  |  [optional] |
|**postedGross** | [**PaymentPostedGross**](PaymentPostedGross.md) |  |  [optional] |
|**postedFees** | [**PaymentPostedFees**](PaymentPostedFees.md) |  |  [optional] |
|**postedNet** | [**PaymentPostedNet**](PaymentPostedNet.md) |  |  [optional] |
|**adjustedGross** | [**PaymentAdjustedGross**](PaymentAdjustedGross.md) |  |  [optional] |
|**adjustedFees** | [**PaymentAdjustedFees**](PaymentAdjustedFees.md) |  |  [optional] |
|**adjustedNet** | [**PaymentAdjustedNet**](PaymentAdjustedNet.md) |  |  [optional] |
|**currency** | **String** | The ISO (alphabetic) code string for the payment&#39;s currency. |  [optional] |
|**shopCurrency** | **String** | The ISO (alphabetic) code for the shop&#39;s currency. The shop displays all prices in this currency by default. |  [optional] |
|**buyerCurrency** | **String** | The currency string of the buyer. |  [optional] |
|**shippingUserId** | **Long** | The numeric ID of the user to which the seller ships the order. |  [optional] |
|**shippingAddressId** | **Long** | The numeric id identifying the shipping address. |  [optional] |
|**billingAddressId** | **Long** | The numeric ID identifying the billing address of the buyer. |  [optional] |
|**status** | **String** | A string indicating the current status of the payment, most commonly \&quot;settled\&quot; or \&quot;authed\&quot;. |  [optional] |
|**shippedTimestamp** | **Long** | The transaction\\&#39;s shipping date and time, in epoch seconds. |  [optional] |
|**createTimestamp** | **Long** | The transaction\\&#39;s creation date and time, in epoch seconds. |  [optional] |
|**createdTimestamp** | **Long** | The transaction\\&#39;s creation date and time, in epoch seconds. |  [optional] |
|**updateTimestamp** | **Long** | The date and time of the last change to the payment adjustment in epoch seconds. |  [optional] |
|**updatedTimestamp** | **Long** | The date and time of the last change to the payment adjustment in epoch seconds. |  [optional] |
|**paymentAdjustments** | [**List&lt;PaymentAccountLedgerEntryPaymentAdjustmentsInner&gt;**](PaymentAccountLedgerEntryPaymentAdjustmentsInner.md) | List of refund objects on an Etsy Payments transaction. All monetary amounts are in USD pennies unless otherwise specified. |  [optional] |



