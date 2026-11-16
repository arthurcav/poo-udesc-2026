package exercicio4oo.testes;

import exercicio4oo.classes.Livro;

public class TesteLivro {
    private static final String TITULO = "A metamorfose";
    private static final String AUTOR = "Franz Kafka";
    private static final String GENERO = "Ficcao";
    private static final boolean EMPRESTADO = false;

    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setTitulo(TITULO);
        livro.setAutor(AUTOR);
        livro.setGenero(GENERO);
        livro.setEmprestado(EMPRESTADO);

        System.out.printf("Titulo: %s%n", livro.getTitulo());
        System.out.printf("Autor: %s%n", livro.getAutor());
        System.out.printf("Genero: %s%n", livro.getGenero());
        System.out.printf("Disponivel: %s%n", livro.estaDisponivel());
        livro.emprestar();
        System.out.printf("Disponivel apos emprestimo: %s%n", livro.estaDisponivel());
        livro.devolver();
        System.out.printf("Disponivel apos devolucao: %s%n", livro.estaDisponivel());
    }
}
