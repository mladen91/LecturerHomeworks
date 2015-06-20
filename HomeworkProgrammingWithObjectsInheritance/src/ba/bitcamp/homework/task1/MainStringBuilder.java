package ba.bitcamp.homework.task1;

public class MainStringBuilder {

	public static void main(String[] args) {

		char[] c1 = new char[2];
		c1[0] = '1';
		c1[1] = '3';

		CampStringBuilder csb = new CampStringBuilder(c1);

		csb.append(" mladen");

	}

}
