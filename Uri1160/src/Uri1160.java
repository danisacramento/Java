import java.util.Scanner;

/*Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir 
calcule a duração do jogo. Obs: O jogo tem duração mínima de um (1) minuto
e duração máxima de 24 horas.*/

public class Uri1160 {
	public static void main(String[]args){
		//variaveis
		int Hi, Mi, Hf, Mf, duracao;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe a hora inicial");
		Hi = teclado.nextInt();
		System.out.println("Informe o minuto inicial");
		Mi = teclado.nextInt();
		System.out.println("Informe a hora final");
		Hf = teclado.nextInt();
		System.out.println("Informe o minuto final");
		Mf = teclado.nextInt();
		
		duracao = Hf-Hi;
		
		//saida
		System.out.println ("O JOGO DUROU XXX HORA(S) E YYY MINUTO(S" + duracao);
		
		teclado.close();
	}
}
		