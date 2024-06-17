package org.example.appreceitas.model;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.lang.reflect.AccessFlag;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReceitasDao {
    private List<Receita> receitas = new ArrayList<>();
    private List<Receita> receitasFavoritas = new ArrayList<>();
    public void addReceita(Receita receita) {
        receitas.add(receita);
    }

    public List<Receita> getReceitas() {
        return receitas;
    }
    public List<Receita> filterByCategoria(String categoria) {
        return receitas.stream().filter(receita -> receita.getCategoria().equals(categoria)).collect(Collectors.toList());
    }

    public void addFavoritaReceita(Receita receita) {
        if (receitasFavoritas.size() < 3 && !receitasFavoritas.contains(receita)) {
            receitasFavoritas.add(receita);
        }
    }

    public List<Receita> getReceitasFavoritas() {
        return receitasFavoritas;
    }
}

