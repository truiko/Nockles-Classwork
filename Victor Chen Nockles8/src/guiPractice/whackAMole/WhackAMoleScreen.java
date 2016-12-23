package guiPractice.whackAMole;

import java.util.ArrayList;

import guiPractice.components.TextLabel;
import guiPractice.components.Visible;
import guiPractice.sampleGames.ClickableScreen;

public class WhackAMoleScreen extends ClickableScreen implements Runnable {
	
	 private ArrayList<MoleInterface> moles;
	 private PlayerInterface player;
	 private TextLabel label;
	 private TextLabel timeLabel;
	 private double timeLeft;

	public WhackAMoleScreen(int width, int height) {
		super(width, height);
		timeLeft = 60.0;
		Thread startText = new Thread(this);
		startText.start();
	}

	@Override
	public void initAllObjects(ArrayList<Visible> list) {
		getAPlayer();
		label = new TextLabel(250,150,760,40,"Ready...");
		timeLabel = new TextLabel(255,40,760,40,"60.0");
		
		addObject(label);
		addObject(timeLabel);
		
	}

	/**
	*to implement later, after Character Team implements PlayerInterface
	*/
	private PlayerInterface getAPlayer() {
		return null;
	}

	/**
	*to implement later, after EnemyTeam implements MoleInterface
	*/
	private MoleInterface getAMole() {
		return null;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
