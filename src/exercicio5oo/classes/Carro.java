package exercicio5oo.classes;

public class Carro {
    private static final double VARIACAO_VELOCIDADE = 10.0;
    private static final double VELOCIDADE_MINIMA = 0.0;
    private static final double VELOCIDADE_MAXIMA = 300.0;

    private String modelo;
    private String marca;
    private int ano;
    private double velocidade;

    public Carro() {
    }

    public Carro(String modelo, String marca, int ano, double velocidade) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        setVelocidade(velocidade);
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(double velocidade) {
        if (velocidade < VELOCIDADE_MINIMA || velocidade > VELOCIDADE_MAXIMA) {
            return;
        }
        this.velocidade = velocidade;
    }

    public void acelerar() {
        setVelocidade(this.velocidade + VARIACAO_VELOCIDADE);
    }

    public void frear() {
        setVelocidade(this.velocidade - VARIACAO_VELOCIDADE);
    }

    public void imprimirVelocidade() {
        System.out.printf("Velocidade atual: %.1f km/h%n", this.velocidade);
    }

    @Override
    public String toString() {
        return "Carro{modelo='" + this.modelo + "', marca='" + this.marca
                + "', ano=" + this.ano + ", velocidade=" + this.velocidade + "}";
    }
}
