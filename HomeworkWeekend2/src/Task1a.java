import java.util.Scanner;

public class Task1a {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		//Insert numbers, and number of digits
		System.out.print("Insert your number: ");
		String num = input.next();
		System.out.print("Number of Digits: ");
		int numOfNum = input.nextInt();

		//Declaring variables
		String first = "";
		String second = "";
		char extra = '1';

		//Result without complement
		if (numOfNum > num.length()) {
			
			System.out.println(num);
		} else if (num.charAt(num.length() - numOfNum) == '0') {
			
			for (int i = num.length() - numOfNum; i < num.length(); i++) {
				System.out.print(num.charAt(i));
			}
		} else {
			// Calculating first complement
			for (int i = num.length() - numOfNum; i < num.length(); i++) {
				if (num.charAt(i) == '0') {
					first += "1";
				} else {
					first += "0";
				}
			}
			//Calculating second complement
			for (int i = first.length() - 1; i >= 0; i--) {
				if (first.charAt(i) == '1' && extra == '1') {
					second = "0" + second;
				} else if (first.charAt(i) == '0' && extra == '0') {
					second = "0" + second;
				} else {
					second = "1" + second;
					extra = '0';
				}
			}
		}
		
		System.out.println(second);

		input.close();

	}

}
