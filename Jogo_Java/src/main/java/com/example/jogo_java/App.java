package com.example.jogo_java;

import javafx.application.Application;
import javafx.stage.Stage;
import com.example.scenes.GameSceneManager;

public class App extends Application {
    @Override
    public void start(Stage BoatLevel) {
        GameSceneManager manager = new GameSceneManager(BoatLevel);
        manager.showMainMenu();
        BoatLevel.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}