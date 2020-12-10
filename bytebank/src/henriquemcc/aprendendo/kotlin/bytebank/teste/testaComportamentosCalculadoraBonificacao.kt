package henriquemcc.aprendendo.kotlin.bytebank.teste

import henriquemcc.aprendendo.kotlin.bytebank.modelo.CalculadoraBonificacao

/**
 * Testa comportamentos da CalculadoraBonificação.
 */
fun testaComportamentosCalculadoraBonificacao()
{
    val calculadoraBonificacao = CalculadoraBonificacao()
    calculadoraBonificacao.registra(joao)
    calculadoraBonificacao.registra(jose)
    calculadoraBonificacao.registra(maria)
    calculadoraBonificacao.registra(ana)
    calculadoraBonificacao.registra(antonio)
    calculadoraBonificacao.registra(francisca)
    calculadoraBonificacao.registra(carlos)
    calculadoraBonificacao.registra(rodrigo)
    calculadoraBonificacao.registra(mariana)
    calculadoraBonificacao.registra(raimundo)
    calculadoraBonificacao.registra(vanessa)
    calculadoraBonificacao.registra(felipe)
    calculadoraBonificacao.registra(luciana)
    calculadoraBonificacao.registra(eduardo)
    calculadoraBonificacao.registra(julia)

    println("Valor total gasto com a bonificação dos funcionários: ${calculadoraBonificacao.total}")
}

/**
 * Executa este arquivo.
 */
fun main()
{

    testaComportamentosCalculadoraBonificacao()
}
