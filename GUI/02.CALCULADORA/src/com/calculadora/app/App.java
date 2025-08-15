package com.calculadora.app;

import javax.swing.JOptionPane;

import com.calculadora.controller.Calculadora;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora(0, 0);

        String[] opcoes = {"Somar","Subtrair","Multiplicar","Dividir","Sair"};
        Object opcao;
        
        do {
            opcao = JOptionPane.showInputDialog(
                null, 
                "Selecione uma Opção", 
                "Calculadora", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                opcoes, 
                opcoes[0]);

            if (opcao != "Sair") {
                calculadora.setX(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de X:")));
                calculadora.setY(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de y:")));
            }

            if (opcao == "Somar") {
                JOptionPane.showMessageDialog(
                    null, 
                    "seu resultado é "+calculadora.somar(calculadora.getX(), calculadora.getY()), 
                    "soma", 
                    JOptionPane.INFORMATION_MESSAGE); }
            else  if (opcao == "subtrair") {
                JOptionPane.showMessageDialog(
                    null, 
                    "seu resultado é "+calculadora.subtrair(calculadora.getX(), calculadora.getY()), 
                    "subtração", 
                    1); }
            else  if (opcao == "Multiplicar") {
                JOptionPane.showMessageDialog(
                    null, 
                    "O resultado é "+calculadora.multiplicar(calculadora.getX(), calculadora.getY()), 
                    "multiplicar", 
                    1); }
            else  if (opcao == "Dividir") {
                JOptionPane.showMessageDialog(
                    null, 
                    "O resultado é "+calculadora.dividir(calculadora.getX(), calculadora.getY()), 
                    "Dividir", 
                    1); }

        } while (opcao != "Sair");

    }
}
