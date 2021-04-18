package teste

import modelo.Endereco

fun testaReferenciasNulas() {

    //extraia o valor do logradouro para outra variável chamando-o por meio da safe call
    val endereco: Endereco? = Endereco(logradouro = "Rua 1")
    val logradouro = endereco?.logradouro
    println(logradouro)

    //faça chamadas encadeadas utilizando o safe call;
    println(endereco?.logradouro?.length)

    //utilize a combinação da função de escopo let.
    endereco?.let {
        println(it.logradouro.hashCode())
    }

    //devolver a quantidade de caracteres do complemento e, caso seja nulo, devolver outro valor padrão
    val string: String? = "ieuwrhewiufhui"
    val quantidade: Int = string?.length ?: 0
    println(quantidade)

    //lançar uma exception caso o complemento for nulo;
    val qtd: Int = string?.length ?: throw Exception()
    println(qtd)

    //realizar um cast que pode ser um inteiro que recebe nulo.
    val qtd2 = string.length as Int?
    println(qtd2)


}