package exercicio3oo.testes;

import exercicio3oo.classes.Retangulo;

public class TesteRetangulo {
    private static final double LARGURA = 4.0;
    private static final double ALTURA = 7.0;

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        retangulo.setLargura(LARGURA);
        retangulo.setAltura(ALTURA);

        System.out.printf("Largura: %s%n", retangulo.getLargura());
        System.out.printf("Altura: %s%n", retangulo.getAltura());
    }
}
