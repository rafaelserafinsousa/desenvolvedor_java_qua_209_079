package com.encapsulamento.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa usuario = new Pessoa();
        Scanner sc = new Scanner(System.in);

        System.out.print("informe nome: ");
        usuario.setNome(sc.nextLine());
        System.out.print("informe nome: ");
        usuario.setIdade(sc.nextInt());

        System.out.println("nome: "+ usuario.getNome());
        System.out.println("idade: "+ usuario.getIdade());

        sc.close();
    }
}
