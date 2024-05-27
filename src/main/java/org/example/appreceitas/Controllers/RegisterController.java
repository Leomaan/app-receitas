package org.example.appreceitas.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.appreceitas.model.Util.Alerts;
import org.example.appreceitas.model.Usuario;
import org.example.appreceitas.model.UsuarioDao;
import java.io.IOException;
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
    private UsuarioDao usuarioDao;

   @FXML
    protected void registrar(ActionEvent e) throws IOException {
       String usernameNew = userCreate.getText();
       String senhaNew = senhaCreate.getText();
       if(usernameNew.isEmpty()||(senhaNew.isEmpty())){
           Alerts.alert("Erro ao tentar registrar","","Nenhum dos campos podem estar vazios!", Alert.AlertType.ERROR);
       }else{
           boolean sucesso = UsuarioDao.registrarUsuario(usernameNew,senhaNew);
           if(sucesso){
               Alerts.alert("Conta criada com sucesso!","","Faça seu login agora para entrar no aplicativo!", Alert.AlertType.CONFIRMATION);
               FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/appreceitas/Views/login.fxml"));
               Parent root = loader.load();
               Scene scene = new Scene(root);
               stage.setScene(scene);
               stage.setTitle("Entre");
               stage.show();
           }else{
               Alerts.alert("Erro ao tentar registrar", "", "usuário já existe!", Alert.AlertType.ERROR);
           }
       }
   }

    public void setUsersDao(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }
    public void setStage(Stage stage) {
        this.stage = stage;
    }
}

