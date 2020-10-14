/**
 * Serve para testar as condicoes if, else, when da linguagem Kotlin.
 * @param saldo Valor do saldo de uma conta para exibir mensagem sobre a conta.
 * */
fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }

    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}

/**
 * Serve para executar a funcao testaCondicoes ao clicar para executar este arquivo.
 * */
private fun main() {
    testaCondicoes(-1024.0)
    testaCondicoes(0.0)
    testaCondicoes(1024.0)

}