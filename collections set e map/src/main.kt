/**
 * Testa o comportamento do método distinct de uma lista.
 */
private fun testarDistinct() {
    println("Testando o método distinct de uma lista")
    println()

    val assistiramCursoAndroid = listOf("Alex", "Fran", "Gui", "Maria")
    println("Assistiram o curso de Android: $assistiramCursoAndroid")
    println()

    val assistiramCursoKotlin = listOf("Alex", "Paulo", "Maria")
    println("Assistiram o curso de Kotlin: $assistiramCursoKotlin")
    println()

    val assistiramPeloMenosUmDosCursos = assistiramCursoKotlin + assistiramCursoAndroid
    println("Assistiram pelo menos um dos cursos: $assistiramPeloMenosUmDosCursos")
    println()

    println("Assistiram pelo menos um dos cursos (com distinct): ${assistiramPeloMenosUmDosCursos.distinct()}")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

/**
 * Testa o comportamento do operador de soma de list com set.
 */
private fun testarOperadorSomaListComSet() {
    println("Testando o operador de soma de list com set")
    println()

    val assistiramCursoAndroid = setOf("Alex", "Fran", "Gui", "Maria")
    println("Assistiram o curso de Android: $assistiramCursoAndroid")
    println()

    val assistiramCursoKotlin = listOf("Alex", "Paulo", "Maria")
    println("Assistiram o curso de Kotlin: $assistiramCursoKotlin")
    println()

    val assistiramPeloMenosUmDosCursos = assistiramCursoKotlin + assistiramCursoAndroid
    println("Assistiram pelo menos um dos cursos: $assistiramPeloMenosUmDosCursos")
    println()

    println("Assistiram pelo menos um dos cursos (com distinct): ${assistiramPeloMenosUmDosCursos.distinct()}")
    println()

    println("Assistiram ambos posição 0: ${assistiramPeloMenosUmDosCursos[0]}")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

/**
 * Testa o comportamento do operador de soma de set com list.
 */
private fun testarOperadorSomaSetComList() {
    println("Testando o operador de soma de list com set")
    println()

    val assistiramCursoAndroid = listOf("Alex", "Fran", "Gui", "Maria")
    println("Assistiram o curso de Android: $assistiramCursoAndroid")
    println()

    val assistiramCursoKotlin = setOf("Alex", "Paulo", "Maria")
    println("Assistiram o curso de Kotlin: $assistiramCursoKotlin")
    println()

    val assistiramPeloMenosUmDosCursos = assistiramCursoKotlin + assistiramCursoAndroid
    println("Assistiram pelo menos um dos cursos: $assistiramPeloMenosUmDosCursos")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

/**
 * Testa o comportamento do operador de soma de set com list.
 */
private fun testarOperadorSomaSet() {
    println("Testando o operador de soma de set")
    println()

    val assistiramCursoAndroid = setOf("Alex", "Fran", "Gui", "Maria")
    println("Assistiram o curso de Android: $assistiramCursoAndroid")
    println()

    val assistiramCursoKotlin = setOf("Alex", "Paulo", "Maria")
    println("Assistiram o curso de Kotlin: $assistiramCursoKotlin")
    println()

    val assistiramPeloMenosUmDosCursos = assistiramCursoKotlin + assistiramCursoAndroid
    println("Assistiram pelo menos um dos cursos: $assistiramPeloMenosUmDosCursos")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

/**
 * Testa o comportamento do operador de soma de list com set.
 */
private fun testarOperadorSomaMutableSet() {
    println("Testando o operador de soma de mutable set")
    println()

    val assistiramCursoAndroid = mutableSetOf("Alex", "Fran", "Gui", "Maria")
    println("Assistiram o curso de Android: $assistiramCursoAndroid")
    println()

    val assistiramCursoKotlin = mutableSetOf("Alex", "Paulo", "Maria")
    println("Assistiram o curso de Kotlin: $assistiramCursoKotlin")
    println()

    val assistiramPeloMenosUmDosCursos = mutableSetOf<String>()
    assistiramPeloMenosUmDosCursos.addAll(assistiramCursoAndroid)
    assistiramPeloMenosUmDosCursos.addAll(assistiramCursoKotlin)
    assistiramPeloMenosUmDosCursos.add("Ana")
    assistiramPeloMenosUmDosCursos.add("Ana")
    println("Assistiram pelo menos um dos cursos: $assistiramPeloMenosUmDosCursos")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

/**
 * Testa o comportamento do operador union do set.
 */
private fun testarOperadorUnionSet() {
    println("Testando o operador union de set")
    println()

    val assistiramCursoAndroid = setOf("Alex", "Fran", "Gui", "Maria")
    println("Assistiram o curso de Android: $assistiramCursoAndroid")
    println()

    val assistiramCursoKotlin = setOf("Alex", "Paulo", "Maria")
    println("Assistiram o curso de Kotlin: $assistiramCursoKotlin")
    println()

    val assistiramPeloMenosUmDosCursosSoma = assistiramCursoKotlin + assistiramCursoAndroid
    println("Assistiram pelo menos um dos cursos (soma): $assistiramPeloMenosUmDosCursosSoma")
    println()

    val assistiramPeloMenosUmDosCursosUnion = assistiramCursoKotlin union assistiramCursoAndroid
    println("Assistiram pelo menos um dos cursos (union): $assistiramPeloMenosUmDosCursosUnion")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

/**
 * Testa o comportamento do operador de subtração do set.
 */
private fun testarOperadorSubtracaoSet() {
    println("Testando o operador subtração de set")
    println()

    val assistiramCursoAndroid = setOf("Alex", "Fran", "Gui", "Maria")
    println("Assistiram o curso de Android: $assistiramCursoAndroid")
    println()

    val assistiramCursoKotlin = setOf("Alex", "Paulo", "Maria")
    println("Assistiram o curso de Kotlin: $assistiramCursoKotlin")
    println()

    val subtracaoAssistiramCursoAndroidMenosKotlin = assistiramCursoAndroid - assistiramCursoKotlin
    println("Assistiram o curso de Android - Assistiram o curso de Kotlin: $subtracaoAssistiramCursoAndroidMenosKotlin")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

/**
 * Testa o comportamento do operador intersect do set.
 */
private fun testarOperadorIntersectSet() {
    println("Testando o operador intersect de set")
    println()

    val assistiramCursoAndroid = setOf("Alex", "Fran", "Gui", "Maria")
    println("Assistiram o curso de Android: $assistiramCursoAndroid")
    println()

    val assistiramCursoKotlin = setOf("Alex", "Paulo", "Maria")
    println("Assistiram o curso de Kotlin: $assistiramCursoKotlin")
    println()

    val assistiramCursosKotlinEAndroid = assistiramCursoKotlin intersect assistiramCursoAndroid
    println("Assistiram curso de kotlin e curso de Android: $assistiramCursosKotlinEAndroid")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

/**
 * Testa a conversão de set para list.
 */
private fun testarConversaoSetParaList() {
    println("Testando a conversão de set para list")
    println()

    val assistiramCursosSet = setOf("Alex", "Fran", "Gui", "Maria", "Paulo")
    println("Assistiram cursos (set): $assistiramCursosSet")
    println()

    val assistiramCursosMutableList = assistiramCursosSet.toMutableList()
    println("Assistiram cursos (mutable list): $assistiramCursosMutableList")
    println()

    assistiramCursosMutableList.add("Ana")
    println("Assistiram cursos (mutable list) + 'Ana': $assistiramCursosMutableList")
    println()

    assistiramCursosMutableList.add("Ana")
    println("Assistiram cursos (mutable list) + 'Ana' + 'Ana': $assistiramCursosMutableList")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

/**
 * Testa a conversão de list para set.
 */
private fun testarConversaoListParaSet() {
    println("Testando a conversão de set para list")
    println()

    val assistiramCursosSet = listOf("Alex", "Fran", "Gui", "Maria", "Paulo")
    println("Assistiram cursos (list): $assistiramCursosSet")
    println()

    val assistiramCursosMutableList = assistiramCursosSet.toMutableSet()
    println("Assistiram cursos (mutable set): $assistiramCursosMutableList")
    println()

    assistiramCursosMutableList.add("Ana")
    println("Assistiram cursos (mutable set) + 'Ana': $assistiramCursosMutableList")
    println()

    assistiramCursosMutableList.add("Ana")
    println("Assistiram cursos (mutable set) + 'Ana' + 'Ana': $assistiramCursosMutableList")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

fun main() {

    testarDistinct()
    testarOperadorSomaListComSet()
    testarOperadorSomaSetComList()
    testarOperadorSomaSet()
    testarOperadorSomaMutableSet()
    testarOperadorUnionSet()
    testarOperadorSubtracaoSet()
    testarOperadorIntersectSet()
    testarConversaoSetParaList()
    testarConversaoListParaSet()
}