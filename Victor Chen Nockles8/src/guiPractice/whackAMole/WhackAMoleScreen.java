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
		timeLeft = 30.0;
		Thread startText = new Thread(this);
		startText.start();
	}

	@Override
	public void initAllObjects(ArrayList<Visible> list) {
		moles = new ArrayList<MoleInterface>();
//		player = getAPlayer();
		label = new TextLabel(getWidth()/2-60,getHeight()/2-30,120,60,"Ready...");
		timeLabel = new TextLabel(getWidth()/2-60,50,120,60,"");
		
		addObject(label);
//		addObject(player);
		addObject(timeLabel);
		
	}

	/**
	*to implement later, after Character Team implements PlayerInterface
	*this is a placeholder because early in the same design process because
	*the players are not designed yet, so we use this method later
	*once we learn how to create a player
	*/
	private PlayerInterface getAPlayer() {
		return null;
	}

	/**
	*to implement later, after EnemyTeam implements MoleInterface
	*this is a placeholder because early in the same design process because
	*the enemies are not designed yet, so we use this method later
	*once we learn how to create an Enemy (Mole)
	*
	*/
	private MoleInterface getAMole() {
		return null;
	}

	public void update(){
		super.update();
	}
	
	private void changeText(String s){
		try{
			Thread.sleep(1000);
			label.setText(s);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		changeText("Set...");
		changeText("Go!");
		changeText("");
	}
}
