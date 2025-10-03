package com.projetoFinal.app.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Ingredientes implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idIngrediente;
    private String nome;

   @ManyToMany(mappedBy = "ingredientes")
    private List<Pratos> pratos = new ArrayList<>();

    public Ingredientes() {}

    public Long getId() { return idIngrediente; }
    public void setId(Long idIngrediente) { this.idIngrediente = idIngrediente; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public List<Pratos> getPratos() { return pratos; }
    public void setPratos(List<Pratos> pratos) { this.pratos = pratos; }
}

