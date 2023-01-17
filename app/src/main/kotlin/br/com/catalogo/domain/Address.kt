package br.com.catalogo.domain

import java.time.LocalDateTime
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater

data class Address(
    val id: Int? = null,
    val name : String,
    val secondName : String? = null,
    val district : String,
    val city: City,
    val postalCode: String,
    val phone: String,
    val lastUpdate: LocalDateTime,
    val location: Int
)
