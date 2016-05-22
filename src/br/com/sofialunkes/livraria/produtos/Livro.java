package br.com.sofialunkes.livraria.produtos;

import br.com.sofialunkes.livraria.Autor;
import br.com.sofialunkes.livraria.exception.AutorNuloException;

public abstract class Livro implements Produto {
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	
	public Livro(Autor autor){
		if (autor == null){
			throw new AutorNuloException(
					"O Autor do Livro não pode ser nulo");
		}
		setAutor(autor);
		setNome(null);
		setDescricao(" ");
		setValor(0);
		setIsbn("000-00-00000-00-0");
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
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public boolean hasAutor(){
		return this.autor!=null;
	}
	@Override
	public String toString(){
		return "Nome: "+getNome()+
			"\nValor: "+getValor()+
			"\nISBN: "+getIsbn()+
			"Descricao:"+getDescricao()+this.hasAutor() != null? autor.toString():"";
	}
}
