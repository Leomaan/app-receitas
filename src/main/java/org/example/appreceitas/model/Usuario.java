package org.example.appreceitas.model;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String usuario;
    private String senha;

    public Usuario(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }
    public String getUsername() {

        return usuario;
    }

    public String getPassword() {
        return senha;
    }
}
