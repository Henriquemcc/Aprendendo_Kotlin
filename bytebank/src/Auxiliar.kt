/**
 * Representa um Auxiliar, que é um subtipo de Funcionario.
 */
class Auxiliar: Funcionario {

    /**
     * Cria uma nova instancia de Auxiliar.
     * @param nome Nome do auxiliar.
     * @param cpf CPF do auxiliar.
     * @param salario Salario do auxiliar.
     */
    constructor(nome: String, cpf: String, salario: Double) : super(nome, cpf, salario)

    override val bonificacao: Double
        get() = 0.0
}