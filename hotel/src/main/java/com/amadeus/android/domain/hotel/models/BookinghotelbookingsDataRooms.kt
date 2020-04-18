/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Hotel Booking
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.hotel.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * room
 * @property guestIds room main guest (and accompagnants) (optional)
 * @property paymentId if missing, the first payment is used (optional)
 * @property specialRequest special request to send to the reception (optional)
 */
@JsonClass(generateAdapter = true)
data class BookinghotelbookingsDataRooms(
    @Json(name = "guestIds") @field:Json(name = "guestIds") var guestIds: List<Int>? = null,
    @Json(name = "paymentId") @field:Json(name = "paymentId") var paymentId: Int? = null,
    @Json(name = "specialRequest") @field:Json(name = "specialRequest") var specialRequest: String? = null
)