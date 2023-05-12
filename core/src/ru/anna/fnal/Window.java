package ru.anna.fnal;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.FrameBuffer;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import org.w3c.dom.Text;

import javax.imageio.ImageIO;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.image.RGBImageFilter;
import java.io.*;
import java.net.URL;

import sun.print.PathGraphics;

public class Window extends ApplicationAdapter {

    private Texture ninety;
    private boolean ifLoading;
    private OrthographicCamera camera;
    private SpriteBatch batch;
    private boolean startGame = false;
    private boolean mainMenuMusicPlaying;
    private boolean needToMove = true;
    private Texture mainMenu1;
    private Texture mainMenu2;
    private Texture mainMenu3;
    private Sound ambiance1;
    private Sound ambiance2;
    private Sound ambiance3;
    private Sound main1;
    private Sound main2;
    static Sound knock;
    Sound run;
    static Sound scream;
    static Sound door;
    static Sound light;
    static Sound blip;
    private SpriteBatch spriteBatch;
    private FrameBuffer frameBuffer;
    private Texture frameBufferTexture;
    private Sprite frameBufferSprite;
    public static boolean needStatic = false;
    public static Dimension screenSize = Toolkit.getDefaultToolkit()
            .getScreenSize();
    public static double Width = screenSize.getWidth();
    public static double Height = screenSize.getHeight();
    public static int cameraPosition;
    public static int Static = 1;
    public static boolean startClicked = false;
    public static String cameraLocation = "Show Stage";
    public static boolean ifloading = true;
    public static int officeView = -100;
    private Image Image;
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
    Texture stage;
    Texture currentView;
    Texture bonnie1;
    Texture bonnie2;
    Texture bonnie3;
    Texture bonnie4;
    Texture bonnie5;
    Texture bonnie6;
    Texture bonnie7;
    Texture bonnie8;
    Texture bonnie9;
    Texture bonnie10;
    Texture bonnie11;
    Texture chicka1;
    Texture chicka2;
    Texture chicka3;
    Texture chicka4;
    Texture chicka5;
    Texture chicka6;
    Texture chicka7;
    Texture chicka8;
    Texture chicka9;
    Texture chicka10;
    Texture chicka11;
    Texture chicka12;
    Texture chicka13;
    Texture chicka14;
    Texture chicka15;
    Texture chicka16;
    Texture foxy1;
    Texture foxy2;
    Texture foxy3;
    Texture foxy4;
    Texture foxy5;
    Texture foxy6;
    Texture foxy7;
    Texture foxy8;
    Texture foxy9;
    Texture foxy10;
    Texture foxy11;
    Texture foxy12;
    Texture foxy13;
    Texture foxy14;
    Texture foxy15;
    Texture foxy16;
    Texture foxy17;
    Texture foxy18;
    Texture foxy19;
    Texture freddy1;
    Texture freddy2;
    Texture freddy3;
    Texture freddy4;
    Texture freddy5;
    Texture freddy6;
    Texture freddy7;
    Texture freddy8;
    Texture freddy9;
    Texture freddy10;
    Texture freddy11;
    Texture freddy12;
    Texture freddy13;
    Texture freddy14;
    Texture freddy15;
    Texture freddy16;
    Texture freddy17;
    Texture freddy18;
    Texture freddy19;
    Texture freddy20;
    Texture freddy21;
    Texture freddy22;
    Texture freddy23;
    Texture freddy24;
    Texture freddy25;
    Texture freddy26;
    Texture freddy27;
    Texture freddy28;
    Texture freddy29;
    Texture powerout1;
    Texture powerout2;
    Texture powerout3;
    Texture powerout4;
    Texture powerout5;
    Texture powerout6;
    Texture powerout7;
    Texture powerout8;
    Texture powerout9;
    Texture powerout10;
    Texture powerout11;
    Texture powerout12;
    Texture powerout13;
    Texture powerout14;
    Texture powerout15;
    Texture powerout16;
    Texture powerout17;
    Texture powerout18;
    Texture powerout19;
    Texture powerout20;
    Texture powerout21;
    Texture foxrun1;
    Texture foxrun2;
    Texture foxrun3;
    Texture foxrun4;
    Texture foxrun5;
    Texture foxrun6;
    Texture foxrun7;
    Texture foxrun8;
    Texture foxrun9;
    Texture foxrun10;
    Texture foxrun11;
    Texture foxrun12;
    Texture foxrun13;
    Texture foxrun14;
    Texture foxrun15;
    Texture foxrun16;
    Texture foxrun17;
    Texture foxrun18;
    Texture foxrun19;
    Texture foxrun20;
    Texture foxrun21;
    Texture foxrun22;
    Texture foxrun23;
    Texture foxrun24;
    Texture foxrun25;
    Texture foxrun26;
    Texture foxrun27;
    Texture foxrun28;
    Texture foxrun29;
    Texture foxrun30;
    Texture foxrun31;
    Texture static1;
    Texture static2;
    Texture static3;
    Texture static4;
    Texture static5;
    Texture static6;
    Texture static7;
    Texture static8;
    Texture mainMenu;
    Texture mainMenu4;
    Texture stageNoBonnie;
    Texture stageNoChicka;
    Texture stageNoBonnieChicka;
    Texture stageFreddyStare;
    Texture stageNone;
    Texture diningNone;
    Texture diningBonnieFar;
    Texture diningBonnieClose;
    Texture diningChickaFar;
    Texture diningChickaClose;
    Texture diningFreddy;
    Texture eastHallAChickaFar;
    Texture eastHallAChickaClose;
    Texture eastHallAFreddy;
    Texture eastHallANone;
    Texture eastHallBNone;
    Texture eastHallBChicka;
    Texture eastHallBFreddy;
    Texture backstageNone;
    Texture backstageFar;
    Texture backstageClose;
    Texture piratecoveStage0;
    Texture piratecoveStage1;
    Texture piratecoveStage2;
    Texture piratecoveStage3;
    Texture restroomsNone;
    Texture restroomsChickaClose;
    Texture restroomsChickaFar;
    Texture restroomsFreddy;
    Texture westHallANone;
    Texture westHallABonnie;
    Texture westHallBNone;
    Texture westHallBBonnie;
    Texture supplyclosetNone;
    Texture supplyclosetBonnie;
    Texture fiveNightsLogo;
    Texture newGameLogo;
    Texture arrows;
    Texture office;
    Texture officeLeftLight;
    Texture officeRightLight;
    Texture officeBonnie;
    Texture officeChicka;
    Texture officePowerOut;
    Texture officePowerOutFreddy;
    Texture name;
    Texture cameraBar;
    Texture loading;
    Texture newspaper;
    Texture leftNone;
    Texture leftLight;
    Texture leftDoor;
    Texture leftBoth;
    Texture rightNone;
    Texture rightLight;
    Texture rightDoor;
    Texture rightBoth;
    Texture cameraMinimap;
    Texture A1;
    Texture B1;
    Texture C1;
    Texture A2;
    Texture B2;
    Texture Three;
    Texture A4;
    Texture B4;
    Texture Five;
    Texture Six;
    Texture blank;
    Texture supplycloset;
    Texture showstage;
    Texture piratecove;
    Texture backstage;
    Texture diningarea;
    Texture westhall;
    Texture ehallcorner;
    Texture whallcorner;
    Texture restrooms;
    Texture easthall;
    Texture use1;
    Texture use2;
    Texture use3;
    Texture use4;
    Texture use5;
    Texture use;
    Texture powerleft;
    Texture percentsign;
    Texture leftdoor1;
    Texture leftdoor2;
    Texture leftdoor3;
    Texture leftdoor4;
    Texture leftdoor5;
    Texture leftdoor6;
    Texture leftdoor7;
    Texture leftdoor8;
    Texture leftdoor9;
    Texture leftdoor10;
    Texture leftdoor11;
    Texture leftdoor12;
    Texture leftdoor13;
    Texture rightdoor1;
    Texture rightdoor2;
    Texture rightdoor3;
    Texture rightdoor4;
    Texture rightdoor5;
    Texture rightdoor6;
    Texture rightdoor7;
    Texture rightdoor8;
    Texture rightdoor9;
    Texture rightdoor10;
    Texture rightdoor11;
    Texture rightdoor12;
    Texture rightdoor13;
    Texture onehundred;
    Texture eighty;
    Texture seventy;
    Texture sixty;
    Texture fifty;
    Texture forty;
    Texture thirty;
    Texture twenty;
    Texture ten;
    Texture zero;
    Texture lose;
    Texture win;

