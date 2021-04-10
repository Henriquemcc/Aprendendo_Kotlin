import modelo.Endereco

fun main() {
    println("início main")
    funcao1()
    try {
        9385 / 0
    } catch (e: ArithmeticException) {
        println("Exceção ArithmeticException foi capturada")
        e.printStackTrace()
    }

    println("fim main")
}

fun funcao1() {
    println("início função1")
    funcao2()
    println("fim função1")
}

fun funcao2() {
    println("início função2")
    for (i in 1..5) {
        println(i)
        val endereco = Any()
        try {
            endereco as Endereco
        } catch (e: ClassCastException) {
            println("Exceção ClassCastException foi capturada.")
            e.printStackTrace()
        }
    }
    println("fim função2")
}
