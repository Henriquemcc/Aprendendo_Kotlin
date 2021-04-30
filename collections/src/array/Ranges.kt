fun main() {
    println("Ranges")

    parte0()
    parte1()
    parte2()
}

private fun parte0() {
    println("Utilizando o for para contar a quantidade de pessoas cujo o salário está dentro do domínio")

    val salarios = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)
    println("Salarios: ${salarios.contentToString()}")

    val base = 1500.0
    println("Base: $base")

    val topo = 4000.0
    println("Topo: $topo")

    var contador = 0
    for (salario in salarios)
        if (salario in base..topo)
            contador++

    println("Contador: $contador")

    println("--------------------------------------")
}

private fun parte1() {
    println("Utilizando a função agregadora count para contar a quantidade de pessoas cujo o salário está dentro do domínio")

    val salarios = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)
    println("Salarios: ${salarios.contentToString()}")

    val base = 1500.0
    println("Base: $base")

    val topo = 4000.0
    println("Topo: $topo")

    val contador = salarios.count { it in base..topo }
    println("Contador: $contador")

    println("--------------------------------------")
}

private fun parte2() {
    println("Utilizando as funções do array para obter a maior e a menor idade, a média da idade, se todos são maiores de idade, se tem menor de idade, quais são os menores de idade, se tem idade igual a 10, e quais são as idades iguais a 10")

    val idades =
        intArrayOf(25, 19, 33, 20, 6, 8, 10, 12, 14, 16, 18, 5, 22, 25, 31, 49)
    println("Idades: ${idades.contentToString()}")

    val maiorIdade = idades.maxOrNull()
    println("Maior idade: $maiorIdade")

    val menorIdade = idades.minOrNull()
    println("Menor idade: $menorIdade")

    val media = idades.average()
    println("Média da idade: $media")

    val todosSaoMaioresDeIdade = idades.all { it >= 18 }
    println("Todos são maiores de idade? $todosSaoMaioresDeIdade")

    val temMenorDeIdade = idades.any { it < 18 }
    println("Tem alguém menor de idade? $temMenorDeIdade")

    val maioresDeIdade = idades.filter { it >= 18 }.toIntArray()
    println("Maiores de idade: ${maioresDeIdade.contentToString()}")

    val menoresDeIdade = idades.filter { it < 18 }.toIntArray()
    println("Menores de idade: ${menoresDeIdade.contentToString()}")

    val temIdadeIgualADez = idades.contains(10)
    println("Tem idade igual a 10? $temIdadeIgualADez")

    val idadeIgualADez = idades.find { it == 10 }
    println("Idades iguais a 10: $idadeIgualADez")

    println("--------------------------------------")
}