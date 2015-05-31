public class Task5b {

	public static double getAreaOfCircle(int diameter) {

		int r = diameter / 2;
		double A = r * r * Math.PI;
        //We calculate area of circle here.
		return A;

	}

	public static void main(String[] args) {
         //Calling our method
		double A = getAreaOfCircle(20);
		System.out.printf("Area of the Circle is equal to: %.2f", A);

	}

}
