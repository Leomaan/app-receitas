package org.example.appreceitas.model;

import javafx.scene.image.Image;

import java.io.Serializable;

public class Receita implements Serializable {
        private String nome;
        private String ingredientes;
        private String passos;
        private boolean favorito;
        private String categoria;
    public boolean isFavorito() {
        return favorito;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
    public String getPassos() {
        return passos;
    }
    public void setPassos(String passos) {
        this.passos = passos;
    }
    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public String getCategoria(){
        return categoria;
    }
    }

