package guiPractice.sampleGames;

import guiPractice.GUIApplication;

public class ClickGraphicsGame extends GUIApplication {
	
	public static ClickableScreen screen;
	public static ClickGraphicsGame game;

	public ClickGraphicsGame() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initScreen() {
		screen = new ClickableScreen(getWidth(),
				getHeight());
		setScreen(screen);
	}

	public static void main(String[] args) {
		game = new ClickGraphicsGame();
		Thread app = new Thread(game);
		app.start();

	}

}
