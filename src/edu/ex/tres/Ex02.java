package edu.ex.tres;

import java.util.Scanner;

//Crie um aplicativo que mostre o efeito abaixo:
//        J
//        Ja
//        Jav
//        Java
//        Jav
//        Ja
//        J
public class Ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = entrada.nextLine();

        for(int i = 1; i <= palavra.length(); i++){
            for(int j = 1; j <= i; j++){
                System.out.print(palavra.charAt(j - 1));
            }
            System.out.println();
        }

        for(int i = palavra.length(); i >= 0; i--){
           for(int j = 1; j <= i; j++){
               System.out.print(palavra.charAt(j - 1));
           }
            System.out.println();
        }
    }
}
