package com.example.models;

public class Player {
    private String name;
    private int energy;
    private int knowledge;
    private int currentLevelIndex = 0;

    public Player(String name) {
        this.name = name;
        this.energy = 100;
        this.knowledge = 0;
    }
    public static enum Gender{
        MASCULINO,
        FEMININO
    }

    public String getName() { return name; }
    public int getEnergy() { return energy; }
    public int getKnowledge() { return knowledge; }
    public void addKnowledge(int v) { knowledge += v; }
    public void reduceEnergy(int v) { energy = Math.max(0, energy - v); }
    public int getCurrentLevelIndex() { return currentLevelIndex; }
    public void setCurrentLevelIndex(int idx) { currentLevelIndex = idx; }
}
