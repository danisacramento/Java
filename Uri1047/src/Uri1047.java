import java.util.Scanner;

public class Uri1047 {
	public static void main(String[] args) {
		// variaveis
		int hi, mi, hf, mf, duracaoHoras, duracaoMinutos;
		Scanner teclado = new Scanner(System.in);

		// entradas
		//ystem.out.println("Informe a hora inicial");
		hi = teclado.nextInt();
		//System.out.println("Informe o minuto inicial");
		mi = teclado.nextInt();
		//System.out.println("Informe a hora final");
		hf = teclado.nextInt();
		//System.out.println("Informe o minuto final");
		mf = teclado.nextInt();

		if (hi == hf && mi == mf) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		} else if (hi > hf) {
			duracaoHoras = (24 - hi) + hf;

			if (mi > mf) {
				duracaoMinutos = 60 - mi + mf;
				duracaoHoras--;
				System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");
			} else if (mi <= mf) {
				duracaoMinutos = mf - mi;
				System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");
			}
		} else if (hi <= hf) {
			duracaoHoras = hf - hi;

			if (mi > mf) {
				duracaoMinutos = 60 - mi + mf;
				duracaoHoras--;
			
				System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");
			} else if (mi <= mf) {
				duracaoMinutos = mf - mi;
				System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");

				teclado.close();

			}
		}
	}
}

