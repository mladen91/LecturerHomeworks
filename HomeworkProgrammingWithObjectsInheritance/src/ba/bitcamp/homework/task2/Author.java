package ba.bitcamp.homework.task2;

public class Author {

	private String name;
	private String mail;
	private String gender;
/**
 * <h1>Creating constructor for attributes name, mail and gender</h1>
 * <p>
 * @param name - represents author name
 * @param mail - represents author mail
 * @param gender - represents author gender
 */
	public Author(String name, String mail, String gender) {
		this.name = name;
		this.mail = mail;
		this.gender = gender;
	}
	
	/**
	 * Constructor that has parameter author name only 
	 * @param name - Author name
	 */
	public Author(String name) {
		this.name = name;
		this.mail = mail;
		this.gender = gender;
	}
	

	//Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	//Creating basic toString method
	public String toString(){
		String s ="";
		s= "Author name: "+name;
		return s;
	}

	//Basic equals method
	public boolean equals(Author other) {
		if (name.equals(other.name)&&mail.equals(other.mail)) {
			return true;
		}else {
			return false;
		}
	
	}

}
