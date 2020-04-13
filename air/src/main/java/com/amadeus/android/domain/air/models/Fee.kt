/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Flight Create Orders
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.air.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * a fee
 * @property amount
 * @property type
 */
@JsonClass(generateAdapter = true)
data class Fee(
    @Json(name = "amount") @field:Json(name = "amount") var amount: String? = null,
    @Json(name = "type") @field:Json(name = "type") var type: FeeType? = null
)