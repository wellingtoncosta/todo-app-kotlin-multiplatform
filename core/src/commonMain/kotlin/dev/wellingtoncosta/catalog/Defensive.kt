package dev.wellingtoncosta.catalog

import kotlinx.datetime.LocalDate

data class Defensive(
    val id: String? = null,
    val name: String,
    val manufacturer: String,
    val type: DefensiveType,
    val measuringUnit: MeasuringUnit,
    val expirationDate: LocalDate
)