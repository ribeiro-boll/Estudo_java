package capitulo1;

/* 

	bolota: 
	Ex_13.java created at 12 de abr. de 2025

*/
public class Ex_13 {

	public static void main(String[] args) {
		double a = 3.4;
		double b = 50.2;
		
		double c = 2.1;
		double d = 0.55;
		
		double e = 44.5;
		double f = 5.9;
		
		double x = (e * d - b * f)/(a * d - b * c);
		double y = (a * f - e * c)/(a * d - b * c);
		
		System.out.printf("x: %f\ny: %f",x,y);
	}

}
