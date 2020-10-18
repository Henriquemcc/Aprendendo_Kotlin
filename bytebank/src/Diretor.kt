/**
 *
 * @param nome Nome do diretor.
 * @param cpf Cpf do diretor.
 * @param salario Salario do diretor.
 * @param senha Senha do diretor.
 * */
class Diretor (nome: String, cpf: String, salario: Double, val senha: String, val plr: Double): Funcionario(nome = nome, cpf = cpf, salario = salario){

    /**
     * Calcula a bonificação do diretor.
     * @return Valor da bonificação do diretor.
     * */
    override val bonificacao: Double
        get() = this.salario * 0.3

    /**
     * Serve para converter uma instancia da classe Diretor em uma String.
     * @return String contendo os dados da classe Diretor.
     * */
    override fun toString(): String {
        var str = ""
        str += "Nome: " + this.nome + "\n"
        str += "CPF: " + this.cpf + "\n"
        str += "Salario: " + this.salario + "\n"
        str += "Bonificação: " + this.bonificacao + "\n"
        str += "Programa de Participação nos Lucros e Resultados: " + this.plr

        return str
    }

    /**
     * Serve para realizar a autenticação de um diretor.
     * @param senha Senha digitada pela pessoa que quer se autenticar como diretor.
     * @return Valor booleano indicando se foi autenticado.
     * */
    fun autentica(senha: String): Boolean {
        var sucesso = false

        if (this.senha.equals(senha)){
            sucesso = true
        }

        return sucesso
    }
}