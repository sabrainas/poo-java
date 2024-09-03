package edu.ex.dez.ex01;

public class Populacao {
    private int pop[][];
    public int estados, municipios;

    public Populacao(int estados, int municipios) {
        this.estados = estados;
        this.municipios = municipios;
        pop = new int[estados][municipios];
    }

    public void atualizarPopulacao(int i, int j, int populacao) {
        if(i >= 0 && i < estados && j >= 0 && j < municipios && populacao > 0){
            pop[i][j] = populacao;
        }
    }

    public double popMedia(int estado){
        if(estado < 0 || estado > estados){
            System.out.println("Estado Inválido!");
        }

        int soma = 0;
        for(int j = 0; j < municipios; j++){
            soma += pop[estado][j];
        }
        double media = (double) soma / municipios;
        return media;
    }
}
