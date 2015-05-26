package Homework6;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		System.out.print("Lenght: ");
		int lenght=input.nextInt();
		System.out.println();
		
		
		for (int i=0; i<lenght; i++) {
			for (int j=0; j<lenght; j++) {
				if(lenght-1> i+j){
					System.out.print(" ");
				} else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
		
		input.close();

	}

}
