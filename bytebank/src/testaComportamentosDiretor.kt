/**
 * Serve para testar os comportamentos de uma instancia da classe Diretor.
 * */
fun testaComportamentosDiretor() {

    //Criando o Janio
    val fulano = Diretor(nome = "Fulando de Tal", cpf = "659.653.700-59", salario = 500000.00, senha = "5Uth7*57l6Q&ALr7sW&5R6Anu#DyD9x!^wW$!kKBojtruLGD%I", plr = 2000.00)

    println(fulano.toString())

    println("Autenticando: " + fulano.autentica("1234"))
    println("Autenticando de novo: " + fulano.autentica("5Uth7*57l6Q&ALr7sW&5R6Anu#DyD9x!^wW$!kKBojtruLGD%I"))
}

/**
 * Serve para executar a funcao testaComportamentosDiretor ao clicar para executar este arquivo.
 * */
private fun main() {
    testaComportamentosDiretor()
}