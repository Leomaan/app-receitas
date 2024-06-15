package org.example.appreceitas;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.appreceitas.Controllers.*;
import org.example.appreceitas.model.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App extends Application {

    private  static Scene login;
    private  static Scene register;
    private static Scene app;
    private static Scene admin;
    private static Scene perfil;
    private static Scene add;
    private List<Usuario> usuarios = new ArrayList<>();
    public static Scene getLoginScene() {

        return login;
    }
    public static Scene getAddScene() {

        return add;
    }
    public static Scene getRegisterScene(){
        return register;
    }
    public static Scene getAdminScene(){
        return admin;
    }
    public static Scene getAppScene(){
        return app;
    }
    public static Scene getPerfilScene(){
        return perfil;
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
        app = new Scene(fxmlPrincipal.load(), 1280, 768);

        AplicativoController aplicativoController = fxmlPrincipal.getController();
        aplicativoController.setStage(stage);

        FXMLLoader fxmlPerfil = new FXMLLoader(App.class.getResource("perfil.fxml"));
        perfil = new Scene(fxmlPerfil.load(), 1280, 768);
        PerfilController perfilController = fxmlPerfil.getController();
        perfilController.setStage(stage);


        FXMLLoader loader = new FXMLLoader(App.class.getResource("NovaReceita.fxml"));
        add = new Scene(loader.load(), 438, 396);
        NovaReceitaController novaReceitaController = loader.getController();
        novaReceitaController.setStage(stage);
        novaReceitaController.setPerfilController(perfilController);

        aplicativoController.setNovaReceitaController(novaReceitaController);
        novaReceitaController.setAplicativoController(aplicativoController);

        aplicativoController.setPerfilController(perfilController);
        perfilController.setAplicativoController(aplicativoController);


        stage.setTitle("Login");
        stage.setScene(login);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}