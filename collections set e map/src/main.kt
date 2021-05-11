fun main() {
    testarMap()
    testarMutableMap()
}

/**
 * Testa o comportamento do map.
 */
private fun testarMap() {
    println("Testando o Map")
    println()

    val pedidos = mapOf(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)
    println("Pedidos: $pedidos")
    println()

    val pedido = pedidos[1]
    pedido?.let {
        println("Pedido 1: $pedido")
        println()
    }

    for (pedido in pedidos) {
        println("Número do pedido: ${pedido.key}")
        println("Valor do pedido: ${pedido.value}")
        println()
    }
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

/**
 * Testa o comportamento do mutable map.
 */
private fun testarMutableMap() {
    println("Testando o Mutable Map")
    println()

    val pedidos = mutableMapOf(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)
    println("Pedidos: $pedidos")
    println()

    pedidos[4] = 70.00
    println("Pedidos: $pedidos")
    println()

    pedidos.put(5, 80.00)
    println("Pedidos: $pedidos")
    println()

    pedidos[1] = 100.00
    println("Pedidos: $pedidos")
    println()

    pedidos.putIfAbsent(6, 200.00)
    println("Pedidos: $pedidos")
    println()

    pedidos.putIfAbsent(6, 300.00)
    println("Pedidos: $pedidos")
    println()

    pedidos.remove(6)
    println("Pedidos: $pedidos")
    println()

    pedidos.remove(3, 100.00)
    println("Pedidos: $pedidos")
    println()

    pedidos.remove(3, 50.00)
    println("Pedidos: $pedidos")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}