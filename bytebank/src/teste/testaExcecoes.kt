package teste

fun testarExcecoes() {
    testarClassCastException()
    testarArithmeticException()
    testarNumberFormatException()
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