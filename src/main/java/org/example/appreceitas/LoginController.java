package org.example.appreceitas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Usuario;

import java.io.IOException;
import java.util.List;



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
    private List<Usuario> usuarios;

    @FXML
    protected void switchScene(ActionEvent e) throws IOException {   //Ao apertar o botao de não possuir conta, será redirecionado a tela de registrar.
        stage.setScene(App.getRegisterScene());
        stage.setTitle("Registre-se");
        stage.show();
    }

    @FXML
    protected void login(ActionEvent e) throws IOException {
        String username = userLogin.getText();
        String senha = senhaLogin.getText();
        for (Usuario userLogin : usuarios) {
            if (userLogin.getUsername().equals(username) && userLogin.getPassword().equals(senha)) {
                stage.setScene(App.getAppScene());
                stage.setTitle("Cooking");
                stage.show();
                return;
            }
        }

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Não é póssivel continuar com o login!");
            alert.setContentText("Verifique novamente os campos ou crie uma conta caso não tenha!");
            alert.showAndWait();
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setUsers(List<Usuario> usuarios)
    {
        this.usuarios = usuarios;
    }
}




