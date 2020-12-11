package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa um Diretor, que é um subtipo de Funcionario.
 */
class Diretor
/**
 * Serve para criar uma nova instancia de Diretor.
 * @param nome Nome do diretor.
 * @param cpf Cpf do diretor.
 * @param salario Salario do diretor.
 * @param senha Senha do diretor.
 * */
(nome: String, cpf: String, salario: Double, senha: String, private val plr: Double) : FuncionarioAdministrador(nome, cpf, salario, senha)
{

    /**
     * Calcula a bonificação do diretor.
     * @return Valor da bonificação do diretor.
     * */
    override val bonificacao: Double
        get() = this.salario * 1.1 + this.plr

    /**
     * Converte uma instância desta classe em uma String.
     * @return String contendo os dados da instância desta classe.
     */
    override fun toString(): String
    {
        return """Diretor
            |(
            |plr=$plr,
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
        if (other !is Diretor) return false
        if (!super.equals(other)) return false

        if (plr != other.plr) return false
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
        result = 31 * result + plr.hashCode()
        result = 31 * result + bonificacao.hashCode()
        return result
    }


}