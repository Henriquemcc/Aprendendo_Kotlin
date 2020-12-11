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
            field = value.trim()
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
     * Converte uma instância desta classe em uma String.
     * @return String contendo os dados da instância desta classe.
     */
    override fun toString(): String
    {
        return """Conta
            |(
            |titular=$titular,
            |numero='$numero',
            |saldo=$saldo
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
        if (other !is Conta) return false

        if (titular != other.titular) return false
        if (numero != other.numero) return false
        if (saldo != other.saldo) return false

        return true
    }

    /**
     * Obtém o hash code desta instância desta classe.
     * @return Número inteiro com o hash desta instância desta classe.
     */
    override fun hashCode(): Int
    {
        var result = titular.hashCode()
        result = 31 * result + numero.hashCode()
        result = 31 * result + saldo.hashCode()
        return result
    }


}