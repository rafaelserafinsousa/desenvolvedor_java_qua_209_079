package com.escolha.app;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        int x, y;
        double result;
        String operacao;

        System.out.print("informe o valor de x: ");
        x = leia.nextInt();
        System.out.print("informe o valor de y: ");
        y = leia.nextInt();

        //limpeza de buffer
        leia.nextLine();

        //menu
        System.out.println("escolha a operação:");
        System.out.println("1 - somar");
        System.out.println("2 - subtrair");
        System.out.println("3 - multiplucar");
        System.out.println("4 - dividir");
        System.out.print("Operação desejada: ");
        operacao = leia.nextLine();
        
    switch (operacao) {
        case"1":
            result = x+y;
            System.out.println("o resultado da soma é " + result);
            break;
        case"2":
            result = x-y;
            System.out.println("o resultado da subtração é " + result);
            break;
        case"3":
            result = x*y;
            System.out.println("o resultado da multiplicação é " + result);
            break;
        case"4":
            result = x/y;
            System.out.println("o resultado da divisão é " + result);
            break;
        default:
            System.out.println("opcão inválida");
            break;
        }
        leia.close();
    }
}