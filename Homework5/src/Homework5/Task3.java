package Homework5;

public class Task3 {

	public static void main(String[] args) {
		int num=8128;
		int counter=1;
		int sum=0;
		
		while (counter<num) {
			
			if(num%counter==0) {
				sum+=counter;
			}
			counter++;
		}

		if (sum==num) {
			System.out.println(num+" is a perfect number.");
		}
		else {
			System.out.println(num+" is not a perfect number.");
		}
			
	}

}
