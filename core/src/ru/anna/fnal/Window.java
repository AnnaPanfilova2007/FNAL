package ru.anna.fnal;

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

public class Window {
    public static boolean needToMove = true;
    public static boolean needStatic = false;
    public static final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public static final double Width = screenSize.getWidth();
    public static final double Height = screenSize.getHeight();
    public static int cameraPosition;
    public static final int Static = 1;
    public static boolean startGame = false;
    public static boolean startClicked = false;
    public static final String cameraLocation = "Show Stage";
    public static boolean ifloading = true;
    public static int officeView = -100;
    private java.awt.Image Image;
    public static int Fox = 1;
    public static int bonnie = 1;
    public static int foxdie = 1;
    public static int freddie = 1;
    public static int chicka = 1;
    public static int powerOut = 1;
    public static boolean mainmenumusicplaying = false;
    public static boolean gamemusicplaying = false;
    public static boolean screamplay = false;
    private Graphics Graphic;
    static AudioClip knock;
    AudioClip run;
    static AudioClip scream;
    AudioClip ambiance1;
    AudioClip ambiance2;
    AudioClip ambiance3;
    static AudioClip door;
    static AudioClip light;
    AudioClip main1;
    AudioClip main2;
    static AudioClip blip;
    BufferedImage stage;
    BufferedImage currentView;
}

