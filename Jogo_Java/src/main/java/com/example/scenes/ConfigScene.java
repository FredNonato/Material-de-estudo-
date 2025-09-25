package com.example.scenes;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;

public class ConfigScene {
    public static Scene build(GameSceneManager manager) {
        Label lblVolume = new Label("Volume do Som");
        Slider slider = new Slider(0, 100, 50);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);

        Label lblRes = new Label("Resolução do Vídeo");
        ChoiceBox<String> cbRes = new ChoiceBox<>();
        cbRes.getItems().addAll("1280x720", "1600x900", "1920x1080", "2560x1440");
        cbRes.setValue("1280x720");
        cbRes.getSelectionModel().selectedItemProperty().addListener((obs, oldV, newV) -> {
            if (newV != null) {
                String[] p = newV.split("x");
                manager.stage.setWidth(Integer.parseInt(p[0]));
                manager.stage.setHeight(Integer.parseInt(p[1]));
            }
        });

        Button btnVoltar = new Button("VOLTAR");
        String estilo = "-fx-font-size: 20px; -fx-font-weight: bold; -fx-background-color: rgba(0,0,0,0.6); -fx-text-fill: white; -fx-padding: 10 20 10 20; -fx-background-radius: 10;";
        String hover = "-fx-background-color: rgba(255,255,255,0.2); -fx-text-fill: yellow;";
        btnVoltar.setStyle(estilo);
        btnVoltar.setOnMouseEntered(e -> btnVoltar.setStyle(hover));
        btnVoltar.setOnMouseExited(e -> btnVoltar.setStyle(estilo));
        btnVoltar.setOnAction(e -> manager.showMainMenu());

        VBox box = new VBox(20, lblVolume, slider, lblRes, cbRes, btnVoltar);
        box.setAlignment(Pos.CENTER);
        box.setPadding(new Insets(20));

        return new Scene(box, 1280, 720);
    }


    public Scene getScene() {
        return null;
    }
}

