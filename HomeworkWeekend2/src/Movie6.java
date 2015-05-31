
public class Movie6 {

	//Creating atributes 
	public String movieName;
	public int yearOfRelease;
	public String genre;
	public String filmMaker;
	public double rating;
	public boolean oscarReward;
	
	//Autogenerating constructor
	public Movie6(String movieName, int yearOfRelease, String genre,
			String filmMaker, double rating, boolean oscarReward) {
		super();
		this.movieName = movieName;
		this.yearOfRelease = yearOfRelease;
		this.genre = genre;
		this.filmMaker = filmMaker;
		this.rating = rating;
		this.oscarReward = oscarReward;
	}
	
	//Making toString method
	public String toString() {
		String allString= "";
		allString=allString+"Movie Name: "+movieName+"\n";
		allString=allString+"Year Of Release: "+yearOfRelease+"\n";
		allString=allString+"Movie Genre: "+genre+"\n";
		allString=allString+"Movie Director: "+filmMaker+"\n";
		allString=allString+"IMDB Rating: "+rating+"\n";
		allString=allString+"Oscar Reward: "+oscarReward+"\n";
		
		return allString;
	}
	
		
	
	
	
	
	
	
}
