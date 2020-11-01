/**
 * Representa um Diretor, que é um subtipo de Funcionario.
 */
class Diretor : FuncionarioAdministrador {

    val plr: Double

    /**
     * Serve para criar uma nova instancia de Diretor.
     * @param nome Nome do diretor.
     * @param cpf Cpf do diretor.
     * @param salario Salario do diretor.
     * @param senha Senha do diretor.
     * */
    constructor(nome: String, cpf: String, salario: Double, senha: String, plr: Double) : super(nome, cpf, salario, senha) {
        this.plr = plr
    }

    /**
     * Calcula a bonificação do diretor.
     * @return Valor da bonificação do diretor.
     * */
    override val bonificacao: Double
        get() = this.salario * 1.1 + this.plr

    /**
     * Serve para converter uma instancia da classe Diretor em uma String.
     * @return String contendo os dados da classe Diretor.
     * */
    override fun toString(): String {
        var str = ""
        str += "Nome: " + this.nome + "\n"
        str += "CPF: " + this.cpf + "\n"
        str += "Tipo de funcionário: Diretor\n"
        str += "Salario: " + this.salario + "\n"
        str += "Bonificação: " + this.bonificacao + "\n"
        str += "Programa de Participação nos Lucros e Resultados: " + this.plr

        return str
    }
}