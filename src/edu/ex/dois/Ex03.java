package edu.ex.dois;

public class Ex03 {
    public static void main(String[] args) {
        int impar = 1;
        for(int i = 0; i <= 15; i++){
            if(i % 2 != 0){
                impar *= i;
            }
        }

        System.out.println("resultado: " + impar);
    }
}
