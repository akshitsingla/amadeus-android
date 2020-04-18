package com.amadeus.android.shopping

import com.amadeus.android.base.BaseApi
import com.amadeus.android.domain.air.apis.ShoppingApi
import com.amadeus.android.domain.air.models.GetPriceQuery
import com.amadeus.android.domain.air.tools.CSV
import com.amadeus.android.domain.air.tools.GeneratedCodeConverters
import kotlinx.coroutines.CoroutineDispatcher
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.create

class FlightOffers internal constructor(
    baseUrl: String,
    httpClient: OkHttpClient,
    dispatcher: CoroutineDispatcher
) : BaseApi(dispatcher) {

    override val basePath = "v1/"

    private val api: ShoppingApi = Retrofit.Builder()
        .baseUrl(baseUrl + basePath)
        .addConverterFactory(GeneratedCodeConverters.converterFactory())
        .client(httpClient)
        .build()
        .create()

    suspend fun get(
        priceFlightOffersBody: GetPriceQuery,
        @CSV include: List<String>? = null,
        forceClass: Boolean? = null
    ) = safeApiCall {
        api.quoteAirOffers(
            priceFlightOffersBody,
            include,
            forceClass
        )
    }

}