package henriquemcc.aprendendo.kotlin.bytebank.modelo

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException

/**
 *
 */
class Endereco {
    private var estado: String = ""
        set(value) {
            field = value.toUpperCase()
        }
    /**
     *
     */
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
            if ((!value.trim().chars().allMatch(Character::isDigit)) && (value.isNotEmpty()))
                throw ValueException("Não é um número")

            field = value.trim()
        }
    private var complemento: String = ""
        set(value) {
            if ((!value.trim().chars().allMatch(Character::isDigit)) && (value.isNotEmpty()))
                throw ValueException("Não é um número")

            field = value.trim()
        }
    private var cep: String = ""
        set(value) {
            value.replace("-", "")
            if ((!value.trim().chars().allMatch(Character::isDigit)) && (value.isNotEmpty()))
                throw ValueException("Não é um número")

            field = value.trim()
        }

    /**
     *
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

    constructor()

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