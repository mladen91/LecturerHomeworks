package Homework6;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Insert your number: ");
		int num = in.nextInt();
		
		
		for (int j=1;j<num;j++) {
			int sum=0;
		for (int i=1;i<j;i++) {
			
			if (j%i==0) {
			sum+=i;
			}
			
		}
		if (sum==j) {
			
			System.out.println(sum);
		}
		
		}
		
		
		
	}
	
}
