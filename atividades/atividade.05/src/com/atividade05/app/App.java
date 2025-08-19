package com.atividade05.app;

import javax.swing.JOptionPane;
import com.atividade05.model.Combustivel;

public class App {
    public static void main(String[] args) throws Exception {
            Combustivel combustivel = new Combustivel(0, 0);

        String[] opcoes = {"Calcular valor do combustivel","Sair"};
        Object opcao;

        do{
            opcao = JOptionPane.showInputDialog(
            null,
            "opções",
            "Combustivel",
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]);
            if (opcao == "Calcular valor do combustivel"){
                combustivel.setEtanol(Double.parseDouble(JOptionPane.showInputDialog("informe o valor do etanol").replace(",", ".")));
                combustivel.setGasolina(Double.parseDouble(JOptionPane.showInputDialog("informe o valor da Gasolina").replace(",", ".")));

                JOptionPane.showMessageDialog(
                null, 
                "O melhor para abastecer é " + combustivel.calculo(),
                "Calculo",
                1);
            }
        }while (opcao != "Sair");

    }
}
