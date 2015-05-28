
public class Task3 {

	public static void main(String[] args) {
		
		TextIO.readFile("C:/Users/Mladen13/workspace/Homework7/src/input.in3");
		
		int min=0;
		int num=0;
		int n =TextIO.getlnInt();
		
		
		if (n!=0) {
			num=TextIO.getlnInt();
			min=num;
		} else {
			min=0;
		}
		
		
		for (int i=0;i<n-1;i++) {
			
			num=TextIO.getlnInt();
			if (num<min) {
				min=num;
			}
		}
		
		if(n !=0) {
			System.out.println("Our lowest number is: "+ min);
		} else {
			System.out.println("Empty file!");
		}

	}

}
