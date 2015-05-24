package Homework4;

public class Task5 {

	public static void main(String[] args) {
		//Variables for 4 numbers.//
		int num1 = 31;
		int num2 = 50;
		int num3 = 32;
		int num4 = 70;
		
		//If we have 4 numbers there is 2^n=2^4 combinations. So i just used every combinations through if clauses.//
		
		if (num1<=num2 && num2<=num3 && num3<=num4) {
			System.out.printf("From lowest to highest: %d, %d, %d, %d ",num1, num2, num3, num4);
		}
		else if (num1<=num3 && num3<=num2 && num2<=num4) {
			System.out.printf("From lowest to highest: %d, %d, %d, %d ",num1, num3, num2, num4);
		}
		else if (num1<=num2 && num2<=num4 && num4<=num3) {
			System.out.printf("From lowest to highest: %d, %d, %d, %d ",num1, num2, num4, num3);
		}	
		else if (num1<=num3 && num3<=num4 && num4<=num2) {
			System.out.printf("From lowest to highest: %d, %d, %d, %d ",num1, num3, num4, num2);
		}		
		else if (num2<=num1 && num1<=num4 && num4<=num3) {
			System.out.printf("From lowest to highest: %d, %d, %d, %d ",num2, num1, num4, num3);
		}
		else if (num2<=num1 && num1<=num3 && num3<=num4) {
			System.out.printf("From lowest to highest: %d, %d, %d, %d ",num2, num1, num3, num4);
		}
		else if (num2<=num3 && num3<=num1 && num1<=num4) {
			System.out.printf("From lowest to highest: %d, %d, %d, %d ",num2, num3, num1, num4);
		}
		else if (num2>=num3 && num3<=num4 && num4<=num1) {
			System.out.printf("From lowest to highest: %d, %d, %d, %d ",num2, num3, num4, num1);
		}
		else if (num3<=num1 && num1<=num2 && num2<=num4) {
			System.out.printf("From lowest to highest: %d, %d, %d, %d ",num3, num1, num2, num4);
		}
		else if (num3<=num2 && num2<=num1 && num1<=num4) {
			System.out.printf("From lowest to highest: %d, %d, %d, %d ",num3, num2, num1, num4);
		}
		else if (num3<=num4 && num4<=num1 && num1<=num2) {
			System.out.printf("From lowest to highest: %d, %d, %d, %d ",num3, num4, num1, num2);
		}
		else if (num3<=num4 && num4<=num2 && num2<=num1) {
			System.out.printf("From lowest to highest: %d, %d, %d, %d ",num3, num4, num2, num1);
		}
		else if (num4<=num1 && num1<=num2 && num2<=num3) {
			System.out.printf("From lowest to highest: %d, %d, %d, %d ",num4, num1, num2, num3);
		} 
		else if (num4<=num2 && num2<=num1 && num1<=num3) {
			System.out.printf("From lowest to highest: %d, %d, %d, %d ",num4, num2, num1, num3);
		}
		else if (num4<=num3 && num3<=num2 && num2<=num1) {
			System.out.printf("From lowest to highest: %d, %d, %d, %d ",num4, num3, num2, num1);
		}
		else if (num4<=num3 && num3<=num1 && num1<=num2) {
			System.out.printf("From lowest to highest: %d, %d, %d, %d ",num4, num3, num1, num2);
		}










	}

}
