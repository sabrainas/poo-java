package edu.ex.onze;

public class Carro {
    private double consumoComb; //km/l
    private double qtdComb;

    public Carro(double consumoComb) {
        this.consumoComb = consumoComb;
        this.qtdComb = 0;
    }

    public double getConsumoComb() {
        return consumoComb;
    }

    public void setConsumoComb(double consumoComb) {
        this.consumoComb = consumoComb;
    }

    public double getQtdComb() {
        return qtdComb;
    }

    public void setQtdComb(double qtdComb) {
        this.qtdComb = qtdComb;
    }

    public void andar(double km) {
        if (qtdComb <= 0) {
            System.out.println("Acabou a gasolina");
            return;
        }

        double consumoNecessario = km / consumoComb;

        if (consumoNecessario > qtdComb) {
            System.out.println("Combustível insuficiente para percorrer a distância.");
            qtdComb = 0; // Carro fica sem combustível
        } else {
            qtdComb -= consumoNecessario;
            System.out.println("Você percorreu " + km + " km.");
            System.out.println("Combustivel gasto: " + qtdComb + " litros.");
            System.out.println("Combustivel restante: " + consumoNecessario + " litros.");
        }
    }

}

