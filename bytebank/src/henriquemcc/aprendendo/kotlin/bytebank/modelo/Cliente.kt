package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa um cliente do bytebank.
 */
class Cliente : Autenticavel
{
    var nome: String
        set(value)
        {
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
    constructor(nome: String, cpf: String, senha: String, endereco: Endereco)
    {
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
    override fun autenticar(senha: String): Boolean
    {
        var autenticado = false

        if (senha == this.senha)
            autenticado = true

        return autenticado
    }

    /**
     * Converte uma instância desta classe em uma String.
     * @return String contendo os dados da instância desta classe.
     */
    override fun toString(): String
    {
        return """Cliente
            |(
            |nome='$nome',
            |cpf='$cpf',
            |senha='$senha',
            |endereco=$endereco
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
        if (javaClass != other?.javaClass) return false

        other as Cliente

        if (nome != other.nome) return false
        if (cpf != other.cpf) return false
        if (senha != other.senha) return false
        if (endereco != other.endereco) return false

        return true
    }

    /**
     * Obtém o hash code desta instância desta classe.
     * @return Número inteiro com o hash desta instância desta classe.
     */
    override fun hashCode(): Int
    {
        var result = nome.hashCode()
        result = 31 * result + cpf.hashCode()
        result = 31 * result + senha.hashCode()
        result = 31 * result + endereco.hashCode()
        return result
    }


}