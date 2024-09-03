package edu.ex.treze;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculaIMC(){
        double imc = peso/(altura*altura);

        if(imc < 17){
            System.out.println("Muito abaixo do peso");
        }else if(imc >= 17 && imc < 18.5){
            System.out.printf("Abaixo do peso");
        }else if(imc >= 18.5 && imc < 24.9){
            System.out.printf("Peso Normal");
        }else if(imc >= 24.9 && imc < 29.9){
            System.out.printf("Acima do peso");
        }else if(imc >= 29.9 && imc < 34.9){
            System.out.printf("Obesidade I");
        }else if(imc >= 34.9 && imc < 39.9){
            System.out.println("Obesidade II");
        }else if(imc >= 39.9){
            System.out.println("Obesidade III");
        }
        return imc;
    }

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        double imc = calculaIMC();
        System.out.printf("\nIMC: %.2f%n", imc);
    }

}
