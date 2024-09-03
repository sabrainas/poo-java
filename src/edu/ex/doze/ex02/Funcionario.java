package edu.ex.doze.ex02;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalarioReajustado() {
        double acrescimo;
        if (salario <= 150) {
            acrescimo = salario * 0.25;
        } else if (salario > 150 && salario <= 300) {
            acrescimo = salario * 0.20;
        } else if (salario > 300 && salario <= 600) {
            acrescimo = salario * 0.15;
        } else {
            acrescimo = salario * 0.10;
        }
        return salario + acrescimo;
    }

    public void imprimirSalario(){
        double salarioReajustado = calcularSalarioReajustado();
        System.out.printf("Nome: %s%n", getNome());
        System.out.printf("Salario Atual: %s%n", getSalario());
        System.out.printf("Salário Reajustado: %s%n%n", salarioReajustado);
    }
}
