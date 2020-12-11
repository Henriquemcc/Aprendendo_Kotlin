package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa um Funcionario com as propriedades de administrador.
 */
abstract class FuncionarioAdministrador : Funcionario, Autenticavel
{

    var senha: String
        private set

    /**
     * Cria uma nova instância da classe FuncionarioAdministrador
     * @param cpf CPF do funcionário.
     * @param nome Nome do funcionário.
     * @param salario Salário do funcionário.
     * @param senha Senha do funcionário.
     */
    constructor(nome: String = "", cpf: String = "", salario: Double = 0.0, senha: String = "") : super(nome, cpf, salario)
    {
        this.senha = senha
    }

    /**
     * Verifica se a senha do funcionário é válida.
     * @param senha Senha do funcionário.
     * @return Valor booleano indicando se foi ou não autenticado.
     */
    override fun autenticar(senha: String): Boolean
    {
        var autenticado = false

        if (senha == this.senha)
            autenticado = true

        return autenticado
    }

    /**
     * Verifica se duas instâncias desta classe são iguais.
     * @param other Outra instância que será comparada.
     * @return Valor booleano indicando se as duas instâncias são iguais.
     */
    override fun equals(other: Any?): Boolean
    {
        if (this === other) return true
        if (other !is FuncionarioAdministrador) return false
        if (!super.equals(other)) return false

        if (senha != other.senha) return false

        return true
    }

    /**
     * Gera o código hash de uma instância desta classe.
     * @return Número inteiro contendo o código hash de uma instância desta classe.
     */
    override fun hashCode(): Int
    {
        var result = super.hashCode()
        result = 31 * result + senha.hashCode()
        return result
    }

    /**
     * Gera uma representação no formato de uma string dos atributos de uma instância desta classe.
     * @return Representação no formato de uma string dos atributos de uma instância desta classe.
     */
    override fun toString(): String
    {
        return "FuncionarioAdministrador() ${super.toString()}"
    }


}