package edu.ex.oito.ex01;

public class Conta {
    private double saldo;
    private String nrAgencia;
    private String titular;
    private String nrConta;
    private int codBanco;

    public Conta(double saldo, String nrAgencia, String titular, String nrConta, int codBanco) {
        this.saldo = saldo;
        this.nrAgencia = nrAgencia;
        this.titular = titular;
        this.nrConta = nrConta;
        this.codBanco = codBanco;
    }
    public void saque(double valor) {
        if(valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque Efetuado com sucesso!");
            System.out.println("Saldo Atual: " + saldo);
        }else{
            System.out.println("Saldo Insuficiente!");
        }
    }

    public void deposito(double valor) {
        if(valor >= saldo) {
            saldo += valor;
            System.out.println("Depósito Efetuado com sucesso!");
        }else{
            System.out.println("Valor inválido!");
        }
    }

    public void imprimeDados(){
        System.out.println("-------------------------");
        System.out.println("AGENCIA:\t" + nrAgencia + "\t BANCO:\t" + codBanco);
        System.out.println("CONTA:\t" + titular + " - " + nrConta);
        System.out.println("SALDO:\t" + saldo);
        System.out.println("-------------------------");
    }
    public double getSaldo() {
        return saldo;
    }
}
