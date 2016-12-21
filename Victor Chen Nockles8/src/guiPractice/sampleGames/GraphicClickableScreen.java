package guiPractice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.ClickableGraphic;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class GraphicClickableScreen extends ClickableScreen implements MouseListener {

	private ClickableGraphic doge;
	
	public GraphicClickableScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(doge.isHovered(e.getX(), e.getY())){
			doge.act();
		}
		
	}

//	@Override
//	public void initObjects(ArrayList<Visible> viewObjects) {
//		doge = new ClickableGraphic(50,50,1.3,"resources/sampleImages/doge.jpg");
//		doge.setAction(new Action(){
//
//			@Override
//			public void act() {
//				doge.setX(doge.getX() + 10);
//				doge.setY(doge.getY() + 10);
//				
//			}
//			
//		});
//		viewObjects.add(doge);
//		
//	}
	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public MouseListener getMouseListener(){
		return this;
	}

	@Override
	public void initAllObjects(ArrayList<Visible> list) {
		doge = new ClickableGraphic(50,50,1.3,"resources/sampleImages/doge.jpg");
		doge.setAction(new Action(){

			@Override
			public void act() {
				doge.setX(doge.getX() + 10);
				doge.setY(doge.getY() + 10);
				
			}
			
		});
		list.add(doge);
		
	}
}
