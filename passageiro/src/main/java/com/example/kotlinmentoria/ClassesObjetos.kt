package com.example.kotlinmentoria

class Jogador {
    var kart = ""
    var pneu = ""
    var planador = ""

    fun acelerar( velocidade: Int = 0){
        println("Acelerando o carro em uma velocidade de $velocidade com: $kart, $pneu, $planador")
    }

    fun retornaPoder(): String{
        return "Jogar Banana"
    }
}

fun main(){
    val jogador = Jogador()
    jogador.kart = "Kart do Mario"
    jogador.pneu = "Pneu do Mario"
    jogador.planador = "Planador do Mario"
    jogador.acelerar(80)
    val executaPoder = jogador.retornaPoder()
    println(executaPoder)
}