package guiPractice.sampleGames;

import guiPractice.GUIApplication;

public class MouseFollower extends GUIApplication {

	private CoordinateScreen coordScreen;
	
	public static void main(String[] args){
		new MouseFollower();
	}
	@Override
	protected void initScreen() {
		coordScreen = new CoordinateScreen(getWidth(), getHeight());
		setScreen(coordScreen);
	}

}