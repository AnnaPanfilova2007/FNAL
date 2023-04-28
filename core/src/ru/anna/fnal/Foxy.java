package ru.anna.fnal;

public class Foxy {

    private int Difficulty;
    private boolean seen;
    private double startTime;
    public static int stage = 0;
    public static boolean playerdeath = false;

    private void foxy(int difficulty) {
        this.Difficulty = difficulty;
    }

    public static void tick() {
        if (Office.monitorUp == true && Window.cameraLocation == "Pirate Cove") {
            return;
        } else {
            if (stage != 3) {
                stage = stage + 1;
            } else {
                if (Office.door1open == false) {
                    stage = 1;
                    Window.knock.play();
                } else {
                    playerdeath = true;
                }
            }
        }
    }

    static int getStage() {
        return stage;
    }
}
