package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa um Auxiliar, que é um subtipo de Funcionario.
 */
class Auxiliar
/**
 * Cria uma nova instancia de Auxiliar.
 * @param nome Nome do auxiliar.
 * @param cpf CPF do auxiliar.
 * @param salario Salario do auxiliar.
 */
(nome: String, cpf: String, salario: Double, senha: String = "") : FuncionarioAdministrador(nome, cpf, salario, senha)
{

    override val bonificacao: Double
        get() = 0.0

    /**
     * Converte uma instância desta classe em uma String.
     * @return String contendo os dados da instância desta classe.
     */
    override fun toString(): String
    {
        return """Auxiliar
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

        other as Auxiliar

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