package br.com.catalogo.domain

import java.time.LocalDateTime
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater

data class Address(
    // tirar o opcional do id
    val id: Int? = null,
    val address1 : String,
    val address2 : String? = null,
    val district : String,
    val city: Int,
    val postalCode: Int,
    val phone: String,
    val lastUpdate: LocalDateTime,
    //val location: Int? = null
)
