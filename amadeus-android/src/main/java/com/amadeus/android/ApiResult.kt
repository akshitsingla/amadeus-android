package com.amadeus.android

import com.amadeus.android.ApiResult.Success
import com.squareup.moshi.JsonClass

/**
 * A generic class that holds a value with its loading status.
 * @param <T>
 */
sealed class ApiResult<out T> {

    var method: String? = null
        internal set

    @JsonClass(generateAdapter = true)
    data class Success<out T> internal constructor(
        val meta: Meta?,
        val data: T,
        val dictionaries: Map<String, Any>?
    ) : ApiResult<T>() {

        @JsonClass(generateAdapter = true)
        data class Meta(val count: Int?, val links: Map<String, String>?)
    }

    @JsonClass(generateAdapter = true)
    data class Error internal constructor(
        val errors: List<Issue> = ArrayList()
    ) : ApiResult<Nothing>() {

        @JsonClass(generateAdapter = true)
        data class Issue internal constructor(
            val status: Int? = null,
            val code: Int? = null,
            val title: String? = null,
            val detail: String? = null,
            val source: Source? = null
        )

        @JsonClass(generateAdapter = true)
        data class Source internal constructor(
            val pointer: String? = null,
            val parameter: String? = null,
            val example: String? = null
        )
    }
}

/**
 * `true` if [ApiResult] is of type [Success] & holds non-null [Success.data].
 */
val ApiResult<*>.succeeded
    get() = this is Success && data != null