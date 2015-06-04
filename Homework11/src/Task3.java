
public class Task3 {

	public static boolean hasNumbers (String s) {
		
		char lookForNum=' ';
		for (int i=0;i<s.length();i++) {
		//We are looking for our numbers from String using for loop and charAt	
			lookForNum=s.charAt(i);
			switch (lookForNum) {
			case '0': case '1': case '2': case '3': case '4': 
			case '5': case '6': case '7': case '8': case '9':
				return true;
			}			
		}
		return false;	
	}
	
	//Calling our method hasNumbers	
	public static void main(String[] args) {
		
		System.out.println(hasNumbers("M1493N"));
	
	}
}
