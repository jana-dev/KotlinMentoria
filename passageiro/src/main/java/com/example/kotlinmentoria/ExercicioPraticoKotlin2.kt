package com.example.kotlinmentoria

interface Eletrico{
    fun motorEletrico()
}

enum class Status{
    FUNCIONAMENTO, MANUTENCAO, QUEBRADO
}

abstract class Veiculo(
    var nome: String = "",
    var qtdRodas: String = "",
    var status: Status = Status.FUNCIONAMENTO
){
    abstract fun acelerar()
    abstract fun recuperarStatus()
}

class Carro(nome:String, qtdRodas: String): Veiculo(nome, qtdRodas){
    override fun acelerar() {
        println("Acelerar $nome com $qtdRodas rodas")
    }

    override fun recuperarStatus() {
        println("O status do veiculo é: $status")
    }

    fun acelerar(intensidade: Int){
        println("Acelerando $nome com intensidade $intensidade")
    }

    companion object{
        fun exibeMensagemVelocidadeMaximaLei(){
            println("Velocidade máxima permitida é 120km/h")
        }
    }

}

class Moto(nome: String, qtdRodas: String): Veiculo(nome, qtdRodas), Eletrico{
    override fun acelerar() {
        println("Acelerar $nome com $qtdRodas rodas")
    }

    override fun recuperarStatus() {
        println("O status do veiculo é: $status")
    }

    override fun motorEletrico() {
        println("Rodando com motor elétrico")
    }

    companion object{
        fun exibeMensagemVelocidadeMaximaLei(){
            println("Velocidade máxima permitida é 80km/h")
        }
    }

}

fun main(){

    val carro = Carro("Ferrari", "4")
    carro.acelerar(200)
    carro.recuperarStatus()
    Carro.exibeMensagemVelocidadeMaximaLei()

    val moto = Moto("Honda", "2")
    moto.acelerar()
    moto.status = Status.MANUTENCAO
    moto.recuperarStatus()
    Moto.exibeMensagemVelocidadeMaximaLei()
}