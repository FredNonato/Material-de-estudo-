package com.example.levels;
import com.example.models.Player;

import com.example.models.PuzzleResult;
import com.example.scenes.GameSceneManager;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

// Base class for levels. Each level produces a Scene ready to be shown.
public abstract class Level {
    protected GameSceneManager manager;
    protected Player player;
    protected Pane root;

    public Level(GameSceneManager manager, Player player) {
        this.manager = manager;
        this.player = player;
        this.root = new Pane();
    }

    // Build and return the Scene for this level.
    public abstract Scene getScene();

    // Utility: call when puzzle solved to reward player and proceed.
    protected void onLevelSuccess(String msg, int knowledgeReward, String nextSceneKey) {
        player.addKnowledge(knowledgeReward);
        PuzzleResult result = new PuzzleResult(true, msg + "\nKnowledge +" + knowledgeReward);

    }

    protected void onLevelFail(String msg) {
        PuzzleResult result = new PuzzleResult(false, msg);

    }
}
