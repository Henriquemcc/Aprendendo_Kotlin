package exception

class FalhaAutenticacaoException(mensagem: String = "Falha na autenticação") :
        Exception(mensagem)