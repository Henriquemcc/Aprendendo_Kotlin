package henriquemcc.aprendendo.kotlin.bytebank.modelo

abstract class ContaTransferivel
/**
 * Chama o construtor superior.
 * @param titular Titular da conta
 * @param numero Numero da conta
 */(titular: Cliente, numero: String) : Conta(titular, numero) {

    //Exceções Transferencia
    /**
     * Exceção jogada quando o valor da transferência é inferior a zero.
     * @param var1 Mensagem de erro.
     */
    class TransferenciaInferiorAZero(var1: String = "O valor da transferência não pode ser inferior a zero") : IllegalArgumentException(var1)

    /**
     * Exceção jogada quando o valor da transferência é maior que o valor do saldo.
     * @param var1 Mensagem de erro.
     */
    class TransferenciaMaiorQueSaldo(var1: String = "O valor da transferência não pode ser maior que o saldo da conta") : IllegalArgumentException(var1)

    /**
     * Realiza transferência de uma conta para outra.
     * @param destino Referencia para a o objeto da conta destino.
     * @param valor Valor a ser transferido de uma conta para outra.
     * @throws TransferenciaMaiorQueSaldo
     * @throws TransferenciaInferiorAZero
     * */
    fun transferir(destino: Conta, valor: Double) {
        if (valor < 0)
            throw TransferenciaInferiorAZero()

        if (valor > this.saldo)
            throw TransferenciaMaiorQueSaldo()

        this.sacar(valor)
        destino.depositar(valor)
    }
}