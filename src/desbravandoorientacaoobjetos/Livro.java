package desbravandoorientacaoobjetos;

public class Livro {
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	
	public Livro(){
		setNome(null);
		setDescricao(null);
		setValor(0);
		setIsbn(null);
	}
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}
