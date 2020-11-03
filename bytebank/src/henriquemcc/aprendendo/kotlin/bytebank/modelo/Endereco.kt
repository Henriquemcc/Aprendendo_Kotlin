package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa um endereço
 */
class Endereco {
    private var estado: String = ""
        set(value) {
            field = value.toUpperCase()
        }
    var cidade: String = ""
        set(value) {
            field = value.toUpperCase()
        }
    private var bairro: String = ""
        set(value) {
            field = value.toUpperCase()
        }
    private var logradouro: String = ""
        set(value) {
            field = value.toUpperCase()
        }
    private var numero: String = ""
        set(value) {
            if (value != "")
                try {
                    Integer.parseInt(value)
                }
                catch (e: NumberFormatException) {
                    throw IllegalArgumentException("Não é um número")
                }

            field = value.trim()
        }
    private var complemento: String = ""
        set(value) {
            if (value != "")
                try {
                    Integer.parseInt(value)
                }
                catch (e: NumberFormatException) {
                    throw IllegalArgumentException("Não é um número")
                }

            field = value.trim()
        }
    private var cep: String = ""
        set(value) {
            val newValue = value.replace("-", "")
            if (newValue != "")
                try {
                    Integer.parseInt(newValue)
                }
                catch (e: NumberFormatException) {
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
    constructor(estado: String, cidade: String, bairro: String, logradouro: String, numero: String, complemento: String, cep: String) {
        this.estado = estado
        this.cidade = cidade
        this.bairro = bairro
        this.logradouro = logradouro
        this.numero = numero
        this.complemento = complemento
        this.cep = cep
    }

    /**
     * Cria uma nova instância de Endereço sem nenhum valor.
     */
    constructor()

    /**
     * Converte uma instância de Endereco em uma String com os dados do endereço.
     */
    override fun toString(): String {
        var str = "# Endereço:\n"
        if (this.estado.isNotBlank())
            str += "Estado: " + this.estado + "\n"
        if (this.cidade.isNotBlank())
            str += "Cidade: " + this.cidade + "\n"
        if (this.bairro.isNotBlank())
            str += "Bairro: " + this.bairro + "\n"
        if (this.logradouro.isNotBlank())
            str += "Logradouro: " + this.logradouro + "\n"
        if (this.numero.isNotBlank())
            str += "Número: " + this.numero + "\n"
        if (this.complemento.isNotBlank())
            str += "Complemento: " + this.complemento + "\n"
        if (this.cep.isNotBlank())
            str += "CEP: " + this.cep

        return str
    }
}