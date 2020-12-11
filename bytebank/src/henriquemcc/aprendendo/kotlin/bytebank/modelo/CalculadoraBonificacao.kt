package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Serve para calcular o total gasto com a bonificação de todos Funcionário, Analista, Gerente, Diretor.
 */
class CalculadoraBonificacao
{

    /**
     *
     *///Valor total gasto com a bonificação de todos os funcionarios
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

    /**
     * Compara duas instâncias desta classe par ver se são iguais.
     * @param other Outra instância desta classe a ser comparada.
     * @return Valor booleano indicando se as instâncias são iguais.
     */
    override fun equals(other: Any?): Boolean
    {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CalculadoraBonificacao

        if (total != other.total) return false

        return true
    }

    /**
     * Obtém o hash code desta instância desta classe.
     * @return Número inteiro com o hash desta instância desta classe.
     */
    override fun hashCode(): Int
    {
        return total.hashCode()
    }


}