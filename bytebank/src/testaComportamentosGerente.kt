/**
 * Serve para testar os comportamentos de uma instancia da classe Gerente.
 * */
fun testaComportamentosGerente() {

    //Criando o Janio
    val felipe = Gerente(nome = "Felipe da Silva", cpf = "341.949.670-20", salario = 20000.00, senha = "H@3S7Fguv!FOPXW4AB3*qSmR*iWJeJ2QEV8vGqXbHPsLHuQY@*")

    println(felipe.toString())

    println("Autenticando: " + felipe.autentica("1234"))
    println("Autenticando de novo: " + felipe.autentica("H@3S7Fguv!FOPXW4AB3*qSmR*iWJeJ2QEV8vGqXbHPsLHuQY@*"))
}

/**
 * Serve para executar a funcao testaComportamentosGerente ao clicar para executar este arquivo.
 * */
private fun main() {
    testaComportamentosGerente()
}