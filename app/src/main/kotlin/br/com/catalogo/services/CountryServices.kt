package br.com.catalogo.services

import br.com.catalogo.domain.Country

//Nao permitir paises que nao sejam do Brasil
class CountryServices {

    fun validaPais(country: Country) {
        if (country.mcc != 724){
            throw Exception("O pais ${country.name} nao e permitido")
        }
    }

    fun getAll() = listOf("Brasil")
}