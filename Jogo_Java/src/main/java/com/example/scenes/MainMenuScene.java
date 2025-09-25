package com.example.scenes;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.net.URL;

public class MainMenuScene {
    public static Scene build(GameSceneManager manager) {
        URL url = MainMenuScene.class.getResource("/images/menu.png");
        if (url == null) throw new IllegalArgumentException("Imagem não encontrada");

        ImageView bgView = new ImageView(new Image(url.toExternalForm()));
        bgView.setFitWidth(1280);
        bgView.setFitHeight(720);
        bgView.setPreserveRatio(false);

        Button btnNovo = new Button("NOVO JOGO");
        Button btnCarregar = new Button("CARREGAR");
        Button btnContinuar = new Button("CONTINUAR");
        Button btnConfig = new Button("CONFIGURAÇÕES");
        Button btnSair = new Button("SAIR");

        String estilo = "-fx-font-size: 20px; -fx-font-weight: bold; -fx-background-color: rgba(0,0,0,0.6); -fx-text-fill: white; -fx-padding: 10 20 10 20; -fx-background-radius: 10;";
        String hover = "-fx-background-color: rgba(255,255,255,0.2); -fx-text-fill: yellow;";

        Button[] botoes = {btnNovo, btnCarregar, btnContinuar, btnConfig, btnSair};
        for (Button b : botoes) {
            b.setStyle(estilo);
            b.setOnMouseEntered(e -> b.setStyle(hover));
            b.setOnMouseExited(e -> b.setStyle(estilo));
        }

        btnNovo.setOnAction(e -> System.out.println("Novo jogo iniciado!"));
        btnCarregar.setOnAction(e -> System.out.println("Carregando salvamento..."));
        btnContinuar.setOnAction(e -> System.out.println("Continuando jogo..."));
        btnConfig.setOnAction(e -> manager.showConfig());
        btnSair.setOnAction(e -> javafx.application.Platform.exit());

        VBox menu = new VBox(20, btnNovo, btnCarregar, btnContinuar, btnConfig, btnSair);
        menu.setAlignment(Pos.CENTER);

        return new Scene(new StackPane(bgView, menu), 1280, 720);
    }

    public Scene getScene() {
    return null;}
}