
public class Task2 {

	public static void main(String[] args) {
		
TextIO.readFile("C:/Users/Mladen13/workspace/Homework7/src/input.in1");
		
		int num=0;
		int sum=0;
		
		while (num!=-1) {
			
			sum+=num;
		    num = TextIO.getlnInt();
			
		}
		System.out.println("Sum from file is equal to: "+sum);

	}

}
