package exercicio5oo.testes;

import exercicio5oo.classes.ContaBancaria;

public class TesteContaBancaria {
    private static final String NUMERO_CONTA = "123456";
    private static final String TITULAR = "Arthur";
    private static final double SALDO_INICIAL = 1500.0;
    private static final double VALOR_DEPOSITO = 200.0;
    private static final double VALOR_SAQUE = 50.0;
    private static final double VALOR_NAO_POSITIVO = -10.0;

    public static void main(String[] args) {
        ContaBancaria contaPadrao = new ContaBancaria();
        System.out.printf("Construtor padrao: %s%n", contaPadrao);

        ContaBancaria conta = new ContaBancaria(NUMERO_CONTA, TITULAR, SALDO_INICIAL);
        conta.setSaldo(VALOR_NAO_POSITIVO);
        conta.depositar(VALOR_NAO_POSITIVO);
        conta.sacar(VALOR_NAO_POSITIVO);

        System.out.printf("Numero da conta: %s%n", conta.getNumeroConta());
        System.out.printf("Titular: %s%n", conta.getTitular());
        conta.depositar(VALOR_DEPOSITO);
        conta.imprimirSaldo();
        conta.sacar(VALOR_SAQUE);
        conta.imprimirSaldo();
        System.out.printf("Construtor parametrizado: %s%n", conta);
    }
}
