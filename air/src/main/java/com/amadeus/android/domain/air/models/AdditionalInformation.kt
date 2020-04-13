/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Flight Offers Search
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.air.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property chargeableCheckedBags If true, returns the price of the first additional bag when the airline is an \&quot;Amadeus Ancillary Services\&quot; member.
 * @property brandedFares If true, returns the fare family name for each flight-offer which supports fare family
 */
@JsonClass(generateAdapter = true)
data class AdditionalInformation(
    @Json(name = "chargeableCheckedBags") @field:Json(name = "chargeableCheckedBags") var chargeableCheckedBags: Boolean? = null,
    @Json(name = "brandedFares") @field:Json(name = "brandedFares") var brandedFares: Boolean? = null
)