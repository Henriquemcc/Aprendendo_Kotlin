package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa um cliente do bytebank.
 */
class Cliente
/**
 * Cria uma nova instancia de Cliente.
 * @param nome Nome do cliente.
 * @param cpf CPF do cliente.
 * @param senha Senha do cliente.
 */(private val nome: String, private val cpf: String, private val senha: String) : Autenticavel {

    /**
     * Verifica se a senha do cliente é válida.
     * @param senha Senha do cliente.
     * @return Valor booleano indicando se foi ou não autenticado.
     */
    override fun autenticar(senha: String): Boolean {
        var autenticado = false

        if (senha == this.senha)
            autenticado = true

        return autenticado
    }

    override fun toString(): String {

        return """# Cliente
Nome: ${this.nome}
CPF: ${this.cpf}"""
    }
}