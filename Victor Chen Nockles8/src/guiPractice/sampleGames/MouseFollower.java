package guiPractice.sampleGames;

import guiPractice.GUIApplication;

public class MouseFollower extends GUIApplication {

	public static CoordinateScreen coordScreen;
	public static MyScreen myScreen;
	public static MouseFollower game;
	
	public static void main(String[] args){
		GUIApplication game = new MouseFollower();
		Thread app = new Thread(game);
		app.start();
	}
	
	@Override
	protected void initScreen() {
		coordScreen = new CoordinateScreen(getWidth(),
				getHeight());
//		setScreen(coordScreen);
	}

}
