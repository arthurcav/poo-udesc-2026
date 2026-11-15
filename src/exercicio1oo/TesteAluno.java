package exercicio1oo;

class TesteAluno {
    private static final String MATRICULA = "2026001";
    private static final String NOME = "Arthur";
    private static final int IDADE = 18;
    private static final int NOTA = 10;

    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.matricula = MATRICULA;
        aluno.nome = NOME;
        aluno.idade = IDADE;
        aluno.nota1 = NOTA;
        aluno.nota2 = NOTA;
        aluno.nota3 = NOTA;
        aluno.nota4 = NOTA;

        System.out.println("Matricula: " + aluno.matricula);
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Idade: " + aluno.idade);
        System.out.println("Nota 1: " + aluno.nota1);
        System.out.println("Nota 2: " + aluno.nota2);
        System.out.println("Nota 3: " + aluno.nota3);
        System.out.println("Nota 4: " + aluno.nota4);
    }
}
