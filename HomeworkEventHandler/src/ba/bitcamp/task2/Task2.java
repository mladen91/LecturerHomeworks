package ba.bitcamp.task2;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Class that implements KeyListener trough inner class.
 * @author Mladen13
 *
 */
public class Task2 extends JPanel{

	private static final long serialVersionUID = 4828319136662752703L;
	
	private static final int PANEL_WIDTH = 600;
	private static final int PANEL_HEIGHT = 600;
	private static final int CIRCLE_SIZE = 50;
	
	private int x;
	private int y;

	
	public Task2() {
		
		x = PANEL_WIDTH / 2;
		y = PANEL_HEIGHT / 2;
		addKeyListener(new KeyHandler());
		setFocusable(true);
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillOval(x - CIRCLE_SIZE/2, y - CIRCLE_SIZE/2, CIRCLE_SIZE, CIRCLE_SIZE);
	}
	
	private class KeyHandler implements KeyListener{
		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_RIGHT){
				if(x < PANEL_WIDTH - CIRCLE_SIZE / 2){
					x += 5;
					repaint();					
				}
			} 
			if(e.getKeyCode() == KeyEvent.VK_LEFT){
				if(x > 0 + CIRCLE_SIZE / 2){
					x -= 5;
					repaint();					
				}
			} 
			if(e.getKeyCode() == KeyEvent.VK_UP){
				if(y > 0 + CIRCLE_SIZE / 2){
					y -= 5;
					repaint();					
				}
			} 
			if(e.getKeyCode() == KeyEvent.VK_DOWN){
				if(y < PANEL_HEIGHT - CIRCLE_SIZE / 2){
					y += 5;
					repaint();					
				}
			} 
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	public static void main(String[] args) {
		
		
		JFrame window = new JFrame();
		window.setContentPane(new Task2());
		window.setTitle("Task 2");
		window.setSize(PANEL_WIDTH + 15, PANEL_HEIGHT + 40);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}
