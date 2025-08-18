package com.atividade04.app;

import javax.swing.JOptionPane;
import com.imc.model.*;

public class App {
    public static void main(String[] args) throws Exception {
        DadosImc imc = new DadosImc(0, 0);

String[] opcoes = {"calcular IMC","Sair"};
Object opcao;
double imcValor;

do{
    opcao = JOptionPane.showInputDialog( null,
    "Escolha Opção desejada",
    "IMC",
    JOptionPane.QUESTION_MESSAGE,
    null,
    opcoes,
    opcoes[0]
    );
    if (opcao == "calcular IMC"){
        imc.setPeso(Double.parseDouble(JOptionPane.showInputDialog("informe seu peso em kg").replace(",", ".")));
        imc.setAltura(Double.parseDouble(JOptionPane.showInputDialog("informe sua altura em metros:").replace(",", ".")));

        imcValor = imc.imc();

        JOptionPane.showMessageDialog(null,
        "Valor do IMC: "+ String.format("%.2f", imcValor)+"\n"+imc.diagnotistico(imcValor),
        "IMC resultado",
        1);
    }
} while (opcao != "Sair");

    }
}
