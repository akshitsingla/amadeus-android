package com.amadeus.android.booking

import com.amadeus.android.BaseApi
import com.amadeus.android.domain.hotel.apis.BookingApi
import com.amadeus.android.tools.GeneratedCodeConverters
import kotlinx.coroutines.CoroutineDispatcher
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.create

class HotelBooking internal constructor(
    baseUrl: String,
    httpClient: OkHttpClient,
    dispatcher: CoroutineDispatcher
) : BaseApi(dispatcher) {

    override val basePath = "v1/"

    private val api: BookingApi = Retrofit.Builder()
        .baseUrl(baseUrl + basePath)
        .addConverterFactory(GeneratedCodeConverters.converterFactory())
        .client(httpClient)
        .build()
        .create()

    suspend fun post(
        requestBody: String,
        amaClientRef: String?
    ) = safeApiCall {
        api.createBooking(requestBody, amaClientRef)
    }

}