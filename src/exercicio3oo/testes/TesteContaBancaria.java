package exercicio3oo.testes;

import exercicio3oo.classes.ContaBancaria;

public class TesteContaBancaria {
    private static final String NUMERO_CONTA = "123456";
    private static final String TITULAR = "Arthur";
    private static final double SALDO = 1500.0;

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(NUMERO_CONTA);
        conta.setTitular(TITULAR);
        conta.setSaldo(SALDO);

        System.out.printf("Numero da conta: %s%n", conta.getNumeroConta());
        System.out.printf("Titular: %s%n", conta.getTitular());
        System.out.printf("Saldo: %s%n", conta.getSaldo());
    }
}
