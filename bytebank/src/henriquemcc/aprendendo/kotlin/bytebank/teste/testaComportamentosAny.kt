package henriquemcc.aprendendo.kotlin.bytebank.teste

import henriquemcc.aprendendo.kotlin.bytebank.modelo.ContaPoupanca

fun testaComportamentosAny()
{
    println()
    println(0)
    println(1.2)
    println(false)
    println('c')
    println("qwerty")
    println(carlos)
    println(contaPoupancaDoCiclano)

    val any0 = Any()
    val any0_ = recebeEDevolveAny(any0)
    println("Objeto any0 é igual ao objeto any0_ : " + any0.equals(any0_))

    val poupanca0 = ContaPoupanca(amanda, "0")
    val poupanca0_ = recebeEDevolveAny(poupanca0)
    println("Objeto poupanca0 é igual ao objeto poupanca0_ : " + poupanca0.equals(poupanca0_))

    val objetoDeAny0 = object
    {
        val atributoA = "A"
        val atributoB = 'B'
        val atributoC = false
        val atributoD = 0.0
        val atributoE = 0

        fun fazNada()
        {
        }
    }

    val objetoDeAny0_ = recebeEDevolveAny(objetoDeAny0)
    println("Objeto objetoDeAny0 é igual ao objeto objetoDeAny0_ : " + objetoDeAny0.equals(objetoDeAny0_))

}

fun recebeEDevolveAny(any: Any): Any
{
    return any
}

fun main()
{
    testaComportamentosAny()
}