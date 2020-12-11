package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa um Auxiliar, que é um subtipo de Funcionario.
 */
class Auxiliar : FuncionarioAdministrador
{
    /**
     * Cria uma nova instancia de Auxiliar.
     * @param nome Nome do auxiliar.
     * @param cpf CPF do auxiliar.
     * @param salario Salario do auxiliar.
     * @param senha Senha do auxiliar.
     */
    constructor(nome: String = "", cpf: String = "", salario: Double = 0.0, senha: String = "") : super(nome, cpf, salario, senha)

    override val bonificacao: Double
        get() = 0.0

    /**
     * Verifica se duas instâncias desta classe são iguais.
     * @param other Outra instância que será comparada.
     * @return Valor booleano indicando se as duas instâncias são iguais.
     */
    override fun equals(other: Any?): Boolean
    {
        if (this === other) return true
        if (other !is Auxiliar) return false
        if (!super.equals(other)) return false

        if (bonificacao != other.bonificacao) return false

        return true
    }

    /**
     * Gera o código hash de uma instância desta classe.
     * @return Número inteiro contendo o código hash de uma instância desta classe.
     */
    override fun hashCode(): Int
    {
        var result = super.hashCode()
        result = 31 * result + bonificacao.hashCode()
        return result
    }

    /**
     * Gera uma representação no formato de uma string dos atributos de uma instância desta classe.
     * @return Representação no formato de uma string dos atributos de uma instância desta classe.
     */
    override fun toString(): String
    {
        return "Auxiliar(bonificacao=$bonificacao) ${super.toString()}"
    }


}