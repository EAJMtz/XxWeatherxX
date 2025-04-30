package com.example.xxweatherxx

data class Weather(
    val location: Location,
    val current: Current
) {
    data class Location(
        val name: String,
        val region: String,
        val country: String,
        val localtime: String
    )

    data class Current(
        val last_updated: String,
        val temp_c: Double,
        val is_day: Int,
        val wind_mph: Double,
        val condition: Condition
    )

    data class Condition(
        val text: String,
        val icon: String,
        val code: Int
    )
}
