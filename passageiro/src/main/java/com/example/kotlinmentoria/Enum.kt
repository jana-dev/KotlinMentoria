package com.example.kotlinmentoria

enum class StatusPedido{
    PEDIDO_REALIZADO,
    PAGAMENTO_CONFIRMADO,
    ENVIADO_TRANSPORTADORA,
    PEDIDO_ENTREGUE
}

class Pedido(
    var total : Double = 0.0,
    var itens : String = "",
    var statusPedido: StatusPedido = StatusPedido.PEDIDO_REALIZADO
){

}

fun main(){

    //Tela de compras
    val pedido = Pedido(250.90, "5 body de manda curta")

    //Pagamento com cartão
    //pedido.statusPedido = StatusPedido.PAGAMENTO_CONFIRMADO

    //Enviado para transportadora
    //pedido.statusPedido = StatusPedido.ENVIADO_TRANSPORTADORA

    //Cliente recebeu pedido
    pedido.statusPedido = StatusPedido.PEDIDO_ENTREGUE

    //Historico de compras
    if(pedido.statusPedido == StatusPedido.PEDIDO_REALIZADO){
        println("Seu pedido foi realizado com sucesso")
    }else if(pedido.statusPedido == StatusPedido.PAGAMENTO_CONFIRMADO){
        println("Seu pedido foi aprovado pela operadora de cartão!")
    }else if(pedido.statusPedido == StatusPedido.ENVIADO_TRANSPORTADORA){
        println("Seu pedido foi enviado para a transportadora!")
    }else{
        println("Seu pedido foi entregue com sucesso")
    }
}