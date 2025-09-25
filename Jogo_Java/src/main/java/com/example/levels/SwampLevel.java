package com.example.levels;

import com.example.models.Player;
import com.example.scenes.GameSceneManager;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

import java.awt.*;
import java.beans.SimpleBeanInfo;
import java.util.Optional;

public class SwampLevel extends Level {
    private static SimpleBeanInfo ResourceLoader;

    public SwampLevel(GameSceneManager manager, Player player) { super(manager, player); }

    @Override
    public Scene getScene() {
        StackPane root = new StackPane();
        root.setPrefSize(800,600);
        SimpleBeanInfo ResourceLoader = null;

        Image bg = SwampLevel.ResourceLoader.loadImage("swamp.png");
        if (bg != null) {
            root.getChildren().add(new GifViewer(bg, 800, 600));
        } else {
            root.setStyle("-fx-background-color: linear-gradient(#224422, #112211);");
            root.getChildren().add(new Text("Pântano - Abra caminho pela floresta densa"));
        }

        Button run = new Button("Abrir caminho (escreva algoritmo)");
        run.setOnAction(e -> {
            Optional<String> code = JavaCodeExecutor.askForCode("Explique um algoritmo para abrir caminho (ex: bfs, dfs, cut path)");
            boolean ok = code.isPresent() && JavaCodeExecutor.evaluate(code.get(), new String[] {"bfs","dfs","path","cortar","abrir"});
            if (ok) onLevelSuccess("Caminho aberto!", 20, "compiler");
            else onLevelFail("O pântano te atrasou. Tente um algoritmo de busca.");
        });

        Button back = new Button("Voltar ao Menu");
        back.setOnAction(e -> manager.showMainMenu());

        StackPane.setAlignment(run, Pos.BOTTOM_CENTER);
        StackPane.setAlignment(back, Pos.TOP_LEFT);
        root.getChildren().addAll(run, back);

        this.root = root;
        return new Scene(root, 800, 600);
    }

    private class ResourceLoader {
    }
}
