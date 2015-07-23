import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class Notepad extends JFrame {

	private static final long serialVersionUID = -3885733721243639681L;

	private JTextArea textArea = new JTextArea();

	private JMenu file = new JMenu("File");
	private JMenuBar menu = new JMenuBar();
	private JMenuItem open = new JMenuItem("Open");
	private JMenuItem saveAs = new JMenuItem("Save as");
	String s1 = "";

	public Notepad() {
		setLayout(new BorderLayout());

		add(textArea, BorderLayout.CENTER);

		setJMenuBar(menu);

		menu.add(file);
		file.add(open);
		open.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JFileChooser open = new JFileChooser();
				int action = open.showOpenDialog(null);

				BufferedReader br;

				if (action == JFileChooser.APPROVE_OPTION) {
					File f = open.getSelectedFile();
					try {
						br = new BufferedReader(new FileReader(f));

						while (br.ready()) {
							String s = br.readLine();
							s1 += s + "\n";
							textArea.setText(s1);
						}

					} catch (FileNotFoundException e1) {

						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}

			}
		});
		file.add(saveAs);
		saveAs.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser open = new JFileChooser();
				int action = open.showSaveDialog(null);

				BufferedWriter bW;

				if (action == JFileChooser.APPROVE_OPTION) {
					File f = open.getSelectedFile();
					try {
						bW = new BufferedWriter(new FileWriter(f));

						textArea.write(bW);
						bW.flush();

					} catch (FileNotFoundException e1) {

						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}

			}
		});

		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Notepad();
	}

}
