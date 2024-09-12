package com.example.kotlinmentoria

//Toda classe em Kotlin por padrão é final, ou seja nao conseguimos herdar, para resolver open antes da classe para poder herdar
open class Animal{
    var cor = ""
    var tamanho = ""
    var peso = 0.0

    //Acontece o mesmo com métodos, eles por padrão são final, open para poder usar polimorfismo com sobreposição de método
    open fun correr() = print("Correndo como um ")

    fun dormir() = println("Dormindo")
}

class Cao : Animal(){
    fun latir() = println("Latindo")

    override fun correr(){
        super.correr() //executando o método genérico e adicionando um novo
        println("cão")
    }
}

class Passaro: Animal(){
    fun voar() = println("Voando")

    override fun correr(){
        super.correr()
        println("pássaro")
    }
}


fun main(){
    val cao = Cao()
    cao.correr()

    val passaro = Passaro()
    passaro.correr()

}