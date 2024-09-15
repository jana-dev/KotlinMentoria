package com.example.kotlinmentoria

class Bicicleta(
    var cor : String = "",
    var velocidade: Double = 0.0
){

    //Não precisa instanciar a classe para poder utilizar o atributo
    companion object{
        const val VELOCIDADE_MAXIMA = 80
        fun exibirVelocidadeMaxima(){
            println("Velocidade máxima:  $VELOCIDADE_MAXIMA")
        }
    }


    fun exibirInformacoes(){
        println("Informações:  $cor, $velocidade")
    }
}

fun main(){

    //Utilizando o atributo da classe
    //println("Velocidade máxima:  ${Bicicleta.VELOCIDADE_MAXIMA}")
    Bicicleta.exibirVelocidadeMaxima()


    //Instancia de classe / criando o objeto, como normalmente utilizamos
    val bicicleta = Bicicleta("Vermelha", 10.0)
    bicicleta.exibirInformacoes()

}