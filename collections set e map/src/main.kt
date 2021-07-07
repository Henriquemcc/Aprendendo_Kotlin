fun main() {
    testarMetodoAssociate()
    testarMetodoAssociateByComONumeroDoPedido()
    testarMetodoAssociateWith()
    testarMetodoAssociateByComOValorBooleanoIndicandoSeTemFreteGratis()
    testarMetodoGroupBy()
    testarMetodoGroupByAgenda()
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

private fun testarMetodoAssociateByComONumeroDoPedido() {

    println("Testando o método associateBy com o número do pedido")
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

private fun testarMetodoAssociateByComOValorBooleanoIndicandoSeTemFreteGratis() {

    println("Testando o método associateBy com o valor booleano indicando se tem frete grátis")
    println()

    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0)
    )
    println("Pedidos: $pedidos")
    println()

    val pedidosComFreteGratis = pedidos.associateBy { pedido ->
        pedido.valor > 50.0
    }
    println("Pedidos com frete grátis: $pedidosComFreteGratis")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarMetodoGroupBy() {

    println("Testando o método groupBy")
    println()

    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0)
    )
    println("Pedidos: $pedidos")
    println()

    val pedidosFreteGratisAgrupados = pedidos.groupBy { pedido ->
        pedido.valor > 50.0
    }
    println("Pedidos agrupados de acordo com a gratuidade do frete: $pedidosFreteGratisAgrupados")
    println()

    println("Todos os pedidos cujo frete é gratuito: ${pedidosFreteGratisAgrupados[true]}")
    println()

    println("Todos os pedidos cujo frete não é gratuito: ${pedidosFreteGratisAgrupados[false]}")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarMetodoGroupByAgenda() {

    println("Testando o método groupBy em uma agenda")
    println()

    val nomes = listOf(
        "Alex",
        "Fran",
        "Gui",
        "Ana",
        "Paulo",
        "Maria",
        "Mario",
        "Gisele"
    )
    println("Nomes: $nomes")
    println()

    val agenda = nomes.groupBy { nome ->
        nome.first()
    }
    println("Agenda: $agenda")
    println()

    println("Nomes da agenda que começam com 'A': ${agenda['A']}")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}