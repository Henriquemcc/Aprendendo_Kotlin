package teste

import exception.SaldoInsuficienteException

fun testaExcecoes() {
    testarClassCastException()
    testarArithmeticException()
    testarNumberFormatException()
    testarSaldoInsuficienteException()
}

fun testarClassCastException() {
    println("Testando ClassCastException")
    try {
        testarClassCastExceptionParte2()
    } catch (e: java.lang.ClassCastException) {
        e.printStackTrace()
    }
}

private fun testarClassCastExceptionParte2() {
    for (i in 1..5) {
        println(i)
        throw ClassCastException()
    }
}

fun testarArithmeticException() {
    println("Testando ArithmeticException")
    try {
        testarArithmeticExceptionParte2()
    } catch (e: ArithmeticException) {
        e.printStackTrace()
    }
}

private fun testarArithmeticExceptionParte2() {
    for (i in 1..5) {
        println(i)
        throw ArithmeticException()
    }
}

fun testarNumberFormatException() {
    println("Testando NumberFormatException")
    try {
        testarNumberFormatExceptionParte2()
    } catch (e: NumberFormatException) {
        e.printStackTrace()
    }
}

private fun testarNumberFormatExceptionParte2() {
    for (i in 1..5) {
        println(i)
        throw NumberFormatException()
    }
}

fun testarSaldoInsuficienteException() {
    println("Testando SaldoInsuficienteException")
    try {
        testarSaldoInsuficienteExceptionParte2()
    } catch (e: SaldoInsuficienteException) {
        e.printStackTrace()
    }
}

private fun testarSaldoInsuficienteExceptionParte2() {
    for (i in 1..5) {
        println(i)
        throw SaldoInsuficienteException()
    }
}