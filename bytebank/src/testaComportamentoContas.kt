fun testaComportamentoContas() {

    //Criando as contas
    val contaCorrenteJoao = ContaCorrente("João", 52)
    contaCorrenteJoao.depositar(2000.00)
    val contaPoupancaJose = ContaPoupanca("José", 39)
    contaPoupancaJose.depositar(3000.00)

    //Imprimindo as contas
    println()
    println("Antes do saque:")
    println(contaCorrenteJoao)
    println(contaPoupancaJose)

    //Sacando
    contaCorrenteJoao.sacar(200.00)
    contaPoupancaJose.sacar(200.00)

    //Imprimindo as contas
    println()
    println("Depois do saque e antes da transferência")
    println(contaCorrenteJoao)
    println(contaPoupancaJose)

    //Transferindo dinheiro entre as contas
    contaCorrenteJoao.transferir(contaPoupancaJose, 500.00)

    //Imprimindo as contas
    println()
    println("Depois da tranferência")
    println(contaCorrenteJoao)
    println(contaPoupancaJose)
}

fun main()
{
    testaComportamentoContas()
}