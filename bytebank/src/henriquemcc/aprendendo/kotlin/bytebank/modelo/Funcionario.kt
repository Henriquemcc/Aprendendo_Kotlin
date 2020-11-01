package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa um Funcionario do Bytebank.
 * */
abstract class Funcionario {

    //Atributos
    val nome: String;
    val cpf: String
    val salario: Double

    /*
    * Cria uma nova instancia de Funcionario.
    * @param nome Nome do funcionario.
    * @param cpf Cpf do funcionario.
    * @param salario Salario do funcionario.
    * */
    constructor(nome: String, cpf: String, salario: Double) {
        this.nome = nome
        this.cpf = cpf
        this.salario = salario
    }

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