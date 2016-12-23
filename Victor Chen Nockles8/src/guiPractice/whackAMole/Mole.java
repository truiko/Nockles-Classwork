package guiPractice.whackAMole;

import guiPractice.components.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {

	private double appearanceTime;
		
	public Mole(int x, int y) {
		super(x, y, 1, "resources/sampleImages/mole.png");
		
	}

	@Override
	public double getAppearanceTime() {
		return appearanceTime;
	}

	@Override
	public void setAppearanceTime(int d) {
		this.appearanceTime = d;

	}

}
