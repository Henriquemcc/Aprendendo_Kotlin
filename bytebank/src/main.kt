import modelo.Endereco

fun main() {
    testaWith()
}

fun testaWith() {

    println("Testando a função de escopo with ")
    println()

    println("Endereço Completo")
    with(Endereco())
    {
        logradouro = "rua vergueiro"
        numero = 3185
        bairro = "Villa Mariana"
        cidade = "São Paulo"
        estado = "SP"
        cep = "02310-063"
        complemento = "Apartamento"
        completo()
    }.let { enderecoCompleto ->
        println(enderecoCompleto)
    }
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}