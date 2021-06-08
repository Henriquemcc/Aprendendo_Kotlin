fun main() {

    testarIndexingOperator()
    testarMetodoGetValue()
    testarMetodoGetOrElse()
    testarMetodoGetOrDefault()
    testarPropertiesKeysEValues()
    testarMetodosFilterValuesEFilterKeys()
    testarSomaMutableMapComPair()
    testarSomaMutableMapComPairResultanteDoOperadorTo()
    testarSubtracaoMutableMapComOPrimeiroValorDoPair()
    testarSubtracaoMutableMapComUmaListaDosPrimeirosValores()
    testarMetodoPutAllDeSet()
    testarMetodoPutAllDeList()
    testarSobrescritaNoMetodoPutAllDeList()
    testarOperadorMaisIgual()
    testarRemocaoDeChavesEValores()
    testarOperadorMenosIgual()
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

private fun testarSomaMutableMapComPair() {

    println("Testando a some de um mutable map com um pair")
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

    val novoMapaPedidos = pedidos + Pair(7, 90.0)
    println("Novo mapa de pedidos: $novoMapaPedidos")
    println()

    println("Pedidos: $pedidos")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarSomaMutableMapComPairResultanteDoOperadorTo() {

    println("Testando a soma de um mutable map com um pair resultante do operador to")
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

    //val novoMapaPedidos = pedidos + 7 to 90 // não compila
    val novoMapaPedidos = pedidos + mapOf(7 to 90, 8 to 20)
    println("Novo mapa de pedidos: $novoMapaPedidos")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarSubtracaoMutableMapComOPrimeiroValorDoPair() {

    println("Testando a subtração de um mutable map com o primeiro valor do pair")
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

    val novoMapaPedidos = pedidos - 6
    println("Novo mapa de pedidos: $novoMapaPedidos")
    println()

    println("Pedidos: $pedidos")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarSubtracaoMutableMapComUmaListaDosPrimeirosValores() {

    println("Testando a subtração de um mutable map com uma lista dos primeiros valores do pair")
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

    val novoMapaPedidos = pedidos - listOf(6, 5)
    println("Novo mapa de pedidos: $novoMapaPedidos")
    println()

    println("Pedidos: $pedidos")
    println()

    println("---------------------------------------------------------------------------------------------------------------")

}

private fun testarMetodoPutAllDeSet() {

    println("Testando o método putAll passando um set")
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

    pedidos.putAll(setOf(7 to 90.0, 8 to 20.0))

    println("Pedidos após o putAll: $pedidos")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarMetodoPutAllDeList() {

    println("Testando o método putAll passando um list")
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

    pedidos.putAll(listOf(7 to 90.0, 8 to 20.0))

    println("Pedidos após o putAll: $pedidos")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarSobrescritaNoMetodoPutAllDeList() {

    println("Testando a sobrescrita no método putAll passando um list")
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

    pedidos.putAll(listOf(7 to 90.0, 8 to 20.0, 8 to 30.0))

    println("Pedidos após o putAll: $pedidos")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarOperadorMaisIgual() {

    println("Testando o operador +=")
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

    pedidos += listOf(7 to 90.0, 8 to 20.0, 8 to 30.0)

    println("Pedidos após o +=: $pedidos")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarRemocaoDeChavesEValores() {

    println("Testando a remoção de chaves")
    println()

    val pedidos = mutableMapOf(
            Pair(1, 20.0),
            Pair(2, 64.0),
            3 to 50.0,
            4 to 100.0,
            5 to 100.0,
            6 to 80.0
    )
    println("Pedidos: $pedidos")
    println()

    pedidos.keys.remove(1)

    println("Pedidos após remover a chave 1: $pedidos")
    println()

    pedidos.values.remove(50.0)

    println("Pedidos após remover o valor 50.0: $pedidos")
    println()

    pedidos.values.remove(100.0)

    println("Pedidos após remover o valor 100.0: $pedidos")
    println()

    println("---------------------------------------------------------------------------------------------------------------")

}

private fun testarOperadorMenosIgual() {

    println("Testando o operador -=")
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

    pedidos -= 6

    println("Pedidos após o -= 6: $pedidos")
    println()

    println("---------------------------------------------------------------------------------------------------------------")

}