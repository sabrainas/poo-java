package edu.ex.quatro;

import java.util.Scanner;

//Uma escola precisa de um programa que controle a média das notas dos
//alunos de cada classe e a média das notas de todos os alunos da escola.
//Sabendo que essa escola possui 3 classes com 5 alunos em cada classe, gerando
//um total de 15 notas, crie um programa que receba as notas de cada aluno de
//cada classe e no final apresente a média de cada classe e a média da escola em
//geral.
public class Ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] escola = new double[3][5];
        double somaMedia = 0;
        int totalAlunos = 0;
        for(int i = 0; i < escola.length; i++) {
            double somaMediaClasse = 0;
            System.out.println("Digite a media dos alunos da classe " + (i + 1));

            for (int j = 0; j < escola[i].length; j++) {
                System.out.print("Aluno " + (j + 1) + ": ");
                escola[i][j] = sc.nextDouble();
                somaMedia += escola[i][j];
                somaMediaClasse += escola[i][j];
            }
            double mediaClasse = somaMediaClasse / escola[i].length;
            System.out.println("Média da classe " + (i + 1) + " = " + mediaClasse);
            totalAlunos += escola[i].length;
        }
        double mediaEscola = somaMedia / totalAlunos;
        System.out.println("Média Geral da Escola = " + mediaEscola);
    }
}
