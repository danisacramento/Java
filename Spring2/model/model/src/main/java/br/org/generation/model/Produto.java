package br.org.generation.model;

public class Produto {
	private String id;
	private String titulo;
	private String detalhes;
	private float preco;
	private int qtdeEstoque;
	private String linkFoto;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQtdeEstoque() {
		return qtdeEstoque;
	}

	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}

	public String getLinkFoto() {
		return linkFoto;
	}

	public void setLinkFoto(String linkFoto) {
		this.linkFoto = linkFoto;
	}

	@Override
	public String toString() {
		return "id:" + this.getId() + ", Titulo:" + this.getTitulo() + ",Detalhes:" + this.getDetalhes() + ",Preco"
				+ this.getPreco() + ",Qtd Estoque" + this.getQtdeEstoque() + ",link foto" + this.getLinkFoto();

	}
}
