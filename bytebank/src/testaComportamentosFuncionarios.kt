fun testaComportamentosFuncionarios(){

    //Criando os analistas
    val joao = Analista("João", "657.107.710-82", 1000.00)
    val jose = Analista("José", "740.716.030-97", 1000.00)
    val maria = Analista("Maria", "993.056.680-54", 1000.00)
    val ana = Analista("Ana", "431.298.790-48", 1000.00)

    //Criando os gerentes
    val antonio = Gerente("Antônio", "796.517.990-30", 2000.00, "0I\$QOUmSTt7Oujg#dVyD8gLrFWXcljOvaqz1ACldUSksnBBMe2")
    val francisca = Gerente("Francisca", "999.944.120-35", 2000.00, "2J7^&jiozXQu9NN&sU1!pM6DCSkAx3\$YlxVX!kDukd^vC97\$si")

    //Criando o diretor
    val carlos = Diretor("Carlos", "151.854.380-45", 4000.00, "lgTw4bEqSlRy#BcyMUkh#yzzpYepK1L@if\$Ojm7AHMIixHlt\$G", 2000.00)

    //Imprimindo todos os funcionarios
    println()
    println()
    println(joao)
    println()
    println(jose)
    println()
    println(maria)
    println()
    println(ana)
    println()
    println(antonio)
    println()
    println(francisca)
    println()
    println(carlos)
    println()
    println()

    //Calculando a bonificação
    val calculadoraBonificacao = CalculadoraBonificacao()
    calculadoraBonificacao.registra(joao)
    calculadoraBonificacao.registra(jose)
    calculadoraBonificacao.registra(maria)
    calculadoraBonificacao.registra(ana)
    calculadoraBonificacao.registra(antonio)
    calculadoraBonificacao.registra(francisca)
    calculadoraBonificacao.registra(carlos)

    //Imprimindo a bonificação
    println("Valor total gasto com a bonificação dos funcionários: ${calculadoraBonificacao.total}")
}

private fun main(){
    testaComportamentosFuncionarios()
}