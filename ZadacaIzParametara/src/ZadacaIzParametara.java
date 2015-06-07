public class ZadacaIzParametara {

	public static int pomnozi(int a) {

		return a * a;

	}

	public static double pomnozi(double a) {

		return a * a;
	}

	public static int pomnozi(int a, int b) {

		return a * b;
	}

	public static double pomnozi(double a, double b) {

		return a * b;
	}

	public static void main(String[] args) {

		System.out.println("1. " + pomnozi(5));
		System.out.println("2. " + pomnozi(10.));
		System.out.println("3. " + pomnozi(10, 5));
		System.out.println("3. " + pomnozi(10, 5.));

	}

}
