package com.example.levels;

import com.example.models.Player;
import com.example.scenes.GameSceneManager;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

import java.awt.*;
import java.beans.SimpleBeanInfo;

public class VillageLevel extends Level {
    private SimpleBeanInfo ResourceLoader;

    public VillageLevel(GameSceneManager manager, Player Player) {
        super(manager, Player);
    }

    @Override
    public Scene getScene() {
        StackPane root = new StackPane();
        root.setPrefSize(800, 600);

        Image bg = ResourceLoader.loadImage("village.png");
        if (bg != null) {
            root.getChildren().add(new GifViewer(bg, 800, 600));
        } else {
            // fallback
            root.setStyle("-fx-background-color: linear-gradient(#333366, #111122);");
            Text t = new Text("Vilarejo - porta trancada\n(Imagem 'village.png' não encontrada em /resources)");
            root.getChildren().add(t);
        }

        Button run = new Button("Executar código para abrir o portão");
        run.setOnAction(e -> {
            java.util.Optional<String> code = JavaCodeExecutor.askForCode("Qual é a saída do seguinte código Java?"+"\nint x = 5; \nint y = 2; " + "\nSystem.out.println(x * y);");
            boolean ok = !(!code.isPresent() || !JavaCodeExecutor.evaluate(code.get(), new String[]{"1"}));
            if (ok) {
                onLevelSuccess("Portão aberto! Você escapou do vilarejo.", 10, "bridge");
            } else {
                onLevelFail("O código não funcionou. Tente pensar em uma palavra-chave que peça para abrir.");
            }
        });

        Button toMenu = new Button("Voltar ao Menu");
        toMenu.setOnAction(e -> manager.showMainMenu());

        StackPane.setAlignment(run, javafx.geometry.Pos.BOTTOM_CENTER);
        StackPane.setAlignment(toMenu, javafx.geometry.Pos.TOP_LEFT);
        root.getChildren().addAll(run, toMenu);

        this.root = root;
        return new Scene(root, 800, 600);
    }
}
