package exercicio2oo.testes;

import exercicio2oo.classes.Livro;

public class TesteLivro {
    private static final String TITULO = "A metamorfose";
    private static final String AUTOR = "Franz Kafka";
    private static final String GENERO = "Ficcao";
    private static final boolean EMPRESTADO = false;

    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.titulo = TITULO;
        livro.autor = AUTOR;
        livro.genero = GENERO;
        livro.emprestado = EMPRESTADO;

        System.out.println("Titulo: " + livro.titulo);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Genero: " + livro.genero);
        System.out.println("Emprestado: " + livro.emprestado);
    }
}
