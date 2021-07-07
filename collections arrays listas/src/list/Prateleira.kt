package list

/**
 * Representa uma prateleira de livros
 * @param genero Gênero da prateleira de livros
 * @param livros Lista de livros da prateleira
 */
data class Prateleira(
    val genero: String,
    val livros: List<Livro>
) {
    /**
     * Obtém uma lista de livros ordenada por autor
     * @return Lista imutável de livros
     */
    fun organizarLivrosPorAutor(): List<Livro> {
        return this.livros.sortedBy { it.autor }

    }

    /**
     * Obtém uma lista de livros ordenada por ano de publicação
     * @return Lista imutável de livros
     */
    fun organizarLivrosPorAnoPublicacao(): List<Livro> {
        return this.livros.sortedBy { it.anoPublicacao }
    }
}
