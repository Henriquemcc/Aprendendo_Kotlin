package list

/**
 * Obtém uma string com os dados dos livros da lista de forma formatada.
 * @return String com os dados dos livros formatados.
 */
fun List<Livro>.toStringFormatted(): String {
    return this.joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor} em ${it.anoPublicacao}" + if (it.editora != null) " publicado por ${it.editora}" else ""
    }
}

/**
 * Imprime a lista de livros de forma formatada.
 */
fun List<Livro>.printlnFormatted() {
    println()
    println(" ### Lista de Livros ### ")
    println(this.toStringFormatted())
}

/**
 * Obtém uma lista de strings com os títulos dos livros cujo nome ao autor inicia com o prefixo passado por parâmetro, estando ordenados pelo ano de publicação.
 * @param prefixoAutor Prefixo do nome do autor do livro procurado.
 * @return Lista de strings com os títulos dos livros.
 */
fun List<Livro>.tituloPorAnoPublicacaoAutor(prefixoAutor: String): List<String> {
    return this.filter { it.autor.startsWith(prefixoAutor) }.sortedBy { it.anoPublicacao }.map { it.titulo }
}