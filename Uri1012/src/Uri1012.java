import java.util.Scanner;

public class Uri1012 {
	public static void main(String args[]) {
		Scanner teclado;
		teclado = new Scanner (System.in);
		
		double a;
		double b;
		double c;
		
		System.out.println("Digite A");
		a =teclado.nextDouble();
		System.out.println("Digite B");
		b =teclado.nextDouble();
		System.out.println("Digite C");
		c =teclado.nextDouble();
		
		System.out.printf("TRIANGULO: %.3f\n", (a*c)/2);
		System.out.println("A �rea do c�rculo �:" + 3.141 *(c*c));
		System.out.println("A �rea do trap�zio �:" + (a+c)*b);	
		System.out.println("A �rea do quadrado �:" + b*b);
		System.out.println("A �rea do ret�nculo �:" + a*b);
		
		teclado.close();
		
	}
	
}
