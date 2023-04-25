package ru.anna.fnal;

public class Bonnie {
    private static int inRoom = 0;
    private static int difficulty;
    public static boolean playerDeath = false;

    public void Bonnie(int difficulty) {
        this.difficulty = difficulty;
    }

    public static int isInRoom() {
        return inRoom;
    }
}
