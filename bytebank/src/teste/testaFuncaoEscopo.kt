package teste

import modelo.Endereco

fun main() {

    testarFuncoesDeEscopoParaGerarAStringEnderecoComLogradouroENumeroEmMaiusculo()
}

private fun testarFuncoesDeEscopoParaGerarAStringEnderecoComLogradouroENumeroEmMaiusculo() {

    println("Testando as funções de escopo para gerar a string de Endereço com o logradouro e o número em maiúsculo.")
    println()

    val endereco = Endereco("rua vergueiro", numero = 3185)

    println("Função let:")
    endereco.let {
        println("A função let retorna o resultado da função lambda, que neste caso é uma string com o logradouro e o número, tudo em maiúsculo.")
        "${it.logradouro}, ${it.numero}".toUpperCase()
    }.let(::println)
    println()

    println("Função apply:")
    endereco.apply {
        println("A função apply retorna o objeto de contexto receptor, que neste caso é o objeto Endereco. Por esse motivo a string com o logradouro e o número, tudo em maiúsculo, não será impressa.")
        "$logradouro, $numero".toUpperCase()
    }.let(::println)
    println()

    println("Função run:")
    endereco.run {
        println("A função run retorna o resultado da função lambda, que neste caso é uma string com o logradouro e o número, tudo em maiúsculo.")
        "$logradouro, $numero".toUpperCase()
    }.let { stringEnderecoEmMaiusculo: String ->
        println(stringEnderecoEmMaiusculo)
    }
    println()

    println("Função with:")
    with(endereco) {
        println("A função with retorna o resultado da função lambda, que neste caso é uma string com o logradouro e o número, tudo em maiúsculo.")
        "$logradouro, $numero".toUpperCase()
    }.let { stringEnderecoEmMaiusculo: String ->
        println(stringEnderecoEmMaiusculo)
    }
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}