package ru.anna.fnal;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Main extends ApplicationAdapter {
	private int limit = 200;
	private int timer = 3000;
	private boolean isReversed = false;
	private int FoxyTimer = 0;
	private int FoxTimer = 0;
	private int FreddyTimer = 0;
	private int BonnieTimer = 0;
	private int ChickaTimer = 0;
	private int newsTimer = 0;
	private int powerOutTimer = 0;
	private int monitorTimer = 0;
	private int BonnieTick = 0;
	private int ChickaTick = 0;
	private int FreddyTick = 0;
	private int FoxyTick = 0;
	private boolean monitorTransition = false;
	private int movementRepeater = 0;
	private int staticTimer = 0;
	private boolean death = false;
	private boolean canMove = false;
	private boolean move = false;
	private int deathTimer = 0;
	private boolean foxyTime = false;
	private int foxyTimeTimer = 0;
	private boolean deather = false;
	private int mouseX;
	private int gameTimer = 0;
	private boolean gameWin = false;
	private int mouseY;
	private int powerTick;
	private int gameWinTimer = 0;


}
