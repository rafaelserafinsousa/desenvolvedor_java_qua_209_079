package com.atividade06.model;

public class Veiculo{
    private String marca;
    private String modelo;
    private String ano;
    private String placa;
    private Pessoa dono;



    public Veiculo(String marca, String modelo, String ano, String placa, Pessoa dono) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.dono = dono;
    }


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Pessoa getDono() {
        return this.dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }


    public String exibirDados() {
        return "Agência: " + this.marca 
    +"\nNúmero da conta: " + this.modelo 
    +"\nAno: " + this.ano
    +"\nPlaca do carro: " + this.placa;
    }
    
}

