package com.example.kotlinmentoria

//iniciando com valor, com nulo, late init
class Produto{
    lateinit var descricao: String
}


fun main(){
     val produto = Produto()
    produto.descricao = "Notebook Acer Nitro"
    println(produto.descricao)
}