package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Permite que uma classe possa ser autenticável no SistemaInterno.
 */
interface Autenticavel
{

    /**
     * Verifica se a senha do é válida.
     * @param senha Senha.
     * @return Valor booleano indicando se foi ou não autenticado.
     */
    fun autenticar(senha: String): Boolean

}