import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * This class creates dummy XO game. It extends JFrame class. It contains two
 * attributes, b1 is an 2D array from class JButton and counter that is set to
 * 0. It also contains constructor that will do most of our drawing work.
 * 
 * @author Mladen13
 *
 */
public class DummyXO extends JFrame {

	private static final long serialVersionUID = -3913147301106520924L;

	private JButton[][] b1 = new JButton[3][3];
	int counter = 0;

	/**
	 * Constructor for main class. In this constructor we set grid layout 3 x 3.
	 * After that we created 9 buttons and set it into grid layout.
	 */
	public DummyXO() {
		// Setting grid layout 3 x 3
		setLayout(new GridLayout(3, 3));

		// Creating buttons
		for (int i = 0; i < b1.length; i++) {
			for (int j = 0; j < b1[i].length; j++) {
				b1[i][j] = new JButton("-");
				b1[i][j].addActionListener(new BH());
				add(b1[i][j]);
			}

		}
		// Setting visibility true for our frame
		setVisible(true);
		// Setting size for frame 300 x 300
		setSize(300, 300);
		// Setting location for frame 500 x 350
		setLocation(500, 350);
	}

	public static void main(String[] args) {
		// Calling constructor
		new DummyXO();

	}

	/**
	 * This class represents actions that will be done by clicking on one grid.
	 * It implements ActionListener interface that has only one method
	 * 
	 * @author Mladen13
	 *
	 */
	public class BH implements ActionListener {

		/**
		 * This method counts moves performed by clicking on button If counter
		 * is even number, it will set sign to X If counter is odd number, it
		 * will set sign to O
		 */
		public void actionPerformed(ActionEvent e) {

			counter++;
			if (counter % 2 == 1) {
				((JButton) e.getSource()).setText("X");
			} else {
				((JButton) e.getSource()).setText("O");
			}

		}

	}

}
