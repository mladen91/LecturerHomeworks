package ba.bitcamp.homework.task5;

public class Date {

	private int day;
	private int month;
	private int year;

	/**
	 * Creating constructor for date
	 * 
	 * @param day
	 * @param month
	 *            - default value is 1
	 * @param year
	 *            - default value is 1
	 */
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = 1;
		this.year = 1;
	}

	/**
	 * Creating constructor with parameters day and month only
	 * 
	 * @param day
	 * @param month
	 */
	public Date(int day, int month) {
		this.day = day;
		this.month = month;
	}

	// Getters and setters
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * This method checks if the inserted date is valid. Program will throw
	 * exception when user inserts invalid value
	 * 
	 */
	public void makeValidDate() {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
				|| month == 10 || month == 12) {
			if (day > 31 || day < 0) {
				throw new UnsupportedOperationException(
						"Invalid date inserted.");
			}
		}
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day > 30 || day < 0) {
				throw new UnsupportedOperationException(
						"Invalid date inserted.");
			}
		}

		if (month == 2) {
			if (day > 28 || day < 0) {
				throw new UnsupportedOperationException(
						"Invalid date inserted.");
			}
		}

	}

	/**
	 * This method will increase day by one with several exceptions For example
	 * if month is january and day 31, il will change to february 1.
	 */
	public void dayPassed() {

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
				|| month == 10) {
			day = day + 1;
			if (day > 31) {
				day = 1;
				month++;
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			day = day + 1;
			if (day > 30) {
				day = 1;
				month++;
			}
		} else if (month == 2) {
			day = day + 1;
			if (day > 28) {
				day = 1;
				month++;
			}
		} else if (month == 12 && day == 31) {
			day = 1;
			month = 1;
			year++;
		}
	}

	/**
	 * This method will increase month by one.
	 * If month is 12, and year is 2015 it would change year to 2016
	 */
	public void monthPassed() {

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
				|| month == 10) {

			if (day > 31) {
				day = 1;
				month++;
			} else if (month == 12) {
				month = 1;
				year++;
			} else {
				month++;
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {

			if (day > 30) {
				day = 1;
				month++;
			} else {
				month++;
			}
		} else if (month == 2) {

			if (day > 28) {
				day = 1;
				month++;
			} else {
				month++;
			}
		}

		if (month == 12 && day == 31) {
			month = 1;
			day = 1;
			year++;
		} else if (month == 1 && day == 1) {
			month++;
		} else if (month == 12 && day < 31) {

			month = 1;
			year++;
		}
	}

	//Basic toString method
	public String toString() {
		String s = "";
		s = day + "." + month + "." + year;
		return s;
	}

}
