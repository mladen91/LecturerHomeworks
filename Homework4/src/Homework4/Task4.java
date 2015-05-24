package Homework4;

public class Task4 {

	public static void main(String[] args) {
		
		//Variables for day and month.//
		int day = 9;
		int month = 10;
		
		//I compared range from every sign and put it in if clauses, so that i could get a sign for input date.//
		if (day>=21 && month==3 || month==4 && day<=20) {
			System.out.println("Aries");
		}
		else if (day>=21 && month==4 || month==5 && day<=21) {
			System.out.println("Taurus");
		}
		else if (day>=22 && month==5 || month==6 && day<=21) {
			System.out.println("Gemini");
		}
		else if (day>=22 && month==6 || month==7 && day<=23) {
			System.out.println("Cancer");
		}
		else if (day>=24 && month==7 || month==8 && day<=22) {
			System.out.println("Leo");
		}
		else if (day>=23 && month==8 || month==9 && day<=22) {
			System.out.println("Virgo");
		}
		else if (day>=23 && month==9 || month==10 && day<=23) {
			System.out.println("Libra");
		}
		else if (day>=24 && month==10 || month==11 && day<=22) {
			System.out.println("Scorpio");
		}
		else if (day>=22 && month==11 || month==12 && day<=21) {
			System.out.println("Saggitarius");
		}
		else if (day>=22 && month==12 || month==1 && day<=20) {
			System.out.println("Capricorn");
		}
		else if (day>=21 && month==1 || month==2 && day<=19) {
			System.out.println("Aquarius");
		}
		else if (day>=20 && month==2 || month==3 && day<=20) {
			System.out.println("Pisces");
		}

	}

}
