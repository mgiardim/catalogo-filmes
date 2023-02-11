package br.com.catalogo.controller

import br.com.catalogo.services.CategoryServices
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/Category/")
class CategoryController {
    val categoryServices = CategoryServices()
    @Get
    fun getALL() = categoryServices.getAll()
}