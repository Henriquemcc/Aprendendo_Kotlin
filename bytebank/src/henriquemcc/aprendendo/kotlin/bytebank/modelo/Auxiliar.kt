package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa um Auxiliar, que é um subtipo de Funcionario.
 */
class Auxiliar
/**
 * Cria uma nova instancia de Auxiliar.
 * @param nome Nome do auxiliar.
 * @param cpf CPF do auxiliar.
 * @param salario Salario do auxiliar.
 */
(nome: String, cpf: String, salario: Double) : Funcionario(nome, cpf, salario)
{

    override val bonificacao: Double
        get() = 0.0

    /**
     * Serve para converter uma instancia da classe Funcionario em uma String.
     * @return String contendo os dados da classe Funcionario.
     * */
    override fun toString(): String
    {

        return """# Auxiliar
Nome: ${this.nome}
CPF: ${this.cpf}
Salário: ${this.salario}
Bonificação: ${this.bonificacao}"""
    }
}