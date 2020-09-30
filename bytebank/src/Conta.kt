class Conta
{
    private var titular = ""
    private var numero = 0
    private var saldo = 0.0

    constructor(titular: String, numero: Int)
    {
        this.setTitular(titular)
        this.setNumero(numero)
    }

    constructor()

    class ValorInferiorAZeroException(var1: String) : IllegalArgumentException(var1)
    class SaqueMaiorQueSaldoException(var1: String) : IllegalArgumentException(var1)
    class TransferenciaMaiorQueSaldoException(var1: String) : IllegalArgumentException(var1)
    class NumeroContaInferiorAZero(var1: String) : IllegalArgumentException(var1)

    fun setTitular(titular: String)
    {
        this.titular = titular.toUpperCase()
    }

    fun getTitular(): String
    {
        return this.titular
    }

    fun setNumero(numero: Int)
    {
        if (numero < 0)
        {
            throw NumeroContaInferiorAZero("O número da conta não pode ser inferior a zero.")
        }

        this.numero = numero
    }

    fun getNumero(): Int
    {
        return this.numero
    }

    fun getSaldo(): Double
    {
        return this.saldo
    }



    fun sacar(valor: Double)
    {
        //Verificando se pode sacar
        if (valor < 0)
        {
            throw ValorInferiorAZeroException("O valor do saque não pode ser negativo.")
        }
        if (saldo < valor)
        {
            throw SaqueMaiorQueSaldoException("O valor do saque não pode ser maior que o valor do saldo.")
        }

        //Sacando
        this.saldo -= valor

    }

    fun depositar(valor: Double)
    {
        //Verificando se pode depositar
        if (valor < 0)
        {
            throw ValorInferiorAZeroException("O valor do deposito não pode ser negativo.")
        }

        this.saldo += valor
    }

    fun transferir(outraConta: Conta, valor: Double)
    {
        try
        {
            this.sacar(valor)
            this.depositar(valor)
        }
        //Mudando a mensagem de erro caso o valor da transferencia seja menor que zero
        catch (e: ValorInferiorAZeroException)
        {
            throw ValorInferiorAZeroException("O valor da transferencia não pode ser inferior a zero.")
        }
        //Mudando a mensagem de erro caso o valor da transferencia seja maior que o saldo da conta de origem
        catch (e: SaqueMaiorQueSaldoException)
        {
            throw TransferenciaMaiorQueSaldoException("O valor da transferencia tem que ser maior que zero.")
        }
    }
}