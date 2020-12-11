package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Serve para calcular o total gasto com a bonificação de todos Funcionário, Analista, Gerente, Diretor.
 */
class CalculadoraBonificacao
{

    //Valor total gasto com a bonificação de todos os funcionarios
    var total: Double = 0.0
        private set


    /**
     * Serve para somar a bonificação de todos os funcionarios
     * @param funcionario Instancia da classe Funcionario, Analista, Gerente ou Diretor.
     */
    fun registra(funcionario: Funcionario)
    {
        this.total += funcionario.bonificacao
    }

}