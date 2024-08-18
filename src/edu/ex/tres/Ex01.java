package edu.ex.tres;

import java.util.Scanner;

// Crie um aplicativo que receba uma frase e mostre-a de forma invertida
public class Ex01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase qualquer: ");
        String palavra = entrada.nextLine();

        for(int i = palavra.length() - 1; i >= 0; i--){
            System.out.print(palavra.charAt(i));
        }
    }
}