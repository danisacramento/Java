import java.util.Scanner;

public class Uri1017 {
	public static void main(String args[]) {
		Scanner teclado;
		teclado = new Scanner (System.in);

		double tempo;
		double velocidade;
		
		System.out.println("Digite o tempo gasto na viagem");
		tempo = teclado.nextDouble();
		System.out.println("Digite a velocidade média");
		velocidade = teclado.nextDouble();
		
		double distancia = velocidade * tempo;
		double qtdlitros = distancia/12;
		
		System.out.printf("QTD DE LITROS: %.3f\n", qtdlitros);
		teclado.close();
		
	}
}

