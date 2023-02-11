package br.com.catalogo.services

import br.com.catalogo.domain.Address
import java.util.function.ToIntFunction

class AddressService {
    // duvida sobre o id ser nulo ou nao
    fun save(address: Address):Address {
        val addressExist = address.address2?.isNotEmpty()

        if (address.id > 0){
            if((address.address1.length >= 4)  &&
                (address.address1.isNotEmpty()) &&
                (address.address1.matches("^[a-zA-Z]*$".toRegex()))){
                if(addressExist == true){
                    if((address.address2.length >= 4)  &&
                        (address.address2.matches("^[a-zA-Z]*$".toRegex()))){
                       // if(address.city.)
                      // deve comparar com a lista de cidades
                    }

                }
                else{
                    // cidade if(address.city)
                }

            }
        }
        return address
    }

    fun update(address: Address):Address{
        if((address.address1.length >= 4)  &&
            (address.address1.isNotEmpty()) &&
            (address.address1.matches("^[a-zA-Z]*$".toRegex()))) {
        }
        return address
    }

    fun delete (address: Address):Address{
        return address
    }

    fun getAll (address: Address):Address{
        return address
    }

    fun getById (address: Address):Address{
        return address
    }
}