package com.atividade02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
 
        String nome;
        int idade, opcao, idadeMinima = 0;

        System.out.print("informe nome: ");
        nome = leia.nextLine();
        System.out.print("\ninforme idade: ");
        idade = leia.nextInt();

        do {  
            System.out.println("Sala 3- PeppaPig (livre)");
            System.out.println("Sala 2- StarWars III (+12)");
            System.out.println("Sala 1- Hereditário (+16)");
            System.out.println("Sala 4- Jogos Vorazes (+14)");
            System.out.println("Sala 5- Extermínio 3 (+18)");
            System.out.print("Escolha uma sala: ");

            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                        break;

                case 2:
                idadeMinima = 12;
                        break;

                case 3:
                 idadeMinima = 16;
                    break;
                case 4:
                idadeMinima = 14;
                    break;
                case 5:
                    idadeMinima = 18;
                    break;
            
                default:
                System.out.println("sala inexistente");
            }
            if (idade > idadeMinima) {
                System.out.println(nome + " seu ingresso foi liberado!");
                System.out.println("Aproveite o filme!");
            } else {
                System.out.println("Esse filme pode ser inadequado para sua faixa etária!\nPor favor escolha outro filme!\n");
            }

        } while (idade <= idadeMinima);
        leia.close();
    }
}
