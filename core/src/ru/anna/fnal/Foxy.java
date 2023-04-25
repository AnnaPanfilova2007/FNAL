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
    public static void tick() {
        if (!Office.monitorUp || Window.cameraLocation != "Pirate Cove") {
            if (stage != 3) {
                ++stage;
            } else if (!Office.door1open) {
                stage = 1;
                Window.knock.play();
            } else {
                playerDeath = true;
            }

        }
    }

    static int getStage() {
        return stage;
    }
}