    @Override
    public void create() {
        knock = Gdx.audio.newSound(Gdx.files.internal("assets/FoxyKnock.wav"));
        run = Gdx.audio.newSound(Gdx.files.internal("assets/FoxyRun.wav"));
        scream = Gdx.audio.newSound(Gdx.files.internal("assets/XSCREAM.wav"));
        ambiance1 = Gdx.audio.newSound(Gdx.files.internal("assets/Ambiance1.wav"));
        ambiance2 = Gdx.audio.newSound(Gdx.files.internal("assets/Ambience2.wav"));
        door = Gdx.audio.newSound(Gdx.files.internal("assets/Door.wav"));
        light = Gdx.audio.newSound(Gdx.files.internal("assets/Ambiance3.wav"));
        main1 = Gdx.audio.newSound(Gdx.files.internal("assets/Mainmenu1.wav"));
        main2 = Gdx.audio.newSound(Gdx.files.internal("assets/Mainmenu2.wav"));
        blip = Gdx.audio.newSound(Gdx.files.internal("assets/blip.wav"));
        spriteBatch = new SpriteBatch();
        frameBuffer = new FrameBuffer(Pixmap.Format.RGBA8888, Gdx.graphics.getWidth(), Gdx.graphics.getHeight(), false);
        frameBufferTexture = frameBuffer.getColorBufferTexture();
        frameBufferSprite = new Sprite(frameBufferTexture);

    }

