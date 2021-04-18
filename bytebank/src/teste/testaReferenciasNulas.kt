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

}