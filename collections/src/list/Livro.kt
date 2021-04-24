package list

/**
 * Representa um livro
 */
data class Livro(
        /**
         * Título do livro
         */
        val titulo: String,
        /**
         * Nome do autor do livro
         */
        val autor: String,
        /**
         * Ano de publicação do livro
         */
        val anoPublicacao: Long,
        /**
         * Nome da editora do livro
         */
        val editora: String? = null
)
