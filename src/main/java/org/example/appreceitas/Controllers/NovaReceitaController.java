package org.example.appreceitas.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.appreceitas.App;
import org.example.appreceitas.model.Receita;
import org.example.appreceitas.model.ReceitasDao;
import org.example.appreceitas.model.UsuarioDao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NovaReceitaController {
    private Stage stage;
    @FXML
    private Button voltarButton;
    private Receita receita;
    @FXML
    private Button criarButton;
    @FXML
    private TextField nomeReceita;
    private String NovaReceitaNome;
    private String NovaReceitaIngrediente;
    private String NovaReceitaPassos;

    @FXML
    private TextArea ingredientesReceita;
    @FXML
    private TextArea passosReceita;
    private AplicativoController aplicativoController;
    private PerfilController perfilController;
    public void setAplicativoController(AplicativoController aplicativoController) {
        this.aplicativoController = aplicativoController;
    }
    public void setPerfilController(PerfilController perfilController) {
        this.perfilController = perfilController;
    }
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    private ReceitasDao receitasDao;

    @FXML
    protected void retornar(ActionEvent e){
        stage.setScene(App.getAppScene());
        stage.setTitle("Cooking");
        stage.show();
    }
    @FXML
    protected void criarReceita(ActionEvent e) throws IOException {
        NovaReceitaNome = nomeReceita.getText();
        NovaReceitaIngrediente = ingredientesReceita.getText();
        NovaReceitaPassos = passosReceita.getText();
        aplicativoController.novaReceitaAtt(NovaReceitaNome, NovaReceitaIngrediente, NovaReceitaPassos);
        perfilController.atualizarReceita(NovaReceitaNome, NovaReceitaIngrediente, NovaReceitaPassos);
        stage.setScene(App.getAppScene());
        stage.setTitle("Cooking");
        stage.show();
    }
}
