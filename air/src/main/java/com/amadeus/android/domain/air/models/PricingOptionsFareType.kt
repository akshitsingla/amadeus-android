/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Flight Create Orders
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.air.models

import com.squareup.moshi.Json

/**
 * type of fare of the flight-offer
 */
typealias PricingOptionsFareType = List<PricingOptionsFareTypeEnum>

/**
  * 
  * Values: PUBLISHED, NEGOTIATED, CORPORATE
  */
enum class PricingOptionsFareTypeEnum(val value: String) {
    @Json(name = "PUBLISHED") PUBLISHED("PUBLISHED"),@Json(name = "NEGOTIATED") NEGOTIATED("NEGOTIATED"),@Json(name = "CORPORATE") CORPORATE("CORPORATE")
}
