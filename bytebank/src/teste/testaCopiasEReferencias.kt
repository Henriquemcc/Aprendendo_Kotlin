package teste

import modelo.Cliente
import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(nome = "João", cpf = "", senha = 1)

    val contaJoao = ContaCorrente(joao, 1002)
    contaJoao.titular.nome = "João"
    val contaMaria = ContaPoupanca(Cliente(
            nome = "Maria",
            cpf = "",
            senha = 2
    ), 1003)
    contaMaria.titular.nome = "Maria"
    contaJoao.titular.nome = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}