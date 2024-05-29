package org.example.appreceitas.model.Util;

import javafx.scene.control.Alert;

public class Alerts {
    public static void alert(String title, String header, String content, Alert.AlertType type){
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
