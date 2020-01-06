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
		System.out.println("A área do círculo é:" + 3.141 *(c*c));
		System.out.println("A área do trapézio é:" + (a+c)*b);	
		System.out.println("A área do quadrado é:" + b*b);
		System.out.println("A área do retânculo é:" + a*b);
		
		teclado.close();
		
	}
	
}
