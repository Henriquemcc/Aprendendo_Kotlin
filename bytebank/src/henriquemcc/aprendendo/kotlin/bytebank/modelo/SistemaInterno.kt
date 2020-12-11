package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa um sistema do bytebank no qual funcionários com atribuições administrativas podem acessar.
 */
class SistemaInterno
{

    /**
     * Realiza o login do funcionário.
     * @param autenticavel Quem será autenticado
     * @param senha Senha digitada pelo Funcionário.
     */
    fun login(autenticavel: Autenticavel, senha: String)
    {
        if (autenticavel.autenticar(senha))
        {
            println("Autenticado com sucesso")
        }
        else
        {
            println("Falha na autenticação")
        }

        when (autenticavel)
        {
            is Diretor ->
            {
                println("Opções de Funcionário Diretor")
            }

            is Gerente ->
            {
                println("Opções de Funcionário Gerente")
            }

            is Analista ->
            {
                println("Opções de Funcionário Analista")
            }

            else        ->
            {
                println("Opções Reduzidas")
            }
        }
    }

}