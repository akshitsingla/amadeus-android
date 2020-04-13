/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Flight Offers Search
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.air.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import org.threeten.bp.LocalDate

/**
 * @property date Dates are specified in the [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) YYYY-MM-DD format, e.g. 2018-12-25
 * @property dateWindow Either 1, 2 or 3 extra days around the local date (IxD for +/- x days - Ex: I3D), Either 1 to 3 days after the local date (PxD for +x days - Ex: P3D), or 1 to 3 days before the local date (MxD for -x days - Ex: M3D)
 * @property time Local time. hh:mm:ss format, e.g 10:30:00
 * @property timeWindow 1 to 12 hours around (both +and -) the local time. Possibly limited by the number of extra days when specified, i.e.  in some situations, it may not be used to exceed the maximum date range. [1-12]H format, e.g. 6H
 */
@JsonClass(generateAdapter = true)
data class DateTimeRange(
    @Json(name = "date") @field:Json(name = "date") var date: LocalDate,
    @Json(name = "dateWindow") @field:Json(name = "dateWindow") var dateWindow: String? = null,
    @Json(name = "time") @field:Json(name = "time") var time: String? = null,
    @Json(name = "timeWindow") @field:Json(name = "timeWindow") var timeWindow: String? = null
)