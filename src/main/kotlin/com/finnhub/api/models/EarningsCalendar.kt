/**
 * Finnhub API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.finnhub.api.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonObject

/**
 *
 * @param earningsCalendar Array of earnings release.
 */

@Serializable
data class EarningsCalendar(
    /* Array of earnings release. */
    @SerialName("earningsCalendar")
    val earningsCalendar: List<JsonObject>? = null
) {

    companion object {
    }

}

