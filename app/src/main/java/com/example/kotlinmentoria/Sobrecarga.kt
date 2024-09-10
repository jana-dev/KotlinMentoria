package com.example.kotlinmentoria

class Usuario {

    //Propriedades

    //Métodos
    fun logar(email: String, senha: String){
        println("Logando com email: $email e senha: $senha")
    }

    //Sobrecarga de métodos: assinatura nome + parametros e seus tipos
    fun logar(numeroTelefone: String){
        println("Logando com o número de telefone: $numeroTelefone")
    }
}

fun main(){
    val usuario = Usuario()
    //usuario.logar("teste@email.com", "1234")
    usuario.logar("465684654") //ele executa o método sobrecarregador, de acordo com o parametro passado
}