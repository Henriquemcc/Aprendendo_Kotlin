package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa um Funcionario do Bytebank.
 * */
abstract class Funcionario/*
    * Cria uma nova instancia de Funcionario.
    * @param nome Nome do funcionario.
    * @param cpf Cpf do funcionario.
    * @param salario Salario do funcionario.
    * */(//Atributos
        /**
         *
         */
        val nome: String,/**
         *
         */
        val cpf: String,/**
         *
         */
        val salario: Double) {

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