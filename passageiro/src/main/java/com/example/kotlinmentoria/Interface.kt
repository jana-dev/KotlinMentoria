package com.example.kotlinmentoria

//Uma interface pode ser implementada apenas as classs que desejam utilizar os métodos dela, e os métodos serão obrigatórios a serem implementados
interface Presidenciavel{
    fun candidatar()
}


abstract class Pessoa{
    fun comer() = println("Comendo")
    //colocar um método como abstract faria todas as subclasses serem obrigadas e utilizar ela
    abstract fun trabalhando()
}

class DesenvolvedorAndroid : Pessoa(){
    override fun trabalhando() {
        println("Trabalhando com Kotlin")
    }
}

//Classe que implementa a interface
class DesenvolvedorWeb: Pessoa(), Presidenciavel{
    override fun trabalhando() {
        println("Trabalhando com Javascript")
    }

    override fun candidatar() {
        println("Realizando o processo de candidatar a presidencia como um desenvolvedor web.")
    }
}
class Jornalista: Pessoa(){
    override fun trabalhando() {
        println("Esrevendo uma matéria nova")
    }
}

//Classe que implementa a interface
class FuncionarioPublico: Pessoa(), Presidenciavel{
    override fun trabalhando() {
        println("Trabalhando no escritório")
    }

    override fun candidatar() {
        println("Realizando o processo de candidatar a presidencia como um funcionario publico.")
    }
}

fun main(){
    val desenvolvedorAndroid = DesenvolvedorAndroid()
    desenvolvedorAndroid.comer()
    desenvolvedorAndroid.trabalhando()

    println("----------")

    val jornalista = Jornalista()
    jornalista.comer()
    jornalista.trabalhando()

    println("----------")

    val funcionarioPublico = FuncionarioPublico()
    funcionarioPublico.trabalhando()
    funcionarioPublico.candidatar()

    println("----------")

    val desenvolvedorWeb = DesenvolvedorWeb()
    desenvolvedorWeb.candidatar()
}