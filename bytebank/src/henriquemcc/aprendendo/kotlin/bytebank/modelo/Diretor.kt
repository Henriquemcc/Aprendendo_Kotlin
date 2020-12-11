package henriquemcc.aprendendo.kotlin.bytebank.modelo

import java.util.*

/**
 * Representa um Diretor, que é um subtipo de Funcionario.
 */
class Diretor : FuncionarioAdministrador
{
    var plr: Double
        private set(value)
        {
            if (value < 0)
            {
                throw InputMismatchException("O valor da plr não pode ser inferior a zero")
            }

            field = value
        }


    /**
     * Cria uma nova instância da classe Diretor
     * @param nome Nome do diretor.
     * @param cpf CPF do diretor.
     * @param salario Salário do diretor.
     * @param senha Senha do diretor.
     * @param plr PLR do diretor.
     */
    constructor(nome: String = "", cpf: String = "", salario: Double = 0.0, senha: String = "", plr: Double = 0.0) : super(nome, cpf, salario, senha)
    {
        this.plr = plr
    }

    /**
     * Calcula a bonificação do diretor.
     * @return Valor da bonificação do diretor.
     * */
    override val bonificacao: Double
        get() = this.salario * 1.1 + this.plr


    /**
     * Verifica se duas instâncias desta classe são iguais.
     * @param other Outra instância que será comparada.
     * @return Valor booleano indicando se as duas instâncias são iguais.
     */
    override fun equals(other: Any?): Boolean
    {
        if (this === other) return true
        if (other !is Diretor) return false
        if (!super.equals(other)) return false

        if (plr != other.plr) return false
        if (bonificacao != other.bonificacao) return false

        return true
    }

    /**
     * Gera o código hash de uma instância desta classe.
     * @return Número inteiro contendo o código hash de uma instância desta classe.
     */
    override fun hashCode(): Int
    {
        var result = super.hashCode()
        result = 31 * result + plr.hashCode()
        result = 31 * result + bonificacao.hashCode()
        return result
    }

    /**
     * Gera uma representação no formato de uma string dos atributos de uma instância desta classe.
     * @return Representação no formato de uma string dos atributos de uma instância desta classe.
     */
    override fun toString(): String
    {
        return "Diretor(plr=$plr, bonificacao=$bonificacao) ${super.toString()}"
    }


}