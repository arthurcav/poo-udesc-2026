package exercicio5oo.testes;

import exercicio5oo.classes.Aluno;

public class TesteAluno {
    private static final String MATRICULA = "2026001";
    private static final String NOME = "Arthur";
    private static final int IDADE = 18;
    private static final int NOTA_APROVACAO = 8;
    private static final int NOTA_REPROVACAO = 6;

    public static void main(String[] args) {
        Aluno alunoPadrao = new Aluno();
        System.out.printf("Construtor padrao: %s%n", alunoPadrao);

        Aluno aluno = new Aluno(MATRICULA, NOME, IDADE,
                NOTA_APROVACAO, NOTA_APROVACAO, NOTA_APROVACAO, NOTA_APROVACAO);
        aluno.setNota1(11);
        aluno.setNota2(-1);

        System.out.printf("Matricula: %s%n", aluno.getMatricula());
        System.out.printf("Nome: %s%n", aluno.getNome());
        System.out.printf("Idade: %d%n", aluno.getIdade());
        System.out.printf("Nota 1: %d%n", aluno.getNota1());
        System.out.printf("Nota 2: %d%n", aluno.getNota2());
        System.out.printf("Nota 3: %d%n", aluno.getNota3());
        System.out.printf("Nota 4: %d%n", aluno.getNota4());
        System.out.printf("Media: %.2f%n", aluno.calcularMedia());
        aluno.imprimirSituacao();

        aluno.setNota1(NOTA_REPROVACAO);
        aluno.setNota2(NOTA_REPROVACAO);
        aluno.setNota3(NOTA_REPROVACAO);
        aluno.setNota4(NOTA_REPROVACAO);
        System.out.printf("Media: %.2f%n", aluno.calcularMedia());
        aluno.imprimirSituacao();
        System.out.printf("Construtor parametrizado: %s%n", aluno);
    }
}
