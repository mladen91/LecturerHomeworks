package Homework6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Input height: ");
		int maxI = input.nextInt();
		System.out.print("Input width: ");
		int maxJ = input.nextInt();
		
		
		for (int i=0;i<maxI;i++) {
			for (int j=0; j<maxJ;j++) {
				if ((i==0 || i==maxI-1) && (j==0 || j==maxJ-1)){
					System.out.print("+ ");
				} else if (i==0 || i==maxI-1){
					System.out.print("- ");
				} else if (j==0 || j == maxJ-1){
					System.out.print("| ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		input.close();
	}
}