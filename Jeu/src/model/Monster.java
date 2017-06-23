package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Monster {

	int random;
	private int tileMX, tileMY;
	
	
	private Image monster;

	public int f;
	public Monster(){
		
		
		ImageIcon img = new ImageIcon("C://monstre.png");
		monster = img.getImage();
		
		
	
		tileMX = 19;
		tileMY = 18;
		
		
	}
	
	public Image getMonster(){
		return monster;
		
	}

	public int getTileMX(){
		return tileMX;
	}
	public int getTileMY(){
		return tileMY;
	}
	
	
public void moveM(int dx, int dy){
	
		
		tileMX += dx;
		tileMY += dy;
		
	}

public int setTileMX(int tileMX) {
	return this.tileMX = tileMX;
}

public int setTileMY(int tileMY) {
	return this.tileMY = tileMY;
}
} 


