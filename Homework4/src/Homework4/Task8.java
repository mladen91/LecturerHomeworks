package Homework4;

public class Task8 {

	public static void main(String[] args) {
		//Variables for A(x,y,z) coordinates.//
		int x=3;
		int y=4;
		int z=5;
		
		//Equation where we can get our distance from coordinate beginning. (Pitagora's theorem)
		double d=Math.sqrt(x*x+y*y+z*z);
		
		System.out.printf("Distance from coordinate beggining is: %.2f",d);
		

	}

}
