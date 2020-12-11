package henriquemcc.aprendendo.kotlin.bytebank.modelo

import java.util.*

/**
 * Representa um Funcionario do Bytebank.
 */
abstract class Funcionario
{
    var nome: String
        protected set(value)
        {
            field = value.capitalize()
        }

    var cpf: String
        protected set(value)
        {
            field = value.replace(".", "").replace("-", "")
        }


    var salario: Double = 0.0
        protected set(value)
        {
            if (salario < 0)
            {
                throw InputMismatchException("O valor do salário não pode ser menor que zero")
            }

            field = value
        }

    /**
     * Cria uma nova instância da classe Funcionário.
     * @param cpf CPF do Fucionário.
     * @param nome Nome do Funcionário.
     * @param salario Salário do Funcionário.
     */
    constructor(nome: String = "", cpf: String = "", salario: Double = 0.0)
    {
        this.nome = nome
        this.cpf = cpf
        this.salario = salario
    }

    //Calcula a bonificação do funcionário.
    abstract val bonificacao: Double


    /**
     * Verifica se duas instâncias desta classe são iguais.
     * @param other Outra instância que será comparada.
     * @return Valor booleano indicando se as duas instâncias são iguais.
     */
    override fun equals(other: Any?): Boolean
    {
        if (this === other) return true
        if (other !is Funcionario) return false

        if (nome != other.nome) return false
        if (cpf != other.cpf) return false
        if (salario != other.salario) return false
        if (bonificacao != other.bonificacao) return false

        return true
    }

    /**
     * Gera o código hash de uma instância desta classe.
     * @return Número inteiro contendo o código hash de uma instância desta classe.
     */
    override fun hashCode(): Int
    {
        var result = nome.hashCode()
        result = 31 * result + cpf.hashCode()
        result = 31 * result + salario.hashCode()
        result = 31 * result + bonificacao.hashCode()
        return result
    }

    /**
     * Gera uma representação no formato de uma string dos atributos de uma instância desta classe.
     * @return Representação no formato de uma string dos atributos de uma instância desta classe.
     */
    override fun toString(): String
    {
        return "Funcionario(nome='$nome', cpf='$cpf', salario=$salario, bonificacao=$bonificacao)"
    }


}