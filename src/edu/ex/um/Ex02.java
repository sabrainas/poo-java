package edu.ex.um;

//Faça um programa que receba a quantidade e o valor de dois produtos, no
//        seguinte formato: quantidade1 valor1 quantidade2 valor2. O programa deve
//        calcular esses valores seguindo a fórmula total = (quantidade1 x valor1) +
//        (quantidade2 x valor2). O valor total deve ser apresentado no final da execução.

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int quantidade1, quantidade2;
        double valor1, valor2, total = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade do produto 1: ");
        quantidade1 = entrada.nextInt();
        System.out.print("Digite o valor do produto 1: ");
        valor1 = entrada.nextDouble();

        System.out.print("Digite a quantidade do produto 2: ");
        quantidade2 = entrada.nextInt();
        System.out.print("Digite o valor do produto 2: ");
        valor2 = entrada.nextDouble();

        total = (quantidade1 * valor1) + (quantidade2 * valor2);

        System.out.println("O total desses produtos são: " + total);

        entrada.close();
    }
}
