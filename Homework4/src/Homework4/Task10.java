package Homework4;

public class Task10 {

	public static void main(String[] args) {
	
		//ax^3+bx^2+cx+d=0//
		int a =1;
		int b =9;
		int c =18;
		int d =28;
		int result =-10;
		
		double pi=180;
		double p = (c/a)-(b*b)/(3*a*a);
		double q =(d/a)-(b*c)/(3*a*a)+(2*b*b*b)/(27*a*a*a); 		
		double D =(q*q)/4+(p*p*p)/27;
		//Solution for D>0 //
		double y1 =Math.cbrt(-q/2+Math.sqrt((q*q)/4+(p*p*p)/27))+Math.cbrt(-q/2-Math.sqrt((q*q)/4+(p*p*p)/27));		
		double x1 = y1-b/(3*a);
		//Solutions for D<0
		double tgro =-((2*Math.sqrt(-D))/q);
		double ro =Math.atan(tgro);
		double x21 =2*Math.sqrt(-p/3)*Math.cos(ro/3);
		double x22 =2*Math.sqrt(-p/3)*Math.cos((ro+2*pi)/3);
		double x23 =2*Math.sqrt(-p/3)*Math.cos((ro+4*pi)/3);
		
		//Solutions for D=0
		double eps = -(1/2)+(1.73/2);
		double eps2 = -(1/2)-(1.73/2);
		double alfa = Math.cbrt(-q/2+Math.sqrt((q*q)/4+(p*p*p)/27));
		double beta = Math.cbrt(-q/2-Math.sqrt((q*q)/4+(p*p*p)/27));
		double x31 = Math.cbrt(-q/2+Math.sqrt((q*q)/4+(p*p*p)/27))+Math.cbrt(-q/2-Math.sqrt((q*q)/4+(p*p*p)/27));
		double x32 = (eps*alfa)+(eps2*beta);
		double x33 =(eps2*beta)+(eps*alfa);
		//When D>0, there is only one solution that is not part of complex numbers.//
		if (D>0 && result!=x1) {
			System.out.println("Real equation solution is "+x1+", which is not equal to our potential solution.");
		}
		else if (D>0 && result==x1) {
			System.out.println("Real equation solution is "+x1+", which is equal to our solution.");
		}
		else if (D<0 && result!=x21 && result!=x22 && result!=x23) {
			System.out.printf("Real equation solutions are %.2f, %.2f and %.2f which is not equal to our solution.",x21,x22,x23);
		}
		else if (D<0 && result==x21 || result==x22 || result==x23) {
			System.out.printf("Real equation solutions are %.2f, %.2f and %.2f which is equal to our solution.",x21,x22,x23);
		}
		else if (D==0 && result!=x31 && result!=x32 && result!=x33) {
			System.out.printf("Real equation solutions are %.2f, %.2f and %.2f which is not equal to our solution.",x31,x32,x33);
		}
		else if (D==0 && result==x31 || result==x32 || result==x33) {
			System.out.printf("Real equation solutions are %.2f, %.2f and %.2f which is equal to our solution.",x31,x32,x33);
		}
		
		

	}

}
