import modelo.Endereco

fun main() {
    println("início main")
    funcao1()
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
        endereco as Endereco
    }
    println("fim função2")
}
