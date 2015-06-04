public class Task1 {

	//Creating first method where we returned minimal value. 
	public static int getMin2(int a, int b) {
		if (a > b) {
			return b;
		} else
			return a;
	}
    //Creating second method where we import our first method and after that we returned finally
	//minimal number.
	public static int getMin3(int a, int b, int c) {
		int abMin = getMin2(a, b);
		if (abMin > c) {
			return c;
		} else
			return abMin;
	}

	//Main method for calling our getMin3 method
	public static void main(String[] args) {

		System.out.println(getMin3(1, 5, 2));

	}

}
