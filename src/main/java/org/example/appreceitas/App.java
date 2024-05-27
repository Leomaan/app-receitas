package org.example.appreceitas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.appreceitas.Controllers.AplicativoController;
import org.example.appreceitas.Controllers.LoginController;
import org.example.appreceitas.Controllers.RegisterController;
import org.example.appreceitas.model.Usuario;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App extends Application {

    private  static Scene login;
    private  static Scene register;
    private static Scene app;
    private List<Usuario> usuarios = new ArrayList<>();

    public static Scene getLoginScene() {

        return login;
    }
    public static Scene getRegisterScene(){
        return register;
    }
    public static Scene getAppScene(){
        return app;
    }

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLogin = new FXMLLoader(App.class.getResource("login.fxml"));
        login = new Scene(fxmlLogin.load(), 760, 602);

        LoginController loginController = fxmlLogin.getController();
        loginController.setStage(stage);
        loginController.setUsers(usuarios);

        FXMLLoader fxmlRegister = new FXMLLoader(App.class.getResource("register.fxml"));
        register = new Scene(fxmlRegister.load(), 760, 602);

        RegisterController registerController = fxmlRegister.getController();
        registerController.setStage(stage);
        registerController.setUsers(usuarios);

        FXMLLoader fxmlPrincipal = new FXMLLoader(App.class.getResource("aplicativo.fxml"));
        app = new Scene(fxmlPrincipal.load(), 760, 602);

        AplicativoController aplicativoController = fxmlPrincipal.getController();
        aplicativoController.setStage(stage);

        stage.setTitle("Login");
        stage.setScene(login);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}