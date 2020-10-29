fun testaComportamentoCalculadoraBonificacao() {

    //Criando os funcionarios ficticios
    val joao = Funcionario("João", "329.405.280-47", 1000.00)
    val jose = Funcionario("José", "647.439.580-08", 1000.00)
    val carlos = Funcionario("Carlos", "227.846.520-17", 1000.00)
    val paulo = Funcionario("Paulo", "712.825.780-22", 1000.00)
    val antonio = Gerente("Antonio", "882.007.310-22", 2000.00, "@rRd4uPJWleHxSH1AIh3!YJp!0ztm230ekeE1i%EhqTcdOoAgA")
    val francisco = Gerente("Francisco", "388.563.100-82", 2000.00, "DylcKpTYW!%BFk&69eOv!p4aYnFvkCfP*WYOrtTQLEI6ZN8r&Z")
    val pedro = Diretor("Pedro", "590.801.400-15", 4000.00, "0ojxuZt5HFbvsHGH@H7^a0UAUQRsoP9#N&%UATDv&0jOKIRIA9", 2000.00)

    //Calculando a bonificacao
    val calculadoraBonificacao = CalculadoraBonificacao()
    calculadoraBonificacao.registra(joao)
    calculadoraBonificacao.registra(jose)
    calculadoraBonificacao.registra(carlos)
    calculadoraBonificacao.registra(paulo)
    calculadoraBonificacao.registra(antonio)
    calculadoraBonificacao.registra(francisco)
    calculadoraBonificacao.registra(pedro)

    println("Total de bonificação ${calculadoraBonificacao.total}")


}

fun main() {
    testaComportamentoCalculadoraBonificacao()
}