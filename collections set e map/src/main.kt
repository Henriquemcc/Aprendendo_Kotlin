fun main() {

    testarLista()
    testarCollection()
    testarIterable()
    testarBancoDeNomes()
    testarBancoDeNomesCopia()
}

fun testarBancoDeNomes() {
    println("Testando o Banco de Nomes")
    println()

    val bancoDeNomes = BancoDeNomes()
    bancoDeNomes.adicionar("João")
    bancoDeNomes.adicionar("Felipe")
    bancoDeNomes.adicionar("Joana")
    println("Nomes do banco de nomes: ${bancoDeNomes.nomes}")
    println()

    val novoBancoDeNomes = BancoDeNomes()
    println("Nomes do novo Banco de nomes: ${novoBancoDeNomes.nomes}")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

fun testarBancoDeNomesCopia() {
    println("Testando a cópia do Banco de Nomes")
    println()

    val bancoDeNomes = BancoDeNomes()
    bancoDeNomes.adicionar("João")
    bancoDeNomes.adicionar("Felipe")
    bancoDeNomes.adicionar("Joana")
    println("Nomes do banco de nomes: ${bancoDeNomes.nomes}")
    println()

    val copiaNomesDoBancoDeNomes = bancoDeNomes.nomes as MutableCollection<String>
    copiaNomesDoBancoDeNomes.add("Maria")
    println("Cópia dos nomes do banco de nomes: $copiaNomesDoBancoDeNomes")
    println("Nomes do banco de nomes: ${bancoDeNomes.nomes}")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

fun testarLista() {
    println("Testando a lista (List)")
    println()

    val listaNomes = listOf("João", "Maria", "José", "Ana", "Pedro", "Helena", "Joaquim", "Monica", "Eduardo")
    println("Lista de nomes: $listaNomes")
    println()

    val tamanhoListaNomes = listaNomes.size
    println("Tamanho da lista de nomes: $tamanhoListaNomes")
    println()

    val listaNomesContemPaulo = listaNomes.contains("Paulo")
    println("Lista de nomes contém 'Paulo'? $listaNomesContemPaulo")
    println()

    for (nome in listaNomes) {
        println("Nome: $nome")
    }
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

fun testarCollection() {
    println("Testando Collection")
    println()

    val listaNomes = listOf("João", "Maria", "José", "Ana", "Pedro", "Helena", "Joaquim", "Monica", "Eduardo")
    println("Lista de nomes: $listaNomes")
    println()

    val listaNomesConvertidosParaCollection = listaNomes as Collection<*>
    println("Lista de nomes convertidos para Collection: $listaNomesConvertidosParaCollection")
    println()

    for (nome in listaNomesConvertidosParaCollection) {
        println("Nome: $nome")
    }
    println()

    val listaNomesConvertidosParaCollectionContemJoao = listaNomesConvertidosParaCollection.contains("João")
    println("Lista de nomes convertidos para Collection contém 'João': $listaNomesConvertidosParaCollectionContemJoao")
    println()

    val tamanhoListaNomesConvertidosParaCollection = listaNomesConvertidosParaCollection.size
    println("Tamanho da lista de nomes convertidos para Collection: $tamanhoListaNomesConvertidosParaCollection")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

fun testarIterable() {
    println("Testando Iterable")
    println()

    val listaNomes = listOf("João", "Maria", "José", "Ana", "Pedro", "Helena", "Joaquim", "Monica", "Eduardo")
    println("Lista de nomes: $listaNomes")
    println()

    val listaNomesConvertidoParaIterable = listaNomes as Iterable<*>
    println("Lista de nomes convertidos para Iterable: $listaNomesConvertidoParaIterable")
    println()

    for (nome in listaNomesConvertidoParaIterable) {
        println("Nome: $nome")
    }
    println()

    val listaNomesConvertidoParaIterableContemMaria = listaNomesConvertidoParaIterable.contains("Maria")
    println("Lista de nomes convertidos para Iterable contém 'Maria'? $listaNomesConvertidoParaIterableContemMaria")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}