package exercicio5oo.testes;

import exercicio5oo.classes.Livro;

public class TesteLivro {
    private static final String TITULO = "A metamorfose";
    private static final String AUTOR = "Franz Kafka";
    private static final String GENERO = "Ficcao";
    private static final boolean DISPONIVEL = false;

    public static void main(String[] args) {
        Livro livroPadrao = new Livro();
        System.out.printf("Construtor padrao: %s%n", livroPadrao);

        Livro livro = new Livro(TITULO, AUTOR, GENERO, DISPONIVEL);
        System.out.printf("Titulo: %s%n", livro.getTitulo());
        System.out.printf("Autor: %s%n", livro.getAutor());
        System.out.printf("Genero: %s%n", livro.getGenero());
        System.out.printf("Disponivel: %s%n", livro.estaDisponivel());
        livro.emprestar();
        livro.emprestar();
        System.out.printf("Disponivel apos emprestimo: %s%n", livro.estaDisponivel());
        livro.devolver();
        livro.devolver();
        System.out.printf("Disponivel apos devolucao: %s%n", livro.estaDisponivel());
        System.out.printf("Emprestado: %s%n", livro.getEmprestado());
        System.out.printf("Construtor parametrizado: %s%n", livro);
    }
}
