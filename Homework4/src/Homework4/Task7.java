package Homework4;

public class Task7 {

	public static void main(String[] args) {
		
	/* We need to separate every numerous from our number. We can do it with / and %. 
	   For example, our last numerous we can get using num%10 where module is equal to our num.*/ 
		int num = 1815;
		int sum = (num/1000)%10+(num/100)%10+(num/10)%10+num%10;
		
		System.out.println((num/1000)%10+"+"+(num/100)%10+"+"+(num/10)%10+"+"+num%10+"="+
				sum);
						
	}

}
