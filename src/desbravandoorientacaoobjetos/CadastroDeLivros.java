package desbravandoorientacaoobjetos;

import java.util.Scanner;

public class CadastroDeLivros {

	private static Scanner inputStr;
	private static Scanner input;

	public static void main(String[] args) {
		Autor autor = new Autor();
		Livro livro	 = new Livro(autor);
		
		
		
		inputStr = new Scanner(System.in);
		input = new Scanner(System.in);
		
		System.out.print("Nome Livro:");
		livro.setNome(inputStr.nextLine());
		System.out.print("Descricao: ");
		livro.setDescricao(inputStr.nextLine());
		System.out.print("Valor Livro: ");
		livro.setValor(input.nextDouble());
		System.out.println("Cadastro ISBN:");
		livro.setIsbn(inputStr.nextLine());
		System.out.println("Desconto de livro em porcentagem");
		
		autor.setNome(inputStr.nextLine());
		autor.setEmail(inputStr.nextLine());
		autor.setCpf(inputStr.nextLine());
		livro.setAutor(autor);
		System.out.println(livro.toString());
		
	}

}
