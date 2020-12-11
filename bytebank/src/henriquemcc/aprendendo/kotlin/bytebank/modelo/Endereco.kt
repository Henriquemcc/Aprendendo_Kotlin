package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa um endereço
 */
class Endereco
{
    private var estado: String = ""
        set(value)
        {
            field = value.toUpperCase()
        }
    var cidade: String = ""
        set(value)
        {
            field = value.toUpperCase()
        }
    private var bairro: String = ""
        set(value)
        {
            field = value.toUpperCase()
        }
    private var logradouro: String = ""
        set(value)
        {
            field = value.toUpperCase()
        }
    private var numero: String = ""
        set(value)
        {
            if (value != "")
                try
                {
                    Integer.parseInt(value)
                }
                catch (e: NumberFormatException)
                {
                    throw IllegalArgumentException("Não é um número")
                }

            field = value.trim()
        }
    private var complemento: String = ""
        set(value)
        {
            if (value != "")
                try
                {
                    Integer.parseInt(value)
                }
                catch (e: NumberFormatException)
                {
                    throw IllegalArgumentException("Não é um número")
                }

            field = value.trim()
        }
    private var cep: String = ""
        set(value)
        {
            val newValue = value.replace("-", "")
            if (newValue != "")
                try
                {
                    Integer.parseInt(newValue)
                }
                catch (e: NumberFormatException)
                {
                    throw IllegalArgumentException("Não é um número")
                }

            field = newValue.trim()
        }

    /**
     * Cria uma nova instância de Endereco
     * @param estado Estado do endereço.
     * @param cidade Cidade do endereço.
     * @param bairro Bairro do endereço.
     * @param logradouro Logradouro do endereço.
     * @param numero Número do endereço.
     * @param complemento Complemento do endereço.
     * @param cep Código postal do endereço.
     */
    constructor(estado: String = "", cidade: String = "", bairro: String = "", logradouro: String = "", numero: String = "", complemento: String = "", cep: String = "")
    {
        this.estado = estado
        this.cidade = cidade
        this.bairro = bairro
        this.logradouro = logradouro
        this.numero = numero
        this.complemento = complemento
        this.cep = cep
    }

    /**
     * Converte uma instância desta classe em uma String.
     * @return String contendo os dados da instância desta classe.
     */
    override fun toString(): String
    {
        return """Endereco
            |(
            |estado='$estado',
            |cidade='$cidade',
            |bairro='$bairro',
            |logradouro='$logradouro',
            |numero='$numero',
            |complemento='$complemento',
            |cep='$cep'
            |)""".trimMargin()
    }

    /**
     * Compara duas instâncias desta classe par ver se são iguais.
     * @param other Outra instância desta classe a ser comparada.
     * @return Valor booleano indicando se as instâncias são iguais.
     */
    override fun equals(other: Any?): Boolean
    {
        if (this === other) return true
        if (other !is Endereco) return false

        if (estado != other.estado) return false
        if (cidade != other.cidade) return false
        if (bairro != other.bairro) return false
        if (logradouro != other.logradouro) return false
        if (numero != other.numero) return false
        if (complemento != other.complemento) return false
        if (cep != other.cep) return false

        return true
    }

    /**
     * Obtém o hash code desta instância desta classe.
     * @return Número inteiro com o hash desta instância desta classe.
     */
    override fun hashCode(): Int
    {
        var result = estado.hashCode()
        result = 31 * result + cidade.hashCode()
        result = 31 * result + bairro.hashCode()
        result = 31 * result + logradouro.hashCode()
        result = 31 * result + numero.hashCode()
        result = 31 * result + complemento.hashCode()
        result = 31 * result + cep.hashCode()
        return result
    }


}