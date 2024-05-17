package org.example.appreceitas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {


    private  static Scene login;
    private  static Scene register;
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Login");

        FXMLLoader fxmlLogin = new FXMLLoader(App.class.getResource("login.fxml"));
        login = new Scene(fxmlLogin.load(), 760, 602);

        FXMLLoader fxmlRegister = new FXMLLoader(App.class.getResource("register.fxml"));
        register = new Scene(fxmlRegister.load(), 760, 602);

        LoginController loginController = fxmlLogin.getController();
        loginController.setStage(stage);


        stage.setScene(login);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}