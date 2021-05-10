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

/**
 * Testa o comportamento do operador de soma de list com set.
 */
private fun testarOperadorSomaListComSet() {
    println("Testando o operador de soma de list com set")

    val assistiramCursoAndroid = setOf("Alex", "Fran", "Gui", "Maria")
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

    println("Assistiram ambos posição 0: ${assistiramAmbos[0]}")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

/**
 * Testa o comportamento do operador de soma de set com list.
 */
private fun testarOperadorSomaSetComList() {
    println("Testando o operador de soma de list com set")

    val assistiramCursoAndroid = listOf("Alex", "Fran", "Gui", "Maria")
    println("Assistiram o curso de Android: $assistiramCursoAndroid")
    println()

    val assistiramCursoKotlin = setOf("Alex", "Paulo", "Maria")
    println("Assistiram o curso de Kotlin: $assistiramCursoKotlin")
    println()

    val assistiramAmbos = assistiramCursoKotlin + assistiramCursoAndroid
    println("Assistiram ambos os cursos: $assistiramAmbos")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

/**
 * Testa o comportamento do operador de soma de set com list.
 */
private fun testarOperadorSomaSet() {
    println("Testando o operador de soma de set")

    val assistiramCursoAndroid = setOf("Alex", "Fran", "Gui", "Maria")
    println("Assistiram o curso de Android: $assistiramCursoAndroid")
    println()

    val assistiramCursoKotlin = setOf("Alex", "Paulo", "Maria")
    println("Assistiram o curso de Kotlin: $assistiramCursoKotlin")
    println()

    val assistiramAmbos = assistiramCursoKotlin + assistiramCursoAndroid
    println("Assistiram ambos os cursos: $assistiramAmbos")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

/**
 * Testa o comportamento do operador de soma de list com set.
 */
private fun testarOperadorSomaMutableSet() {
    println("Testando o operador de soma de mutable set")

    val assistiramCursoAndroid = mutableSetOf("Alex", "Fran", "Gui", "Maria")
    println("Assistiram o curso de Android: $assistiramCursoAndroid")
    println()

    val assistiramCursoKotlin = mutableSetOf("Alex", "Paulo", "Maria")
    println("Assistiram o curso de Kotlin: $assistiramCursoKotlin")
    println()

    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Ana")
    assistiramAmbos.add("Ana")
    println("Assistiram ambos os cursos: $assistiramAmbos")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

fun main() {

    testarDistinct()
    testarOperadorSomaListComSet()
    testarOperadorSomaSetComList()
    testarOperadorSomaSet()
    testarOperadorSomaMutableSet()
}