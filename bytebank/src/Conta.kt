/**
 * Representa uma conta bancaria do Bytebank.
 * @param titular Nome do titular da conta.
 * @param numero Numero de identificação da conta.
 * */
open class Conta(var titular: String, val numero: Int) {

    //Saldo da conta
    var saldo = 0.0
        private set(saldo) {
            if (saldo < 0) {
                throw SaldoInferiorAZeroException("O valor do atributo saldo nao pode ser inferior a zero.")
            }
            field = saldo
        }

    //Execoes relacionadas ao saque, deposito e transferencia
    class DepositoInferiorAZeroException(var1: String) : IllegalArgumentException(var1)
    class SaqueMaiorQueSaldoException(var1: String) : IllegalArgumentException(var1)
    class TransferenciaMaiorQueSaldoException(var1: String) : IllegalArgumentException(var1)
    class NumeroContaInferiorAZeroException(var1: String) : IllegalArgumentException(var1)
    class SaldoInferiorAZeroException(var1: String) : java.lang.IllegalArgumentException(var1)

    /**
     * Serve para realizar um saque.
     * @param valor Valor a ser sacado.
     * @throws DepositoInferiorAZeroException Excecao jogada caso o saque seja inferior a zero.
     * @throws SaqueMaiorQueSaldoException Excecao jogada caso o saque seja maior que o saldo da conta.
     * */
    open fun sacar(valor: Double) {
        //Verificando se pode sacar
        if (valor < 0) {
            throw DepositoInferiorAZeroException("O valor do saque não pode ser negativo.")
        }
        if (saldo < valor) {
            throw SaqueMaiorQueSaldoException("O valor do saque não pode ser maior que o valor do saldo.")
        }

        //Sacando
        this.saldo -= valor

    }

    /**
     * Serve para realizar um deposito na conta.
     * @param valor Valor do deposito.
     * @throws DepositoInferiorAZeroException Excecao jogada caso o deposito seja inferior a zero.
     * */
    fun depositar(valor: Double) {
        //Verificando se pode depositar
        if (valor < 0) {
            throw DepositoInferiorAZeroException("O valor do deposito não pode ser negativo.")
        }

        this.saldo += valor
    }

    /**
     * Serve para transferir dinheiro de uma conta para outra.
     * @param destino Referencia para a o objeto da conta destino.
     * @param valor Valor a ser transferido de uma conta para outra.
     * @throws TransferenciaMaiorQueSaldoException Excecao jogada caso o valor a ser transferido eh maior que o saldo da conta de origem.
     * @throws DepositoInferiorAZeroException Excecao jogada caso o valor a ser transferido seja menor que zero.
     * */
    fun transferir(destino: Conta, valor: Double) {
        try {
            this.sacar(valor)
            destino.depositar(valor)
        }
        //Mudando a mensagem de erro caso o valor da transferencia seja menor que zero
        catch (e: DepositoInferiorAZeroException) {
            throw DepositoInferiorAZeroException("O valor da transferencia não pode ser inferior a zero.")
        }
        //Mudando a mensagem de erro caso o valor da transferencia seja maior que o saldo da conta de origem
        catch (e: SaqueMaiorQueSaldoException) {
            throw TransferenciaMaiorQueSaldoException("O valor da transferencia tem que ser maior que zero.")
        }
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