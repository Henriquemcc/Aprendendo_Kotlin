package henriquemcc.aprendendo.kotlin.bytebank.teste

import henriquemcc.aprendendo.kotlin.bytebank.modelo.SistemaInterno

/**
 * Testa os comportamentos do método login da classe SistemaInterno.
 */
fun testarComportamentosAutenticacaoFuncionario()
{
    val sistemaInterno = SistemaInterno()
    sistemaInterno.login(antonio, "0I\$QOUmSTt7Oujg#dVyD8gLrFWXcljOvaqz1ACldUSksnBBMe2")
    sistemaInterno.login(francisca, "1234567890")
    sistemaInterno.login(carlos, "lgTw4bEqSlRy#BcyMUkh#yzzpYepK1L@if\$Ojm7AHMIixHlt\$G")
}

/**
 * Executa este arquivo.
 */
fun main()
{
    testarComportamentosAutenticacaoFuncionario()
}