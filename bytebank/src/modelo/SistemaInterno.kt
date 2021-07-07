package modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: String, quandoAutenticado: () -> Unit = {}) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao Bytebank")
            quandoAutenticado()
        } else {
            println("Falha na autenticação")
        }
    }

    fun entraReceiver(admin: Autenticavel, senha: String, quandoAutenticado: SistemaInterno.() -> Unit = {}) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao Bytebank")
            quandoAutenticado()
        } else {
            println("Falha na autenticação")
        }
    }

    fun pagamento() {
        println("Realizando pagamento...")
    }
}