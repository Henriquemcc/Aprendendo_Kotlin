package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa um Diretor, que é um subtipo de Funcionario.
 */
class Diretor
/**
 * Serve para criar uma nova instancia de Diretor.
 * @param nome Nome do diretor.
 * @param cpf Cpf do diretor.
 * @param salario Salario do diretor.
 * @param senha Senha do diretor.
 * */
(nome: String, cpf: String, salario: Double, senha: String, private val plr: Double) : FuncionarioAdministrador(nome, cpf, salario, senha)
{

    /**
     * Calcula a bonificação do diretor.
     * @return Valor da bonificação do diretor.
     * */
    override val bonificacao: Double
        get() = this.salario * 1.1 + this.plr

    /**
     * Serve para converter uma instancia da classe Diretor em uma String.
     * @return String contendo os dados da classe Diretor.
     * */
    override fun toString(): String
    {

        return """# Diretor:
Nome: ${this.nome}
CPF: ${this.cpf}
Salário: ${this.salario}
Bonificação: ${this.bonificacao}
Programa de Participação nos Lucros e Resultados: ${this.plr}"""
    }
}