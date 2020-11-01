package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa uma conta poupança do Bytebank.
 */
class ContaPoupanca : ContaTransferivel {

    /**
     * Cria uma nova instância da ContaPoupanca.
     * @param titular Nome do titular da conta.
     * @param numero Numero da conta.
     */
    constructor(titular: String, numero: Int) : super(titular, numero.toString())

    /**
     * Cria uma nova instância da ContaPoupanca.
     * @param titular Nome do titular da conta.
     * @param numero Numero da conta.
     */
    constructor(titular: String, numero: String) : super(titular, numero)

    /**
     * Serve para realizar um saque na conta poupanca.
     * @param valor Valor a ser sacado.
     */
    override fun sacar(valor: Double) {
        if (valor < 0)
            throw SaqueInferiorAZero()

        if (valor > this.saldo)
            throw SaqueMaiorQueSaldo()

        this.saldo -= valor
    }

    /**
     * Serve para converter uma instancia da classe Conta em uma String.
     * @return String contendo os dados da classe Conta.
     * */
    override fun toString(): String {
        var str = ""
        str += "Titular: " + this.titular + "\n"
        str += "Número: " + this.numero + "\n"
        str += "Tipo de conta: Conta Poupança\n"

        return str
    }
}