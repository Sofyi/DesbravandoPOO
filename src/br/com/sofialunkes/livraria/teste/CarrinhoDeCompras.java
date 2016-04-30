package br.com.sofialunkes.livraria.teste;

import java.util.ArrayList;

import br.com.sofialunkes.livraria.produtos.*;

public class CarrinhoDeCompras {
	private double total;
	ArrayList<Livro> lista = new ArrayList<Livro>();
	public static int cont;
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total){
		this.total+=total;
	}
	public void adiciona(Produto produto){
		System.out.println("Adicionando\n"+produto);
		setTotal(produto.getValor());
	}
}
