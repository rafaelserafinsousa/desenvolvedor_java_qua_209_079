package com.ifelse.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //instancia o objeto scanner
        Scanner leia = new Scanner(System.in); 

        //declaração de variaveis
        String nome;
        double altura;
        int idade;

        //input
        System.out.print("informe seu nome: ");
        nome = leia.nextLine();
        System.out.print("informe sua idade: ");
        idade = leia.nextInt();
        System.out.print("iforme sua altura: ");
        altura = leia.nextDouble();
    
        //estrutura de decisão
        if (idade >= 12 && altura >= 1.15) {
            System.out.println(nome + " está autorizado.");
        }
        else {
            System.out.println(nome + " não está autorizado.");
        }
        //fecha objeto leia
        leia.close();
    }
}
