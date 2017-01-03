package guiPractice.whackAMole;

import java.util.ArrayList;

import guiPractice.components.Action;
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
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		moles = new ArrayList<MoleInterface>();
		player = getAPlayer();
		label = new TextLabel(getWidth()/2-60,getHeight()/2-30,120,60,"Ready...");
		timeLabel = new TextLabel(getWidth()/2-60,50,120,60,"");
		
		viewObjects.add(label);
		viewObjects.add(player);
		viewObjects.add(timeLabel);
		
	}

	/**
	*to implement later, after Character Team implements PlayerInterface
	*this is a placeholder because early in the same design process because
	*the players are not designed yet, so we use this method later
	*once we learn how to create a player
	*/
	private PlayerInterface getAPlayer() {
		return new Player(20,20);
	}

	/**
	*to implement later, after EnemyTeam implements MoleInterface
	*this is a placeholder because early in the same design process because
	*the enemies are not designed yet, so we use this method later
	*once we learn how to create an Enemy (Mole)
	*
	*/
	private MoleInterface getAMole() {
		return new Mole((int)(getWidth()*Math.random()) - 100, (int)(getHeight()*Math.random()));
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
		timeLabel.setText(""+timeLeft);
		while(timeLeft > 0){
			// frame updates every 100ms
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			timeLeft -= .1;
			timeLabel.setText(""+(int)(timeLeft*10/10.0));
			disappearMoles();
			addNewMoles();
		}
	}

	private void addNewMoles() {
		// probability of mole appearing depends on time left
		double probability = .2 + .1*(30.0-timeLeft)/30;
		if(Math.random() < probability){
			final MoleInterface mole = getAMole();
			// between .5 and 2.5 second
			mole.setAppearanceTime((int)(500+Math.random()*2000));
			mole.setAction(new Action(){
				public void act(){
					player.increaseScore(1);
					// remove mole from viewObjects
					remove(mole);
					// remove mole from database
					moles.remove(mole);
				}
			});
			// add mole to visible
			addObject(mole);
			// add mole to molelist
			moles.add(mole);
		}
	}

	private void disappearMoles() {
		// each mole has a "clock"
		// when the clock counts down to 0
		// it disappears
		for(int i = 0; i < moles.size(); i++){
			MoleInterface m = moles.get(i);
			m.setAppearanceTime((int) (m.getAppearanceTime() - 100));
			if(m.getAppearanceTime() <= 0){
				// remove from viewObjects
				remove(m);
				// remove it from our mole database
				moles.remove(i);
				i--;// compensate for i++
			}
		}
		
	}
}
