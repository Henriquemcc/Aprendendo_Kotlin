import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    println("Salários com BigDecimal")

    parte0()
    parte1()
    parte2()
    parte3()
}

private fun parte3() {
    println("Utilizando a extension function average, a função sorted e a função take de Array<BigDecimal> para calcular a média dos três maiores e os três menores salários aumentados")

    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    val aumento = "1.1".toBigDecimal()

    val salariosComAumento =
            salarios.map { calcularAumento(it, aumento) }.toTypedArray()
    println("Salários com aumento: ${salariosComAumento.contentToString()}")

    val mediaTresMaioresSalarios =
            salariosComAumento.sorted().takeLast(3).toTypedArray().average()
    println("Média dos três maiores salários: $mediaTresMaioresSalarios")

    val mediaTresMenoresSalarios =
            salariosComAumento.sorted().take(3).toTypedArray().average()
    println("Média dos três menores salários: $mediaTresMenoresSalarios")
}

private fun parte2() {
    println("Utilizando a função fold de Array<BigDecimal> para obter o gasto total de 6 meses depois com o salário aumentado dos funcionários")

    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    val aumento = "1.1".toBigDecimal()

    val salariosComAumento =
            salarios.map { calcularAumento(it, aumento) }.toTypedArray()
    println("Salários com aumento: ${salariosComAumento.contentToString()}")

    val gastoInicial = salariosComAumento.sum()
    println("Gasto inicial com o salário com aumento dos funcionários: $gastoInicial")

    val quantidadeDeMeses = 6.toBigDecimal()
    println("Quantidade de meses para qual o gasto total será acumulado: $quantidadeDeMeses")

    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * quantidadeDeMeses).setScale(2, RoundingMode.UP)
    }
    println("Gasto total com o salário aumentado dos funcionários em um período de $quantidadeDeMeses meses: $gastoTotal")

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun parte1() {
    println("Utilizando a extension function sum (somatório) de Array<BigDecimal> para obter o gasto inicial com o salário aumentado dos funcionários")

    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    val aumento = "1.1".toBigDecimal()

    val salariosComAumento =
            salarios.map { calcularAumento(it, aumento) }.toTypedArray()
    println("Salários com aumento: ${salariosComAumento.contentToString()}")

    val gastoInicial = salariosComAumento.sum()
    println("Gasto inicial com o salário com aumento dos funcionários: $gastoInicial")

    val quantidadeDeMeses = 6.toBigDecimal()
    println("Quantidade de meses para qual o gasto total será acumulado: $quantidadeDeMeses")

    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * quantidadeDeMeses).setScale(2, RoundingMode.UP)
    }
    println("Gasto total com o salário dos funcionários em um período de $quantidadeDeMeses meses: $gastoTotal")

    println("---------------------------------------------------------------------------------------------------------------")
}

private fun parte0() {
    println("Utilizando a função map, que recebe uma expressão lambda para aumentar o salário dos funcionários")

    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    println("Salários: ${salarios.contentToString()}")

    val aumento = "1.1".toBigDecimal()
    println("Aumento: $aumento")

    val salariosComAumento =
            salarios.map { calcularAumento(it, aumento) }.toTypedArray()
    println("Salários com aumento: ${salariosComAumento.contentToString()}")

    println("---------------------------------------------------------------------------------------------------------------")
}

/**
 * Calcula o aumento do salário dos funcionários tendo em vista a regra de negócio cujos salários inferiores a 5000.00 devem ser aumentados por meio do acréscimo de 500.00
 * @param salario Salário que será aumentado
 * @param aumento Aumento para os salários superiores ou iguais a 5000.00
 * @return Valor do tipo BigDecimal com o novo salário do funcionário
 */
private fun calcularAumento(salario: BigDecimal, aumento: BigDecimal): BigDecimal {
    return if (salario < "5000.00".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }
}