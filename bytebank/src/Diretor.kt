/**
 *
 * @param nome Nome do diretor.
 * @param cpf Cpf do diretor.
 * @param salario Salario do diretor.
 * @param senha Senha do diretor.
 * */
class Diretor (nome: String, cpf: String, salario: Double, val senha: String, val plr: Double): Funcionario(nome = nome, cpf = cpf, salario = salario){

    /**
     * Serve para calcular a bonificacao de uma instancia da classe Gerente.
     * @return Valor da bonificacao do gerente.
     * */
//    fun bonificacao(): Double {
//        return this.salario * 0.2
//    }

    /**
     * Serve para converter uma instancia da classe Gerente em uma String.
     * @return String contendo os dados da classe Funcionario.
     * */
    override fun toString(): String {
        var str = ""
        str += "Nome: " + this.nome + "\n"
        str += "CPF: " + this.cpf + "\n"
        str += "Salario: " + this.salario + "\n"
        str += "Bonificação: " + this.bonificacao() + "\n"
        str += "Programa de Participação nos Lucros e Resultados: " + this.plr

        return str
    }

    /**
     * Serve para realizar a autenticação de um gerente.
     * @param senha Senha digitada pela pessoa que quer se autenticar como gerente.
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