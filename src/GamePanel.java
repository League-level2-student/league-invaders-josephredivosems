import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	@Override
	public void paintComponent(Graphics g) {
		if (currentState == MENU) {
			drawMenuState(g);
		} else if (currentState == GAME) {
			drawGameState(g);
		} else if (currentState == END) {
			drawEndState(g);
		}
	}

	final int MENU = 0;
	final int GAME = 1;
	final int END = 2;
	int currentState = MENU;
	Timer frameDraw = new Timer(1000 / 60, this);

	Font titleFont = new Font("Arial", Font.PLAIN, 48);
	Font subTitleFont = new Font("Arial", Font.PLAIN, 20);
	//divide by 1.5
	RocketShip rocket = new RocketShip(167, 600, 34, 34);

	GamePanel() {
		frameDraw.start();
	}

	void updateMenuState() {

	}

	void updateGameState() {

	}

	void updateEndState() {

	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("League Invaders", 0, 50);
		g.setFont(subTitleFont);
		g.drawString("Press ENTER to start", 85, 200);
		g.drawString("Press SPACE for instructions", 63, 350);
	}

	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		rocket.draw(g);
	}

	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("Game Over", 58, 50);
		g.setFont(subTitleFont);
		g.drawString("You killed " + " enemies.", 95, 200);
		g.drawString("Press ENTER to restart", 85, 350);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (currentState == MENU) {
			updateMenuState();
		} else if (currentState == GAME) {
			updateGameState();
		} else if (currentState == END) {
			updateEndState();
		}
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
			if (currentState == END) {
				currentState = MENU;
			} else {
				currentState++;
			}

		}
		
		if (arg0.getKeyCode() == KeyEvent.VK_UP) {
			System.out.println("UP");
		}
		
		if (arg0.getKeyCode() == KeyEvent.VK_RIGHT) {
			System.out.println("RIGHT");
		}	
		
		if (arg0.getKeyCode() == KeyEvent.VK_LEFT) {
			System.out.println("LEFT");
		}	
		
		if (arg0.getKeyCode() == KeyEvent.VK_DOWN) {
			System.out.println("DOWN");
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
