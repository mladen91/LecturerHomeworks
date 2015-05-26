package Homework6;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
	
		Scanner in= new Scanner(System.in);
		System.out.println("Insert your number: ");
		int num=in.nextInt();		
		int div;
		int sum=0;
		
		while (num>0) {
			
			div=num%10;
			sum+=div;
			num=num/10;
			
		}
		System.out.println("Sum of numerous is: "+sum);
	
	}
}
