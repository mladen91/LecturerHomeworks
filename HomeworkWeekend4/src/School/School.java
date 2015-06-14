package School;

import java.util.Arrays;

public class School {

	public String schoolName;
	public Principal principal;
	public Classes[] classes;
	
	public School(String schoolName, Principal principal, Classes[] classes) {
		this.schoolName = schoolName;
		this.principal = principal;
		this.classes = classes;
		
		
	}

	
	public String toString() {
		return "School [schoolName=" + schoolName + ", principal=" + principal
				+ ", classes=" + Arrays.toString(classes) + "]";
	}
	
	

	
	
	
}
