package teste

import modelo.Autenticavel
import modelo.Endereco
import modelo.SistemaInterno

fun main() {
    testarFuncaoLetDeUmaInstanciaDaClasseEndereco()
    testaFuncaoLetDeUmaString()
    testarFuncaoLetDeUmNumeroInteiro()
    testarCriacaoDeHigherOrderFunction()
    testarCriacaoDeHigherOrderFunctionPassandoUmaFuncaoComoParametro()
    testarCriacaoDeHigherOrderFunctionComParametroAdicional()
    testarCriacaoDeHigherOrderFunctionComParametroAdicionalPassandoUmaFuncaoComoParametro()
    testarImplementacaoDeCodigodSemAFuncaoLet()
    testarImplementacaoDeCodigodComAFuncaoLet()
    testarImplementacaoDaHigherOrderFunctionSoma()
    testarImplementacaoDeHigherOrderFunctionNoBytebank()

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

private fun testarCriacaoDeHigherOrderFunction() {

    println("Testando a criação de uma Higher Order Function")
    println()

    println("Será executada a higherOrderFunction:")
    println(
        higherOrderFunction {

        }
    )
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarCriacaoDeHigherOrderFunctionPassandoUmaFuncaoComoParametro() {

    println("Testando a criação de uma Higher Order Function passando uma função como parâmetro")
    println()

    println("Será executada a higherOrderFunction:")
    println(higherOrderFunction(::teste))
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun higherOrderFunction(bloco: () -> Unit) {

    println("Executando a higherOrderFunction:")
    println("bloco: $bloco")
}

private fun teste() {}

private fun testarCriacaoDeHigherOrderFunctionComParametroAdicional() {

    println("Testando a criação de uma Higher Order Function com parâmetro adicional")
    println()

    println("Será executada a highOrderFunctionComParametro0:")
    println(
        higherOrderFunctionComParametro0(1476) {

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

private fun testarCriacaoDeHigherOrderFunctionComParametroAdicionalPassandoUmaFuncaoComoParametro() {

    println("Testando a criação de uma Higher Order Function com parâmetro adicional e passando como parâmetro uma função")
    println()

    println("Será executada a highOrderFunctionComParametro0:")
    println(higherOrderFunctionComParametro0(1476, ::teste))
    println()

    println("Será executada a highOrderFunctionComParametro1:")
    println(highOrderFunctionComParametro1(::teste, 4678))
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun higherOrderFunctionComParametro0(numero: Int, bloco: () -> Unit) {

    println("Executando a higherOrderFunctionComParametro0:")
    println("numero: $numero")
    println("bloco: $bloco")
}

private fun highOrderFunctionComParametro1(bloco: () -> Unit, numero: Int) {

    println("Executando a highOrderFunctionComParametro1:")
    println("numero: $numero")
    println("bloco: $bloco")
}

private fun testarImplementacaoDeCodigodSemAFuncaoLet() {

    println("Testando a implementação de códigos sem a função let")
    println()

    val endereco = Endereco("rua vergueiro", numero = 3185)
    val stringEnderecoEmMaiusculo = "${endereco.logradouro} - ${endereco.numero}".toUpperCase()

    println("Endereço:")
    println(stringEnderecoEmMaiusculo)
    println()

    val listaEnderecos = listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    )

    val listaEnderecosComComplemento = listaEnderecos.filter { endereco1 ->
        endereco1.complemento.isNotBlank()
    }

    println("Lista de endereços com complemento:")
    println(listaEnderecosComComplemento)
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarImplementacaoDeCodigodComAFuncaoLet() {

    println("Testando a implementação de códigos com a função let")
    println()

    println("Endereço:")
    Endereco("rua vergueiro", numero = 3185).let { endereco ->
        "${endereco.logradouro} - ${endereco.numero}".toUpperCase()
    }.let(::println)
    println()

    println("Lista de endereços com complemento:")
    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    ).filter { endereco ->
        endereco.complemento.isNotBlank()
    }.let(::println)
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarImplementacaoDaHigherOrderFunctionSoma() {

    println("Testando a implementação da higher order function soma")
    println()

    println("Resultado da soma:")
    soma(2784, 4589, ::println)
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun soma(a: Int, b: Int, oQueFazerComOResultado: (Int) -> Unit = {}) {

    println("Executando a função soma")

    val resultado = a + b

    println("Será executado a referência a função: oQueFazerComOResultado")
    oQueFazerComOResultado(resultado)
    println("Foi executado a referência a função: oQueFazerComOResultado")

    println("Terminando a execução da função soma")
}

private fun testarImplementacaoDeHigherOrderFunctionNoBytebank() {

    println("Testando a implementação de uma higher order function no Bytebank")
    println()

    val objetoAutenticavel = object : Autenticavel {

        val senha = "UKazGhdRfcnkcp74!7fJE83GrSPtwpQ76rW^UaBSVYM&Q^TgE@"

        override fun autentica(senha: String): Boolean {
            return senha == this.senha
        }
    }

    SistemaInterno().entra(objetoAutenticavel, "UKazGhdRfcnkcp74!7fJE83GrSPtwpQ76rW^UaBSVYM&Q^TgE@") {
        println("Realizar pagamento:")
    }
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}