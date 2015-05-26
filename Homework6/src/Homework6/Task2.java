package Homework6;

public class Task2 {

	public static void main(String[] args) {
		
		int n=6;
		
		int first=1;
		int second=1;
		
		
		for (int i=1;i<=n;i+=2) {
			first=first+second;
			second=first+second;
			System.out.print(first+" "+second+" ");
		}
		

		
		
	}

}
