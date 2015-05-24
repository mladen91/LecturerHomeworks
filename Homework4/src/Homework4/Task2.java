package Homework4;

public class Task2 {

	public static void main(String[] args) {
		
		double a = 9;
		/*There are three conditions.
		  1. 7.5 >a> 5
		  2. 7.5 <a< 10 
		  3. Third condition is that variable is out of range. */
		//1.//
		if (a>5 && a<7.5) {
			System.out.println("Variable a is part of 5 to 7.5 range");
		}
		//2.//
		else if (a>7.5 && a<10) {
			System.out.println("Variable a is part of 7.5 to 10 range");	
		}
		//3.//
		else 
			System.out.println("Variable is out of range");

	}

}
