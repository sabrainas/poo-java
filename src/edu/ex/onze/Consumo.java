package edu.ex.onze;

public class Consumo {
    public static void main(String[] args) {
        Carro uno = new Carro(15);

        uno.setQtdComb(55);
        uno.andar(120);

        System.out.println(uno.getQtdComb());
    }
}
