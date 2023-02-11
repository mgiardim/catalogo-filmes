package br.com.catalogo

import br.com.catalogo.domain.*
import br.com.catalogo.services.CountryServices
import io.micronaut.runtime.Micronaut.run
import java.lang.ArithmeticException
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(args: Array<String>) {
	run(*args)
	println("Hello World")

	//Address
	//perguntar sobre esses varios mapOf
	val address1 = Address(null,"Av Paulista",null,"Cerqueira Cezar",1,12345333,"93333-0000",LocalDateTime.parse("2023-01-01 09:00:00"))
	val address2 = Address(null,"Av Brasil",null,"Leblon",2,12345444,"94444-0001",LocalDateTime.parse("2023-01-01 10:00:00"))
	val address3 = Address(null,"Av Brasil",null,"Sambaqui",3,12345555,"95555-0002",LocalDateTime.parse("2023-01-01 11:00:00"))

	val addressMap1 = mapOf<Int,Address>(1 to address1)
	val addressMap2 = mapOf<Int,Address>(2 to address2)
	val addressMap3 = mapOf<Int,Address>(3 to address3)

	val i: Int = 10
	var x: Int = 0
	var erros: Int = 0

	//Store
	val store1 = Store(
		id = 1,
		manager_staff_id  = 1,
		addressId = 1,
		lastUpdate = LocalDateTime.parse("2023-01-01 09:00:00")
	)

	val store2 = Store(
		id = 2,
		manager_staff_id  = 2,
		addressId = 2,
		lastUpdate = LocalDateTime.parse("2023-01-01 10:00:00")
	)

	val store3 = Store(
		id = 3,
		manager_staff_id  = 3,
		addressId = 3,
		lastUpdate = LocalDateTime.parse("2023-01-01 11:00:00")
	)


	//Customer

	val customer1 = Customer(
		id = 1,
		store = store1,
		firstName = "Jose",
		lastName = "Antonio",
		email = "joseantonio@gmail.com",
		address = address1,
		active = true,
		creationDate = LocalDateTime.parse("2023-01-01 09:00:00"),
		lastUpdate = LocalDateTime.parse("2023-01-01 09:00:00")
	)

	val customer2 = Customer(
		id = 2,
		store = store2,
		firstName = "Mario",
		lastName = "Lazaro",
		email = "mariolazaro@hotmail.com",
		address = address2,
		active = true,
		creationDate = LocalDateTime.parse("2023-01-01 10:00:00"),
		lastUpdate = LocalDateTime.parse("2023-01-01 10:00:00")
	)

	val customer3 = Customer(
		id = 3,
		store = store3,
		firstName = "Renata",
		lastName = "Prates",
		email = "rprates@gmail.com",
		address = address3,
		active = true,
		creationDate = LocalDateTime.parse("2023-01-01 11:00:00"),
		lastUpdate = LocalDateTime.parse("2023-01-01 11:00:00")
	)


	val acao = Category(
		name = "Ação",
		last_update = LocalDateTime.now()
	)

	val aventura = Category(
		name = "Aventura",
		last_update = LocalDateTime.now()
	)

	val romance = Category(
		name = "Romance",
		last_update = LocalDateTime.now()
	)

	val drama = Category(
		name = "Drama",
		last_update = LocalDateTime.now()
	)

	val terror = Category(
		name = "Terror",
		last_update = LocalDateTime.now()
	)


	//Lista Mutavel
//	val listaCategoria = mutableListOf(
//		Category(name = "Ação" , last_update = LocalDateTime.now()),
//		Category(name = "Aventura" , last_update = LocalDateTime.now()),
//		Category(name = "Drama" , last_update = LocalDateTime.now()),
//		Category(name = "Terror" , last_update = LocalDateTime.now()),
//		Category(name = "Suspense" , last_update = LocalDateTime.now()),
//	)

	try {
		val countryServices = CountryServices()
		countryServices.validaPais(brasil)
		countryServices.validaPais(argentina)
		x = 5
		val r = i / x
		println("O Resultado da divisao e $r")

	} catch (ex: ArithmeticException) {
		erros = erros + 1
		println(ex)
	} catch (ex: Exception) {
		erros = erros + 1
		println(ex)
	}
	if (erros <= 0) {
		println("Sucesso!!")
	}


//	runCatching {
//		val countryServices = CountryServices()
//
//		countryServices.validaPais(brasil)
//		countryServices.validaPais(argentina)
//		x = 5
//		val r = i/x
//		println("O Resultado da divisao e $r")
//
//	}.onFailure {
//		println(it)
//	}.onSuccess {
//		println("Sucesso")
//	}


	println(brasil)
	println(argentina)
	println("**")
	println("----------------------------------------------------------")
	println("**")
	println(saoPaulo)
}

