package Homework4;

public class Task9 {

	public static void main(String[] args) {
	
		/* We need to separate digits from our number. We can do it using / and %. 
		 * Then we just need to sum those digits. If num%sum=0 our number is divisible. */
		int num = 300;
		int num1 =num/100;
		int div2 = num/10;
		int num2 = div2%10;
		int num3 = num%10;
		int sum = num1+num2+num3;
		
		if (num%sum==0) {
			System.out.printf("The Number %d is divisible by the sum of digits.",num);
		}
		else if (num%sum!=0) {
				System.out.printf("The Number %d is not divisible by the sum of digits",num);
		}
	

	}

}
