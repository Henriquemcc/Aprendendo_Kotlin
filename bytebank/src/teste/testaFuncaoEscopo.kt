package teste

import modelo.Endereco

fun main() {

    testarRetornoFuncoesDeEscopoDeEndereco()
    testarOutrasFuncoesDeEscopo()

}

private fun testarRetornoFuncoesDeEscopoDeEndereco() {

    println("Testando o retorno de funções de escopo de uma instância de Endereço.")
    println()

    val endereco = Endereco("rua vergueiro", numero = 3185)
    println("Endereco: $endereco")
    println()

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

    println("Função also:")
    endereco.also {
        println("A função also retorna o objeto de contexto receptor, que neste caso é o objeto Endereco. Por esse motivo a string com o logradouro e o número, tudo em maiúsculo, não será impressa.")
        "${it.logradouro}, ${it.numero}".toUpperCase()
    }.let(::println)
    println()


    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarOutrasFuncoesDeEscopo() {

    println("Testando outras funções de escopo")
    println()

    println("Testando o run sem retorno:")
    val valorRunSemRetorno = run {
        println("Executando a função run sem extensão")
    }
    println("Valor do run sem retorno: $valorRunSemRetorno")
    println()

    println("Testando o run com retorno:")
    val valorRunComRetorno = run {
        println("Executando a função run sem extensão, retornando um valor")
        1
    }
    println("Valor do run com retorno: $valorRunComRetorno")
    println()

    println("Testando o also para imprimir o que está acontecendo no código:")
    Endereco().also {
        println("Criando uma nova instância de Endereco")
    }
    println()

    println("Testando o apply para inicializar o objeto de contexto e devolve-lo:")
    Endereco().apply {
        cidade = "São Paulo"
        estado = "São Paulo"
        logradouro = "rua vegueiro"
        numero = 0
    }.let { endereco: Endereco ->
        println(endereco)
    }
    println()

    println("Testando o with para computar e devolver algo utilizando os membros do objeto de contexto:")
    with(Endereco(cidade = "São Paulo", estado = "São Paulo", logradouro = "rua vegueiro", numero = 0)) {
        "$cidade - $estado".toUpperCase()
    }.let { stringEnderecoCidadeEstado: String ->
        println(stringEnderecoCidadeEstado)
    }
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}