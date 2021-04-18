package modelo

import exception.FalhaAutenticacaoException
import exception.SaldoInsuficienteException

abstract class Conta(
        var titular: Cliente,
        val numero: Int
) : Autenticavel {
    var saldo = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        println("Criando conta")
        total++
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta, senha: String) {
        if (saldo < valor)
            throw SaldoInsuficienteException("O saldo é insuficiente: Saldo: $saldo, Valor da transferência: $valor")

        if (!autentica(senha))
            throw FalhaAutenticacaoException()

        saldo -= valor
        destino.deposita(valor)
    }

    override fun autentica(senha: String): Boolean {
        return this.titular.autentica(senha)
    }
}

