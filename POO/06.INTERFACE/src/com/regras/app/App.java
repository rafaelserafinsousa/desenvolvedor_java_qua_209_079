package com.regras.app;

import java.util.Scanner;
import com.regras.model.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Conta cc = new Conta(null, null, null, null, 0);
        Scanner sc = new Scanner(System.in);
        int opcao;
        double valor;

        System.out.println("----Informe os dados----");
        System.out.println("Informe o titular da conta: ");
        cc.setTitular(sc.nextLine());
        System.out.println("Informe o cpf do titular da conta: ");
        cc.setCpf(sc.nextLine());

            do {
                System.out.println("----Banco Javinho----");
                System.out.println("1-Exibir dados da conta\n2-Fazer saque\n3-Fazer saque\n4-Sair do programa");
                System.out.print("Selecione uma das opções: ");
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        cc.exibirDados();
                        break;
                    case 2:
                        System.out.print("Exibir valor do saque em R$: ");
                        valor = sc.nextDouble();
                        System.out.println((valor > 0) ? "Saque efetuado com sucesso!\nSaldo: R$ " + cc.fazerSaque(valor) : "Valor do Saque inválido");
                        break;
                    case 3:
                        System.out.print("Exibir valor do depósito em R$: ");
                        valor = sc.nextDouble();
                        System.out.println((valor > 0) ? "Depósito efetuado com sucesso!\nSaldo: R$ " + cc.fazerDeposito(valor) : "Valor do depósito inválido");
                        break;
                    case 4:
                        System.out.println("Saindo do prgrama");   
                        break;
                
                    default:
                    System.out.println("Opção inválida");
                        break;
                }

            } while (opcao != 4);
    
        sc.close();
    }
}