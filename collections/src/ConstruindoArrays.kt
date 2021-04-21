fun main() {
    println("Construindo Arrays")

    val contatos = arrayOf("Roberto", "Ana", "Paula")
    println(contatos.contentToString())
    println("--------------------------------------")

    val contatos2: Array<String> = Array<String>(3) { "" }
    contatos2[0] = "Roberto"
    contatos2[1] = "Ana"
    contatos2[2] = "Paula"
    println(contatos2.contentToString())
    println("--------------------------------------")

}