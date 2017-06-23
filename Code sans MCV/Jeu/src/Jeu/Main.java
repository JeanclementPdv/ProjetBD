package Jeu;

import javax.swing.*;



public class Main {

	public static void main(String[] args) {
		new Main();
		
	}
		public Main(){
		JFrame fenetre = new  JFrame("Jeu");
		fenetre.add(new Panneau());
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(1088, 864);
		fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		fenetre.setVisible(true);
		
		
	}

}
