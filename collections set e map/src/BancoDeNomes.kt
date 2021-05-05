class BancoDeNomes {

    companion object {
        private val dados = mutableListOf<String>()
    }

    val nomes: Collection<String>
        get() = dados

    fun adicionar(elemento: String) {
        dados.add(elemento)
    }
}