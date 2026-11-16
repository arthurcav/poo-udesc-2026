package exercicio5oo.testes;

import exercicio5oo.classes.Circulo;

public class TesteCirculo {
    private static final double RAIO = 5.0;
    private static final double RAIO_INVALIDO = -1.0;
    private static final double RAIO_ACIMA_DO_LIMITE = 1001.0;

    public static void main(String[] args) {
        Circulo circuloPadrao = new Circulo();
        System.out.printf("Construtor padrao: %s%n", circuloPadrao);

        Circulo circulo = new Circulo(RAIO);
        circulo.setRaio(RAIO_INVALIDO);
        circulo.setRaio(RAIO_ACIMA_DO_LIMITE);

        System.out.printf("Raio: %.1f%n", circulo.getRaio());
        System.out.printf("Diametro: %.2f%n", circulo.calcularDiametro());
        System.out.printf("Perimetro: %.2f%n", circulo.calcularPerimetro());
        System.out.printf("Area: %.2f%n", circulo.calcularArea());
        System.out.printf("Construtor parametrizado: %s%n", circulo);
    }
}
