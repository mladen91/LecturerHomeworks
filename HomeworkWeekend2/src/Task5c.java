public class Task5c {

	public static boolean isInRange(int start, int finish, int n) {

		boolean inRange = true;

		if (start < n && n < finish) {
			inRange = true;
		} else {
			inRange = false;
		}
		return inRange;
	}

	public static void main(String[] args) {

		boolean range = isInRange(10, 50, 55);
		System.out.println(range);

	}

}
