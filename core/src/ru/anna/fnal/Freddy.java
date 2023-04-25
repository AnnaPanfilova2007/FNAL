package ru.anna.fnal;

public class Freddy {
    static int inRoom = 0;
    private int Difficulty;
    public static boolean playerdeath = false;
    public void Bonnie(int Diffuculty) {
        this.Difficulty = this.Difficulty;
    }
    public static int isInRoom() {
        return inRoom;
    }
    public static void tick() {
        if (inRoom != 0 || Bonnie.inRoom != 0 && Chicka.inRoom != 0) {
            if (Office.monitorUp && Office.door2open && inRoom == 4) {
                if (Office.door2open) {
                    playerdeath = true;
                    inRoom = 5;
                }

            } else if (inRoom != 4) {
                if (Chicka.inRoom != inRoom + 1 && Bonnie.inRoom != inRoom + 1) {
                    ++inRoom;
                }
            } else if (Chicka.inRoom != inRoom + 1 && Bonnie.inRoom != inRoom + 1) {
                --inRoom;
            }
        }
    }
}
