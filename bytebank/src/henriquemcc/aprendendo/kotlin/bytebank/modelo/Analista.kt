package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa um Analista, que é um subtipo de Funcionario.
 */
class Analista
/**
 * Cria uma nova instancia de Analista.
 * @param nome Nome do analista.
 * @param cpf Cpf do analista.
 * @param salario Salario do analista.
 * */
(nome: String, cpf: String, salario: Double) : Funcionario(nome, cpf, salario)
{

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
    override fun toString(): String
    {

        return """# Analista
Nome: ${this.nome}
CPF: ${this.cpf}
Salário: ${this.salario}
Bonificação: ${bonificacao}"""
    }
}