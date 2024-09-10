package com.example.kotlinmentoria

//também é constante porém a nível global, somente val utilizar a nível local, tempo de compilação
const val PI = 3.14


fun main(){
    //var é mutável
//    var nome = "Janaina"
//    nome = "Bob"

    //val é imutável, tempo de execução
    val nome = "Janaina"
    println(nome)

    //segura comand e deixa o mouse em cima do nome da variável ele mostra o tipo dela
    val idade = 30

    val rica = true

    //É aconselhado sempre tentar usar val, só quando precisar mesmo utilizar var

    //com o control segurado e clica em cima da classe "String" é possível abrir para ver o código dela
    val curso: String = "Coder Kids"

}