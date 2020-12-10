package henriquemcc.aprendendo.kotlin.bytebank.teste

import henriquemcc.aprendendo.kotlin.bytebank.modelo.Autenticavel
import henriquemcc.aprendendo.kotlin.bytebank.modelo.SistemaInterno

fun testaComportamentosObjetoAnonimo()
{
    val paulo = object : Autenticavel
    {
        val nome = "Paulo"
        val cpf = "961.883.040-32"
        val senha = "^^GiGm^9S!Z1jCDJSHmFAj&Mk\$QCkj6YDj5n6swCa!QJj8Dv*B"

        override fun autenticar(senha: String): Boolean = this.senha.equals(senha)

    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.login(paulo, "^^GiGm^9S!Z1jCDJSHmFAj&Mk\$QCkj6YDj5n6swCaQJj8Dv*B")
    sistemaInterno.login(paulo, "^^GiGm^9S!Z1jCDJSHmFAj&Mk\$QCkj6YDj5n6swCa!QJj8Dv*B")

    println()
    println("Nome do cliente: ${paulo.nome}")
}

fun main()
{
    testaComportamentosObjetoAnonimo()
}