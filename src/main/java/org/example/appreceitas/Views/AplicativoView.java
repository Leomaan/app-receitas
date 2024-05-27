package org.example.appreceitas.Views;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class AplicativoView {
    public class Main extends Application {
        public static void main(String[] args) {
            launch(args);
        }
        @Override
        public void start(Stage stage) throws Exception {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/appreceitas/Views/aplicativo.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Cooking");
            stage.show();
        }
    }
}