package exercicio4oo.testes;

import exercicio4oo.classes.ContaBancaria;

public class TesteContaBancaria {
    private static final String NUMERO_CONTA = "123456";
    private static final String TITULAR = "Arthur";
    private static final double SALDO_INICIAL = 1500.0;
    private static final double VALOR_DEPOSITO = 200.0;
    private static final double VALOR_SAQUE = 50.0;

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(NUMERO_CONTA);
        conta.setTitular(TITULAR);
        conta.setSaldo(SALDO_INICIAL);

        System.out.printf("Numero da conta: %s%n", conta.getNumeroConta());
        System.out.printf("Titular: %s%n", conta.getTitular());
        conta.depositar(VALOR_DEPOSITO);
        conta.imprimirSaldo();
        conta.sacar(VALOR_SAQUE);
        conta.imprimirSaldo();
    }
}
