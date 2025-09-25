package com.example.levels;

import com.example.models.Player;
import com.example.scenes.GameSceneManager;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

import java.awt.*;
import java.beans.SimpleBeanInfo;
import java.util.Locale;
import java.util.Optional;

public class BridgeLevel extends Level {
    private SimpleBeanInfo ResourceLoader;

    public BridgeLevel(GameSceneManager manager, Player player) {
        super(manager, player);
    }

    @Override
    public Scene getScene() {
        StackPane root = new StackPane();
        root.setPrefSize(800, 600);

        // Imagem de fundo
        Image bg = ResourceLoader.loadImage("C:\\Users\\Fred\\Documents\\estudos-diarios\\Jogo_Java\\src\\main\\resources\\images\\bridge.png");
        if (bg != null) {
            root.getChildren().add(new GifViewer(bg, 800, 600));
        } else {
            root.setStyle("-fx-background-color: linear-gradient(#664422, #332211);");
            root.getChildren().add(new Text("Ponte - Construa uma ponte\n(Imagem 'bridge.png' não encontrada)"));
        }

        // Texto da história da fase
        Text storyText = new Text(
                "Você chegou a uma ponte quebrada.\n" +
                        "Para atravessar, será preciso reconstruir\n" +
                        "uma ponte lógica usando programação Java."
        );
        storyText.setTextAlignment(TextAlignment.CENTER);
        storyText.setStyle("-fx-font-size: 16px; -fx-fill: white;");

        VBox storyBox = new VBox(storyText);
        storyBox.setAlignment(Pos.TOP_CENTER);
        storyBox.setPadding(new Insets(20, 0, 0, 0));

        StackPane.setAlignment(storyBox, Pos.TOP_CENTER);
        root.getChildren().add(storyBox);

        // Botão para executar o código
        Button run = new Button("Gerar ponte (escreva como faria)");
        run.setOnAction(e -> {
            Optional<String> code = JavaCodeExecutor.askForCode(
                    "Escreva uma condição que execute algo apenas se x for maior que 10."
            );
            boolean ok = code.isPresent() && JavaCodeExecutor.evaluate(
                    code.get(), new String[] {"1".toLowerCase(Locale.ROOT).trim().replace(" ","")}
            );
            if (ok) onLevelSuccess("Ponte criada com sucesso.", 15, "boat");
            else onLevelFail("A ponte desmoronou... tente outra abordagem.");
        });

        // Botão para voltar ao menu
        Button back = new Button("Voltar ao Menu");
        back.setOnAction(e -> manager.showMainMenu());

        StackPane.setAlignment(run, Pos.BOTTOM_CENTER);
        StackPane.setAlignment(back, Pos.TOP_LEFT);
        root.getChildren().addAll(run, back);

        this.root = root;
        return new Scene(root, 800, 600);
    }
}
