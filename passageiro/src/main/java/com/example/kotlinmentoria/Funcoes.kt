package com.example.kotlinmentoria

fun somar(): Int{
    //println(2 + 5)
    return 2 + 5
}

//Inline Function
fun subtrair() = println(5 - 5)

//Inline Function com retorno
fun multi():Int = 5 * 5

fun main(){
    val retorno = somar()
    println(retorno)

    subtrair()

    val resultado = multi()
    println(resultado)
}