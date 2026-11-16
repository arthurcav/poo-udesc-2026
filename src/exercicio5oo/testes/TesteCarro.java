package exercicio5oo.testes;

import exercicio5oo.classes.Carro;

public class TesteCarro {
    private static final String MODELO = "Civic";
    private static final String MARCA = "Honda";
    private static final int ANO = 2024;
    private static final double VELOCIDADE_INICIAL = 120.0;
    private static final double VELOCIDADE_MAXIMA = 300.0;
    private static final double VELOCIDADE_MINIMA = 0.0;

    public static void main(String[] args) {
        Carro carroPadrao = new Carro();
        System.out.printf("Construtor padrao: %s%n", carroPadrao);

        Carro carro = new Carro(MODELO, MARCA, ANO, VELOCIDADE_INICIAL);
        carro.setVelocidade(-1.0);
        carro.setVelocidade(301.0);

        System.out.printf("Modelo: %s%n", carro.getModelo());
        System.out.printf("Marca: %s%n", carro.getMarca());
        System.out.printf("Ano: %d%n", carro.getAno());
        System.out.printf("Velocidade: %.1f%n", carro.getVelocidade());
        carro.acelerar();
        carro.imprimirVelocidade();
        carro.frear();
        carro.imprimirVelocidade();

        carro.setVelocidade(VELOCIDADE_MAXIMA);
        carro.acelerar();
        carro.imprimirVelocidade();
        carro.setVelocidade(VELOCIDADE_MINIMA);
        carro.frear();
        carro.imprimirVelocidade();
        System.out.printf("Construtor parametrizado: %s%n", carro);
    }
}
