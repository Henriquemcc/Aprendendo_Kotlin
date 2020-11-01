package modelo

/**
 * Serve para calcular o total gasto com a bonificação de todos Funcionário, modelo.Analista, modelo.Gerente, modelo.Diretor.
 */
class CalculadoraBonificacao {

    //Valor total gasto com a bonificação de todos os funcionarios
    var total: Double = 0.0
        private set


    /**
     * Serve para somar a bonificação de todos os funcionarios
     * @param funcionario Instancia da classe modelo.Funcionario, modelo.Analista, modelo.Gerente ou modelo.Diretor.
     */
    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }
}