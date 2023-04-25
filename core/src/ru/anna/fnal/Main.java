package ru.anna.fnal;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Main extends ApplicationAdapter implements Runnable, MouseListener, MouseMotionListener {
	public static int limit = 200;
	public static int timer = 3000;
	public static boolean isReversed = false;
	public static int FoxyTimer = 0;
	public static int FoxTimer = 0;
	public static int FreddyTimer = 0;
	public static int BonnieTimer = 0;
	public static int ChickaTimer = 0;
	public static int newsTimer = 0;
	public static int powerOutTimer = 0;
	public static int monitorTimer = 0;
	public static int BonnieTick = 0;
	public static int ChickaTick = 0;
	public static int FreddyTick = 0;
	public static int FoxyTick = 0;
	public static boolean monitorTransition = false;
	public static int movementRepeater = 0;
	public static int staticTimer = 0;
	public static boolean death = false;
	public static boolean canMove = false;
	public static boolean move = false;
	public static int deathTimer = 0;
	public static boolean foxyTime = false;
	public static int foxyTimeTimer = 0;
	public static boolean deather = false;
	public static int mouseX;
	public static int gameTimer = 0;
	public static boolean gameWin = false;
	public static int mouseY;
	public static int powerTick;
	public static int gameWinTimer = 0;
	JFrame frame = new JFrame();
	public int StaticTimer = 0;

	public static void main(String[] args) {
		Main main = new Main();
		Thread thread = new Thread(main);
		thread.start();
	}

	public void run() {
		while(true) {
			try {
				Thread.sleep(10L);
				if (death) {
					Window.needStatic = true;
					if (deathTimer < 1000) {
						++deathTimer;
					}

					if (deathTimer > 0 && deathTimer < 200) {
						Window.needStatic = true;
					} else {
						Window.needStatic = false;
						deather = true;
					}

					if (deathTimer == 1000) {
						death = false;
						Window.startGame = false;
						limit = 200;
						timer = 3000;
						isReversed = false;
						FoxyTimer = 0;
						FoxTimer = 0;
						FreddyTimer = 0;
						BonnieTimer = 0;
						ChickaTimer = 0;
						newsTimer = 0;
						powerOutTimer = 0;
						monitorTimer = 0;
						BonnieTick = 0;
						ChickaTick = 0;
						FreddyTick = 0;
						FoxyTick = 0;
						monitorTransition = false;
						movementRepeater = 0;
						staticTimer = 0;
						death = false;
						canMove = false;
						move = false;
						deathTimer = 0;
						foxyTime = false;
						foxyTimeTimer = 0;
						deather = false;
						gameTimer = 0;
						gameWin = false;
						gameWinTimer = 0;
						Window.needToMove = true;
						Window.needStatic = false;
						Window.Static = 1;
						Window.startGame = false;
						Window.startClicked = false;
						Window.cameraLocation = "Show Stage";
						Window.officeView = -100;
						Window.Fox = 1;
						Window.bonnie = 1;
						Window.foxdie = 1;
						Window.freddie = 1;
						Window.chicka = 1;
						Window.powerOut = 1;
						Bonnie.inRoom = 0;
						Bonnie.playerdeath = false;
						Chicka.inRoom = 0;
						Chicka.playerdeath = false;
						Freddy.inRoom = 0;
						Freddy.playerdeath = false;
						Foxy.stage = 0;
						Office.light1on = false;
						Office.light2on = false;
						Office.door1open = true;
						Office.door2open = true;
						Office.monitorUp = false;
						Office.powerRemaining = 100.0;
					}
				}

				if (Window.startGame) {
					if (gameTimer < 27000) {
						++gameTimer;
					}

					if (gameTimer == 27000) {
						gameWin = true;
					}
				}

				if (gameWin) {
					if (gameWinTimer < 700) {
						++gameWinTimer;
					}

					if (gameWinTimer == 700) {
						gameWin = false;
						Window.startGame = false;
						limit = 200;
						timer = 3000;
						isReversed = false;
						FoxyTimer = 0;
						FoxTimer = 0;
						FreddyTimer = 0;
						BonnieTimer = 0;
						ChickaTimer = 0;
						newsTimer = 0;
						powerOutTimer = 0;
						monitorTimer = 0;
						BonnieTick = 0;
						ChickaTick = 0;
						FreddyTick = 0;
						FoxyTick = 0;
						monitorTransition = false;
						movementRepeater = 0;
						staticTimer = 0;
						death = false;
						canMove = false;
						move = false;
						deathTimer = 0;
						foxyTime = false;
						foxyTimeTimer = 0;
						deather = false;
						gameTimer = 0;
						gameWin = false;
						gameWinTimer = 0;
						Window.needToMove = true;
						Window.needStatic = false;
						Window.Static = 1;
						Window.startGame = false;
						Window.startClicked = false;
						Window.cameraLocation = "Show Stage";
						Window.officeView = -100;
						Window.Fox = 1;
						Window.bonnie = 1;
						Window.foxdie = 1;
						Window.freddie = 1;
						Window.chicka = 1;
						Window.powerOut = 1;
						Bonnie.inRoom = 0;
						Bonnie.playerdeath = false;
						Chicka.inRoom = 0;
						Chicka.playerdeath = false;
						Freddy.inRoom = 0;
						Freddy.playerdeath = false;
						Foxy.stage = 0;
						Office.light1on = false;
						Office.light2on = false;
						Office.door1open = true;
						Office.door2open = true;
						Office.monitorUp = false;
						Office.powerRemaining = 100.0;
					}
				}

				if (foxyTime) {
					if (foxyTimeTimer < 50) {
						++foxyTimeTimer;
					}

					if (foxyTimeTimer == 50) {
						if (Office.door1open) {
							Foxy.playerDeath = true;
						} else {
							Window.knock.play();
							Foxy.stage = 1;
							foxyTime = false;
						}
					}
				}

				if (Window.needToMove) {
					if (Window.cameraPosition == 0 && timer == 2000) {
						isReversed = false;
						timer = 0;
					}

					if (Window.cameraPosition == limit && timer == 2000) {
						isReversed = true;
						timer = 0;
					}

					if (!isReversed && Window.cameraPosition < limit) {
						++Window.cameraPosition;
						timer = 0;
					}

					if (isReversed && Window.cameraPosition > 0) {
						--Window.cameraPosition;
						timer = 0;
					}

					if (Window.cameraPosition == 0 && timer != 2000) {
						timer += 10;
					}

					if (Window.cameraPosition == limit && timer != 2000) {
						timer += 10;
					}
				}

				if (Window.startGame) {
					if (BonnieTick < 1000) {
						++BonnieTick;
					}

					if (BonnieTick == 1000) {
						Bonnie.tick();
						BonnieTick = 0;
					}

					if (ChickaTick < 1300) {
						++ChickaTick;
					}

					if (ChickaTick == 1300) {
						Chicka.tick();
						ChickaTick = 0;
					}

					if (FreddyTick < 1700) {
						++FreddyTick;
					}

					if (FreddyTick == 1700) {
						Freddy.tick();
						FreddyTick = 0;
					}

					if (FoxyTick < 1900) {
						++FoxyTick;
					}

					if (FoxyTick == 1900) {
						Foxy.tick();
						FoxyTick = 0;
					}
				}

				if (move && canMove) {
					if (mouseX < 400 && Window.officeView + 5 <= 0) {
						Window.officeView += 5;
					} else if (mouseX > 880 && Window.officeView - 5 > -300) {
						Window.officeView -= 5;
					}

					move = false;
				}

				if (!move) {
					if (movementRepeater < 1) {
						++movementRepeater;
					}

					if (movementRepeater == 1) {
						move = true;
						movementRepeater = 0;
					}
				}

				if (monitorTransition) {
					if (monitorTimer < 20) {
						++monitorTimer;
					}

					if (monitorTimer == 20) {
						monitorTransition = false;
					}
				}

				if (Chicka.playerdeath && !Office.monitorUp) {
					if (ChickaTimer < 4) {
						++ChickaTimer;
					}

					if (ChickaTimer == 4) {
						switch (Window.chicka) {
							case 1:
								Window.chicka = 2;
								ChickaTimer = 0;
								break;
							case 2:
								Window.chicka = 3;
								ChickaTimer = 0;
								break;
							case 3:
								Window.chicka = 4;
								ChickaTimer = 0;
								break;
							case 4:
								Window.chicka = 5;
								ChickaTimer = 0;
								break;
							case 5:
								Window.chicka = 6;
								ChickaTimer = 0;
								break;
							case 6:
								Window.chicka = 7;
								ChickaTimer = 0;
								break;
							case 7:
								Window.chicka = 8;
								ChickaTimer = 0;
								break;
							case 8:
								Window.chicka = 9;
								ChickaTimer = 0;
								break;
							case 9:
								Window.chicka = 10;
								ChickaTimer = 0;
								break;
							case 10:
								Window.chicka = 11;
								ChickaTimer = 0;
								break;
							case 11:
								Window.chicka = 12;
								ChickaTimer = 0;
								break;
							case 12:
								Window.chicka = 13;
								ChickaTimer = 0;
								break;
							case 13:
								Window.chicka = 14;
								ChickaTimer = 0;
								break;
							case 14:
								Window.chicka = 15;
								ChickaTimer = 0;
								break;
							case 15:
								Window.chicka = 16;
								ChickaTimer = 0;
								break;
							case 16:
								Window.chicka = 0;
								death = true;
								ChickaTimer = 0;
						}
					}
				}

				if (Foxy.playerDeath) {
					if (FoxTimer < 4) {
						++FoxTimer;
					}

					if (FoxTimer == 4) {
						switch (Window.foxdie) {
							case 1:
								Window.foxdie = 2;
								FoxTimer = 0;
								break;
							case 2:
								Window.foxdie = 3;
								FoxTimer = 0;
								break;
							case 3:
								Window.foxdie = 4;
								FoxTimer = 0;
								break;
							case 4:
								Window.foxdie = 5;
								FoxTimer = 0;
								break;
							case 5:
								Window.foxdie = 6;
								FoxTimer = 0;
								break;
							case 6:
								Window.foxdie = 7;
								FoxTimer = 0;
								break;
							case 7:
								Window.foxdie = 8;
								FoxTimer = 0;
								break;
							case 8:
								Window.foxdie = 9;
								FoxTimer = 0;
								break;
							case 9:
								Window.foxdie = 10;
								FoxTimer = 0;
								break;
							case 10:
								Window.foxdie = 11;
								FoxTimer = 0;
								break;
							case 11:
								Window.foxdie = 12;
								FoxTimer = 0;
								break;
							case 12:
								Window.foxdie = 13;
								FoxTimer = 0;
								break;
							case 13:
								Window.foxdie = 14;
								FoxTimer = 0;
								break;
							case 14:
								Window.foxdie = 15;
								FoxTimer = 0;
								break;
							case 15:
								Window.foxdie = 16;
								FoxTimer = 0;
								break;
							case 16:
								Window.foxdie = 17;
								FoxTimer = 0;
								break;
							case 17:
								Window.foxdie = 18;
								FoxTimer = 0;
								break;
							case 18:
								Window.foxdie = 19;
								FoxTimer = 0;
								break;
							case 19:
								Window.foxdie = 0;
								death = true;
								FoxTimer = 0;
						}
					}
				}

				if (Office.monitorUp && Window.cameraLocation.equals("West Hall A")) {
					if (FoxyTimer < 4) {
						++FoxyTimer;
					}

					if (FoxyTimer == 4) {
						switch (Window.Fox) {
							case 1:
								Window.Fox = 2;
								FoxyTimer = 0;
								break;
							case 2:
								Window.Fox = 3;
								FoxyTimer = 0;
								break;
							case 3:
								Window.Fox = 4;
								FoxyTimer = 0;
								break;
							case 4:
								Window.Fox = 5;
								FoxyTimer = 0;
								break;
							case 5:
								Window.Fox = 6;
								FoxyTimer = 0;
								break;
							case 6:
								Window.Fox = 7;
								FoxyTimer = 0;
								break;
							case 7:
								Window.Fox = 8;
								FoxyTimer = 0;
								break;
							case 8:
								Window.Fox = 9;
								FoxyTimer = 0;
								break;
							case 9:
								Window.Fox = 10;
								FoxyTimer = 0;
								break;
							case 10:
								Window.Fox = 11;
								FoxyTimer = 0;
								break;
							case 11:
								Window.Fox = 12;
								FoxyTimer = 0;
								break;
							case 12:
								Window.Fox = 13;
								FoxyTimer = 0;
								break;
							case 13:
								Window.Fox = 14;
								FoxyTimer = 0;
								break;
							case 14:
								Window.Fox = 15;
								FoxyTimer = 0;
								break;
							case 15:
								Window.Fox = 16;
								FoxyTimer = 0;
								break;
							case 16:
								Window.Fox = 17;
								FoxyTimer = 0;
								break;
							case 17:
								Window.Fox = 18;
								FoxyTimer = 0;
								break;
							case 18:
								Window.Fox = 19;
								FoxyTimer = 0;
								break;
							case 19:
								Window.Fox = 20;
								FoxyTimer = 0;
								break;
							case 20:
								Window.Fox = 21;
								FoxyTimer = 0;
								break;
							case 21:
								Window.Fox = 22;
								FoxyTimer = 0;
								break;
							case 22:
								Window.Fox = 23;
								FoxyTimer = 0;
								break;
							case 23:
								Window.Fox = 24;
								FoxyTimer = 0;
								break;
							case 24:
								Window.Fox = 25;
								FoxyTimer = 0;
								break;
							case 25:
								Window.Fox = 26;
								FoxyTimer = 0;
								break;
							case 26:
								Window.Fox = 27;
								FoxyTimer = 0;
								break;
							case 27:
								Window.Fox = 28;
								FoxyTimer = 0;
								break;
							case 28:
								Window.Fox = 29;
								FoxyTimer = 0;
								break;
							case 29:
								Window.Fox = 30;
								FoxyTimer = 0;
								break;
							case 30:
								Window.Fox = 31;
								FoxyTimer = 0;
								break;
							case 31:
								Office.monitorUp = false;
								foxyTime = true;
								Window.Fox = 0;
								FoxyTimer = 0;
						}
					}
				}

				if (Bonnie.playerdeath && !Office.monitorUp) {
					if (BonnieTimer < 4) {
						++BonnieTimer;
					}

					if (BonnieTimer == 4) {
						switch (Window.bonnie) {
							case 1:
								Window.bonnie = 2;
								BonnieTimer = 0;
								break;
							case 2:
								Window.bonnie = 3;
								BonnieTimer = 0;
								break;
							case 3:
								Window.bonnie = 4;
								BonnieTimer = 0;
								break;
							case 4:
								Window.bonnie = 5;
								BonnieTimer = 0;
								break;
							case 5:
								Window.bonnie = 6;
								BonnieTimer = 0;
								break;
							case 6:
								Window.bonnie = 7;
								BonnieTimer = 0;
								break;
							case 7:
								Window.bonnie = 8;
								BonnieTimer = 0;
								break;
							case 8:
								Window.bonnie = 9;
								BonnieTimer = 0;
								break;
							case 9:
								Window.bonnie = 10;
								BonnieTimer = 0;
								break;
							case 10:
								Window.bonnie = 11;
								BonnieTimer = 0;
								break;
							case 11:
								Window.bonnie = 0;
								death = true;
								BonnieTimer = 0;
						}
					}
				}

				if (Freddy.playerdeath && !Office.monitorUp) {
					if (FreddyTimer < 4) {
						++FreddyTimer;
					}

					if (FreddyTimer == 4) {
						switch (Window.freddie) {
							case 1:
								Window.freddie = 2;
								FreddyTimer = 0;
								break;
							case 2:
								Window.freddie = 3;
								FreddyTimer = 0;
								break;
							case 3:
								Window.freddie = 4;
								FreddyTimer = 0;
								break;
							case 4:
								Window.freddie = 5;
								FreddyTimer = 0;
								break;
							case 5:
								Window.freddie = 6;
								FreddyTimer = 0;
								break;
							case 6:
								Window.freddie = 7;
								FreddyTimer = 0;
								break;
							case 7:
								Window.freddie = 8;
								FreddyTimer = 0;
								break;
							case 8:
								Window.freddie = 9;
								FreddyTimer = 0;
								break;
							case 9:
								Window.freddie = 10;
								FreddyTimer = 0;
								break;
							case 10:
								Window.freddie = 11;
								FreddyTimer = 0;
								break;
							case 11:
								Window.freddie = 12;
								FreddyTimer = 0;
								break;
							case 12:
								Window.freddie = 13;
								FreddyTimer = 0;
								break;
							case 13:
								Window.freddie = 14;
								FreddyTimer = 0;
								break;
							case 14:
								Window.freddie = 15;
								FreddyTimer = 0;
								break;
							case 15:
								Window.freddie = 16;
								FreddyTimer = 0;
								break;
							case 16:
								Window.freddie = 17;
								FreddyTimer = 0;
								break;
							case 17:
								Window.freddie = 18;
								FreddyTimer = 0;
								break;
							case 18:
								Window.freddie = 19;
								FreddyTimer = 0;
								break;
							case 19:
								Window.freddie = 20;
								FreddyTimer = 0;
								break;
							case 20:
								Window.freddie = 21;
								FreddyTimer = 0;
								break;
							case 21:
								Window.freddie = 22;
								FreddyTimer = 0;
								break;
							case 22:
								Window.freddie = 23;
								FreddyTimer = 0;
								break;
							case 23:
								Window.freddie = 24;
								FreddyTimer = 0;
								break;
							case 24:
								Window.freddie = 25;
								FreddyTimer = 0;
								break;
							case 25:
								Window.freddie = 26;
								FreddyTimer = 0;
								break;
							case 26:
								Window.freddie = 27;
								FreddyTimer = 0;
								break;
							case 27:
								Window.freddie = 28;
								FreddyTimer = 0;
								break;
							case 28:
								Window.freddie = 0;
								death = true;
								FreddyTimer = 0;
						}
					}
				}

				if (Office.powerRemaining == 0.0) {
					if (powerOutTimer < 4) {
						++powerOutTimer;
					}

					if (powerOutTimer == 4) {
						switch (Window.powerOut) {
							case 1:
								Window.powerOut = 2;
								powerOutTimer = 0;
								break;
							case 2:
								Window.powerOut = 3;
								powerOutTimer = 0;
								break;
							case 3:
								Window.powerOut = 4;
								powerOutTimer = 0;
								break;
							case 4:
								Window.powerOut = 5;
								powerOutTimer = 0;
								break;
							case 5:
								Window.powerOut = 6;
								powerOutTimer = 0;
								break;
							case 6:
								Window.powerOut = 7;
								powerOutTimer = 0;
								break;
							case 7:
								Window.powerOut = 8;
								powerOutTimer = 0;
								break;
							case 8:
								Window.powerOut = 9;
								powerOutTimer = 0;
								break;
							case 9:
								Window.powerOut = 10;
								powerOutTimer = 0;
								break;
							case 10:
								Window.powerOut = 11;
								powerOutTimer = 0;
								break;
							case 11:
								Window.powerOut = 12;
								powerOutTimer = 0;
								break;
							case 12:
								Window.powerOut = 13;
								powerOutTimer = 0;
								break;
							case 13:
								Window.powerOut = 14;
								powerOutTimer = 0;
								break;
							case 14:
								Window.powerOut = 15;
								powerOutTimer = 0;
								break;
							case 15:
								Window.powerOut = 16;
								powerOutTimer = 0;
								break;
							case 16:
								Window.powerOut = 17;
								powerOutTimer = 0;
								break;
							case 17:
								Window.powerOut = 18;
								powerOutTimer = 0;
								break;
							case 18:
								Window.powerOut = 19;
								powerOutTimer = 0;
								break;
							case 19:
								Window.powerOut = 20;
								powerOutTimer = 0;
								break;
							case 20:
								Office.powerRemaining = -1.0;
								Window.powerOut = 0;
								powerOutTimer = 0;
						}
					}
				}

				if (this.StaticTimer < 6) {
					++this.StaticTimer;
				}

				if (this.StaticTimer == 6) {
					switch (Window.Static) {
						case 1:
							Window.Static = 2;
							this.StaticTimer = 0;
							break;
						case 2:
							Window.Static = 3;
							this.StaticTimer = 0;
							break;
						case 3:
							Window.Static = 4;
							this.StaticTimer = 0;
							break;
						case 4:
							Window.Static = 5;
							this.StaticTimer = 0;
							break;
						case 5:
							Window.Static = 6;
							this.StaticTimer = 0;
							break;
						case 6:
							Window.Static = 7;
							this.StaticTimer = 0;
							break;
						case 7:
							Window.Static = 8;
							this.StaticTimer = 0;
							break;
						case 8:
							Window.Static = 1;
							this.StaticTimer = 0;
					}
				}

				if (Window.startClicked) {
					if (newsTimer < 500) {
						++newsTimer;
					}

					if (newsTimer == 500) {
						newsTimer = 0;
						Window.startGame = true;
						Window.startClicked = false;
						Window.blip.play();
					}
				}

				if (Window.startGame) {
					if (powerTick < 100) {
						++powerTick;
					}

					if (powerTick == 100) {
						Office.descreasepower();
						powerTick = 0;
					}
				}
			} catch (Exception var2) {
				var2.printStackTrace();
			}
		}
	}

	public Main() {
		Window window = new Window();
		window.addMouseListener(this);
		window.addMouseMotionListener(this);
	}

	public void mouseClicked(MouseEvent e) {
		if (!Window.startGame && e.getX() >= 100 && e.getX() <= 310 && e.getY() >= 400 && e.getY() <= 450) {
			Window.startClicked = true;
		}

		if (Window.startGame && e.getX() >= 30 && e.getX() <= 68 && e.getY() >= 383 && e.getY() <= 437 && !Office.light1on) {
			Office.light1on = true;
			Window.light.play();
		} else if (Window.startGame && e.getX() >= 30 && e.getX() <= 68 && e.getY() >= 383 && e.getY() <= 437 && Office.light1on) {
			Office.light1on = false;
			Window.light.stop();
		}

		if (Window.startGame && e.getX() >= 1212 && e.getX() <= 1246 && e.getY() >= 383 && e.getY() <= 437 && !Office.light2on) {
			Office.light2on = true;
			Window.light.play();
		} else if (Window.startGame && e.getX() >= 1212 && e.getX() <= 1246 && e.getY() >= 383 && e.getY() <= 437 && Office.light2on) {
			Office.light2on = false;
			Window.light.stop();
		}

		if (Window.startGame && e.getX() >= 30 && e.getX() <= 68 && e.getY() >= 300 && e.getY() <= 357 && Office.door1open) {
			Office.door1open = false;
			Window.door.play();
		} else if (Window.startGame && e.getX() >= 30 && e.getX() <= 68 && e.getY() >= 300 && e.getY() <= 357 && !Office.door1open) {
			Office.door1open = true;
			Window.door.play();
		}

		if (Window.startGame && e.getX() >= 1212 && e.getX() <= 1246 && e.getY() >= 300 && e.getY() <= 357 && Office.door2open) {
			Office.door2open = false;
			Window.door.play();
		} else if (Window.startGame && e.getX() >= 1212 && e.getX() <= 1246 && e.getY() >= 300 && e.getY() <= 357 && !Office.door2open) {
			Office.door2open = true;
			Window.door.play();
		}

		if (Office.monitorUp) {
			if (e.getX() >= 923 && e.getX() <= 973 && e.getY() >= 343 && e.getY() <= 377) {
				Window.cameraLocation = "Show Stage";
				Window.blip.play();
			}

			if (e.getX() >= 904 && e.getX() <= 954 && e.getY() >= 399 && e.getY() <= 433) {
				Window.cameraLocation = "Dining Area";
				Window.blip.play();
			}

			if (e.getX() >= 877 && e.getX() <= 927 && e.getY() >= 481 && e.getY() <= 515) {
				Window.cameraLocation = "Pirate Cove";
				Window.blip.play();
			}

			if (e.getX() >= 926 && e.getX() <= 976 && e.getY() >= 596 && e.getY() <= 630) {
				Window.cameraLocation = "West Hall A";
				Window.blip.play();
			}

			if (e.getX() >= 926 && e.getX() <= 976 && e.getY() >= 631 && e.getY() <= 665) {
				Window.cameraLocation = "West Hall B";
				Window.blip.play();
			}

			if (e.getX() >= 850 && e.getX() <= 900 && e.getY() >= 578 && e.getY() <= 612) {
				Window.cameraLocation = "Supply Closet";
				Window.blip.play();
			}

			if (e.getX() >= 1034 && e.getX() <= 1084 && e.getY() >= 596 && e.getY() <= 630) {
				Window.cameraLocation = "East Hall A";
				Window.blip.play();
			}

			if (e.getX() >= 1034 && e.getX() <= 1084 && e.getY() >= 631 && e.getY() <= 665) {
				Window.cameraLocation = "East Hall B";
				Window.blip.play();
			}

			if (e.getX() >= 796 && e.getX() <= 846 && e.getY() >= 431 && e.getY() <= 465) {
				Window.cameraLocation = "Backstage";
				Window.blip.play();
			}

			if (e.getX() >= 1146 && e.getX() <= 1196 && e.getY() >= 436 && e.getY() <= 470) {
				Window.cameraLocation = "Restrooms";
				Window.blip.play();
			}
		}

	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseDragged(MouseEvent arg0) {
	}

	public void mouseMoved(MouseEvent e) {
		if (Window.startGame && !Office.monitorUp && !monitorTransition && !Freddy.playerdeath && !Bonnie.playerdeath && !Chicka.playerdeath && !Foxy.playerDeath) {
			if (Window.officeView < -300 || Window.officeView > 0 || e.getX() >= 400 && e.getX() <= 880) {
				canMove = false;
			} else {
				canMove = true;
			}

			if (e.getX() > 360 && e.getY() > 660 && e.getX() < 860 && !Freddy.playerdeath && !Bonnie.playerdeath && !Chicka.playerdeath && !Foxy.playerDeath) {
				Office.monitorUp = true;
				Window.blip.play();
				monitorTransition = true;
				monitorTimer = 0;
			}
		}

		if (Window.startGame && Office.monitorUp && !monitorTransition && e.getX() > 360 && e.getY() > 660 && e.getX() < 860) {
			Office.monitorUp = false;
			Window.blip.play();
			monitorTransition = true;
			monitorTimer = 0;
		}

		mouseX = e.getX();
		mouseY = e.getY();
	}
}
