import java.math.BigDecimal

/**
 * Cria um array com elementos do tipo BigDecimal passados por parâmetro
 * @param valores Valores BigDecimal que farão parte do array
 * @return Array com os elementos do tipo BigDecimal passados por parâmetro
 */
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) {
        valores[it].toBigDecimal()
    }
}

/**
 * Soma todos os elementos de um array com elementos do tipo BigDecimal
 * @return Valor da soma dos elementos BigDecimal do array
 */
fun Array<BigDecimal>.sum(): BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}

/**
 * Calcula a média de todos os elementos de um array com elementos do tipo BigDecimal
 * @return Valor da média dos elementos do array de elementos do tipo BigDecimal
 */
fun Array<BigDecimal>.average(): BigDecimal {
    if (this.isEmpty())
        throw NumberFormatException("BigDecimal array is empty")

    return this.sum() / this.size.toBigDecimal()
}