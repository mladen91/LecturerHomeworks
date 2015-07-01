/**
 * A dynamic array of points, resizing when required
 * @author Mladen13
 *
 */
public class PointArray {

	private Point[] points;
	private int length;
	private int [] undo;
	
	public PointArray(){
		this.points = new Point[10];
		this.length = 0;
		this.undo = new int[1];
	}
	
	public void addPoint(Point p){
		if(length == points.length){
			resize();
		}
		this.points[length++] = p;
	}
	
	
	
	public int getLength(){
		return length;
	}
	
	public Point elementAt(int index){
		return points[index];
	}
	

	
	public void resize(){
		Point[] temp = new Point[points.length * 2];
		for(int i = 0; i < points.length; i++){
			temp[i] = points[i];
		}
		points = temp;
	}
	

	
	public void undoDrawing(){
		for (int i = 0; i < undo.length - 1; i++) {
			if(length - 1 == undo[i + 1]){
				length = undo[i] + 1;
			}
		}
		if(length == 1)
			length = 0;
		
	}
	
	public void breakPoint(){
		int[] temp = new int[undo.length + 1];
		for (int i = 0; i < undo.length; i++) {
			temp[i] = undo[i];
		}
		temp[temp.length - 1] = length - 1;
		undo = temp;
	}
	
}
