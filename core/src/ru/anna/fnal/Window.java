package ru.anna.fnal;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.awt.image.ImageProducer;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Window extends JFrame {
    public static boolean needToMove = true;
    public static boolean needStatic = false;
    public static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public static double Width;
    public static double Height;
    public static int cameraPosition;
    public static int Static;
    public static boolean startGame;
    public static boolean startClicked;
    public static String cameraLocation;
    public static boolean ifloading;
    public static int officeView;
    private Image Image;
    public static int Fox;
    public static int bonnie;
    public static int foxdie;
    public static int freddie;
    public static int chicka;
    public static int powerOut;
    public static boolean mainmenumusicplaying;
    public static boolean gamemusicplaying;
    public static boolean screamplay;
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
    BufferedImage bonnie1;
    BufferedImage bonnie2;
    BufferedImage bonnie3;
    BufferedImage bonnie4;
    BufferedImage bonnie5;
    BufferedImage bonnie6;
    BufferedImage bonnie7;
    BufferedImage bonnie8;
    BufferedImage bonnie9;
    BufferedImage bonnie10;
    BufferedImage bonnie11;
    BufferedImage chicka1;
    BufferedImage chicka2;
    BufferedImage chicka3;
    BufferedImage chicka4;
    BufferedImage chicka5;
    BufferedImage chicka6;
    BufferedImage chicka7;
    BufferedImage chicka8;
    BufferedImage chicka9;
    BufferedImage chicka10;
    BufferedImage chicka11;
    BufferedImage chicka12;
    BufferedImage chicka13;
    BufferedImage chicka14;
    BufferedImage chicka15;
    BufferedImage chicka16;
    BufferedImage foxy1;
    BufferedImage foxy2;
    BufferedImage foxy3;
    BufferedImage foxy4;
    BufferedImage foxy5;
    BufferedImage foxy6;
    BufferedImage foxy7;
    BufferedImage foxy8;
    BufferedImage foxy9;
    BufferedImage foxy10;
    BufferedImage foxy11;
    BufferedImage foxy12;
    BufferedImage foxy13;
    BufferedImage foxy14;
    BufferedImage foxy15;
    BufferedImage foxy16;
    BufferedImage foxy17;
    BufferedImage foxy18;
    BufferedImage foxy19;
    BufferedImage freddy1;
    BufferedImage freddy2;
    BufferedImage freddy3;
    BufferedImage freddy4;
    BufferedImage freddy5;
    BufferedImage freddy6;
    BufferedImage freddy7;
    BufferedImage freddy8;
    BufferedImage freddy9;
    BufferedImage freddy10;
    BufferedImage freddy11;
    BufferedImage freddy12;
    BufferedImage freddy13;
    BufferedImage freddy14;
    BufferedImage freddy15;
    BufferedImage freddy16;
    BufferedImage freddy17;
    BufferedImage freddy18;
    BufferedImage freddy19;
    BufferedImage freddy20;
    BufferedImage freddy21;
    BufferedImage freddy22;
    BufferedImage freddy23;
    BufferedImage freddy24;
    BufferedImage freddy25;
    BufferedImage freddy26;
    BufferedImage freddy27;
    BufferedImage freddy28;
    BufferedImage freddy29;
    BufferedImage powerout1;
    BufferedImage powerout2;
    BufferedImage powerout3;
    BufferedImage powerout4;
    BufferedImage powerout5;
    BufferedImage powerout6;
    BufferedImage powerout7;
    BufferedImage powerout8;
    BufferedImage powerout9;
    BufferedImage powerout10;
    BufferedImage powerout11;
    BufferedImage powerout12;
    BufferedImage powerout13;
    BufferedImage powerout14;
    BufferedImage powerout15;
    BufferedImage powerout16;
    BufferedImage powerout17;
    BufferedImage powerout18;
    BufferedImage powerout19;
    BufferedImage powerout20;
    BufferedImage powerout21;
    BufferedImage foxrun1;
    BufferedImage foxrun2;
    BufferedImage foxrun3;
    BufferedImage foxrun4;
    BufferedImage foxrun5;
    BufferedImage foxrun6;
    BufferedImage foxrun7;
    BufferedImage foxrun8;
    BufferedImage foxrun9;
    BufferedImage foxrun10;
    BufferedImage foxrun11;
    BufferedImage foxrun12;
    BufferedImage foxrun13;
    BufferedImage foxrun14;
    BufferedImage foxrun15;
    BufferedImage foxrun16;
    BufferedImage foxrun17;
    BufferedImage foxrun18;
    BufferedImage foxrun19;
    BufferedImage foxrun20;
    BufferedImage foxrun21;
    BufferedImage foxrun22;
    BufferedImage foxrun23;
    BufferedImage foxrun24;
    BufferedImage foxrun25;
    BufferedImage foxrun26;
    BufferedImage foxrun27;
    BufferedImage foxrun28;
    BufferedImage foxrun29;
    BufferedImage foxrun30;
    BufferedImage foxrun31;
    BufferedImage static1;
    BufferedImage static2;
    BufferedImage static3;
    BufferedImage static4;
    BufferedImage static5;
    BufferedImage static6;
    BufferedImage static7;
    BufferedImage static8;
    BufferedImage mainMenu;
    BufferedImage mainMenu2;
    BufferedImage mainMenu3;
    BufferedImage mainMenu4;
    BufferedImage stageNoBonnie;
    BufferedImage stageNoChicka;
    BufferedImage stageNoBonnieChicka;
    BufferedImage stageFreddyStare;
    BufferedImage stageNone;
    BufferedImage diningNone;
    BufferedImage diningBonnieFar;
    BufferedImage diningBonnieClose;
    BufferedImage diningChickaFar;
    BufferedImage diningChickaClose;
    BufferedImage diningFreddy;
    BufferedImage eastHallAChickaFar;
    BufferedImage eastHallAChickaClose;
    BufferedImage eastHallAFreddy;
    BufferedImage eastHallANone;
    BufferedImage eastHallBNone;
    BufferedImage eastHallBChicka;
    BufferedImage eastHallBFreddy;
    BufferedImage backstageNone;
    BufferedImage backstageFar;
    BufferedImage backstageClose;
    BufferedImage piratecoveStage0;
    BufferedImage piratecoveStage1;
    BufferedImage piratecoveStage2;
    BufferedImage piratecoveStage3;
    BufferedImage restroomsNone;
    BufferedImage restroomsChickaClose;
    BufferedImage restroomsChickaFar;
    BufferedImage restroomsFreddy;
    BufferedImage westHallANone;
    BufferedImage westHallABonnie;
    BufferedImage westHallBNone;
    BufferedImage westHallBBonnie;
    BufferedImage supplyclosetNone;
    BufferedImage supplyclosetBonnie;
    BufferedImage fiveNightsLogo;
    BufferedImage newGameLogo;
    BufferedImage arrows;
    BufferedImage office;
    BufferedImage officeLeftLight;
    BufferedImage officeRightLight;
    BufferedImage officeBonnie;
    BufferedImage officeChicka;
    BufferedImage officePowerOut;
    BufferedImage officePowerOutFreddy;
    BufferedImage name;
    BufferedImage cameraBar;
    BufferedImage loading;
    BufferedImage newspaper;
    BufferedImage leftNone;
    BufferedImage leftLight;
    BufferedImage leftDoor;
    BufferedImage leftBoth;
    BufferedImage rightNone;
    BufferedImage rightLight;
    BufferedImage rightDoor;
    BufferedImage rightBoth;
    BufferedImage cameraMinimap;
    BufferedImage A1;
    BufferedImage B1;
    BufferedImage C1;
    BufferedImage A2;
    BufferedImage B2;
    BufferedImage Three;
    BufferedImage A4;
    BufferedImage B4;
    BufferedImage Five;
    BufferedImage Six;
    BufferedImage blank;
    BufferedImage supplycloset;
    BufferedImage showstage;
    BufferedImage piratecove;
    BufferedImage backstage;
    BufferedImage diningarea;
    BufferedImage westhall;
    BufferedImage ehallcorner;
    BufferedImage whallcorner;
    BufferedImage restrooms;
    BufferedImage easthall;
    BufferedImage use1;
    BufferedImage use2;
    BufferedImage use3;
    BufferedImage use4;
    BufferedImage use5;
    BufferedImage use;
    BufferedImage powerleft;
    BufferedImage percentsign;
    BufferedImage leftdoor1;
    BufferedImage leftdoor2;
    BufferedImage leftdoor3;
    BufferedImage leftdoor4;
    BufferedImage leftdoor5;
    BufferedImage leftdoor6;
    BufferedImage leftdoor7;
    BufferedImage leftdoor8;
    BufferedImage leftdoor9;
    BufferedImage leftdoor10;
    BufferedImage leftdoor11;
    BufferedImage leftdoor12;
    BufferedImage leftdoor13;
    BufferedImage rightdoor1;
    BufferedImage rightdoor2;
    BufferedImage rightdoor3;
    BufferedImage rightdoor4;
    BufferedImage rightdoor5;
    BufferedImage rightdoor6;
    BufferedImage rightdoor7;
    BufferedImage rightdoor8;
    BufferedImage rightdoor9;
    BufferedImage rightdoor10;
    BufferedImage rightdoor11;
    BufferedImage rightdoor12;
    BufferedImage rightdoor13;
    BufferedImage onehundred;
    BufferedImage ninety;
    BufferedImage eighty;
    BufferedImage seventy;
    BufferedImage sixty;
    BufferedImage fifty;
    BufferedImage forty;
    BufferedImage thirty;
    BufferedImage twenty;
    BufferedImage ten;
    BufferedImage zero;
    BufferedImage lose;
    BufferedImage win;


    static {
        Width = screenSize.getWidth();
        Height = screenSize.getHeight();
        Static = 1;
        startGame = false;
        startClicked = false;
        cameraLocation = "Show Stage";
        ifloading = true;
        officeView = -100;
        Fox = 1;
        bonnie = 1;
        foxdie = 1;
        freddie = 1;
        chicka = 1;
        powerOut = 1;
        mainmenumusicplaying = false;
        gamemusicplaying = false;
        screamplay = false;
    }

    public Window() {
        super("Five Nights at Freddy's");
        this.setSize((int)this.width(Width), (int)this.height(Height));
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
        this.setResizable(false);

        try {
            knock = Applet.newAudioClip(Window.class.getResource("FoxyKnock.wav"));
            this.run = Applet.newAudioClip(Window.class.getResource("FoxyRun.wav"));
            scream = Applet.newAudioClip(Window.class.getResource("XSCREAM.wav"));
            this.ambiance1 = Applet.newAudioClip(Window.class.getResource("Ambiance1.wav"));
            this.ambiance2 = Applet.newAudioClip(Window.class.getResource("Ambience2.wav"));
            door = Applet.newAudioClip(Window.class.getResource("Door.wav"));
            light = Applet.newAudioClip(Window.class.getResource("Ambiance3.wav"));
            this.main1 = Applet.newAudioClip(Window.class.getResource("Mainmenu1.wav"));
            this.main2 = Applet.newAudioClip(Window.class.getResource("Mainmenu2.wav"));
            blip = Applet.newAudioClip(Window.class.getResource("blip.wav"));
        } catch (Exception var3) {
            var3.printStackTrace();
        }

        try {
            this.loading = ImageIO.read(Window.class.getResource("jump.jpg"));
            this.lose = ImageIO.read(Window.class.getResource("Lose.png"));
            this.win = ImageIO.read(Window.class.getResource("StandardWin.png"));
            this.zero = ImageIO.read(Window.class.getResource("zero.png"));
            this.ten = ImageIO.read(Window.class.getResource("ten.png"));
            this.twenty = ImageIO.read(Window.class.getResource("twenty.png"));
            this.thirty = ImageIO.read(Window.class.getResource("thirty.png"));
            this.forty = ImageIO.read(Window.class.getResource("forty.png"));
            this.fifty = ImageIO.read(Window.class.getResource("fifty.png"));
            this.sixty = ImageIO.read(Window.class.getResource("sixty.png"));
            this.seventy = ImageIO.read(Window.class.getResource("seventy.png"));
            this.eighty = ImageIO.read(Window.class.getResource("eighty.png"));
            this.ninety = ImageIO.read(Window.class.getResource("ninety.png"));
            this.onehundred = ImageIO.read(Window.class.getResource("onehundred.png"));
            this.supplycloset = ImageIO.read(Window.class.getResource("50.png"));
            this.showstage = ImageIO.read(Window.class.getResource("54.png"));
            this.piratecove = ImageIO.read(Window.class.getResource("70.png"));
            this.backstage = ImageIO.read(Window.class.getResource("71.png"));
            this.diningarea = ImageIO.read(Window.class.getResource("72.png"));
            this.westhall = ImageIO.read(Window.class.getResource("74.png"));
            this.ehallcorner = ImageIO.read(Window.class.getResource("75.png"));
            this.whallcorner = ImageIO.read(Window.class.getResource("76.png"));
            this.restrooms = ImageIO.read(Window.class.getResource("77.png"));
            this.easthall = ImageIO.read(Window.class.getResource("79.png"));
            this.blank = ImageIO.read(Window.class.getResource("blank.png"));
            this.leftdoor1 = ImageIO.read(Window.class.getResource("89.png"));
            this.leftdoor2 = ImageIO.read(Window.class.getResource("91.png"));
            this.leftdoor3 = ImageIO.read(Window.class.getResource("92.png"));
            this.leftdoor4 = ImageIO.read(Window.class.getResource("93.png"));
            this.leftdoor5 = ImageIO.read(Window.class.getResource("94.png"));
            this.leftdoor6 = ImageIO.read(Window.class.getResource("95.png"));
            this.leftdoor7 = ImageIO.read(Window.class.getResource("96.png"));
            this.leftdoor8 = ImageIO.read(Window.class.getResource("97.png"));
            this.leftdoor9 = ImageIO.read(Window.class.getResource("98.png"));
            this.leftdoor10 = ImageIO.read(Window.class.getResource("99.png"));
            this.leftdoor11 = ImageIO.read(Window.class.getResource("100.png"));
            this.leftdoor12 = ImageIO.read(Window.class.getResource("101.png"));
            this.leftdoor13 = ImageIO.read(Window.class.getResource("102.png"));
            this.rightdoor1 = ImageIO.read(Window.class.getResource("106.png"));
            this.rightdoor2 = ImageIO.read(Window.class.getResource("107.png"));
            this.rightdoor3 = ImageIO.read(Window.class.getResource("108.png"));
            this.rightdoor4 = ImageIO.read(Window.class.getResource("109.png"));
            this.rightdoor5 = ImageIO.read(Window.class.getResource("110.png"));
            this.rightdoor6 = ImageIO.read(Window.class.getResource("111.png"));
            this.rightdoor7 = ImageIO.read(Window.class.getResource("112.png"));
            this.rightdoor8 = ImageIO.read(Window.class.getResource("113.png"));
            this.rightdoor9 = ImageIO.read(Window.class.getResource("114.png"));
            this.rightdoor10 = ImageIO.read(Window.class.getResource("115.png"));
            this.rightdoor11 = ImageIO.read(Window.class.getResource("116.png"));
            this.rightdoor12 = ImageIO.read(Window.class.getResource("117.png"));
            this.rightdoor13 = ImageIO.read(Window.class.getResource("118.png"));
            this.A1 = ImageIO.read(Window.class.getResource("170.png"));
            this.B1 = ImageIO.read(Window.class.getResource("171.png"));
            this.C1 = ImageIO.read(Window.class.getResource("177.png"));
            this.A2 = ImageIO.read(Window.class.getResource("172.png"));
            this.B2 = ImageIO.read(Window.class.getResource("165.png"));
            this.Three = ImageIO.read(Window.class.getResource("168.png"));
            this.A4 = ImageIO.read(Window.class.getResource("169.png"));
            this.B4 = ImageIO.read(Window.class.getResource("173.png"));
            this.Five = ImageIO.read(Window.class.getResource("174.png"));
            this.Six = ImageIO.read(Window.class.getResource("175.png"));
            this.fiveNightsLogo = ImageIO.read(Window.class.getResource("444.png"));
            this.newGameLogo = ImageIO.read(Window.class.getResource("448.png"));
            this.arrows = ImageIO.read(Window.class.getResource("450.png"));
            this.mainMenu = ImageIO.read(Window.class.getResource("431.png"));
            this.name = ImageIO.read(Window.class.getResource("433.png"));
            this.mainMenu2 = ImageIO.read(Window.class.getResource("440.png"));
            this.mainMenu3 = ImageIO.read(Window.class.getResource("441.png"));
            this.mainMenu4 = ImageIO.read(Window.class.getResource("539.png"));
            this.newspaper = ImageIO.read(Window.class.getResource("539.png"));
            this.office = ImageIO.read(Window.class.getResource("39.png"));
            this.cameraMinimap = ImageIO.read(Window.class.getResource("145.png"));
            this.leftNone = ImageIO.read(Window.class.getResource("122.png"));
            this.leftLight = ImageIO.read(Window.class.getResource("125.png"));
            this.leftDoor = ImageIO.read(Window.class.getResource("124.png"));
            this.leftBoth = ImageIO.read(Window.class.getResource("130.png"));
            this.rightNone = ImageIO.read(Window.class.getResource("134.png"));
            this.rightDoor = ImageIO.read(Window.class.getResource("135.png"));
            this.rightLight = ImageIO.read(Window.class.getResource("131.png"));
            this.rightBoth = ImageIO.read(Window.class.getResource("47.png"));
            this.officeLeftLight = ImageIO.read(Window.class.getResource("58.png"));
            this.officeRightLight = ImageIO.read(Window.class.getResource("127.png"));
            this.officeBonnie = ImageIO.read(Window.class.getResource("225.png"));
            this.officeChicka = ImageIO.read(Window.class.getResource("227.png"));
            this.officePowerOut = ImageIO.read(Window.class.getResource("304.png"));
            this.officePowerOutFreddy = ImageIO.read(Window.class.getResource("305.png"));
            this.stage = ImageIO.read(Window.class.getResource("19.png"));
            this.stageNoBonnie = ImageIO.read(Window.class.getResource("68.png"));
            this.stageNoChicka = ImageIO.read(Window.class.getResource("223.png"));
            this.stageNoBonnieChicka = ImageIO.read(Window.class.getResource("224.png"));
            this.stageFreddyStare = ImageIO.read(Window.class.getResource("355.png"));
            this.stageNone = ImageIO.read(Window.class.getResource("484.png"));
            this.diningNone = ImageIO.read(Window.class.getResource("48.png"));
            this.diningBonnieFar = ImageIO.read(Window.class.getResource("90.png"));
            this.diningBonnieClose = ImageIO.read(Window.class.getResource("120.png"));
            this.diningChickaFar = ImageIO.read(Window.class.getResource("215.png"));
            this.diningChickaClose = ImageIO.read(Window.class.getResource("222.png"));
            this.diningFreddy = ImageIO.read(Window.class.getResource("492.png"));
            this.eastHallANone = ImageIO.read(Window.class.getResource("67.png"));
            this.eastHallAChickaFar = ImageIO.read(Window.class.getResource("221.png"));
            this.eastHallAChickaClose = ImageIO.read(Window.class.getResource("226.png"));
            this.eastHallAFreddy = ImageIO.read(Window.class.getResource("487.png"));
            this.eastHallBNone = ImageIO.read(Window.class.getResource("49.png"));
            this.eastHallBChicka = ImageIO.read(Window.class.getResource("220.png"));
            this.eastHallBFreddy = ImageIO.read(Window.class.getResource("486.png"));
            this.backstageNone = ImageIO.read(Window.class.getResource("83.png"));
            this.backstageFar = ImageIO.read(Window.class.getResource("205.png"));
            this.backstageClose = ImageIO.read(Window.class.getResource("555.png"));
            this.piratecoveStage0 = ImageIO.read(Window.class.getResource("66.png"));
            this.piratecoveStage1 = ImageIO.read(Window.class.getResource("211.png"));
            this.piratecoveStage2 = ImageIO.read(Window.class.getResource("338.png"));
            this.piratecoveStage3 = ImageIO.read(Window.class.getResource("553.png"));
            this.restroomsNone = ImageIO.read(Window.class.getResource("41.png"));
            this.restroomsChickaFar = ImageIO.read(Window.class.getResource("217.png"));
            this.restroomsChickaClose = ImageIO.read(Window.class.getResource("219.png"));
            this.restroomsFreddy = ImageIO.read(Window.class.getResource("494.png"));
            this.westHallANone = ImageIO.read(Window.class.getResource("44.png"));
            this.westHallABonnie = ImageIO.read(Window.class.getResource("206.png"));
            this.westHallBNone = ImageIO.read(Window.class.getResource("0.png"));
            this.westHallBBonnie = ImageIO.read(Window.class.getResource("188.png"));
            this.supplyclosetNone = ImageIO.read(Window.class.getResource("62.png"));
            this.supplyclosetBonnie = ImageIO.read(Window.class.getResource("190.png"));
            this.static1 = ImageIO.read(Window.class.getResource("12.png"));
            this.static2 = ImageIO.read(Window.class.getResource("13.png"));
            this.static3 = ImageIO.read(Window.class.getResource("14.png"));
            this.static4 = ImageIO.read(Window.class.getResource("15.png"));
            this.static5 = ImageIO.read(Window.class.getResource("16.png"));
            this.static6 = ImageIO.read(Window.class.getResource("17.png"));
            this.static7 = ImageIO.read(Window.class.getResource("18.png"));
            this.static8 = ImageIO.read(Window.class.getResource("20.png"));
            this.use1 = ImageIO.read(Window.class.getResource("212.png"));
            this.use2 = ImageIO.read(Window.class.getResource("213.png"));
            this.use3 = ImageIO.read(Window.class.getResource("214.png"));
            this.use4 = ImageIO.read(Window.class.getResource("456.png"));
            this.use5 = ImageIO.read(Window.class.getResource("455.png"));
            this.use = ImageIO.read(Window.class.getResource("189.png"));
            this.powerleft = ImageIO.read(Window.class.getResource("207.png"));
            this.percentsign = ImageIO.read(Window.class.getResource("208.png"));
            this.cameraBar = ImageIO.read(Window.class.getResource("420.png"));
            this.foxrun1 = ImageIO.read(Window.class.getResource("244.png"));
            this.foxrun2 = ImageIO.read(Window.class.getResource("245.png"));
            this.foxrun3 = ImageIO.read(Window.class.getResource("246.png"));
            this.foxrun4 = ImageIO.read(Window.class.getResource("247.png"));
            this.foxrun5 = ImageIO.read(Window.class.getResource("248.png"));
            this.foxrun6 = ImageIO.read(Window.class.getResource("250.png"));
            this.foxrun7 = ImageIO.read(Window.class.getResource("280.png"));
            this.foxrun8 = ImageIO.read(Window.class.getResource("282.png"));
            this.foxrun9 = ImageIO.read(Window.class.getResource("283.png"));
            this.foxrun10 = ImageIO.read(Window.class.getResource("284.png"));
            this.foxrun11 = ImageIO.read(Window.class.getResource("285.png"));
            this.foxrun12 = ImageIO.read(Window.class.getResource("286.png"));
            this.foxrun13 = ImageIO.read(Window.class.getResource("287.png"));
            this.foxrun14 = ImageIO.read(Window.class.getResource("288.png"));
            this.foxrun15 = ImageIO.read(Window.class.getResource("289.png"));
            this.foxrun16 = ImageIO.read(Window.class.getResource("290.png"));
            this.foxrun17 = ImageIO.read(Window.class.getResource("292.png"));
            this.foxrun18 = ImageIO.read(Window.class.getResource("302.png"));
            this.foxrun19 = ImageIO.read(Window.class.getResource("306.png"));
            this.foxrun20 = ImageIO.read(Window.class.getResource("327.png"));
            this.foxrun21 = ImageIO.read(Window.class.getResource("329.png"));
            this.foxrun22 = ImageIO.read(Window.class.getResource("330.png"));
            this.foxrun23 = ImageIO.read(Window.class.getResource("331.png"));
            this.foxrun24 = ImageIO.read(Window.class.getResource("332.png"));
            this.foxrun25 = ImageIO.read(Window.class.getResource("333.png"));
            this.foxrun26 = ImageIO.read(Window.class.getResource("334.png"));
            this.foxrun27 = ImageIO.read(Window.class.getResource("335.png"));
            this.foxrun28 = ImageIO.read(Window.class.getResource("336.png"));
            this.foxrun29 = ImageIO.read(Window.class.getResource("337.png"));
            this.foxrun30 = ImageIO.read(Window.class.getResource("339-241.png"));
            this.foxrun31 = ImageIO.read(Window.class.getResource("340.png"));
            this.powerout1 = ImageIO.read(Window.class.getResource("326.png"));
            this.powerout2 = ImageIO.read(Window.class.getResource("307.png"));
            this.powerout3 = ImageIO.read(Window.class.getResource("348.png"));
            this.powerout4 = ImageIO.read(Window.class.getResource("308.png"));
            this.powerout5 = ImageIO.read(Window.class.getResource("309.png"));
            this.powerout5 = ImageIO.read(Window.class.getResource("310.png"));
            this.powerout6 = ImageIO.read(Window.class.getResource("311.png"));
            this.powerout7 = ImageIO.read(Window.class.getResource("312.png"));
            this.powerout8 = ImageIO.read(Window.class.getResource("313.png"));
            this.powerout9 = ImageIO.read(Window.class.getResource("314.png"));
            this.powerout10 = ImageIO.read(Window.class.getResource("315.png"));
            this.powerout11 = ImageIO.read(Window.class.getResource("316.png"));
            this.powerout12 = ImageIO.read(Window.class.getResource("317.png"));
            this.powerout13 = ImageIO.read(Window.class.getResource("318.png"));
            this.powerout14 = ImageIO.read(Window.class.getResource("319.png"));
            this.powerout15 = ImageIO.read(Window.class.getResource("320.png"));
            this.powerout16 = ImageIO.read(Window.class.getResource("321.png"));
            this.powerout17 = ImageIO.read(Window.class.getResource("322.png"));
            this.powerout18 = ImageIO.read(Window.class.getResource("323.png"));
            this.powerout19 = ImageIO.read(Window.class.getResource("324.png"));
            this.powerout20 = ImageIO.read(Window.class.getResource("325.png"));
            this.bonnie1 = ImageIO.read(Window.class.getResource("291.png"));
            this.bonnie2 = ImageIO.read(Window.class.getResource("293.png"));
            this.bonnie3 = ImageIO.read(Window.class.getResource("294.png"));
            this.bonnie4 = ImageIO.read(Window.class.getResource("295.png"));
            this.bonnie5 = ImageIO.read(Window.class.getResource("296.png"));
            this.bonnie6 = ImageIO.read(Window.class.getResource("297.png"));
            this.bonnie7 = ImageIO.read(Window.class.getResource("298.png"));
            this.bonnie8 = ImageIO.read(Window.class.getResource("299.png"));
            this.bonnie9 = ImageIO.read(Window.class.getResource("300.png"));
            this.bonnie10 = ImageIO.read(Window.class.getResource("301.png"));
            this.bonnie11 = ImageIO.read(Window.class.getResource("303.png"));
            this.chicka1 = ImageIO.read(Window.class.getResource("65.png"));
            this.chicka2 = ImageIO.read(Window.class.getResource("69.png"));
            this.chicka3 = ImageIO.read(Window.class.getResource("216.png"));
            this.chicka4 = ImageIO.read(Window.class.getResource("228.png"));
            this.chicka5 = ImageIO.read(Window.class.getResource("229.png"));
            this.chicka6 = ImageIO.read(Window.class.getResource("230.png"));
            this.chicka7 = ImageIO.read(Window.class.getResource("231.png"));
            this.chicka8 = ImageIO.read(Window.class.getResource("232.png"));
            this.chicka9 = ImageIO.read(Window.class.getResource("233.png"));
            this.chicka10 = ImageIO.read(Window.class.getResource("234.png"));
            this.chicka11 = ImageIO.read(Window.class.getResource("235.png"));
            this.chicka12 = ImageIO.read(Window.class.getResource("236.png"));
            this.chicka13 = ImageIO.read(Window.class.getResource("237.png"));
            this.chicka14 = ImageIO.read(Window.class.getResource("239.png"));
            this.chicka15 = ImageIO.read(Window.class.getResource("279.png"));
            this.chicka16 = ImageIO.read(Window.class.getResource("281.png"));
            this.foxy1 = ImageIO.read(Window.class.getResource("242.png"));
            this.foxy2 = ImageIO.read(Window.class.getResource("243.png"));
            this.foxy3 = ImageIO.read(Window.class.getResource("396.png"));
            this.foxy4 = ImageIO.read(Window.class.getResource("397.png"));
            this.foxy5 = ImageIO.read(Window.class.getResource("398.png"));
            this.foxy6 = ImageIO.read(Window.class.getResource("399.png"));
            this.foxy7 = ImageIO.read(Window.class.getResource("400.png"));
            this.foxy8 = ImageIO.read(Window.class.getResource("401.png"));
            this.foxy9 = ImageIO.read(Window.class.getResource("402.png"));
            this.foxy10 = ImageIO.read(Window.class.getResource("403.png"));
            this.foxy11 = ImageIO.read(Window.class.getResource("404.png"));
            this.foxy12 = ImageIO.read(Window.class.getResource("405.png"));
            this.foxy13 = ImageIO.read(Window.class.getResource("406.png"));
            this.foxy14 = ImageIO.read(Window.class.getResource("407.png"));
            this.foxy15 = ImageIO.read(Window.class.getResource("408.png"));
            this.foxy16 = ImageIO.read(Window.class.getResource("409.png"));
            this.foxy17 = ImageIO.read(Window.class.getResource("410.png"));
            this.foxy18 = ImageIO.read(Window.class.getResource("411.png"));
            this.foxy19 = ImageIO.read(Window.class.getResource("412.png"));
            this.freddy1 = ImageIO.read(Window.class.getResource("489.png"));
            this.freddy2 = ImageIO.read(Window.class.getResource("490.png"));
            this.freddy3 = ImageIO.read(Window.class.getResource("491.png"));
            this.freddy4 = ImageIO.read(Window.class.getResource("493.png"));
            this.freddy5 = ImageIO.read(Window.class.getResource("495.png"));
            this.freddy6 = ImageIO.read(Window.class.getResource("496.png"));
            this.freddy7 = ImageIO.read(Window.class.getResource("497.png"));
            this.freddy8 = ImageIO.read(Window.class.getResource("498.png"));
            this.freddy9 = ImageIO.read(Window.class.getResource("499.png"));
            this.freddy10 = ImageIO.read(Window.class.getResource("500.png"));
            this.freddy11 = ImageIO.read(Window.class.getResource("501.png"));
            this.freddy12 = ImageIO.read(Window.class.getResource("502.png"));
            this.freddy13 = ImageIO.read(Window.class.getResource("503.png"));
            this.freddy14 = ImageIO.read(Window.class.getResource("504.png"));
            this.freddy15 = ImageIO.read(Window.class.getResource("505.png"));
            this.freddy16 = ImageIO.read(Window.class.getResource("506.png"));
            this.freddy17 = ImageIO.read(Window.class.getResource("507.png"));
            this.freddy18 = ImageIO.read(Window.class.getResource("508.png"));
            this.freddy19 = ImageIO.read(Window.class.getResource("509.png"));
            this.freddy20 = ImageIO.read(Window.class.getResource("510.png"));
            this.freddy21 = ImageIO.read(Window.class.getResource("511.png"));
            this.freddy22 = ImageIO.read(Window.class.getResource("512.png"));
            this.freddy23 = ImageIO.read(Window.class.getResource("513.png"));
            this.freddy24 = ImageIO.read(Window.class.getResource("514.png"));
            this.freddy25 = ImageIO.read(Window.class.getResource("515.png"));
            this.freddy26 = ImageIO.read(Window.class.getResource("516.png"));
            this.freddy27 = ImageIO.read(Window.class.getResource("517.png"));
            this.freddy28 = ImageIO.read(Window.class.getResource("518.png"));
        } catch (IOException var2) {
            var2.printStackTrace();
        }

        ifloading = false;
    }

    public void paint(Graphics g) {
        this.Image = this.createImage(this.getWidth(), this.getHeight());
        this.Graphic = this.Image.getGraphics();
        this.paintComponent(this.Graphic);
        g.drawImage(this.Image, 0, 0, this);
    }

    public void paintComponent(Graphics g) {
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        if (ifloading) {
            g.drawImage(this.loading, 370, 200, this);
        } else if (!startGame) {
            if (!mainmenumusicplaying) {
                this.main1.play();
                this.ambiance1.play();
                mainmenumusicplaying = true;
            }

            this.ambiance2.stop();
            this.ambiance1.stop();
            needToMove = false;
            int random = (int)(Math.random() * 20.0);
            if (random > 18) {
                random = (int)(Math.random() * 2.0);
                switch (random) {
                    case 1:
                        g.drawImage(this.mainMenu2, 0, 0, this);
                        break;
                    case 2:
                        g.drawImage(this.mainMenu3, 0, 0, this);
                }
            } else {
                g.drawImage(this.mainMenu, 0, 0, this);
            }

            g.drawImage(this.fiveNightsLogo, 100, 50, this);
            g.drawImage(this.newGameLogo, 100, 400, this);
            g.drawImage(this.arrows, 30, 405, this);
            g.drawImage(this.name, 1050, 700, this);
            if (startClicked) {
                g.drawImage(this.newspaper, 0, 0, this);
            }
        } else {
            this.main1.stop();
            this.ambiance1.stop();
            mainmenumusicplaying = false;
            if (!gamemusicplaying) {
                this.ambiance2.play();
                this.ambiance1.play();
                gamemusicplaying = true;
            }

            if (Office.monitorUp) {
                if (cameraLocation.equals("Show Stage")) {
                    needToMove = true;
                    if (Bonnie.isInRoom() != 0 && Chicka.isInRoom() != 0 && Freddy.isInRoom() != 0) {
                        g.drawImage(this.stageNone, cameraPosition - 200, 0, this);
                    }

                    if (Bonnie.isInRoom() == 0 && Chicka.isInRoom() == 0 && Freddy.isInRoom() == 0) {
                        g.drawImage(this.stage, cameraPosition - 200, 0, this);
                    }

                    if (Bonnie.isInRoom() != 0 && Chicka.isInRoom() == 0 && Freddy.isInRoom() == 0) {
                        g.drawImage(this.stageNoBonnie, cameraPosition - 200, 0, this);
                    }

                    if (Bonnie.isInRoom() == 0 && Chicka.isInRoom() != 0 && Freddy.isInRoom() == 0) {
                        g.drawImage(this.stageNoChicka, cameraPosition - 200, 0, this);
                    }

                    if (Bonnie.isInRoom() != 0 && Chicka.isInRoom() != 0 && Freddy.isInRoom() == 0) {
                        g.drawImage(this.stageNoBonnieChicka, cameraPosition - 200, 0, this);
                    }

                    g.drawImage(makeColorTransparent(this.showstage, Color.black), 800, 290, this);
                }

                if (cameraLocation.equals("Dining Area")) {
                    needToMove = true;
                    if (Bonnie.isInRoom() != 1 && Chicka.isInRoom() != 1 && Freddy.isInRoom() != 1 && Bonnie.isInRoom() != 2 && Chicka.isInRoom() != 2) {
                        g.drawImage(this.diningNone, cameraPosition - 200, 0, this);
                    }

                    if (Bonnie.isInRoom() == 1 && Chicka.isInRoom() != 1 && Freddy.isInRoom() != 1 && Bonnie.isInRoom() != 2 && Chicka.isInRoom() != 2) {
                        g.drawImage(this.diningBonnieFar, cameraPosition - 200, 0, this);
                    }

                    if (Bonnie.isInRoom() != 1 && Chicka.isInRoom() != 1 && Freddy.isInRoom() != 1 && Bonnie.isInRoom() != 1 && Chicka.isInRoom() == 2) {
                        g.drawImage(this.diningChickaClose, cameraPosition - 200, 0, this);
                    }

                    if (Bonnie.isInRoom() != 1 && Chicka.isInRoom() == 1 && Freddy.isInRoom() != 1 && Bonnie.isInRoom() != 2 && Chicka.isInRoom() != 2) {
                        g.drawImage(this.diningChickaFar, cameraPosition - 200, 0, this);
                    }

                    if (Bonnie.isInRoom() != 1 && Chicka.isInRoom() != 1 && Freddy.isInRoom() != 1 && Bonnie.isInRoom() == 2 && Chicka.isInRoom() != 2) {
                        g.drawImage(this.diningChickaClose, cameraPosition - 200, 0, this);
                    }

                    if (Bonnie.isInRoom() != 1 && Chicka.isInRoom() != 1 && Freddy.isInRoom() == 1 && Bonnie.isInRoom() != 2 && Chicka.isInRoom() != 2) {
                        g.drawImage(this.diningFreddy, cameraPosition - 200, 0, this);
                    }

                    g.drawImage(makeColorTransparent(this.diningarea, Color.black), 800, 290, this);
                }

                if (cameraLocation.equals("East Hall A")) {
                    needToMove = true;
                    if (Chicka.isInRoom() == 5 && Freddy.isInRoom() != 3 && Chicka.isInRoom() != 6) {
                        g.drawImage(this.eastHallAChickaFar, cameraPosition - 200, 0, this);
                    }

                    if (Chicka.isInRoom() != 5 && Freddy.isInRoom() != 3 && Chicka.isInRoom() == 6) {
                        g.drawImage(this.eastHallAChickaClose, cameraPosition - 200, 0, this);
                    }

                    if (Chicka.isInRoom() != 5 && Freddy.isInRoom() == 3 && Chicka.isInRoom() != 6) {
                        g.drawImage(this.eastHallAFreddy, cameraPosition - 200, 0, this);
                    }

                    if (Chicka.isInRoom() != 5 && Freddy.isInRoom() != 3 && Chicka.isInRoom() != 6) {
                        g.drawImage(this.eastHallANone, cameraPosition - 200, 0, this);
                    }

                    g.drawImage(makeColorTransparent(this.easthall, Color.black), 800, 290, this);
                }

                if (cameraLocation.equals("East Hall B")) {
                    needToMove = true;
                    if (Chicka.isInRoom() != 7 && Freddy.isInRoom() != 4) {
                        g.drawImage(this.eastHallBNone, cameraPosition - 200, 0, this);
                    }

                    if (Chicka.isInRoom() == 7 && Freddy.isInRoom() != 4) {
                        g.drawImage(this.eastHallBChicka, cameraPosition - 200, 0, this);
                    }

                    if (Chicka.isInRoom() != 7 && Freddy.isInRoom() == 4) {
                        g.drawImage(this.eastHallBFreddy, cameraPosition - 200, 0, this);
                    }

                    g.drawImage(makeColorTransparent(this.ehallcorner, Color.black), 800, 290, this);
                }

                if (cameraLocation.equals("Backstage")) {
                    needToMove = true;
                    if (Bonnie.isInRoom() != 3 && Bonnie.isInRoom() != 4) {
                        g.drawImage(this.backstageNone, cameraPosition - 200, 0, this);
                    }

                    if (Bonnie.isInRoom() == 3 && Bonnie.isInRoom() != 4) {
                        g.drawImage(this.backstageFar, cameraPosition - 200, 0, this);
                    }

                    if (Bonnie.isInRoom() != 3 && Bonnie.isInRoom() == 4) {
                        g.drawImage(this.backstageClose, cameraPosition - 200, 0, this);
                    }

                    g.drawImage(makeColorTransparent(this.backstage, Color.black), 800, 290, this);
                }

                if (cameraLocation.equals("Pirate Cove")) {
                    needToMove = true;
                    if (Foxy.getStage() == 0) {
                        g.drawImage(this.piratecoveStage0, -100, 0, this);
                    } else if (Foxy.getStage() == 1) {
                        g.drawImage(this.piratecoveStage1, -100, 0, this);
                    } else if (Foxy.getStage() == 2) {
                        g.drawImage(this.piratecoveStage2, -100, 0, this);
                    } else if (Foxy.getStage() == 3) {
                        g.drawImage(this.piratecoveStage3, -100, 0, this);
                    }

                    g.drawImage(makeColorTransparent(this.piratecove, Color.black), 800, 290, this);
                }

                if (cameraLocation.equals("Restrooms")) {
                    needToMove = true;
                    if (Chicka.isInRoom() == 3 && Freddy.isInRoom() != 2 && Chicka.isInRoom() != 4) {
                        g.drawImage(this.restroomsChickaFar, cameraPosition - 200, 0, this);
                    }

                    if (Chicka.isInRoom() != 3 && Freddy.isInRoom() != 2 && Chicka.isInRoom() == 4) {
                        g.drawImage(this.restroomsChickaClose, cameraPosition - 200, 0, this);
                    }

                    if (Chicka.isInRoom() != 3 && Freddy.isInRoom() == 2 && Chicka.isInRoom() != 4) {
                        g.drawImage(this.restroomsFreddy, cameraPosition - 200, 0, this);
                    }

                    if (Chicka.isInRoom() != 3 && Freddy.isInRoom() != 2 && Chicka.isInRoom() != 4) {
                        g.drawImage(this.restroomsNone, cameraPosition - 200, 0, this);
                    }

                    g.drawImage(makeColorTransparent(this.restrooms, Color.black), 800, 290, this);
                }

                if (cameraLocation.equals("West Hall A") && Foxy.getStage() != 3) {
                    needToMove = true;
                    if (Bonnie.isInRoom() != 5) {
                        g.drawImage(this.westHallANone, cameraPosition - 200, 0, this);
                    }

                    if (Bonnie.isInRoom() == 5) {
                        g.drawImage(this.westHallABonnie, cameraPosition - 200, 0, this);
                    }

                    g.drawImage(makeColorTransparent(this.westhall, Color.black), 800, 290, this);
                }

                if (cameraLocation.equals("West Hall B")) {
                    needToMove = true;
                    if (Bonnie.isInRoom() != 7) {
                        g.drawImage(this.westHallBNone, cameraPosition - 200, 0, this);
                    }

                    if (Bonnie.isInRoom() == 7) {
                        g.drawImage(this.westHallBBonnie, cameraPosition - 200, 0, this);
                    }

                    g.drawImage(makeColorTransparent(this.whallcorner, Color.black), 800, 290, this);
                }

                if (cameraLocation.equals("Supply Closet")) {
                    needToMove = true;
                    if (Bonnie.isInRoom() != 6) {
                        g.drawImage(this.supplyclosetNone, -100, 0, this);
                    }

                    if (Bonnie.isInRoom() == 6) {
                        g.drawImage(this.supplyclosetBonnie, -100, 0, this);
                    }

                    g.drawImage(makeColorTransparent(this.supplycloset, Color.black), 800, 290, this);
                }

                if (cameraLocation.equals("West Hall A") && Foxy.getStage() == 3) {
                    if (Foxy.getStage() == 3) {
                        needToMove = false;
                        if (Fox == 1) {
                            g.drawImage(this.foxrun1, 0, 0, this);
                            this.run.play();
                        }

                        if (Fox == 2) {
                            g.drawImage(this.foxrun2, 0, 0, this);
                        }

                        if (Fox == 3) {
                            g.drawImage(this.foxrun3, 0, 0, this);
                        }

                        if (Fox == 4) {
                            g.drawImage(this.foxrun4, 0, 0, this);
                        }

                        if (Fox == 5) {
                            g.drawImage(this.foxrun5, 0, 0, this);
                        }

                        if (Fox == 6) {
                            g.drawImage(this.foxrun6, 0, 0, this);
                        }

                        if (Fox == 7) {
                            g.drawImage(this.foxrun7, 0, 0, this);
                        }

                        if (Fox == 8) {
                            g.drawImage(this.foxrun8, 0, 0, this);
                        }

                        if (Fox == 9) {
                            g.drawImage(this.foxrun9, 0, 0, this);
                        }

                        if (Fox == 10) {
                            g.drawImage(this.foxrun10, 0, 0, this);
                        }

                        if (Fox == 11) {
                            g.drawImage(this.foxrun11, 0, 0, this);
                        }

                        if (Fox == 12) {
                            g.drawImage(this.foxrun12, 0, 0, this);
                        }

                        if (Fox == 13) {
                            g.drawImage(this.foxrun13, 0, 0, this);
                        }

                        if (Fox == 14) {
                            g.drawImage(this.foxrun14, 0, 0, this);
                        }

                        if (Fox == 15) {
                            g.drawImage(this.foxrun15, 0, 0, this);
                        }

                        if (Fox == 16) {
                            g.drawImage(this.foxrun16, 0, 0, this);
                        }

                        if (Fox == 17) {
                            g.drawImage(this.foxrun17, 0, 0, this);
                        }

                        if (Fox == 18) {
                            g.drawImage(this.foxrun18, 0, 0, this);
                        }

                        if (Fox == 19) {
                            g.drawImage(this.foxrun19, 0, 0, this);
                        }

                        if (Fox == 20) {
                            g.drawImage(this.foxrun20, 0, 0, this);
                        }

                        if (Fox == 21) {
                            g.drawImage(this.foxrun21, 0, 0, this);
                        }

                        if (Fox == 22) {
                            g.drawImage(this.foxrun22, 0, 0, this);
                        }

                        if (Fox == 23) {
                            g.drawImage(this.foxrun23, 0, 0, this);
                        }

                        if (Fox == 24) {
                            g.drawImage(this.foxrun24, 0, 0, this);
                        }

                        if (Fox == 25) {
                            g.drawImage(this.foxrun25, 0, 0, this);
                        }

                        if (Fox == 26) {
                            g.drawImage(this.foxrun26, 0, 0, this);
                        }

                        if (Fox == 27) {
                            g.drawImage(this.foxrun27, 0, 0, this);
                        }

                        if (Fox == 28) {
                            g.drawImage(this.foxrun28, 0, 0, this);
                        }

                        if (Fox == 29) {
                            g.drawImage(this.foxrun29, 0, 0, this);
                        }

                        if (Fox == 30) {
                            g.drawImage(this.foxrun30, 0, 0, this);
                        }

                        if (Fox == 31) {
                            g.drawImage(this.foxrun31, 0, 0, this);
                        }
                    }

                    g.drawImage(makeColorTransparent(this.westhall, Color.black), 800, 290, this);
                }

                g.drawImage(makeColorTransparent(this.cameraMinimap, Color.black), 825, 325, this);
                g.drawImage(this.blank, 923, 343, this);
                g.drawImage(this.blank, 904, 399, this);
                g.drawImage(this.blank, 877, 481, this);
                g.drawImage(this.blank, 926, 596, this);
                g.drawImage(this.blank, 926, 631, this);
                g.drawImage(this.blank, 850, 578, this);
                g.drawImage(this.blank, 1034, 596, this);
                g.drawImage(this.blank, 1034, 631, this);
                g.drawImage(this.blank, 796, 431, this);
                g.drawImage(this.blank, 1146, 436, this);
                g.drawImage(makeColorTransparent(this.A1, Color.black), 927, 347, this);
                g.drawImage(makeColorTransparent(this.B1, Color.black), 908, 403, this);
                g.drawImage(makeColorTransparent(this.C1, Color.black), 881, 485, this);
                g.drawImage(makeColorTransparent(this.A2, Color.black), 930, 600, this);
                g.drawImage(makeColorTransparent(this.B2, Color.black), 930, 635, this);
                g.drawImage(makeColorTransparent(this.Three, Color.black), 855, 582, this);
                g.drawImage(makeColorTransparent(this.A4, Color.black), 1038, 600, this);
                g.drawImage(makeColorTransparent(this.B4, Color.black), 1038, 635, this);
                g.drawImage(makeColorTransparent(this.Five, Color.black), 800, 435, this);
                g.drawImage(makeColorTransparent(this.Six, Color.black), 1150, 440, this);
            } else {
                if (Bonnie.playerdeath && !Office.monitorUp) {
                    needToMove = false;
                    if (bonnie == 1) {
                        scream.play();
                        g.drawImage(this.bonnie1, 0, 0, this);
                    }

                    if (bonnie == 2) {
                        g.drawImage(this.bonnie2, 0, 0, this);
                    }

                    if (bonnie == 3) {
                        g.drawImage(this.bonnie3, 0, 0, this);
                    }

                    if (bonnie == 4) {
                        g.drawImage(this.bonnie4, 0, 0, this);
                    }

                    if (bonnie == 5) {
                        g.drawImage(this.bonnie5, 0, 0, this);
                    }

                    if (bonnie == 6) {
                        g.drawImage(this.bonnie6, 0, 0, this);
                    }

                    if (bonnie == 7) {
                        g.drawImage(this.bonnie7, 0, 0, this);
                    }

                    if (bonnie == 8) {
                        g.drawImage(this.bonnie8, 0, 0, this);
                    }

                    if (bonnie == 9) {
                        g.drawImage(this.bonnie9, 0, 0, this);
                    }

                    if (bonnie == 10) {
                        g.drawImage(this.bonnie10, 0, 0, this);
                    }

                    if (bonnie == 11) {
                        g.drawImage(this.bonnie11, 0, 0, this);
                        scream.stop();
                    }
                } else if (Chicka.playerdeath && !Office.monitorUp) {
                    needToMove = false;
                    this.main1.stop();
                    this.ambiance1.stop();
                    if (chicka == 1) {
                        g.drawImage(this.chicka1, 0, 0, this);
                        scream.play();
                    }

                    if (chicka == 2) {
                        g.drawImage(this.chicka2, 0, 0, this);
                    }

                    if (chicka == 3) {
                        g.drawImage(this.chicka3, 0, 0, this);
                    }

                    if (chicka == 4) {
                        g.drawImage(this.chicka4, 0, 0, this);
                    }

                    if (chicka == 5) {
                        g.drawImage(this.chicka5, 0, 0, this);
                    }

                    if (chicka == 6) {
                        g.drawImage(this.chicka6, 0, 0, this);
                    }

                    if (chicka == 7) {
                        g.drawImage(this.chicka7, 0, 0, this);
                    }

                    if (chicka == 8) {
                        g.drawImage(this.chicka8, 0, 0, this);
                    }

                    if (chicka == 9) {
                        g.drawImage(this.chicka9, 0, 0, this);
                    }

                    if (chicka == 10) {
                        g.drawImage(this.chicka10, 0, 0, this);
                    }

                    if (chicka == 11) {
                        g.drawImage(this.chicka11, 0, 0, this);
                    }

                    if (chicka == 12) {
                        g.drawImage(this.chicka12, 0, 0, this);
                    }

                    if (chicka == 13) {
                        g.drawImage(this.chicka13, 0, 0, this);
                    }

                    if (chicka == 14) {
                        g.drawImage(this.chicka14, 0, 0, this);
                    }

                    if (chicka == 15) {
                        g.drawImage(this.chicka15, 0, 0, this);
                    }

                    if (chicka == 16) {
                        g.drawImage(this.chicka16, 0, 0, this);
                        scream.stop();
                    }
                } else if (Freddy.playerdeath && !Office.monitorUp) {
                    needToMove = false;
                    this.main1.stop();
                    this.ambiance1.stop();
                    if (freddie == 1) {
                        g.drawImage(this.freddy1, 0, 0, this);
                        scream.play();
                    }

                    if (freddie == 2) {
                        g.drawImage(this.freddy2, 0, 0, this);
                    }

                    if (freddie == 3) {
                        g.drawImage(this.freddy3, 0, 0, this);
                    }

                    if (freddie == 4) {
                        g.drawImage(this.freddy4, 0, 0, this);
                    }

                    if (freddie == 5) {
                        g.drawImage(this.freddy5, 0, 0, this);
                    }

                    if (freddie == 6) {
                        g.drawImage(this.freddy6, 0, 0, this);
                    }

                    if (freddie == 7) {
                        g.drawImage(this.freddy7, 0, 0, this);
                    }

                    if (freddie == 8) {
                        g.drawImage(this.freddy8, 0, 0, this);
                    }

                    if (freddie == 9) {
                        g.drawImage(this.freddy9, 0, 0, this);
                    }

                    if (freddie == 10) {
                        g.drawImage(this.freddy10, 0, 0, this);
                    }

                    if (freddie == 11) {
                        g.drawImage(this.freddy11, 0, 0, this);
                    }

                    if (freddie == 12) {
                        g.drawImage(this.freddy12, 0, 0, this);
                    }

                    if (freddie == 13) {
                        g.drawImage(this.freddy13, 0, 0, this);
                    }

                    if (freddie == 14) {
                        g.drawImage(this.freddy14, 0, 0, this);
                    }

                    if (freddie == 15) {
                        g.drawImage(this.freddy15, 0, 0, this);
                    }

                    if (freddie == 16) {
                        g.drawImage(this.freddy16, 0, 0, this);
                    }

                    if (freddie == 17) {
                        g.drawImage(this.freddy17, 0, 0, this);
                    }

                    if (freddie == 18) {
                        g.drawImage(this.freddy18, 0, 0, this);
                    }

                    if (freddie == 19) {
                        g.drawImage(this.freddy19, 0, 0, this);
                    }

                    if (freddie == 20) {
                        g.drawImage(this.freddy20, 0, 0, this);
                    }

                    if (freddie == 21) {
                        g.drawImage(this.freddy21, 0, 0, this);
                    }

                    if (freddie == 22) {
                        g.drawImage(this.freddy22, 0, 0, this);
                    }

                    if (freddie == 23) {
                        g.drawImage(this.freddy23, 0, 0, this);
                    }

                    if (freddie == 24) {
                        g.drawImage(this.freddy24, 0, 0, this);
                    }

                    if (freddie == 25) {
                        g.drawImage(this.freddy25, 0, 0, this);
                    }

                    if (freddie == 26) {
                        g.drawImage(this.freddy26, 0, 0, this);
                    }

                    if (freddie == 27) {
                        g.drawImage(this.freddy27, 0, 0, this);
                    }

                    if (freddie == 28) {
                        g.drawImage(this.freddy28, 0, 0, this);
                        scream.stop();
                    }
                } else if (Foxy.playerDeath && Office.door1open) {
                    needToMove = false;
                    this.main1.stop();
                    this.ambiance1.stop();
                    if (foxdie == 1) {
                        scream.play();
                        g.drawImage(this.foxy1, 0, 0, this);
                    }

                    if (foxdie == 2) {
                        g.drawImage(this.foxy2, 0, 0, this);
                    }

                    if (foxdie == 3) {
                        g.drawImage(this.foxy3, 0, 0, this);
                    }

                    if (foxdie == 4) {
                        g.drawImage(this.foxy4, 0, 0, this);
                    }

                    if (foxdie == 5) {
                        g.drawImage(this.foxy5, 0, 0, this);
                    }

                    if (foxdie == 6) {
                        g.drawImage(this.foxy6, 0, 0, this);
                    }

                    if (foxdie == 7) {
                        g.drawImage(this.foxy7, 0, 0, this);
                    }

                    if (foxdie == 8) {
                        g.drawImage(this.foxy8, 0, 0, this);
                    }

                    if (foxdie == 9) {
                        g.drawImage(this.foxy9, 0, 0, this);
                    }

                    if (foxdie == 10) {
                        g.drawImage(this.foxy10, 0, 0, this);
                    }

                    if (foxdie == 11) {
                        g.drawImage(this.foxy11, 0, 0, this);
                    }

                    if (foxdie == 12) {
                        g.drawImage(this.foxy12, 0, 0, this);
                    }

                    if (foxdie == 13) {
                        g.drawImage(this.foxy13, 0, 0, this);
                    }

                    if (foxdie == 14) {
                        g.drawImage(this.foxy14, 0, 0, this);
                    }

                    if (foxdie == 15) {
                        g.drawImage(this.foxy15, 0, 0, this);
                    }

                    if (foxdie == 16) {
                        g.drawImage(this.foxy16, 0, 0, this);
                    }

                    if (foxdie == 17) {
                        g.drawImage(this.foxy17, 0, 0, this);
                    }

                    if (foxdie == 18) {
                        g.drawImage(this.foxy18, 0, 0, this);
                    }

                    if (foxdie == 19) {
                        g.drawImage(this.foxy19, 0, 0, this);
                        scream.stop();
                    }
                } else if (Office.light1on && Bonnie.isInRoom() == 8) {
                    g.drawImage(this.officeBonnie, officeView, 0, this);
                    g.drawImage(makeColorTransparent(this.leftLight, Color.black), officeView, 250, this);
                    g.drawImage(makeColorTransparent(this.rightNone, Color.black), officeView + 1490, 250, this);
                } else if (Office.light1on && Bonnie.isInRoom() != 8) {
                    g.drawImage(this.officeLeftLight, officeView, 0, this);
                    g.drawImage(makeColorTransparent(this.leftLight, Color.black), officeView, 250, this);
                    g.drawImage(makeColorTransparent(this.rightNone, Color.black), officeView + 1490, 250, this);
                } else if (Office.light2on && Chicka.isInRoom() == 8) {
                    g.drawImage(this.officeChicka, officeView, 0, this);
                    g.drawImage(makeColorTransparent(this.leftNone, Color.black), officeView, 250, this);
                    g.drawImage(makeColorTransparent(this.rightLight, Color.black), officeView + 1490, 250, this);
                } else if (Office.light2on && Chicka.isInRoom() != 8) {
                    g.drawImage(this.officeRightLight, officeView, 0, this);
                    g.drawImage(makeColorTransparent(this.leftNone, Color.black), officeView, 250, this);
                    g.drawImage(makeColorTransparent(this.rightLight, Color.black), officeView + 1490, 250, this);
                } else {
                    g.drawImage(this.office, officeView, 0, this);
                    g.drawImage(makeColorTransparent(this.leftNone, Color.black), officeView, 250, this);
                    g.drawImage(makeColorTransparent(this.rightNone, Color.black), officeView + 1490, 250, this);
                }

                if (!Office.door1open) {
                    g.drawImage(makeColorTransparent(this.leftdoor13, Color.white), officeView + 80, 0, this);
                }

                if (!Office.door2open) {
                    g.drawImage(makeColorTransparent(this.rightdoor13, Color.white), officeView + 1270, 0, this);
                }
            }

            if (needStatic) {
                if (Static == 1) {
                    g.drawImage(this.static1, 0, 0, this);
                }

                if (Static == 2) {
                    g.drawImage(this.static2, 0, 0, this);
                }

                if (Static == 3) {
                    g.drawImage(this.static3, 0, 0, this);
                }

                if (Static == 4) {
                    g.drawImage(this.static4, 0, 0, this);
                }

                if (Static == 5) {
                    g.drawImage(this.static5, 0, 0, this);
                }

                if (Static == 6) {
                    g.drawImage(this.static6, 0, 0, this);
                }

                if (Static == 7) {
                    g.drawImage(this.static7, 0, 0, this);
                }

                if (Static == 8) {
                    g.drawImage(this.static8, 0, 0, this);
                }
            }

            if (Office.getPower() <= 0.0) {
                needToMove = false;
                if (powerOut == 1) {
                    g.drawImage(this.powerout1, 0, 0, this);
                }

                if (powerOut == 2) {
                    g.drawImage(this.powerout2, 0, 0, this);
                }

                if (powerOut == 3) {
                    g.drawImage(this.powerout3, 0, 0, this);
                }

                if (powerOut == 4) {
                    g.drawImage(this.powerout4, 0, 0, this);
                }

                if (powerOut == 5) {
                    g.drawImage(this.powerout5, 0, 0, this);
                }

                if (powerOut == 6) {
                    g.drawImage(this.powerout6, 0, 0, this);
                }

                if (powerOut == 7) {
                    g.drawImage(this.powerout7, 0, 0, this);
                }

                if (powerOut == 8) {
                    g.drawImage(this.powerout8, 0, 0, this);
                }

                if (powerOut == 9) {
                    g.drawImage(this.powerout9, 0, 0, this);
                }

                if (powerOut == 10) {
                    g.drawImage(this.powerout10, 0, 0, this);
                }

                if (powerOut == 11) {
                    g.drawImage(this.powerout11, 0, 0, this);
                }

                if (powerOut == 12) {
                    g.drawImage(this.powerout12, 0, 0, this);
                }

                if (powerOut == 13) {
                    g.drawImage(this.powerout13, 0, 0, this);
                }

                if (powerOut == 14) {
                    g.drawImage(this.powerout14, 0, 0, this);
                }

                if (powerOut == 15) {
                    g.drawImage(this.powerout15, 0, 0, this);
                }

                if (powerOut == 16) {
                    g.drawImage(this.powerout16, 0, 0, this);
                }

                if (powerOut == 17) {
                    g.drawImage(this.powerout17, 0, 0, this);
                }

                if (powerOut == 18) {
                    g.drawImage(this.powerout18, 0, 0, this);
                }

                if (powerOut == 19) {
                    g.drawImage(this.powerout19, 0, 0, this);
                }

                if (powerOut == 20) {
                    g.drawImage(this.powerout20, 0, 0, this);
                }

                Main.death = true;
            }

            g.drawImage(makeColorTransparent(makeColorTransparent(this.cameraBar, Color.black), Color.GRAY), 262, 660, this);
            Office.getUsage();
            if (Office.getUsage() == 1) {
                g.drawImage(makeColorTransparent(this.use1, Color.black), 90, 672, this);
            }

            if (Office.getUsage() == 2) {
                g.drawImage(makeColorTransparent(this.use2, Color.black), 90, 672, this);
            }

            if (Office.getUsage() == 3) {
                g.drawImage(makeColorTransparent(this.use3, Color.black), 90, 672, this);
            }

            if (Office.getUsage() == 4) {
                g.drawImage(makeColorTransparent(this.use4, Color.black), 90, 672, this);
            }

            if (Office.getUsage() == 5) {
                g.drawImage(makeColorTransparent(this.use5, Color.black), 90, 672, this);
            }

            g.drawImage(makeColorTransparent(this.use, Color.black), 10, 680, this);
            g.drawImage(makeColorTransparent(this.powerleft, Color.black), 10, 650, this);
            g.drawImage(makeColorTransparent(this.percentsign, Color.black), 215, 650, this);
            if (Office.powerRemaining <= 100.0 && Office.powerRemaining > 90.0) {
                g.drawImage(makeColorTransparent(this.onehundred, Color.black), 157, 646, this);
            }

            if (Office.powerRemaining <= 90.0 && Office.powerRemaining > 80.0) {
                g.drawImage(makeColorTransparent(this.ninety, Color.black), 160, 646, this);
            }

            if (Office.powerRemaining <= 80.0 && Office.powerRemaining > 70.0) {
                g.drawImage(makeColorTransparent(this.eighty, Color.black), 160, 646, this);
            }

            if (Office.powerRemaining <= 70.0 && Office.powerRemaining > 60.0) {
                g.drawImage(makeColorTransparent(this.seventy, Color.black), 160, 646, this);
            }

            if (Office.powerRemaining <= 60.0 && Office.powerRemaining > 50.0) {
                g.drawImage(makeColorTransparent(this.sixty, Color.black), 160, 646, this);
            }

            if (Office.powerRemaining <= 50.0 && Office.powerRemaining > 40.0) {
                g.drawImage(makeColorTransparent(this.fifty, Color.black), 160, 646, this);
            }

            if (Office.powerRemaining <= 40.0 && Office.powerRemaining > 30.0) {
                g.drawImage(makeColorTransparent(this.forty, Color.black), 160, 646, this);
            }

            if (Office.powerRemaining <= 30.0 && Office.powerRemaining > 20.0) {
                g.drawImage(makeColorTransparent(this.thirty, Color.black), 160, 646, this);
            }

            if (Office.powerRemaining <= 20.0 && Office.powerRemaining > 10.0) {
                g.drawImage(makeColorTransparent(this.twenty, Color.black), 160, 646, this);
            }

            if (Office.powerRemaining <= 10.0 && Office.powerRemaining > 0.0) {
                g.drawImage(makeColorTransparent(this.ten, Color.black), 160, 646, this);
            }

            if (Office.powerRemaining == 0.0) {
                g.drawImage(makeColorTransparent(this.zero, Color.black), 160, 646, this);
            }

            if (Main.deather) {
                g.drawImage(this.lose, 0, 0, this);
            }

            if (Main.gameWin) {
                g.drawImage(this.win, 0, 0, this);
            }
        }

        this.repaint();
    }

    public double height(double height) {
        if (height > 720.0) {
            height = 720.0;
        }

        return height;
    }

    public double width(double width) {
        if (width > 1280.0) {
            width = 1280.0;
        }

        return width;
    }

    public static Image makeColorTransparent(Image image2, Color color) {
        ImageFilter filter = new Window$1(color);
        ImageProducer ip = new FilteredImageSource(image2.getSource(), filter);
        return Toolkit.getDefaultToolkit().createImage(ip);
    }
}

