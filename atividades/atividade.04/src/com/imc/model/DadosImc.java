package com.imc.model;
public class DadosImc {
    private double peso;
    private double altura;


    public DadosImc(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }


    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double imc() {
        return this.peso /(this.altura*this.altura);
    }

    public String diagnotistico(double imc){
        return (imc < 18.5 ) ? " esta abaixo do peso.\n"
            : (imc < 24.9) ? "esta com peso normal\n"
            : (imc < 29.9) ? "esta com sobrepeso\n"
            : (imc < 34.9) ? "esta com obesidade grau 1\n"
            : (imc < 39.9) ? "esta com obesidade grau 2\n"
        : "você esta com obesidade mórbida";

}
}