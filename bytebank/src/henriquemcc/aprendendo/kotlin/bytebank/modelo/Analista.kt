package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa um Analista, que é um subtipo de Funcionario.
 */
class Analista : FuncionarioAdministrador
{

    /**
     * Cria uma nova instância da classe Analista
     * @param nome Nome do analista.
     * @param cpf CPF do analista
     * @param salario Salário do analista.
     * @param senha Senha do analista.
     */
    constructor(nome: String = "", cpf: String = "", salario: Double = 0.0, senha: String = "") : super(nome, cpf, salario, senha)


    /**
     * Calcula a bonificação do analista.
     * @return Valor da bonificação do analista.
     * */
    override val bonificacao: Double
        get() = this.salario * 0.2


    /**
     * Verifica se duas instâncias desta classe são iguais.
     * @param other Outra instância que será comparada.
     * @return Valor booleano indicando se as duas instâncias são iguais.
     */
    override fun equals(other: Any?): Boolean
    {
        if (this === other) return true
        if (other !is Analista) return false
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
        return "Analista(bonificacao=$bonificacao) ${super.toString()}"
    }


}