package Homework6;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("Insert your numbers: ");
		int num1=in.nextInt();
		int num2=in.nextInt();
		int numerous=0;
		
		for (int i=1;i<num2;i++) {
			
			num1=num1/10;
			
		}
		numerous=num1%10;
		System.out.println("Wanted number is: "+numerous );

	}

}
