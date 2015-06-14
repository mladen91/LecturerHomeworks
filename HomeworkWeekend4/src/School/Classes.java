package School;

public class Classes {

	public String nameOfClass;
	public Integer numOfStudents;

	public Classes(String nameOfClass, Integer numOfStudents) {
		this.nameOfClass = nameOfClass;
		this.numOfStudents = numOfStudents;
	}

	
	public String toString() {
		return "Classes [nameOfClass=" + nameOfClass + ", numOfStudents="
				+ numOfStudents + "]";
	}
	
	

}
