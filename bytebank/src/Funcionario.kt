/**
 * Representa um funcionario do Bytebank.
 * @param nome Nome do funcionario.
 * @param cpf Cpf do funcionario.
 * @param salario Salario do funcionario.
 * */
abstract class Funcionario(val nome: String, val cpf: String, val salario: Double) {

    /**
     * Calcula a bonificação do funcionário.
     * @return Valor da bonificação do funcionário.
     * */
    open val bonificacao: Double
        get() = this.salario * 0.1

    /**
     * Serve para converter uma instancia da classe Funcionario em uma String.
     * @return String contendo os dados da classe Funcionario.
     * */
    override fun toString(): String {
        var str = ""
        str += "Nome: " + this.nome + "\n"
        str += "CPF: " + this.cpf + "\n"
        str += "Salario: " + this.salario + "\n"
        str += "Bonificação: " + this.bonificacao

        return str
    }
}