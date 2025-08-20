package com.atividade06.app;

import javax.swing.JOptionPane;

import com.atividade06.model.Pessoa;
import com.atividade06.model.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
        Veiculo veiculo = new Veiculo(null, null, null, null, null);
        Pessoa dono = new Pessoa(null, null, null, null, null);

        String[] opcoes={"Cadastrar veículo","Verificar dados","Sair"};
        Object opcao;

        dono.setNome(JOptionPane.showInputDialog("Informe o nome proprietário:"));
        dono.setCpf(JOptionPane.showInputDialog("Informe o CPF do titular proprietário:"));
        dono.setEmail(JOptionPane.showInputDialog("Informe o e-mail do titular proprietário:"));
        dono.setTelefone(JOptionPane.showInputDialog("Informe o telefone do proprietário:"));
        dono.setEndereco(JOptionPane.showInputDialog("Informe o endereço do proprietário:"));
        
        do {
            opcao = JOptionPane.showInputDialog(
                null,
                "Esolha a operação desejada!", 
                "escolha",
                0, 
                null, 
                opcoes, 
                opcoes[0]);

        switch (opcao.toString()) {
            case "Cadastrar veículo":
            veiculo.setMarca(JOptionPane.showInputDialog("Marca do veiculo;"));                        
            veiculo.setModelo(JOptionPane.showInputDialog("Modelo do veiculo;"));                        
                veiculo.setAno(JOptionPane.showInputDialog("Ano do veiculo;"));                        
                veiculo.setPlaca(JOptionPane.showInputDialog("Placa do veiculo;"));                        
                break;
            case "Verificar dados":
            JOptionPane.showMessageDialog(
                null,
                veiculo.exibirDados(),
                null,
                0);
                        
                break;
                }
        } while (opcao != "Sair");
    }
}
