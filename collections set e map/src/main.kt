fun main() {

    testarDistinct()
}

/**
 * Testa o comportamento do método distinct de uma lista.
 */
private fun testarDistinct() {
    println("Testando o método distinct de uma lista")

    val assistiramCursoAndroid = listOf("Alex", "Fran", "Gui", "Maria")
    println("Assistiram o curso de Android: $assistiramCursoAndroid")
    println()

    val assistiramCursoKotlin = listOf("Alex", "Paulo", "Maria")
    println("Assistiram o curso de Kotlin: $assistiramCursoKotlin")
    println()

    val assistiramAmbos = assistiramCursoKotlin + assistiramCursoAndroid
    println("Assistiram ambos os cursos: $assistiramAmbos")
    println()
    println("Assistiram ambos os cursos (com distinct): ${assistiramAmbos.distinct()}")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}