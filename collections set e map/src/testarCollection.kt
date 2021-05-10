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

/**
 * Testa o comportamento da classe Banco de Nomes.
 */
private fun testarBancoDeNomes() {
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

/**
 * Testa o comportamento da cópia de uma instância da classe Banco de Nomes.
 */
private fun testarBancoDeNomesCopia() {
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

/**
 * Testa o comportamento de uma lista.
 */
private fun testarLista() {
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

/**
 * Testa o comportamento de uma collection.
 */
private fun testarCollection() {
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

/**
 * Testa
 */
private fun testarIterable() {
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

/**
 * Função principal
 */
fun main() {
    testarBancoDeNomes()
    testarBancoDeNomesCopia()
    testarLista()
    testarCollection()
    testarIterable()
}