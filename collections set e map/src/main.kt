fun main() {

    testarIndexingOperator()
    testarMetodoGetValue()
    testarMetodoGetOrElse()
    testarMetodoGetOrDefault()
    testarPropertiesKeysEValues()
    testarMetodosFilterValuesEFilterKeys()
}

private fun testarIndexingOperator() {

    println("Testando o indexing operator")
    println()

    val pedidos = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0,
        4 to null
    )
    println("Pedidos: $pedidos")
    println()

    val valorPedidosIndexingOperatorZero = pedidos[0]
    println("Pedidos [0]: $valorPedidosIndexingOperatorZero")
    println()

    val valorPedidosIndexingOperatorUm = pedidos[1]
    println("Pedidos [1]: $valorPedidosIndexingOperatorUm")
    println()

    val valorPedidosIndexingOperatorQuatro = pedidos[4]
    println("Pedidos [4]: $valorPedidosIndexingOperatorQuatro")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarMetodoGetValue() {

    println("Testando o método get value")
    println()

    val pedidos = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0,
        4 to null
    )
    println("Pedidos: $pedidos")
    println()

    print("Pedidos.getValue(0) = ")
    try {
        val valorPedidosGetZero = pedidos.getValue(0)
        println(valorPedidosGetZero)
    } catch (e: NoSuchElementException) {
        println(e.stackTraceToString())
    }
    println()

    print("Pedidos.getValue(1) = ")
    try {
        val valorPedidosGetUm = pedidos.getValue(1)
        println(valorPedidosGetUm)
    } catch (e: NoSuchElementException) {
        println(e.stackTraceToString())

    }
    println()

    print("Pedidos.getValue(4) = ")
    try {
        val valorPedidosGetQuatro = pedidos.getValue(4)
        println(valorPedidosGetQuatro)
    } catch (e: NoSuchElementException) {

        println(e.stackTraceToString())
    }
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarMetodoGetOrElse() {

    println("Testando o método getOrElse")
    println()

    val pedidos = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0,
        4 to null
    )
    println("Pedidos: $pedidos")
    println()

    val valorPedidoGetOrElseUm = pedidos.getOrElse(1) {
        "Não tem o pedido"
    }
    println("pedidos.getOrElse(1, ...) = $valorPedidoGetOrElseUm")
    println()

    val valorPedidoGetOrElseZero = pedidos.getOrElse(0) {
        "Não tem o pedido"
    }
    println("pedidos.getOrElse(0, ...) = $valorPedidoGetOrElseZero")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarMetodoGetOrDefault() {

    println("Testando o método getOrDefault")
    println()

    val pedidos = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0,
        4 to null
    )
    println("Pedidos: $pedidos")
    println()

    val valorPedidoGetOrDefaultZero = pedidos.getOrDefault(0, -1)
    println("pedidos.getOrDefault(0, -1) = $valorPedidoGetOrDefaultZero")
    println()

    val valorPedidoGetOrDefaultUm = pedidos.getOrDefault(1, -1)
    println("pedidos.getOrDefault(1, -1) = $valorPedidoGetOrDefaultUm")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarPropertiesKeysEValues() {

    println("Testando as properties Keys e Values")
    println()

    val pedidos = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0,
        4 to null
    )
    println("Pedidos: $pedidos")
    println()

    val chavesPedidos = pedidos.keys
    println("Chave dos pedidos $chavesPedidos")
    println()

    for (numeroDePedido in pedidos.keys) {
        println("Pedido $numeroDePedido")
    }
    println()

    val valoresPedidos = pedidos.values
    println("Valores dos pedidos $valoresPedidos")
    println()

    for (valorPedido in pedidos.values) {
        println("Valor do pedido: $valorPedido")
    }
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

fun testarMetodosFilterValuesEFilterKeys() {

    println("Testando os métodos filterValues e filterKeys")
    println()

    val pedidos = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0,
        4 to 100.0,
        5 to 150.0,
        6 to 80.0
    )
    println("Pedidos: $pedidos")
    println()

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }
    println("Pedidos filtrados: $pedidosFiltrados")
    println()

    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 70.0
    }
    println("Pedidos acima do valor de 70: $pedidosAcima")
    println()

    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }
    println("Pedidos pares: $pedidosPares")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}