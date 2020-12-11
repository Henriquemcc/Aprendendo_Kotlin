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
    constructor(titular: Cliente, numero: String = "") : super(titular, numero)

    /**
     * Cria uma nova instancia da ContaCorrente.
     * @param titular Nome do titular da conta.
     * @param numero Numero da conta.
     */
    constructor(titular: Cliente, numero: Int = 0) : super(titular, numero.toString())

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
     * Gera uma representação no formato de uma string dos atributos de uma instância desta classe.
     * @return Representação no formato de uma string dos atributos de uma instância desta classe.
     */
    override fun toString(): String
    {
        return "ContaCorrente() ${super.toString()}"
    }


}