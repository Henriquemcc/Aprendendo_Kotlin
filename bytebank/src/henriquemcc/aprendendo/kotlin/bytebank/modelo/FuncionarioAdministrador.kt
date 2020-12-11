package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa um Funcionario com as propriedades de administrador.
 */
abstract class FuncionarioAdministrador
/**
 * Cria uma instancia de FuncionarioAdministrador.
 * @param nome Nome do funcionário
 * @param cpf CPF do funcionário
 * @param salario Salario do funcionário
 * @param senha Senha do funcionário
 */
(nome: String, cpf: String, salario: Double, private var senha: String) : Funcionario(nome, cpf, salario), Autenticavel
{

    /**
     * Altera a senha do funcionário.
     * @param senha Novo valor para senha.
     */
    fun setSenha(senha: String)
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
     * Compara duas instâncias desta classe par ver se são iguais.
     * @param other Outra instância desta classe a ser comparada.
     * @return Valor booleano indicando se as instâncias são iguais.
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
     * Obtém o hash code desta instância desta classe.
     * @return Número inteiro com o hash desta instância desta classe.
     */
    override fun hashCode(): Int
    {
        var result = super.hashCode()
        result = 31 * result + senha.hashCode()
        return result
    }

    /**
     * Converte uma instância desta classe em uma String.
     * @return String contendo os dados da instância desta classe.
     */
    override fun toString(): String
    {
        return """FuncionarioAdministrador()
            |${super.toString()}""".trimMargin()
    }


}