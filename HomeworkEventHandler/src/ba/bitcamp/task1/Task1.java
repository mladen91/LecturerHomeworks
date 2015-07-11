package ba.bitcamp.task1;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * Class that uses KeyHandler class to implement KeyListener.
 * 
 * @author Mladen13
 *
 */
public class Task1 extends JPanel {

	private static final long serialVersionUID = 596107473779458868L;
	
	private static final int PANEL_WIDTH = 600;
	private static final int PANEL_HEIGHT = 600;
	private static final int CIRCLE_SIZE = 50;

	private static Task1 instance;

	private int x;
	private int y;

	public Task1() {

		x = PANEL_WIDTH / 2;
		y = PANEL_HEIGHT / 2;
		addKeyListener(new KeyHandler());
		setFocusable(true);

	}

	public static Task1 getInstance() {
		if (instance == null) {
			instance = new Task1();
		}
		return instance;
	}

	/**
	 * Moves right.
	 */
	public void moveRight() {
		if (x > 0 + CIRCLE_SIZE / 2) {
			x += 5;
			repaint();
		}
	}

	/**
	 * Moves left.
	 */
	public void moveLeft() {
		if (x > 0 + CIRCLE_SIZE / 2) {
			x -= 5;
			repaint();
		}
	}

	/**
	 * Moves up.
	 */
	public void moveUp() {
		if (y > 0 + CIRCLE_SIZE / 2) {
			y -= 5;
			repaint();
		}
	}

	/**
	 * Moves down.
	 */
	public void moveDown() {
		if (y < PANEL_HEIGHT - CIRCLE_SIZE / 2) {
			y += 5;
			repaint();
		}
	}

	/**
	 * @param y
	 *            the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillOval(x - CIRCLE_SIZE / 2, y - CIRCLE_SIZE / 2, CIRCLE_SIZE,
				CIRCLE_SIZE);
	}

	public static void main(String[] args) {

		JFrame window = new JFrame();
		window.setContentPane(getInstance());

		window.setTitle("Task 1");
		window.setSize(PANEL_WIDTH + 15, PANEL_HEIGHT + 40);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}
