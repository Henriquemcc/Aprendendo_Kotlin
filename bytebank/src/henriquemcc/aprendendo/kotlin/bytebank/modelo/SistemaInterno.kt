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

    /**
     * Compara duas instâncias desta classe par ver se são iguais.
     * @param other Outra instância desta classe a ser comparada.
     * @return Valor booleano indicando se as instâncias são iguais.
     */
    override fun equals(other: Any?): Boolean
    {
        if (this === other) return true
        if (other !is SistemaInterno) return false
        return true
    }

    /**
     * Obtém o hash code desta instância desta classe.
     * @return Número inteiro com o hash desta instância desta classe.
     */
    override fun hashCode(): Int
    {
        return javaClass.hashCode()
    }


}