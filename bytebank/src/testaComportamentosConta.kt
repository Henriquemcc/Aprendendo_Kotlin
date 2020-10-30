fun testaComportamentosConta() {

    //Criando as contas correntes
    val contaCorrenteDoZe = ContaCorrente("Zé", 480812885)
    val contaCorrenteDoJoao = ContaCorrente("João", 1319396092)

    //Criando as contas poupanças
    val contaPoupancaDoFulano = ContaPoupanca("Fulano", 2108701790)
    val contaPoupancaDoCiclano = ContaPoupanca("Ciclano", 1202166505)

    //Imprimindo as contas
    println()
    println("Antes do depósito:")
    println(contaCorrenteDoZe)
    println(contaCorrenteDoJoao)
    println(contaPoupancaDoFulano)
    println(contaPoupancaDoCiclano)
    println()

    //Adicionando dinheiro as contas
    contaCorrenteDoZe.depositar(2000.00)
    contaCorrenteDoJoao.depositar(4000.00)
    contaPoupancaDoCiclano.depositar(8000.00)
    contaPoupancaDoFulano.depositar(16000.00)

    //Imprimindo as contas
    println()
    println("Depois do depósito e antes do saque:")
    println(contaCorrenteDoZe)
    println(contaCorrenteDoJoao)
    println(contaPoupancaDoFulano)
    println(contaPoupancaDoCiclano)
    println()

    //Sacando dinheiro das contas
    contaCorrenteDoJoao.sacar(200.00)
    contaCorrenteDoZe.sacar(400.00)
    contaPoupancaDoCiclano.sacar(800.00)
    contaPoupancaDoFulano.sacar(1600.00)

    //Imprimindo as contas
    println()
    println("Depois do saque e antes da transferência")
    println(contaCorrenteDoZe)
    println(contaCorrenteDoJoao)
    println(contaPoupancaDoFulano)
    println(contaPoupancaDoCiclano)
    println()

    //Transferindo dinheiro entre as contas
    contaCorrenteDoJoao.transferir(contaPoupancaDoCiclano, 200.00)
    contaCorrenteDoZe.transferir(contaCorrenteDoJoao, 400.00)
    contaPoupancaDoCiclano.transferir(contaPoupancaDoFulano, 800.00)
    contaCorrenteDoZe.transferir(contaPoupancaDoCiclano, 600.00)

    //Imprimindo as contas
    println()
    println("Depois da transferência")
    println(contaCorrenteDoZe)
    println(contaCorrenteDoJoao)
    println(contaPoupancaDoFulano)
    println(contaPoupancaDoCiclano)
    println()

}

fun main() {
    testaComportamentosConta()
}