
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Main {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		
        //This for loop draws our Rectangles
		for (int i = 30; i <= 500; i += 50) {
			g.setColor(Color.BLACK);
			g.drawRect(i, 50, 50, 50);
		}
		//Drawing String for "Type:int"
		g.setFont(new Font("Cambria", Font.BOLD, 18));
		g.drawString("Type:int", 250, 120);
        //Drawing String for "An array of numbers"
		g.setFont(new Font("Cambria", Font.BOLD, 18));
		g.drawString("An array of numbers", 200, 40);

		int num = (int) (Math.random() * 9 + 1);
		String numString = Integer.toString(num);
  
		//Those two loops are setting and generating random numbers for our blocks!
		for (int i = 50; i <= 500; i += 50) {
			g.drawString(numString, i, 81);
			for (int j = num; j < 10; j++) {
				num = (int) (Math.random() * 9 + 1);
				numString = Integer.toString(num);
			}

		}

		
		w.setImage(img);
	}
}
