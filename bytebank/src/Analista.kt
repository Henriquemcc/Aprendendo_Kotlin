/**
 *
 * @param nome Nome do analista.
 * @param cpf Cpf do analista.
 * @param salario Salario do analista.
 * */
class Analista(nome: String, cpf: String, salario: Double) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    /**
     * Calcula a bonificação do analista.
     * @return Valor da bonificação do analista.
     * */
    override val bonificacao: Double
        get() = this.salario * 0.2

    /**
     * Serve para converter uma instancia da classe analista em uma String.
     * @return String contendo os dados da classe analista.
     * */
    override fun toString(): String {
        var str = ""
        str += "Nome: " + this.nome + "\n"
        str += "CPF: " + this.cpf + "\n"
        str += "Salario: " + this.salario + "\n"
        str += "Bonificação: " + bonificacao

        return str
    }
}