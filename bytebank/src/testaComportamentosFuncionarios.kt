fun testaComportamentosFuncionarios() {

    //Criando auxiliares
    val rodrigo = Auxiliar("Rodrigo", "679.415.150-24", 500.00)
    val mariana = Auxiliar("Mariana", "751.489.410-14", 500.00)
    val raimundo = Auxiliar("Raimundo", "740.275.550-90", 500.00)
    val vanessa = Auxiliar("Vanessa", "769.088.680-95", 500.00)
    val felipe = Auxiliar("Felipe", "472.570.610-84", 500.00)
    val luciana = Auxiliar("Luciana", "314.584.100-99", 500.00)
    val eduardo = Auxiliar("Eduardo", "110.078.260-53", 500.00)
    val julia = Auxiliar("Julia", "152.150.670-15", 500.00)

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
    println(rodrigo)
    println()
    println(mariana)
    println()
    println(raimundo)
    println()
    println(vanessa)
    println()
    println(felipe)
    println()
    println(luciana)
    println()
    println(eduardo)
    println()
    println(julia)
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
    calculadoraBonificacao.registra(rodrigo)
    calculadoraBonificacao.registra(mariana)
    calculadoraBonificacao.registra(raimundo)
    calculadoraBonificacao.registra(vanessa)
    calculadoraBonificacao.registra(felipe)
    calculadoraBonificacao.registra(luciana)
    calculadoraBonificacao.registra(eduardo)
    calculadoraBonificacao.registra(julia)

    //Imprimindo a bonificação
    println("Valor total gasto com a bonificação dos funcionários: ${calculadoraBonificacao.total}")

    //Testando autenticação
    val sistemaInterno = SistemaInterno()
    sistemaInterno.login(antonio, "0I\$QOUmSTt7Oujg#dVyD8gLrFWXcljOvaqz1ACldUSksnBBMe2")
    sistemaInterno.login(francisca, "1234567890")
    sistemaInterno.login(carlos, "lgTw4bEqSlRy#BcyMUkh#yzzpYepK1L@if\$Ojm7AHMIixHlt\$G")
}

fun main() {
    testaComportamentosFuncionarios()
}