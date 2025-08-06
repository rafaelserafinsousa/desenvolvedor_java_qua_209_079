package com.repeticao.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        String nome;
        int idade, opcao;
        double altura;

        do {
            //menu
            System.out.println("Opção 1 - Registrar nova entrada");
            System.out.println("Opção 2 - Sair da programação");
            System.out.print("informe a opção desejada: ");
            opcao = leia.nextInt();

            if (opcao == 1) {
                leia.nextLine();
                System.out.print("\ninforme o nome: ");
                nome = leia.nextLine();
                System.out.print("informe a idade: ");
                idade = leia.nextInt();
                System.out.print("informe a altura: ");
                altura = leia.nextDouble();

                //verifica
                if (idade >= 12 && altura >= 1.15) {
                    System.out.println(nome + " está autorizado \n");
                } else {
                    System.out.println(nome + " não está autorizado \n");
                }

            } 
            else if (opcao != 2){
                System.out.println("opção inválida. \n");
            }
        } while (opcao != 2);
        leia.close();
    }
}
