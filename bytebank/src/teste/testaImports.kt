package teste

import modelo.ContaCorrente
import java.lang.String as StringJava

/**
 * Executa este arquivo.
 */
fun main() {

    testarStringEmKotlinEJava()
    testarClassesDeMesmoNomeEmPacotesDiferentes()
}

/**
 * Serve para testar a classes ContaCorrentes de pacotes diferentes.
 */
private fun testarClassesDeMesmoNomeEmPacotesDiferentes() {
    val contaCorrenteDoJoao = ContaCorrente("Joãao", "0")
    val contaCorrenteDoJose = exemploKotlin.ContaCorrente("Josée", "1")

    println(contaCorrenteDoJoao)
    println(contaCorrenteDoJose)
}

/**
 * Serve para testar a classes String dos pacotes kotlin.String e java.lang.String.
 */
private fun testarStringEmKotlinEJava() {
    val stringKotlin: String = "String em Kotlin"
    val stringJava: java.lang.String = java.lang.String("String em Java")
    val stringJava2: StringJava = StringJava("String em Java")

    println(stringKotlin)
    println(stringJava)
    println(stringJava2)
}