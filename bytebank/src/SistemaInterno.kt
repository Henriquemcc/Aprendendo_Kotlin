/**
 * Representa um sistema do bytebank no qual funcionários com atribuições administrativas podem acessar.
 */
class SistemaInterno {

    /**
     * Realiza o login do funcionário.
     * @param autenticavel Quem será autenticado
     * @param senha Senha digitada pelo Funcionário.
     */
    fun login(autenticavel: Autenticavel, senha: String) {
        if (autenticavel.autenticar(senha))
            println("Autenticado com sucesso")
        else
            println("Falha na autenticação")
    }
}