/**
 * Representa uma conta corrente do Bytebank.
 */
class ContaCorrente : Conta {

    /**
     * Cria uma nova instancia da ContaCorrente.
     * @param titular Nome do titular da conta.
     * @param numero Numero da conta.
     */
    constructor(titular: String, numero: String): super(titular, numero)

    /**
     * Cria uma nova instancia da ContaCorrente.
     * @param titular Nome do titular da conta.
     * @param numero Numero da conta.
     */
    constructor(titular: String, numero: Int): super(titular, numero.toString())

    /**
     * Serve para realizar um saque na conta corrente.
     * @param valor Valor a ser sacado.
     */
    override fun sacar(valor: Double) {
        if (valor < 0)
            throw SaqueInferiorAZero()

        if (valor > this.saldo)
            throw SaqueMaiorQueSaldo()

        this.saldo -= (valor + 0.01)
    }
}