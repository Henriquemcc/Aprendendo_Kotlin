package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa uma conta corrente do Bytebank.
 */
class ContaCorrente : ContaTransferivel
{

    /**
     * Cria uma nova instancia da ContaCorrente.
     * @param titular Nome do titular da conta.
     * @param numero Numero da conta.
     */
    constructor(titular: Cliente, numero: String) : super(titular, numero)

    /**
     * Cria uma nova instancia da ContaCorrente.
     * @param titular Nome do titular da conta.
     * @param numero Numero da conta.
     */
    constructor(titular: Cliente, numero: Int) : super(titular, numero.toString())

    /**
     * Serve para realizar um saque na conta corrente.
     * @param valor Valor a ser sacado.
     */
    override fun sacar(valor: Double)
    {
        if (valor < 0)
            throw SaqueInferiorAZero()

        if (valor > this.saldo)
            throw SaqueMaiorQueSaldo()

        this.saldo -= (valor + 0.01)
    }

    /**
     * Converte uma instância desta classe em uma String.
     * @return String contendo os dados da instância desta classe.
     */
    override fun toString(): String
    {
        return """ContaCorrente()
            |${super.toString()}""".trimMargin()
    }
}