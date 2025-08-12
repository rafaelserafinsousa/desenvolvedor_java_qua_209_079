package com.henranca.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();
        Scanner leia = new Scanner(System.in);

        System.out.println("informe o nome do usuário");
        usuario.nome = leia.nextLine();
        System.out.println("informe o cpf do usuário");
        usuario.cpf = leia.nextLine();
        System.out.println("informe o email do usuário");
        usuario.email = leia.nextLine();
        System.out.println("informe o telefone do usuário");
        usuario.telefone = leia.nextLine();
        System.out.println("informe o endereco do usuário");
        usuario.endereco = leia.nextLine();

   
        
        System.out.println("informe a razão social da empresa");
        empresa.razaoSocial = leia.nextLine();
        System.out.println("informe o nome fantasia da empresa");
        empresa.nomeFantasia = leia.nextLine();
        System.out.println("informe o nome cnpj da empresa");
        empresa.cnpj = leia.nextLine();
        System.out.println("informe o email da empresa");
        empresa.email = leia.nextLine();
        System.out.println("informe o telefone da empresa");
        empresa.telefone = leia.nextLine();
        System.out.println("informe o endereco da empresa");
        empresa.endereco = leia.nextLine();

        //output
        System.out.println("nome do usuário" + usuario.nome);
        System.out.println("cpf do usuário" + usuario.cpf);
        System.out.println("email do usuário" + usuario.email);
        System.out.println("telefone do usuário" + usuario.telefone);
        System.out.println("endereco do usuário" + usuario.endereco);
        System.out.println("social da empresa" + empresa.razaoSocial);
        System.out.println("fantasia da empresa" + empresa.nomeFantasia);
        System.out.println("cnpj da empresa" + empresa.cnpj);
        System.out.println("email da empresa" + empresa.email);
        System.out.println("telefone da empresa" + empresa.telefone);
        System.out.println("Endereço da empresa" + empresa.endereco);

        leia.close();
    }
}
