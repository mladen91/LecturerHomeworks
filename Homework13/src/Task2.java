public class Task2 {

	public static void main(String[] args) {
		int min = 0;
		for (String num : args) {
			int number = Integer.parseInt(num);

			if (number < min || min == 0) {
				min = number;
			} else if (min != 0 && min > number) {
				min = min;
			}
		}
		System.out.println("Minimal number is: "+min);
	}

}
