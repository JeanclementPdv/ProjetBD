package main;

import javax.swing.*;

import controller.Board;


public class Main {

	public static void main(String[] args) {
		new Main();
		
	}
	
	/**
	 * 
	 * @author Jean-Clement Podevin
	 * 
	 * version 1.0
	 * 
	 * 
	 * Initialization method of The Game
	 
	 **/
		public Main(){
		JFrame fenetre = new  JFrame("Game");
		fenetre.add(new Board());
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(1088, 864);
		fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		fenetre.setVisible(true);
		
		
	}

}
