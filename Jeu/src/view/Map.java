package view;
import java.awt.*;
import java.io.File;
import java.util.*;


import javax.swing.ImageIcon;

public class Map {
	private Scanner m;
	private static String map2D [][] = new String[26][26];
	private String map1D[] = new String[26];
	
	
	java.awt.Image terre;
	java.awt.Image mur;
	private Image diamant,
				  bolder,
				  terreKC,
				  monster;

	public Map(){
		
		ImageIcon img = new ImageIcon("C://Terre.png");
		terre = img.getImage();
		img = new ImageIcon("C://Mur.png");
		mur = img.getImage();
		img = new ImageIcon("C://diamant.png");
		diamant = img.getImage();
		img = new ImageIcon("C://rocher.png");
		bolder = img.getImage();
		img = new ImageIcon("C://TerreKC.png");
		terreKC = img.getImage();
		img = new ImageIcon("C://persod.png");
		
		openFile();
		readFile();
		closeFile();
		
	}
	public Image getMonster(){
		return monster;
	}
	public Image getTerre(){
		return terre;
	}
	
	public Image getMur(){
		return mur;
	}
	
	public Image getDiam(){
		return diamant;
	}
	public Image getBol(){
		return bolder;
	}
	
	public Image getTerreKC(){
		return terreKC;
		
	}
	
	
	public String getMap(int x, int y){
		String index = map2D[x][y];
		return index;
	}
	
	public boolean isElementExist(int x, int y, String s) {
		if (this.map2D[x][y] == s)
			return true;
		return false;
	}
	
	public static void setMap(int x, int y, String s){
		map2D[x][y] = s;
	}
	
	public void openFile(){
		try{
			m = new Scanner(new File("C://map1.txt"));
		}catch(Exception e){
			System.out.println("error loading map");
		}
	}
	
	public void readFile(){
		while(m.hasNext()){
			for(int i = 0;i < 26; i++){
				map1D[i] = m.next();
			}
			
		}
		for (int x = 0; x < 26 ; x++){
			for(int y = 0; y < 26; y++){
				map2D[x][y] = map1D[y].substring(x,x+1);
			}
			}
		}
	

	
	public void closeFile(){
		m.close();
	}

	
		
		
	}

