package ru.anna.fnal;

public class Office {
    public static boolean light1on = false;
    public static boolean light2on = false;
    public static boolean door1open = true;
    public static boolean door2open = true;
    public static boolean monitorUp = false;
    public static double powerRemaining = 100;
    public static int devicedUsed;

    static double getPower() {

        return powerRemaining;
    }
}
