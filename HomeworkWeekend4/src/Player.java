public class Player {

	public String playerName;
	public Integer yearOfBirth;
	public String position;

	public Player(String playerName, Integer yearOfBirth, String position) {
		this.playerName = playerName;
		this.yearOfBirth = yearOfBirth;
		this.position = position;
	}
	
	public String toString(){
		String s =playerName + "\n";
		s += "Born: " + yearOfBirth + "\n";
		s += "Position: " + position;
		return s;
	}

}
