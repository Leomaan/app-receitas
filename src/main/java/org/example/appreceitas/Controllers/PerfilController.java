package org.example.appreceitas.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.example.appreceitas.App;
import org.example.appreceitas.model.Receita;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PerfilController {
    @FXML
    private Button voltar;
    @FXML
    private ComboBox<?> oCombo;
    private Stage stage;
    @FXML
    private ComboBox<?> tCombo;
    @FXML
    public Label NovaReceitaNome;
    @FXML
    public Label NovaReceitaIngrediente;
    @FXML
    public Label NovaReceitaPreparo;
    @FXML
    private Label favoritaIngredientes;

    @FXML
    private Label favoritaPreparo;
    @FXML
    private Label favoritaNome;

    @FXML
    private Label ingredienteCriadaLabel;
    @FXML
    private Label preparoLabelFavorita1;

    @FXML
    private Label preparoLabelFavorita2;
    @FXML
    private Label ingredientesLabelFavorita1;

    @FXML
    private Label ingredientesLabelFavorita2;
    @FXML
    private Label favoritaPreparo1;

    @FXML
    private Label favoritaPreparo2;
    @FXML
    private Label favoritaNome1;

    @FXML
    private Label favoritaNome2;
    @FXML
    private Label favoritaIngredientes1;

    @FXML
    private Label favoritaIngredientes2;

    @FXML
    private Label ingredientesLabelFavorita;

    @FXML
    private Label preaparoCriadaLabel;

    @FXML
    private Label preparoLabelFavorita;
    private NovaReceitaController novaReceitaController;
    private AplicativoController aplicativoController;
    private List<Receita> receitasFavoritas = new ArrayList<>();

    public void setNovaReceitaController(NovaReceitaController novaReceitaController) {
        this.novaReceitaController = novaReceitaController;
        novaReceitaController.setPerfilController(this);
    }
    public void setAplicativoController(AplicativoController aplicativoController) {
        this.aplicativoController = aplicativoController;
        aplicativoController.setPerfilController(this);
    }

    @FXML
    protected void voltar(ActionEvent e) throws IOException {
        stage.setScene(App.getAppScene());
        stage.setTitle("Cooking");
        stage.show();
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void atualizarReceita(String nome, String ingredientes, String passos) {
        NovaReceitaNome.setText(nome);
        NovaReceitaIngrediente.setText(ingredientes);
        NovaReceitaPreparo.setText(passos);
        preaparoCriadaLabel.setText("Preparo:");
        ingredienteCriadaLabel.setText("Ingredientes:");
    }

    public void atualizarReceitaFav(String nome, String ingredientes, String passos, int index) { //Mais uma logica, infelizmente.
        switch (index) {
            case 0:
                favoritaNome.setText(nome);
                favoritaIngredientes.setText(ingredientes);
                favoritaPreparo.setText(passos);
                ingredientesLabelFavorita.setText("Ingredientes:");
                preparoLabelFavorita.setText("Preparo:");
                break;
            case 1:
                favoritaNome1.setText(nome);
                favoritaIngredientes1.setText(ingredientes);
                favoritaPreparo1.setText(passos);
                ingredientesLabelFavorita1.setText("Ingredientes:");
                preparoLabelFavorita1.setText("Preparo:");
                break;
            case 2:
                favoritaNome2.setText(nome);
                favoritaIngredientes2.setText(ingredientes);
                favoritaPreparo2.setText(passos);
                ingredientesLabelFavorita2.setText("Ingredientes:");
                preparoLabelFavorita2.setText("Preparo:");
            default:
                break;
        }
    }

    public void addReceitaFavorita(Receita receita) {
        if (receitasFavoritas.size() < 3) {
            receitasFavoritas.add(receita);
            atualizarReceitaFav(receita.getNome(), receita.getIngredientes(), receita.getPassos(), receitasFavoritas.size() - 1);
        }
    }


}