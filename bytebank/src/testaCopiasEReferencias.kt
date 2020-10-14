/**
 * Serve para testar a diferenca entre copias e referencias na linguagem Kotlin.
 * */
fun testaCopiasEReferencias() {

    println("-------------------------------------")
    println("Testando a copia de tipos primitivos:")
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")
    println("-------------------------------------")

    println("-------------------------------------")
    println("Testando a copia das referencias a objetos parte 1:")
    var contaJoao = Conta("João", 1002)
    contaJoao.titular = "João"
    var contaMaria = contaJoao
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
    println("-------------------------------------")

    println("-------------------------------------")
    println("Testando a copia das referencias a objetos parte 2:")
    contaJoao = Conta("João", 1002)
    contaJoao.titular = "João"
    contaMaria = Conta("Maria", 1003)
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
    println("-------------------------------------")
}

/**
 * Serve para executar a funcao testaCopiasEReferencias ao clicar para executar este arquivo.
 * */
private fun main() {
    testaCopiasEReferencias()
}