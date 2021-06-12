package teste

fun main() {
    testarAtribuicaoFuncaoParaVariavel()
    testarAtribuicaoClasseFuncaoParaVariavel()
    testarAtribuicaoClasseFuncaoParaVariavelComInvokeComoOperator()
    testarFuncaoLambda()
    testarFuncaoAnonima()
    testarAtribuicaoFuncaoComParametrosParaVariavel()
    testarAtribuicaoClasseFuncaoComParametrosParaVariavel()
    testarFuncaoLambdaComParametros()
    testarFuncaoAnonimaComParametros()
    testarFuncaoLambdaComParametrosEMultiplusRetornos()
    testarFuncaoAnonimaComParametrosEMultiplosRetornos()
}

private fun testarFuncaoAnonimaComParametrosEMultiplosRetornos() {

    println("Testando a função anônima com parâmetros e múltiplos retornos")
    println()

    val funcaoAnonimaCalcularBonificacao = fun(salario: Double): Double {
        println("Executando a função anônima")

        if (salario > 1000.0)
            return salario + 50

        return salario + 100
    }

    println("Valor da variável funcaoAnonimaCalcularBonificacao:")
    println(funcaoAnonimaCalcularBonificacao)
    println()

    println("Será executada a funcaoAnonimaCalcularBonificacao, passando como parâmetro 1000.0:")
    println(funcaoAnonimaCalcularBonificacao(1000.0))
    println()

    println("Será executada a funcaoAnonimaCalcularBonificacao, passando como parâmetro 1100.0:")
    println(funcaoAnonimaCalcularBonificacao(1100.0))
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarFuncaoLambdaComParametrosEMultiplusRetornos() {

    println("Testando a função lambda com parâmetros e múltiplos retornos")
    println()

    val funcaoLambdaCalcularBonificacao = lambda@{ salario: Double ->
        println("Executando a função lambda")

        if (salario > 1000.0)
            return@lambda salario + 50

        return@lambda salario + 100

    }

    println("Valor da variável funcaoLambdaCalcularBonificacao:")
    println(funcaoLambdaCalcularBonificacao)
    println()

    println("Será executada a funcaoLambdaCalcularBonificacao, passando como parâmetros 1000.0:")
    println(funcaoLambdaCalcularBonificacao(1000.0))
    println()

    println("Será executada a funcaoLambdaCalcularBonificacao, passando como parâmetros 1100.0:")
    println(funcaoLambdaCalcularBonificacao(1100.0))
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarFuncaoAnonimaComParametros() {

    println("Testando a função anônima com parâmetros")
    println()

    val funcaoAnonimaSoma = fun(a: Int, b: Int): Int {
        println("Executando a função anônima")
        return a + b
    }

    println("Valor da variável funcaoAnonimaSoma:")
    println(funcaoAnonimaSoma)
    println()

    println("Será executada a funcaoAnonimaSoma, passando como parâmetros 54 e 12:")
    println(funcaoAnonimaSoma(54, 12))
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testarFuncaoLambdaComParametros() {

    println("Testando a função lambda com parâmetros")
    println()

    val funcaoLambdaSoma = { a: Int, b: Int ->
        println("Executando a função lambda")
        a + b
    }

    println("Valor da variável funcaoLambdaSoma:")
    println(funcaoLambdaSoma)
    println()

    println("Será executada a funcaoLambdaSoma, passando como parâmetros 13 e 45:")
    println(funcaoLambdaSoma(13, 45))
    println()

    println("---------------------------------------------------------------------------------------------------------------")
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