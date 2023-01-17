package br.com.catalogo.domain

import java.time.LocalDateTime

data class Category(
    val id: Int? = null,
    val name: String,
    val last_update: LocalDateTime
)
