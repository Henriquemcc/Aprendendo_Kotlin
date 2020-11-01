package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa um Gerente, que é um subtipo de Funcionario.
 */
class Gerente : FuncionarioAdministrador {

    /**
     * Serve para criar uma nova instancia de Gerente.
     * @param nome Nome do gerente.
     * @param cpf Cpf do gerente.
     * @param salario Salario do gerente.
     * @param senha Senha do gerente.
     * */
    constructor(nome: String, cpf: String, salario: Double, senha: String) : super(nome, cpf, salario, senha)

    /**
     * Calcula a bonificação do gerente.
     * @return Valor da bonificação do gerente.
     * */
    override val bonificacao: Double
        get() = this.salario * 1.1

    /**
     * Serve para converter uma instancia da classe Gerente em uma String.
     * @return String contendo os dados da classe Gerente.
     * */
    override fun toString(): String {
        var str = ""
        str += "Nome: " + this.nome + "\n"
        str += "CPF: " + this.cpf + "\n"
        str += "Tipo de funcionário: Gerente\n"
        str += "Salario: " + this.salario + "\n"
        str += "Bonificação: " + bonificacao

        return str
    }
}