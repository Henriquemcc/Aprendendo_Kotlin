/**
 * Representa uma conta corrente do Bytebank.
 * @param titular Nome do titular da conta.
 * @param numero Numero de identificação da conta.
 */
class ContaCorrente(titular: String, numero: Int) : Conta(titular = titular, numero = numero) {

    /**
     * Serve para realizar um saque na conta corrente.
     * @param valor Valor a ser sacado.
     */
    override fun sacar(valor: Double) {
        super.sacar(valor + 0.01)
    }
}