package teste

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> {
            println("conta é positiva")
        }
        saldo == 0.0 -> {
            println("conta é neutra")
        }
        else -> {
            println("conta é negativa")
        }
    }

    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}