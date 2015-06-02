
public class Zivotinja {
	
	private String name;
	private String sound;
	
	
	
	public Zivotinja(String name, String sound) {
		
		this.name = name;
		this.sound = sound;
	}
	
	public String napraviZvuk(String s) {
		
	    s=" Animal name: " +this.name+ "\n ";
		s=s+ "Animal sound: "+this.sound+"\n ";
		
		
		return s;
	}
	
	
}


