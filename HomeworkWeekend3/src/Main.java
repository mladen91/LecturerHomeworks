

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
		BufferedImage img = new BufferedImage(1200, 800, BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		
		
		g.setColor(Color.BLACK); 
		g.drawRect(50, 50, 500, 280); //java
		g.setFont(new Font("Cambria", Font.BOLD, 18));
		g.setColor(Color.BLUE);
		g.drawString("java", 55, 72);
		
		
		
		g.setColor(Color.BLACK);		
		g.drawRect(100, 80, 145, 230); //lang
		g.setColor(Color.BLUE);
		g.drawString("lang", 105, 97);
		g.drawString("awt", 280, 97);
		g.drawString("util", 455, 97);
		g.setFont(new Font("Cambria", Font.BOLD, 16));
		g.setColor(Color.GREEN);
		g.drawString("Math", 130, 135);
		g.drawString("String", 130, 243);
		g.drawString("Integer", 130, 287);
		g.drawString("Graphics", 305, 135);
		g.drawString("Color", 305, 242);
		g.drawString("Font", 305, 287);
		g.setColor(Color.RED);
		g.setFont(new Font("Cambria", Font.BOLD, 14));
		g.drawString("sqrt()", 165, 157);
		g.drawString("random()", 157, 190);
		g.drawString("drawRect()", 323, 157);
		g.drawString("setColor", 330, 190);
		
		g.setColor(Color.BLACK);
		g.drawRect(275, 80, 145, 230); //awt
		g.drawRect(450, 80, 80, 230); //util
		g.drawRect(125, 115, 110, 90); //math
		g.drawRect(300, 115, 110, 90); //graphics
		g.drawRect(300, 220, 110, 35);//color
		g.drawRect(300, 265, 110, 35);//font
		g.drawRect(125, 220, 110, 35);//string
		g.drawRect(125, 265, 110, 35);//integer
		g.drawRect(140, 175, 90, 20);//sqrt()
		g.drawRect(140, 143, 90, 20);//random
		g.drawRect(315, 175, 90, 20);//drawRect()
		g.drawRect(315, 142, 90, 20);//setColoR()
		
		//g.setColor(Color.ORANGE);
	//	g.drawOval(100, 100, 400, 100);
		
	//	g.setColor(Color.RED);
	//	g.setFont(new Font("Cambria", Font.BOLD, 18));
	//	g.drawString("BitCamp <3", 250, 150);
		
		//g.setColor(Color.BLUE);
	//	g.drawLine(100, 200, 500, 200);
		
		// *******************
		w.setImage(img);
	}
}
