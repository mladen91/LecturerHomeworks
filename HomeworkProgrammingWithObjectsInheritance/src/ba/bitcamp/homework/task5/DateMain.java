package ba.bitcamp.homework.task5;

public class DateMain {

	public static void main(String[] args) {

		Date d = new Date(5, 10, 2015);

		//Setting date
		d.setDay(9);
		d.setMonth(10);
		d.setYear(2015);
		//Date validation
		d.makeValidDate();
		//Increasing day by one
		d.dayPassed();
		System.out.println(d);
		//Increasing month by one
		d.monthPassed();
		//Date validation
		d.makeValidDate();
		System.out.println(d);
		
	}

}
