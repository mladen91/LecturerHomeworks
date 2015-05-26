package Homework6;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Insert your number: ");
		int num = in.nextInt();
		
		int division = 0; 
		int newNum = 0;
		while(num>0){
			division=num%10;
			num/=10;
			if(division!=0){
			newNum+=division;
			newNum*=10;
			}
		}
		newNum/=10;
		num=0;
		division=0;
		while (newNum>0){
			division=newNum%10;
			newNum/=10;
			num+=division;
			num*=10;
			}
		num/=10;
		System.out.println("Your number is: "+num);

	}

}
