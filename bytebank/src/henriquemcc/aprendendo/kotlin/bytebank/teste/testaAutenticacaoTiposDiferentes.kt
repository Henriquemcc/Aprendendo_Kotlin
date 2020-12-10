package henriquemcc.aprendendo.kotlin.bytebank.teste

import henriquemcc.aprendendo.kotlin.bytebank.modelo.SistemaInterno

fun testaAutenticacaoTiposDiferentes()
{
    val sistemaInterno = SistemaInterno()
    sistemaInterno.login(carlos, "lgTw4bEqSlRy#BcyMUkh#yzzpYepK1L@if\$Ojm7AHMIixHlt\$G")
    sistemaInterno.login(ana, "#rAChV3E1a5n#ej1Yhei32FEoirvlYQ3*WjxYREWfVh*@ac&j3")
    sistemaInterno.login(francisca, "120938498908590483902834509738957fijhsfiudshfiuhoiuahshvhdsvhg")
    sistemaInterno.login(bruna, "4RdgowoskhgEgRj69yHS!9oge9\$quQ!okuHNniL*6lsO2TKDTs")
    sistemaInterno.login(eduardo, "")
}

fun main()
{
    testaAutenticacaoTiposDiferentes()
}