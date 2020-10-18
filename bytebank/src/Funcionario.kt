/**
 * Representa um funcionario do Bytebank.
 * @param nome Nome do funcionario.
 * @param cpf Cpf do funcionario.
 * @param salario Salario do funcionario.
 * */
open class Funcionario(val nome: String, val cpf: String, val salario: Double) {

    /**
     * Serve para calcular a bonificacao de uma instancia da classe Funcionario.
     * @return Valor da bonificacao do funcionario.
     * */
    fun bonificacao(): Double{
        return this.salario * 0.1
    }

    /**
     * Serve para converter uma instancia da classe Funcionario em uma String.
     * @return String contendo os dados da classe Funcionario.
     * */
    override fun toString(): String {
        var str = ""
        str += "Nome: " + this.nome + "\n"
        str += "CPF: " + this.cpf + "\n"
        str += "Salario: " + this.salario + "\n"
        str += "Bonificação: " + this.bonificacao()

        return str
    }
}