package org.example.appreceitas.Controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class AplicativoController implements Initializable {
    @FXML
    private ComboBox<String> oCombo;
    @FXML
    private ComboBox<String> tCombo;
    private String[] ocasiao = {"cafe", "Almoço", "Jantar"};
    private String[] tipo = {"Carne", "Pizza", "Bolo,"};
    private Stage stage;
    @FXML
    private Button go;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tCombo.getItems().addAll(tipo);
        oCombo.getItems().addAll(ocasiao);
    }
    @FXML
    public void goToreceitas(ActionEvent e){
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
