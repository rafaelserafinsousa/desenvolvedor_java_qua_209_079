package com.atividade.app;
import java.util.Scanner; 
public class App {
    public static void main(String[] args) throws Exception {
        Conta banco = new Conta();
        Scanner leia = new Scanner(System.in);

        int opcao;
        double valor;

        System.out.print("Informe o titular: ");
        banco.titular = leia.nextLine();
        System.out.print("Informe o cpf: ");
        banco.cpf = leia.nextLine();

        do {
            System.out.println(" --------------------\nBanco Labubu da Silva\n --------------------");
            System.out.println("1-Exibir dados da conta\n2-Fazer saque\n3-Fazer saque\n4-Sair do programa");
            System.out.print(" --------------------\nInforme a opção desejada: ");
            opcao = leia.nextInt();

            switch (opcao) {
            case 1:
                banco.exibirDados();
                break;
            case 2:
                System.out.print("Informe o valor so depósito, em R$:");
                valor = leia.nextDouble();
                System.out.println((valor > 0) ? "Depósito efetuado com sucesso!\nSaldo: R$ " + banco.fazerDeposito(valor) : "Valor do depósito inválido");
                break;
            case 3:
                System.out.print("Informe o valor so saque, em R$:");
                valor = leia.nextDouble();
                System.out.println((valor > 0 && valor <= banco.saldo) ? "Depósito efetuado com sucesso!\nSaldo: R$ " + banco.fazerSaque(valor) : "Valor do saque inválido");
                break;
            case 4:
                System.out.println("Saindo do sistema.");
                break;
            default:
                System.err.println("Opção invalida");
                          }
        } while (opcao != 4);    
        leia.close();
    }
}
