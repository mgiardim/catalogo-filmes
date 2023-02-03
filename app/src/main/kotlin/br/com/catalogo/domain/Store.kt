package br.com.catalogo.domain

import java.time.LocalDateTime

data class Store(
    val id: Int? = null,
    val addressId: Int,
    val lastUpdate: LocalDateTime
)
