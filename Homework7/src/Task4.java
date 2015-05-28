
public class Task4 {

	public static void main(String[] args) {
		

		TextIO.readFile("C:/Users/Mladen13/workspace/Homework7/src/input.in4");
		
		int n = TextIO.getInt();
		int m = TextIO.getInt();		
		int num = 0;
		boolean isFound = false;
		
		
		if(n != 0){
			num = TextIO.getlnInt();
		}
		
		
		for (int i = 0; i < n - 1; i++) {
			num = TextIO.getlnInt();
			if(num == m){
				isFound = true;
				
			}			
		}
		

		if(n != 0 && isFound){
			System.out.println("Number " + m + " is found in file.");
		} else {
			System.out.println("There is no " + m + " in our file.");
		}

	}

}
