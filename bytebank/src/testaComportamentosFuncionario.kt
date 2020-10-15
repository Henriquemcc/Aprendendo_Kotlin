/**
 * Serve para testar os comportamentos de uma instancia da classe Funcionario.
 * */
fun testaComportamentosFuncionario() {

    //Criando o Joao
    val joao = Funcionario(nome = "João da Silva", cpf = "680.915.820-05", salario = 1000.00)

    println(joao.toString())
}

/**
 * Serve para executar a funcao testaComportamentosFuncionario ao clicar para executar este arquivo.
 * */
private fun main() {
    testaComportamentosFuncionario()
}