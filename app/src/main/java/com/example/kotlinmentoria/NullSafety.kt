package com.example.kotlinmentoria

class Carro{
    var cor = "Vermelho"

    fun acelerar(){
        println("Acelerando o carro")
    }
}



fun main(){

    var carro: Carro? = null
    //carro = Carro()

    //trabalhando com valor padrão caso esteja nulo (elvis operator)
    val cor = carro?.cor ?: "cor padrão"

    //aqui o ? (chamada segura) valida se o carro é nulo, se for ele exibe nulo no console mas nao irá travar o app
    //println(carro?.cor)
    println(cor)

}