package modelo

/**
 * Permite que uma classe possa ser autenticável no modelo.SistemaInterno.
 */
interface Autenticavel {

    /**
     * Verifica se a senha do é válida.
     * @param senha Senha.
     * @return Valor booleano indicando se foi ou não autenticado.
     */
    fun autenticar(senha: String): Boolean

}