/**
 * Serve para testaar os lacos de repeticao da linguagem Kotlin.
 * */
fun testaLacos() {

    println("Testando laço While:")
    println("-------------------------")
    var i = 0
    while (i < 5) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }
    println("-------------------------")

    println("Testando laço For:")
    println("-------------------------")
    for (i in 5 downTo 1) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
    }
    println("-------------------------")
}

/**
 * Serve para executar a funcao testaLacos ao clicar para executar este arquivo.
 * */
private fun main() {
    testaLacos()
}