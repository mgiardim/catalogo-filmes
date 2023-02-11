package br.com.catalogo.repository

import br.com.catalogo.domain.City
import java.time.LocalDateTime


class MapCity {
    //val brasil = MapCountry

    val saoPaulo = City(
        id = 1,
        name = "São Paulo",
        lastUpdate = LocalDateTime.parse("2023-01-01 09:00:00"),
        country = brasil
    )

    val rioDeJaneiro = City(
        id = 2,
        name = "Rio de Janeiro",
        lastUpdate = LocalDateTime.parse("2023-01-01 10:00:00"),
        country = brasil
    )


    val minasGerais = City(
        id = 4,
        name = "Minas Gerais",
        lastUpdate = LocalDateTime.parse("2023-01-01 12:00:00"),
        country = brasil
    )
    val santaCatarina = City(
        id = 3,
        name = "Santa Catarina",
        lastUpdate = LocalDateTime.parse("2023-01-01 11:00:00"),
        country = brasil
    )
}