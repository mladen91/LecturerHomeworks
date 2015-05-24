package Homework4;

public class Task1 {

	public static void main(String[] args) {
		
		//Variables a, b, c are vertices of triangle.//
		int a = 11;
		int b = 7;
		int c = 5;
		
		//When a+b>c and a+c>b and b+c>a is true, triangle can be constructed. //
		if (a+b>c && a+c>b && b+c>a) 
			
			System.out.println("It is possible to construct a triangle with this sites.");
		
		else 
			System.out.println("It is not possible to construct a triangle with this sites.");

	}

}
