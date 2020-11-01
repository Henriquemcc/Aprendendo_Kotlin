package modelo

/**
 * Representa uma conta corrente do Bytebank.
 */
class ContaCorrente : ContaTransferivel {

    /**
     * Cria uma nova instancia da modelo.ContaCorrente.
     * @param titular Nome do titular da conta.
     * @param numero Numero da conta.
     */
    constructor(titular: String, numero: String) : super(titular, numero)

    /**
     * Cria uma nova instancia da modelo.ContaCorrente.
     * @param titular Nome do titular da conta.
     * @param numero Numero da conta.
     */
    constructor(titular: String, numero: Int) : super(titular, numero.toString())

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

    /**
     * Serve para converter uma instancia da classe modelo.Conta em uma String.
     * @return String contendo os dados da classe modelo.Conta.
     * */
    override fun toString(): String {
        var str = ""
        str += "Titular: " + this.titular + "\n"
        str += "Número: " + this.numero + "\n"
        str += "Tipo de conta: Conta Corrente\n"

        return str
    }
}