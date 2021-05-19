import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame = new JFrame();
	public static final int WIDTH = 400;
	public static final int HEIGHT = 640;
	GamePanel game;
	LeagueInvaders(){
		game = new GamePanel();
	}
	void setup() {
		frame.add(game);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
