package br.com.sofialunkes.livraria.teste;

import br.com.sofialunkes.livraria.Autor;
import br.com.sofialunkes.livraria.produtos.*;

public class RegistroDeVendas {

	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Sofia blablabla");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("TDD java");
		fisico.setValor(59.90);
		if(fisico.aplicaDescontoDe10Porcento()){
			System.out.println("Valor agora é "+fisico.getValor());
		}
		
		Ebook ebook =  new Ebook(autor);
		ebook.setNome("TDD java");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		
		System.out.println("Total "+ carrinho.getTotal());
		
		
		Produto[] produtos = carrinho.getProdutos();
		for(Produto produto : produtos){
			System.out.println(produto.getValor());
		}

	}
}