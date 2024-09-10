package com.example.kotlinmentoria

fun main(){

    val nomes = arrayOf(
        "jana", "bob", "ezequiel"
    )

    //alterando valor do array
    //nomes[1] = "bobnelson"
    //println(nomes[1])

    //percorrendo array com for
//    for(nome in nomes){
//        println(nome)
//    }

    for((indice, nome) in nomes.withIndex()){
        println("$indice: $nome")
    }

    //percorrendo array com forEach
    nomes.forEach { nome ->
        println("nome:  $nome")
    }



}