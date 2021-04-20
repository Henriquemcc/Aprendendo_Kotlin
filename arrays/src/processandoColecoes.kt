fun main() {
    val pedidos = longArrayOf(1300012, 1100013, 1200199, 1200222, 1100345, 1000012)
    println("Pedidos: ${pedidos.contentToString()}")

    val pedidosInferiores = pedidos.filter { it < 1200000 }.toLongArray()
    println("Pedidos inferiores a 1200000 ${pedidosInferiores.contentToString()}")
}