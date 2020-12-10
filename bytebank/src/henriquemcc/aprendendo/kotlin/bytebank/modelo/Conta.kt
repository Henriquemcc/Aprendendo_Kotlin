package henriquemcc.aprendendo.kotlin.bytebank.modelo

/**
 * Representa uma conta bancaria do Bytebank.
 * */
abstract class Conta
{

    /**
     * Instancia de Cliente que contém os dados do titular.
     */
    var titular: Cliente

    /**
     * String contendo o número da conta
     */
    var numero: String
        set(value)
        {
            if (Integer.parseInt(value.trim()) < 0)
                throw NumeroContaInferiorAZero()
            field = value.trim();
        }

    companion object
    {
        var qtdContas = 0
            private set
    }

    /*
    * Inicializa os atributos de Conta.
    * @param titular Nome do titular da conta.
    * @param numero Numero de identificação da conta.
    * */
    constructor (titular: Cliente, numero: String)
    {
        this.titular = titular
        this.numero = numero
        qtdContas++
    }

    var saldo: Double = 0.0
        protected set

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
    fun depositar(valor: Double)
    {
        if (valor < 0)
            throw DepositoInferiorAZero()

        this.saldo += valor
    }

    /**
     * Serve para converter uma instancia da classe Conta em uma String.
     * @return String contendo os dados da classe Conta.
     * */
    abstract override fun toString(): String
}