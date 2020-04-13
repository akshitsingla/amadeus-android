/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Flight Check-in Links
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.air.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property type the resource name
 * @property id identifier of the resource
 * @property href direct URL to the relevant page
 * @property channel indicates the type of channel supported by the URL
 * @property parameters list of URL parameters with descriptive information such as description and/or type and/or format
 */
@JsonClass(generateAdapter = true)
data class CheckinLink(
    @Json(name = "type") @field:Json(name = "type") var type: String,
    @Json(name = "id") @field:Json(name = "id") var id: String,
    @Json(name = "href") @field:Json(name = "href") var href: String,
    @Json(name = "channel") @field:Json(name = "channel") var channel: CheckinLink.ChannelEnum,
    @Json(name = "parameters") @field:Json(name = "parameters") var parameters: Map<String, Any?>? = null
) {
    /**
     * indicates the type of channel supported by the URL
     * Values: MOBILE, WEB, ALL
     */
    @JsonClass(generateAdapter = false)
    enum class ChannelEnum(val value: String) {
        @Json(name = "Mobile")
        MOBILE("Mobile"),
        @Json(name = "Web")
        WEB("Web"),
        @Json(name = "All")
        ALL("All")
    }
}