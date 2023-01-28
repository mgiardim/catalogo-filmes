package br.com.catalogo

import br.com.catalogo.domain.Category
import br.com.catalogo.domain.City
import br.com.catalogo.domain.Country
import br.com.catalogo.services.CountryServices
import io.micronaut.runtime.Micronaut.run
import java.lang.ArithmeticException
import java.time.LocalDateTime

fun main(args: Array<String>) {
	run(*args)
	println("Hello World")

	val i: Int = 10
	var x: Int = 0
	var erros: Int = 0

	//Exemplos
	val brasil = Country(
		name = "Brasil",
		lastUpdate = LocalDateTime.now(),
		mcc = 724
	)

	val argentina = Country(
		name = "Argentina",
		lastUpdate = LocalDateTime.now(),
		mcc = 722
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


	val saoPaulo = City(
		name = "Sao Paulo",
		lastUpdate = LocalDateTime.now(),
		country = brasil
	)


	println(brasil)
	println(argentina)
	println("**")
	println("----------------------------------------------------------")
	println("**")
	println(saoPaulo)
}

