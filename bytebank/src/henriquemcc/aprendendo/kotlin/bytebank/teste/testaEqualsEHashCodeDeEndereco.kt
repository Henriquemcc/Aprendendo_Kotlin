package henriquemcc.aprendendo.kotlin.bytebank.teste

import henriquemcc.aprendendo.kotlin.bytebank.modelo.Endereco

fun testaEqualsEHashCodeDeEndereco()
{
    //Criando os endereços
    val endereco0 = Endereco(cep = "29179-035", logradouro = "Rua Breu", bairro = "Centro da Serra", cidade = "Serra", estado = "ES")
    val endereco1 = Endereco(cep = "57607-510", logradouro = "Rua Bom Jesus dos Passos", bairro = "Vila Maria", cidade = "Palmeira dos Índios", estado = "AL")
    val endereco2 = Endereco(cep = "28021-740", logradouro = "Rua José Luiz Maron", bairro = "Parque Penha", cidade = "Campos dos Goytacazes", estado = "RJ")

    //Imprimindo os endereços
    println("Endereço 0: $endereco0")
    println("Endereço 1: $endereco1")
    println("Endereço 2: $endereco2")
    println()

    //Imprimindo os hashes
    println("Hash Endereço 0: ${endereco0.hashCode()}")
    println("Hash Endereço 1: ${endereco1.hashCode()}")
    println("Hash Endereço 2: ${endereco2.hashCode()}")
    println()

    //Comparando os endereços
    println("Endereço 0 é igual ao endereço 1: ${endereco0.equals(endereco1)}")
    println("Endereço 0 é igual ao endereço 2: ${endereco0.equals(endereco2)}")
    println("Endereço 1 é igual ao endereço 2: ${endereco1.equals(endereco2)}")
    println()

}

fun main()
{
    testaEqualsEHashCodeDeEndereco()
}