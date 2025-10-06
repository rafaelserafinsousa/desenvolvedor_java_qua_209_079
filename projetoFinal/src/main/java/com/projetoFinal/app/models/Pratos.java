package com.projetoFinal.app.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "pratos")

public class Pratos implements Serializable { 
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prato")
    private Long idPrato;

    private String nome;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_restaurante") 
    private Restaurante restaurante;
    
    @ManyToMany(fetch = FetchType.EAGER) 
    @JoinTable(
        name = "prato_ingrediente",
        joinColumns = @JoinColumn(name = "prato_id"),
        inverseJoinColumns = @JoinColumn(name = "ingrediente_id")
    )
    private List<Ingrediente> ingredientes;

    public Long getIdPrato() {
        return idPrato;
    }

    public void setIdPrato(Long idPrato) {
        this.idPrato = idPrato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
}