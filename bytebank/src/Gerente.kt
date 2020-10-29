/**
 *
 * @param nome Nome do gerente.
 * @param cpf Cpf do gerente.
 * @param salario Salario do gerente.
 * @param senha Senha do gerente.
 * */
class Gerente(nome: String, cpf: String, salario: Double, val senha: String) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    /**
     * Calcula a bonificação do gerente.
     * @return Valor da bonificação do gerente.
     * */
    override val bonificacao: Double
        get() = super.bonificacao + this.salario

    /**
     * Serve para converter uma instancia da classe Gerente em uma String.
     * @return String contendo os dados da classe Gerente.
     * */
    override fun toString(): String {
        var str = ""
        str += "Nome: " + this.nome + "\n"
        str += "CPF: " + this.cpf + "\n"
        str += "Salario: " + this.salario + "\n"
        str += "Bonificação: " + bonificacao

        return str
    }

    /**
     * Serve para realizar a autenticação de um gerente.
     * @param senha Senha digitada pela pessoa que quer se autenticar como gerente.
     * @return Valor booleano indicando se foi autenticado.
     * */
    fun autentica(senha: String): Boolean {
        var sucesso = false

        if (this.senha.equals(senha)) {
            sucesso = true
        }

        return sucesso
    }
}