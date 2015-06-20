package ba.bitcamp.homework.task6;

public class Pet {

	private String petName;
	private int petAge;
	private String type;

	/**
	 * <h1>Creating constructor for class Pet</h1>
	 * @param petName - represents pet name
	 * @param petAge - represents pet age 
	 * @param type - represents pet type
	 */
	public Pet(String petName, int petAge, String type) {
		super();
		this.petName = petName;
		this.petAge = petAge;
		this.type = type;
	}
    //Getters and setters
	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public int getPetAge() {
		return petAge;
	}

	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
    //Prints petName, petAge, and Pet type
	public String toString(){
		String s="";
		s="Pet name: "+petName;
		s=s+"\nPet age: "+petAge;
		s=s+"\nPet type: "+type;
		return s;
	}

}
