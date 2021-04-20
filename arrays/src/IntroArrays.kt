fun main() {
    parte0()
    parte1()
    parte2()
    parte3()
    parte4()
    parte5()
    parte6()
}

fun parte0() {
    println("Utilizando variáveis separadas para obter a maior idade")

    val idade1 = 25
    println("Idade 1: $idade1")

    val idade2 = 19
    println("Idade 2: $idade2")

    val idade3 = 33
    println("Idade 3: $idade3")

    val idade4 = 20
    println("Idade 4: $idade4")

    val maiorIdade = if (idade1 > idade2 && idade1 > idade3 && idade1 > idade4) {
        idade1
    } else if (idade2 > idade3 && idade2 > idade4) {
        idade2
    } else if (idade3 > idade4) {
        idade3
    } else {
        idade4
    }

    println("Maior idade: $maiorIdade")
    println("---------------------------------------------------------------------------------------------------------------")

}

fun parte1() {
    println("Utilizando array ao invés de variáveis separadas para obter a maior idade")
    val idades = IntArray(4)
    idades[0] = 25
    idades[1] = 19
    idades[2] = 33
    idades[3] = 20
    println("Idades: ${idades.contentToString()}")


    val maiorIdade = if (idades[0] > idades[1] && idades[0] > idades[2] && idades[0] > idades[3]) {
        idades[0]
    } else if (idades[1] > idades[2] && idades[1] > idades[3]) {
        idades[1]
    } else if (idades[2] > idades[3]) {
        idades[2]
    } else {
        idades[3]
    }

    println("Maior idade: $maiorIdade")
    println("---------------------------------------------------------------------------------------------------------------")
}

fun parte2() {
    println("Utilizando array e um loop for ao invés de variáveis separadas e ifs para obter a maior idade")
    val idades = intArrayOf(25, 19, 33, 20)
    println("Idades: ${idades.contentToString()}")

    var maiorIdade = Int.MIN_VALUE
    for (idade in idades)
        if (idade > maiorIdade)
            maiorIdade = idade

    println("Maior idade: $maiorIdade")
    println("---------------------------------------------------------------------------------------------------------------")
}

fun parte3() {
    println("Utilizando array e um loop for para obter a menor idade")
    val idades = intArrayOf(25, 19, 33, 20)
    println("Idades: ${idades.contentToString()}")

    var menorIdade = Int.MAX_VALUE
    for (idade in idades)
        if (idade < menorIdade)
            menorIdade = idade

    println("Menor idade: $menorIdade")
    println("---------------------------------------------------------------------------------------------------------------")
}

fun parte4() {
    println("Utilizando array e um loop for para aumentar o salário dos funcionários")
    val salarios = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)
    println("Salários: ${salarios.contentToString()}")

    val aumento = 1.1
    for (indice in salarios.indices)
        salarios[indice] *= aumento

    println("Salários com aumento: ${salarios.contentToString()}")
    println("---------------------------------------------------------------------------------------------------------------")
}

fun parte5() {
    println("Utilizando a função forEach, que recebe uma expressão lambda para aumentar o salário dos funcionários")
    val salarios = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)
    println("Salários: ${salarios.contentToString()}")

    val aumento = 1.1

    var indice = 0
    salarios.forEach { salario ->
        salarios[indice++] = salario * aumento
    }

    println("Salários com aumento: ${salarios.contentToString()}")
    println("---------------------------------------------------------------------------------------------------------------")
}

fun parte6() {
    println("Utilizando a função forEachIndexed, que recebe uma expressão lambda para aumentar o salário dos funcionários")
    val salarios = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)
    println("Salários: ${salarios.contentToString()}")

    val aumento = 1.1
    salarios.forEachIndexed { indice, salario ->
        salarios[indice] = salario * aumento
    }

    println("Salários com aumento: ${salarios.contentToString()}")
    println("---------------------------------------------------------------------------------------------------------------")
}