package henriquemcc.aprendendo.kotlin.bytebank.teste

import henriquemcc.aprendendo.kotlin.bytebank.modelo.Funcionario

/**
 * Serve para calcular o total gasto com a bonificação de todos Funcionário, Analista, Gerente, Diretor.
 */
private class CalculadoraBonificacaoParte2
{

    /**
     *
     *///Valor total gasto com a bonificação de todos os funcionarios
    var total: Double = 0.0
        private set


    fun registra(funcionario: Any)
    {
        if (funcionario is Funcionario)
        {
            this.total += funcionario.bonificacao
        }
        else
        {
            println("Este objeto não é um Funcionário")
        }
    }
}

fun testaComportamentosCastingParte2()
{
    val calculadora = CalculadoraBonificacaoParte2()
    calculadora.registra(maria)
    calculadora.registra(antonio)
    calculadora.registra(carlos)
    println(calculadora.total)

    //Provocando uma exceção
    println("Provocando uma exceção de conversão de tipos, que não vai ocorrer por causa do if:")
    calculadora.registra(contaPoupancaDoFulano)
}

fun main()
{
    testaComportamentosCastingParte2()
}