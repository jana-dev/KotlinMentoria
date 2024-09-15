package com.example.kotlinmentoria

class ContaBancaria (
    agencia:String, conta:String, senha:String //construtor primário
){
    //Atributos/Propriedades
    var agencia: String = ""
    var conta: String = ""
    var senha: String = ""
    var usuarioAutenticado: Boolean = false
    var saldo: Double = 0.0

    //Configuração inicial
    init {
        this.agencia = agencia
        this.conta = conta
        this.senha = senha
        usuarioAutenticado = true
        println("Usuario autenticado? $usuarioAutenticado")
    }

    //Métodos
    fun recuperarSaldo():Double{
        return if(usuarioAutenticado){
            saldo
        }else{
            0.0
        }
    }

    fun depositar(valor:Double){
        saldo += valor
    }

    fun sacar(valor:Double){
        saldo -= valor
    }

    fun extrato(dias: Int){
        println("Extrato dos últimos $dias dias")
    }

    fun extrato(dataInicial: String, dataFinal:String){
        println("Extrato entre o intervalo de $dataInicial e $dataFinal")
    }
}

fun main(){
    val conta = ContaBancaria("0001", "123456", "1234")
    println(conta.recuperarSaldo())
    conta.depositar(200.0)
    conta.sacar(500.0)
    println(conta.recuperarSaldo())
    conta.extrato(5)
    conta.extrato("01/01/2023", "02/01/2023")
}