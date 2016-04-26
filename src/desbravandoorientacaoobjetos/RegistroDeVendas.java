package desbravandoorientacaoobjetos;

public class RegistroDeVendas {

	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Sofia blablabla");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("TDD java");
		
		Ebook ebook =  new Ebook(autor);
		ebook.setNome("TDD java");
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);

	}

}
