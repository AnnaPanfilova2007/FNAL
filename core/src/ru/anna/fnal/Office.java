package ru.anna.fnal;

public class Office {
    public static boolean light1on = false;
    public static boolean light2on = false;
    public static boolean door1open = true;
    public static boolean door2open = true;
    public static boolean monitorUp = false;
    public static double powerRemaining = 100.0;
    public static int devicedUsed;

    static double getPower() {

        return powerRemaining;
    }

    public static int getUsage() {
        int usage = 0;
        if (light1on) {
            ++usage;
        }

        if (light2on) {
            ++usage;
        }

        if (!door1open) {
            ++usage;
        }

        if (!door2open) {
            ++usage;
        }

        if (monitorUp) {
            ++usage;
        }

        return usage;
    }

    static void descreasepower() {
        if (devicedUsed == 0) {
            powerRemaining -= 0.5;
        }

        if (devicedUsed == 1) {
            --powerRemaining;
        }

        if (devicedUsed == 2) {
            powerRemaining -= 2.0;
        }

        if (devicedUsed == 3) {
            powerRemaining -= 4.0;
        }

        if (devicedUsed == 4) {
            powerRemaining -= 5.0;
        }

        if (devicedUsed == 5) {
            powerRemaining -= 6.0;
        }

    }
}
