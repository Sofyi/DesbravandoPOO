package desbravandoorientacaoobjetos;

import java.util.Scanner;

public class CadastroDeLivros {

	private static Scanner inputStr;
	private static Scanner input;

	public static void main(String[] args) {
		Livro livro	 = new Livro();
		Autor autor = new Autor();
		
		livro.setAutor(autor);
		
		inputStr = new Scanner(System.in);
		input = new Scanner(System.in);
		
		System.out.println("Nome Autor:");
		livro.getAutor().setNome(inputStr.nextLine());
		System.out.print("Nome Livro:");
		livro.setNome(inputStr.nextLine());
		System.out.print("Descricao: ");
		livro.setDescricao(inputStr.nextLine());
		System.out.print("Valor Livro: ");
		livro.setValor(input.nextDouble());
		System.out.println("Cadastro ISBN:");
		livro.setIsbn(inputStr.nextLine());
		
		System.out.println(livro.toString());
	}

}
