package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa um cliente do bytebank.
 */
class Cliente : Autenticavel {
    var nome: String
        set(value) {
            field = value.toUpperCase()
        }
    val cpf: String
    val senha: String
    val endereco: Endereco

    /**
     * Cria uma nova instancia de Cliente.
     * @param nome Nome do cliente.
     * @param cpf CPF do cliente.
     * @param senha Senha do cliente.
     * @param endereco Endereço do cliente.
     */
    constructor(nome: String, cpf: String, senha: String, endereco: Endereco) {
        this.nome = nome
        this.cpf = cpf
        this.senha = senha
        this.endereco = endereco
    }

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

    /**
     * Converte uma instância de Cliente em uma String.
     * @return String contendo os dados de cliente.
     */
    override fun toString(): String {

        return """# Cliente
Nome: ${this.nome}
CPF: ${this.cpf}
${this.endereco}"""

    }
}