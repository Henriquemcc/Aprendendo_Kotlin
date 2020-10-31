/**
 * Representa uma conta bancaria do Bytebank.
 * */
abstract class Conta {

    var titular: String
    var numero: String

    var saldo = 0.0
        protected set

    /*
    * @param titular Nome do titular da conta.
    * @param numero Numero de identificação da conta.
    * */
    constructor(titular: String, numero: String) {
        if (Integer.parseInt(numero) < 0)
            throw NumeroContaInferiorAZero()

        this.titular = titular
        this.numero = numero
    }

    //Exceção deposito
    /**
     * Exceção jogada quando o valor do depósito é inferior a zero.
     * @param var1 Mensagem de erro.
     */
    class DepositoInferiorAZero(var1: String = "O valor do depósito não pode ser inferior a zero") : IllegalArgumentException(var1)

    //Exceções saque
    /**
     * Exceção jogada quando o valor do saque é inferior a zero.
     * @param var1 Mensagem de erro.
     */
    class SaqueInferiorAZero(var1: String = "O valor do saque não pode ser inferior a zero") : IllegalArgumentException(var1)

    /**
     * Exceção jogada quando o valor do saque é maior que o valor do saldo.
     * @param var1 Mensagem de erro.
     */
    class SaqueMaiorQueSaldo(var1: String = "O valor do saque não pode ser maior que o saldo da conta") : IllegalArgumentException(var1)

    //Exceções Transferencia
    /**
     * Exceção jogada quando o valor da transferência é inferior a zero.
     * @param var1 Mensagem de erro.
     */
    class TransferenciaInferiorAZero(var1: String = "O valor da transferência não pode ser inferior a zero"): IllegalArgumentException(var1)

    /**
     * Exceção jogada quando o valor da transferência é maior que o valor do saldo.
     * @param var1 Mensagem de erro.
     */
    class TransferenciaMaiorQueSaldo(var1: String = "O valor da transferência não pode ser maior que o saldo da conta") : IllegalArgumentException(var1)

    //Exceção numero da conta
    /**
     * Exceção jogada quando o número da conta é inferior a zero.
     * @param var1 Mensagem de erro.
     */
    class NumeroContaInferiorAZero(var1: String = "O numero da conta não pode ser inferior a zero") : IllegalArgumentException(var1)

    /**
     * Realiza um saque da conta.
     * @param valor Valor a ser sacado
     * @throws SaqueInferiorAZero
     * @throws SaqueMaiorQueSaldo
     */
    abstract fun sacar(valor: Double)

    /**
     * Realiza um depósito na conta.
     * @param valor Valor do deposito.
     * @throws DepositoInferiorAZero
     * */
    fun depositar(valor: Double) {
        if (valor < 0)
            throw DepositoInferiorAZero()

        this.saldo += valor
    }

    /**
     * Realiza transferência de uma conta para outra.
     * @param destino Referencia para a o objeto da conta destino.
     * @param valor Valor a ser transferido de uma conta para outra.
     * @throws TransferenciaMaiorQueSaldo
     * @throws DepositoInferiorAZero
     * */
    fun transferir(destino: Conta, valor: Double) {
        if (valor < 0)
            throw TransferenciaInferiorAZero()

        if (valor > this.saldo)
            throw TransferenciaMaiorQueSaldo()

        this.sacar(valor)
        destino.depositar(valor)
    }

    /**
     * Serve para converter uma instancia da classe Conta em uma String.
     * @return String contendo os dados da classe Conta.
     * */
    override fun toString(): String {
        var str = ""
        str += "Titular: " + this.titular + "\n"
        str += "Numero: " + this.numero + "\n"
        str += "Saldo: " + this.saldo

        return str
    }
}