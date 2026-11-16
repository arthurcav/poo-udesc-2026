package exercicio5oo.testes;

import exercicio5oo.classes.Retangulo;

public class TesteRetangulo {
    private static final double LARGURA = 4.0;
    private static final double ALTURA = 7.0;
    private static final double DIMENSAO_INVALIDA = -1.0;
    private static final double DIMENSAO_ACIMA_DO_LIMITE = 1001.0;

    public static void main(String[] args) {
        Retangulo retanguloPadrao = new Retangulo();
        System.out.printf("Construtor padrao: %s%n", retanguloPadrao);

        Retangulo retangulo = new Retangulo(LARGURA, ALTURA);
        retangulo.setLargura(DIMENSAO_INVALIDA);
        retangulo.setAltura(DIMENSAO_ACIMA_DO_LIMITE);

        System.out.printf("Largura: %.1f%n", retangulo.getLargura());
        System.out.printf("Altura: %.1f%n", retangulo.getAltura());
        System.out.printf("Area: %.2f%n", retangulo.calcularArea());
        System.out.printf("Construtor parametrizado: %s%n", retangulo);
    }
}
