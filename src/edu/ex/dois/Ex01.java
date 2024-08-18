package edu.ex.dois;

import java.util.Scanner;

//Faça um aplicativo que receba três valores inteiros na linha de comando e
//        mostre o maior dentre eles
public class Ex01 {
    public static void main(String[] args) {
        int[] num = new int[3];

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 3 números inteiros");
        for(int i = 0; i < num.length; i++){
            System.out.print(i + 1 + "º ");
            num[i] = entrada.nextInt();
        }

        int maior = 0;
        for(int i = 0; i < num.length; i++){
            if(num[i] > maior) {
                maior = num[i];
            }
        }

        System.out.println("O maior número é: " + maior);

        entrada.close();
    }
}
