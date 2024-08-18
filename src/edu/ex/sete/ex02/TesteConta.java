package edu.ex.sete.ex02;

public class TesteConta {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.nrAgencia = "1";
        conta.codBanco = 234;
        conta.nrConta = "01945";
        conta.titular = "Sabrina";
        conta.saldo = 10000.00;

        System.out.println("------------------------");
        System.out.print("AGENCIA: " + conta.nrAgencia + " BANCO: " + conta.codBanco + "\n" + "CONTA CORRENTE: " + conta.nrConta + "\n" + "TITULAR: " + conta.titular + "\n" + "SALDO: " + conta.saldo + "\n");
        System.out.println("------------------------");
    }
}