    public void playSound(Sound sound) {
        sound.play();
    }
    public Window() {
        Gdx.graphics.setTitle("Five Nights at Freddy's");
        Gdx.graphics.setWindowedMode((int) width(Width), (int) height(Height));
        Gdx.graphics.setResizable(false);
        try {
            loading = new Texture(Gdx.files.internal("assets/jump.jpg"));
            lose = new Texture(Gdx.files.internal("assets/Lose.png"));
            win = new Texture(Gdx.files.internal("assets/StandardWin.png"));
            zero = new Texture(Gdx.files.internal("assets/zero.png"));
            ten = new Texture(Gdx.files.internal("assets/ten.png"));
            twenty = new Texture(Gdx.files.internal("assets/twenty.png"));
            thirty = new Texture(Gdx.files.internal("assets/thirty.png"));
            forty = new Texture(Gdx.files.internal("assets/forty.png"));
            fifty = new Texture(Gdx.files.internal("assets/fifty.png"));
            sixty = new Texture(Gdx.files.internal("assets/sixty.png"));
            seventy = new Texture(Gdx.files.internal("assets/seventy.png"));
            eighty = new Texture(Gdx.files.internal("assets/eighty.png"));
            ninety = new Texture(Gdx.files.internal("assets/ninety.png"));
            onehundred = new Texture(Gdx.files.internal("assets/onehundred.png"));
            supplycloset = new Texture(Gdx.files.internal("assets/50.png"));
            showstage = new Texture(Gdx.files.internal("assets/54.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            loading = new Texture(Gdx.files.internal("assets/jump.jpg"));
            lose = new Texture(Gdx.files.internal("assets/Lose.png"));
            win = new Texture(Gdx.files.internal("assets/StandardWin.png"));
            zero = new Texture(Gdx.files.internal("assets/zero.png"));
            ten = new Texture(Gdx.files.internal("assets/ten.png"));
            twenty = new Texture(Gdx.files.internal("assets/twenty.png"));
            thirty = new Texture(Gdx.files.internal("assets/thirty.png"));
            forty = new Texture(Gdx.files.internal("assets/forty.png"));
            fifty = new Texture(Gdx.files.internal("assets/fifty.png"));
            sixty = new Texture(Gdx.files.internal("assets/sixty.png"));
            seventy = new Texture(Gdx.files.internal("assets/seventy.png"));
            eighty = new Texture(Gdx.files.internal("assets/eighty.png"));
            ninety = new Texture(Gdx.files.internal("assets/ninety.png"));
            onehundred = new Texture(Gdx.files.internal("assets/onehundred.png"));
            supplycloset = new Texture(Gdx.files.internal("assets/50.png"));
            showstage = new Texture(Gdx.files.internal("assets/54.png"));
            piratecove = new Texture(Gdx.files.internal("assets/70.png"));
            backstage = new Texture(Gdx.files.internal("assets/71.png"));
            diningarea = new Texture(Gdx.files.internal("assets/72.png"));
            westhall = new Texture(Gdx.files.internal("assets/74.png"));
            ehallcorner = new Texture(Gdx.files.internal("assets/75.png"));
            whallcorner = new Texture(Gdx.files.internal("assets/76.png"));
            restrooms = new Texture(Gdx.files.internal("assets/77.png"));
            easthall = new Texture(Gdx.files.internal("assets/79.png"));
            blank = new Texture(Gdx.files.internal("assets/blank.png"));
            leftdoor1 = new Texture(Gdx.files.internal("assets/89.png"));
            leftdoor2 = new Texture(Gdx.files.internal("assets/91.png"));
            leftdoor3 = new Texture(Gdx.files.internal("assets/92.png"));
            leftdoor4 = new Texture(Gdx.files.internal("assets/93.png"));
            leftdoor5 = new Texture(Gdx.files.internal("assets/94.png"));
            leftdoor6 = new Texture(Gdx.files.internal("assets/95.png"));
            leftdoor7 = new Texture(Gdx.files.internal("assets/96.png"));
            leftdoor8 = new Texture(Gdx.files.internal("assets/97.png"));
            leftdoor9 = new Texture(Gdx.files.internal("assets/98.png"));
            leftdoor10 = new Texture(Gdx.files.internal("assets/99.png"));
            leftdoor11 = new Texture(Gdx.files.internal("assets/100.png"));
            leftdoor12 = new Texture(Gdx.files.internal("assets/101.png"));
            leftdoor13 = new Texture(Gdx.files.internal("assets/102.png"));
            rightdoor1 = new Texture(Gdx.files.internal("assets/106.png"));
            rightdoor2 = new Texture(Gdx.files.internal("assets/107.png"));
            rightdoor3 = new Texture(Gdx.files.internal("assets/108.png"));
            rightdoor4 = new Texture(Gdx.files.internal("assets/109.png"));
            rightdoor5 = new Texture(Gdx.files.internal("assets/110.png"));
            rightdoor6 = new Texture(Gdx.files.internal("assets/111.png"));
            rightdoor7 = new Texture(Gdx.files.internal("assets/112.png"));
            rightdoor8 = new Texture(Gdx.files.internal("assets/113.png"));
            rightdoor9 = new Texture(Gdx.files.internal("assets/114.png"));
            rightdoor10 = new Texture(Gdx.files.internal("assets/115.png"));
            rightdoor11 = new Texture(Gdx.files.internal("assets/116.png"));
            rightdoor12 = new Texture(Gdx.files.internal("assets/117.png"));
            rightdoor13 = new Texture(Gdx.files.internal("assets/118.png"));
            A1 = new Texture(Gdx.files.internal("assets/170.png"));
            B1 = new Texture(Gdx.files.internal("assets/171.png"));
            C1 = new Texture(Gdx.files.internal("assets/177.png"));
            A2 = new Texture(Gdx.files.internal("assets/172.png"));
            B2 = new Texture(Gdx.files.internal("assets/165.png"));
            Three = new Texture(Gdx.files.internal("assets/168.png"));
            A4 = new Texture(Gdx.files.internal("assets/169.png"));
            B4 = new Texture(Gdx.files.internal("assets/173.png"));
            Five = new Texture(Gdx.files.internal("assets/174.png"));
            Six = new Texture(Gdx.files.internal("assets/175.png"));
            fiveNightsLogo = new Texture(Gdx.files.internal("assets/444.png"));
            newGameLogo = new Texture(Gdx.files.internal("assets/448.png"));
            arrows = new Texture(Gdx.files.internal("assets/450.png"));
            mainMenu = new Texture(Gdx.files.internal("assets/431.png"));
            name = new Texture(Gdx.files.internal("assets/433.png"));
            mainMenu2 = new Texture(Gdx.files.internal("assets/440.png"));
            mainMenu3 = new Texture(Gdx.files.internal("assets/441.png"));
            mainMenu4 = new Texture(Gdx.files.internal("assets/539.png"));
            newspaper = new Texture(Gdx.files.internal("assets/539.png"));
            office = new Texture(Gdx.files.internal("assets/39.png"));
            cameraMinimap = new Texture(Gdx.files.internal("assets/145.png"));
            leftNone = new Texture(Gdx.files.internal("assets/122.png"));
            leftLight = new Texture(Gdx.files.internal("assets/125.png"));
            leftDoor = new Texture(Gdx.files.internal("assets/124.png"));
            leftBoth = new Texture(Gdx.files.internal("assets/130.png"));
            rightNone = new Texture(Gdx.files.internal("assets/134.png"));
            rightDoor = new Texture(Gdx.files.internal("assets/135.png"));
            rightLight = new Texture(Gdx.files.internal("assets/131.png"));
            rightBoth = new Texture(Gdx.files.internal("assets/47.png"));
            officeLeftLight = new Texture(Gdx.files.internal("assets/58.png"));
            officeRightLight = new Texture(Gdx.files.internal("assets/127.png"));
            officeBonnie = new Texture(Gdx.files.internal("assets/225.png"));
            officeChicka = new Texture(Gdx.files.internal("assets/227.png"));
            officePowerOut = new Texture(Gdx.files.internal("assets/304.png"));
            officePowerOutFreddy = new Texture(Gdx.files.internal("assets/305.png"));
            stage = new Texture(Gdx.files.internal("assets/19.png"));
            stageNoBonnie = new Texture(Gdx.files.internal("assets/68.png"));
            stageNoChicka = new Texture(Gdx.files.internal("assets/223.png"));
            stageNoBonnieChicka = new Texture(Gdx.files.internal("assets/224.png"));
            stageFreddyStare = new Texture(Gdx.files.internal("assets/355.png"));
            stageNone = new Texture(Gdx.files.internal("assets/484.png"));
            diningNone = new Texture(Gdx.files.internal("assets/48.png"));
            diningBonnieFar = new Texture(Gdx.files.internal("assets/90.png"));
            diningBonnieClose = new Texture(Gdx.files.internal("assets/120.png"));
            diningChickaFar = new Texture(Gdx.files.internal("assets/215.png"));
            diningChickaClose = new Texture(Gdx.files.internal("assets/222.png"));
            diningFreddy = new Texture(Gdx.files.internal("assets/492.png"));
            eastHallANone = new Texture(Gdx.files.internal("assets/67.png"));
            eastHallAChickaFar = new Texture(Gdx.files.internal("assets/221.png"));
            eastHallAChickaClose = new Texture(Gdx.files.internal("assets/226.png"));
            eastHallAFreddy = new Texture(Gdx.files.internal("assets/487.png"));
            eastHallBNone = new Texture(Gdx.files.internal("assets/49.png"));
            eastHallBChicka = new Texture(Gdx.files.internal("assets/220.png"));
            eastHallBFreddy = new Texture(Gdx.files.internal("assets/486.png"));
            backstageNone = new Texture(Gdx.files.internal("assets/83.png"));
            backstageFar = new Texture(Gdx.files.internal("assets/205.png"));
            backstageClose = new Texture(Gdx.files.internal("assets/555.png"));
            piratecoveStage0 = new Texture(Gdx.files.internal("assets/66.png"));
            piratecoveStage1 = new Texture(Gdx.files.internal("assets/211.png"));
            piratecoveStage2 = new Texture(Gdx.files.internal("assets/338.png"));
            piratecoveStage3 = new Texture(Gdx.files.internal("assets/553.png"));
            restroomsNone = new Texture(Gdx.files.internal("assets/41.png"));
            restroomsChickaFar = new Texture(Gdx.files.internal("assets/217.png"));
            restroomsChickaClose = new Texture(Gdx.files.internal("assets/219.png"));
            restroomsFreddy = new Texture(Gdx.files.internal("assets/494.png"));
            westHallANone = new Texture(Gdx.files.internal("assets/44.png"));
            westHallABonnie = new Texture(Gdx.files.internal("assets/206.png"));
            westHallBNone = new Texture(Gdx.files.internal("assets/0.png"));
            westHallBBonnie = new Texture(Gdx.files.internal("assets/188.png"));
            supplyclosetNone = new Texture(Gdx.files.internal("assets/62.png"));
            supplyclosetBonnie = new Texture(Gdx.files.internal("assets/190.png"));
            static1 = new Texture(Gdx.files.internal("assets/12.png"));
            static2 = new Texture(Gdx.files.internal("assets/13.png"));
            static3 = new Texture(Gdx.files.internal("assets/14.png"));
            static4 = new Texture(Gdx.files.internal("assets/15.png"));
            static5 = new Texture(Gdx.files.internal("assets/16.png"));
            static6 = new Texture(Gdx.files.internal("assets/17.png"));
            static7 = new Texture(Gdx.files.internal("assets/18.png"));
            static8 = new Texture(Gdx.files.internal("assets/20.png"));
            use1 = new Texture(Gdx.files.internal("assets/212.png"));
            use2 = new Texture(Gdx.files.internal("assets/213.png"));
            use3 = new Texture(Gdx.files.internal("assets/214.png"));
            use4 = new Texture(Gdx.files.internal("assets/456.png"));
            use5 = new Texture(Gdx.files.internal("assets/455.png"));
            use = new Texture(Gdx.files.internal("assets/189.png"));
            powerleft = new Texture(Gdx.files.internal("assets/207.png"));
            percentsign = new Texture(Gdx.files.internal("assets/208.png"));
            cameraBar = new Texture(Gdx.files.internal("assets/420.png"));
            foxrun1 = new Texture(Gdx.files.internal("assets/244.png"));
            foxrun2 = new Texture(Gdx.files.internal("assets/245.png"));
            foxrun3 = new Texture(Gdx.files.internal("assets/246.png"));
            foxrun4 = new Texture(Gdx.files.internal("assets/247.png"));
            foxrun5 = new Texture(Gdx.files.internal("assets/248.png"));
            foxrun6 = new Texture(Gdx.files.internal("assets/250.png"));
            foxrun7 = new Texture(Gdx.files.internal("assets/280.png"));
            foxrun8 = new Texture(Gdx.files.internal("assets/282.png"));
            foxrun9 = new Texture(Gdx.files.internal("assets/283.png"));
            foxrun10 = new Texture(Gdx.files.internal("assets/284.png"));
            foxrun11 = new Texture(Gdx.files.internal("assets/285.png"));
            foxrun12 = new Texture(Gdx.files.internal("assets/286.png"));
            foxrun13 = new Texture(Gdx.files.internal("assets/287.png"));
            foxrun14 = new Texture(Gdx.files.internal("assets/288.png"));
            foxrun15 = new Texture(Gdx.files.internal("assets/289.png"));
            foxrun16 = new Texture(Gdx.files.internal("assets/290.png"));
            foxrun17 = new Texture(Gdx.files.internal("assets/292.png"));
            foxrun18 = new Texture(Gdx.files.internal("assets/302.png"));
            foxrun19 = new Texture(Gdx.files.internal("assets/306.png"));
            foxrun20 = new Texture(Gdx.files.internal("assets/327.png"));
            foxrun21 = new Texture(Gdx.files.internal("assets/329.png"));
            foxrun22 = new Texture(Gdx.files.internal("assets/330.png"));
            foxrun23 = new Texture(Gdx.files.internal("assets/331.png"));
            foxrun24 = new Texture(Gdx.files.internal("assets/332.png"));
            foxrun25 = new Texture(Gdx.files.internal("assets/333.png"));
            foxrun26 = new Texture(Gdx.files.internal("assets/334.png"));
            foxrun27 = new Texture(Gdx.files.internal("assets/335.png"));
            foxrun28 = new Texture(Gdx.files.internal("assets/336.png"));
            foxrun29 = new Texture(Gdx.files.internal("assets/337.png"));
            foxrun30 = new Texture(Gdx.files.internal("assets/339-241.png"));
            foxrun31 = new Texture(Gdx.files.internal("assets/340.png"));
            powerout1 = new Texture(Gdx.files.internal("assets/326.png"));
            powerout2 = new Texture(Gdx.files.internal("assets/307.png"));
            powerout3 = new Texture(Gdx.files.internal("assets/348.png"));
            powerout4 = new Texture(Gdx.files.internal("assets/308.png"));
            powerout5 = new Texture(Gdx.files.internal("assets/309.png"));
            powerout5 = new Texture(Gdx.files.internal("assets/310.png"));
            powerout6 = new Texture(Gdx.files.internal("assets/311.png"));
            powerout7 = new Texture(Gdx.files.internal("assets/312.png"));
            powerout8 = new Texture(Gdx.files.internal("assets/313.png"));
            powerout9 = new Texture(Gdx.files.internal("assets/314.png"));
            powerout10 = new Texture(Gdx.files.internal("assets/315.png"));
            powerout11 = new Texture(Gdx.files.internal("assets/316.png"));
            powerout12 = new Texture(Gdx.files.internal("assets/317.png"));
            powerout13 = new Texture(Gdx.files.internal("assets/318.png"));
            powerout14 = new Texture(Gdx.files.internal("assets/319.png"));
            powerout15 = new Texture(Gdx.files.internal("assets/320.png"));
            powerout16 = new Texture(Gdx.files.internal("assets/321.png"));
            powerout17 = new Texture(Gdx.files.internal("assets/322.png"));
            powerout18 = new Texture(Gdx.files.internal("assets/323.png"));
            powerout19 = new Texture(Gdx.files.internal("assets/324.png"));
            powerout20 = new Texture(Gdx.files.internal("assets/325.png"));
            bonnie1 = new Texture(Gdx.files.internal("assets/291.png"));
            bonnie2 = new Texture(Gdx.files.internal("assets/293.png"));
            bonnie3 = new Texture(Gdx.files.internal("assets/294.png"));
            bonnie4 = new Texture(Gdx.files.internal("assets/295.png"));
            bonnie5 = new Texture(Gdx.files.internal("assets/296.png"));
            bonnie6 = new Texture(Gdx.files.internal("assets/297.png"));
            bonnie7 = new Texture(Gdx.files.internal("assets/298.png"));
            bonnie8 = new Texture(Gdx.files.internal("assets/299.png"));
            bonnie9 = new Texture(Gdx.files.internal("assets/300.png"));
            bonnie10 = new Texture(Gdx.files.internal("assets/301.png"));
            bonnie11 = new Texture(Gdx.files.internal("assets/303.png"));
            chicka1 = new Texture(Gdx.files.internal("assets/65.png"));
            chicka2 = new Texture(Gdx.files.internal("assets/69.png"));
            chicka3 = new Texture(Gdx.files.internal("assets/216.png"));
            chicka4 = new Texture(Gdx.files.internal("assets/228.png"));
            chicka5 = new Texture(Gdx.files.internal("assets/229.png"));
            chicka6 = new Texture(Gdx.files.internal("assets/230.png"));
            chicka7 = new Texture(Gdx.files.internal("assets/231.png"));
            chicka8 = new Texture(Gdx.files.internal("assets/232.png"));
            chicka9 = new Texture(Gdx.files.internal("assets/233.png"));
            chicka10 = new Texture(Gdx.files.internal("assets/234.png"));
            chicka11 = new Texture(Gdx.files.internal("assets/235.png"));
            chicka12 = new Texture(Gdx.files.internal("assets/236.png"));
            chicka13 = new Texture(Gdx.files.internal("assets/237.png"));
            chicka14 = new Texture(Gdx.files.internal("assets/239.png"));
            chicka15 = new Texture(Gdx.files.internal("assets/279.png"));
            chicka16 = new Texture(Gdx.files.internal("assets/281.png"));
            foxy1 = new Texture(Gdx.files.internal("assets/242.png"));
            foxy2 = new Texture(Gdx.files.internal("assets/243.png"));
            foxy3 = new Texture(Gdx.files.internal("assets/396.png"));
            foxy4 = new Texture(Gdx.files.internal("assets/397.png"));
            foxy5 = new Texture(Gdx.files.internal("assets/398.png"));
            foxy6 = new Texture(Gdx.files.internal("assets/399.png"));
            foxy7 = new Texture(Gdx.files.internal("assets/400.png"));
            foxy8 = new Texture(Gdx.files.internal("assets/401.png"));
            foxy9 = new Texture(Gdx.files.internal("assets/402.png"));
            foxy10 = new Texture(Gdx.files.internal("assets/403.png"));
            foxy11 = new Texture(Gdx.files.internal("assets/404.png"));
            foxy12 = new Texture(Gdx.files.internal("assets/405.png"));
            foxy13 = new Texture(Gdx.files.internal("assets/406.png"));
            foxy14 = new Texture(Gdx.files.internal("assets/407.png"));
            foxy15 = new Texture(Gdx.files.internal("assets/408.png"));
            foxy16 = new Texture(Gdx.files.internal("assets/409.png"));
            foxy17 = new Texture(Gdx.files.internal("assets/410.png"));
            foxy18 = new Texture(Gdx.files.internal("assets/411.png"));
            foxy19 = new Texture(Gdx.files.internal("assets/412.png"));
            freddy1 = new Texture(Gdx.files.internal("assets/489.png"));
            freddy2 = new Texture(Gdx.files.internal("assets/490.png"));
            freddy3 = new Texture(Gdx.files.internal("assets/491.png"));
            freddy4 = new Texture(Gdx.files.internal("assets/493.png"));
            freddy5 = new Texture(Gdx.files.internal("assets/495.png"));
            freddy6 = new Texture(Gdx.files.internal("assets/496.png"));
            freddy7 = new Texture(Gdx.files.internal("assets/497.png"));
            freddy8 = new Texture(Gdx.files.internal("assets/498.png"));
            freddy9 = new Texture(Gdx.files.internal("assets/499.png"));
            freddy10 = new Texture(Gdx.files.internal("assets/500.png"));
            freddy11 = new Texture(Gdx.files.internal("assets/501.png"));
            freddy12 = new Texture(Gdx.files.internal("assets/502.png"));
            freddy13 = new Texture(Gdx.files.internal("assets/503.png"));
            freddy14 = new Texture(Gdx.files.internal("assets/504.png"));
            freddy15 = new Texture(Gdx.files.internal("assets/505.png"));
            freddy16 = new Texture(Gdx.files.internal("assets/506.png"));
            freddy17 = new Texture(Gdx.files.internal("assets/507.png"));
            freddy18 = new Texture(Gdx.files.internal("assets/508.png"));
            freddy19 = new Texture(Gdx.files.internal("assets/509.png"));
            freddy20 = new Texture(Gdx.files.internal("assets/510.png"));
            freddy21 = new Texture(Gdx.files.internal("assets/511.png"));
            freddy22 = new Texture(Gdx.files.internal("assets/512.png"));
            freddy23 = new Texture(Gdx.files.internal("assets/513.png"));
            freddy24 = new Texture(Gdx.files.internal("assets/514.png"));
            freddy25 = new Texture(Gdx.files.internal("assets/515.png"));
            freddy26 = new Texture(Gdx.files.internal("assets/516.png"));
            freddy27 = new Texture(Gdx.files.internal("assets/517.png"));
            freddy28 = new Texture(Gdx.files.internal("assets/518.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        ifloading = false;
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        frameBuffer.begin();
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        spriteBatch.begin();
        paintComponent(spriteBatch);
        spriteBatch.end();

        frameBuffer.end();

        spriteBatch.begin();
        frameBufferSprite.draw(spriteBatch);
        spriteBatch.end();
    }

    @Override
    public void dispose() {
        spriteBatch.dispose();
        ninety.dispose();
        mainMenu1.dispose();
        mainMenu2.dispose();
        mainMenu3.dispose();
        ambiance1.dispose();
        ambiance2.dispose();
        ambiance3.dispose();
        main1.dispose();
        main2.dispose();
        knock.dispose();
        run.dispose();
        scream.dispose();
        door.dispose();
        light.dispose();
        blip.dispose();
        spriteBatch.dispose();
        frameBuffer.dispose();
        frameBufferTexture.dispose();
        stage.dispose();
        currentView.dispose();
        bonnie1.dispose();
        bonnie2.dispose();
        bonnie3.dispose();
        bonnie4.dispose();
        bonnie5.dispose();
        bonnie6.dispose();
        bonnie7.dispose();
        bonnie8.dispose();
        bonnie9.dispose();
        bonnie10.dispose();
        bonnie11.dispose();
        chicka1.dispose();
        chicka2.dispose();
        chicka3.dispose();
        chicka4.dispose();
        chicka5.dispose();
        chicka6.dispose();
        chicka7.dispose();
        chicka8.dispose();
         chicka9.dispose();
         chicka10.dispose();
         chicka11.dispose();
         chicka12.dispose();
         chicka13.dispose();
         chicka14.dispose();
         chicka15.dispose();
         chicka16.dispose();
         foxy1.dispose();
         foxy2.dispose();
         foxy3.dispose();
         foxy4.dispose();
         foxy5.dispose();
         foxy6.dispose();
         foxy7.dispose();
         foxy8.dispose();
         foxy9.dispose();
         foxy10.dispose();
         foxy11.dispose();
         foxy12.dispose();
         foxy13.dispose();
         foxy14.dispose();
         foxy15.dispose();
         foxy16.dispose();
         foxy17.dispose();
         foxy18.dispose();
         foxy19.dispose();
         freddy1.dispose();
         freddy2.dispose();
         freddy3.dispose();
         freddy4.dispose();
         freddy5.dispose();
         freddy6.dispose();
         freddy7.dispose();
         freddy8.dispose();
         freddy9.dispose();
         freddy10.dispose();
         freddy11.dispose();
         freddy12.dispose();
         freddy13.dispose();
         freddy14.dispose();
         freddy15.dispose();
         freddy16.dispose();
         freddy17.dispose();
         freddy18.dispose();
         freddy19.dispose();
         freddy20.dispose();
         freddy21.dispose();
         freddy22.dispose();
         freddy23.dispose();
         freddy24.dispose();
         freddy25.dispose();
         freddy26.dispose();
         freddy27.dispose();
         freddy28.dispose();
         freddy29.dispose();
         powerout1.dispose();
         powerout2.dispose();
         powerout3.dispose();
         powerout4.dispose();
         powerout5.dispose();
         powerout6.dispose();
         powerout7.dispose();
         powerout8.dispose();
         powerout9.dispose();
         powerout10.dispose();
         powerout11.dispose();
         powerout12.dispose();
         powerout13.dispose();
         powerout14.dispose();
         powerout15.dispose();
         powerout16.dispose();
         powerout17.dispose();
         powerout18.dispose();
         powerout19.dispose();
         powerout20.dispose();
         powerout21.dispose();
         foxrun1.dispose();
         foxrun2.dispose();
         foxrun3.dispose();
         foxrun4.dispose();
         foxrun5.dispose();
         foxrun6.dispose();
         foxrun7.dispose();
         foxrun8.dispose();
         foxrun9.dispose();
         foxrun10.dispose();
         foxrun11.dispose();
         foxrun12.dispose();
         foxrun13.dispose();
         foxrun14.dispose();
         foxrun15.dispose();
         foxrun16.dispose();
         foxrun17.dispose();
         foxrun18.dispose();
         foxrun19.dispose();
         foxrun20.dispose();
         foxrun21.dispose();
         foxrun22.dispose();
         foxrun23.dispose();
         foxrun24.dispose();
         foxrun25.dispose();
         foxrun26.dispose();
         foxrun27.dispose();
         foxrun28.dispose();
         foxrun29.dispose();
         foxrun30.dispose();
         foxrun31.dispose();
         static1.dispose();
         static2.dispose();
         static3.dispose();
         static4.dispose();
         static5.dispose();
         static6.dispose();
         static7.dispose();
         static8.dispose();
         mainMenu.dispose();
         mainMenu4.dispose();
         stageNoBonnie.dispose();
         stageNoChicka.dispose();
         stageNoBonnieChicka.dispose();
         stageFreddyStare.dispose();
         stageNone.dispose();
         diningNone.dispose();
         diningBonnieFar.dispose();
         diningBonnieClose.dispose();
         diningChickaFar.dispose();
         diningChickaClose.dispose();
         diningFreddy.dispose();
         eastHallAChickaFar.dispose();
         eastHallAChickaClose.dispose();
         eastHallAFreddy.dispose();
         eastHallANone.dispose();
         eastHallBNone.dispose();
         eastHallBChicka.dispose();
         eastHallBFreddy.dispose();
         backstageNone.dispose();
         backstageFar.dispose();
         backstageClose.dispose();
         piratecoveStage0.dispose();
         piratecoveStage1.dispose();
         piratecoveStage2.dispose();
         piratecoveStage3.dispose();
         restroomsNone.dispose();
         restroomsChickaClose.dispose();
         restroomsChickaFar.dispose();
         restroomsFreddy.dispose();
         westHallANone.dispose();
         westHallABonnie.dispose();
         westHallBNone.dispose();
         westHallBBonnie.dispose();
         supplyclosetNone.dispose();
         supplyclosetBonnie.dispose();
         fiveNightsLogo.dispose();
         newGameLogo.dispose();
         arrows.dispose();
         office.dispose();
         officeLeftLight.dispose();
         officeRightLight.dispose();
         officeBonnie.dispose();
         officeChicka.dispose();
         officePowerOut.dispose();
         officePowerOutFreddy.dispose();
         name.dispose();
         cameraBar.dispose();
         loading.dispose();
         newspaper.dispose();
         leftNone.dispose();
         leftLight.dispose();
         leftDoor.dispose();
         leftBoth.dispose();
         rightNone.dispose();
         rightLight.dispose();
         rightDoor.dispose();
         rightBoth.dispose();
         cameraMinimap.dispose();
         A1.dispose();
         B1.dispose();
         C1.dispose();
         A2.dispose();
         B2.dispose();
         Three.dispose();
         A4.dispose();
         B4.dispose();
         Five.dispose();
         Six.dispose();
         blank.dispose();
         supplycloset.dispose();
         showstage.dispose();
         piratecove.dispose();
         backstage.dispose();
         diningarea.dispose();
         westhall.dispose();
         ehallcorner.dispose();
         whallcorner.dispose();
         restrooms.dispose();
         easthall.dispose();
         use1.dispose();
         use2.dispose();
         use3.dispose();
         use4.dispose();
         use5.dispose();
         use.dispose();
         powerleft.dispose();
         percentsign.dispose();
         leftdoor1.dispose();
         leftdoor2.dispose();
         leftdoor3.dispose();
         leftdoor4.dispose();
         leftdoor5.dispose();
         leftdoor6.dispose();
         leftdoor7.dispose();
         leftdoor8.dispose();
         leftdoor9.dispose();
         leftdoor10.dispose();
         leftdoor11.dispose();
         leftdoor12.dispose();
         leftdoor13.dispose();
         rightdoor1.dispose();
         rightdoor2.dispose();
         rightdoor3.dispose();
         rightdoor4.dispose();
         rightdoor5.dispose();
         rightdoor6.dispose();
         rightdoor7.dispose();
         rightdoor8.dispose();
         rightdoor9.dispose();
         rightdoor10.dispose();
         rightdoor11.dispose();
         rightdoor12.dispose();
         rightdoor13.dispose();
         onehundred.dispose();
         eighty.dispose();
         seventy.dispose();
         sixty.dispose();
         fifty.dispose();
         forty.dispose();
         thirty.dispose();
         twenty.dispose();
         ten.dispose();
         zero.dispose();
         lose.dispose();
         win.dispose();
    }
    public void paintComponent(SpriteBatch spriteBatch) {
        spriteBatch.draw(image, 0, 0);
        g.fillRect(0, 0, getWidth(), getHeight());
        if (ifloading == true) {
            g.drawImage(loading, 370, 200, this);
        } else {
            if (startGame == false) {
                if(mainmenumusicplaying == false) {
                    main1.play();
                    ambiance1.play();
                    mainmenumusicplaying = true;
                }
                ambiance2.stop();
                ambiance1.stop();
                needToMove = false;
                int random;
                random = (int) (Math.random() * 20);
                if (random > 18) {
                    random = (int) (Math.random() * 2);
                    switch (random) {
                        case 1:
                            g.drawImage(mainMenu2, 0, 0, this);
                            break;
                        case 2:
                            g.drawImage(mainMenu3, 0, 0, this);
                            break;
                    }
                } else {
                    g.drawImage(mainMenu, 0, 0, this);
                }
                g.drawImage(fiveNightsLogo, 100, 50, this);
                g.drawImage(newGameLogo, 100, 400, this);
                g.drawImage(arrows, 30, 405, this);
                g.drawImage(name, 1050, 700, this);
                if (startClicked == true) {
                    g.drawImage(newspaper, 0, 0, this);
                }
            } else {
                main1.stop();
                ambiance1.stop();
                mainmenumusicplaying = false;
                if(gamemusicplaying == false) {
                    ambiance2.play();
                    ambiance1.play();
                    gamemusicplaying = true;
                }
                if (Office.monitorUp == true) {
                    if (cameraLocation.equals("Show Stage")) {
                        needToMove = true;

                        if (Bonnie.isInRoom() != 0 && Chicka.isInRoom() != 0
                                && Freddy.isInRoom() != 0) {
                            g.drawImage(stageNone, cameraPosition - 200, 0,
                                    this);
                        }
                        if (Bonnie.isInRoom() == 0 && Chicka.isInRoom() == 0
                                && Freddy.isInRoom() == 0) {
                            g.drawImage(stage, cameraPosition - 200, 0, this);
                        }
                        if (Bonnie.isInRoom() != 0 && Chicka.isInRoom() == 0
                                && Freddy.isInRoom() == 0) {
                            g.drawImage(stageNoBonnie, cameraPosition - 200, 0,
                                    this);
                        }
                        if (Bonnie.isInRoom() == 0 && Chicka.isInRoom() != 0
                                && Freddy.isInRoom() == 0) {
                            g.drawImage(stageNoChicka, cameraPosition - 200, 0,
                                    this);
                        }
                        if (Bonnie.isInRoom() != 0 && Chicka.isInRoom() != 0
                                && Freddy.isInRoom() == 0) {
                            g.drawImage(stageNoBonnieChicka,
                                    cameraPosition - 200, 0, this);
                        }
                        g.drawImage(
                                makeColorTransparent(showstage, Color.black),
                                800, 290, this);
                    }
                    if (cameraLocation.equals("Dining Area")) {
                        needToMove = true;

                        if (Bonnie.isInRoom() != 1 && Chicka.isInRoom() != 1
                                && Freddy.isInRoom() != 1
                                && Bonnie.isInRoom() != 2
                                && Chicka.isInRoom() != 2) {
                            g.drawImage(diningNone, cameraPosition - 200, 0,
                                    this);
                        }
                        if (Bonnie.isInRoom() == 1 && Chicka.isInRoom() != 1
                                && Freddy.isInRoom() != 1
                                && Bonnie.isInRoom() != 2
                                && Chicka.isInRoom() != 2) {
                            g.drawImage(diningBonnieFar, cameraPosition - 200,
                                    0, this);
                        }
                        if (Bonnie.isInRoom() != 1 && Chicka.isInRoom() != 1
                                && Freddy.isInRoom() != 1
                                && Bonnie.isInRoom() != 1
                                && Chicka.isInRoom() == 2) {
                            g.drawImage(diningChickaClose,
                                    cameraPosition - 200, 0, this);
                        }
                        if (Bonnie.isInRoom() != 1 && Chicka.isInRoom() == 1
                                && Freddy.isInRoom() != 1
                                && Bonnie.isInRoom() != 2
                                && Chicka.isInRoom() != 2) {
                            g.drawImage(diningChickaFar, cameraPosition - 200,
                                    0, this);
                        }
                        if (Bonnie.isInRoom() != 1 && Chicka.isInRoom() != 1
                                && Freddy.isInRoom() != 1
                                && Bonnie.isInRoom() == 2
                                && Chicka.isInRoom() != 2) {
                            g.drawImage(diningChickaClose,
                                    cameraPosition - 200, 0, this);
                        }
                        if (Bonnie.isInRoom() != 1 && Chicka.isInRoom() != 1
                                && Freddy.isInRoom() == 1
                                && Bonnie.isInRoom() != 2
                                && Chicka.isInRoom() != 2) {
                            g.drawImage(diningFreddy, cameraPosition - 200, 0,
                                    this);
                        }
                        g.drawImage(
                                makeColorTransparent(diningarea, Color.black),
                                800, 290, this);
                    }
                    if (cameraLocation.equals("East Hall A")) {
                        needToMove = true;

                        if (Chicka.isInRoom() == 5 && Freddy.isInRoom() != 3
                                && Chicka.isInRoom() != 6) {
                            g.drawImage(eastHallAChickaFar,
                                    cameraPosition - 200, 0, this);
                        }
                        if (Chicka.isInRoom() != 5 && Freddy.isInRoom() != 3
                                && Chicka.isInRoom() == 6) {
                            g.drawImage(eastHallAChickaClose,
                                    cameraPosition - 200, 0, this);
                        }
                        if (Chicka.isInRoom() != 5 && Freddy.isInRoom() == 3
                                && Chicka.isInRoom() != 6) {
                            g.drawImage(eastHallAFreddy, cameraPosition - 200,
                                    0, this);
                        }
                        if (Chicka.isInRoom() != 5 && Freddy.isInRoom() != 3
                                && Chicka.isInRoom() != 6) {
                            g.drawImage(eastHallANone, cameraPosition - 200, 0,
                                    this);
                        }
                        g.drawImage(
                                makeColorTransparent(easthall, Color.black),
                                800, 290, this);
                    }
                    if (cameraLocation.equals("East Hall B")) {
                        needToMove = true;

                        if (Chicka.isInRoom() != 7 && Freddy.isInRoom() != 4) {
                            g.drawImage(eastHallBNone, cameraPosition - 200, 0,
                                    this);
                        }
                        if (Chicka.isInRoom() == 7 && Freddy.isInRoom() != 4) {
                            g.drawImage(eastHallBChicka, cameraPosition - 200,
                                    0, this);
                        }
                        if (Chicka.isInRoom() != 7 && Freddy.isInRoom() == 4) {
                            g.drawImage(eastHallBFreddy, cameraPosition - 200,
                                    0, this);
                        }
                        g.drawImage(
                                makeColorTransparent(ehallcorner, Color.black),
                                800, 290, this);
                    }
                    if (cameraLocation.equals("Backstage")) {
                        needToMove = true;

                        if (Bonnie.isInRoom() != 3 && Bonnie.isInRoom() != 4) {
                            g.drawImage(backstageNone, cameraPosition - 200, 0,
                                    this);
                        }
                        if (Bonnie.isInRoom() == 3 && Bonnie.isInRoom() != 4) {
                            g.drawImage(backstageFar, cameraPosition - 200, 0,
                                    this);
                        }
                        if (Bonnie.isInRoom() != 3 && Bonnie.isInRoom() == 4) {
                            g.drawImage(backstageClose, cameraPosition - 200,
                                    0, this);
                        }
                        g.drawImage(
                                makeColorTransparent(backstage, Color.black),
                                800, 290, this);
                    }
                    if (cameraLocation.equals("Pirate Cove")) {
                        needToMove = true;

                        if (Foxy.getStage() == 0) {
                            g.drawImage(piratecoveStage0, -100, 0, this);
                        } else if (Foxy.getStage() == 1) {
                            g.drawImage(piratecoveStage1, -100, 0, this);
                        } else if (Foxy.getStage() == 2) {
                            g.drawImage(piratecoveStage2, -100, 0, this);
                        } else if (Foxy.getStage() == 3) {
                            g.drawImage(piratecoveStage3, -100, 0, this);
                        }
                        g.drawImage(
                                makeColorTransparent(piratecove, Color.black),
                                800, 290, this);
                    }
                    if (cameraLocation.equals("Restrooms")) {
                        needToMove = true;

                        if (Chicka.isInRoom() == 3 && Freddy.isInRoom() != 2
                                && Chicka.isInRoom() != 4) {
                            g.drawImage(restroomsChickaFar,
                                    cameraPosition - 200, 0, this);
                        }
                        if (Chicka.isInRoom() != 3 && Freddy.isInRoom() != 2
                                && Chicka.isInRoom() == 4) {
                            g.drawImage(restroomsChickaClose,
                                    cameraPosition - 200, 0, this);
                        }
                        if (Chicka.isInRoom() != 3 && Freddy.isInRoom() == 2
                                && Chicka.isInRoom() != 4) {
                            g.drawImage(restroomsFreddy, cameraPosition - 200,
                                    0, this);
                        }
                        if (Chicka.isInRoom() != 3 && Freddy.isInRoom() != 2
                                && Chicka.isInRoom() != 4) {
                            g.drawImage(restroomsNone, cameraPosition - 200, 0,
                                    this);
                        }
                        g.drawImage(
                                makeColorTransparent(restrooms, Color.black),
                                800, 290, this);
                    }
                    if (cameraLocation.equals("West Hall A")
                            && Foxy.getStage() != 3) {
                        needToMove = true;

                        if (Bonnie.isInRoom() != 5) {
                            g.drawImage(westHallANone, cameraPosition - 200, 0,
                                    this);
                        }
                        if (Bonnie.isInRoom() == 5) {
                            g.drawImage(westHallABonnie, cameraPosition - 200,
                                    0, this);
                        }
                        g.drawImage(
                                makeColorTransparent(westhall, Color.black),
                                800, 290, this);
                    }
                    if (cameraLocation.equals("West Hall B")) {
                        needToMove = true;

                        if (Bonnie.isInRoom() != 7) {
                            g.drawImage(westHallBNone, cameraPosition - 200, 0,
                                    this);
                        }
                        if (Bonnie.isInRoom() == 7) {
                            g.drawImage(westHallBBonnie, cameraPosition - 200,
                                    0, this);
                        }
                        g.drawImage(
                                makeColorTransparent(whallcorner, Color.black),
                                800, 290, this);
                    }
                    if (cameraLocation.equals("Supply Closet")) {
                        needToMove = true;

                        if (Bonnie.isInRoom() != 6) {
                            g.drawImage(supplyclosetNone, -100, 0, this);
                        }
                        if (Bonnie.isInRoom() == 6) {
                            g.drawImage(supplyclosetBonnie, -100, 0, this);
                        }
                        g.drawImage(
                                makeColorTransparent(supplycloset, Color.black),
                                800, 290, this);
                    }
                    if (cameraLocation.equals("West Hall A")
                            && Foxy.getStage() == 3) {

                        if (Foxy.getStage() == 3) {
                            needToMove = false;
                            if (Fox == 1) {
                                g.drawImage(foxrun1, 0, 0, this);
                                run.play();
                            }
                            if (Fox == 2)
                                g.drawImage(foxrun2, 0, 0, this);
                            if (Fox == 3)
                                g.drawImage(foxrun3, 0, 0, this);
                            if (Fox == 4)
                                g.drawImage(foxrun4, 0, 0, this);
                            if (Fox == 5)
                                g.drawImage(foxrun5, 0, 0, this);
                            if (Fox == 6)
                                g.drawImage(foxrun6, 0, 0, this);
                            if (Fox == 7)
                                g.drawImage(foxrun7, 0, 0, this);
                            if (Fox == 8)
                                g.drawImage(foxrun8, 0, 0, this);
                            if (Fox == 9)
                                g.drawImage(foxrun9, 0, 0, this);
                            if (Fox == 10)
                                g.drawImage(foxrun10, 0, 0, this);
                            if (Fox == 11)
                                g.drawImage(foxrun11, 0, 0, this);
                            if (Fox == 12)
                                g.drawImage(foxrun12, 0, 0, this);
                            if (Fox == 13)
                                g.drawImage(foxrun13, 0, 0, this);
                            if (Fox == 14)
                                g.drawImage(foxrun14, 0, 0, this);
                            if (Fox == 15)
                                g.drawImage(foxrun15, 0, 0, this);
                            if (Fox == 16)
                                g.drawImage(foxrun16, 0, 0, this);
                            if (Fox == 17)
                                g.drawImage(foxrun17, 0, 0, this);
                            if (Fox == 18)
                                g.drawImage(foxrun18, 0, 0, this);
                            if (Fox == 19)
                                g.drawImage(foxrun19, 0, 0, this);
                            if (Fox == 20)
                                g.drawImage(foxrun20, 0, 0, this);
                            if (Fox == 21)
                                g.drawImage(foxrun21, 0, 0, this);
                            if (Fox == 22)
                                g.drawImage(foxrun22, 0, 0, this);
                            if (Fox == 23)
                                g.drawImage(foxrun23, 0, 0, this);
                            if (Fox == 24)
                                g.drawImage(foxrun24, 0, 0, this);
                            if (Fox == 25)
                                g.drawImage(foxrun25, 0, 0, this);
                            if (Fox == 26)
                                g.drawImage(foxrun26, 0, 0, this);
                            if (Fox == 27)
                                g.drawImage(foxrun27, 0, 0, this);
                            if (Fox == 28)
                                g.drawImage(foxrun28, 0, 0, this);
                            if (Fox == 29)
                                g.drawImage(foxrun29, 0, 0, this);
                            if (Fox == 30)
                                g.drawImage(foxrun30, 0, 0, this);
                            if (Fox == 31)
                                g.drawImage(foxrun31, 0, 0, this);

                        }
                        g.drawImage(
                                makeColorTransparent(westhall, Color.black),
                                800, 290, this);
                    }
                    g.drawImage(
                            makeColorTransparent(cameraMinimap, Color.black),
                            825, 325, this);
                    g.drawImage(blank, 923, 343, this);
                    g.drawImage(blank, 904, 399, this);
                    g.drawImage(blank, 877, 481, this);
                    g.drawImage(blank, 926, 596, this);
                    g.drawImage(blank, 926, 631, this);
                    g.drawImage(blank, 850, 578, this);
                    g.drawImage(blank, 1034, 596, this);
                    g.drawImage(blank, 1034, 631, this);
                    g.drawImage(blank, 796, 431, this);
                    g.drawImage(blank, 1146, 436, this);
                    g.drawImage(makeColorTransparent(A1, Color.black), 927,
                            347, this);
                    g.drawImage(makeColorTransparent(B1, Color.black), 908,
                            403, this);
                    g.drawImage(makeColorTransparent(C1, Color.black), 881,
                            485, this);
                    g.drawImage(makeColorTransparent(A2, Color.black), 930,
                            600, this);
                    g.drawImage(makeColorTransparent(B2, Color.black), 930,
                            635, this);
                    g.drawImage(makeColorTransparent(Three, Color.black), 855,
                            582, this);
                    g.drawImage(makeColorTransparent(A4, Color.black), 1038,
                            600, this);
                    g.drawImage(makeColorTransparent(B4, Color.black), 1038,
                            635, this);
                    g.drawImage(makeColorTransparent(Five, Color.black), 800,
                            435, this);
                    g.drawImage(makeColorTransparent(Six, Color.black), 1150,
                            440, this);
                } else {
                    if (Bonnie.playerdeath == true && Office.monitorUp == false) {
                        needToMove = false;
                        if (bonnie == 1) {
                            scream.play();
                            g.drawImage(bonnie1, 0, 0, this);
                        }
                        if (bonnie == 2)
                            g.drawImage(bonnie2, 0, 0, this);
                        if (bonnie == 3)
                            g.drawImage(bonnie3, 0, 0, this);
                        if (bonnie == 4)
                            g.drawImage(bonnie4, 0, 0, this);
                        if (bonnie == 5)
                            g.drawImage(bonnie5, 0, 0, this);
                        if (bonnie == 6)
                            g.drawImage(bonnie6, 0, 0, this);
                        if (bonnie == 7)
                            g.drawImage(bonnie7, 0, 0, this);
                        if (bonnie == 8)
                            g.drawImage(bonnie8, 0, 0, this);
                        if (bonnie == 9)
                            g.drawImage(bonnie9, 0, 0, this);
                        if (bonnie == 10)
                            g.drawImage(bonnie10, 0, 0, this);
                        if (bonnie == 11) {
                            g.drawImage(bonnie11, 0, 0, this);
                            scream.stop();
                        }



                    } else if (Chicka.playerdeath == true && Office.monitorUp == false) {
                        needToMove = false;
                        main1.stop();
                        ambiance1.stop();
                        if (chicka == 1) {
                            g.drawImage(chicka1, 0, 0, this);
                            scream.play();
                        }
                        if (chicka == 2)
                            g.drawImage(chicka2, 0, 0, this);
                        if (chicka == 3)
                            g.drawImage(chicka3, 0, 0, this);
                        if (chicka == 4)
                            g.drawImage(chicka4, 0, 0, this);
                        if (chicka == 5)
                            g.drawImage(chicka5, 0, 0, this);
                        if (chicka == 6)
                            g.drawImage(chicka6, 0, 0, this);
                        if (chicka == 7)
                            g.drawImage(chicka7, 0, 0, this);
                        if (chicka == 8)
                            g.drawImage(chicka8, 0, 0, this);
                        if (chicka == 9)
                            g.drawImage(chicka9, 0, 0, this);
                        if (chicka == 10)
                            g.drawImage(chicka10, 0, 0, this);
                        if (chicka == 11)
                            g.drawImage(chicka11, 0, 0, this);
                        if (chicka == 12)
                            g.drawImage(chicka12, 0, 0, this);
                        if (chicka == 13)
                            g.drawImage(chicka13, 0, 0, this);
                        if (chicka == 14)
                            g.drawImage(chicka14, 0, 0, this);
                        if (chicka == 15)
                            g.drawImage(chicka15, 0, 0, this);
                        if (chicka == 16) {
                            g.drawImage(chicka16, 0, 0, this);
                            scream.stop();
                        }

                    } else if (Freddy.playerdeath == true && Office.monitorUp == false) {
                        needToMove = false;
                        main1.stop();
                        ambiance1.stop();
                        if (freddie == 1) {
                            g.drawImage(freddy1, 0, 0, this);
                            scream.play();
                        }
                        if (freddie == 2)
                            g.drawImage(freddy2, 0, 0, this);
                        if (freddie == 3)
                            g.drawImage(freddy3, 0, 0, this);
                        if (freddie == 4)
                            g.drawImage(freddy4, 0, 0, this);
                        if (freddie == 5)
                            g.drawImage(freddy5, 0, 0, this);
                        if (freddie == 6)
                            g.drawImage(freddy6, 0, 0, this);
                        if (freddie == 7)
                            g.drawImage(freddy7, 0, 0, this);
                        if (freddie == 8)
                            g.drawImage(freddy8, 0, 0, this);
                        if (freddie == 9)
                            g.drawImage(freddy9, 0, 0, this);
                        if (freddie == 10)
                            g.drawImage(freddy10, 0, 0, this);
                        if (freddie == 11)
                            g.drawImage(freddy11, 0, 0, this);
                        if (freddie == 12)
                            g.drawImage(freddy12, 0, 0, this);
                        if (freddie == 13)
                            g.drawImage(freddy13, 0, 0, this);
                        if (freddie == 14)
                            g.drawImage(freddy14, 0, 0, this);
                        if (freddie == 15)
                            g.drawImage(freddy15, 0, 0, this);
                        if (freddie == 16)
                            g.drawImage(freddy16, 0, 0, this);
                        if (freddie == 17)
                            g.drawImage(freddy17, 0, 0, this);
                        if (freddie == 18)
                            g.drawImage(freddy18, 0, 0, this);
                        if (freddie == 19)
                            g.drawImage(freddy19, 0, 0, this);
                        if (freddie == 20)
                            g.drawImage(freddy20, 0, 0, this);
                        if (freddie == 21)
                            g.drawImage(freddy21, 0, 0, this);
                        if (freddie == 22)
                            g.drawImage(freddy22, 0, 0, this);
                        if (freddie == 23)
                            g.drawImage(freddy23, 0, 0, this);
                        if (freddie == 24)
                            g.drawImage(freddy24, 0, 0, this);
                        if (freddie == 25)
                            g.drawImage(freddy25, 0, 0, this);
                        if (freddie == 26)
                            g.drawImage(freddy26, 0, 0, this);
                        if (freddie == 27)
                            g.drawImage(freddy27, 0, 0, this);
                        if (freddie == 28) {
                            g.drawImage(freddy28, 0, 0, this);
                            scream.stop();
                        }

                    } else if (Foxy.playerdeath == true
                            && Office.door1open == true) {
                        needToMove = false;
                        main1.stop();
                        ambiance1.stop();
                        if (foxdie == 1) {
                            scream.play();
                            g.drawImage(foxy1, 0, 0, this);
                        }
                        if (foxdie == 2)
                            g.drawImage(foxy2, 0, 0, this);
                        if (foxdie == 3)
                            g.drawImage(foxy3, 0, 0, this);
                        if (foxdie == 4)
                            g.drawImage(foxy4, 0, 0, this);
                        if (foxdie == 5)
                            g.drawImage(foxy5, 0, 0, this);
                        if (foxdie == 6)
                            g.drawImage(foxy6, 0, 0, this);
                        if (foxdie == 7)
                            g.drawImage(foxy7, 0, 0, this);
                        if (foxdie == 8)
                            g.drawImage(foxy8, 0, 0, this);
                        if (foxdie == 9)
                            g.drawImage(foxy9, 0, 0, this);
                        if (foxdie == 10)
                            g.drawImage(foxy10, 0, 0, this);
                        if (foxdie == 11)
                            g.drawImage(foxy11, 0, 0, this);
                        if (foxdie == 12)
                            g.drawImage(foxy12, 0, 0, this);
                        if (foxdie == 13)
                            g.drawImage(foxy13, 0, 0, this);
                        if (foxdie == 14)
                            g.drawImage(foxy14, 0, 0, this);
                        if (foxdie == 15)
                            g.drawImage(foxy15, 0, 0, this);
                        if (foxdie == 16)
                            g.drawImage(foxy16, 0, 0, this);
                        if (foxdie == 17)
                            g.drawImage(foxy17, 0, 0, this);
                        if (foxdie == 18)
                            g.drawImage(foxy18, 0, 0, this);
                        if (foxdie == 19) {
                            g.drawImage(foxy19, 0, 0, this);
                            scream.stop();
                        }

                    } else if (Office.light1on == true
                            && Bonnie.isInRoom() == 8) {
                        g.drawImage(officeBonnie, officeView, 0, this);
                        g.drawImage(
                                makeColorTransparent(leftLight, Color.black),
                                officeView, 250, this);
                        g.drawImage(
                                makeColorTransparent(rightNone, Color.black),
                                officeView + 1490, 250, this);
                    } else if (Office.light1on == true
                            && Bonnie.isInRoom() != 8) {
                        g.drawImage(officeLeftLight, officeView, 0, this);
                        g.drawImage(
                                makeColorTransparent(leftLight, Color.black),
                                officeView, 250, this);
                        g.drawImage(
                                makeColorTransparent(rightNone, Color.black),
                                officeView + 1490, 250, this);
                    } else if (Office.light2on == true
                            && Chicka.isInRoom() == 8) {
                        g.drawImage(officeChicka, officeView, 0, this);
                        g.drawImage(
                                makeColorTransparent(leftNone, Color.black),
                                officeView, 250, this);
                        g.drawImage(
                                makeColorTransparent(rightLight, Color.black),
                                officeView + 1490, 250, this);
                    } else if (Office.light2on == true
                            && Chicka.isInRoom() != 8) {
                        g.drawImage(officeRightLight, officeView, 0, this);
                        g.drawImage(
                                makeColorTransparent(leftNone, Color.black),
                                officeView, 250, this);
                        g.drawImage(
                                makeColorTransparent(rightLight, Color.black),
                                officeView + 1490, 250, this);
                    } else {
                        g.drawImage(office, officeView, 0, this);
                        g.drawImage(
                                makeColorTransparent(leftNone, Color.black),
                                officeView, 250, this);
                        g.drawImage(
                                makeColorTransparent(rightNone, Color.black),
                                officeView + 1490, 250, this);
                    }
                    if (Office.door1open == false) {
                        g.drawImage(makeColorTransparent(leftdoor13, Color.white), officeView + 80 , 0, this);
                    }
                    if (Office.door2open == false) {
                        g.drawImage(makeColorTransparent(rightdoor13, Color.white), officeView + 1270, 0, this);
                    }
                }
                if (needStatic == true) {
                    if (Static == 1)
                        g.drawImage(static1,
                                0, 0, this);
                    if (Static == 2)
                        g.drawImage(static2,
                                0, 0, this);
                    if (Static == 3)
                        g.drawImage(static3,
                                0, 0, this);
                    if (Static == 4)
                        g.drawImage(static4,
                                0, 0, this);
                    if (Static == 5)
                        g.drawImage(static5,
                                0, 0, this);
                    if (Static == 6)
                        g.drawImage(static6,
                                0, 0, this);
                    if (Static == 7)
                        g.drawImage(static7,
                                0, 0, this);
                    if (Static == 8)
                        g.drawImage(static8,
                                0, 0, this);
                }
                if (Office.getPower() <= 0) {
                    needToMove = false;
                    if (powerOut == 1)
                        g.drawImage(powerout1, 0, 0, this);
                    if (powerOut == 2)
                        g.drawImage(powerout2, 0, 0, this);
                    if (powerOut == 3)
                        g.drawImage(powerout3, 0, 0, this);
                    if (powerOut == 4)
                        g.drawImage(powerout4, 0, 0, this);
                    if (powerOut == 5)
                        g.drawImage(powerout5, 0, 0, this);
                    if (powerOut == 6)
                        g.drawImage(powerout6, 0, 0, this);
                    if (powerOut == 7)
                        g.drawImage(powerout7, 0, 0, this);
                    if (powerOut == 8)
                        g.drawImage(powerout8, 0, 0, this);
                    if (powerOut == 9)
                        g.drawImage(powerout9, 0, 0, this);
                    if (powerOut == 10)
                        g.drawImage(powerout10, 0, 0, this);
                    if (powerOut == 11)
                        g.drawImage(powerout11, 0, 0, this);
                    if (powerOut == 12)
                        g.drawImage(powerout12, 0, 0, this);
                    if (powerOut == 13)
                        g.drawImage(powerout13, 0, 0, this);
                    if (powerOut == 14)
                        g.drawImage(powerout14, 0, 0, this);
                    if (powerOut == 15)
                        g.drawImage(powerout15, 0, 0, this);
                    if (powerOut == 16)
                        g.drawImage(powerout16, 0, 0, this);
                    if (powerOut == 17)
                        g.drawImage(powerout17, 0, 0, this);
                    if (powerOut == 18)
                        g.drawImage(powerout18, 0, 0, this);
                    if (powerOut == 19)
                        g.drawImage(powerout19, 0, 0, this);
                    if (powerOut == 20)
                        g.drawImage(powerout20, 0, 0, this);
                    Main.death = true;

                }
                g.drawImage(
                        makeColorTransparent(
                                (makeColorTransparent(cameraBar, Color.black)),
                                Color.GRAY), 262, 660, this);
                if (Office.getUsage() == 0) {

                }
                if (Office.getUsage() == 1) {
                    g.drawImage(makeColorTransparent(use1, Color.black), 90,
                            672, this);
                }
                if (Office.getUsage() == 2) {
                    g.drawImage(makeColorTransparent(use2, Color.black), 90,
                            672, this);
                }
                if (Office.getUsage() == 3) {
                    g.drawImage(makeColorTransparent(use3, Color.black), 90,
                            672, this);
                }
                if (Office.getUsage() == 4) {
                    g.drawImage(makeColorTransparent(use4, Color.black), 90,
                            672, this);
                }
                if (Office.getUsage() == 5) {
                    g.drawImage(makeColorTransparent(use5, Color.black), 90,
                            672, this);
                }
                g.drawImage(makeColorTransparent(use, Color.black), 10, 680,
                        this);
                g.drawImage(makeColorTransparent(powerleft, Color.black), 10,
                        650, this);
                g.drawImage(makeColorTransparent(percentsign, Color.black),
                        215, 650, this);

                if (Office.powerRemaining <= 100 && Office.powerRemaining > 90) {
                    g.drawImage(makeColorTransparent(onehundred, Color.black),
                            157, 646, this);
                }
                if (Office.powerRemaining <= 90 && Office.powerRemaining > 80) {
                    g.drawImage(makeColorTransparent(ninety, Color.black), 160,
                            646, this);
                }
                if (Office.powerRemaining <= 80 && Office.powerRemaining > 70) {
                    g.drawImage(makeColorTransparent(eighty, Color.black), 160,
                            646, this);
                }
                if (Office.powerRemaining <= 70 && Office.powerRemaining > 60) {
                    g.drawImage(makeColorTransparent(seventy, Color.black),
                            160, 646, this);
                }
                if (Office.powerRemaining <= 60 && Office.powerRemaining > 50) {
                    g.drawImage(makeColorTransparent(sixty, Color.black), 160,
                            646, this);
                }
                if (Office.powerRemaining <= 50 && Office.powerRemaining > 40) {
                    g.drawImage(makeColorTransparent(fifty, Color.black), 160,
                            646, this);
                }
                if (Office.powerRemaining <= 40 && Office.powerRemaining > 30) {
                    g.drawImage(makeColorTransparent(forty, Color.black), 160,
                            646, this);
                }
                if (Office.powerRemaining <= 30 && Office.powerRemaining > 20) {
                    g.drawImage(makeColorTransparent(thirty, Color.black), 160,
                            646, this);
                }
                if (Office.powerRemaining <= 20 && Office.powerRemaining > 10) {
                    g.drawImage(makeColorTransparent(twenty, Color.black), 160,
                            646, this);
                }
                if (Office.powerRemaining <= 10 && Office.powerRemaining > 0) {
                    g.drawImage(makeColorTransparent(ten, Color.black), 160,
                            646, this);
                }
                if (Office.powerRemaining == 0) {
                    g.drawImage(makeColorTransparent(zero, Color.black), 160,
                            646, this);
                }
                if (Main.deather == true) {
                    g.drawImage(lose, 0, 0, this);
                }
                if (Main.gameWin == true) {
                    g.drawImage(win, 0, 0, this);
                }
            }
        }
        repaint();
    }

    public double height(double height) {
        if (height > 720) {
            height = 720;
        }
        return height;
    }

    public double width(double width) {
        if (width > 1280) {
            width = 1280;
        }
        return width;
    }

    public static Image makeColorTransparent(java.awt.Image image2,
                                             final Color color) {
        ImageFilter filter = new RGBImageFilter() {
            public int markerRGB = color.getRGB() | 0xFF000000;

            public final int filterRGB(int x, int y, int rgb) {
                if ((rgb | 0xFF000000) == markerRGB) {
                    return 0x00FFFFFF & rgb;
                } else {
                    return rgb;
                }
            }
        };

        ImageProducer ip = new FilteredImageSource(image2.getSource(), filter);
        return Toolkit.getDefaultToolkit().createImage(ip);
    }

}
