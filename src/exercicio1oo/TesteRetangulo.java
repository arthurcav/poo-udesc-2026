package exercicio1oo;

class TesteRetangulo {
    private static final double LARGURA = 4.0;
    private static final double ALTURA = 7.0;

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        retangulo.largura = LARGURA;
        retangulo.altura = ALTURA;

        System.out.println("Largura: " + retangulo.largura);
        System.out.println("Altura: " + retangulo.altura);
    }
}
