package exercicio1oo;

class TestaAluno {
    public static void main(String[] args) {
        Aluno arthur = new Aluno();

        arthur.matricula = "20";
        arthur.nome = "Arthur";
        arthur.idade = 18;
        arthur.nota1 = 10;
        arthur.nota2 = 10;
        arthur.nota3 = 10;
        arthur.nota4 = 10;

        System.out.println("Matricula: " + arthur.matricula);
        System.out.println("Nome: " + arthur.nome);
        System.out.println("Idade: " + arthur.idade);
        System.out.println("Nota 1: " + arthur.nota1);
        System.out.println("Nota 2: " + arthur.nota2);
        System.out.println("Nota 3: " + arthur.nota3);
        System.out.println("Nota 4: " + arthur.nota4);
    }
}
