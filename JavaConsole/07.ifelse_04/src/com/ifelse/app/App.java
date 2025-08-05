package com.ifelse.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        String nome;
        int idade;

        System.out.print("Insira seu nome:  ");
        nome = leia.nextLine();
        System.out.print("Insira sua idade: ");
        idade = leia.nextInt();

        //ternário
        System.out.println(nome + ((idade >= 18) ? " é maior de idade." : " rafé menor de idade."));

        leia.close();
    }
}
