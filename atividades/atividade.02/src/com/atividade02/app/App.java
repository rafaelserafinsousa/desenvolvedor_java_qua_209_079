package com.atividade02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
 
        String nome;
        int idade, opcao;

            System.out.print("informe nome: ");
            nome = leia.nextLine();
            System.out.print("informe idade: ");
            idade = leia.nextInt();

        do {

            System.out.println("\n1- filme16");
            System.out.println("2- filme12");
            System.out.println("3- filmelivre ");
            System.out.println("4- filme14");
            System.out.println("5- filme18");
            System.out.println("Sair");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    if (idade >= 16) {
                        System.out.println(nome + "ingresso liberado\n saindo...");
                    } else {
                        System.out.println("Esse filme pode ser inadequado para sua faixa etária!\n por favor escolha outro filme");
                    }
                case 2:
                    if (idade >= 12) {
                        System.out.println(nome + "ingresso liberado\n saindo...");
                    } else {
                        System.out.println("Esse filme pode ser inadequado para sua faixa etária!\n por favor escolha outro filme");
                    }
                case 3:
                        System.out.println(nome + "ingresso liberado\n saindo...");
                case 4:
                    if (idade >= 14) {
                        System.out.println(nome + "ingresso liberado\n saindo...");
                    } else {
                        System.out.println("Esse filme pode ser inadequado para sua faixa etária!\n por favor escolha outro filme");
                    }
                case 5:
                    if (idade >= 18) {
                        System.out.println(nome + "ingresso liberado\n saindo...");
                    } else {
                        System.out.println("Esse filme pode ser inadequado para sua faixa etária!\n por favor escolha outro filme");
                    }
                    break;
            
                default:
                    break;
            }
        } while (opcao != 6);
        leia.close();
    }
}
