/**
 * Representa um Funcionario do Bytebank.
 * */
abstract class Funcionario {

    //Atributos
    var nome: String;
    var cpf: String
    var salario: Double

    /*
    * Cria uma nova instancia de Funcionario.
    * @param nome Nome do funcionario.
    * @param cpf Cpf do funcionario.
    * @param salario Salario do funcionario.
    * */
    constructor(nome: String, cpf: String, salario: Double){
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
    override fun toString(): String {
        var str = ""
        str += "Nome: " + this.nome + "\n"
        str += "CPF: " + this.cpf + "\n"
        str += "Salario: " + this.salario + "\n"
        str += "Bonificação: " + this.bonificacao

        return str
    }
}