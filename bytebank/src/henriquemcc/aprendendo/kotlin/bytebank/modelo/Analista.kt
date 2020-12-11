package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa um Analista, que é um subtipo de Funcionario.
 */
class Analista
/**
 * Cria uma nova instancia de Analista.
 * @param nome Nome do analista.
 * @param cpf Cpf do analista.
 * @param salario Salario do analista.
 * */
(nome: String, cpf: String, salario: Double, senha: String = "") : FuncionarioAdministrador(nome, cpf, salario, senha)
{

    /**
     * Calcula a bonificação do analista.
     * @return Valor da bonificação do analista.
     * */
    override val bonificacao: Double
        get() = this.salario * 0.2

    /**
     * Converte uma instância desta classe em uma String.
     * @return String contendo os dados da instância desta classe.
     */
    override fun toString(): String
    {
        return """Analista
            |(
            |bonificacao=$bonificacao
            |)
            |${super.toString()}""".trimMargin()
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

        other as Analista

        if (bonificacao != other.bonificacao) return false

        return true
    }

    /**
     * Obtém o hash code desta instância desta classe.
     * @return Número inteiro com o hash desta instância desta classe.
     */
    override fun hashCode(): Int
    {
        return bonificacao.hashCode()
    }


}