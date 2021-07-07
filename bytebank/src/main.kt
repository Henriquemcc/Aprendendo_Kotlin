import modelo.Cliente
import modelo.ContaPoupanca
import modelo.Endereco

fun main() {
    testaWith()
    testaRun()
}

private fun testaRun() {

    println("Testando a função de escopo run")
    println()

    val taxaAnual = 0.05
    println("Taxa anual: $taxaAnual")
    println()

    val taxaMensal = taxaAnual / 12
    println("Taxa mensal: $taxaMensal")
    println()

    val contaPoupanca = ContaPoupanca(
        Cliente(nome = "João", cpf = "792.008.010-05", senha = "OcnU0L!yuYTiBkhUI%BcKj6lv9TtWjW8Bp39HO"),
        numero = 18923
    )

    contaPoupanca.run {
        println("Saldo antes do depósito: $saldo")
        println()

        deposita(5000.00)
        println("Saldo depois do depósito: $saldo")
        println()

        saldo * taxaMensal
    }.let { rendimentoMensal ->
        println("Rendimento mensal: $rendimentoMensal")
        println()
    }

    val rendimentoAnual = run {
        var saldo = contaPoupanca.saldo
        repeat(12) { indice ->
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println("Simulação rendimento anual: $rendimentoAnual")
    println()

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun testaWith() {

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