package com.projetoFinal.app.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;

 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idUsuario;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;

    @ManyToMany
    @JoinTable(name = "usuario_alergia", joinColumns = @JoinColumn(name = "id_usuario"), inverseJoinColumns = @JoinColumn(name = "id_alergia"))
    private List<Alergia> alergias = new ArrayList<>();

    public Usuario() {
    }

    public long getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Alergia> getAlergias() {
        return this.alergias;
    }

    public void setAlergias(List<Alergia> alergias) {
        this.alergias = alergias;
    }

}




