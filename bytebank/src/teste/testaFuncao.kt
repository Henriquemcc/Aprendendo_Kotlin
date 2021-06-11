package teste

fun main() {

    println("Testando a atribuição de uma função para uma variável")
    println()

    val funcaoTeste = :: teste
    print("Valor da variável funcaoTeste: ")
    println(funcaoTeste)
    println()

    print("Executando a funcaoTeste: ")
    println(funcaoTeste())
    println()

    val classeFuncaoTeste = ::Teste
    print("classeFuncaoTeste: ")
    println(classeFuncaoTeste)
    println()

    print("Executando a classeFuncaoTeste: ")
    println(classeFuncaoTeste())
    println()

    print("Executando o método invoke da classeFuncaoTeste: ")
    println(classeFuncaoTeste().invoke())
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun teste() {
    println("Executando a função teste")
    println()
}

private class Teste: () -> Unit {
    override fun invoke() {
        println("Executando o método invoke da classe Teste que herda uma função '() -> Unit'")
        println()
    }

}