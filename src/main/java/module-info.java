module org.example.appreceitas {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.appreceitas to javafx.fxml;
    exports org.example.appreceitas;
}