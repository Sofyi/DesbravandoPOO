package br.com.sofialunkes.livraria.teste;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSeparatorUI;

import br.com.sofialunkes.livraria.produtos.*;

public class CarrinhoDeCompras {
	private double total;
	private Produto[] produtos = new Produto[10];
	private int contador=0;
	
	
	//ArrayList<Produto> lista = new ArrayList<Produto>();
		//public static int cont;
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total){
		this.total+=total;
	}
	public void adiciona(Produto produto){
		System.out.println("Adicionando\n"+produto);
		//lista.add(produto);
		this.produtos[contador]=produto;
		contador++;
		setTotal(produto.getValor());
	}
	/*public void getProdutos(){
		for(Produto produto : lista){
			System.out.println(produto.toString());
		}
	}
	*/
	
	public Produto[] getProdutos() {
		return produtos;
	}
	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}

}
