package list

/**
 * Representa um livro.
 */
data class Livro(
    /**
     * Título do livro
     */
    val titulo: String,
    /**
     * Nome do autor do livro
     */
    val autor: String,
    /**
     * Ano de publicação do livro
     */
    val anoPublicacao: Long,
    /**
     * Nome da editora do livro
     */
    val editora: String? = null
) : Comparable<Livro> {

    /**
     * Compara dois objetos do tipo Livro com base no ano de publicação dele.
     * @param other Outro livro que será comparado com este.
     * @return Número inteiro indicando a diferença entre os anos de publicação:
     * Igual a zero se o ano de publicação dos livros forem iguais.
     * Maior que zero se o ano de publicação deste livro for maior que o do outro.
     * Menor que zero se o ano de publicação deste livro for menor que o do outro.
     */
    override fun compareTo(other: Livro): Int {
        return this.anoPublicacao.compareTo(other.anoPublicacao)
    }

}
