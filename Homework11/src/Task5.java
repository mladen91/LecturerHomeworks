public class Task5 {

	public static String getNumbersOnly(String s) {
		String pulling = " ";
		for (int i = 0; i < s.length(); i++) {
   // Looking for our "char" numbers from String, and converting them.
			if (s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2'
					|| s.charAt(i) == '3' || s.charAt(i) == '4'
					|| s.charAt(i) == '5' || s.charAt(i) == '6'
					|| s.charAt(i) == '7' || s.charAt(i) == '8'
					|| s.charAt(i) == '9') {
				pulling += Character.toString(s.charAt(i));

			}
		}
		return pulling;
	}
    //Calling our main method getNumbersOnly
	public static void main(String[] args) {

		System.out.println(getNumbersOnly("1;2m3l56d e7n"));
	}

}
