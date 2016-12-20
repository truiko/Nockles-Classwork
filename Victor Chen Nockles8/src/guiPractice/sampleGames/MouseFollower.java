package guiPractice.sampleGames;

import guiPractice.GUIApplication;

public class MouseFollower extends GUIApplication {

	public static CoordinateScreen coordScreen;
	public static MyScreen myScreen;
	public static MouseFollower game;
	
	public static void main(String[] args){
		game = new MouseFollower();
		Thread app = new Thread(game);
		app.start();
	}
	
	@Override
	protected void initScreen() {
		myScreen = new MyScreen(getWidth(),
				getHeight());
		coordScreen = new CoordinateScreen(getWidth(),
				getHeight());
		setScreen(coordScreen);
	}

}
