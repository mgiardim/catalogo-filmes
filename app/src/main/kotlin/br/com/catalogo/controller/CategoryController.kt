package br.com.catalogo.controller

import br.com.catalogo.services.CategoryServices
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/CategoryController/")
class CategoryController {
    val categoryServices = CategoryServices()
    @Get
    fun hello() = categoryServices.getAll()
}