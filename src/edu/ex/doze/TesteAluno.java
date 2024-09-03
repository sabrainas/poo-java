package edu.ex.doze;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Sa");
        aluno.setMatricula(1);
        aluno.setNota1(9);
        aluno.setNota2(10);
        aluno.setNota3(8);
        aluno.setPeso1(2);
        aluno.setPeso2(1);
        aluno.setPeso3(2);
        aluno.media();
        aluno.imprimir();

    }
}
