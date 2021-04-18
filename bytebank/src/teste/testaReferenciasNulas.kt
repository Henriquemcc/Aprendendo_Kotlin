package teste

import modelo.Endereco

fun testaReferenciasNulas() {
    val endereco: Endereco? = null
    endereco!!.numero
}