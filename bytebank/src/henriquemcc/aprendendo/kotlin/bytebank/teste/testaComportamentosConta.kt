package henriquemcc.aprendendo.kotlin.bytebank.teste

import henriquemcc.aprendendo.kotlin.bytebank.modelo.qtdContas

/**
 * Testa comportamentos da classe Conta.
 */
fun testaComportamentosConta()
{

    //Imprimindo as contas
    println()
    println("Antes do depósito:")
    println()
    println(contaCorrenteDoZe)
    println()
    println(contaCorrenteDoJoao)
    println()
    println(contaPoupancaDoFulano)
    println()
    println(contaPoupancaDoCiclano)
    println()
    println("Quantidade de contas que foram criadas: ${qtdContas}")

    //Adicionando dinheiro as contas
    contaCorrenteDoZe.depositar(2000.00)
    contaCorrenteDoJoao.depositar(4000.00)
    contaPoupancaDoCiclano.depositar(8000.00)
    contaPoupancaDoFulano.depositar(16000.00)
    contaSalarioDoLuis.depositar(32000.00)
    contaSalarioDaPatricia.depositar(64000.00)

    //Imprimindo as contas
    println()
    println("Depois do depósito e antes do saque:")
    println()
    println(contaCorrenteDoZe)
    println()
    println(contaCorrenteDoJoao)
    println()
    println(contaPoupancaDoFulano)
    println()
    println(contaPoupancaDoCiclano)
    println()
    println(contaSalarioDoLuis)
    println()
    println(contaSalarioDaPatricia)
    println()

    //Sacando dinheiro das contas
    contaCorrenteDoJoao.sacar(200.00)
    contaCorrenteDoZe.sacar(400.00)
    contaPoupancaDoCiclano.sacar(800.00)
    contaPoupancaDoFulano.sacar(1600.00)
    contaSalarioDoLuis.sacar(3200.00)
    contaSalarioDaPatricia.sacar(6400.00)

    //Imprimindo as contas
    println()
    println("Depois do saque e antes da transferência")
    println()
    println(contaCorrenteDoZe)
    println()
    println(contaCorrenteDoJoao)
    println()
    println(contaPoupancaDoFulano)
    println()
    println(contaPoupancaDoCiclano)
    println()
    println(contaSalarioDoLuis)
    println()
    println(contaSalarioDaPatricia)
    println()

    //Transferindo dinheiro entre as contas
    contaCorrenteDoJoao.transferir(contaPoupancaDoCiclano, 200.00)
    contaCorrenteDoZe.transferir(contaCorrenteDoJoao, 400.00)
    contaPoupancaDoCiclano.transferir(contaPoupancaDoFulano, 800.00)
    contaCorrenteDoZe.transferir(contaPoupancaDoCiclano, 600.00)

    //Imprimindo as contas
    println()
    println("Depois da transferência")
    println()
    println(contaCorrenteDoZe)
    println()
    println(contaCorrenteDoJoao)
    println()
    println(contaPoupancaDoFulano)
    println()
    println(contaPoupancaDoCiclano)
    println()
    println("Conta Salário não pode realizar transferência:")
    println()
    println(contaSalarioDoLuis)
    println()
    println(contaSalarioDaPatricia)
    println()
    println()
    println("Quantidade de contas que foram criadas: ${qtdContas}")
    println()

}

/**
 * Executa este arquivo.
 */
fun main()
{
    testaComportamentosConta()
}