package teste

import modelo.Endereco

fun main() {

    testarFuncoesDeEscopoComObjetoDeContextoReceptor()
}

private fun testarFuncoesDeEscopoComObjetoDeContextoReceptor() {

    println("Testando as funções de escopo com objeto de contexto receptor")
    println()

    println("Função apply:")
    Endereco("rua vergueiro", numero = 3185).apply {
        "$logradouro, $numero".toUpperCase()
    }.let(::println)
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}