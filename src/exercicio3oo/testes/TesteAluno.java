package exercicio3oo.testes;

import exercicio3oo.classes.Aluno;

public class TesteAluno {
    private static final String MATRICULA = "2026001";
    private static final String NOME = "Arthur";
    private static final int IDADE = 18;
    private static final int NOTA = 10;

    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setMatricula(MATRICULA);
        aluno.setNome(NOME);
        aluno.setIdade(IDADE);
        aluno.setNota1(NOTA);
        aluno.setNota2(NOTA);
        aluno.setNota3(NOTA);
        aluno.setNota4(NOTA);

        System.out.printf("Matricula: %s%n", aluno.getMatricula());
        System.out.printf("Nome: %s%n", aluno.getNome());
        System.out.printf("Idade: %d%n", aluno.getIdade());
        System.out.printf("Nota 1: %d%n", aluno.getNota1());
        System.out.printf("Nota 2: %d%n", aluno.getNota2());
        System.out.printf("Nota 3: %d%n", aluno.getNota3());
        System.out.printf("Nota 4: %d%n", aluno.getNota4());
    }
}
