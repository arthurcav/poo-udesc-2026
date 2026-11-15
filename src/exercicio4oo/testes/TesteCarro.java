package exercicio4oo.testes;

import exercicio4oo.classes.Carro;

public class TesteCarro {
    private static final String MODELO = "Civic";
    private static final String MARCA = "Honda";
    private static final int ANO = 2024;
    private static final double VELOCIDADE_INICIAL = 120.5;

    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setModelo(MODELO);
        carro.setMarca(MARCA);
        carro.setAno(ANO);
        carro.setVelocidade(VELOCIDADE_INICIAL);

        System.out.printf("Modelo: %s%n", carro.getModelo());
        System.out.printf("Marca: %s%n", carro.getMarca());
        System.out.printf("Ano: %d%n", carro.getAno());
        System.out.printf("Velocidade: %s%n", carro.getVelocidade());
        carro.acelerar();
        carro.imprimirVelocidade();
        carro.frear();
        carro.imprimirVelocidade();
    }
}
