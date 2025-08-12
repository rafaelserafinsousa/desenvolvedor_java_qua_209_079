package com.atividade.app;

public class Conta {
    //atributos
    public String titular, cpf, agencia, nConta;
    public double saldo;

    public Conta() {
    }

    public Conta(String titular, String cpf, String agencia, String conta, double saldo) {
        this.titular = titular;
        this.cpf = cpf;
        this.agencia = agencia = "1010-1";
        this.nConta = conta = "1010-1";
        this.saldo = saldo;
    }

    public void exibirDados() {
        System.out.println("titular: " + this.titular);
        System.out.println("cpf: " + this.cpf);
        System.out.println("agencia: " + this.agencia);
        System.out.println("Número da conta: " + this.nConta);
        System.out.println("saldo da conta: R$ " + String.format("%.2f", this.saldo)+".");
    
    }
        public double fazerDeposito(double valor) {
            this.saldo += valor;
            return this.saldo;
        }

        public double fazerSaque(double valor) {
            this.saldo -= valor;
            return this.saldo;
        } 
}