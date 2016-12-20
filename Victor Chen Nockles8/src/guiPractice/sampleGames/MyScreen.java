package guiPractice.sampleGames;

import java.awt.Color;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.Button;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class MyScreen extends Screen {

	private Graphic doge;
	private Button back;
	
	public MyScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		doge = new Graphic(50,50,.5,"resources/sampleImages/doge.jpg");
		back = new Button(50,50,100,60,"Back", Color.GRAY, new Action(){

			@Override
			public void act() {
				MouseFollower.game.setScreen(MouseFollower.coordScreen);
			}
			
		});
		viewObjects.add(doge);
		viewObjects.add(back);
	}
}
