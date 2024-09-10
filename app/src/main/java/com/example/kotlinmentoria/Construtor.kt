package com.example.kotlinmentoria

//Construtor primário
class Usuario (nomeP: String, sobrenomeP: String) {
    var nome: String = ""
    var sobrenome: String = ""

    init { //inicializar, o init é executado logo após o construtor receber os valores dos parametros
        println("Objeto inicializado")
        this.nome = nomeP
        this.sobrenome = sobrenomeP
        println("Nome: $nome $sobrenome")
    }

    //Construtor secundário, se tem um primário ele precisa ser chamado, quem chama é o this()
    constructor(nome: String): this(nome, ""){
        println("Construtor secundário")
    }
}

fun main(){
    val usuario = Usuario("Janaina", "Tavares")
    val usuario2 = Usuario("Bob")
//    usuario.nome = "Janaina"
//    println(usuario.nome)
}