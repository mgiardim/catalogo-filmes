package br.com.catalogo.controller

import br.com.catalogo.domain.Customer
import br.com.catalogo.services.CustomerService
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Delete
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Put

@Controller("/Customer/")
class CustomerController {
    val customerService = CustomerService()

    @Post
    fun create(customer: Customer): Customer {
        return customer
    }

    @Put
    fun update(customer: Customer): Customer {
        return customer
    }


}