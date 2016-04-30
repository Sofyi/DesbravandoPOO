package br.com.sofialunkes.livraria;

public class Autor {
	private String nome;
	private String cpf;
	private String email;
	public Autor(){
		setNome(null);
		setCpf(null);
		setEmail(null);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
