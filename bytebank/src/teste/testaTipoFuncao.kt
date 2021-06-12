package teste

fun main() {
    testarAtribuicaoFuncaoParaVariavel()
    testarAtribuicaoClasseFuncaoParaVariavel()
    testarAtribuicaoClasseFuncaoParaVariavelComInvokeComoOperator()
    testarFuncaoLambda()
    testarFuncaoAnonima()
    testarAtribuicaoFuncaoComParametrosParaVariavel()
    testarAtribuicaoClasseFuncaoComParametrosParaVariavel()
}

private fun testarAtribuicaoClasseFuncaoComParametrosParaVariavel() {

    println("Testando a atribuição de uma classe função com parâmetros para uma variável")
    println()

    val classeFuncaoSoma = ::Soma
    println("classeFuncaoSoma:")
    println(classeFuncaoSoma)
    println()

    println("Será executado o construtor da classeFuncaoSoma:")
    val instanciaClasseFuncaoSoma = classeFuncaoSoma()
    println()

    println("Instância da classeFuncaoSoma:")
    println(instanciaClasseFuncaoSoma)
    println()

    println("Será executado o método invoke da classeFuncaoSoma, passando como parâmetros 400 e 100:")
    println(instanciaClasseFuncaoSoma.invoke(400, 100))
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}


private fun testarAtribuicaoFuncaoComParametrosParaVariavel() {

    println("Testando a atribuição de uma função com parâmetros para uma variável")
    println()

    val funcaoSoma = ::soma
    println("Valor da variável funcaoSoma:")
    println(funcaoSoma)
    println()

    println("Será executada a funcaoSoma, passando como parâmetros 200 e 150:")
    println(funcaoSoma(200, 150))
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarFuncaoAnonima() {

    println("Testando a função anônima")
    println()

    val funcaoAnonima = fun() {
        println("Executando a função anônima")
    }

    println("Valor da variável funcaoAnonima:")
    println(funcaoAnonima)
    println()

    println("Será executada a funcaoAnonima:")
    println(funcaoAnonima())
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarFuncaoLambda() {

    println("Testando a função lambda")
    println()

    val funcaoLambda = {
        println("Executando a função lambda")
    }

    println("Valor da variável funcaoLambda:")
    println(funcaoLambda)
    println()

    println("Será executada a funcaoLambda:")
    println(funcaoLambda())
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarAtribuicaoClasseFuncaoParaVariavelComInvokeComoOperator() {

    println("Testando a atribuição de uma classe função com o invoke como operator para uma variável")
    println()

    val classeFuncaoTeste = ::Teste1
    println("classeFuncaoTeste:")
    println(classeFuncaoTeste)
    println()

    println("Será executado o construtor da classeFuncaoTeste:")
    val instanciaClasseFuncaoTeste = classeFuncaoTeste()
    println()

    println("Instância da classeFuncaoTeste:")
    println(instanciaClasseFuncaoTeste)
    println()

    println("Será executado o operador invoke da classeFuncaoTeste:")
    println(instanciaClasseFuncaoTeste(0))
    println()

    println("Será executado o método invoke da classeFuncaoTeste:")
    println(instanciaClasseFuncaoTeste.invoke())
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarAtribuicaoClasseFuncaoParaVariavel() {

    println("Testando a atribuição de uma classe função para uma variável")
    println()

    val classeFuncaoTeste = ::Teste0
    println("classeFuncaoTeste:")
    println(classeFuncaoTeste)
    println()

    println("Será executado o construtor da classeFuncaoTeste:")
    val instanciaClasseFuncaoTeste = classeFuncaoTeste()
    println()

    println("Instância da classeFuncaoTeste:")
    println(instanciaClasseFuncaoTeste)
    println()

    println("Será executado o método invoke da classeFuncaoTeste:")
    println(instanciaClasseFuncaoTeste.invoke())
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarAtribuicaoFuncaoParaVariavel() {

    println("Testando a atribuição de uma função para uma variável")
    println()

    val funcaoTeste = ::teste
    println("Valor da variável funcaoTeste:")
    println(funcaoTeste)
    println()

    println("Será executada a funcaoTeste:")
    println(funcaoTeste())
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun teste() {
    println("Executando a função teste")
}

private fun soma(a: Int, b: Int): Int {
    println("Executando a função soma")
    return a + b
}

private class Teste0 : () -> Unit {
    override fun invoke() {
        println("Executando o método invoke da classe Teste0 que herda uma função '() -> Unit'")
    }

}

private class Teste1 : () -> Unit {
    override fun invoke() {
        println("Executando o método invoke da classe Teste1 que herda uma função '() -> Unit'")
    }

    operator fun invoke(valor: Int) {
        println("Executando o operator invoke da classe Teste1 que herda uma função '() -> Unit'")
        println(valor)
    }
}

private class Soma : (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int {
        println("Executando o método invoke da classe Soma que herda uma função '(Int, Int) -> Int'")
        return p1 + p2
    }

}