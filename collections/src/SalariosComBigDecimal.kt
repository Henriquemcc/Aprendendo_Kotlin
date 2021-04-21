import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    println("Salários com BigDecimal")

    println("Utilizando a função map, que recebe uma expressão lambda para aumentar o salário dos funcionários")

    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    println("Salários: ${salarios.contentToString()}")

    val aumento = "1.1".toBigDecimal()
    println("Aumento: $aumento")

    val salariosComAumento = salarios.map { calcularAumento(it, aumento) }.toTypedArray()
    println("Salários com aumento: ${salariosComAumento.contentToString()}")
}

private fun calcularAumento(salario: BigDecimal, aumento: BigDecimal): BigDecimal {
    return if (salario < "5000.00".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }
}