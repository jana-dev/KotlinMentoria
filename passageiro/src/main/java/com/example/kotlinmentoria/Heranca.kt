package com.example.kotlinmentoria

//Toda classe em Kotlin por padrão é final, ou seja nao conseguimos herdar, para resolver open antes da classe para poder herdar
//Nesse caso Animal é uma classe mais abstrada pois iremos instanciar geralmente os filhos como cão e passaro, por isso vamos alterar open por abstract
abstract class Animal{
    var cor = ""
    var tamanho = ""
    var peso = 0.0

    //Acontece o mesmo com métodos, eles por padrão são final, open para poder usar polimorfismo com sobreposição de método
    open fun correr() = print("Correndo como um ")

    //quando um método precisa ser utilizado obrigatóriamente para os filhos porem serão muito diferentes
    //podemos criar um método abstrato e em cada filho executar o dormir específico
    abstract fun dormir()
}

class Cao : Animal(){ //classe filha / concreta / irá instanciar
    fun latir() = println("Latindo")

    override fun correr(){
        super.correr() //executando o método genérico e adicionando um novo
        println("cão")
    }

    override fun dormir() {
        println("Dormindo na sua camiha quentinha no chão")
    }
}

class Passaro: Animal(){ //classe filha / concreta / irá instanciar
    fun voar() = println("Voando")

    override fun correr(){
        super.correr()
        println("pássaro")
    }

    override fun dormir() {
        println("Dormindo no topo de uma árvore em seu ninho")
    }
}


fun main(){
    val cao = Cao()
    cao.correr()
    cao.dormir()

    val passaro = Passaro()
    passaro.correr()
    passaro.dormir()

}