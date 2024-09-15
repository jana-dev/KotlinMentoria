package com.example.recursos

class Usuario {

    //internal é visivel apenas dentro do módulo, para acessar em outros módulos deixar como public
    internal var nome = ""

    internal fun calcularPrecoCorrida(){
        println("Preço calculado")
    }
}