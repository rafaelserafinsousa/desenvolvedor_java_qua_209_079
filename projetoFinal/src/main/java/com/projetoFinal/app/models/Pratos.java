package com.projetoFinal.app.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Pratos implements Serializable {
    private static final long serialVersionUID = 1L;



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_Pratos;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "restaurante_id")
    private Restaurante restaurante;

    @ManyToMany
    @JoinTable(name = "prato_ingrediente", joinColumns = @JoinColumn(name = "prato_id"), inverseJoinColumns = @JoinColumn(name = "ingrediente_id"))
    private List<Ingredientes> ingredientes = new ArrayList<>();

    public long getId_Pratos() {
        return this.id_Pratos;
    }

    public void setId_Pratos(long id_Pratos) {
        this.id_Pratos = id_Pratos;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Ingredientes> getIngredientes() {
        return this.ingredientes;
    }

    public void setIngredientes(List<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }

}



