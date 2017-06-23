package view;

import java.awt.*;
import java.io.File;
import java.util.*;

import javax.swing.ImageIcon;

/**
 * <H1>The class Map
 * <H1>
 * 
 * @author Maxime Hollebecq
 *
 *         Version 1.0
 */
public class Map {
	/**
	 * The method scanner , scan the map
	 * 
	 * Map2D it's a two dimensional Table
	 * 
	 * Map1D it's a Table at one dimesion
	 */
	private Scanner m;
	private static String map2D[][] = new String[26][26];
	private String map1D[] = new String[26];
	/**
	 * Initiate the sprite of different element who will be in the map
	 */

	java.awt.Image Dirt;
	java.awt.Image Wall;
	private Image Diamond, boulder, BreakDirt, monster;

	/**
	 * The constructor Map
	 * 
	 * Creation and Initialization of different Sprite
	 */

	public Map() {

		ImageIcon img = new ImageIcon("C://Terre.png");
		Dirt = img.getImage();
		img = new ImageIcon("C://Mur.png");
		Wall = img.getImage();
		img = new ImageIcon("C://diamant.png");
		Diamond = img.getImage();
		img = new ImageIcon("C://bolder.png");
		boulder = img.getImage();
		img = new ImageIcon("C://TerreKC.png");
		BreakDirt = img.getImage();
		img = new ImageIcon("C://persod.png");

		/**
		 * These three method have for goal to open, read and close the
		 * different Sprite with the Path
		 */

		openFile();
		readFile();
		closeFile();

	}

	public Image getMonster() {
		return monster;
	}

	/**
	 * Allow to recover the Monster
	 * 
	 * @return
	 */

	public Image getDirt() {
		return Dirt;
	}

	/**
	 * Allow to recover the Dirt
	 * 
	 * @return
	 */

	public Image getWall() {
		return Wall;
	}

	/**
	 * Allow to recover the Wall
	 * 
	 * @return
	 */

	public Image getDiam() {
		return Diamond;
	}

	/**
	 * Allow to recover the Diam
	 * 
	 * @return
	 */
	public Image getBol() {
		return boulder;
	}

	/**
	 * Allow to recover the Bol
	 * 
	 * @return
	 */

	public Image getBreakDirt() {
		return BreakDirt;
	}

	/**
	 * Allow to recover the BreakDirt
	 * 
	 * @return
	 */

	/**
	 * Allow to recover the MAP2D
	 * 
	 * @return
	 */
	public String getMap(int x, int y) {
		String index = map2D[x][y];
		return index;
	}

	/**
	 * Modify the x and y
	 * 
	 * @param x
	 * @param y
	 * @param s
	 */
	public static void setMap(int x, int y, String s) {
		map2D[x][y] = s;
	}

	/**
	 * Open the Field Map
	 * 
	 * And if there is an error : write "error loading map"
	 */
	public void openFile() {
		try {
			m = new Scanner(new File("C://map.txt"));
		} catch (Exception e) {
			System.out.println("error loading map");
		}
	}

	/**
	 * Read Filed Map
	 */
	public void readFile() {
		while (m.hasNext()) {
			for (int i = 0; i < 26; i++) {
				map1D[i] = m.next();
			}

		}
		for (int x = 0; x < 26; x++) {
			for (int y = 0; y < 26; y++) {
				map2D[x][y] = map1D[y].substring(x, x + 1);
			}
		}
	}

	/**
	 * Close the field Map
	 */

	public void closeFile() {
		m.close();
	}

}
