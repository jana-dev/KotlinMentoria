package com.example.kotlinmentoria

fun main(){


    val opcao = 2

    //intervalos dentro de um if
    if(opcao in 1..3){
        println("Opções selecionadas: 1,2 e 3")
    }else if(opcao in 4..6){
        println("Opções selecionadas: 4,5 e 6")
    }else{
        println("Nenhuma opção selecionada")
    }

    //ao invés do switch temos o when
    val menu = 3
    when(menu) {
        1 -> println("Menu 1")
        2 -> println("Menu 2")
        in 3..5 -> println("Menu 3")
        else -> println("Nenhum menu selecionado")
    }

}