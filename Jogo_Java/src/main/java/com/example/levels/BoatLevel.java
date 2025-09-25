package com.example.levels;

import com.example.models.Player;
import com.example.scenes.GameSceneManager;
import javafx.event.ActionEvent;
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

public class BoatLevel extends Level {

    private SimpleBeanInfo ResourceLoader;

    public BoatLevel(GameSceneManager manager, Player player) {
        super(manager, player);
    }

    @Override
    public Scene getScene() {
        StackPane root = new StackPane();
        root.setPrefSize(800, 600);

        // Fundo com imagem ou fallback
        Image bg = ResourceLoader.loadImage("boat.png");
        if (bg != null) {
            root.getChildren().add(new GifViewer(bg, 800, 600));
        } else {
            root.setStyle("-fx-background-color: linear-gradient(#114466, #062233);");
            root.getChildren().add(new Text("Rio - Crie um barco para atravessar"));
        }

        // Texto da história da fase
        Text storyText = new Text(
                "Você chegou à margem de um lago extenso e turbulento.\n" +
                        "Você encontrou um barco com o motor desativado\n" +
                        "a unica forma de ativa-lo é completando o codigo abaixo."
        );
        storyText.setTextAlignment(TextAlignment.CENTER);
        storyText.setStyle("-fx-font-size: 16px; -fx-fill: white;");

        VBox storyBox = new VBox(storyText);
        storyBox.setAlignment(Pos.TOP_CENTER);
        storyBox.setPadding(new Insets(20, 0, 0, 0));

        StackPane.setAlignment(storyBox, Pos.TOP_CENTER);
        root.getChildren().add(storyBox);

        // Botão para criar o barco
        Button run = new Button("Ativar o motor");
        run.setOnAction(this::handle);

        // Botão para voltar ao menu
        Button back = new Button("Voltar ao Menu");
        back.setOnAction(e -> manager.showMainMenu());

        // Alinhamento dos botões
        StackPane.setAlignment(run, Pos.BOTTOM_CENTER);
        StackPane.setAlignment(back, Pos.TOP_LEFT);
        root.getChildren().addAll(run, back);

        this.root = root;
        return new Scene(root, 800, 600);
    }

    private void handle(ActionEvent e) {
        Optional<String> code = JavaCodeExecutor.askForCode(
                "int i = 0;\n" +
                        "while (true) {\n" +
                        "    System.out.println(i);\n" +
                        "    i++;\n" +
                        "    Este loop é infinito, com um comando apenas pare esse loop,\n"
        );
        boolean ok;
        if (JavaCodeExecutor.evaluate(
                code.get(), new String[]{"1".toLowerCase(Locale.ROOT).trim()}
        )) {
            if (code.isPresent()) {
                ok = true;
            } else ok = false;
        } else {
            ok = false;
        }
        if (ok) {
            onLevelSuccess("Motor ativado — travessia concluída.", 15, "compiler");
        } else {
            onLevelFail("O barco afundou. Tente outra solução.");
        }
    }
}
