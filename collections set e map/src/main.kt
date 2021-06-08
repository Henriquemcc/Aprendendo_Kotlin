fun main() {
    testarMetodoAssociate()
    testarMetodoAssociateBy()
    testarMetodoAssociateWith()
}

private data class Pedido(val numero: Int, val valor: Double)

private fun testarMetodoAssociate() {

    println("Testando o método associate")
    println()

    val pedidos = listOf(
            Pedido(1, 20.0),
            Pedido(2, 60.0),
            Pedido(3, 30.0),
            Pedido(4, 70.0)
    )
    println("Pedidos: $pedidos")
    println()

    val pedidosMapeados = pedidos.associate { pedido ->
        Pair(pedido.numero, pedido)
    }
    println("Pedidos mapeados: $pedidosMapeados")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarMetodoAssociateBy() {

    println("Testando o método associateBy")
    println()

    val pedidos = listOf(
            Pedido(1, 20.0),
            Pedido(2, 60.0),
            Pedido(3, 30.0),
            Pedido(4, 70.0)
    )
    println("Pedidos: $pedidos")
    println()

    val pedidosMapeados = pedidos.associateBy { pedido ->
        pedido.numero
    }
    println("Pedidos mapeados: $pedidosMapeados")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarMetodoAssociateWith() {

    println("Testando o método associateWith")
    println()

    val pedidos = listOf(
            Pedido(1, 20.0),
            Pedido(2, 60.0),
            Pedido(3, 30.0),
            Pedido(4, 70.0)
    )
    println("Pedidos: $pedidos")
    println()

    val pedidosComFreteGratis = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }
    println("Pedidos com frete grátis: $pedidosComFreteGratis")
    println()

    var pedidoProcurado = Pedido(1, 20.0)
    var pedidoProcuradoEstaEmPedidosComFreteGratis = pedidosComFreteGratis[pedidoProcurado]
    println("$pedidoProcurado está em pedidos com frete gratis: $pedidoProcuradoEstaEmPedidosComFreteGratis")
    println()

    pedidoProcurado = Pedido(2, 60.0)
    pedidoProcuradoEstaEmPedidosComFreteGratis = pedidosComFreteGratis[pedidoProcurado]
    println("$pedidoProcurado está em pedidos com frete gratis: $pedidoProcuradoEstaEmPedidosComFreteGratis")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}