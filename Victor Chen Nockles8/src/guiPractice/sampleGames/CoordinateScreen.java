package guiPractice.sampleGames;

import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class CoordinateScreen extends Screen {

	private TextLabel label;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
		label = new TextLabel(40,45,width-80,40,"");
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		
	}

}
