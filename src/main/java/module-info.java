module org.example.appreceitas {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.appreceitas to javafx.fxml;
    exports org.example.appreceitas;
    exports org.example.appreceitas.Controllers;
    opens org.example.appreceitas.Controllers to javafx.fxml;
}