package com.projetoFinal.app.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Restaurante implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id_Restaurante;
    private String nome;
    private String endereco;

    @OneToMany(mappedBy = "restaurante", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pratos> pratos = new ArrayList<>();

    public Restaurante() {
    }

    public Restaurante(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;

    }

    public long getId_Restaurante() {
        return this.Id_Restaurante;
    }

    public void setId_Restaurante(long Id_Restaurante) {
        this.Id_Restaurante = Id_Restaurante;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Pratos> getPratos() {
        return pratos;
    }

    public void setPratos(List<Pratos> pratos) {
        this.pratos = pratos;
    }
}
