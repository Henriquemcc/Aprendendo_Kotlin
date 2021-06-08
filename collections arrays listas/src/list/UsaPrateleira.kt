package list

fun main() {
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)

    val listaLivrosOrdenadoPorAutor = prateleira.organizarLivrosPorAutor()
    val listaLivrosOrdenadoPorAnoPublicacao =
            prateleira.organizarLivrosPorAnoPublicacao()

    listaLivrosOrdenadoPorAutor.printlnFormatted()
    listaLivrosOrdenadoPorAnoPublicacao.printlnFormatted()
}