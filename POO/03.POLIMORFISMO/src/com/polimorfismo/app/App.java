package com.polimorfismo.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica(null, null, null, null, null, null);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null, null, null);

        System.out.print("DADOS DO USUÁRIO\nInforme o nome do usuário: ");
        usuario.nome = leia.nextLine();
        System.out.print("Informe o cpf do usuário: ");
        usuario.cpf = leia.nextLine();
        System.out.print("Informe a data de nascimento do usuário: ");
        usuario.dataNascimento = leia.nextLine();
        System.out.print("Informe o e-mail do usuário: ");
        usuario.email = leia.nextLine();
        System.out.print("Informe o telefone do usuário: ");
        usuario.telefone = leia.nextLine();
        System.out.print("Informe o endereço do usuário: ");
        usuario.endereco = leia.nextLine();

        System.out.print("\nDADOS DA EMPRESA\nInforme a razão social da empresa: ");
        empresa.razaoSocial = leia.nextLine();
        System.out.print("Informe o nome fantasia da empresa: ");
        empresa.nomeFantasia = leia.nextLine();
        System.out.print("Informe o CNPJ da empresa: ");
        empresa.cnpj = leia.nextLine();
        System.out.print("Informe o email da empresa:");
        empresa.email = leia.nextLine();
        System.out.print("Informe o telefone da empresa: ");
        empresa.telefone = leia.nextLine();
        System.out.print("Informe o endereço da empresa: ");
        empresa.endereco = leia.nextLine();

        System.out.println(usuario.cumprimentar());
        System.out.println(empresa.cumprimentar());


        leia.close();
    }
}
