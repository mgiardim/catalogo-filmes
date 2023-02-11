package br.com.catalogo.controller

import br.com.catalogo.domain.Address
import br.com.catalogo.services.AddressService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Delete
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Put

@Controller("/Address/")
// duvida sobre o tratamento de status code
class AddressController {
    val addressService = AddressService()

    @Post
    fun create(@Body address: Address):HttpResponse<Address>{
        return HttpResponse.created(addressService.save(address))
    }

    @Put
    fun update(address: Address):Address{
        return address
    }

    @Delete
    fun del(address: Address):Address{
        return address
    }

    @Get
    fun getAll(address: Address):Address{
        return address
    }



}