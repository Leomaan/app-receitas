package org.example.appreceitas.model;

import java.util.ArrayList;
import java.util.List;
public class UsuarioDao {
    private static List<Usuario> usuarios = new ArrayList<>();

    public static boolean verificarCredenciais(String username, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username) && usuario.getPassword().equals(senha)) {
                return true;
            }
        }
        return false;
    }

    public static boolean registrarUsuario(String username, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username)) {
                return false; // Usuário já existe
            }
        }
        usuarios.add(new Usuario(username, senha));
        return true; // Usuário registrado com sucesso
    }

}