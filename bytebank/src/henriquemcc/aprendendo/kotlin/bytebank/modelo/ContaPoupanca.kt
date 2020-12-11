package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa uma conta poupança do Bytebank.
 */
class ContaPoupanca : ContaTransferivel
{

    /**
     * Cria uma nova instância da ContaPoupanca.
     * @param titular Nome do titular da conta.
     * @param numero Numero da conta.
     */
    constructor(titular: Cliente, numero: Int = 0) : super(titular, numero.toString())

    /**
     * Cria uma nova instância da ContaPoupanca.
     * @param titular Nome do titular da conta.
     * @param numero Numero da conta.
     */
    constructor(titular: Cliente, numero: String = "") : super(titular, numero)

    /**
     * Serve para realizar um saque na conta poupanca.
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
     * Gera uma representação no formato de uma string dos atributos de uma instância desta classe.
     * @return Representação no formato de uma string dos atributos de uma instância desta classe.
     */
    override fun toString(): String
    {
        return "ContaPoupanca() ${super.toString()}"
    }


}