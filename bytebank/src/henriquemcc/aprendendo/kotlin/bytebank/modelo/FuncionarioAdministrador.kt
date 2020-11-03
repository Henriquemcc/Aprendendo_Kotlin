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
(nome: String, cpf: String, salario: Double, private var senha: String) : Funcionario(nome, cpf, salario), Autenticavel {

    /**
     * Altera a senha do funcionário.
     * @param senha Novo valor para senha.
     */
    fun setSenha(senha: String) {
        this.senha = senha
    }

    /**
     * Verifica se a senha do funcionário é válida.
     * @param senha Senha do funcionário.
     * @return Valor booleano indicando se foi ou não autenticado.
     */
    override fun autenticar(senha: String): Boolean {
        var autenticado = false

        if (senha == this.senha)
            autenticado = true

        return autenticado
    }

}