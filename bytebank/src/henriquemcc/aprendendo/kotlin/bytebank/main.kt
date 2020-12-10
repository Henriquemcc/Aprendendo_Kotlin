package henriquemcc.aprendendo.kotlin.bytebank

import henriquemcc.aprendendo.kotlin.bytebank.teste.*

/**
 * É a primeira função a ser executada ao iniciar o programa.
 * */
fun main()
{
    println("---------------------------------------------------------------------------------------------------------")
    println("Testando comportamentos de funcionário")
    testaComportamentosFuncionarios()
    println("---------------------------------------------------------------------------------------------------------")
    println("Testando comportamentos de conta")
    testaComportamentosConta()
    println("---------------------------------------------------------------------------------------------------------")
    println("Testando comportamentos de calculadora de bonificação")
    testaComportamentosCalculadoraBonificacao()
    println("---------------------------------------------------------------------------------------------------------")
    println("Testando comportamentos de autenticação de funcionario")
    testarComportamentosAutenticacaoFuncionario()
    println("---------------------------------------------------------------------------------------------------------")
    println("---------------------------------------------------------------------------------------------------------")
    println("Testando comportamentos de autenticação de cliente")
    testarComportamentosAutenticacaoCliente()
    println("---------------------------------------------------------------------------------------------------------")
    println("---------------------------------------------------------------------------------------------------------")
    println("Testando comportamentos de object expressions")
    testaComportamentosObjectExpressions()
    println("---------------------------------------------------------------------------------------------------------")
    println("---------------------------------------------------------------------------------------------------------")
    println("Testando comportamentos de any")
    testaComportamentosAny()

}