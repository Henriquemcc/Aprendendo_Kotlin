fun main() {
    val pedidos = mapOf(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)
    println("Pedidos: $pedidos")
    println()

    val pedido = pedidos[1]
    pedido?.let {
        println("Pedido 1: $pedido")
        println()
    }

    for(pedido in pedidos) {
        println("Número do pedido: ${pedido.key}")
        println("Valor do pedido: ${pedido.value}")
        println()
    }
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}