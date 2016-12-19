package guiPractice.components;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class Graphic implements Visible {

	// FIELDS
	private int x;
	private int y;
	private BufferedImage image;
	private boolean loadedImages;
	
	public Graphic(int x, int y, String imageLocation) {
		this.x = x;
		this.y = y;
		loadedImages = false;
		loadImages(imageLocation,0,0);
		
	}

	public Graphic(int x, int y, int w, int h, String imageLocation) {
		this.x = x;
		this.y = y;
		loadedImages = false;
		loadImages(imageLocation, w, h);
		
	}
	
	private void loadImages(String imageLocation, int w, int h) {
		try{
			// get the image from file (FULL SIZE)
			ImageIcon icon = new ImageIcon(imageLocation);
			
			if(w == 0 && h == 0){
				// use original size
				image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
				// draw icon onto image
				Graphics2D g = image.createGraphics();
				g.drawImage(icon.getImage(), 0, 0, null);
			}else{
				// use custom size 
				image = new BufferedImage(w,h,BufferedImage.TYPE_INT_ARGB);
				Graphics2D g = image.createGraphics();
				// select coordinates of top left rectangle within image
				// then select width and height to 
				// display graphic
				// then of the icon you want to display
				// select x,y coordinate and width height
				// this can split an image into parts
				g.drawImage(icon.getImage(), 0, 0, w,h,0,0,icon.getIconWidth(), icon.getIconHeight(),null);
			}
			loadedImages = true;
		}catch(Exception e){
			//in case file is not found
			e.printStackTrace();
		}
		
	}

	private void loadImages(String imageLocation, double scale) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BufferedImage getImage() {
		// TODO Auto-generated method stub
		return image;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return image.getWidth();
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return image.getHeight();
	}

	@Override
	public boolean isAnimated() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update() {
		// does nothing, image never changes

	}

}
