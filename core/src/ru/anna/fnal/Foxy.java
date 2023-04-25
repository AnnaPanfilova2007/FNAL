package ru.anna.fnal;

public class Foxy {

    private int difficulty;
    static int stage = 0;
    private boolean seen;
    private double startTime;
    public static boolean playerDeath = false;

    private void foxy(int difficulty) {
        this.difficulty = difficulty;
    }
}
