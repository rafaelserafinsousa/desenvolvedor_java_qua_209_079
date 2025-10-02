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
public class Igredientes implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idIgrediente;
    private String nome;

    @ManyToMany
    private List<Alergia> alergias = new ArrayList<>();


    public Igredientes() {
    }


   public Long getId() { return idIgrediente; }
    public void setId(Long idIgrediente) { this.idIgrediente = idIgrediente; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public List<Alergia> getAlergias() { return alergias; }
    public void setAlergias(List<Alergia> alergias) { this.alergias = alergias; }
}

