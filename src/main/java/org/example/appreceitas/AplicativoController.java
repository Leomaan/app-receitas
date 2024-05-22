package org.example.appreceitas;


import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class AplicativoController implements Initializable {

    @FXML
    private ComboBox<String> oCombo;
    @FXML
    private ComboBox<String> tCombo;
    private String[] ocasiao = {"cafe", "Almoço", "Jantar"};
    private String[] tipo = {"Carne", "Pizza", "Bolo,"};
    private Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tCombo.getItems().addAll(tipo);
        oCombo.getItems().addAll(ocasiao);
    }
    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
