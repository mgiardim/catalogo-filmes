package br.com.catalogo.domain

import java.time.LocalDateTime

data class Store(
    val id: Int? = null,
    val manager_staff_id: Int,
    val addressId: Int,
    val lastUpdate: LocalDateTime
)
