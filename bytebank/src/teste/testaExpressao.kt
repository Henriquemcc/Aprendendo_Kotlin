package teste

fun testaExpressao() {

    val entrada = "1.0"

    val valorRecebido = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }

    val valorComTaxa = if (valorRecebido != null)
        valorRecebido + 0.1
    else null


    if (valorComTaxa != null)
        println("Valor recebido: $valorComTaxa")
    else
        println("Valor inválido")
}