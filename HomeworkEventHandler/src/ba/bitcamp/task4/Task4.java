package ba.bitcamp.task4;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * Class that extends KeyAdapter through inner class and overrides its
 * keyPressed() method.
 * 
 * @author Mladen13
 *
 */
public class Task4 extends JPanel {

	private static final long serialVersionUID = 8544544042204947305L;
	
	private static final int PANEL_WIDTH = 600;
	private static final int PANEL_HEIGHT = 600;
	private static final int CIRCLE_SIZE = 50;

	private int x;
	private int y;

	public Task4() {

		x = PANEL_WIDTH / 2;
		y = PANEL_HEIGHT / 2;
		addKeyListener(new KeyHandler());
		setFocusable(true);

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillOval(x - CIRCLE_SIZE / 2, y - CIRCLE_SIZE / 2, CIRCLE_SIZE,
				CIRCLE_SIZE);
	}

	private class KeyHandler extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			super.keyPressed(e);
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				if (x < PANEL_WIDTH - CIRCLE_SIZE / 2) {
					x += 5;
					repaint();
				}
			}
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				if (x > 0 + CIRCLE_SIZE / 2) {
					x -= 5;
					repaint();
				}
			}
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				if (y > 0 + CIRCLE_SIZE / 2) {
					y -= 5;
					repaint();
				}
			}
			if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				if (y < PANEL_HEIGHT - CIRCLE_SIZE / 2) {
					y += 5;
					repaint();
				}
			}
		}
	}

	public static void main(String[] args) {

		JFrame window = new JFrame();
		window.setContentPane(new Task4());
		window.setTitle("Task 4");
		window.setSize(PANEL_WIDTH + 15, PANEL_HEIGHT + 40);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}