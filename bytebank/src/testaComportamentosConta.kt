fun testaComportamentosConta() {
    println("Criando as contas")

    //Criando a conta do Joao
    val contaJoao = Conta(titular = "João", numero = 1)

    //Criando a conta do Jose
    val contaJose = Conta(numero = 2, titular = "José")

    //Criando a conta da Maria
    val contaMaria = Conta("Maria", 3)

    //Criando a conta do Lucas
    val contaLucas = Conta("Lucas", 4)

    //Depositando dinheiro nas contas
    println("Depositando dinheiro nas contas")
    contaJoao.depositar(5000.00)
    contaJose.depositar(7000.00)
    contaMaria.depositar(3000.00)
    contaLucas.depositar(1234.00)

    //Imprimindo as contas
    println("Conta do João")
    println(contaJoao.toString())
    println()

    println("Conta do José")
    println(contaJose.toString())
    println()

    println("Conta da Maria")
    println(contaMaria.toString())
    println()

    println("Conta do Lucas")
    println(contaLucas.toString())
    println()

    //Sacando dinheiro das contas
    println("Sacando")
    contaJoao.sacar(100.00)
    contaJose.sacar(50.00)
    contaMaria.sacar(25.00);
    contaLucas.sacar(15.00);

    //Imprimindo as contas
    println("Conta do João")
    println(contaJoao.toString())
    println()

    println("Conta do José")
    println(contaJose.toString())
    println()

    println("Conta da Maria")
    println(contaMaria.toString())
    println()

    println("Conta do Lucas")
    println(contaLucas.toString())
    println()

    println("Transferindo dinheiro entre as contas")
    contaJoao.transferir(contaJose, 200.00)
    contaJose.transferir(contaLucas, 100.00)
    contaLucas.transferir(contaMaria, 50.00)

    //Imprimindo as contas
    println("Conta do João")
    println(contaJoao.toString())
    println()

    println("Conta do José")
    println(contaJose.toString())
    println()

    println("Conta da Maria")
    println(contaMaria.toString())
    println()

    println("Conta do Lucas")
    println(contaLucas.toString())
    println()
}

private fun main() {
    testaComportamentosConta()
}