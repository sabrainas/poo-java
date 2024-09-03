package edu.ex.doze;

public class Aluno {
    private String nome;
    private int matricula;
    private double nota1;
    private double nota2;
    private double nota3;
    private int peso1;
    private int peso2;
    private int peso3;

    public Aluno() {}

    public Aluno(String nome, int matricula, double nota1, double nota2, double nota3, int peso1, int peso2, int peso3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.peso1 = peso1;
        this.peso2 = peso2;
        this.peso3 = peso3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        if(nome.charAt(2) < 2){
            System.out.println("Nome inválido. Deve conter pelo menos dois caracteres.");
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
        if(matricula > 9 && matricula < 9) {
            System.out.println("A matrícula deve conter apenas 9 dígitos");
        }
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public int getPeso1() {
        return peso1;
    }

    public void setPeso1(int peso1) {
        this.peso1 = peso1;
    }

    public int getPeso2() {
        return peso2;
    }

    public void setPeso2(int peso2) {
        this.peso2 = peso2;
    }

    public int getPeso3() {
        return peso3;
    }

    public void setPeso3(int peso3) {
        this.peso3 = peso3;
    }

    public double media(){
        double soma = (getNota1() * getPeso1()) + (getNota2() + getPeso2()) + (getNota3() + getPeso3());
        double media = soma / 3;
        return media;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + '\n' +
                "Matricula: " + matricula;
    }

    public void imprimir(){
        System.out.println("----------------------");
        System.out.println(toString());
        System.out.println("Média: " + media());
        System.out.println("----------------------");

    }
}
