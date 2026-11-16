package exercicio5oo.classes;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        setSaldo(saldo);
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo > 0) {
            this.saldo = saldo;
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            this.saldo -= valor;
        }
    }

    public void imprimirSaldo() {
        System.out.printf("Saldo atual: %.2f%n", this.saldo);
    }

    @Override
    public String toString() {
        return "ContaBancaria{numeroConta='" + this.numeroConta + "', titular='" + this.titular
                + "', saldo=" + this.saldo + "}";
    }
}
