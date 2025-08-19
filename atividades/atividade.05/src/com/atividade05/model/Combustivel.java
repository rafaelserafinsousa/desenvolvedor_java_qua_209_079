package com.atividade05.model;

public class Combustivel {
    private double Gasolina;
    private double Etanol;


    public Combustivel(double Gasolina, double Etanol) {
        this.Gasolina = Gasolina;
        this.Etanol = Etanol;
    }

    public double getGasolina() {
        return this.Gasolina;
    }

    public void setGasolina(double Gasolina) {
        this.Gasolina = Gasolina;
    }

    public double getEtanol() {
        return this.Etanol;
    }

    public void setEtanol(double Etanol) {
        this.Etanol = Etanol;
    }

    public String calculo(){
        return (this.Etanol >= this.Gasolina*(0.7) ) ? "Gasolina"
        :"Etanol";
    }
}