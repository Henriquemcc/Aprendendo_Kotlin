/**
 * Representa um sistema do bytebank no qual funcionários com atribuições administrativas podem acessar.
 */
class SistemaInterno {

    /**
     * Realiza o login do funcionário.
     * @param funcionarioAdministrador Funcionário que está autenticando.
     * @param senha Senha digitada pelo Funcionário.
     */
    fun login(funcionarioAdministrador: FuncionarioAdministrador, senha: String) {
        if (funcionarioAdministrador.autenticar(senha))
            println("Autenticado com sucesso")
        else
            println("Falha na autenticação")
    }

    /**
     * Realiza o login do cliente.
     * @param cliente Cliente que está autenticando.
     * @param senha Senha digitada pelo Cliente.
     */
    fun login(cliente: Cliente, senha: String) {
        if (cliente.autenticar(senha))
            println("Autenticado com sucesso")
        else
            println("Falha na autenticação")
    }
}