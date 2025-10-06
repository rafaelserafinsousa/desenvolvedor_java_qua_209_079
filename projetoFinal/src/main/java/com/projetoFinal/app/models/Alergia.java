package com.projetoFinal.app.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.Objects;

@Entity
public class Alergia implements Serializable {
    private static final long serialVersionUID = 1L;

    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 
    private long idAlergia;
    private String nome;

    @ManyToMany(mappedBy = "alergias")
    private List<Usuario> usuarios = new ArrayList<>();

     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alergia alergia = (Alergia) o;
        return Objects.equals(idAlergia, alergia.idAlergia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAlergia);
    }

    public Alergia() {
    }


    public long getIdAlergia() {
        return this.idAlergia;
    }

    public void setIdAlergia(long idAlergia) {
        this.idAlergia = idAlergia;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Usuario> getUsuarios() {
        return this.usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

}



