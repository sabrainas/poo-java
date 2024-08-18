package edu.ex.dois;

//Faça um programa que apresente o total da soma dos cem primeiros
//        números inteiros (1+2+3+.....+99+100).

public class Ex02 {
    public static void main(String[] args) {
        int soma = 0;
        for(int i = 0; i <= 100; i++){
            soma += i;
        }

        System.out.println("soma total: " + soma);
    }
}
