package ru.anna.fnal;

public class Freddy {
    private static int inRoom = 0;
    private int difficulty;
    public static boolean playerDeath = false;

    public void Bonnie(int difficulty) {
        this.difficulty = difficulty;
    }

    public static int getInRoom() {
        return inRoom;
    }

}
