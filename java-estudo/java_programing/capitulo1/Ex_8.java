package capitulo1;
/* 

	bolota: 
	Ex_8.java created at 12 de abr. de 2025

*/

public class Ex_8 {
	public static void main(String[] args) {
		double raio = 5.5;
		double pi_aprox = 4.0 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13 - 1.0/16 + 1.0/19);
		double perimetro = 2.0 * raio * pi_aprox;
		double area = raio * raio * pi_aprox;
		System.out.println("perimeter: "+perimetro+"\nArea: "+area);
	}
}
