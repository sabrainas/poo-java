package edu.ex.dez.ex01;

public class Administracao {
    public static void main(String[] args) {
        Populacao pp = new Populacao(3, 3);

        pp.atualizarPopulacao(0, 0, 50);
        pp.atualizarPopulacao(0, 1, 100);
        pp.atualizarPopulacao(0, 2, 200);
        pp.atualizarPopulacao(1, 0, 300);
        pp.atualizarPopulacao(1, 1, 200);
        pp.atualizarPopulacao(1, 2, 400);
        pp.atualizarPopulacao(2, 0, 500);
        pp.atualizarPopulacao(2, 1, 200);
        pp.atualizarPopulacao(2, 2, 200);

        pp.popMedia(0);
        pp.popMedia(1);
        pp.popMedia(2);


    }
}
