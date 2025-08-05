package com.ifelse.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        //variaveis
        String nome;
        double nota;

        //
        System.out.print("Insira seu nome: ");
        nome = leia.nextLine();
        System.out.print("Insira sua nota: ");
        nota = leia.nextDouble();

        //
        if (nota >= 0 && nota <= 10){
            if (nota >= 7) {
                System.out.println(nome + " está aprovado.");
            }
            else if (nota >= 5) {
                 System.out.println(nome + " está de recuperação."); 
            }
            else {
                System.out.println(nome + " está reprovado.");
            }
        }
        else System.out.println("Nota inválida.");

        leia.close();
    }
}