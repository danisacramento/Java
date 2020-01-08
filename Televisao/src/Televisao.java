
public class Televisao {
	// informacoes sobre uma TV
	private String marca;
	private int voltagem;
	private int tamanho;
	private boolean ligada;
	private int volume;
	private int canal;
	
	public Televisao(String marca, int voltagem, int tamanho) {
		this.marca = marca;
		this.voltagem = voltagem;
		this.tamanho = tamanho;
		this.ligada = false;
		this.volume =5;
		this.canal=1;
		
	}
	
	public Televisao(String marca, int voltagem, int tamanho, boolean ligada, int volume, int canal) {
		this.marca = marca;
		this.voltagem = voltagem;
		this.tamanho = tamanho;
		this.ligada = ligada;
		this.volume = volume;
		this.canal = canal;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	
	public int getVoltagem() {
		return this.voltagem;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public int getTamanho() {
		return this.tamanho;
	}
	public void setLigada (boolean ligada) {
		this.ligada = ligada;
	}
	public boolean getLigada() {
		return this.ligada;
	}
	public int getVolume() {
		return this.volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getCanal() {
		return this.canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
		
	void switchPower() {
		ligada = !ligada;
		System.out.println("A TV" + marca + " esta " + ((ligada) ? "ligada" : "desligada"));
		// operador ternario de atribuicao condicional
		/*
		 * 
		 * (<TesteLogico)? <ValorSeTesteForVerdadeiro>: <ValorSeTesteForFalso>
		 * 
		 * 
		 * 
		 */
	}

	void aumentarVolume() {
		if (ligada) {
			volume++;
			if (volume > 10) {
				volume = 10;
			}
			System.out.println("A TV " + marca + " esta no volume " + volume);
		} else {
			System.out.println("Por favor, ligue a TV");
		}
	}

	void diminuirVolume() {
		if (ligada==true) {
			volume--;
			if (volume < 0) {
				volume = 0;
			}
			System.out.println("A TV " + marca + " esta no volume " + volume);
		}
		else {
			System.out.println("Por favor, ligue a TV");
		}
	}

}
