package exercicio1oo;

class TesteContaBancaria {
    private static final String NUMERO_CONTA = "123456";
    private static final String TITULAR = "Arthur";
    private static final double SALDO = 1500.0;

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.numeroConta = NUMERO_CONTA;
        conta.titular = TITULAR;
        conta.saldo = SALDO;

        System.out.println("Numero da conta: " + conta.numeroConta);
        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo: " + conta.saldo);
    }
}
