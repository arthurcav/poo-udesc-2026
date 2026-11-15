package exercicio4oo.testes;

import exercicio4oo.classes.Aluno;

public class TesteAluno {
    private static final String MATRICULA = "2026001";
    private static final String NOME = "Arthur";
    private static final int IDADE = 18;
    private static final int NOTA_APROVACAO = 8;
    private static final int NOTA_REPROVACAO = 6;

    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setMatricula(MATRICULA);
        aluno.setNome(NOME);
        aluno.setIdade(IDADE);
        aluno.setNota1(NOTA_APROVACAO);
        aluno.setNota2(NOTA_APROVACAO);
        aluno.setNota3(NOTA_APROVACAO);
        aluno.setNota4(NOTA_APROVACAO);

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
    }
}
