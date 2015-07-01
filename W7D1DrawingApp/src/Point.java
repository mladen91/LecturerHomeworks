import java.awt.Color;

/**
 * Represents a single point to be drawn Contains the point location(x, y), size
 * and color
 * 
 * @author Mladen13
 *
 */
public class Point {

	private int x;
	private int y;
	private int size;
	private Color color;
	private boolean newLine;
	private boolean oldLine;

	public Point(int x, int y, Color color, int size, boolean newLine,
			boolean oldLine) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.size = size;
		this.newLine = newLine;
		this.oldLine = oldLine;

	}

	public boolean isNewLine() {
		return newLine;
	}

	public void setNewLine(boolean newLine) {
		this.newLine = newLine;
	}

	public boolean isOldLine() {
		return oldLine;
	}

	public void setOldLine(boolean oldLine) {
		this.oldLine = oldLine;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

}