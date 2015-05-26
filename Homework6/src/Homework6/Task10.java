package Homework6;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		 System.out.println("Insert your numbers:");
	     int num1 = in.nextInt();
	     int num2 = in.nextInt();
	    
	     int lcd = 0;
	     int num3 = 0;
	     
	     if(num1<num2){
	    	 num3=num1;
	     }
	     else
	    	 num3=num2;
	     for(int i=1;i<=num3;i++){
	    	 if(num1%i==0 && num2%i==0)
	    		 lcd=i;
	     }
	     if (lcd!=1 && lcd!=0) {
	     System.out.println("Largest common divisor is: "+lcd);
	     } else {
	    	 System.out.println("There is no common divisor for this numbers.");
	     }
	     


	     
	}
	

}
