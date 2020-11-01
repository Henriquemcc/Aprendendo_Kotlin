package modelo

/**
 * Representa um modelo.Funcionario do Bytebank.
 * */
abstract class Funcionario {

    //Atributos
    val nome: String;
    val cpf: String
    val salario: Double

    /*
    * Cria uma nova instancia de modelo.Funcionario.
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
     * Serve para converter uma instancia da classe modelo.Funcionario em uma String.
     * @return String contendo os dados da classe modelo.Funcionario.
     * */
    abstract override fun toString(): String
}