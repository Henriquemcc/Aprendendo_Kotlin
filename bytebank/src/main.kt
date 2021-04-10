fun main() {
    println("Exemplo 1")
    funcaoDoExemplo("abcdefghijklmnopqrstuvwxyz")
    println("---------------------------")
    println("Exemplo 2")
    funcaoDoExemplo("19345678.0456")
}

fun funcaoDoExemplo(entrada: String) {
    val valor = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        e.printStackTrace()
        null
    }

    println("Valor da entrada convertido para double: $valor")

    val valorComTaxa = if (valor != null) {
        valor * 1.01
    } else {
        null
    }

    println("Valor com taxa: $valorComTaxa")
}