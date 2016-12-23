package guiPractice.whackAMole;

import guiPractice.components.Action;
import guiPractice.components.Clickable;

public interface MoleInterface extends Clickable {

	double getAppearanceTime();

	void setAppearanceTime(int i);

	void setAction(Action action);

}
