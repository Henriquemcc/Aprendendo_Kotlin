package teste

import modelo.Endereco

fun main() {
    testarFuncaoLetDeUmaInstanciaDaClasseEndereco()
    testaFuncaoLetDeUmaString()
    testarFuncaoLetDeUmNumeroInteiro()
    testarCriacaoDeHighOrderFunction()
    testarCriacaoDeHighOrderFunctionPassandoUmaFuncaoComoParametro()
    testarCriacaoDeHighOrderFunctionComParametroAdicional()
    testarCriacaoDeHighOrderFunctionComParametroAdicionalPassandoUmaFuncaoComoParametro()
}

private fun testarFuncaoLetDeUmaInstanciaDaClasseEndereco() {

    println("Testando a função let de uma instância da classe Endereco")
    println()

    val endereco = Endereco()
    println("endereco:")
    println(endereco)
    println()

    println("Será executado a função let de endereco:")
    println(
            endereco.let {
                println("Executando a função let de endereco:")
                println(it)
            }
    )
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testaFuncaoLetDeUmaString() {

    println("Testando a função let de uma string")
    println()

    val str = "qwertyuiopasdfghjklçxcvbnm"
    println("str:")
    println(str)
    println()

    println("Será executado a função let de str:")
    println(
            str.let {
                println("Executando a função let de str:")
                println(it)
            }
    )
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarFuncaoLetDeUmNumeroInteiro() {

    println("Testando a função let de um número inteiro")
    println()

    val numeroInteiro = 1890
    println("numeroInteiro:")
    println(numeroInteiro)
    println()

    println("Será executado a função let de numeroInteiro:")
    println(
            numeroInteiro.let {
                println("Executando a função let de numeroInteiro:")
                println(it)
            }
    )
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarCriacaoDeHighOrderFunction() {

    println("Testando a criação de uma High Order Function")
    println()

    println("Será executada a highOrderFunction:")
    println(
            highOrderFunction {

            }
    )
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarCriacaoDeHighOrderFunctionPassandoUmaFuncaoComoParametro() {

    println("Testando a criação de uma High Order Function passando uma função como parâmetro")
    println()

    println("Será executada a highOrderFunction:")
    println(highOrderFunction(::teste))
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun highOrderFunction(bloco: () -> Unit) {

    println("Executando a highOrderFunction:")
    println("bloco: $bloco")
}

private fun teste() {}

private fun testarCriacaoDeHighOrderFunctionComParametroAdicional() {

    println("Testando a criação de uma High Order Function com parâmetro adicional")
    println()

    println("Será executada a highOrderFunctionComParametro0:")
    println(
            highOrderFunctionComParametro0(1476) {

            }
    )
    println()

    println("Será executada a highOrderFunctionComParametro1:")
    println(
            highOrderFunctionComParametro1({

            }, 4678)
    )
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarCriacaoDeHighOrderFunctionComParametroAdicionalPassandoUmaFuncaoComoParametro() {

    println("Testando a criação de uma High Order Function com parâmetro adicional e passando como parâmetro uma função")
    println()

    println("Será executada a highOrderFunctionComParametro0:")
    println(highOrderFunctionComParametro0(1476, ::teste))
    println()

    println("Será executada a highOrderFunctionComParametro1:")
    println(highOrderFunctionComParametro1(::teste, 4678))
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun highOrderFunctionComParametro0(numero: Int, bloco: () -> Unit) {

    println("Executando a highOrderFunctionComParametro0:")
    println("numero: $numero")
    println("bloco: $bloco")
}

private fun highOrderFunctionComParametro1(bloco: () -> Unit, numero: Int) {

    println("Executando a highOrderFunctionComParametro1:")
    println("numero: $numero")
    println("bloco: $bloco")
}