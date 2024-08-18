package edu.ex.sete.ex01;

public class TesteAgenda {
    public static void main(String[] args) {
        Agencia ag = new Agencia();
        ag.nrAgencia = "1";
        ag.codBanco = 234;

        System.out.println("----------------");
        System.out.println("AGENCIA: " + ag.nrAgencia);
        System.out.println("BANCO: " + ag.codBanco);
        System.out.println("----------------");
    }
}
