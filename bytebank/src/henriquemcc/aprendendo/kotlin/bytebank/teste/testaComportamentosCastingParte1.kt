package henriquemcc.aprendendo.kotlin.bytebank.teste

import henriquemcc.aprendendo.kotlin.bytebank.modelo.Funcionario

/**
 * Serve para calcular o total gasto com a bonificação de todos Funcionário, Analista, Gerente, Diretor.
 */
private class CalculadoraBonificacaoParte1
{

    /**
     *
     *///Valor total gasto com a bonificação de todos os funcionarios
    var total: Double = 0.0
        private set


    fun registra(funcionario: Any)
    {
        funcionario as Funcionario
        this.total += funcionario.bonificacao
    }
}

fun testaComportamentosCastingParte1()
{
    val calculadora = CalculadoraBonificacaoParte1()
    calculadora.registra(maria)
    calculadora.registra(antonio)
    calculadora.registra(carlos)
    println(calculadora.total)

    //Provocando uma exceção
    println("Provocando uma exceção de conversão de tipos:")
    calculadora.registra(contaPoupancaDoFulano)
}

fun main()
{
    testaComportamentosCastingParte1()
}