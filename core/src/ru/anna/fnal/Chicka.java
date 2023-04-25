package ru.anna.fnal;

public class Chicka {
    static int inRoom = 0;
    private static int Difficulty;
    public static boolean playerdeath = false;

    public void Chicka1(int Diffuculty) {
        Difficulty = Difficulty;
    }
    public static int isInRoom() {
        return inRoom;
    }
    public static void tick() {
        if (inRoom == 8 && Office.door2open && Office.monitorUp) {
            inRoom = 9;
            playerdeath = true;
        } else {
            int rand1 = 1 + (int)(Math.random() * (double)Difficulty);
            if (rand1 != Difficulty) {
                int rand2 = 1 + (int)(Math.random() * 8.0);
                if (rand2 >= 4) {
                    if (rand2 < inRoom) {
                        return;
                    }

                    if (Bonnie.inRoom == inRoom + 1 || Freddy.inRoom == inRoom + 1) {
                        return;
                    }

                    if (inRoom + 1 > 8) {
                        return;
                    }

                    ++inRoom;
                } else {
                    if (rand2 < inRoom) {
                        if (rand2 == inRoom) {
                            if (Bonnie.inRoom != inRoom + 1 && Freddy.inRoom != inRoom + 1) {
                                --inRoom;
                                return;
                            }

                            return;
                        }

                        return;
                    }

                    if (Bonnie.inRoom == inRoom + 1 || Freddy.inRoom == inRoom + 1) {
                        return;
                    }

                    if (inRoom + 1 > 8) {
                        return;
                    }

                    ++inRoom;
                }

            }
        }
    }
}
