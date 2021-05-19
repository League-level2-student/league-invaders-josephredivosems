import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	@Override
	public void paintComponent(Graphics g){
		if(currentState == MENU){
		    drawMenuState(g);
		}else if(currentState == GAME){
		    drawGameState(g);
		}else if(currentState == END){
		    drawEndState(g);
		}
	}
	   final int MENU = 0;
	    final int GAME = 1;
	    final int END = 2;
	    int currentState = MENU;
	  
	    Font titleFont = new Font("Arial", Font.PLAIN, 48);
	    Font subTitleFont = new Font("Arial", Font.PLAIN, 20);
	    
	    void updateMenuState() {  
	    	
	    }
	    
	    void updateGameState() { 
	    	
	    }
	    
	    void updateEndState()  {  
	    	
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
			 
		}
		
		void drawEndState(Graphics g)  {  
		   	g.setColor(Color.RED);
		    g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		    g.setFont(titleFont);
		    g.setColor(Color.YELLOW);
		    g.drawString("Game Over", 0, 50);
		    g.setFont(subTitleFont);
		   
		    
		}
	
}
