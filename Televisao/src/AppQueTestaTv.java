import java.util.Scanner;
public class AppQueTestaTv {
	public static void main (String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		
		Televisao t1; // declarei que t1 vai "manipular" uma TV
		int opcao;
		t1 = new Televisao("Sony",110,32); // reservo um espaço na memoria pra isso
		
		// System.out.println("Valor padrao para ")
		
		/* aqui eu começo a inserir valores, correto?*/
		t1.setMarca("Sony");
		t1.setVoltagem(110);
		t1.setTamanho(32);
		t1.setLigada(false);
		t1.setCanal(5);
		t1.setVolume(2);
		
		/*t1.switchPower();
		t1.switchPower();
		t1.switchPower();
		t1.switchPower();
		t1.switchPower();
		t1.switchPower();   
		para ligar e desligar a televisao*/
		
		do {
			System.out.println("***********************");
			System.out.println("	Controle remoto da TV");
			System.out.println("------------------------");
			System.out.println("1 - Ligar/Desligar		");
			System.out.println("2 - Aumentar Volume		");
			System.out.println("3 - Diminuir Volume		");
			System.out.println("4 - Avancar Canal		");
			System.out.println("5 - Voltar Canal		");
			System.out.println("0 - Encerrar Sistema	");
			System.out.println("***********************");
			opcao = teclado.nextInt();
			// logica das opções
			switch(opcao) {
			case 1:
				t1.switchPower();
				break;
			case 2:
				t1.aumentarVolume();
				break;
			case 3:
				t1.diminuirVolume();
				break;
			}
			
			System.out.println("\n");
		} while(opcao != 0);
	}

}
			
		
			


