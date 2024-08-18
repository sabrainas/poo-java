package edu.ex.dois;
//Crie uma classe que gere um numero aleatório entre os valores máximo e
//        mínimo recebidos do usuário na linha de comando.
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor Mínimo: ");
        int min = entrada.nextInt();

        System.out.print("Valor Máximo: ");
        int max = entrada.nextInt();

        System.out.println((int) (min + (Math.random()*(max-min))));
    }
}
