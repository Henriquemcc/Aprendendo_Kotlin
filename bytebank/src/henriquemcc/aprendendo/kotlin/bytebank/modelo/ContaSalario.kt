package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa uma conta salário do bytebank.
 */
class ContaSalario : Conta
{

    /**
     * Cria uma nova instancia de ContaSalario.
     * @param nome Nome do titular da conta.
     * @param numero Numero da conta.
     */
    constructor(nome: Cliente, numero: Int) : super(nome, numero.toString())

    /**
     * Cria uma nova instancia de ContaSalario.
     * @param nome Nome do titular da conta.
     * @param numero Numero da conta.
     */
    constructor(nome: Cliente, numero: String) : super(nome, numero)

    /**
     * Serve para realizar um saque na conta salario.
     * @param valor Valor a ser sacado.
     */
    override fun sacar(valor: Double)
    {
        if (valor < 0)
            throw SaqueInferiorAZero()

        if (valor > this.saldo)
            throw SaqueMaiorQueSaldo()

        this.saldo -= valor
    }

    /**
     * Converte uma instância desta classe em uma String.
     * @return String contendo os dados da instância desta classe.
     */
    override fun toString(): String
    {
        return """ContaSalario()
            |${super.toString()}""".trimMargin()
    }


}