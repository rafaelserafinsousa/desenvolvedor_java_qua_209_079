package com.quatropilares.app;

import java.util.Scanner;
import com.quatropilares.model.PessoaFisica;
import com.quatropilares.model.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica(null, null, null, null, null, null);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null, null, null);

        System.out.println("----informe os dados do usuário----\n");
        System.out.print("Informe o nome: ");
        usuario.setNome(sc.nextLine());
        System.out.print("Informe o cpf: ");
        usuario.setCpf(sc.nextLine());
        System.out.print("Informe a data de nascimento: ");
        usuario.setDataNascimento(sc.nextLine());
        System.out.print("Informe o e-mail: ");
        usuario.setEmail(sc.nextLine());
        System.out.print("Informe o telefone: ");
        usuario.setTelefone(sc.nextLine());
        System.out.print("Informe o endereço: ");
        usuario.setEndereco(sc.nextLine());

        System.out.println("----informe os dados da empresa----\n");
        System.out.print("Informe a Razão Social: ");
        empresa.setRazaoSocial(sc.nextLine());
        System.out.print("Informe o nome da empresa: ");
        empresa.setNomeFantasia(sc.nextLine());
        System.out.print("Informe o CNPJ: ");
        empresa.setCnpj(sc.nextLine());
        System.out.print("Informe o email da empresa: ");
        empresa.setEmail(sc.nextLine());
        System.out.print("Informe o telefone da empresa: ");
        empresa.setTelefone(sc.nextLine());
        System.out.print("Informe o endereço da empresa: ");
        empresa.setEndereco(sc.nextLine());

        //OUTPUT DO USUARIO     
        System.out.println("---Informações do usuario---\n");
        System.out.println("nome: "+usuario.getNome());
        System.out.println("CPF: "+usuario.getCpf());
        System.out.println("Data de Nascimento: "+usuario.getDataNascimento());
        System.out.println("E-mail: "+usuario.getEmail());
        System.out.println("Telefone: "+usuario.getTelefone());
        System.out.println("Endereço: "+usuario.getEndereco());


        System.out.println("---Informações da empresa---\n");
        System.out.println("Razão social: "+empresa.getRazaoSocial());
        System.out.println("nome  da empresa: "+empresa.getNomeFantasia());
        System.out.println("CNPJ : "+empresa.getCnpj());
        System.out.println("E-mail da empresa: "+empresa.getEmail());
        System.out.println("Telefone da empresa: "+empresa.getTelefone());
        System.out.println("Endereço da empresa: "+empresa.getEndereco());
      
        sc.close();
    }
}