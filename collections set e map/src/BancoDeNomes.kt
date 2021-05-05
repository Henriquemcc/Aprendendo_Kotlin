/**
 * Representa um banco de dados que armazena nomes.
 */
class BancoDeNomes {

    companion object {
        /**
         * Lista mutável que irá armazenar os nomes.
         */
        private val dados = mutableListOf<String>()
    }

    /**
     * Obtém uma cópia da lista do Banco de Nomes.
     */
    val nomes: Collection<String>
        get() = dados.toList()

    /**
     * Adiciona um elemento á lista mutável do Banco de Nomes.
     * @param elemento Elemento que será adicionado á lista.
     */
    fun adicionar(elemento: String) {
        dados.add(elemento)
    }
}