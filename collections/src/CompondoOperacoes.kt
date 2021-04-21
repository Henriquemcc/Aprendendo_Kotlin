fun main() {
    println("Compondo Operações")

    val notas = intArrayOf(7, 5, 8, 9)
    println("Notas: ${notas.contentToString()}")

    val media = notas.sorted().takeLast(notas.size - 1).average()
    println("Média: $media")
}