/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Trip Parser
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.trip.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * train reservation
 * @property bkgChannel
 * @property originSystem It is calculated automatically. If filled, the input will be discarded for the calculated value.
 * @property externalSystem
 * @property creation
 * @property modification
 * @property confirmation
 * @property descriptions
 * @property description Description or Free text
 * @property bkgClass Booking class
 * @property status Status code (example HK, HX, HN, HL, TT ...)
 * @property NIP Number in party
 * @property confirmNbr Confirmation number
 * @property cancelNbr Cancellation number
 * @property overrideStatus Enable to override status code (ex. for Offers)
 * @property MBOProductCode Freetext. Sub-product of the MBO (Ex. For EC AIR &gt; international, domestic, european)
 * @property serviceProvider
 * @property identifier Train number
 * @property start
 * @property end
 * @property duration
 * @property vehicle
 * @property mileage
 * @property collectionReference
 * @property ticket
 */
@JsonClass(generateAdapter = true)
data class ProductTrain(
    @Json(name = "bkgChannel") @field:Json(name = "bkgChannel") var bkgChannel: BookingChannelType? = null,
    @Json(name = "originSystem") @field:Json(name = "originSystem") var originSystem: OriginSystemType? = null,
    @Json(name = "externalSystem") @field:Json(name = "externalSystem") var externalSystem: ExternalSystemType? = null,
    @Json(name = "creation") @field:Json(name = "creation") var creation: ProductCreation? = null,
    @Json(name = "modification") @field:Json(name = "modification") var modification: ProductModification? = null,
    @Json(name = "confirmation") @field:Json(name = "confirmation") var confirmation: ProductConfirmation? = null,
    @Json(name = "descriptions") @field:Json(name = "descriptions") var descriptions: List<Description>? = null,
    @Json(name = "description") @field:Json(name = "description") var description: String? = null,
    @Json(name = "bkgClass") @field:Json(name = "bkgClass") var bkgClass: String? = null,
    @Json(name = "status") @field:Json(name = "status") var status: String? = null,
    @Json(name = "NIP") @field:Json(name = "NIP") var NIP: Int? = null,
    @Json(name = "confirmNbr") @field:Json(name = "confirmNbr") var confirmNbr: String? = null,
    @Json(name = "cancelNbr") @field:Json(name = "cancelNbr") var cancelNbr: String? = null,
    @Json(name = "overrideStatus") @field:Json(name = "overrideStatus") var overrideStatus: String? = null,
    @Json(name = "MBOProductCode") @field:Json(name = "MBOProductCode") var MBOProductCode: String? = null,
    @Json(name = "serviceProvider") @field:Json(name = "serviceProvider") var serviceProvider: ProductTrainServiceProvider? = null,
    @Json(name = "identifier") @field:Json(name = "identifier") var identifier: String? = null,
    @Json(name = "start") @field:Json(name = "start") var start: ProductTrainStart? = null,
    @Json(name = "end") @field:Json(name = "end") var end: ProductTrainEnd? = null,
    @Json(name = "duration") @field:Json(name = "duration") var duration: String? = null,
    @Json(name = "vehicle") @field:Json(name = "vehicle") var vehicle: ProductTrainVehicle? = null,
    @Json(name = "mileage") @field:Json(name = "mileage") var mileage: ProductTrainMileage? = null,
    @Json(name = "collectionReference") @field:Json(name = "collectionReference") var collectionReference: ProductTrainCollectionReference? = null,
    @Json(name = "ticket") @field:Json(name = "ticket") var ticket: ProductTrainTicket? = null
)