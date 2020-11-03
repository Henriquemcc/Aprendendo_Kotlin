package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa um Funcionario do Bytebank.
 * @param nome Nome do funcionário.
 * @param cpf CPF do funcionário.
 * @param salario Salário do funcionário.
 * */
abstract class Funcionario (val nome: String, val cpf: String, val salario: Double) {

    /**
     * Calcula a bonificação do funcionário.
     * */
    abstract val bonificacao: Double

    /**
     * Serve para converter uma instancia da classe Funcionario em uma String.
     * @return String contendo os dados da classe Funcionario.
     * */
    abstract override fun toString(): String
}