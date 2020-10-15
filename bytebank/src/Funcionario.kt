/**
 * Representa um funcionario do Bytebank.
 * @param nome Nome do funcionario.
 * @param cpf Cpf do funcionario.
 * @param salario Salario do funcionario.
 * @param tipo Tipo do funcionario: 0 - Funcionario comum; 1- Gerente; 2- Diretor.
 * */
class Funcionario(val nome: String, val cpf: String, val salario: Double, val tipo: Int = 0) {

    /**
     * Serve para calcular a bonificacao de uma instancia da classe Funcionario.
     * @return Valor da bonificacao do funcionario.
     * */
    fun bonificacao(): Double {
        var bonificacao: Double = 0.0;

        when (this.tipo)
        {
            0 -> {
                bonificacao = this.salario * 0.1
            }
            1 -> {
                bonificacao = this.salario * 0.2
            }
            3 -> {
                bonificacao = this.salario * 0.3
            }
        }
        return bonificacao
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
        str += "Tipo: " + this.tipo

        return str
    }
}