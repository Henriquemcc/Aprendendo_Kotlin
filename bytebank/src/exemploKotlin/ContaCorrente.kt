package exemploKotlin

class ContaCorrente {

    val titular: String
    val numero: String

    /**
     * Cria uma nova instancia da modelo.ContaCorrente.
     * @param titular Nome do titular da conta.
     * @param numero Numero da conta.
     */
    constructor(titular: String, numero: String) {
        this.titular = titular
        this.numero = numero
    }

    override fun toString(): String {
        return "ContaCorrente do pacote exemploKotlin"
    }
}