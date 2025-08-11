package com.objeto.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //instanciar classe pessoa
        Pessoa usuario = new Pessoa();

        Scanner leia = new Scanner(System.in);

        //define valores
        System.out.print("Informe o nome: ");
        usuario.nome = leia.nextLine();
        System.out.print("Informe a idade: ");
        usuario.idade = leia.nextInt();
        System.out.print("Informe a altura: ");
        usuario.altura = leia.nextDouble();
        
        // output
        System.out.println(usuario.cumprimentar());
        usuario.exibirDados();

        leia.close();
    }
} 