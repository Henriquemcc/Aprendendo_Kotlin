package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa um Auxiliar, que é um subtipo de Funcionario.
 */
class Auxiliar : Funcionario {

    /**
     * Cria uma nova instancia de Auxiliar.
     * @param nome Nome do auxiliar.
     * @param cpf CPF do auxiliar.
     * @param salario Salario do auxiliar.
     */
    constructor(nome: String, cpf: String, salario: Double) : super(nome, cpf, salario)

    override val bonificacao: Double
        get() = 0.0

    /**
     * Serve para converter uma instancia da classe Funcionario em uma String.
     * @return String contendo os dados da classe Funcionario.
     * */
    override fun toString(): String {
        var str = ""
        str += "Nome: " + this.nome + "\n"
        str += "CPF: " + this.cpf + "\n"
        str += "Tipo de funcionário: Auxiliar\n"
        str += "Salario: " + this.salario + "\n"
        str += "Bonificação: " + this.bonificacao

        return str
    }
}