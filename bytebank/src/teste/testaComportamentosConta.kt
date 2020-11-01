package teste

/**
 * Testa comportamentos da classe modelo.Conta.
 */
fun testaComportamentosConta() {

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
    contaSalarioDoLuis.depositar(32000.00)
    contaSalarioDaPatricia.depositar(64000.00)

    //Imprimindo as contas
    println()
    println("Depois do depósito e antes do saque:")
    println(contaCorrenteDoZe)
    println(contaCorrenteDoJoao)
    println(contaPoupancaDoFulano)
    println(contaPoupancaDoCiclano)
    println(contaSalarioDoLuis)
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
    println(contaCorrenteDoZe)
    println(contaCorrenteDoJoao)
    println(contaPoupancaDoFulano)
    println(contaPoupancaDoCiclano)
    println(contaSalarioDoLuis)
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
    println(contaCorrenteDoZe)
    println(contaCorrenteDoJoao)
    println(contaPoupancaDoFulano)
    println(contaPoupancaDoCiclano)
    println("modelo.Conta Salário não pode realizar transferência:")
    println(contaSalarioDoLuis)
    println(contaSalarioDaPatricia)
    println()

}

/**
 * Executa este arquivo.
 */
fun main() {
    testaComportamentosConta()
}