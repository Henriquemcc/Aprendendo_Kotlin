package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa um Funcionario do Bytebank.
 * @param nome Nome do funcionário.
 * @param cpf CPF do funcionário.
 * @param salario Salário do funcionário.
 * */
abstract class Funcionario(val nome: String, val cpf: String, val salario: Double)
{

    /**
     * Calcula a bonificação do funcionário.
     * */
    abstract val bonificacao: Double

    /**
     * Converte uma instância desta classe em uma String.
     * @return String contendo os dados da instância desta classe.
     */
    override fun toString(): String
    {
        return """Funcionario
            |(
            |nome='$nome',
            |cpf='$cpf',
            |salario=$salario,
            |bonificacao=$bonificacao
            |)""".trimMargin()
    }

    /**
     * Compara duas instâncias desta classe par ver se são iguais.
     * @param other Outra instância desta classe a ser comparada.
     * @return Valor booleano indicando se as instâncias são iguais.
     */
    override fun equals(other: Any?): Boolean
    {
        if (this === other) return true
        if (other !is Funcionario) return false

        if (nome != other.nome) return false
        if (cpf != other.cpf) return false
        if (salario != other.salario) return false
        if (bonificacao != other.bonificacao) return false

        return true
    }

    /**
     * Obtém o hash code desta instância desta classe.
     * @return Número inteiro com o hash desta instância desta classe.
     */
    override fun hashCode(): Int
    {
        var result = nome.hashCode()
        result = 31 * result + cpf.hashCode()
        result = 31 * result + salario.hashCode()
        result = 31 * result + bonificacao.hashCode()
        return result
    }


}