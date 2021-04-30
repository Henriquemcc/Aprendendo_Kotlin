package list

data class Prateleira(
    val genero: String,
    val livros: MutableList<Livro>
) {
    fun organizarLivrosPorAutor(): MutableList<Livro> {
        this.livros.sortBy { it.autor }
        return this.livros
    }

    fun organizarLivrosPorAnoPublicacao(): MutableList<Livro> {
        this.livros.sortBy { it.anoPublicacao }
        return this.livros
    }
}
