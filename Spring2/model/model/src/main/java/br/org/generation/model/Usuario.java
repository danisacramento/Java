package br.org.generation.model;

public class Usuario {
	private int id;
	private String login;
	private String email;
	private String nomeCompleto;
	private String senha;
	private String perfilAcesso;

	public Usuario(int id, String login, String email, String nomeCompleto, String senha, String perfilAcesso) {
		this.id = id;
		this.login = login;
		this.email = email;
		this.nomeCompleto = nomeCompleto;
		this.senha = senha;
		this.perfilAcesso = perfilAcesso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getPerfilAcesso() {
		return perfilAcesso;
	}

	public void setPerfilAcesso(String perfilAcesso) {
		this.perfilAcesso = perfilAcesso;
	}

	@Override
	public String toString() {
		return "Id:" + this.getId() + ", Login:" + this.getLogin() + ",Email:" + this.getEmail() + ",Nome completo"
				+ this.getSenha() + ",Perfil de acesso" + this.getPerfilAcesso();

	}

}
