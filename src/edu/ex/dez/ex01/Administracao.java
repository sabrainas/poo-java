package edu.ex.dez.ex01;

import javax.swing.*;

public class Administracao {
    public static void main(String[] args) {
        int i, j, n;
        Populacao pop = new Populacao(3, 3);
        for(i = 0; i < pop.estados; i++){
            for(j = 0; j < pop.municipios; j++){
                n = Integer.parseInt(JOptionPane.showInputDialog("Informe a população da cidade " + String.valueOf(j+1) + "\ndo estado " + String.valueOf(i+1) + ": "));

                pop.atualizarPopulacao(i, j, n);

            }
        }

        while(true){
            String[] options = {"Sim", "Não"};

            int choice = JOptionPane.showOptionDialog(null, "Deseja calcular a media dos estados? ", "Consulta de " +
                    "Média", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if(choice == 0){
                int index =
                        Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do estado (1 a " + pop.estados + "):")) -1;
                if(index >= 0 && index < pop.estados){
                    double mediaEstado = pop.popMedia(index);

                    JOptionPane.showMessageDialog(null,
                            "A média de população do estado " + (index + 1) + " é: " + mediaEstado);
                }else{
                    JOptionPane.showMessageDialog(null, "Numero do estado inválido");
                }
            }else{
                break;
            }
        }

    }
}
