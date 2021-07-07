package list

val livro1 = Livro(
    titulo = "Grande Sertão: Veredas",
    autor = "João Guimarães Rosa",
    anoPublicacao = 1956
)

val livro2 = Livro(
    titulo = "Minha vida de menina",
    autor = "Helena Morley",
    anoPublicacao = 1942,
    editora = "Editora A"
)

val livro3 = Livro(
    titulo = "Memórias Póstumas de Brás Cubas",
    autor = "Machado de Assis",
    anoPublicacao = 1881
)

val livro4 = Livro(
    titulo = "Iracema",
    autor = "José de Alencar",
    anoPublicacao = 1865,
    editora = "Editora B"
)

val livro5 = Livro(
    titulo = "Sagarana",
    autor = "João Guimarães Rosa",
    anoPublicacao = 1946
)

fun main() {
    println("Criando listas")
    parte0()
    parte1()
    parte2()
    parte3()
    parte4()
    parte5()
    parte6()
}

fun parte0() {
    println("Mostrando os livros")
    println("Livro 1: $livro1")
    println("Livro 2: $livro2")
    println("Livro 3: $livro3")
    println("Livro 4: $livro4")
    println("Livro 5: $livro5")
    println("--------------------------------------")

}

fun parte1() {
    println("Utilizando a função mutableListOf para criar uma lista de livros")

    val listaLivros = mutableListOf(livro1, livro2, livro3, livro4)
    println("Lista de livros com os livros 1, 2, 3, 4: $listaLivros")

    listaLivros.add(livro5)
    println("Lista de livros após adicionar o livro 5: $listaLivros")

    listaLivros.remove(livro1)
    println("Lista de livros após remover o livro 1: $listaLivros")

    println("--------------------------------------")
}

fun parte2() {
    println("Utilizando a extension function printlnFormatted para imprimir formatada a lista de livros")

    val listaLivros = mutableListOf(livro1, livro2, livro3, livro4)
    println("Lista de livros com os livros 1, 2, 3, 4:")
    listaLivros.printlnFormatted()
    println()

    listaLivros.add(livro5)
    println("Lista de livros após adicionar o livro 5:")
    listaLivros.printlnFormatted()
    println()

    listaLivros.remove(livro1)
    println("Lista de livros após remover o livro 1:")
    listaLivros.printlnFormatted()
    println()

    println("--------------------------------------")
}

fun parte3() {
    println("Utilizando a função sorted para ordenar a lista de livros de acordo com o ano de publicação")

    val listaLivros = mutableListOf(livro1, livro2, livro3, livro4)
    listaLivros.add(livro5)
    listaLivros.remove(livro1)

    println("Lista de livros:")
    listaLivros.printlnFormatted()
    println()

    val listaLivrosOrdenadosAnoPublicacao = listaLivros.sorted()
    println("Lista de livros ordenados pelo ano de publicação:")
    listaLivrosOrdenadosAnoPublicacao.printlnFormatted()
    println()

    println("--------------------------------------")
}

fun parte4() {
    println("Utilizando a função sortedBy para ordenar a lista de livros de acordo com o ano de publicação")

    val listaLivros = mutableListOf(livro1, livro2, livro3, livro4)
    listaLivros.add(livro5)
    listaLivros.remove(livro1)

    println("Lista de livros:")
    listaLivros.printlnFormatted()
    println()

    val listaLivrosOrdenadosAnoPublicacao = listaLivros.sortedBy { it.anoPublicacao }
    println("Lista de livros ordenados pelo ano de publicação:")
    listaLivrosOrdenadosAnoPublicacao.printlnFormatted()
    println()

    println("--------------------------------------")
}

fun parte5() {
    println("Utilizando a função sortedBy para ordenar a lista de livros de acordo com o título")

    val listaLivros = mutableListOf(livro1, livro2, livro3, livro4)
    listaLivros.add(livro5)
    listaLivros.remove(livro1)

    println("Lista de livros:")
    listaLivros.printlnFormatted()
    println()

    val listaLivrosOrdenadosTitulo = listaLivros.sortedBy { it.titulo }
    println("Lista de livros ordenados pelo título:")
    listaLivrosOrdenadosTitulo.printlnFormatted()
    println()

    println("--------------------------------------")
}

fun parte6() {
    println("Utilizando a função titulosPorAnoPublicacaoDoAutor para obter os títulos dos livros cujo autor começa com um prefixo, estando ordenados por ano de publicação")

    val listaLivros = mutableListOf(livro1, livro2, livro3, livro4)
    listaLivros.add(livro5)
    listaLivros.remove(livro1)

    println("Lista de livros:")
    listaLivros.printlnFormatted()
    println()

    val prefixo = "João"
    val listaLivrosAutorNomeJoao = listaLivros.tituloPorAnoPublicacaoAutor(prefixo)
    println("Lista de nome de livros cujo prefixo do nome do autor é '$prefixo': $listaLivrosAutorNomeJoao")
}