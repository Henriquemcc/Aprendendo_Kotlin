package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa um endereço
 */
class Endereco
{
    var estado: String = ""
        private set(value)
        {
            field = value.toUpperCase().trim()
        }

    var cidade: String = ""
        set(value)
        {
            field = value.capitalize().trim()
        }

    var bairro: String = ""
        private set(value)
        {
            field = value.capitalize().trim()
        }

    var logradouro: String = ""
        private set(value)
        {
            field = value.capitalize().trim()
        }

    var numero: String = ""
        private set(value)
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
    var complemento: String = ""
        private set(value)
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
    var cep: String = ""
        private set(value)
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
     * Verifica se duas instâncias desta classe são iguais.
     * @param other Outra instância que será comparada.
     * @return Valor booleano indicando se as duas instâncias são iguais.
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
     * Gera o código hash de uma instância desta classe.
     * @return Número inteiro contendo o código hash de uma instância desta classe.
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

    /**
     * Gera uma representação no formato de uma string dos atributos de uma instância desta classe.
     * @return Representação no formato de uma string dos atributos de uma instância desta classe.
     */
    override fun toString(): String
    {
        return "Endereco(estado='$estado', cidade='$cidade', bairro='$bairro', logradouro='$logradouro', numero='$numero', complemento='$complemento', cep='$cep')"
    }


}