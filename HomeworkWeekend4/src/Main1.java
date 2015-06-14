public class Main1 {

	public static void main(String[] args) {

		// Players of one Football Team
		Player gk1 = new Player("Ter Stegen", 1992, "Goalkeeper");

		Player p1 = new Player("Pique", 1987, "Defender");
		Player p2 = new Player("Mathieu", 1983, "Defender");
		Player p3 = new Player("Jordi Alba", 1989, "Left back");
		Player p4 = new Player("Dani Alves", 1983, "Right back");

		Player p5 = new Player("Ivan Rakitic", 1988, "Midfielder");
		Player p6 = new Player("Sergio Busquets", 1988, "Midfielder");
		Player p7 = new Player("Andres Iniesta", 1984, "Midfielder");

		Player p8 = new Player("Luis Suarez", 1987, "Forward");
		Player p9 = new Player("Leo Messi", 1987, "Forward");
		Player p10 = new Player("Neymar", 1992, "Forward");

		// Players that represents one Squad
		Player[] arrayTeam = new Player[11];
		arrayTeam[0] = gk1;
		arrayTeam[1] = p1;
		arrayTeam[2] = p2;
		arrayTeam[3] = p3;
		arrayTeam[4] = p4;
		arrayTeam[5] = p5;
		arrayTeam[6] = p6;
		arrayTeam[7] = p7;
		arrayTeam[8] = p8;
		arrayTeam[9] = p9;
		arrayTeam[10] = p10;

		// Creating a team
		Squad fcBarcelona = new Squad("Barcelona", arrayTeam);

		// Calling countPlayers methods
		System.out.println("There are " + countPlayers(fcBarcelona, 1987)
				+ " players of that age.");

		System.out.println("There are " + countPlayers(fcBarcelona, "Forward")
				+ " that play wanted position.\n");

		System.out.println("Youngest player is:\n "
				+ (getYoungestPlayer(fcBarcelona)));
	}

	/**
	 * <h1>This method will count how many players have same age (insert wanted
	 * age)</h1>
	 * <p>
	 * 
	 * @param t
	 *            - represents one Squad
	 * @param year
	 *            - represents wanted year of birth
	 * 
	 * @return How many players have same year of birth
	 */
	public static int countPlayers(Squad t, int year) {
		int counter = 0;
		for (int i = 0; i < t.arrayPlayer.length; i++) {
			if (t.arrayPlayer[i].yearOfBirth == year) {
				counter++;
			}
		}

		return counter;
	}

	/**
	 * <h1>This method will count how many players played same position</h1>
	 * <p>
	 * 
	 * @param t
	 *            - our team
	 * @param position
	 *            - wanted position
	 * @return - number of players that play wanted position
	 */
	public static int countPlayers(Squad t, String position) {
		int counter = 0;

		for (int i = 0; i < t.arrayPlayer.length; i++) {
			if (t.arrayPlayer[i].position.equals(position)) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * <h1>This method gives us informations about youngest player in squad.
	 * 
	 * @param t
	 *            - represents our team
	 * @return youngest player
	 */
	public static Player getYoungestPlayer(Squad t) {

		Player youngestPlayer = t.arrayPlayer[0];
		for (int i = 0; i < t.arrayPlayer.length; i++) {
			if (youngestPlayer.yearOfBirth < t.arrayPlayer[i].yearOfBirth) {
				youngestPlayer = t.arrayPlayer[i];

			}
		}
		return youngestPlayer;
	}

}
