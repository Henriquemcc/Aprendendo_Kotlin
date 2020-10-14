/**
 * Representa um funcionario do Bytebank.
 * */
class Funcionario(val nome: String, val cpf: String, val salario: Double) {

    /**
     * Serve para calcular a bonificacao de uma instancia da classe Funcionario.
     * @return Valor da bonificacao do funcionario.
     * */
    fun bonificacao(): Double {
        return this.salario * 0.10
    }

    /**
     * Serve para converter uma instancia da classe Funcionario em uma String.
     * @return String contendo os dados da classe Funcionario.
     * */
    override fun toString(): String {
        var str = ""
        str += "Nome: " + this.nome + "\n"
        str += "CPF: " + this.cpf + "\n"
        str += "Salario: " + this.salario

        return str
    }
}