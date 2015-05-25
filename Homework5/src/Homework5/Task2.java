package Homework5;

public class Task2 {

	public static void main(String[] args) {
		
		int n=20;
		int counter=0;
		int sum=0;
		
		while (counter<n) {
			
			counter++;
			
			if (counter%2==0) {
				
				sum+=counter;	
			}
		
		}
		
		System.out.println("Numerous sum without including n is: "+(sum-n));
	}

}
