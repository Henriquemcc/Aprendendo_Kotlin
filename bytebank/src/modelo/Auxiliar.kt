package modelo

/**
 * Representa um modelo.Auxiliar, que é um subtipo de modelo.Funcionario.
 */
class Auxiliar : Funcionario {

    /**
     * Cria uma nova instancia de modelo.Auxiliar.
     * @param nome Nome do auxiliar.
     * @param cpf CPF do auxiliar.
     * @param salario Salario do auxiliar.
     */
    constructor(nome: String, cpf: String, salario: Double) : super(nome, cpf, salario)

    override val bonificacao: Double
        get() = 0.0

    /**
     * Serve para converter uma instancia da classe modelo.Funcionario em uma String.
     * @return String contendo os dados da classe modelo.Funcionario.
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