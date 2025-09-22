package com.atividade09.model;

public class Veiculo{
    private float velocidade;
    private float distancia;
    private float tempo;
    private String modelo;


    public Veiculo(float velocidade, float distancia, float tempo, String modelo) {
        this.velocidade = velocidade;
        this.distancia = distancia;
        this.tempo = tempo;
        this.modelo = modelo;
    }


    public float getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public float getDistancia() {
        return this.distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public float getTempo() {
        return this.tempo;
    }

    public void setTempo(float tempo) {
        this.tempo = tempo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}

