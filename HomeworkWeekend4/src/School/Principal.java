package School;

public class Principal {

	public String principalName;
	public Integer yearOfBirth;
	
	public Principal(String principalName, Integer yearOfBirth) {
		this.principalName = principalName;
		this.yearOfBirth = yearOfBirth;
	}

	
	public String toString() {
		return "Principal [principalName=" + principalName + ", yearOfBirth="
				+ yearOfBirth + "]";
	}
	
	
}
