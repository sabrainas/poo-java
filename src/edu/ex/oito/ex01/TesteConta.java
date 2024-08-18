package edu.ex.oito.ex01;

public class TesteConta {
    public static void main(String[] args) {
        Conta conta = new Conta(400.00, "1", "Sabrina", "234", 9876);
        conta.imprimeDados();

        conta.saque(234);
        conta.imprimeDados();

        conta.saque(300);
        conta.imprimeDados();

        conta.deposito(500);
        conta.imprimeDados();
        conta.getSaldo();
    }
}
