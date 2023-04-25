package ru.anna.fnal;

public class Chicka {
    private static int inRoom = 0;
    private static int difficulty;
    public static boolean isPlayerDead = false;

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public static int getInRoom() {
        return inRoom;
    }
}
