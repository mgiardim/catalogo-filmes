package br.com.catalogo.repository

import br.com.catalogo.domain.Country
import java.time.LocalDateTime

class MapCountry {

    //Country
    val brasil = Country(
        id = 1,
        name = "Brasil",
        lastUpdate = LocalDateTime.parse("2023-01-01 09:00:00"),
        mcc = 724
    )

    val argentina = Country(
        name = "Argentina",
        lastUpdate = LocalDateTime.now(),
        mcc = 722
    )
    
    val paises = listOf<Country>(brasil,argentina)
    
    fun retornaBrasil(country: Country):Country{
        return brasil
    }
}