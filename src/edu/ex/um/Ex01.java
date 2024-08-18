package edu.ex.um;
//
//Crie um programa que recebe três nomes quaisquer por meio da linha de
//        execução do programa, e os imprima na tela da seguinte maneira: o primeiro e o
//        último nome serão impressos na primeira linha um após o outro, o outro nome
//        (segundo) será impresso na segunda linha.


import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[3];

        System.out.println("Digite 3 nomes ");
        for(int i = 0; i < 3; i++){
            System.out.println(i + 1 + "º ");
            nomes[i] = entrada.nextLine();
        }

        System.out.println(nomes[0] + " " + nomes[2]);
        System.out.println(nomes[1]);

        entrada.close();
    }
}
