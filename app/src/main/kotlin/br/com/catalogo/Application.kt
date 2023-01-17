package br.com.catalogo

import br.com.catalogo.domain.City
import br.com.catalogo.domain.Country
import br.com.catalogo.services.CountryServices
import io.micronaut.runtime.Micronaut.run
import java.time.LocalDateTime

fun main(args: Array<String>) {
	run(*args)
	println("Hello World")

	val i: Int = 10
	var x: Int = 0

	//Exemplos
	val brasil = Country(
		name = "Brasil" ,
		lastUpdate = LocalDateTime.now(),
		mcc = 724
	)

	val argentina = Country(
		name = "Argentina",
		lastUpdate = LocalDateTime.now(),
		mcc = 722
	)

	runCatching {
		val countryServices = CountryServices()

		countryServices.validaPais(brasil)
		countryServices.validaPais(argentina)
		x = 5
		val r = i/x
		println("O Resultado da divisao e $r")

	}.onFailure {
		println(it)
	}.onSuccess {
		println("Sucesso")
	}


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

