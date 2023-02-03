package br.com.catalogo.domain

import java.time.LocalDateTime

data class Customer(
    val id: Int? = null,
    val store: Store,
    val firstName: String,
    val lastName: String,
    val email: String,
    val address:Address,
    val active:Boolean,
    val creationDate: LocalDateTime,
    val lastUpdate: LocalDateTime
)
