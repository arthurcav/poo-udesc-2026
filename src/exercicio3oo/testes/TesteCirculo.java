package exercicio3oo.testes;

import exercicio3oo.classes.Circulo;

public class TesteCirculo {
    private static final double RAIO = 5.0;

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRaio(RAIO);

        System.out.printf("Raio: %s%n", circulo.getRaio());
    }
}
