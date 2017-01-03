package guiPractice.Simon;

import java.util.ArrayList;

import guiPractice.components.Button;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;
import guiPractice.sampleGames.ClickableScreen;

public class SimonScreenVictor extends ClickableScreen implements Runnable {
	
	private ProgressInterfaceVictor progress;
	private ArrayList<MoveInterfaceVictor> moves;
	private ButtonInterfaceVictor[] buttons;
	private int roundNumber;
	private int lastSelectedButton;
	private boolean validInput;
	private TextLabel label;

	public SimonScreenVictor(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		addButtons();
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		moves = new ArrayList<MoveInterfaceVictor>();
		lastSelectedButton = -1;
		moves.add(randomMove());
		moves.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(label);
		
	}

	private MoveInterfaceVictor randomMove() {
		Button b = null;
		b = (Button) buttons[(int) (Math.random()*buttons.length)];
		return getMove(b);
	}
	
	private MoveInterfaceVictor getMove(Button b) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	Placeholder until partner finishes implementation of ProgressInterface
	 */
	private ProgressInterfaceVictor getProgress() {
		
		return null;
	}

	private void addButtons() {
		int numberOfButtons = 6;
		
	}

}
