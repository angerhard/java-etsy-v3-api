# etsy-v3-api-client

Etsy Open API v3
- API version: 3.0.0
  - Build date: 2023-03-18T13:10:02.644710400+01:00[Europe/Berlin]

<div class=\"wt-text-body-01\"><p class=\"wt-pt-xs-2 wt-pb-xs-2\">Etsy's Open API provides a simple RESTful interface for various Etsy.com features. The API endpoints are meant to replace Etsy's Open API v2, which is scheduled to end service in 2022.</p><p class=\"wt-pb-xs-2\">All of the endpoints are callable and the majority of the API endpoints are now in a beta phase. This means we do not expect to make any breaking changes before our general release. A handful of endpoints are currently interface stubs (labeled “Feedback Only”) and returns a \"501 Not Implemented\" response code when called.</p><p class=\"wt-pb-xs-2\">If you'd like to report an issue or provide feedback on the API design, <a target=\"_blank\" class=\"wt-text-link wt-p-xs-0\" href=\"https://github.com/etsy/open-api/issues/new/choose\">please add an issue in Github</a>.</p></div>&copy; 2021-2023 Etsy, Inc. All Rights Reserved. Use of this code is subject to Etsy's <a class='wt-text-link wt-p-xs-0' target='_blank' href='https://www.etsy.com/legal/api'>API Developer Terms of Use</a>.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>de.andreasgerhard.etsyapi</groupId>
  <artifactId>etsy-v3-api-client</artifactId>
  <version>1.0-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'etsy-v3-api-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'etsy-v3-api-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "de.andreasgerhard.etsyapi:etsy-v3-api-client:1.0-SNAPSHOT"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/etsy-v3-api-client-1.0-SNAPSHOT.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BuyerTaxonomyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    BuyerTaxonomyApi apiInstance = new BuyerTaxonomyApi(defaultClient);
    try {
      BuyerTaxonomyNodes result = apiInstance.getBuyerTaxonomyNodes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerTaxonomyApi#getBuyerTaxonomyNodes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://openapi.etsy.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BuyerTaxonomyApi* | [**getBuyerTaxonomyNodes**](docs/BuyerTaxonomyApi.md#getBuyerTaxonomyNodes) | **GET** /v3/application/buyer-taxonomy/nodes | 
*BuyerTaxonomyApi* | [**getPropertiesByBuyerTaxonomyId**](docs/BuyerTaxonomyApi.md#getPropertiesByBuyerTaxonomyId) | **GET** /v3/application/buyer-taxonomy/nodes/{taxonomy_id}/properties | 
*LedgerEntryApi* | [**getShopPaymentAccountLedgerEntries**](docs/LedgerEntryApi.md#getShopPaymentAccountLedgerEntries) | **GET** /v3/application/shops/{shop_id}/payment-account/ledger-entries | 
*LedgerEntryApi* | [**getShopPaymentAccountLedgerEntry**](docs/LedgerEntryApi.md#getShopPaymentAccountLedgerEntry) | **GET** /v3/application/shops/{shop_id}/payment-account/ledger-entries/{ledger_entry_id} | 
*OtherApi* | [**ping**](docs/OtherApi.md#ping) | **GET** /v3/application/openapi-ping | 
*OtherApi* | [**tokenScopes**](docs/OtherApi.md#tokenScopes) | **POST** /v3/application/scopes | 
*PaymentApi* | [**getPaymentAccountLedgerEntryPayments**](docs/PaymentApi.md#getPaymentAccountLedgerEntryPayments) | **GET** /v3/application/shops/{shop_id}/payment-account/ledger-entries/payments | 
*PaymentApi* | [**getPayments**](docs/PaymentApi.md#getPayments) | **GET** /v3/application/shops/{shop_id}/payments | 
*PaymentApi* | [**getShopPaymentByReceiptId**](docs/PaymentApi.md#getShopPaymentByReceiptId) | **GET** /v3/application/shops/{shop_id}/receipts/{receipt_id}/payments | 
*ReviewApi* | [**getReviewsByListing**](docs/ReviewApi.md#getReviewsByListing) | **GET** /v3/application/listings/{listing_id}/reviews | 
*ReviewApi* | [**getReviewsByShop**](docs/ReviewApi.md#getReviewsByShop) | **GET** /v3/application/shops/{shop_id}/reviews | 
*SellerTaxonomyApi* | [**getPropertiesByTaxonomyId**](docs/SellerTaxonomyApi.md#getPropertiesByTaxonomyId) | **GET** /v3/application/seller-taxonomy/nodes/{taxonomy_id}/properties | 
*SellerTaxonomyApi* | [**getSellerTaxonomyNodes**](docs/SellerTaxonomyApi.md#getSellerTaxonomyNodes) | **GET** /v3/application/seller-taxonomy/nodes | 
*ShopApi* | [**findShops**](docs/ShopApi.md#findShops) | **GET** /v3/application/shops | 
*ShopApi* | [**getShop**](docs/ShopApi.md#getShop) | **GET** /v3/application/shops/{shop_id} | 
*ShopApi* | [**getShopByOwnerUserId**](docs/ShopApi.md#getShopByOwnerUserId) | **GET** /v3/application/users/{user_id}/shops | 
*ShopApi* | [**updateShop**](docs/ShopApi.md#updateShop) | **PUT** /v3/application/shops/{shop_id} | 
*ShopListingApi* | [**createDraftListing**](docs/ShopListingApi.md#createDraftListing) | **POST** /v3/application/shops/{shop_id}/listings | 
*ShopListingApi* | [**deleteListing**](docs/ShopListingApi.md#deleteListing) | **DELETE** /v3/application/listings/{listing_id} | 
*ShopListingApi* | [**deleteListingProperty**](docs/ShopListingApi.md#deleteListingProperty) | **DELETE** /v3/application/shops/{shop_id}/listings/{listing_id}/properties/{property_id} | 
*ShopListingApi* | [**findAllActiveListingsByShop**](docs/ShopListingApi.md#findAllActiveListingsByShop) | **GET** /v3/application/shops/{shop_id}/listings/active | 
*ShopListingApi* | [**findAllListingsActive**](docs/ShopListingApi.md#findAllListingsActive) | **GET** /v3/application/listings/active | 
*ShopListingApi* | [**getFeaturedListingsByShop**](docs/ShopListingApi.md#getFeaturedListingsByShop) | **GET** /v3/application/shops/{shop_id}/listings/featured | 
*ShopListingApi* | [**getListing**](docs/ShopListingApi.md#getListing) | **GET** /v3/application/listings/{listing_id} | 
*ShopListingApi* | [**getListingProperties**](docs/ShopListingApi.md#getListingProperties) | **GET** /v3/application/shops/{shop_id}/listings/{listing_id}/properties | 
*ShopListingApi* | [**getListingProperty**](docs/ShopListingApi.md#getListingProperty) | **GET** /v3/application/listings/{listing_id}/properties/{property_id} | 
*ShopListingApi* | [**getListingsByListingIds**](docs/ShopListingApi.md#getListingsByListingIds) | **GET** /v3/application/listings/batch | 
*ShopListingApi* | [**getListingsByShop**](docs/ShopListingApi.md#getListingsByShop) | **GET** /v3/application/shops/{shop_id}/listings | 
*ShopListingApi* | [**getListingsByShopReceipt**](docs/ShopListingApi.md#getListingsByShopReceipt) | **GET** /v3/application/shops/{shop_id}/receipts/{receipt_id}/listings | 
*ShopListingApi* | [**getListingsByShopReturnPolicy**](docs/ShopListingApi.md#getListingsByShopReturnPolicy) | **GET** /v3/application/shops/{shop_id}/policies/return/{return_policy_id}/listings | 
*ShopListingApi* | [**getListingsByShopSectionId**](docs/ShopListingApi.md#getListingsByShopSectionId) | **GET** /v3/application/shops/{shop_id}/shop-sections/listings | 
*ShopListingApi* | [**updateListing**](docs/ShopListingApi.md#updateListing) | **PATCH** /v3/application/shops/{shop_id}/listings/{listing_id} | 
*ShopListingApi* | [**updateListingDeprecated**](docs/ShopListingApi.md#updateListingDeprecated) | **PUT** /v3/application/shops/{shop_id}/listings/{listing_id} | 
*ShopListingApi* | [**updateListingProperty**](docs/ShopListingApi.md#updateListingProperty) | **PUT** /v3/application/shops/{shop_id}/listings/{listing_id}/properties/{property_id} | 
*ShopListingFileApi* | [**deleteListingFile**](docs/ShopListingFileApi.md#deleteListingFile) | **DELETE** /v3/application/shops/{shop_id}/listings/{listing_id}/files/{listing_file_id} | 
*ShopListingFileApi* | [**getAllListingFiles**](docs/ShopListingFileApi.md#getAllListingFiles) | **GET** /v3/application/shops/{shop_id}/listings/{listing_id}/files | 
*ShopListingFileApi* | [**getListingFile**](docs/ShopListingFileApi.md#getListingFile) | **GET** /v3/application/shops/{shop_id}/listings/{listing_id}/files/{listing_file_id} | 
*ShopListingFileApi* | [**uploadListingFile**](docs/ShopListingFileApi.md#uploadListingFile) | **POST** /v3/application/shops/{shop_id}/listings/{listing_id}/files | 
*ShopListingImageApi* | [**deleteListingImage**](docs/ShopListingImageApi.md#deleteListingImage) | **DELETE** /v3/application/shops/{shop_id}/listings/{listing_id}/images/{listing_image_id} | 
*ShopListingImageApi* | [**getListingImage**](docs/ShopListingImageApi.md#getListingImage) | **GET** /v3/application/listings/{listing_id}/images/{listing_image_id} | 
*ShopListingImageApi* | [**getListingImageDeprecated**](docs/ShopListingImageApi.md#getListingImageDeprecated) | **GET** /v3/application/shops/{shop_id}/listings/{listing_id}/images/{listing_image_id} | 
*ShopListingImageApi* | [**getListingImages**](docs/ShopListingImageApi.md#getListingImages) | **GET** /v3/application/listings/{listing_id}/images | 
*ShopListingImageApi* | [**getListingImagesDeprecated**](docs/ShopListingImageApi.md#getListingImagesDeprecated) | **GET** /v3/application/shops/{shop_id}/listings/{listing_id}/images | 
*ShopListingImageApi* | [**uploadListingImage**](docs/ShopListingImageApi.md#uploadListingImage) | **POST** /v3/application/shops/{shop_id}/listings/{listing_id}/images | 
*ShopListingInventoryApi* | [**getListingInventory**](docs/ShopListingInventoryApi.md#getListingInventory) | **GET** /v3/application/listings/{listing_id}/inventory | 
*ShopListingInventoryApi* | [**updateListingInventory**](docs/ShopListingInventoryApi.md#updateListingInventory) | **PUT** /v3/application/listings/{listing_id}/inventory | 
*ShopListingOfferingApi* | [**getListingOffering**](docs/ShopListingOfferingApi.md#getListingOffering) | **GET** /v3/application/listings/{listing_id}/products/{product_id}/offerings/{product_offering_id} | 
*ShopListingProductApi* | [**getListingProduct**](docs/ShopListingProductApi.md#getListingProduct) | **GET** /v3/application/listings/{listing_id}/inventory/products/{product_id} | 
*ShopListingTranslationApi* | [**createListingTranslation**](docs/ShopListingTranslationApi.md#createListingTranslation) | **POST** /v3/application/shops/{shop_id}/listings/{listing_id}/translations/{language} | 
*ShopListingTranslationApi* | [**getListingTranslation**](docs/ShopListingTranslationApi.md#getListingTranslation) | **GET** /v3/application/shops/{shop_id}/listings/{listing_id}/translations/{language} | 
*ShopListingTranslationApi* | [**updateListingTranslation**](docs/ShopListingTranslationApi.md#updateListingTranslation) | **PUT** /v3/application/shops/{shop_id}/listings/{listing_id}/translations/{language} | 
*ShopListingVariationImageApi* | [**getListingVariationImages**](docs/ShopListingVariationImageApi.md#getListingVariationImages) | **GET** /v3/application/shops/{shop_id}/listings/{listing_id}/variation-images | 
*ShopListingVariationImageApi* | [**updateVariationImages**](docs/ShopListingVariationImageApi.md#updateVariationImages) | **POST** /v3/application/shops/{shop_id}/listings/{listing_id}/variation-images | 
*ShopListingVideoApi* | [**deleteListingVideo**](docs/ShopListingVideoApi.md#deleteListingVideo) | **DELETE** /v3/application/shops/{shop_id}/listings/{listing_id}/videos/{video_id} | 
*ShopListingVideoApi* | [**getListingVideo**](docs/ShopListingVideoApi.md#getListingVideo) | **GET** /v3/application/listings/{listing_id}/videos/{video_id} | 
*ShopListingVideoApi* | [**getListingVideos**](docs/ShopListingVideoApi.md#getListingVideos) | **GET** /v3/application/listings/{listing_id}/videos | 
*ShopListingVideoApi* | [**uploadListingVideo**](docs/ShopListingVideoApi.md#uploadListingVideo) | **POST** /v3/application/shops/{shop_id}/listings/{listing_id}/videos | 
*ShopProductionPartnerApi* | [**getShopProductionPartners**](docs/ShopProductionPartnerApi.md#getShopProductionPartners) | **GET** /v3/application/shops/{shop_id}/production-partners | 
*ShopReceiptApi* | [**createReceiptShipment**](docs/ShopReceiptApi.md#createReceiptShipment) | **POST** /v3/application/shops/{shop_id}/receipts/{receipt_id}/tracking | 
*ShopReceiptApi* | [**getShopReceipt**](docs/ShopReceiptApi.md#getShopReceipt) | **GET** /v3/application/shops/{shop_id}/receipts/{receipt_id} | 
*ShopReceiptApi* | [**getShopReceipts**](docs/ShopReceiptApi.md#getShopReceipts) | **GET** /v3/application/shops/{shop_id}/receipts | 
*ShopReceiptApi* | [**updateShopReceipt**](docs/ShopReceiptApi.md#updateShopReceipt) | **PUT** /v3/application/shops/{shop_id}/receipts/{receipt_id} | 
*ShopReceiptTransactionsApi* | [**getShopReceiptTransaction**](docs/ShopReceiptTransactionsApi.md#getShopReceiptTransaction) | **GET** /v3/application/shops/{shop_id}/transactions/{transaction_id} | 
*ShopReceiptTransactionsApi* | [**getShopReceiptTransactionsByListing**](docs/ShopReceiptTransactionsApi.md#getShopReceiptTransactionsByListing) | **GET** /v3/application/shops/{shop_id}/listings/{listing_id}/transactions | 
*ShopReceiptTransactionsApi* | [**getShopReceiptTransactionsByReceipt**](docs/ShopReceiptTransactionsApi.md#getShopReceiptTransactionsByReceipt) | **GET** /v3/application/shops/{shop_id}/receipts/{receipt_id}/transactions | 
*ShopReceiptTransactionsApi* | [**getShopReceiptTransactionsByShop**](docs/ShopReceiptTransactionsApi.md#getShopReceiptTransactionsByShop) | **GET** /v3/application/shops/{shop_id}/transactions | 
*ShopReturnPolicyApi* | [**consolidateShopReturnPolicies**](docs/ShopReturnPolicyApi.md#consolidateShopReturnPolicies) | **POST** /v3/application/shops/{shop_id}/policies/return/consolidate | 
*ShopReturnPolicyApi* | [**createShopReturnPolicy**](docs/ShopReturnPolicyApi.md#createShopReturnPolicy) | **POST** /v3/application/shops/{shop_id}/policies/return | 
*ShopReturnPolicyApi* | [**deleteShopReturnPolicy**](docs/ShopReturnPolicyApi.md#deleteShopReturnPolicy) | **DELETE** /v3/application/shops/{shop_id}/policies/return/{return_policy_id} | 
*ShopReturnPolicyApi* | [**getShopReturnPolicies**](docs/ShopReturnPolicyApi.md#getShopReturnPolicies) | **GET** /v3/application/shops/{shop_id}/policies/return | 
*ShopReturnPolicyApi* | [**getShopReturnPolicy**](docs/ShopReturnPolicyApi.md#getShopReturnPolicy) | **GET** /v3/application/shops/{shop_id}/policies/return/{return_policy_id} | 
*ShopReturnPolicyApi* | [**updateShopReturnPolicy**](docs/ShopReturnPolicyApi.md#updateShopReturnPolicy) | **PUT** /v3/application/shops/{shop_id}/policies/return/{return_policy_id} | 
*ShopSectionApi* | [**createShopSection**](docs/ShopSectionApi.md#createShopSection) | **POST** /v3/application/shops/{shop_id}/sections | 
*ShopSectionApi* | [**deleteShopSection**](docs/ShopSectionApi.md#deleteShopSection) | **DELETE** /v3/application/shops/{shop_id}/sections/{shop_section_id} | 
*ShopSectionApi* | [**getShopSection**](docs/ShopSectionApi.md#getShopSection) | **GET** /v3/application/shops/{shop_id}/sections/{shop_section_id} | 
*ShopSectionApi* | [**getShopSections**](docs/ShopSectionApi.md#getShopSections) | **GET** /v3/application/shops/{shop_id}/sections | 
*ShopSectionApi* | [**updateShopSection**](docs/ShopSectionApi.md#updateShopSection) | **PUT** /v3/application/shops/{shop_id}/sections/{shop_section_id} | 
*ShopShippingProfileApi* | [**createShopShippingProfile**](docs/ShopShippingProfileApi.md#createShopShippingProfile) | **POST** /v3/application/shops/{shop_id}/shipping-profiles | 
*ShopShippingProfileApi* | [**createShopShippingProfileDestination**](docs/ShopShippingProfileApi.md#createShopShippingProfileDestination) | **POST** /v3/application/shops/{shop_id}/shipping-profiles/{shipping_profile_id}/destinations | 
*ShopShippingProfileApi* | [**createShopShippingProfileUpgrade**](docs/ShopShippingProfileApi.md#createShopShippingProfileUpgrade) | **POST** /v3/application/shops/{shop_id}/shipping-profiles/{shipping_profile_id}/upgrades | 
*ShopShippingProfileApi* | [**deleteShopShippingProfile**](docs/ShopShippingProfileApi.md#deleteShopShippingProfile) | **DELETE** /v3/application/shops/{shop_id}/shipping-profiles/{shipping_profile_id} | 
*ShopShippingProfileApi* | [**deleteShopShippingProfileDestination**](docs/ShopShippingProfileApi.md#deleteShopShippingProfileDestination) | **DELETE** /v3/application/shops/{shop_id}/shipping-profiles/{shipping_profile_id}/destinations/{shipping_profile_destination_id} | 
*ShopShippingProfileApi* | [**deleteShopShippingProfileUpgrade**](docs/ShopShippingProfileApi.md#deleteShopShippingProfileUpgrade) | **DELETE** /v3/application/shops/{shop_id}/shipping-profiles/{shipping_profile_id}/upgrades/{upgrade_id} | 
*ShopShippingProfileApi* | [**getShippingCarriers**](docs/ShopShippingProfileApi.md#getShippingCarriers) | **GET** /v3/application/shipping-carriers | 
*ShopShippingProfileApi* | [**getShopShippingProfile**](docs/ShopShippingProfileApi.md#getShopShippingProfile) | **GET** /v3/application/shops/{shop_id}/shipping-profiles/{shipping_profile_id} | 
*ShopShippingProfileApi* | [**getShopShippingProfileDestinationsByShippingProfile**](docs/ShopShippingProfileApi.md#getShopShippingProfileDestinationsByShippingProfile) | **GET** /v3/application/shops/{shop_id}/shipping-profiles/{shipping_profile_id}/destinations | 
*ShopShippingProfileApi* | [**getShopShippingProfileUpgrades**](docs/ShopShippingProfileApi.md#getShopShippingProfileUpgrades) | **GET** /v3/application/shops/{shop_id}/shipping-profiles/{shipping_profile_id}/upgrades | 
*ShopShippingProfileApi* | [**getShopShippingProfiles**](docs/ShopShippingProfileApi.md#getShopShippingProfiles) | **GET** /v3/application/shops/{shop_id}/shipping-profiles | 
*ShopShippingProfileApi* | [**updateShopShippingProfile**](docs/ShopShippingProfileApi.md#updateShopShippingProfile) | **PUT** /v3/application/shops/{shop_id}/shipping-profiles/{shipping_profile_id} | 
*ShopShippingProfileApi* | [**updateShopShippingProfileDestination**](docs/ShopShippingProfileApi.md#updateShopShippingProfileDestination) | **PUT** /v3/application/shops/{shop_id}/shipping-profiles/{shipping_profile_id}/destinations/{shipping_profile_destination_id} | 
*ShopShippingProfileApi* | [**updateShopShippingProfileUpgrade**](docs/ShopShippingProfileApi.md#updateShopShippingProfileUpgrade) | **PUT** /v3/application/shops/{shop_id}/shipping-profiles/{shipping_profile_id}/upgrades/{upgrade_id} | 
*UserApi* | [**getMe**](docs/UserApi.md#getMe) | **GET** /v3/application/users/me | 
*UserApi* | [**getUser**](docs/UserApi.md#getUser) | **GET** /v3/application/users/{user_id} | 
*UserAddressApi* | [**deleteUserAddress**](docs/UserAddressApi.md#deleteUserAddress) | **DELETE** /v3/application/user/addresses/{user_address_id} | 
*UserAddressApi* | [**getUserAddress**](docs/UserAddressApi.md#getUserAddress) | **GET** /v3/application/user/addresses/{user_address_id} | 
*UserAddressApi* | [**getUserAddresses**](docs/UserAddressApi.md#getUserAddresses) | **GET** /v3/application/user/addresses | 


## Documentation for Models

 - [BuyerTaxonomyNode](docs/BuyerTaxonomyNode.md)
 - [BuyerTaxonomyNodeChildrenInner](docs/BuyerTaxonomyNodeChildrenInner.md)
 - [BuyerTaxonomyNodeProperties](docs/BuyerTaxonomyNodeProperties.md)
 - [BuyerTaxonomyNodePropertiesResultsInner](docs/BuyerTaxonomyNodePropertiesResultsInner.md)
 - [BuyerTaxonomyNodeProperty](docs/BuyerTaxonomyNodeProperty.md)
 - [BuyerTaxonomyNodePropertyPossibleValuesInner](docs/BuyerTaxonomyNodePropertyPossibleValuesInner.md)
 - [BuyerTaxonomyNodePropertyScalesInner](docs/BuyerTaxonomyNodePropertyScalesInner.md)
 - [BuyerTaxonomyNodePropertySelectedValuesInner](docs/BuyerTaxonomyNodePropertySelectedValuesInner.md)
 - [BuyerTaxonomyNodes](docs/BuyerTaxonomyNodes.md)
 - [BuyerTaxonomyNodesResultsInner](docs/BuyerTaxonomyNodesResultsInner.md)
 - [BuyerTaxonomyPropertyScale](docs/BuyerTaxonomyPropertyScale.md)
 - [BuyerTaxonomyPropertyValue](docs/BuyerTaxonomyPropertyValue.md)
 - [ErrorSchema](docs/ErrorSchema.md)
 - [ListingImage](docs/ListingImage.md)
 - [ListingImages](docs/ListingImages.md)
 - [ListingImagesResultsInner](docs/ListingImagesResultsInner.md)
 - [ListingInventory](docs/ListingInventory.md)
 - [ListingInventoryProduct](docs/ListingInventoryProduct.md)
 - [ListingInventoryProductOffering](docs/ListingInventoryProductOffering.md)
 - [ListingInventoryProductOfferingPrice](docs/ListingInventoryProductOfferingPrice.md)
 - [ListingInventoryProductOfferingsInner](docs/ListingInventoryProductOfferingsInner.md)
 - [ListingInventoryProductPropertyValuesInner](docs/ListingInventoryProductPropertyValuesInner.md)
 - [ListingInventoryProductsInner](docs/ListingInventoryProductsInner.md)
 - [ListingInventoryWithAssociations](docs/ListingInventoryWithAssociations.md)
 - [ListingInventoryWithAssociationsListing](docs/ListingInventoryWithAssociationsListing.md)
 - [ListingPropertyValue](docs/ListingPropertyValue.md)
 - [ListingPropertyValues](docs/ListingPropertyValues.md)
 - [ListingPropertyValuesResultsInner](docs/ListingPropertyValuesResultsInner.md)
 - [ListingReview](docs/ListingReview.md)
 - [ListingReviews](docs/ListingReviews.md)
 - [ListingReviewsResultsInner](docs/ListingReviewsResultsInner.md)
 - [ListingTranslation](docs/ListingTranslation.md)
 - [ListingVariationImage](docs/ListingVariationImage.md)
 - [ListingVariationImages](docs/ListingVariationImages.md)
 - [ListingVariationImagesResultsInner](docs/ListingVariationImagesResultsInner.md)
 - [ListingVideo](docs/ListingVideo.md)
 - [ListingVideos](docs/ListingVideos.md)
 - [ListingVideosResultsInner](docs/ListingVideosResultsInner.md)
 - [Money](docs/Money.md)
 - [Payment](docs/Payment.md)
 - [PaymentAccountLedgerEntries](docs/PaymentAccountLedgerEntries.md)
 - [PaymentAccountLedgerEntriesResultsInner](docs/PaymentAccountLedgerEntriesResultsInner.md)
 - [PaymentAccountLedgerEntry](docs/PaymentAccountLedgerEntry.md)
 - [PaymentAccountLedgerEntryPaymentAdjustmentsInner](docs/PaymentAccountLedgerEntryPaymentAdjustmentsInner.md)
 - [PaymentAdjustedFees](docs/PaymentAdjustedFees.md)
 - [PaymentAdjustedGross](docs/PaymentAdjustedGross.md)
 - [PaymentAdjustedNet](docs/PaymentAdjustedNet.md)
 - [PaymentAdjustment](docs/PaymentAdjustment.md)
 - [PaymentAdjustmentItem](docs/PaymentAdjustmentItem.md)
 - [PaymentAdjustmentPaymentAdjustmentItemsInner](docs/PaymentAdjustmentPaymentAdjustmentItemsInner.md)
 - [PaymentAmountFees](docs/PaymentAmountFees.md)
 - [PaymentAmountGross](docs/PaymentAmountGross.md)
 - [PaymentAmountNet](docs/PaymentAmountNet.md)
 - [PaymentPostedFees](docs/PaymentPostedFees.md)
 - [PaymentPostedGross](docs/PaymentPostedGross.md)
 - [PaymentPostedNet](docs/PaymentPostedNet.md)
 - [Payments](docs/Payments.md)
 - [PaymentsResultsInner](docs/PaymentsResultsInner.md)
 - [Pong](docs/Pong.md)
 - [Self](docs/Self.md)
 - [SellerTaxonomyNode](docs/SellerTaxonomyNode.md)
 - [SellerTaxonomyNodeChildrenInner](docs/SellerTaxonomyNodeChildrenInner.md)
 - [SellerTaxonomyNodes](docs/SellerTaxonomyNodes.md)
 - [SellerTaxonomyNodesResultsInner](docs/SellerTaxonomyNodesResultsInner.md)
 - [ShippingCarrier](docs/ShippingCarrier.md)
 - [ShippingCarrierDomesticClassesInner](docs/ShippingCarrierDomesticClassesInner.md)
 - [ShippingCarrierInternationalClassesInner](docs/ShippingCarrierInternationalClassesInner.md)
 - [ShippingCarrierMailClass](docs/ShippingCarrierMailClass.md)
 - [ShippingCarriers](docs/ShippingCarriers.md)
 - [ShippingCarriersResultsInner](docs/ShippingCarriersResultsInner.md)
 - [Shop](docs/Shop.md)
 - [ShopListing](docs/ShopListing.md)
 - [ShopListingFile](docs/ShopListingFile.md)
 - [ShopListingFiles](docs/ShopListingFiles.md)
 - [ShopListingFilesResultsInner](docs/ShopListingFilesResultsInner.md)
 - [ShopListingPrice](docs/ShopListingPrice.md)
 - [ShopListingWithAssociations](docs/ShopListingWithAssociations.md)
 - [ShopListingWithAssociationsImagesInner](docs/ShopListingWithAssociationsImagesInner.md)
 - [ShopListingWithAssociationsInventory](docs/ShopListingWithAssociationsInventory.md)
 - [ShopListingWithAssociationsProductionPartnersInner](docs/ShopListingWithAssociationsProductionPartnersInner.md)
 - [ShopListingWithAssociationsShippingProfile](docs/ShopListingWithAssociationsShippingProfile.md)
 - [ShopListingWithAssociationsShop](docs/ShopListingWithAssociationsShop.md)
 - [ShopListingWithAssociationsTranslationsInner](docs/ShopListingWithAssociationsTranslationsInner.md)
 - [ShopListingWithAssociationsUser](docs/ShopListingWithAssociationsUser.md)
 - [ShopListingWithAssociationsVideosInner](docs/ShopListingWithAssociationsVideosInner.md)
 - [ShopListings](docs/ShopListings.md)
 - [ShopListingsResultsInner](docs/ShopListingsResultsInner.md)
 - [ShopListingsWithAssociations](docs/ShopListingsWithAssociations.md)
 - [ShopListingsWithAssociationsResultsInner](docs/ShopListingsWithAssociationsResultsInner.md)
 - [ShopProductionPartner](docs/ShopProductionPartner.md)
 - [ShopProductionPartners](docs/ShopProductionPartners.md)
 - [ShopProductionPartnersResultsInner](docs/ShopProductionPartnersResultsInner.md)
 - [ShopReceipt](docs/ShopReceipt.md)
 - [ShopReceiptDiscountAmt](docs/ShopReceiptDiscountAmt.md)
 - [ShopReceiptGiftWrapPrice](docs/ShopReceiptGiftWrapPrice.md)
 - [ShopReceiptGrandtotal](docs/ShopReceiptGrandtotal.md)
 - [ShopReceiptRefundsInner](docs/ShopReceiptRefundsInner.md)
 - [ShopReceiptShipment](docs/ShopReceiptShipment.md)
 - [ShopReceiptShipmentsInner](docs/ShopReceiptShipmentsInner.md)
 - [ShopReceiptSubtotal](docs/ShopReceiptSubtotal.md)
 - [ShopReceiptTotalPrice](docs/ShopReceiptTotalPrice.md)
 - [ShopReceiptTotalShippingCost](docs/ShopReceiptTotalShippingCost.md)
 - [ShopReceiptTotalTaxCost](docs/ShopReceiptTotalTaxCost.md)
 - [ShopReceiptTotalVatCost](docs/ShopReceiptTotalVatCost.md)
 - [ShopReceiptTransaction](docs/ShopReceiptTransaction.md)
 - [ShopReceiptTransactionPrice](docs/ShopReceiptTransactionPrice.md)
 - [ShopReceiptTransactionShippingCost](docs/ShopReceiptTransactionShippingCost.md)
 - [ShopReceiptTransactionVariationsInner](docs/ShopReceiptTransactionVariationsInner.md)
 - [ShopReceiptTransactions](docs/ShopReceiptTransactions.md)
 - [ShopReceiptTransactionsInner](docs/ShopReceiptTransactionsInner.md)
 - [ShopReceiptTransactionsResultsInner](docs/ShopReceiptTransactionsResultsInner.md)
 - [ShopReceipts](docs/ShopReceipts.md)
 - [ShopReceiptsResultsInner](docs/ShopReceiptsResultsInner.md)
 - [ShopRefund](docs/ShopRefund.md)
 - [ShopRefundAmount](docs/ShopRefundAmount.md)
 - [ShopReturnPolicies](docs/ShopReturnPolicies.md)
 - [ShopReturnPoliciesResultsInner](docs/ShopReturnPoliciesResultsInner.md)
 - [ShopReturnPolicy](docs/ShopReturnPolicy.md)
 - [ShopSection](docs/ShopSection.md)
 - [ShopSections](docs/ShopSections.md)
 - [ShopSectionsResultsInner](docs/ShopSectionsResultsInner.md)
 - [ShopShippingProfile](docs/ShopShippingProfile.md)
 - [ShopShippingProfileDestination](docs/ShopShippingProfileDestination.md)
 - [ShopShippingProfileDestinationPrimaryCost](docs/ShopShippingProfileDestinationPrimaryCost.md)
 - [ShopShippingProfileDestinationSecondaryCost](docs/ShopShippingProfileDestinationSecondaryCost.md)
 - [ShopShippingProfileDestinations](docs/ShopShippingProfileDestinations.md)
 - [ShopShippingProfileDestinationsResultsInner](docs/ShopShippingProfileDestinationsResultsInner.md)
 - [ShopShippingProfileShippingProfileDestinationsInner](docs/ShopShippingProfileShippingProfileDestinationsInner.md)
 - [ShopShippingProfileShippingProfileUpgradesInner](docs/ShopShippingProfileShippingProfileUpgradesInner.md)
 - [ShopShippingProfileUpgrade](docs/ShopShippingProfileUpgrade.md)
 - [ShopShippingProfileUpgradePrice](docs/ShopShippingProfileUpgradePrice.md)
 - [ShopShippingProfileUpgradeSecondaryPrice](docs/ShopShippingProfileUpgradeSecondaryPrice.md)
 - [ShopShippingProfileUpgrades](docs/ShopShippingProfileUpgrades.md)
 - [ShopShippingProfileUpgradesResultsInner](docs/ShopShippingProfileUpgradesResultsInner.md)
 - [ShopShippingProfiles](docs/ShopShippingProfiles.md)
 - [ShopShippingProfilesResultsInner](docs/ShopShippingProfilesResultsInner.md)
 - [Shops](docs/Shops.md)
 - [ShopsResultsInner](docs/ShopsResultsInner.md)
 - [TaxonomyNodeProperties](docs/TaxonomyNodeProperties.md)
 - [TaxonomyNodePropertiesResultsInner](docs/TaxonomyNodePropertiesResultsInner.md)
 - [TaxonomyNodeProperty](docs/TaxonomyNodeProperty.md)
 - [TaxonomyNodePropertyPossibleValuesInner](docs/TaxonomyNodePropertyPossibleValuesInner.md)
 - [TaxonomyNodePropertyScalesInner](docs/TaxonomyNodePropertyScalesInner.md)
 - [TaxonomyNodePropertySelectedValuesInner](docs/TaxonomyNodePropertySelectedValuesInner.md)
 - [TaxonomyPropertyScale](docs/TaxonomyPropertyScale.md)
 - [TaxonomyPropertyValue](docs/TaxonomyPropertyValue.md)
 - [TransactionReview](docs/TransactionReview.md)
 - [TransactionReviews](docs/TransactionReviews.md)
 - [TransactionReviewsResultsInner](docs/TransactionReviewsResultsInner.md)
 - [TransactionVariations](docs/TransactionVariations.md)
 - [UpdateListingInventoryRequest](docs/UpdateListingInventoryRequest.md)
 - [UpdateListingInventoryRequestProductsInner](docs/UpdateListingInventoryRequestProductsInner.md)
 - [UpdateListingInventoryRequestProductsInnerOfferingsInner](docs/UpdateListingInventoryRequestProductsInnerOfferingsInner.md)
 - [UpdateListingInventoryRequestProductsInnerPropertyValuesInner](docs/UpdateListingInventoryRequestProductsInnerPropertyValuesInner.md)
 - [UpdateVariationImagesRequest](docs/UpdateVariationImagesRequest.md)
 - [UpdateVariationImagesRequestVariationImagesInner](docs/UpdateVariationImagesRequestVariationImagesInner.md)
 - [User](docs/User.md)
 - [UserAddress](docs/UserAddress.md)
 - [UserAddresses](docs/UserAddresses.md)
 - [UserAddressesResultsInner](docs/UserAddressesResultsInner.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: x-api-key
- **Location**: HTTP header

### oauth2

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://www.etsy.com/oauth/connect
- **Scopes**: 
  - address_r: see billing and shipping addresses
  - address_w: update billing and shipping addresses
  - billing_r: see all billing statement data
  - cart_r: read shopping carts
  - cart_w: add/remove from shopping carts
  - email_r: Read a member&#39;s email address
  - favorites_r: see private favorites
  - favorites_w: add/remove favorites
  - feedback_r: see purchase info in feedback
  - listings_d: delete listings
  - listings_r: see all listings (including expired etc)
  - listings_w: create/edit listings
  - profile_r: see all profile data
  - profile_w: update user profile, avatar, etc
  - recommend_r: see recommended listings
  - recommend_w: accept/reject recommended listings
  - shops_r: see private shop info
  - shops_w: update shop
  - transactions_r: see all checkout/payment data
  - transactions_w: update receipts


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

developers@etsy.com

