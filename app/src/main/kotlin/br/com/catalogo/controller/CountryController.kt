package br.com.catalogo.controller

import br.com.catalogo.services.CountryServices
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/CountryController/")
class CountryController {
    val countryServices = CountryServices()
    @Get
    fun hello() = countryServices.getAll()
}