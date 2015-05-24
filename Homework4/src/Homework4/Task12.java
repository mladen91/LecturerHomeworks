package Homework4;

public class Task12 {

	public static void main(String[] args) {
		
        //Variables for radius, Vgq for quality ball, Vgq1 for quality with deviation of 0.0005 and Vgq2 deviation -0.0005.//  	
		double r= 1.1291;
		double Vgq=6.014;
		double Vgq1=Vgq+0.0005;
		double Vgq2=Vgq-0.0005;
		
		double V =(1.33)*(r*r*r)*Math.PI;
		
		if (V==Vgq ||V>Vgq &&V<Vgq1 ) {
			System.out.println("The ball has got a good quality!");
		}
		else if (V==Vgq ||V<Vgq &&V>Vgq2 ) {
			System.out.println("The ball has got a good quality!");
		}
		else 
			System.out.println("The ball hasn't got a good quality!");
		
		
		System.out.printf("\nVolumen is equal to: %.3f",V);

	}

}
