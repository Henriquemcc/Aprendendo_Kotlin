package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa um Gerente, que é um subtipo de Funcionario.
 */
class Gerente
/**
 * Serve para criar uma nova instancia de Gerente.
 * @param nome Nome do gerente.
 * @param cpf Cpf do gerente.
 * @param salario Salario do gerente.
 * @param senha Senha do gerente.
 * */
(nome: String, cpf: String, salario: Double, senha: String) : FuncionarioAdministrador(nome, cpf, salario, senha)
{

    /**
     * Calcula a bonificação do gerente.
     * @return Valor da bonificação do gerente.
     * */
    override val bonificacao: Double
        get() = this.salario * 1.1

    /**
     * Converte uma instância desta classe em uma String.
     * @return String contendo os dados da instância desta classe.
     */
    override fun toString(): String
    {
        return """Gerente
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
        if (other !is Gerente) return false
        if (!super.equals(other)) return false

        if (bonificacao != other.bonificacao) return false

        return true
    }

    /**
     * Obtém o hash code desta instância desta classe.
     * @return Número inteiro com o hash desta instância desta classe.
     */
    override fun hashCode(): Int
    {
        var result = super.hashCode()
        result = 31 * result + bonificacao.hashCode()
        return result
    }


}