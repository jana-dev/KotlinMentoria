package com.example.kotlinmentoria

//num3: Int = 0 é padrão, isso não torna ele obrigatório de passar um argumento
fun fazerSoma(num1: Int, num2: Int, num3: Int = 0){
    println(num1 + num2)
}

fun main(){
    fazerSoma(5,5)
    fazerSoma(20,50, 1)

    //parametros nomeados, pode ser na ordem diferente
    fazerSoma(num2 = 1, num1 = 2)
}