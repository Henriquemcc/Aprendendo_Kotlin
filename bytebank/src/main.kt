fun main()
{
    //Criando a conta do Joao
    val contaJoao = Conta()
    contaJoao.setTitular("João")
    contaJoao.setNumero(1)
    contaJoao.depositar(5000.00)

    //Criando a conta do Jose
    val contaJose = Conta()
    contaJose.setTitular("José")
    contaJose.setNumero(2)
    contaJose.depositar(7000.00)

    //Criando a conta da Maria
    val contaMaria = Conta()
    contaMaria.setTitular("Maria")
    contaMaria.setNumero(3)
    contaMaria.depositar(3000.00)

    //Criando a conta do Lucas
    val contaLucas = Conta()
    contaLucas.setTitular("Lucas")
    contaLucas.setNumero(4)
    contaLucas.depositar(1234.00)

    //Imprimindo as contas
    println("Conta do João")
    println(contaJoao.getTitular())
    println(contaJoao.getNumero())
    println(contaJoao.getSaldo())
    println()

    println("Conta do José")
    println(contaJose.getTitular())
    println(contaJose.getNumero())
    println(contaJose.getSaldo())
    println()

    println("Conta da Maria")
    println(contaMaria.getTitular())
    println(contaMaria.getNumero())
    println(contaMaria.getSaldo())
    println()

    println("Conta do Lucas")
    println(contaLucas.getTitular())
    println(contaLucas.getNumero())
    println(contaLucas.getSaldo())
    println()
}