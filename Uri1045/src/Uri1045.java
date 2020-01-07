import java.util.Scanner;

public class Uri1045 {
	public static void main(String[] args) {
		// variaveis
		float A, B, C;
		float aux;
		Scanner teclado = new Scanner(System.in);
		// entradas
		System.out.println("Informe o primeiro valor:");
		A = teclado.nextFloat();
		System.out.println("Informe o segundo valor:");
		B = teclado.nextFloat();
		System.out.println("Informe o terceiro valor:");
		C = teclado.nextFloat();
		
		// verificar se A é o maior dos elementos
		if (B>A) {
			aux = A;
			A=B;
			B=aux;	
		}
		if(C>A) {
			aux=A;
			A=C;
			C=aux;
		}
		// saidas 
		if (A >= (B + C))
			System.out.println("NAO FORMA TRIANGULO");
		else 
			if (A*A == (B*B + C*C))
			System.out.println("TRIANGULO RETANGULO");
			else 
				if (A*A > (B*B + C*C))
				System.out.println("TRIANGULO OBTUSANGULO");
			else 
				if (A*A < (B*B + C*C))
				System.out.println("TRIANGULO ACUTANGULO");
			else 
				if (A == B && (B == C) && (A== C))
				System.out.println("TRIANGULO EQUILATERO");
				else 
					if (A == B ||( B == C) ||( A == C))
					System.out.println("TRIANGULO ISOSCELES");
			teclado.close();
	}

}
