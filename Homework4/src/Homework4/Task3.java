package Homework4;

public class Task3 {

	public static void main(String[] args) {
		
		//first date//
		int date = 3;
		int month = 3;
		int year = 1995;
		
		//second date//
		int date1 = 9;
		int month1 = 10;
		int year1 = 1991;
		
		/*When years and months are equal, we need to compare dates like this:
		1.date>date1
		2.date<date1
		3.date=date1*/
		//1.//
		if (year==year1 && month==month1 && date>date1 ) {
			System.out.println("Date "+date+"."+month+"."+year+", comes after "+date1+"."+month1+"."+year1);
		}
		//2.//
		else if (year==year1 && month==month1 && date<date1 ) {
			System.out.println("Date "+date1+"."+month1+"."+year1+", comes after "+date+"."+month+"."+year);
		}
		//3.//	
		else if (year==year1 && month==month1 && date==date1 ) {
			System.out.println("Same dates.");
		/* When years are equal, but months aren't, we need to compare only months:
		 * 1.month>month1
		 * 2.month<month1	*/
		}
		//1.//
		else if (year==year1 && month>month1) {
			System.out.println("Date "+date+"."+month+"."+year+", comes after "+date1+"."+month1+"."+year1);
		}
		//2.//
		else if (year==year1 && month<month1) {
			System.out.println("Date "+date1+"."+month1+"."+year1+", comes after "+date+"."+month+"."+year);
		}
		/*When years aren't equal, it is enough to compare them.
		  1.year>year1
		  2.year<year1          */
		//1.//
		else if (year>year1) {
			System.out.println("Date "+date+"."+month+"."+year+", comes after "+date1+"."+month1+"."+year1);
		}
		//2.//
		else if (year<year1) {
			System.out.println("Date "+date1+"."+month1+"."+year1+", comes after "+date+"."+month+"."+year);
		}
		
		
			

	}

}
