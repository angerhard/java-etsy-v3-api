

# PaymentPostedGross

The total gross value of the payment posted once the purchase ships. This is equal to the `amount_gross` UNLESS the seller issues a refund prior to shipping. We consider \"shipping\" to be the event which \"posts\" to the ledger. Therefore, if the seller refunds first, we reduce the `amount_gross` first and post then that amount. The seller never sees the refunded amount in their ledger. This is equal to the \"Credit\" amount in the ledger entry.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Long** | The amount of represented by this data. |  [optional] |
|**divisor** | **Long** | The divisor to render the amount. |  [optional] |
|**currencyCode** | **String** | The ISO currency code for this data. |  [optional] |



