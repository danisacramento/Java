import java.util.Scanner;

/*Faça um programa que leia 6 valores. Estes valores serão somente negativos 
ou positivos (desconsidere os valores nulos). A seguir, mostre
a quantidade de valores positivos digitados.*/

public class Uri1060 {
	public static void main(String [] args) {
		//variaveis
		Float valor1,valor2, valor3, valor4, valor5, valor6, x;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe o primeiro valor");
		valor1 = teclado.nextFloat();
		System.out.println("Informe o segundo valor");
		valor2 = teclado.nextFloat();
		System.out.println("Informe o terceiro valor");
		valor3 = teclado.nextFloat();
		System.out.println("Informe o quarto valor");
		valor4 = teclado.nextFloat();
		System.out.println("Informe o quinto valor");
		valor5 = teclado.nextFloat();
		System.out.println("Informe o sexto valor");
		valor6 = teclado.nextFloat();
		
		//processamento
		x= ( valor1 || valor2 || valor3 || valor4 || valor5 || valor6);
		
	}

}
