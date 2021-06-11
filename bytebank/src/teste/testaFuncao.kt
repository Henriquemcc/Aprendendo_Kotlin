package teste

fun main() {
    testarAtribuicaoFuncaoParaVariavel()
    testarAtribuicaoClasseFuncaoParaVariavel()
    testarAtribuicaoClasseFuncaoParaVariavelComInvokeComoOperator()
}

private fun testarAtribuicaoClasseFuncaoParaVariavelComInvokeComoOperator()
{
    println("Testando a atribuição de uma classe função com o invoke como operator para uma variável")
    println()

    val classeFuncaoTeste = :: Teste1
    println("classeFuncaoTeste: ")
    println(classeFuncaoTeste)
    println()

    println("Será executado o construtor da classeFuncaoTeste: ")
    val instanciaClasseFuncaoTeste = classeFuncaoTeste()
    println()

    println("Instância da classeFuncaoTeste: ")
    println(instanciaClasseFuncaoTeste)
    println()

    println("Será executado o operador invoke da classeFuncaoTeste: ")
    println(instanciaClasseFuncaoTeste(0))
    println()

    println("Será executado o método invoke da classeFuncaoTeste: ")
    println(instanciaClasseFuncaoTeste.invoke())
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarAtribuicaoClasseFuncaoParaVariavel() {

    println("Testando a atribuição de uma classe função para uma variável")
    println()

    val classeFuncaoTeste = ::Teste0
    println("classeFuncaoTeste: ")
    println(classeFuncaoTeste)
    println()

    println("Será executado o construtor da classeFuncaoTeste: ")
    val instanciaClasseFuncaoTeste = classeFuncaoTeste()
    println()

    println("Instância da classeFuncaoTeste: ")
    println(instanciaClasseFuncaoTeste)
    println()

    println("Será executado o método invoke da classeFuncaoTeste: ")
    println(instanciaClasseFuncaoTeste.invoke())
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarAtribuicaoFuncaoParaVariavel() {

    println("Testando a atribuição de uma função para uma variável")
    println()

    val funcaoTeste = :: teste
    println("Valor da variável funcaoTeste: ")
    println(funcaoTeste)
    println()

    println("Será executado a funcaoTeste: ")
    println(funcaoTeste())
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun teste() {
    println("Executando a função teste")
}

private class Teste0: () -> Unit {
    override fun invoke() {
        println("Executando o método invoke da classe Teste0 que herda uma função '() -> Unit'")
    }

}

private class Teste1: () -> Unit {
    override fun invoke() {
        println("Executando o método invoke da classe Teste1 que herda uma função '() -> Unit'")
    }

    operator fun invoke(valor: Int) {
        println("Executando o operator invoke da classe Teste1 que herda uma função '() -> Unit'")
        println(valor)
    }
}