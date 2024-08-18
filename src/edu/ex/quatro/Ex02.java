package edu.ex.quatro;

import java.util.Scanner;

//Dado um vetor v = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50}, criar um
//programa a que leia um número e verifique e imprima na tela se este número existe
//no vetor
public class Ex02 {
    public static void main(String[] args) {
        int[] v = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50};

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para verificar: ");
        int verificar = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < v.length; i++) {
            if (v[i] == verificar) {
                encontrado = true;
                break;  // Saia do loop, pois já encontramos o número
            }
        }

        if (encontrado) {
            System.out.println("O número " + verificar + " existe no vetor.");
        } else {
            System.out.println("O número " + verificar + " não existe no vetor.");
        }
    }
}
