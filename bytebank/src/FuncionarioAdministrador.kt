/**
 * Representa um Funcionario com as propriedades de administrador.
 */
abstract class FuncionarioAdministrador : Funcionario {

    val senha: String

    /**
     * Cria uma instancia de FuncionarioAdministrador.
     * @param nome Nome do funcionário
     * @param cpf CPF do funcionário
     * @param salario Salario do funcionário
     * @param senha Senha do funcionário
     */
    constructor(nome: String, cpf: String, salario: Double, senha: String) : super(nome, cpf, salario) {
        this.senha = senha
    }

    /**
     * Verifica se a senha do funcionário é válida.
     * @param senha Senha do funcionário.
     * @return Valor booleano indicando se foi ou não autenticado.
     */
    fun autenticar(senha: String): Boolean {
        var autenticado = false

        if (senha.equals(this.senha))
            autenticado = true

        return autenticado
    }

}