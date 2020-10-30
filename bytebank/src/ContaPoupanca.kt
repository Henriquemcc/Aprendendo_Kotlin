/**
 * Representa uma conta poupança do Bytebank.
 * @param titular Nome do titular da conta.
 * @param numero Numero de identificação da conta.
 */
class ContaPoupanca(titular: String, numero: Int) : Conta(titular = titular, numero = numero)