package henriquemcc.aprendendo.kotlin.bytebank.teste

import henriquemcc.aprendendo.kotlin.bytebank.modelo.Cliente
import henriquemcc.aprendendo.kotlin.bytebank.modelo.ContaCorrente
import henriquemcc.aprendendo.kotlin.bytebank.modelo.ContaPoupanca
import henriquemcc.aprendendo.kotlin.bytebank.modelo.ContaSalario

val contaCorrenteDoZe = ContaCorrente(Cliente("Zé", "480.553.680-23", "Hv^*B3#zgISjFT@PIM^W@R7b3dufitvGOG7ygIh%r2XsbCVIYO"), 480812885)
val contaCorrenteDoJoao = ContaCorrente(Cliente("João", "942.500.500-17", "CcJ1Xg6hPC6L!mNo#KHvAgN*gUWJpBXEt7Ece!G%b5g!!!adfLs"), 1319396092)
val contaPoupancaDoFulano = ContaPoupanca(Cliente("Fulano", "092.099.390-77", "0^rLqWrRe0dvYrEX@zhkbOsc9hZD*Z6dhDfEskX7dKD&PQIO!u"), 2108701790)
val contaPoupancaDoCiclano = ContaPoupanca(Cliente("Ciclano", "908.554.160-33", "yUx85R&0OV^ajk9nQeO&sVPjTuL05u717Liv^ovS6h%icCm#OA"), 1202166505)
val contaSalarioDoLuis = ContaSalario(Cliente("Luis", "548.058.550-96", "bRkl#k^I#@BVkZOEp*r&zxXIV54@eueF*ufF^AO8WCJ1yW\\$5qn"), 20323)
val contaSalarioDaPatricia = ContaSalario(Cliente("Patricia", "185.963.960-71", "z2EL#tdleYnlRc!vJ36cv67j05@YThbQQZe*WDPXti^QFmfUR#"), 147829)