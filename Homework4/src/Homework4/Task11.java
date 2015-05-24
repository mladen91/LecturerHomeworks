package Homework4;

public class Task11 {

	public static void main(String[] args) {
		//Variables and input for take off//
		int hours = 23;
		int min = 50;
		int flight = 860; //minutes.//
		//We need to convert our hours into minutes, then sum it all, and again convert to hours.//
		int hoursToMinutes = hours*60;
		int sumHours = hoursToMinutes + min;
		int flightDuration = sumHours + flight;
		int landingHours = flightDuration/60;
		int landingMinutes = flightDuration%60;
		
		//I assume that flight couldn't last more then 48 hours.//
		if (landingHours>23 && landingHours<47) {
			
			//When we do this, hours can't pass 24 value. (Flight lasts more than 24hours.) //
			int landingHours1 = landingHours-24;
			
			System.out.printf("Plane lands in %d:%d",landingHours1,landingMinutes);
		}
		else if (landingHours>23) {
			
			//Flight lasts more then 48 hours//
			int landingHours1 = landingHours-48;
			
			System.out.printf("Plane lands in %d:%d AM next day.",landingHours1,landingMinutes);
		}
		else if (landingHours<=23) {
		
	    System.out.printf("Plane lands in %d:%d",landingHours,landingMinutes); 
	    }
	
	

	}

}
