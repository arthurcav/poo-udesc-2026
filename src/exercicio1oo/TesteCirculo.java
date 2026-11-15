package exercicio1oo;

class TesteCirculo {
    private static final double RAIO = 5.0;

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.raio = RAIO;

        System.out.println("Raio: " + circulo.raio);
    }
}
