package Homework6;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		Scanner in= new Scanner (System.in);
		System.out.println("Insert your number: ");
		int num=in.nextInt();
		
		int sum=0;
		
		for (int i=1;i<=num;i++) {
			
			int div=num%i;
			if (div==0) {
				sum+=i;
			}
			
		}
		System.out.println("Sum of divisor is: "+sum);
		
		
		

	}

}
