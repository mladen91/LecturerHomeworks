import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Class implements a simple drawing panel
 * 
 *
 */
public class PaintPanel extends JPanel {
	private static final long serialVersionUID = 2461186969486000773L;
	
	private PointArray points;
	private Color activeColor;
	private int activeSize = 10;
	//booleans for separating lines
	boolean newLine = true;
	boolean oldLine = false;
	//boolean for holding ctrl button down
	boolean isControlDown = false;

	// possible color picks
	private static Color[] supportedColors = new Color[] { Color.RED,
			Color.BLUE, Color.GREEN, Color.ORANGE, Color.PINK };

	// possible size picks
	private static char[] supportedSize = new char[] { '+', '-' };

	//undo redo buttons
	private static String[] undoRedoButtons = new String[] { "Undo", "Redo" };

	public PaintPanel(int height, int width) {
		super();

		points = new PointArray();
		setSize(width, height);
		setBackground(Color.WHITE);

		// add buttons for all the possible colors and add a listener
		for (int i = 0; i < supportedColors.length; i++) {
			JButton color = new JButton("Pick");

			// an easy way to save the index of the color
			color.setName(Integer.toString(i));
			color.setForeground(supportedColors[i]);

			color.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton clicked = (JButton) e.getSource();

					// get the picked color index from the name
					String name = clicked.getName();
					int index = Integer.parseInt(name);

					// set the current color to the picked color
					activeColor = supportedColors[index];
				}
			});

			add(color);
		}

		// add buttons for all the supported sizes
		for (int i = 0; i < supportedSize.length; i++) {
			JButton size = new JButton(Character.toString(supportedSize[i]));
			size.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton clicked = (JButton) (e.getSource());

					// get the new size from the label
					String label = clicked.getText();

					if (label.equals("+")) {
						activeSize += 5;
					} else if (label.equals("-")) {

						activeSize -= 5;
						if (activeSize < 1) {
							activeSize = 1;
						}
					}
				}
			});
			add(size);
		}
		// Adding undo redo buttons
		for (int i = 0; i < undoRedoButtons.length; i++) {
			JButton undoRedo = new JButton(undoRedoButtons[i]);
			undoRedo.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton clicked = (JButton) (e.getSource());

					// get the new size from the label
					String label = clicked.getText();

					if (label.equals("Undo")) {

						points.undoDrawing();
						repaint();
					}
				}
			});
			add(undoRedo);
		}
		addMouseListener(new MouseHandler());
		addMouseMotionListener(new MouseHandler());
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// draw all the points added by the user
		Point p1, p2;

		if (!isControlDown) {
			for (int i = 0; i < points.getLength() - 2; i++) {
				p1 = points.elementAt(i);
				p2 = points.elementAt(i + 1);
				if (p1.isNewLine() && !p1.isOldLine()) {
					g.setColor(p1.getColor());
					Graphics2D g2 = (Graphics2D) g;

					g2.setStroke(new BasicStroke(activeSize));

					g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
				}
			}

		} else {
			for (int j = 0; j < points.getLength(); j++) {
				Point p = points.elementAt(j);
				g.setColor(p.getColor());
				g.fillOval(p.getX(), p.getY(), p.getSize(), p.getSize());
			}
		}

	}

	private class MouseHandler extends MouseAdapter {

		/**
		 * While the user drags the mouse we want to add points to the array to
		 * be drawn later
		 */
		@Override
		public void mouseDragged(MouseEvent e) {
			isControlDown = false;
			Point newPoint = new Point(e.getX(), e.getY(), activeColor,
					activeSize, newLine, oldLine);
			points.addPoint(newPoint);
			if (e.isShiftDown() == true) {
				newPoint.setColor(Color.WHITE);
			} else if (e.isControlDown() == true) {
				isControlDown = true;
			}
			repaint();

		}

		@Override
		public void mouseReleased(MouseEvent e) {
		
			Point newPoint = new Point(e.getX(), e.getY(), activeColor,
					activeSize, false, false);
			points.addPoint(newPoint);
			points.breakPoint();

		}

	}

}