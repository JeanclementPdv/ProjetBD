package controller;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import model.Monster;
import model.Player;
import view.Map;


public class Board extends JPanel implements ActionListener {
	private Timer timer;
	private Map m;
	private Player p;
	private Monster f;
	public int PlayerX;
	public int PlayerY;
	public int MonsterX;
	public int MonsterY;
	int move = 1;
	int moveM = 1;
	int DiamondTaken = 0;
	String mort = "Perdu";
	int deplace = 0;
	String message = "Gagné";
	int die = 0;

	public Board() {
		setM(new Map());
		p = new Player();
		f = new Monster();
		addKeyListener(new Al());
		setFocusable(true);
		timer = new Timer(10, this);
		timer.start();



	}

	public void actionPerformed(ActionEvent e) {
		repaint();
	}

	public void paint(Graphics g) {
		super.paint(g);

		for (int x = 0; x < 26; x++) {
			for (int y = 0; y < 26; y++) {

				if (getM().getMap(x, y).equals("r")) {
					g.drawImage(getM().getTerre(), x * 32, y * 32, null);
				}
				if (getM().getMap(x, y).equals("m")) {
					g.drawImage(getM().getMur(), x * 32, y * 32, null);
				}
				if (getM().getMap(x, y).equals("d")) {
					g.drawImage(getM().getDiam(), x * 32, y * 32, null);
				}
				if (getM().getMap(x, y).equals("b")) {
					g.drawImage(getM().getBol(), x * 32, y * 32, null);
				}
				if (getM().getMap(x, y).equals("t")) {
					g.drawImage(getM().getTerreKC(), x * 32, y * 32, null);
				}
				
				if (m.getMap(x, y).equals("b") && m.getMap(x, y + 1).equals("t")) {
					Map.setMap(x, y, "t");
					Map.setMap(x, y +1, "b");
				}
				if (m.getMap(x, y).equals("d") && m.getMap(x, y + 1).equals("t")) {
					Map.setMap(x, y, "t");
					Map.setMap(x, y + 1, "d");
				}
				
				
				
				if (m.getMap(p.getTileX(), p.getTileY()).equals("b")) {
					g.drawString(mort, 900, 160);
					System.exit(1);
				}
			

				if (m.getMap(p.getTileX(), p.getTileY()).equals("d")) {
					die = die + 1;
					if (die == 200) {
						System.exit(1);
					}
				}
			}

		}
		

			if (deplace == 1) {
				Map.setMap(PlayerX, PlayerY, "t");
				deplace = 0;
			}

			if (DiamondTaken == 6) {
				g.drawString(message, 900, 160);
				System.exit(1);
			}
			g.drawImage(p.getPlayer(), p.getTileX() * 32, p.getTileY() * 32, null);
			
			g.drawImage(f.getMonster(), f.getTileMX() * 32, f.getTileMY() * 32, null);
		
		}
	

	public Map getM() {
		return m;
	}

	public void setM(Map m) {
		this.m = m;
	}

	public class Al extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keycode = e.getKeyCode();

			if (keycode == KeyEvent.VK_Z) {
				if (!(getM().getMap(p.getTileX(), p.getTileY() - 1).equals("m"))
						^ (getM().getMap(p.getTileX(), p.getTileY() - 1).equals("b"))) {
					if (getM().getMap(p.getTileX(), (p.getTileY() - 1)).equals("d")) {
						DiamondTaken = DiamondTaken +1;
					}
					p.move(0, -1);
				}
				PlayerX = p.getTileX();
				PlayerY = p.getTileY();
				deplace = 1;
			}

			if (keycode == KeyEvent.VK_S) {
				if (!(getM().getMap(p.getTileX(), p.getTileY() + 1).equals("m"))
						^ (getM().getMap(p.getTileX(), p.getTileY() + 1).equals("b"))) {
					if (getM().getMap(p.getTileX(), (p.getTileY() + 1)).equals("d")) {
						DiamondTaken = DiamondTaken +1;
					}
					p.move(0, 1);
					PlayerX = p.getTileX();
					PlayerY = p.getTileY();
					deplace = 1;

				}
			}
			if (keycode == KeyEvent.VK_Q) {
				if (!(getM().getMap(p.getTileX() - 1, p.getTileY()).equals("m"))
						^ (getM().getMap(p.getTileX() - 1, p.getTileY()).equals("b"))) {
					if (getM().getMap(p.getTileX() - 1, (p.getTileY())).equals("d")) {
						DiamondTaken = DiamondTaken +1;
					}
					p.move(-1, 0);
					PlayerX = p.getTileX();
					PlayerY = p.getTileY();
					deplace = 1;
				}
			}			
			if (keycode == KeyEvent.VK_D) {
				if (!(getM().getMap(p.getTileX() + 1, p.getTileY()).equals("m"))
						^ (getM().getMap(p.getTileX() + 1, p.getTileY()).equals("b"))) {
					if (getM().getMap(p.getTileX() + 1, (p.getTileY())).equals("d")) {
						DiamondTaken = DiamondTaken +1;
					}
					p.move(1, 0);
					PlayerX = p.getTileX();
					PlayerY = p.getTileY();
					deplace = 1;

				}
			}
			System.out.println(DiamondTaken);
			}
		}

		public void keyRelased(KeyEvent e) {

		}

		public void keyTyped(KeyEvent e) {

		}
	}


