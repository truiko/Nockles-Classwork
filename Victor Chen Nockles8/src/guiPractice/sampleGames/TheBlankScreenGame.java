package guiPractice.sampleGames;

import guiPractice.GUIApplication;
import guiPractice.Screen;

public class TheBlankScreenGame extends GUIApplication {

	@Override
	protected void initScreen() {
		Screen s = new BlackScreen(getWidth(),getHeight());
		setScreen(s);

	}

	public static void main(String[] args) {
		new TheBlankScreenGame();

	}

}
