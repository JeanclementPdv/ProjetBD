package model;

import javax.swing.ImageIcon;
import java.awt.Image;

/**
 * 
 * @author Jean clement Podevin
 * 
 * @version 1.0
 * 
 *          <H1>Class Player
 *          <H1>
 */

public class Player {
	/*
	 * Initiate a player with X and Y , sprite of the player
	 */

	private int tileX, tileY;
	private Image player;
	public int p;

	/**
	 * Constructor of Player
	 */
	public Player() {

		ImageIcon img = new ImageIcon("C://persoup.png");
		player = img.getImage();

		tileX = 1;
		tileY = 1;
	}
	/**
	 * Allow to recover the Sprite of the player
	 * 
	 * @return Image of player
	 */
	public Image getPlayer() {
		return player;

	}
	/**
	 * Allow to recover the X postion of the player
	 * @return
	 	TileX*/
	public int getTileX() {
		return tileX;
	}
	/**
	 * Allow to recover the Y postion of the player
	 * @return
	 */
	
	public int getTileY() {
		return tileY;
	}
	/**
	 * Method for move the plyaer , add +1 at X or Y position
	 * @param dx
	 * @param dy
	 */
	public void move(int dx, int dy) {

		tileX += dx;
		tileY += dy;

	}
}
