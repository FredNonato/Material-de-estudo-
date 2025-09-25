package com.example.levels;

import com.example.models.Player;
import com.example.scenes.GameSceneManager;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

import java.awt.*;
import java.beans.SimpleBeanInfo;
import java.util.Locale;

public class CompilerLevel extends Level {
    private SimpleBeanInfo ResourceLoader;

    public CompilerLevel(GameSceneManager manager, Player player) {
        super(manager, player);

    }

    @Override
    public Scene getScene() {
        StackPane root = new StackPane();
        root.setPrefSize(800, 600);

        // Carrega a imagem de fundo (compiler.png)
        Image bg = ResourceLoader.loadImage("compiler.png");
        if (bg != null) {
            root.getChildren().add(new GifViewer(bg, 800, 600));
        } else {
            root.setStyle("-fx-background-color: linear-gradient(#222222, #000000);");
        }

        // Texto principal da fase
        Text t = new Text("Cidade - Entregue o código ao Mestre Compilador Leonardo");
        t.setStyle("-fx-fill: white; -fx-font-size: 18px;");
        t.setWrappingWidth(700);
        t.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        VBox textBox = new VBox(t);
        textBox.setAlignment(Pos.TOP_CENTER);
        textBox.setPadding(new Insets(20, 0, 0, 0));
        StackPane.setAlignment(textBox, Pos.TOP_CENTER);
        root.getChildren().add(textBox);

        // Botão para entregar código, com enigma para resolver antes
        Button deliver = new Button("Entregar código final");
        deliver.setOnAction(e -> {
            java.util.Optional<String> code = JavaCodeExecutor.askForCode(
                    "class Animal {\n" +
                            "    public void fazerSom() {\n" +
                            "        System.out.println(\"O animal faz um som.\");\n" +
                            "    }\n" +
                            "}\n" +
                            "\n" +
                            "class Cachorro extends Animal {\n" +
                            "    @Override\n" +
                            "    public void fazerSom() {\n" +
                            "        System.out.println(\"O cachorro late!\");\n" +
                            "    }\n" +
                            "}\n" +
                            "\n" +
                            "class Gato extends Animal {\n" +
                            "    @Override\n" +
                            "    public void fazerSom() {\n" +
                            "        System.out.println(\"O gato mia!\");\n" +
                            "    }\n" +
                            "}\n" +
                            "\n" +
                            "public class TestePolimorfismo {\n" +
                            "    public static void main(String[] args) {\n" +
                            "        Animal a1 = ----- x -----;\n" +
                            "        Animal a2 = new Gato();\n" +
                            "        \n" +
                            "        a1.fazerSom();\n" +
                            "        a2.fazerSom();\n" +
                            "    }\n" +
                            "}\n" + "preencha as lacunas do código acima\n"
            );
            boolean ok = code.isPresent() && JavaCodeExecutor.evaluate(code.get(), new String[] {"1".toLowerCase(Locale.ROOT).trim()});
            if (ok) {
                // Quando o código estiver correto, mostrar a tela de fim de jogo
                onLevelSuccess("Código entregue! Mestre Leonardo compilou e salvou o mundo.", 50, "endgame");
            } else {
                onLevelFail("O código não foi compilado corretamente. Tente novamente.");
            }
        });

        // Botão para voltar ao menu
        Button back = new Button("Voltar ao Menu");
        back.setOnAction(e -> manager.showMainMenu());

        StackPane.setAlignment(deliver, Pos.CENTER);
        StackPane.setAlignment(back, Pos.TOP_LEFT);

        root.getChildren().addAll(deliver, back);
        this.root = root;
        return new Scene(root, 800, 600);
    }

    // Método para mostrar a tela de fim de jogo
    public void onLevelSuccess(String message, int points, String nextLevel) {
        // Se a fase for "endgame", vamos mudar para a tela de fim de jogo
        if (nextLevel.equals("endgame")) {
            // Mostra a tela de fim de jogo chamando o método show() no GameSceneManager
            manager.show("endgame");
        } else {
            super.onLevelSuccess(message, points, nextLevel);
        }
    }
}




