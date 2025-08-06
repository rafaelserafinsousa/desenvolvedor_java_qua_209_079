package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        String nome;
        int opcao;
        double peso, altura, imc;

        do {
            System.out.print("\n1-Inicializar calculadora de IMC\n2-Sair do programa\nselecione a opção desejada: ");
            opcao = leia.nextInt();
            if (opcao == 1) {
                leia.nextLine();
                System.out.print("\ninsira o nome: ");
                nome = leia.nextLine();
                System.out.print("insira a altura: ");
                altura = leia.nextDouble();
                System.out.print("insira o peso: ");
                peso = leia.nextDouble();

                imc = peso/(altura*altura);

            if (imc < 18.5 ) System.out.print(nome + " esta abaixo do normal.\n");
            else if (imc <= 18.5 && imc >= 24.9) {
                System.out.println(nome + " esta com peso normal\n");}
            else if (imc <= 25 && imc >= 29.9) {
                System.out.println(nome + " esta com sobrepeso\n");}
            else if (imc <= 30 && imc >= 34.9) {
                System.out.println(nome + " esta com obesidade grau 1\n");}
            else if (imc <= 35 && imc >= 39) {
                System.out.println(nome + " esta com obesidade grau 2\n");}
             else {
                System.out.println(nome + " esta com obesidade grau 3\n");}

            }
            else if (opcao != 2){
                System.out.print("\nEscolha uma opção valida");
            }
        } while (opcao !=2 );        
                leia.close();
            }
}