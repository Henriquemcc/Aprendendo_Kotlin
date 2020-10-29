fun testaComportamentoCalculadoraBonificacao() {

    //Criando os funcionarios ficticios cujos cpfs e senhas foram gerados aleatoriamente
    val joao = Funcionario("João", "329.405.280-47", 1000.00)
    val jose = Funcionario("José", "647.439.580-08", 1000.00)
    val carlos = Funcionario("Carlos", "227.846.520-17", 1000.00)
    val paulo = Funcionario("Paulo", "712.825.780-22", 1000.00)
    val ana = Analista("Ana", "608.837.790-99", 1500.00)
    val francisca = Analista("Francisca", "311.322.720-84", 1500.00)
    val maria = Gerente("Maria", "678.473.440-84", 2000.00, "2bCenhxvBt7pYzABg@Fr@o@*bTr\$Se1T5\$ca^@mo4@Cfbs^2pX")
    val antonio = Gerente("Antonio", "882.007.310-22", 2000.00, "@rRd4uPJWleHxSH1AIh3!YJp!0ztm230ekeE1i%EhqTcdOoAgA")
    val francisco = Gerente("Francisco", "388.563.100-82", 2000.00, "DylcKpTYW!%BFk&69eOv!p4aYnFvkCfP*WYOrtTQLEI6ZN8r&Z")
    val pedro = Diretor("Pedro", "590.801.400-15", 6000.00, "0ojxuZt5HFbvsHGH@H7^a0UAUQRsoP9#N&%UATDv&0jOKIRIA9", 2000.00)

    //Calculando a bonificacao
    val calculadoraBonificacao = CalculadoraBonificacao()
    calculadoraBonificacao.registra(joao)
    calculadoraBonificacao.registra(jose)
    calculadoraBonificacao.registra(carlos)
    calculadoraBonificacao.registra(paulo)
    calculadoraBonificacao.registra(antonio)
    calculadoraBonificacao.registra(francisco)
    calculadoraBonificacao.registra(pedro)
    calculadoraBonificacao.registra(ana)
    calculadoraBonificacao.registra(francisca)
    calculadoraBonificacao.registra(maria)

    println("Total de bonificação ${calculadoraBonificacao.total}")


}

fun main() {
    testaComportamentoCalculadoraBonificacao()
}