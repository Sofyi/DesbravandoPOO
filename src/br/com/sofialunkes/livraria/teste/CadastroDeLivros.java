package br.com.sofialunkes.livraria.teste;

import java.util.Scanner;

import br.com.sofialunkes.livraria.Autor;
import br.com.sofialunkes.livraria.produtos.Livro;
import br.com.sofialunkes.livraria.produtos.LivroFisico;

public class CadastroDeLivros {

	private static Scanner inputStr;
	private static Scanner input;

	public static void main(String[] args) {
		Autor autor = new Autor();

		inputStr = new Scanner(System.in);
		input = new Scanner(System.in);

		autor.setNome(inputStr.nextLine());
		autor.setEmail(inputStr.nextLine());
		autor.setCpf(inputStr.nextLine());

		Livro livro	 = new LivroFisico(autor);	

		System.out.print("Nome Livro:");
		livro.setNome(inputStr.nextLine());
		System.out.print("Descricao: ");
		livro.setDescricao(inputStr.nextLine());
		System.out.print("Valor Livro: ");
		livro.setValor(input.nextDouble());
		System.out.println("Cadastro ISBN:");
		livro.setIsbn(inputStr.nextLine());
		System.out.println("Desconto de livro em porcentagem");

		livro.setAutor(autor);

		System.out.println(livro.toString());
	}
}