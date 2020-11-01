package henriquemcc.aprendendo.kotlin.bytebank.teste

import henriquemcc.aprendendo.kotlin.bytebank.modelo.SistemaInterno

/**
 * Testa os comportamentos do método login da classe SistemaInterno.
 */
fun testarComportamentosAutenticacaoCliente() {
    val sistemaInterno = SistemaInterno()
    sistemaInterno.login(bruno, "pvOrBe^CBIvX1HOrKkybits%zUCJgfFd\$q^zkH*ozv13Y@Ztg3")
    sistemaInterno.login(leticia, "nCrGhPX*b6^l7!QlnBCMQj^Li7b7&ELL9vzX#Fd5Kx0An7B@Jy")
    sistemaInterno.login(marcelo, "Tab1MMWHs^Trtrb\\$0uLKt5%8t8wZP^OGt4N#tp0lLjgrckIlRr")
    sistemaInterno.login(jessica, "\$zH7#g@fjwxDVuryi0^rLBcN0EVoT8WI3B6WnX!YF2#t2Sg\$MD")
    sistemaInterno.login(daniel, "nCrGhPX*b6^l7!QlnBCMQj^Li7b7&ELL9vzX#Fd5Kx0An7B@Jy")
    sistemaInterno.login(bruna, "4RdgowoskhgEgRj69yHS!9oge9\$quQ!okuHNniL*6lsO2TKDTs")
    sistemaInterno.login(rafael, "MvDHnQ5^T*Bq!2gjLikEjrKh*o^GyYNT8h#vWS7VkAY!OP*UZB")
    sistemaInterno.login(amanda, "nCrGhPX*b6^l7!QlnBCMQj^Li7b7&ELL9vzX#Fd5Kx0An7B@Jy")
    sistemaInterno.login(gabriel, "y3@BRkxssTyrz%mcqgy8!lTYBZMdIBgPyMkOz*bXQTxowEOC@W")
    sistemaInterno.login(camila, "%83^f^63Mrl1gk8Xh3De8UwmLo%LD1oh3H\$W8N#0rBGPlzi\$0r")
}

/**
 * Executa este arquivo.
 */
fun main() {
    testarComportamentosAutenticacaoCliente()
}