package com.example.motorista

import com.example.recursos.Motorista
import com.example.recursos.Usuario

fun main(){
//    val usuario = Usuario()
//    usuario.calcularPrecoCorrida()
    //como o nome está internal nao tem como acessar aqui por ser outro módulo
    //usuario.nome = "Janaina"

    //Usuario ficou como internal e está sendo utilizado no mesmo módulo pela Calsse Motorista
    //Classe motorista é publica entao conseguimos acessar aqui
    val motorista = Motorista()
    motorista.finalizarCorrida()
}