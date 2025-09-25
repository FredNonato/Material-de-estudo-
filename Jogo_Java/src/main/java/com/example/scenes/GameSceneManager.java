package com.example.scenes;

import com.example.levels.BoatLevel;
import com.example.levels.BridgeLevel;
import com.example.levels.CompilerLevel;
import com.example.levels.VillageLevel;
import com.example.models.Player;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.HashMap;
import java.util.Map;

public class GameSceneManager {
    public Stage stage;
    private Map<String, Scene> scenes = new HashMap<>();
    private Player player;

    public GameSceneManager(Stage stage) {
        this.stage = stage;
        this.player = new Player("IntelliJoe");
    }

    public void init() {
        // Criação das cenas
        MainMenuScene menu = new MainMenuScene();
        scenes.put("menu", menu.getScene());

        ConfigScene config = new ConfigScene();
        scenes.put("config", config.getScene());

        VillageLevel village = new VillageLevel(this, player);
        scenes.put("village", village.getScene());

        BridgeLevel bridge = new BridgeLevel(this, player);
        scenes.put("bridge", bridge.getScene());

        BoatLevel boat = new BoatLevel(this, player);
        scenes.put("boat", boat.getScene());

        CompilerLevel compiler = new CompilerLevel(this, player);
        scenes.put("compiler", compiler.getScene());
    }

    public void show(String key) {
        Scene s = scenes.get(key);
        if (s != null) {
            stage.setScene(s);
            stage.setTitle("IntelliJoe - " + key);
            stage.show();
        } else {
            System.err.println("Scene not found: " + key);
        }
    }

    public void showMainMenu() { show("menu"); }
    public void showConfig() { show("config"); }
    public void showVillage() { show("village"); }
    public void showBridge() { show("bridge"); }
    public void showBoat() { show("boat"); }
    public void showEndgame() { show("endgame"); }
    public void showCompiler() { show("compiler"); }

    public Player getPlayer() { return player; }
}

