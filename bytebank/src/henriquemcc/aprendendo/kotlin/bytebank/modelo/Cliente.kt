package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa um cliente do bytebank.
 */
class Cliente : Autenticavel {

    val nome: String
    val cpf: String
    private val senha: String

    /**
     * Cria uma nova instancia de Cliente.
     * @param nome Nome do cliente.
     * @param cpf CPF do cliente.
     * @param senha Senha do cliente.
     */
    constructor(nome: String, cpf: String, senha: String) {
        this.nome = nome
        this.cpf = cpf
        this.senha = senha
    }

    /**
     * Verifica se a senha do cliente é válida.
     * @param senha Senha do cliente.
     * @return Valor booleano indicando se foi ou não autenticado.
     */
    override fun autenticar(senha: String): Boolean {
        var autenticado = false

        if (senha.equals(this.senha))
            autenticado = true

        return autenticado
    }

    override fun toString(): String {
        var str = ""
        str += "Nome: " + this.nome + "\n"
        str += "CPF:" + this.cpf

        return str
    }
}