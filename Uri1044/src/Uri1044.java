/*Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma 
mensagem  * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os 
valores lidos s�o * m�ltiplos entre si.*/

import java.util.Scanner;

public class Uri1044 {
	public static void main(String[] args){
		//variaveis
		int A, B;
		Scanner teclado = new Scanner(System.in);
		//entradas
		System.out.println("Informe o primeiro n�mero inteiro:");
		A = teclado.nextInt();
		System.out.println("Informe o segundo n�mero inteiro:");
		B = teclado.nextInt();
		//saida
		if (A>B && A%B == 0 || A<B && B%A == 0)
			System.out.println("Sao multiplos");
		else
			System.out.println("Nao sao multiplos");
		
		teclado.close();
	}
}
