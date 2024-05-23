package org.example.appreceitas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Usuario;

import java.util.List;


public class RegisterController {
    @FXML
    private Button buttonCreate;

    @FXML
    private TextField senhaCreate;

    @FXML
    private TextField userCreate;
    private List<Usuario> usuarios;
    private Stage stage;
    Alert alert;

   @FXML
    protected void registrar(ActionEvent e){
       String usernameNew = userCreate.getText();
       String senhaNew = senhaCreate.getText();
       if(usernameNew.isEmpty()||(senhaNew.isEmpty())){
           alert = new Alert(Alert.AlertType.ERROR);
           alert.setTitle("Erro ao tentar logar!");
           alert.setContentText("Nenhum dos campos podem estar vazios!");
           alert.showAndWait();
       }else{
           usuarios.add(new Usuario(usernameNew, senhaNew));
           alert = new Alert(Alert.AlertType.CONFIRMATION);
           alert.setTitle("Conta criada com sucesso!");
           alert.setContentText("Agora faça seu login e entre no aplicativo, certo?");
           alert.showAndWait();

           stage.setScene(App.getLoginScene());
           stage.setTitle("Login");
           stage.show();
       }

   }

    public void setUsers(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    public void setStage(Stage stage) {
        this.stage = stage;
    }
}

