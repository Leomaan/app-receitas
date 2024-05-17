package org.example.appreceitas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private Button buttonJoin;
    @FXML
    private Button nTemConta;

    @FXML
    private TextField senhaLogin;

    @FXML
    private TextField userLogin;

    private static Stage stage;


    public void switchScene(ActionEvent e) throws IOException {
        stage.setTitle("Registre-se");

        FXMLLoader fxmlTroca = new FXMLLoader(App.class.getResource("register.fxml"));
        Scene naoTeveConta = new Scene(fxmlTroca.load(), 760, 602);

        stage.setScene(naoTeveConta);
        stage.show();
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}




