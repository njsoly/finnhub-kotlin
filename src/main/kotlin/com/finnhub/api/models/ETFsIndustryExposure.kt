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
 * @param symbol ETF symbol.
 * @param sectorExposure Array of industries and exposure levels.
 */

@Serializable
data class ETFsIndustryExposure (
    /* ETF symbol. */
    @SerialName("symbol")
    val symbol: String? = null,
    /* Array of industries and exposure levels. */
    @SerialName("sectorExposure")
    val sectorExposure: List<JsonObject>? = null
) {
	companion object {
    }
}

