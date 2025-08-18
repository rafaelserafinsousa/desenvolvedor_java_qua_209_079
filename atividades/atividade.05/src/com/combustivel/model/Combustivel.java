package com.combustivel.model;

public class Combustivel {
    private double valorG;
    private double valorE;


    public Combustivel(double valorG, double valorE) {
        this.valorG = valorG;
        this.valorE = valorE;
    }


    public double getValorG() {
        return this.valorG;
    }

    public void setValorG(double valorG) {
        this.valorG = valorG;
    }

    public double getValorE() {
        return this.valorE;
    }

    public void setValorE(double valorE) {
        this.valorE = valorE;
    }

}