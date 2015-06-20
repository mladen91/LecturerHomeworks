package ba.bitcamp.homework.task6;

public class Cat extends Pet {

	private String breed;

	/**
	 * <h1>Creating constructor for Cat that extends Pet class</h1>
	 * <p>
	 * @param petName - represents pet name (from class Pet)
	 * @param petAge - represents pet age (from class Pet)
	 * @param type - represents pet type (from class Pet)
	 * @param breed - Cat breed
	 */
	public Cat(String petName, int petAge, String type, String breed) {
		super(petName, petAge, type);
		this.breed = breed;
	}

	//getters and setters
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	//Standard toString method
	public String toString() {
		return "Go away human";
	}
}
