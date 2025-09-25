module com.example.jogo_java {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.jogo_java to javafx.fxml;
    exports com.example.jogo_java;
    exports com.example.scenes;
    opens com.example.scenes to javafx.fxml;
}