
public class Produto {
	private int id;
	private String nome;
	private String detalhes;
	private float preco;
	private float qtdEstoque;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id <= 0) {
			throw new RuntimeException ("ID nao pode ser menor ou igual a zero");
		}
		this.id=id;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome==null ||nome.length() == 0) {
			throw new RuntimeException ("NOME nao pode ser vazio");
		}
		this.nome = nome;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		if (detalhes==null ||detalhes.length() == 0) {
			throw new RuntimeException ("DETALHES nao pode ser vazio");
		}
		this.detalhes = detalhes;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) 
		{if (preco <= 0) {
		throw new RuntimeException ("PRECO nao pode ser menor ou igual a zero");
	}
		this.preco = preco;
		}

	public float getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(float qtdEstoque) {
		if (qtdEstoque <0) {
			throw new RuntimeException ("QTDESTOQUE nao pode ser menor menor que zero");
		}
		this.qtdEstoque = qtdEstoque;
	}

}
